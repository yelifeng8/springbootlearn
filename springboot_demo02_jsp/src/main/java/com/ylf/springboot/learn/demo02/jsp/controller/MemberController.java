package com.ylf.springboot.learn.demo02.jsp.controller;

import com.ylf.springboot.learn.demo02.jsp.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    //初始化的时候加载数据
    @Value("${name}")
    private String name;

    @RequestMapping("/getName")
    public String getName(){
        return name;
    }

    @Value("${http_url}")
    private String httpUrl;

    @RequestMapping("/getHttpUrl")
    public String getHttpUrl(){
        return httpUrl;
    }




    @RequestMapping("/addMemberAndEmail")
    public String addMemberAndEmail(){

        log.info("1");
        String result = memberService.addMemberAndEmail();
        log.info("4");
        return result;
    }
}
