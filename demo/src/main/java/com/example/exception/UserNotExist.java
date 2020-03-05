package com.example.exception;

import com.example.entities.Department;

public class UserNotExist extends RuntimeException{
    public UserNotExist() {
        super("用户不存在");
    }

}
