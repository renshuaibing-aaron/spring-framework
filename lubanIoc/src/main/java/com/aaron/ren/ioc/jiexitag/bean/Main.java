package com.aaron.ren.ioc.jiexitag.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springtag.xml");
		Display display = (Display) context.getBean("display");
		display.display();
	}

}
