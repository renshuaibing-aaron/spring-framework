package com.aaron.ren.ioc.beanProcessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beanProcessor.xml");
		StudentEntity studentEntity = applicationContext.getBean(StudentEntity.class);
		System.out.println(studentEntity.getName());

	}
}
