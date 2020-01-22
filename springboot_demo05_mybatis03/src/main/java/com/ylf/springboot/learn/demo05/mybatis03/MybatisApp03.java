package com.ylf.springboot.learn.demo05.mybatis03;

import com.ylf.springboot.learn.demo05.mybatis03.config.DBConfig1;
import com.ylf.springboot.learn.demo05.mybatis03.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;



// 开启读取配置文件
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@SpringBootApplication
public class MybatisApp03 {

	public static void main(String[] args) {
		SpringApplication.run(MybatisApp03.class, args);
	}

}
