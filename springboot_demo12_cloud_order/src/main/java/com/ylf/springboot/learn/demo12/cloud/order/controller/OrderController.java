/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.ylf.springboot.learn.demo12.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class OrderController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/getorder")
	public String getOrder() {
		// order 使用rpc 远程调用技术 调用 会员服务
		String memberUrl = "http://app-itmayiedu-member/getMember";
		String result = restTemplate.getForObject(memberUrl, String.class);
		System.out.println("会员服务调用订单服务,result:" + result);
		return result;
	}

}
