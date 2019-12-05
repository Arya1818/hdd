package com.hdd.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public List<String> doTest(){
		List<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.add("2");
		return strList;
	}
}
