package com.codes.springdemo;

public class BaseBallCoach implements Coach {
 
	@Override
	public String getdailyWorkout() {
		return "spend 30 min for batting practice";
	}
}
