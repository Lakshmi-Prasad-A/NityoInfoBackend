package com.app.nityoinfo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.nityoinfo.binding.UserLoginPage;
import com.app.nityoinfo.dao.UserInterface;
import com.app.nityoinfo.entity.UserEntity;

@Service
public class ServiceImpl implements ServiceInterface {

	@Autowired
	private UserInterface repo;

	@Override
	public String saveUser(UserEntity user) {

		user = repo.save(user);

		if (user.getUserId() != null) {
			return "User Registration done!";
		} else {
			return "Unable to Registerd please try again !";
		}
	}

	public String getLoginPage(UserLoginPage loginpage) {
		Optional<UserEntity> findByEmailAndPassword = repo.findByEmailAndPassword(loginpage.getEmail(),
				loginpage.getPassword());

		return findByEmailAndPassword.isPresent() ? "User Login Sucess" : "Invalide Credentials";
	}
}
