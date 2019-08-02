package com.arif.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the string configuration file
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve beans from context
		CricketCoach coach = classPathXmlApplicationContext.getBean("myCricketCoach",CricketCoach.class);
		
		//call method from the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.DailyFortune());
		
		//call new method to get the literal values
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		
		//close the context
		classPathXmlApplicationContext.close();

	}

}
