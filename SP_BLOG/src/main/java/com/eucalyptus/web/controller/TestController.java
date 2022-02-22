package com.eucalyptus.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eucalyptus.web.vo.Test;

@RestController
public class TestController {

	@GetMapping("/test")
	public Object restApiTest() {
		Test test = new Test();
		test.name = "Koala";
		test.age = 32;
		
		return test;
	}
}
