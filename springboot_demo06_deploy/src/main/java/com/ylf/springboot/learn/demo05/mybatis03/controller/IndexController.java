package com.ylf.springboot.learn.demo05.mybatis03.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${itmayiedu.httpUrl}")
    private String httpUrl;

    @Value("${itmayiedu.name}")
    private String name;


    @Value("${itmayiedu.students.money}")
    private String money;

    @RequestMapping("/index")
    public String index(){
        return httpUrl + "," +name+ "," +money;
    }
}
