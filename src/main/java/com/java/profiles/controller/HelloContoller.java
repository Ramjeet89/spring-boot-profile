package com.java.profiles.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloContoller {

    @Value("${spring.message}")
    String message;

    @GetMapping
    public String hello() {
        return message;
    }
}
