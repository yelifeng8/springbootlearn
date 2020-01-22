package com.ylf.springboot.learn.demo09.ehcache.controller;


import java.util.List;

import com.ylf.springboot.learn.demo09.ehcache.ehcache.MapEhcaChe;
import com.ylf.springboot.learn.demo09.ehcache.entity.Users;
import com.ylf.springboot.learn.demo09.ehcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IndexController {
    @Autowired
    private UserService userService;
    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private MapEhcaChe<String, String> mapEhcaChe;

    @RequestMapping("/remoKey")
    public void remoKey() {
        cacheManager.getCache("userCache").clear();
    }

    @RequestMapping("/getUser")
    public List<Users> getUser(Long id) {
        return userService.getUser(id);
    }

    @RequestMapping("/ehcaChePut")
    public String put(String key, String value) {
        mapEhcaChe.put(key, value);
        return "success";
    }

    @RequestMapping("/get")
    public String get(String key) {
        String value = mapEhcaChe.get(key);
        return value;
    }
}
