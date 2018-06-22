package com.bo.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 
 * @Author 王博
 * @Version 2018年6月22日　下午1:35:39
 * @码云 https://gitee.com/LeisureBo
 */
@RestController
@RequestMapping("/test")
public class EurekaClientController {
	
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/say")
	public String saySomthing(@RequestParam("str") String content) {
		return "You had say: " + content + ", at port -> " + port;
	}
	
	@RequestMapping("/sayMany")
	public String sayMany(@RequestParam("one") String content1, @RequestParam("two")String content2) {
		return "You had say: " + content1 + " and " + content2 + ", at port -> " + port;
	}
}
