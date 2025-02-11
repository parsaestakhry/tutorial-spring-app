package com.example.parsa.tutorial_spring_app;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

// @SpringBootApplication is a convenience annotation that adds all of the following:
// - @Configuration: Tags the class as a source of bean definitions for the application context.
// - @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
// - @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.

@SpringBootApplication
public class Application {

	// main method is used to launch the appliation using Spring Boot's
	// SpringApplication.run() method.]
	// application is a complete java application

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// it will run on start up
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return _ -> {

			System.out.println("application is running on localhost:8080");

		};
	}

}