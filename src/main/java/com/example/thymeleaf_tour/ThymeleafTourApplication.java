package com.example.thymeleaf_tour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"mycontroller"})
public class ThymeleafTourApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafTourApplication.class, args);
	}

}
