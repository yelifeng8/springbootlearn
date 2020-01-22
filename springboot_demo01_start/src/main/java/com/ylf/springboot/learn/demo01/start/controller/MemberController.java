package com.ylf.springboot.learn.demo01.start.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@RequestMapping("/getMember")
	public Map<String, Object> getMember() {
		Map<String, Object> hashMap = new HashMap<String, Object>();
		hashMap.put("errorCode", 200);
		hashMap.put("errorMsg", "蚂蚁课堂");
		return hashMap;
	}

}
