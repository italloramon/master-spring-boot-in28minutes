package com.italloramon.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ExerciseApplication {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ExerciseApplication.class);
		var business = (BusinessCalculationService) context.getBean("businessCalculationService");
		System.out.println(business.findMax());
	}

}
