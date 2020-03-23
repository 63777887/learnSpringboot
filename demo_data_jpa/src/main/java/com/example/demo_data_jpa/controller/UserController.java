package com.example.demo_data_jpa.controller;

import com.example.demo_data_jpa.entity.User;
import com.example.demo_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userRepository.findById(id).get();
        return user;
    }
    @GetMapping("/user")
    public User insertUser(User user){
        return userRepository.save(user);
    }
}
