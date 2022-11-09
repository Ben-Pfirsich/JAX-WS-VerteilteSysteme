package de.fhac.vs.pietsch.client;

import de.fhac.vs.pietsch.ChatSystem.MessageEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RestClient {

    private static final Logger log = LoggerFactory.getLogger(RestClient.class);

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(RestClient.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate){
        return args -> {

            restTemplate.postForObject("http://localhost:8080/chatService/messages/1/Will", "Hallo Zusammen", Void.class);
            restTemplate.postForObject("http://localhost:8080/chatService/messages/1/Carl", "Hello", Void.class);
            restTemplate.postForObject("http://localhost:8080/chatService/messages/1/Will", "Hi", Void.class);
            restTemplate.postForObject("http://localhost:8080/chatService/messages/2/Gerd", "Super", Void.class);
//            restTemplate.postForObject("http://localhost:8080/chatService/messages/1/Will", "Java ist toll", Void.class);

//            MessageEntity[] messages = restTemplate.getForObject("http://localhost:8080/chatService/messages/1", MessageEntity[].class);
//            for(MessageEntity me : messages){
//                System.out.println(me);
//            }


            MessageEntity[] messages2 = restTemplate.getForObject("http://localhost:8080/chatService/messages/1?sort=true", MessageEntity[].class);
            for(MessageEntity me : messages2){
                System.out.println(me);
            }

//            HttpHeaders headers = new HttpHeaders();
//            List<MediaType> mediaTypes = new ArrayList<>();
//            mediaTypes.add(MediaType.valueOf(MediaType.TEXT_PLAIN_VALUE));
//            headers.setAccept(mediaTypes);
//
//            HttpEntity<String> entity = new HttpEntity<>(headers);
//            ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/messageAPI/", HttpMethod.GET, entity, String.class);
//            System.out.println(response.toString());




        };
    }


}

