package com.app.nityoinfo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class UserEntity {
	@Id
	@GeneratedValue
	private Integer userId;
	private String username;
	private String password;
	private String email;
}
