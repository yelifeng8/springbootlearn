package com.ylf.springboot.learn.demo04.mybatis02.test2.service;

import com.ylf.springboot.learn.demo04.mybatis02.test1.mapper.UserMapperTest01;
import com.ylf.springboot.learn.demo04.mybatis02.test2.mapper.UserMapperTest02;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import lombok.extern.slf4j.Slf4j;

/**
 * UserServiceTest02<br>
 */
@Service
@Slf4j
public class UserServiceTest02 {
	@Autowired
	private UserMapperTest02 userMapperTest02;

    @Autowired
    private UserMapperTest01 userMapperTest01;

	//@Transactional(transactionManager = "test2TransactionManager")
	@Transactional
	public int insertUser(String name, Integer age) {
		int insertUserResult = userMapperTest02.insert(name, age);
		log.info("######insertUserResult:{}##########", insertUserResult);
		// 怎么样验证事务开启成功!~
		int i = 1 / age;
		return insertUserResult;
	}

    @Transactional(transactionManager = "test2TransactionManager")
    //@Transactional
    public int insertUserTest1AndTest2(String name, Integer age) {
	    //传统分布式事务解决方案jta+atomikos注册同一个全局事务中
        int insertUserResult01 = userMapperTest01.insert(name, age);
        int insertUserResult02 = userMapperTest02.insert(name, age);
        // 怎么样验证事务开启成功!~
        int i = 1 / age;
        int insertUserResult = insertUserResult01 +insertUserResult02;
        return insertUserResult;
    }

}
