package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExample {
	

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome Ravi";
	}

}
