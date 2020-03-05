package com.example.config;

import com.example.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类是一个配置类
 *
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中：容器中这个组件的默认ID就是方法名
    @Bean
    public HelloService helloService02(){
        System.out.println("我是config，我先出现，给容器中添加组件");
        return new HelloService();
    }
}
