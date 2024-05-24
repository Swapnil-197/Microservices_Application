package com.boot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome to SpringBoot & Microservices Concept..!!";
		return msg ;
	}
}
