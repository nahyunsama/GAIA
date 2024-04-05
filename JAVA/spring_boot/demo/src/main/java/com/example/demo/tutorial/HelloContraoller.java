package com.example.demo.tutorial;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloContraoller {
    @GetMapping("/hello")
    public String hello() {
        return String.format("Welcome to /hello page!");
    }
}
