package com.example.cache;

import com.example.cache.bean.Employee;
import com.example.cache.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootTest
class CacheApplicationTests {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate myRedisTemplate;

    @Test
    void jian(){
        try {
                String str;
                URL u = new URL("http://wx.10086.cn/website/businessPlatform/shopList/data?productId=29558");
                InputStream is = u.openStream();
                InputStreamReader isr = new InputStreamReader(is, "UTF-8");
                BufferedReader br = new BufferedReader(isr);
                if (br.ready()) {
                    while ((str = br.readLine()) != null) {
                        System.out.println(str);
                    }
                }
                br.close();
                isr.close();
                is.close();
        } catch(MalformedURLException e){
            // url地址错误
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        Runtime ec=Runtime.getRuntime();
        try {
            ec.exec("open -n /Applications/qq.app");
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
    }

    @Test
    public void test01(){
        stringRedisTemplate.opsForList().leftPush("mulist","1");
        stringRedisTemplate.opsForList().leftPush("mulist","2");
    }

    @Test
    public void test02() throws JsonProcessingException {
        //默认如果保存对象，使用jdk的序列化机制，序列化后的结果保存到redis
        Employee employee = employeeService.selectEmpById(1);
        //我们需要将数据转为json，写入自己的序列化器，转换成json数据
//        redisTemplate.opsForValue().set("jsonEmp",employee);
        myRedisTemplate.opsForValue().set("emp",employee);
    }

}
