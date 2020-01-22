/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.ylf.springboot.learn.demo12.cloud.member.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {
	@Value("${server.port}")
	private String serverPort;

	@RequestMapping("/getMember")
	public String getMember() {
		return "this is getMember service"+serverPort;
	}

}
