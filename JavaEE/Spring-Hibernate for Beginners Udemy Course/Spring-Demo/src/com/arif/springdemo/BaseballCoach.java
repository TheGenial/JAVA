package com.arif.springdemo;

public class BaseballCoach implements Coach {
	
	//define private field for the dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minute on batting practices";
	}

	@Override
	public String DailyFortune() {
		//use my fortune service to get fortune
		return fortuneService.getFortuneService();
	}
}
