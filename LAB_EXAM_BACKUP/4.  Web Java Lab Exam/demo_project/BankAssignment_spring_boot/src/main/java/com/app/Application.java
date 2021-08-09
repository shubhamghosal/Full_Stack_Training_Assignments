package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //starting point of Spring boot app
//@ComponentScan(basePackages = "com.app")
//@EntityScan(basePackages = "com.app")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
