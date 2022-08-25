package com.samples.S8springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.samples.S8springmvc.domain.Employee;

@Controller
public class ListController {

	@RequestMapping("/readlist")
	public ModelAndView sendList() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displaylist");

		List<Employee> emps = new ArrayList<>();

		Employee employee = new Employee();
		employee.setId(4321);
		employee.setName("Tony");
		employee.setSalary(53246);
		emps.add(employee);

		employee = new Employee();
		employee.setId(7654);
		employee.setName("Bruce");
		employee.setSalary(12000);
		emps.add(employee);

		employee = new Employee();
		employee.setId(9876);
		employee.setName("Wilson");
		employee.setSalary(4500);
		emps.add(employee);
		
		modelAndView.addObject("employees", emps);

		return modelAndView;
	}

}