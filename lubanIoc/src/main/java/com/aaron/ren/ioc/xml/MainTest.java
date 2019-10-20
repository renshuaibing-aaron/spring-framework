package com.aaron.ren.ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// 用我们的配置文件来启动一个 ApplicationContext

		System.out.println("context 启动成功");

		// 从 context 中取出我们的 Bean，而不是用 new MessageServiceImpl() 这种方式
		MessageService messageService = context.getBean(MessageService.class);
		System.out.println(context.getBean("messageService"));
		// 这句将输出: hello world
		System.out.println(messageService.getMessage());

	}

}
