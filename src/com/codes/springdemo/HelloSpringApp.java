package com.codes.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach coach = context.getBean("mycoach1",Coach.class);
		System.out.println(coach.getdailyWorkout());
		System.out.println(coach.getdailyFortune());
		context.close();
	}

}
