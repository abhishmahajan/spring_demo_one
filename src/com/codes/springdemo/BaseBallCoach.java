package com.codes.springdemo;

public class BaseBallCoach implements Coach {
 
    private	FortuneServicee fortuneService;
	
	BaseBallCoach(FortuneServicee fortuneService){
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getdailyWorkout() {
		return "spend 30 min for batting practice";
	}


	@Override
	public String getdailyFortune() {
		return fortuneService.grtFortune();
	}


}
