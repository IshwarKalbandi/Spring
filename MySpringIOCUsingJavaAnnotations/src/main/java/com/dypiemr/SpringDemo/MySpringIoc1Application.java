package com.dypiemr.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class MySpringIoc1Application {

	public static void main(String[] args) {
		//SpringApplication.run(MySpringIoc1Application.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		 
		Coach thecoach = context.getBean("cricketCoach", Coach.class);
		System.out.println(thecoach.getDailyworkout());
		context.close();
	}

}
