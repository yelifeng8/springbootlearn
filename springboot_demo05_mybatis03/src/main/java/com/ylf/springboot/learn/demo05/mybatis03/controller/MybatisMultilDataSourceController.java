package com.ylf.springboot.learn.demo05.mybatis03.controller;

import com.ylf.springboot.learn.demo05.mybatis03.test01.service.UserServiceTest01;
import com.ylf.springboot.learn.demo05.mybatis03.test02.service.UserServiceTest02;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * 多数据源测试<br>
 */
@RestController
public class MybatisMultilDataSourceController {
	@Autowired
	private UserServiceTest01 userServiceTest01;
	@Autowired
	private UserServiceTest02 userServiceTest02;

	@RequestMapping("/insertUserTest1")
	public Integer insertUserTest1(String name, Integer age) {
		return userServiceTest01.insertUser(name, age);
	}

	@RequestMapping("/insertUserTest2")
	public Integer insertUserTest2(String name, Integer age) {
		return userServiceTest02.insertUser(name, age);
	}

	@RequestMapping("/insertUserTest01AndTest02")
	public int insertUserTest01AndTest02(String name, Integer age) {
		return userServiceTest02.insertUserTest01AndTest02(name, age);
	}
}
