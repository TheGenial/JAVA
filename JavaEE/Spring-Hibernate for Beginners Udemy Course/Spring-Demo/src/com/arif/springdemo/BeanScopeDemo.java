package com.arif.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load spring configuration file (Creating spring container) 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
				
		//retreive beans from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach theCoach2 = context.getBean("myCoach",Coach.class);
						
		//check if those object are equal or not
		boolean equalityCheck = (theCoach == theCoach2);
		System.out.println("They are equal: " + equalityCheck);
		
		System.out.println("The first object address is: " +theCoach);
		System.out.println("The second object address is: " +theCoach2);
				
		//close the context
		context.close();
	}

}
