package com.example.demo_elastic.service;

import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    public void hello(){
        System.out.println("数据处理中。。。");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理完成。。。");
    }
}
