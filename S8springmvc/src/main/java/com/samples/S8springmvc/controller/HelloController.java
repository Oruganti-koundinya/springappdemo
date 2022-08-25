package com.samples.S8springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		
		modelAndView.addObject("id", 420);
		modelAndView.addObject("name", "Horward");
		modelAndView.addObject("salary", 60000);
		
		return modelAndView;
	}
	
}