package com.example.cuidamos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.cuidamos.domain.SignUp;
import com.example.cuidamos.service.MemberSignUp_service;


@RestController
public class MemberSignUp {
	
	@Autowired
	MemberSignUp_service service;
	
	@PostMapping(value = "/signUp")
	public SignUp signUp(SignUp info) {
		System.out.println(info.toString());
		return info;
	}
	
}
