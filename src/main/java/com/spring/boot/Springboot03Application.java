package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Springboot03Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot03Application.class, args);
	}

	@RequestMapping("/test")
	public String get(){
		return "hello world!!!";
	}
}
