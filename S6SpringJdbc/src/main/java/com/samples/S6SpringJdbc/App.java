package com.samples.S6SpringJdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S6SpringJdbc/SpringConfig.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) springContainer.getBean("jdbctemplate");
		
		String sql = "insert into employee values (?, ?, ?)";
		int updateResult = jdbcTemplate.update(sql, 1, "John", "Greesham");
		System.out.println("Number of records inserted: " + updateResult);
		

	}
}
