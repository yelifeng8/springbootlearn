package com.ylf.springboot.learn.demo05.mybatis03.test01.service;

import com.ylf.springboot.learn.demo05.mybatis03.test01.mapper.UserMapperTest01;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import lombok.extern.slf4j.Slf4j;

/**
 * UserServiceTest01<br>
 */
@Service
@Slf4j
public class UserServiceTest01 {
	@Autowired
	private UserMapperTest01 userMapperTest01;

	@Transactional()
	public int insertUser(String name, Integer age) {
		int insertUserResult = userMapperTest01.insert(name, age);
		log.info("######insertUserResult:{}##########", insertUserResult);
		int i = 1 / age;
		// 怎么样验证事务开启成功!~
		return insertUserResult;
	}

}
