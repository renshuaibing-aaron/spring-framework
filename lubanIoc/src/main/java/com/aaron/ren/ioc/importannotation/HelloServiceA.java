package com.aaron.ren.ioc.importannotation;

public class HelloServiceA implements HelloService {

	@Override
	public void doSomething() {
		System.out.println("Hello A");
	}

}
