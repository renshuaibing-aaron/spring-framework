package com.aaron.ren.ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("==============注解配置======================");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();

		context1.register(MyConfig.class);
		context1.refresh(); //这里的refersh是不是没有重复？



		BraveKnight knight1 = context1.getBean(BraveKnight.class);
		// knife
		System.out.println(knight1.getWeapon().getType());
		context1.close();
	}
}
