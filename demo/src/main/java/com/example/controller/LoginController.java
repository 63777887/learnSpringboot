package com.example.controller;

import com.github.pagehelper.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,
                        Map<String,Object> map, HttpSession session){
        Date data=new Date();
        String nowTime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(data);
        if (!StringUtil.isEmpty(username)&&password.equals("123123")){
//            map.put("meg",nowTime+"登陆成功");
            session.setAttribute("USER",username);
            return "redirect:/main";
        }else {
            map.put("msg",nowTime+"\n"+"账号或密码错误");
            return "login";
        }

    }
}
