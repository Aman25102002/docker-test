package com.demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {

    @GetMapping("/message")
    public String getMessage() {
        return "hello world I am a java developer";
    }
}
