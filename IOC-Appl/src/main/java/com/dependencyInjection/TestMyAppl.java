package com.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyAppl {

	public static void main(String[] args) {
		
		ApplicationContext cntxt = new ClassPathXmlApplicationContext("spring-beans.xml");//syntax to start the IOC Container.
		
		RestaurantService rs1= cntxt.getBean(RestaurantService.class);
		
		System.out.println(rs1.hashCode());
		
		rs1.collectBill(1345.50);
		
		
	}
}
