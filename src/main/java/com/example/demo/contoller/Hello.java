package com.example.demo.contoller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Hello {
     @GetMapping("/")
     public String getMethodName() {
         return new String("Hello World");
     }
     
}
