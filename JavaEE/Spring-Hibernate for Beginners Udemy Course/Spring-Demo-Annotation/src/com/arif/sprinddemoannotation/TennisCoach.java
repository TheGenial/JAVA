package com.arif.sprinddemoannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("theSillyCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	//Field Injection
	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("< Inside default constructor");
	}
	
	//Constructor Injection
	/*@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}*/
	
	//Setter Injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	//Injection into any method
	/*@Autowired
	public void setFortuneValue(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	
	
	@Override
	public String getDailyWorkout() {
		return "Your Daily Workout Here";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doStartupStuff() {
		System.out.println("Starter work here");
	}
	
	@PreDestroy
	public void doCleanupStuff() {
		System.out.println("Cleanup code here");
	}

}
