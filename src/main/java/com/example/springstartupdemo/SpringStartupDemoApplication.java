package com.example.springstartupdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class SpringStartupDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringStartupDemoApplication.class, args);
		System.out.println("Application Started");
	}

}
