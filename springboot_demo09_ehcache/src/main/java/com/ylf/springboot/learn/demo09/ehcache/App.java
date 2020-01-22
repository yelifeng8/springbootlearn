package com.ylf.springboot.learn.demo09.ehcache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@MapperScan(basePackages = { "com.ylf.springboot.learn.demo09.ehcache.mapper" })
@EnableCaching //开启缓存
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
