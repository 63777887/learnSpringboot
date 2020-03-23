package com.example.demo_elastic.controller;

import com.example.demo_elastic.service.ScheduledSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduledController {

    @Autowired
    ScheduledSevice scheduledSevice;

    @GetMapping("/hello")
    public String hello(){
        String now = scheduledSevice.hello();
        return now;
    }
}
