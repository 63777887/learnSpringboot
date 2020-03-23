package com.example.demo_elastic.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduledSevice {
//      秒，分，时，日，月，周几
    @Scheduled(cron = "* * * * * 1-7")    //每秒运行
//    @Scheduled(cron = "0 0/5 14,18 * * ?")  //每天14点和18点每五分钟执行一次
//    @Scheduled(cron = "* 15 10 ? * 1-6")    //每个星期一到星期六的10点15分，每秒执行一次
//    @Scheduled(cron = "0 0 2 ？ * 6L")      //每个月的最后一个星期六的2点执行一次
//    @Scheduled(cron = "0 0 2 LW * ?")       //每个月的最后一个工作日的2点执行一次
//    @Scheduled(cron = "0 0 2-4 ? * 1#1")    //每个月第一个星期一的2-4点执行一次
    public String hello(){
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = format.format(now);
        System.out.println(time);
        return time;
    }
}
