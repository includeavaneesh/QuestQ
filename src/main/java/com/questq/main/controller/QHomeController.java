package com.questq.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QHomeController {

    @GetMapping("/")
    public String getHome() {
        return "Hello";
    }
}
