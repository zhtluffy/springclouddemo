package com.itszt.eurekaserverdemo.controller;

import com.itszt.eurekaserverdemo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("user")
    public User getUser(){
        return new User("小白");
    }
}
