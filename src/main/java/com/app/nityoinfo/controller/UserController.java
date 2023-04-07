package com.app.nityoinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.nityoinfo.binding.UserLoginPage;
import com.app.nityoinfo.entity.UserEntity;
import com.app.nityoinfo.service.ServiceInterface;

@RestController
@CrossOrigin
@RequestMapping(value ="/nityoinfo")
public class UserController {

	@Autowired
	private ServiceInterface ser;
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody UserEntity user) {
		return ser.saveUser(user);
	}
	@GetMapping("/user/{userId}")
	public UserEntity getUserId(@PathVariable Integer userId) {
		return ser.getUserId(userId);
	}
	
	@PostMapping("/signin")
	public String getLoginPage(UserLoginPage loginpage) {
		return ser.getLoginPage(loginpage);
	}

	
}
