package com.italloramon.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		// 1 - Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

		// 2 - Get Beans managed by Spring
		System.out.println(context.getBean("myName"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3Parameters"));
	}

}
