package com.aaron.ren.event.old;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		System.out.println("========【context 开始启动】===========");
		ApplicationContext context = new ClassPathXmlApplicationContext("springevent.xml");
		// 用我们的配置文件来启动一个 ApplicationContext
		System.out.println("========【context 启动成功 准备获取getBean 】===========");

		// 从 context 中取出我们的 Bean，而不是用 new PrototypeBean() 这种方式
		OrderService orderService = context.getBean(OrderService.class);
		orderService.order();

		// 这句将输出: hello world

	}
}
