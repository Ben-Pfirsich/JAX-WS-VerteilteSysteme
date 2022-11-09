package de.fhac.vs.pietsch.MessageServerRest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.TEXT_PLAIN;

@RestController
@RequestMapping(value = "/messageAPI")
public class MessageResource {

    final
    ServerInfo serverInfo;

    public MessageResource(ServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }


    @GetMapping(value = "/", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String message() {
        return "Eine Nachricht!";
    }

    @GetMapping(value = "/hello", produces = {MediaType.TEXT_PLAIN_VALUE})
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(value = "/server-info", produces = {MediaType.TEXT_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public ServerInfo serverInfo() {
        return serverInfo;
    }

    @GetMapping(value = "users/{user}/search/{search}")
    public String message(@PathVariable String user, @PathVariable String search){
        return "User: " + user + ", Search: " + search;
    }

    @PostMapping(value = "/users/{user}", consumes = {MediaType.TEXT_PLAIN_VALUE})
    String postMessage(@PathVariable String user, @RequestBody String message){
        return "User: " + user + ", Message: " + message;
    }

}
