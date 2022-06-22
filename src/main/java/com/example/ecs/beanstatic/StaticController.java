package com.example.ecs.beanstatic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticController {

    @GetMapping("/")
    public String sample() {
        return StaticService.doSomething();
    }
}
