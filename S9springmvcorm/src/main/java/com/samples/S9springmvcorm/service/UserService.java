package com.samples.S9springmvcorm.service;

import java.util.List;

import com.samples.S9springmvcorm.entity.User;

public interface UserService {
	
	int save(User user);
	List<User> getUsers();
}
