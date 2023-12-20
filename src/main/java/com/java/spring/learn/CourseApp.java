package com.java.spring.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.java.spring.learn.repository")
public class CourseApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApp.class, args);
	}
}
