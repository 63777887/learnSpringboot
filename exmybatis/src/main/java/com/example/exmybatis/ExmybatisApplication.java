package com.example.exmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan(value = "com.example.exmybatis.mapper")   //标注整个mapper包全是Mapper
@SpringBootApplication
public class ExmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExmybatisApplication.class, args);
    }

}
