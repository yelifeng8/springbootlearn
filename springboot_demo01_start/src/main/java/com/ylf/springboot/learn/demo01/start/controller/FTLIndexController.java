package com.ylf.springboot.learn.demo01.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FTLIndexController {

    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String,Object> map){
        map.put("name","yelifengye");
        map.put("age","20");
        map.put("sex","0");
        return "ftlIndex";
    }
}
