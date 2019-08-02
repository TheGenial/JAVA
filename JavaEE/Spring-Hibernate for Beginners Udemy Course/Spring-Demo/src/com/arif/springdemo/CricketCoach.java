package com.arif.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	public String emailAddress;
	public String team;
	
	
	public CricketCoach() {
		System.out.println("Inside CricketCoach - no arg constructor!");
	}
		
	public String getEmailAddress() {
		System.out.println(emailAddress);
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside setEmail method: ");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		System.out.println(team);
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside setTeam method: ");
		this.team = team;
	}

	//setter method 
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Batting for 15 minute";
	}

	@Override
	public String DailyFortune() {
		return fortuneService.getFortuneService();
	}

}
