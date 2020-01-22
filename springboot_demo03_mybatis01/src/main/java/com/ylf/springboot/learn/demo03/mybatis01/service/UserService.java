package com.ylf.springboot.learn.demo03.mybatis01.service;

import com.ylf.springboot.learn.demo03.mybatis01.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int insertUser(String name,Integer age){
        int insertUserResult = userMapper.insert(name,age);
        log.info("######",insertUserResult);
        int i = 1/age;
        return insertUserResult;
    }
}
