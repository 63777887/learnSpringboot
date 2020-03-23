package com.example.amqp;

import com.example.amqp.bean.Book;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;

@SpringBootTest
class AmqpApplicationTests {

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    AmqpAdmin amqpAdmin;

    @Test
    void contextLoads() {
    }

//    @Test
//    public void test01(){
//        HashMap<Object, Object> map = new HashMap<>();
//        map.put("msg", "hahha");
//        map.put("list", Arrays.asList("集合在这",1234,true));
//        rabbitTemplate.convertAndSend("exchange.direct", "atguigu.emps",new Book(1002,"西游记"));
//        rabbitTemplate.convertAndSend("exchange.direct","atguigu", "这是监听消息");
//    }
//
//    @Test
//    public void test02(){
//        Object o = rabbitTemplate.receiveAndConvert("atguigu.emps");
//        System.out.println(o.getClass());
//        System.out.println(o);
//    }
//
//    @Test
//    public void test03(){
//        rabbitTemplate.convertAndSend("exchange.fanout","atguigu","这是测试的群发消息");
//    }
//
//    @Test
//    public void test04(){
//        amqpAdmin.declareExchange(new DirectExchange("myexchange", true, false));
//        amqpAdmin.deleteExchange("myexchange");
//
//        amqpAdmin.declareQueue(new Queue("myqueue",true));
//        amqpAdmin.deleteQueue("myqueue");
//
//        amqpAdmin.declareBinding(new Binding("atguigu", Binding.DestinationType.QUEUE, "exchange.direct","amqp.haha",null ));
//        amqpAdmin.removeBinding(new Binding("atguigu", Binding.DestinationType.QUEUE, "exchange.direct","amqp.haha",null ));
//
//    }
}
