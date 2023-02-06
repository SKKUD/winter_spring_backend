package com.winter_spring_backend.winter_spring_backend.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sample {

    @RequestMapping("/")
    public String hello() {
        return "SpringBoot Hello World!";
    }
}