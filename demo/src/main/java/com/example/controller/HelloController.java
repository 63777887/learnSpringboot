package com.example.controller;

import com.example.exception.UserNotExist;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

//    获取配置中的值
    @Value("${person.name}")
    private String name;

//    @RequestMapping({"/login","/"})
//    public String index(){
//        return "login";
//    }

    @ResponseBody
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        if (name.equals("aaa")){
            throw  new UserNotExist();
        }else {
        return "Hello"+name;}
    }


    @RequestMapping("/success")
    public String showSuccess(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("usernames", Arrays.asList("shangsan","lisi","wangwu"));
        return "success";
    }


}
