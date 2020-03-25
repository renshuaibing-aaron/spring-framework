package com.aaron.ren.ioc.circulardependency.xmltype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springcircal.xml");

		System.out.println(context.getBean("personA"));
	}
}
