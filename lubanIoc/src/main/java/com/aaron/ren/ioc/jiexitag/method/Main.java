package com.aaron.ren.ioc.jiexitag.method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springmethod.xml");
		Method method = (Method) context.getBean("method");
		method.display();
	}
}
