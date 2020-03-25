package com.aaron.ren.ioc.threetypes.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springannnotation.xml");
		// 用我们的配置文件来启动一个 ApplicationContext

		System.out.println("context 启动成功");

		// 从 context 中取出我们的 Bean，而不是用 new PrototypeBean() 这种方式
		TestController testController = context.getBean(TestController.class);
		UserServiceImpl userServiceImpl = context.getBean(UserServiceImpl.class);
		System.out.println(testController);
		System.out.println(userServiceImpl);
		// 这句将输出: hello world
		testController.save();
	}

}
