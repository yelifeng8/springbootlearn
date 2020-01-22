/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.ylf.springboot.learn.demo11.redistransaction;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 功能说明: <br>
 *
 */
@SpringBootApplication
@MapperScan("com.ylf.springboot.learn.demo11.redistransaction.mapper")
@EnableCaching
public class AppRedis {

	public static void main(String[] args) {
		SpringApplication.run(AppRedis.class, args);
	}

}
