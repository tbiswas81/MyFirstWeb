package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyFirstWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstWebApplication.class, args);
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
