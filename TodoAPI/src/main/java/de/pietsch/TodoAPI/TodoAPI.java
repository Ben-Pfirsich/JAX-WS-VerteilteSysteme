package de.pietsch.TodoAPI;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
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

    @GetMapping(value = "/todos")
    public List<TodoEntity> getTodos() {
        return todoList;
    }

    @PostMapping(value = "/todos")
    public void postTodo(@RequestBody String name, @RequestParam Optional<String> done) {
        TodoEntity todoEntity = new TodoEntity(idCounter++, name, false);
        Link selfLink = linkTo(methodOn(TodoAPI.class).getTodo(idCounter - 1)).withSelfRel();
        todoEntity.add(selfLink);
        todoList.add(todoEntity);
    }

    @GetMapping(value = "/todos/{id}")
    public TodoEntity getTodo(@PathVariable int id) {
        TodoEntity retVal = null;
        for (TodoEntity todo : todoList) {
            if (todo.getId() == id) {
                retVal = todo;
            }
        }
        return retVal;
    }

    @DeleteMapping(value = "/todos/{id}")
    public void deleteTodo(@PathVariable int id) {
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
