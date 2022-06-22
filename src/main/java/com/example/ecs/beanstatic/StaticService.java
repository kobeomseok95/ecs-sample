package com.example.ecs.beanstatic;

public class StaticService {

    public static String doSomething() {
        String s = StaticRepository.find();
        String s1 = StaticRepository2.find();
        return s + s1;
    }
}
