package com.samples.S1springcoreid;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext("com/samples/S1springcoreid/SpringConfig.xml");
       
//       Employee emp = (Employee) springContainer.getBean("emp"); 
//       System.out.println(emp);
       
//       Hospital hospital = (Hospital) springContainer.getBean("hospital");
//       System.out.println(hospital);
       
//       CarDealer dealer = (CarDealer) springContainer.getBean("cardealer");
//       System.out.println(dealer);
       
       Customer customer = (Customer) springContainer.getBean("customer");
       System.out.println(customer);
    }
}