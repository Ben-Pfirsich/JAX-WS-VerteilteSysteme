package de.fhac.KeycloakRESTService;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("messageAPI")
public class MessageResource {

    @GetMapping(value = "/public", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message getPublic() {
        return new Message("public");
    }

    @GetMapping(value = "/secured", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message getSecured() {
        return new Message("secured");
    }
}