package com.codes.springdemo;

public class CricketCoach implements Coach {
 
	private FortuneServicee fortuneService;
	
	private String Email;
	private String Team;

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
		System.out.println("Email is:"+email);
	}

	public String getTeam() {
		return Team;
	}

	public void setTeam(String team) {
		Team = team;
	}
	
	public void setFortuneService(FortuneServicee fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getdailyWorkout() {
		return "Practice daily bowiling for 40 min";
	}


	@Override
	public String getdailyFortune() {
		return fortuneService.grtFortune();
	}
	
}
