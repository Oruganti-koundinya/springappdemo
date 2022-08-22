package com.samples.S1springcoreid.constructor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S1springcoreid/constructor/SpringConfig.xml");

		Employee emp1 = (Employee) springContainer.getBean("emp");
		System.out.println(emp1);
		
	}
}