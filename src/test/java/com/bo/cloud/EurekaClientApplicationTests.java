package com.bo.cloud;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientApplicationTests {
	
	@Test
	public void testRest() {
		RestTemplate rest = new RestTemplate();
		Map<String, String> reqMap = new HashMap<>();
		reqMap.put("str", "hello");
		reqMap.put("one", "one");
		reqMap.put("two", "two");
		String result = rest.getForObject("http://127.0.0.1:8092/test/say?str={str}", String.class, reqMap);
//		String result = rest.getForObject("http://127.0.0.1:8092/test/sayMany?one={one}&two={two}", String.class, reqMap);
		System.out.println(result);
	}
}
