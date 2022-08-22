package com.samples.S2Autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S2Autowiring.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
       
    	// create the spring container
    	ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S2Autowiring/SpringConfig.xml");
       
       Employee emp = (Employee) springContainer.getBean("emp"); 
       System.out.println(emp);
       
      
    }
}