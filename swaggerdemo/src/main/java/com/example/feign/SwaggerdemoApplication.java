package com.example.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

@EnableSwagger2
public class SwaggerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerdemoApplication.class, args);
	}
	
	
	

}
