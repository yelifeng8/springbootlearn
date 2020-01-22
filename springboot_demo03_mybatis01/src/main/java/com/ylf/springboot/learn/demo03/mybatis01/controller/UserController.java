package com.ylf.springboot.learn.demo03.mybatis01.controller;


import com.ylf.springboot.learn.demo03.mybatis01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insertUser")
    public Integer insertUser(String name,Integer age){
        return  userService.insertUser(name,age);
    }
}
