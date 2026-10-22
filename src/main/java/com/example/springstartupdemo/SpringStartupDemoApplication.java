package com.example.springstartupdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStartupDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringStartupDemoApplication.class, args);
		System.out.println("Application started");
	}
}
