package de.fhac.vs.pietsch.ChatSystem;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/chatService")
public class ChatService {

    HashMap<Integer, ArrayList<MessageEntity>> chatRooms = new HashMap<>();

    @PostMapping(value = "/messages/{chatroom}/{user}")
    public void postMessage(@PathVariable String user, @RequestBody String message, @PathVariable int chatroom) {

        MessageEntity messageEntity = new MessageEntity();
        messageEntity.setMessage(message);
        messageEntity.setUserName(user);
        messageEntity.setDate(new Date());

        if (chatRooms.containsKey(chatroom)){
            ArrayList<MessageEntity> messageEntities = chatRooms.get(chatroom);
            messageEntities.add(messageEntity);
        } else {
            ArrayList<MessageEntity> entities = new ArrayList<>();
            entities.add(messageEntity);
            chatRooms.put(chatroom, entities);
        }
    }

    @GetMapping(value = "/messages/{chatroom}")
    List<MessageEntity> getMessages(@PathVariable int chatroom, @RequestParam Optional<String> sort){
        if (chatRooms.containsKey(chatroom)) {
            ArrayList<MessageEntity> messageEntities = chatRooms.get(chatroom);
            if (sort.isPresent()){
                Collections.sort(messageEntities);
            }
            return messageEntities;
        } else {
            return new ArrayList<>();
        }
    }


}
