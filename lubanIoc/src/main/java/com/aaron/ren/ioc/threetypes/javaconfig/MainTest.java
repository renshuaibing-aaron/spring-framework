package com.aaron.ren.ioc.threetypes.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("==============注解配置======================");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();

		//需要注册配置类
		context1.register(MyConfig.class);
		context1.refresh(); //这里的refersh是不是没有重复？



		Person person = context1.getBean(Person.class);
		// knife
		System.out.println(person.getCar());
		context1.close();
	}
}
