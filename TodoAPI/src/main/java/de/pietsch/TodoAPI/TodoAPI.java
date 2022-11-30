package de.pietsch.TodoAPI;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(value = "/todoAPI")
public class TodoAPI {

    private final ArrayList<TodoEntity> todoList = new ArrayList<>();
    private int idCounter = 0;

    @Operation(summary = "Get all Todos as a List.")
    @ApiResponse(
            responseCode = "200", description = "Returning all Todos, list empty if no todos exist"
//            ,
//            content = {@Content(
//                    mediaType = "application/json",
//                    schema = @Schema(implementation = TodoEntity[].class))}
    )
    @GetMapping(value = "/todos")
    public List<TodoEntity> getTodos() {
        return todoList;
    }

    @Operation(summary = "Post a Todo bei name.")
    @ApiResponse(
            responseCode = "200", description = "Successful post of Todo"
    )
    @PostMapping(value = "/todos")
    public void postTodo(@io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Name of the new Todo")@RequestBody String name) {
        TodoEntity todoEntity = new TodoEntity(idCounter++, name, false);
        Link selfLink = linkTo(methodOn(TodoAPI.class).getTodo(idCounter - 1)).withSelfRel();
        todoEntity.add(selfLink);
        todoList.add(todoEntity);
    }

    @Operation(summary = "Get a specific Todo by ID.")
    @ApiResponse(
            responseCode = "200", description = "Found Todo with specified ID",
            content = {@Content(
                    mediaType = "application/json",
                    schema = @Schema(implementation = TodoEntity.class))}
    )
    @GetMapping(value = "/todos/{id}")
    public TodoEntity getTodo(@Parameter(description = "ID of the Todo")@PathVariable int id) {
        TodoEntity retVal = null;
        for (TodoEntity todo : todoList) {
            if (todo.getId() == id) {
                retVal = todo;
            }
        }
        return retVal;
    }


    @Operation(summary = "Delete a specific Todo by ID.")
    @ApiResponse(
            responseCode = "200", description = "Deleted Todo with specified ID"
    )
    @DeleteMapping(value = "/todos/{id}")
    public void deleteTodo(@Parameter(description = "ID of the Todo")@PathVariable int id) {
        for (int i = 0; i < todoList.size(); i++) {
            TodoEntity temp = todoList.get(i);
            if (temp.getId() == id) {
                todoList.remove(i);
                break;
            }
        }
    }


    @DeleteMapping(value = "/todos")
    public List<TodoEntity> deleteDoneTodos(@RequestParam Optional<String> done) {
        ArrayList<TodoEntity> notDone = null;
        if (done.isPresent() && done.get().equals("true")) {
            for (int i = 0; i < todoList.size(); i++) {
                TodoEntity temp = todoList.get(i);
                if (temp.isDone()) {
                    todoList.remove(temp);
                }
            }
            notDone = todoList;
        } else {
            todoList.clear();
        }
        return notDone;
    }

    @PatchMapping(value = "/todos/{id}")
    public TodoEntity patchDoneValue(@PathVariable int id, @RequestBody JsonPatch value) {
        TodoEntity retVal = null;

        for (TodoEntity todo : todoList) {
            if (todo.getId() == id) {
                try {
                    ObjectMapper objectMapper = new ObjectMapper();
                    JsonNode patched = value.apply(objectMapper.convertValue(todo, JsonNode.class));
                    TodoEntity patchedEntity = objectMapper.treeToValue(patched, TodoEntity.class);
                    todoList.remove(todo);
                    todoList.add(patchedEntity);
                    retVal = patchedEntity;
                    break;
                } catch (JsonPatchException | JsonProcessingException e) {
                    System.out.println("Fehler beim Patch");
                }
            }
        }
        return retVal;
    }

}
