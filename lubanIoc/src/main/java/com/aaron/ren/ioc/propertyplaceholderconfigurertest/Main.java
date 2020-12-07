package com.aaron.ren.ioc.propertyplaceholderconfigurertest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		//在 idea 的 VM options 里面增加 -Dspring.profiles.active=dev，标志当前环境为 dev 环境
		ApplicationContext context = new ClassPathXmlApplicationContext("propertyplaceholderconfigurertest.xml");

		StudentService studentService = (StudentService) context.getBean("studentService");
		System.out.println("student name:" + studentService.getName());

	}

}
