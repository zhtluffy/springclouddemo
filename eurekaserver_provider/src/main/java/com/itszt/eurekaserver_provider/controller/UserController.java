package com.itszt.eurekaserver_provider.controller;

import com.itszt.eurekaserver_provider.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String getUser(){
        return "hello,xiaobai!";
    }
}
