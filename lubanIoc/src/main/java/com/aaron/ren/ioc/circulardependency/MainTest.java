package com.aaron.ren.ioc.circulardependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("==============注解配置======================");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();

		context1.register(MyConfig.class);
		context1.refresh(); //这里的refersh是不是没有重复？



		StudentA studentA = context1.getBean(StudentA.class);
		// knife
		System.out.println(studentA);
		context1.close();
	}
}
