package net.xdclass.base_project.controller;


import net.xdclass.base_project.domain.JsonData;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@作者 小D课堂  小D
 */
@RestController
@RequestMapping("/api/v1")
public class OrderController {
	
	@Value("${test.url}")
	private String domain;

	/**
	 * 功能描述：微信支付回调接口
	 * @param msg 支付信息
	 * @return
	 */
	@GetMapping("order")
	public Object order(String msg){
		
       return JsonData.buildSuccess(domain);
	}
	
	
	
	
	
	
	
	
	
	
	
}
