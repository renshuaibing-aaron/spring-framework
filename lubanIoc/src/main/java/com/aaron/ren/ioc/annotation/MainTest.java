package com.aaron.ren.ioc.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("==============注解配置======================");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(MyConfig.class);


		BraveKnight knight1 = context1.getBean(BraveKnight.class);
		// knife
		System.out.println(knight1.getWeapon().getType());
		context1.close();
	}
}
