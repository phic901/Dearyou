package com.dearyou.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@ResponseBody
	@GetMapping("/main")
	public String main() {
		logger.info("main method");
		return "success";
	}

	
	
	
}
