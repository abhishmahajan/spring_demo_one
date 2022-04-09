package com.codes.springdemo;

public class TrackCoach implements Coach {
 
	private FortuneServicee fortuneService;
	
   TrackCoach(){}//added it for fixing MyApp compile error
   TrackCoach(FortuneServicee fortuneService){
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getdailyWorkout() {
		return "spend 30 min on Sprint running";
	}

	@Override
	public String getdailyFortune() {
		return fortuneService.grtFortune();
	}
}
