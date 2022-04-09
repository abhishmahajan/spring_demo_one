package com.codes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Coach coach = context.getBean("cricketCoach",Coach.class);
    System.out.println(coach.getdailyFortune());
    System.out.println(coach.getdailyWorkout());
    
    CricketCoach cricketCoach = context.getBean("cricketCoach",CricketCoach.class);
    System.out.println(cricketCoach.getEmail());
    System.out.println(cricketCoach.getTeam());
    context.close();
	}

}
