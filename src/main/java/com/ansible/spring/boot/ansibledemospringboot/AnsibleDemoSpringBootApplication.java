package com.ansible.spring.boot.ansibledemospringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@PropertySource(value = {
        "classpath:default.properties",
        "${external.properties}"},
        ignoreResourceNotFound = true)
@RestController
public class AnsibleDemoSpringBootApplication {

    @Value("${movie.name}")
    private String movieName;

    @RequestMapping("/")
    public String index() {
        return movieName;
    }

    public static void main(String[] args) {
        SpringApplication.run(AnsibleDemoSpringBootApplication.class, args);
    }
}
