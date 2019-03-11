package com.example.test1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Test")
public class TestController {
    @RequestMapping(value = "/showHello")
    public String showHello() {
        return "helloWorld";
    }
}
