package com.samples.S9springmvcorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.samples.S9springmvcorm.entity.User;
import com.samples.S9springmvcorm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/register")
	public String showRegistrationPage() {
		return "userreg";
	}

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {

		int id = userService.save(user);
		
		model.addAttribute("result", "User created with Id: " + id);

		return "userreg";

	}

}