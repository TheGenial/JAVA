package com.arif.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load spring configuration file (Creating spring container) 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive beans from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach theCoach2 = context.getBean("myCoach2",Coach.class);
		
		//call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach2.getDailyWorkout());
		
		//let's call our new method for fortune
		System.out.println(theCoach2.DailyFortune());
		System.out.println(theCoach.DailyFortune());
		
		//close the context
		context.close();

	}

}
