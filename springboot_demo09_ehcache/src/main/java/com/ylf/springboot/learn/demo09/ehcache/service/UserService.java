package com.ylf.springboot.learn.demo09.ehcache.service;

import com.ylf.springboot.learn.demo09.ehcache.entity.Users;
import com.ylf.springboot.learn.demo09.ehcache.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<Users> getUser(Long id) {
        return userMapper.getUser(id);
    }





}
