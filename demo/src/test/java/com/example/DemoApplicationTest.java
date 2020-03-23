package com.example;

import com.example.bean.Person;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTest {

    @Autowired
    Person person1;

    @Autowired
    ApplicationContext ioc;

    Logger logger=LoggerFactory.getLogger(getClass());

    //测试配置文件
    @Test
    public void testHelloService(){
        boolean b=ioc.containsBean("helloService");     //@ImportResource导入的配置类
        boolean c=ioc.containsBean("helloService02");       //@bean导入的配置类
        System.out.println(b+" --> "+c);
        int count=0;
        count++;
        Gson gson = new Gson();
    }
    //测试person配置的值
    @Test
    public void contextLoads(){
        System.out.println(person1);     //配置文件换成person.properties --> Bean类名前加
                                        // @PropertySource(value = {"classpath:person.properties"})
    }
    //测试日志级别
    @Test
    public void showlog(){
        logger.trace("运行时跟踪信息。。。");
        logger.debug("debug调试信息。。。");
        logger.info("自定义信息。。。");
        logger.warn("警告。。。");
        logger.error("报错。。。");
    }

}
