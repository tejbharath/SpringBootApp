package com.example;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

	// Entry point of the spring boot application
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
}

@Component
class StudentLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
	}
}
