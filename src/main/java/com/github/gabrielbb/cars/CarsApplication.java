package com.github.gabrielbb.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsApplication.class, args);
	}

	/*
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		Hibernate5Module h = new Hibernate5Module();
		//h.enable(Hibernate5Module.Feature.FORCE_LAZY_LOADING);
		objectMapper.registerModule(h);
		jsonConverter.setObjectMapper(objectMapper);
		return jsonConverter;
	} */
}
