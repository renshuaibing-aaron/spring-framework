package com.aaron.ren.ioc.circulardependency.xmltype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("springcircal.xml");

		System.out.println("=================="+context);
		PersonA personA = (PersonA) context.getBean("personA");
		System.out.println(personA.getPersonB());
		//这里并没有注入啊
		System.out.println(personA.getPersonB().getPersonA());
	}
}
