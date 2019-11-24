package com.aaron.ren.ioc.importbeandefinitionregistrar;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("==============注解配置======================");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();

		context1.register(MyConfig.class);
		context1.refresh(); //这里的refersh是不是没有重复？



		Dao service = context1.getBean(Dao.class);
		// knife
		System.out.println(service.getClass());
		context1.close();
	}
}
