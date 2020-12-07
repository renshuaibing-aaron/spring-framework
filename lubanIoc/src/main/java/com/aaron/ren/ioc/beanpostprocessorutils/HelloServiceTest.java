package com.aaron.ren.ioc.beanpostprocessorutils;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author renshuaibing
 * @version 1.0
 * @description: TODO
 * @date 2020/11/17 21:40
 */

@Component
public class HelloServiceTest {

	@RountingInjected(value = "helloServiceImpl2")
	private HelloService helloService;

	public void testSayHello() {
		helloService.sayHello();
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.aaron.ren.ioc.beanpostprocessorutils");
		HelloServiceTest helloServiceTest = applicationContext.getBean(HelloServiceTest.class);
		helloServiceTest.testSayHello();
	}

}