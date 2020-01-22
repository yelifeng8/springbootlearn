package com.ylf.springboot.learn.demo11.redistransaction.controller;


import java.util.HashSet;
import java.util.Set;

import com.ylf.springboot.learn.demo11.redistransaction.entity.Users;
import com.ylf.springboot.learn.demo11.redistransaction.service.RedisService;
import com.ylf.springboot.learn.demo11.redistransaction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @Autowired
    private RedisService redisService;
    @Autowired
    private UserService userService;

    @RequestMapping("/setString")
    public String setString(String key, String value) {
        // redisService.set(key, value, 60l);
        redisService.setString(key, value);
        return "success";
    }

    @RequestMapping("/getString")
    public String getString(String key) {
        return redisService.getString(key);
    }

    @RequestMapping("/setSet")
    public String setSet() {
        Set<String> set = new HashSet<String>();
        set.add("yushengjun");
        set.add("lisi");
        redisService.setSet("setTest", set);
        return "success";
    }

    @RequestMapping("/getUser")
    public Users getUser(Long id) {
        Users user = userService.getUser(id);
        return user;
    }
}
