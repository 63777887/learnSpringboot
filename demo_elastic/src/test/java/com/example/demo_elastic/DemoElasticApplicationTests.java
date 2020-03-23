package com.example.demo_elastic;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class DemoElasticApplicationTests {

    @Autowired
    JavaMailSenderImpl javaMailSender;

    @Test
    void contextLoads() {
    }

    @Test
    public void test01(){
        //简单邮件
        SimpleMailMessage message = new SimpleMailMessage();

        //邮件设置
        message.setSubject("通知");
        message.setText("我成功把邮件发给你了");
        message.setTo("63777887@qq.com");
        message.setFrom("63777887@qq.com");
        javaMailSender.send(message);
    }

    @Test
    public void test02() throws MessagingException {
        //高级邮件
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,true);

        //邮件设置
        helper.setSubject("通知");
        helper.setText("<p style:'color:red'>我成功把邮件发给你了</p>",true);
        helper.setTo("63777887@qq.com");
        helper.setFrom("63777887@qq.com");

        //上传邮件
        helper.addAttachment("图片1.png", new File("/Users/edz/Desktop/图片1.png"));
        javaMailSender.send(message);
    }


}
