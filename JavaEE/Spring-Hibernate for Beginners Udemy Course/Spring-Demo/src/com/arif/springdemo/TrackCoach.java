package com.arif.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "I'm running now";
	}

	@Override
	public String DailyFortune() {
		return "Just Do it: " + fortuneService.getFortuneService();
	}
	
	public void doStartupProcess() {
		System.out.println("Task done when start");
	}
	
	public void doCleanupProcess() {
		System.out.println("Cleandup task done");
	}

}
