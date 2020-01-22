package com.ylf.springboot.learn.demo01.start.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
// @EnableAutoConfiguration
public class IndexController {

	// 在微服务情况，基本上都在类上加上@RestController 目的？
	// 使用传统方式返回json @ResponseBody
	// @RestController  修饰类下的所有方法，全部都是返回json格式.这样的话不用方法上加上@ResponseBody
	@RequestMapping("/index")
	public String index() {

		return "这是我的一个SpringBoot项目。更多分布式微服务相关知识";
	}

//	// 思考：如何启动？ 使用main启动
//	// @EnableAutoConfiguration 作用开启自动装备
//	public static void main(String[] args) {
//		// 告诉SpringBoot 程序入口 默认端口号是8080
//		SpringApplication.run(IndexController.class, args);
//	}

}
