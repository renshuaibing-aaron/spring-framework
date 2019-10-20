package com.aaron.ren.ioc.beanfactorypostprocessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStrap {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "beanfactorypostprocessor.xml");

		System.out.println(context.getBean("myTestBean") +  "--" + ((MyTestBean)context.getBean("myTestBean")).getName());

	}
}
