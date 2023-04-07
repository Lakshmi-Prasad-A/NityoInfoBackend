package com.app.nityoinfo.dao;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.nityoinfo.entity.UserEntity;

public interface UserInterface extends JpaRepository<UserEntity, Serializable> {

	public Optional<UserEntity> findByEmailAndPassword(String email, String password);
}
