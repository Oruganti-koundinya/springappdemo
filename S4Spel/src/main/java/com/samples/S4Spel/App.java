package com.samples.S4Spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samples.S4Spel.model.CarDealer;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// create the spring container
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S4Spel/SpringConfig.xml");

		CarDealer dealer = (CarDealer) springContainer.getBean("carDealer");
		System.out.println(dealer);

	}
}