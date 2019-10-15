package com.kansal.neha.demoneha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hello")
    public String printHello() {
        return "Hello World";
    }
}
