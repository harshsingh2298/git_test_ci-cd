package com.cms.cicdtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1") // Corrected URL mapping
public class Controller {

    @GetMapping("/hello") // Mapping for the hello() method
    public String hello(){
        return "Hello World";
    }
}
