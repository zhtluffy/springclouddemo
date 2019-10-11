package com.itszt.druiddemo.dao;

import com.itszt.druiddemo.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class TestDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<User> getUser(){
        String sql = "select username from user;";
        List<User> query = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(User.class));
        return query;
    }

}
