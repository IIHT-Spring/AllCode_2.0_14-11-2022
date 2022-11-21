package com.token.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contorller {
	
	
	@GetMapping("/")
	public String home() {
		return "Hello you have unlocked you home so you can see this data";
	}

}
