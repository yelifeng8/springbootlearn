package com.ylf.springboot.learn.demo11.redistransaction.controller;

import com.ylf.springboot.learn.demo11.redistransaction.service.EhCacheUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocalController {
    @Autowired
    private EhCacheUtils ehRedisService;

    @RequestMapping("/addLoca")
    public String addLoca(String key, String value) {
        ehRedisService.put("userCache", key, value);
        return "success";
    }

    @RequestMapping("/getEh")
    public String getEh(String key) {
        return (String) ehRedisService.get("userCache", key);
    }

}
