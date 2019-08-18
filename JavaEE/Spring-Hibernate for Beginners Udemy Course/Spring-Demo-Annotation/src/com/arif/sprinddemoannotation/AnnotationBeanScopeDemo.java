package com.arif.sprinddemoannotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container (Using defined and default bean id)
		//Coach coach = context.getBean("theSillyCoach",Coach.class);
		Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach theCopachCoach = context.getBean("tennisCoach",Coach.class);
		
		//check they are equal or not
		boolean checkEquality = (coach == theCopachCoach);
		System.out.println(checkEquality);
		
		//call a method on the bean
		System.out.println(coach.getDailyWorkout());
		
		//call method to get daily fortune
		System.out.println(coach.getDailyFortune());
		
		//close the context
		context.close();

	}

}
