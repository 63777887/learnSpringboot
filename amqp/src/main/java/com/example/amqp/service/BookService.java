package com.example.amqp.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @RabbitListener(queues = "atguigu")
    public void receive(String s){
        System.out.println("监听到了来自atguigu的消息。。。"+s);
    }
}
