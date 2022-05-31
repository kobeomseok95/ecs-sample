package com.example.ecs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello! This is ECS Sample Project.";
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hi! This is ECS Sample Project.";
    }
}
