package com.aaron.ren.aop.aopproblem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//BeanDefination的解析注册，代理对象的生成
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop-problem.xml");

		System.out.println("====加载完毕====获取bean======");
		//可以看到userDao类型是以$Proxy开头的，说明是通过JDK动态代理的方式获取的
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");

		System.out.println(userDao.getClass());
		//增强行为发生的时刻
		System.out.println("====执行方法======");
		userDao.deleteUser();

	}
}
