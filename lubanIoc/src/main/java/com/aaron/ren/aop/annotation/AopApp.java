package com.aaron.ren.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopApp {
	public static void main (String args[]){

		ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

		Service iocService=context.getBean(Service.class);


		System.out.println(iocService.hollo());
	}
}