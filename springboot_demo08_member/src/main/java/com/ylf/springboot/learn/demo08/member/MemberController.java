/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.ylf.springboot.learn.demo08.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明: <br>
 */
@RestController
@RequestMapping("/member")
public class MemberController {

	@RequestMapping("/memberIndex")
	public Object memberIndex() throws InterruptedException {
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("code", 200);
		hashMap.put("msg", "memberIndex");
		Thread.sleep(1500);
		return hashMap;
	}

}
