package com.example.myhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/user")
    public User helloWorldBean() {
        return new User("Hi Boss");
    }

    @GetMapping(path = "/user/{message}")
    public User helloWorldBean(@PathVariable("message") String message) {
        return new User("Hi "+message);
    }
}
