package com.ansible.spring.boot.ansibledemospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AnsibleDemoSpringBootApplication {

	@RequestMapping("/")
	public String index() {
		return "Star Wars!";
	}

	public static void main(String[] args) {
		SpringApplication.run(AnsibleDemoSpringBootApplication.class, args);
	}
}
