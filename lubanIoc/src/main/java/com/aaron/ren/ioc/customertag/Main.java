package com.aaron.ren.ioc.customertag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("springcustomertag.xml");
		User user = (User) context.getBean("user");
		System.out.println(user.getUserName() + "----" + user.getEmail());
	}
}
