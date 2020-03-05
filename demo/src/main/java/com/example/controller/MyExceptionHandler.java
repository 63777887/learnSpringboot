package com.example.controller;

import com.example.exception.UserNotExist;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class MyExceptionHandler {
    //客户端返回了json数据
//    @ResponseBody
//    @ExceptionHandler(UserNotExist.class)
//    public Map<String,Object> handleException(Exception e){
//        Map<String,Object> map=new HashMap<>();
//        map.put("code","user not exist");
//        map.put("message",e.getMessage());
//        return map;￿
//    }

    @ExceptionHandler(UserNotExist.class)
    public String handleException(Exception e, HttpServletRequest request) {
        //设置自己的状态码
        // Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
        request.setAttribute("javax.servlet.error.status_code",500);
        Map<String, Object> map = new HashMap<>();
        map.put("code", "user not exist");
        map.put("message", e.getMessage());
        request.setAttribute("ext",map);
        return "forward:/error";
    }
}
