package com.samples.S8springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samples.S8springmvc.domain.Employee;

@Controller
public class ObjectController {

	@RequestMapping("/readobject")
	public ModelAndView sendObject() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayobject");
		
		Employee employee = new Employee();
		employee.setId(4321);
		employee.setName("Tony");
		employee.setSalary(53246);
		
		modelAndView.addObject("employee", employee);
		
		return modelAndView;
	}
	}
