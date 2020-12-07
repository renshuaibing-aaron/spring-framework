package com.aaron.ren.ioc.jiexitag.method;

import org.springframework.beans.factory.support.MethodReplacer;

public class MethodReplace implements MethodReplacer {

	//@Override
	/*public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

	}*/

	@Override
	public Object reimplement(Object obj, java.lang.reflect.Method method, Object[] args) throws Throwable {
		System.out.println("我是替换方法");
		return null;
	}
}