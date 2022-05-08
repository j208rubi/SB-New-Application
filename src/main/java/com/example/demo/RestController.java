package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
private Map<String, Object> cache=new HashMap<String,Object>();
	
	@GetMapping("/welcome")
	public String message() {
		return "Hello All Gitis";
	}

	@GetMapping("/welcome1")
	public String message1() {
		return "Hello All Gitis1";
	}
	
	@GetMapping("/welcome2feature")
	public String message122() {
		return "Hello All Gitis1-122";
	}
}
