package com.app.nityoinfo.service;

import com.app.nityoinfo.binding.UserLoginPage;
import com.app.nityoinfo.entity.UserEntity;

public interface ServiceInterface{

	public String saveUser(UserEntity user);
	public String getLoginPage(UserLoginPage loginpage);
	

}
