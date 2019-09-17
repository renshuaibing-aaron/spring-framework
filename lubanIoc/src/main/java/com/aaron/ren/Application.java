package com.aaron.ren;

import com.aaron.ren.bean.annotation.BraveKnight;
import com.aaron.ren.bean.annotation.MyConfig;
import com.aaron.ren.bean.xml.BraveKnightXml;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {


		springClassPathXml();


		//springAnnotationConfig();

	}

	private static void springClassPathXml() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		BraveKnightXml knight = context.getBean(BraveKnightXml.class);
		// knife
		System.out.println(knight.getWeaponXml().getType());
		context.close();
	}

	private static void springAnnotationConfig() {
		System.out.println("==============注解配置======================");
		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext();
		context1.register(MyConfig.class);
		context1.refresh();
		BraveKnight knight1 = context1.getBean(BraveKnight.class);
		// knife
		System.out.println(knight1.getWeapon().getType());
		context1.close();
	}
}
