package com.aaron.ren.ioc.beanfactoryandfactorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author renshuaibing
 */
public class MainTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car car = (Car) context.getBean("car");
		System.out.println("==========" + car);
		context.close();
	}
}
