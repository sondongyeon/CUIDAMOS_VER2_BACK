package com.example.cuidamos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.cuidamos.domain.SignUp;

@Controller
public class HomeController {
	
	@GetMapping(value = "/")
	public String home() {
		return "index";
	}
	
	@PostMapping(value = "/test")
	public String test() {
		return "test";
	}
}
