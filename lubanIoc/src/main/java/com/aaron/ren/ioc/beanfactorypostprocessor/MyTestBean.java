package com.aaron.ren.ioc.beanfactorypostprocessor;

public class MyTestBean {

	public void setName(String name) {
		this.name = name;
	}

	private String name="李海";

	public String getName() {
		return name;
	}

}