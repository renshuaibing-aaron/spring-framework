package com.aaron.ren.ioc.beanpostprocessorutils;

import org.springframework.stereotype.Service;

/**
 * @author renshuaibing
 * @version 1.0
 * @description: TODO
 * @date 2020/11/17 21:38
 */

@Service
public class HelloServiceImpl1 implements HelloService{
	@Override
	public void sayHello() {
		System.out.println("你好我是HelloServiceImpl1");
	}
}