package com.itszt.userservice_provider.controller;

import com.itszt.basespringclouddemo.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProviderResource {

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable("userId") String userId){

        User user = new User();
        user.setName("name--->"+userId);
        user.setPassword("pwd--->"+userId);

        return user;
    }
}
