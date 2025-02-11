package com.example.parsa.tutorial_spring_app.Hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Outer Heaven!";
    }
    
}
