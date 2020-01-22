package com.ylf.springboot.learn.demo19.redis.controller;

import com.ylf.springboot.learn.demo19.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private RedisService redisService;

    @RequestMapping("/setString")
    public String setString(String key, String object) {
        redisService.set(key, object, 60l);
        return "success";
    }

    @RequestMapping("/get")
    public String get(String key) {
        return redisService.getString(key);
    }

}
