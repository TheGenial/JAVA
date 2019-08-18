package com.arif.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//load spring configuration file (Creating spring container) 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
				
		//retreive beans from container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//close the context
		context.close();
	}

}
