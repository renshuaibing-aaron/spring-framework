package com.aaron.ren.lifeciyle;

/**
 * 大腿
 */
public class Leg {


	private String name="我是大腿";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("【注入属性】name");
		this.name = name;
	}
}
