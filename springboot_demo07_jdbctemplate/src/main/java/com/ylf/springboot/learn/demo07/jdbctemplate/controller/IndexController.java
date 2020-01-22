package com.ylf.springboot.learn.demo07.jdbctemplate.controller;

import com.ylf.springboot.learn.demo07.jdbctemplate.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private UserServiceImpl userServiceImpl;
    @RequestMapping("/index")
    public String index(String name,Integer age){
        System.out.println("222");
        userServiceImpl.CreateUser(name,age);
        return "success";
    }
    @RequestMapping("/index2")
    public String index2(String name,Integer age){
        System.out.println("242");
        userServiceImpl.CreateUser(name,age);
        return "success";
    }

    @RequestMapping("/index3")
    public String index3(String name,Integer age){
        System.out.println("252");
        userServiceImpl.CreateUser(name,age);
        return "success";
    }
    @RequestMapping("/index4")
    public String index4(String name,Integer age){
        System.out.println("252");
        userServiceImpl.CreateUser(name,age);
        return "success";
    }
    @RequestMapping("/index5")
    public String index5(String name,Integer age){
        System.out.println("252");
        userServiceImpl.CreateUser(name,age);
        return "success";
    }
}
