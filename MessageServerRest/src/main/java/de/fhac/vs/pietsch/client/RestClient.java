package de.fhac.vs.pietsch.client;


import de.fhac.vs.pietsch.MessageServerRest.ServerInfo;
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
import java.util.Arrays;
import java.util.Collections;
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
            String message = restTemplate.getForObject("http://localhost:8080/messageAPI/", String.class);
            log.info(message);

            String helloWorld = restTemplate.getForObject("http://localhost:8080/messageAPI/hello", String.class);
            log.info(helloWorld);

            ServerInfo serverInfo = restTemplate.getForObject("http://localhost:8080/messageAPI/server-info", ServerInfo.class);
            log.info(serverInfo.server);

            HttpHeaders headers = new HttpHeaders();
            List<MediaType> mediaTypes = new ArrayList<>();
            mediaTypes.add(MediaType.valueOf(MediaType.TEXT_PLAIN_VALUE));
            headers.setAccept(mediaTypes);

            HttpEntity<String> entity = new HttpEntity<>(headers);
            ResponseEntity<String> response = restTemplate.exchange("http://localhost:8080/messageAPI/", HttpMethod.GET, entity, String.class);
            System.out.println(response.toString());


            List<MediaType> mediaTypesInfo = new ArrayList<>();
            mediaTypesInfo.add(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE));
            HttpHeaders headersInfo = new HttpHeaders();
            headersInfo.setAccept(mediaTypesInfo);
            HttpEntity<ServerInfo> serverInfoEntity = new HttpEntity<>(headersInfo);
            ResponseEntity<ServerInfo> responseInfo = restTemplate.exchange("http://localhost:8080/messageAPI/server-info", HttpMethod.GET, serverInfoEntity, ServerInfo.class);
            System.out.println(responseInfo.getBody().server);;


            String userSearch = restTemplate.getForObject("http://localhost:8080/messageAPI/users/Hans/search/fisch", String.class);
            log.info(userSearch);

            String userPost = restTemplate.postForObject("http://localhost:8080/messageAPI/users/Hans", "Dies ist eine Nachricht" , String.class);
            System.out.println(userPost);
        };
    }


}

