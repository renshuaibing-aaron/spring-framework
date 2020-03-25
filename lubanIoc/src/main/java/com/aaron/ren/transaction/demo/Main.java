package com.aaron.ren.transaction.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		// aop()对userService类进行了拦截,添加自定义事务注解的方法会触发事务逻辑
		userService.add();
		// del()方法没有加注解，则什么也不会触发。
		//userService.del();
	}
}