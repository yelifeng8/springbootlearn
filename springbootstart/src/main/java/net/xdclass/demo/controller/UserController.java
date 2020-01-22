package net.xdclass.demo.controller;



import net.xdclass.demo.domain.JsonData;
import net.xdclass.demo.task.AsyncTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;


@RestController
@RequestMapping("/log/v1")
public class UserController {

	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("log")
	public Object testLog(){
		
		logger.debug("this is debug level");
		logger.info("this is info level ");
		logger.warn("this is warn level ");
		logger.error("this is error level");
		return JsonData.buildSuccess();
	}


	@Autowired
	private AsyncTask task;

	@GetMapping("async_task")
	public JsonData exeTask() throws InterruptedException{

		long begin = System.currentTimeMillis();

		task.task1();
		task.task2();
		task.task3();

/*
		Future<String> task4 = task.task4();
		Future<String> task5 = task.task5();
		Future<String> task6 = task.task6();
		for(;;){
			if (task4.isDone() && task5.isDone() && task6.isDone()) {
				break;
			}
		}
*/


		long end = System.currentTimeMillis();

		long total = end-begin;
		System.out.println("执行总耗时="+total);
		return JsonData.buildSuccess(total);
	}
	
}
