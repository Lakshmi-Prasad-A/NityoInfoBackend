package com.app.nityoinfo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nityoinfo.binding.UserLoginPage;
import com.app.nityoinfo.binding.UserSignupPage;
import com.app.nityoinfo.dao.UserInterface;
import com.app.nityoinfo.entity.UserEntity;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private UserInterface repo;
	
	
	@Override
	public String saveUser(UserEntity user) {
	
		user  = repo.save(user);
		
		if(user.getUserId()!=null) {
			return "Contact saved";
		}else {
			return "Contact Failed to save";
		}
	}

	public String getLoginPage(UserLoginPage loginpage) {
	
		return null;
	}

	@Override
	public UserEntity getUserId(Integer userId) {
		Optional<UserEntity> findById =  repo.findById(userId);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String forgotPassword(UserLoginPage loginpage) {

		return null;
	}

	@Override
	public String Singup(UserSignupPage signup) {

		return null;
	}

}
