package com.aaron.ren.ioc.importannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("==============注解配置======================");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();

		//需要注册配置类
		context1.register(HelloConfiguration.class);
		context1.refresh(); //这里的refersh是不是没有重复？


		HelloService bean = context1.getBean(HelloService.class);
		bean.doSomething();
		// knife
		context1.close();
	}
}