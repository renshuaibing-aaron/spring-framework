package com.aaron.ren.ioc.jiexitag.bean;

public abstract class Display {

	public void display(){
		getCar().display();
	}

	public abstract Car getCar();

}