package com.codes.springdemo.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.codes.springdemo.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanScope-applicationContext.xml");
		
		Coach coach1 = context.getBean("myCoach",Coach.class);
		
		Coach coach2 = context.getBean("myCoach",Coach.class);
		
		boolean result =  coach1==coach2;
		
		System.out.println("Are coach equals: "+result);
		System.out.println("memory loaction of coach1: "+coach1);
		System.out.println("memory loaction of coach1: "+coach2);
		
		context.close();
	}

}
