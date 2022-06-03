package com.example.ecs;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequiredArgsConstructor
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello! This is ECS Sample Project.";
    }

    @GetMapping("/hi")
    public String hi() throws UnknownHostException {
        return "Hi! This is ECS Sample Project at " + InetAddress.getLocalHost().getHostAddress();
    }

    @GetMapping("/greet")
    public String greet() {
        return "This is ECS Sample Project.";
    }
}
