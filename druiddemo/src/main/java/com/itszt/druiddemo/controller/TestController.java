package com.itszt.druiddemo.controller;

import com.itszt.druiddemo.User;
import com.itszt.druiddemo.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestDao testDao;
    @GetMapping("getUser")
    public List<User> listUserName(){

        return testDao.getUser();
    }
}
