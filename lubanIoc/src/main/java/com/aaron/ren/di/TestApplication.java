package com.aaron.ren.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import({ServiceA.class, ConfigurationA.class, BeanB.class})
public class TestApplication {
	public static void main(String[] args) {
		System.out.println("==============注解配置======================");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();

		//需要注册配置类
		context1.register(ConfigurationA.class);
		context1.refresh(); //这里的refersh是不是没有重复？

	}
}