package com.codes.springdemo.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codes.springdemo.Coach;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
    
    Coach coach = context.getBean("myCoach",Coach.class);
    
    System.out.println(coach.getdailyFortune());
    
    context.close();
	}

}
