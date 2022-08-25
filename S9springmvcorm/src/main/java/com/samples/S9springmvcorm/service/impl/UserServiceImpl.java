package com.samples.S9springmvcorm.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.S9springmvcorm.dao.UserDao;
import com.samples.S9springmvcorm.entity.User;
import com.samples.S9springmvcorm.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;

	@Override
	@Transactional
	public int save(User user) {
		return userdao.create(user);
	}
	
}