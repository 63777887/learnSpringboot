package com.example.startex.controller;

import com.jwk.start.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCon {
    @Autowired
    HelloService helloService;

    @GetMapping("/he")
    public String hello(){
        return helloService.sayHello("haha");
    }
}
