package com.aaron.ren.aop.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestAOP {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("demo-aop.xml");
		TestTarget target = (TestTarget) context.getBean("testAOP");
		target.test();
		System.out.println("----------------");
		target.test2();
	}

}
