package com.app.nityoinfo.service;

import com.app.nityoinfo.binding.UserLoginPage;
import com.app.nityoinfo.binding.UserSignupPage;
import com.app.nityoinfo.entity.UserEntity;

public interface ServiceInterface{

	public String saveUser(UserEntity user);
	public String getLoginPage(UserLoginPage loginpage);
	public UserEntity getUserId(Integer userId);
	public String forgotPassword(UserLoginPage loginpage);
	public String Singup(UserSignupPage signup);
	

}
