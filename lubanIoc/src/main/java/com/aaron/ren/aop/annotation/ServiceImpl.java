package com.aaron.ren.aop.annotation;

public class ServiceImpl implements Service {
	@Override
	public String hollo() {
		return "Hello,IOC";
	}
}