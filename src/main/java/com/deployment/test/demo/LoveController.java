package com.deployment.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoveController {
	
	@GetMapping(value="/catchMe")
	public String givesLoves() {
		
		return "this is my first deployed REST service.";
	}

}
