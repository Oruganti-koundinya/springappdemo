package com.samples.S9springmvcorm.dao;

import java.util.List;

import com.samples.S9springmvcorm.entity.User;

public interface UserDao {

	int create(User user);
	List<User>findusers();
}