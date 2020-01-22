package net.xdclass.demo.controller;

import net.xdclass.demo.domain.User2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }




    @RequestMapping("/test")
    public Map<String,String> testMap() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "xdclass");
        return map;
    }

    @RequestMapping("/test/home")
    public String home2() {
        return "xdclass";
    }


    @GetMapping("/testjson")
    public Object testjson(){
        return new User2(111, "abc123", "10001000", new Date());
    }


}