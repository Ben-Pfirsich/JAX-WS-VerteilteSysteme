package de.pietsch.todoclient;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TodoClientApplication {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(TodoClientApplication.class);
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

			restTemplate.postForObject("http://localhost:8080/todoAPI/todos", "Neues Todo", Void.class);
			restTemplate.patchForObject("http://localhost:8080/todoAPI/todos", )
			TodoEntity[] messages2 = restTemplate.getForObject("http://localhost:8080/todoAPI/todos", TodoEntity[].class);
			for(TodoEntity te : messages2){
				System.out.println(te);
			}



		};
	}

//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		ObjectMapper mapper = new ObjectMapper();
//		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
//				false);
//		mapper.registerModule(new Jackson2HalModule());
//
//		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
//		converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.valueOf("application/json-patch+json")));
//		converter.setObjectMapper(mapper);
//
//		return builder.messageConverters(converter).build();
}
