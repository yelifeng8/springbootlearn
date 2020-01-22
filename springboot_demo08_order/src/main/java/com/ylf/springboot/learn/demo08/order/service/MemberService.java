/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.ylf.springboot.learn.demo08.order.service;

import com.ylf.springboot.learn.demo08.order.utils.HttpClientUtils;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

/**
 * 功能说明: <br>

 */
@Service
public class MemberService {

	public JSONObject getMember() {

		JSONObject result = HttpClientUtils.httpGet("http://127.0.0.1:8081/member/memberIndex");
		return result;
	}

}
