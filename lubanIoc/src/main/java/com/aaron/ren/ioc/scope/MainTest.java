package com.aaron.ren.ioc.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("springscope.xml");
		// 用我们的配置文件来启动一个 ApplicationContext

		System.out.println("context 启动成功");

		// 从 context 中取出我们的 Bean，而不是用 new PrototypeBean() 这种方式
		SingletonBean singletonBean0 = context.getBean(SingletonBean.class);
		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);

		PrototypeBean prototypeBean0 = context.getBean(PrototypeBean.class);
		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);



		System.out.println(singletonBean0.equals(singletonBean1));
		System.out.println(prototypeBean0.equals(prototypeBean1));

	}

}
