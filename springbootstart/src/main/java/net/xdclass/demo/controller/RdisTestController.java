package net.xdclass.demo.controller;



import net.xdclass.demo.domain.JsonData;
import net.xdclass.demo.domain.User3;
import net.xdclass.demo.util.JsonUtils;
import net.xdclass.demo.util.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/redis/v1/redis")
public class RdisTestController {

	
	@Autowired
	private StringRedisTemplate redisTpl; //jdbcTemplate

	@Autowired
	private RedisClient redis;

	@GetMapping(value="add")
	public Object add(){
		
		//opsForValue : Returns the operations performed on simple values (or Strings in Redis terminology).
 
		//redisTpl.opsForValue().set("name", "xdclass2018");
		redis.set("username", "xdclass2018");
		return JsonData.buildSuccess();
		
	}
	
	@GetMapping(value="get")
	public Object get(){
		
		//String value = redisTpl.opsForValue().get("name");
		String value = redis.get("username");
		return JsonData.buildSuccess(value);
		
	}


	@GetMapping(value="save_user")
	public Object saveUser(){
		User3 user = new User3(1, "abc", "11", new Date());
		String userStr = JsonUtils.obj2String(user);
		boolean flag = redis.set("base:user:11", userStr);
		return JsonData.buildSuccess(flag);

	}

	@GetMapping(value="find_user")
	public Object findUser(){

		String userStr = redis.get("base:user:11");
		User3 user = JsonUtils.string2Obj(userStr, User3.class);

		return JsonData.buildSuccess(user);

	}





}
