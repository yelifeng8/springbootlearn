package com.ylf.springboot.learn.demo03.mybatis01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.mybaties启动方式可以在mapper层不需要mapper注解。但是一定要在启动类的时候加上@MapperScan
 * 2.mybaties在接口加上@Mapper注入mybaties容器，就不需要在启动了的时候加上@MapperScan
 */

@SpringBootApplication
@MapperScan(basePackages = { "com.ylf.springboot.learn.demo03.mybatis01.mapper"})
public class MybatisApp01 {
    public static void main(String[] args){
        SpringApplication.run(MybatisApp01.class,args);

    }
}
