package com.example.cunsumeruser.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.provider.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;
    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了"+ticket);
    }

}
