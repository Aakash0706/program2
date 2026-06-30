package com.example.java_cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaCicdApplication {
@GetMapping("/")
public String hello(){
	return "CI/CD running";
}
	public static void main(String[] args) {
		SpringApplication.run(JavaCicdApplication.class, args);
	}

}
