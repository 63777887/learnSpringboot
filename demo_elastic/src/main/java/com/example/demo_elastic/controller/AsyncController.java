package com.example.demo_elastic.controller;

import com.example.demo_elastic.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncService asyncService;

    @GetMapping("/success")
    public String hello(){
        asyncService.hello();
        return "success";
    }
}
