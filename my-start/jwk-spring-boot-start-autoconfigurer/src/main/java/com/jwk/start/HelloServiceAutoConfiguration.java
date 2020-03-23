package com.jwk.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnWebApplication    //Web应用才生效
@EnableConfigurationProperties(Helloproperties.class)   //获取Helloproperties属性
public class HelloServiceAutoConfiguration {

    @Autowired
    Helloproperties helloproperties;

    @Bean
    public HelloService helloService(){
        HelloService service = new HelloService();
        service.setHelloproperties(helloproperties);
        return service;
    }
}
