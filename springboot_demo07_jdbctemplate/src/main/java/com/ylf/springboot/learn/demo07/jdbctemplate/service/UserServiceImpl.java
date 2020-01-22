package com.ylf.springboot.learn.demo07.jdbctemplate.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void CreateUser(String name,Integer age){
        log.info(name+","+age);
        jdbcTemplate.update("INSERT INTO users VALUE (NULL ,?,?);",name,age);
        log.info(name+","+age);
    }
}
