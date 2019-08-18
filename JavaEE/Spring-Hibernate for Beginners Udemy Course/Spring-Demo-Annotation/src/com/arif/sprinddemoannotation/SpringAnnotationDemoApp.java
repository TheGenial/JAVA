package com.arif.sprinddemoannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration from java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportDetails.class);
		
		//get the bean from spring container (Using defined and default bean id)
		//Coach coach = context.getBean("theSillyCoach",Coach.class);
		Coach coach = context.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
