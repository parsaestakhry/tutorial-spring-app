package com.example.parsa.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHello() {
        return "Greetins from Outer Heaven!";
    }
    
}
