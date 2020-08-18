package com.spring.config.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${myCustomMessage}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
