package com.aaron.ren.aop.demo;


import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.PointcutAdvisor;

/**
 * 通知器
 */
public class TestAdvisor implements PointcutAdvisor {

	/**
	 * 获取通知处理逻辑
	 */
	@Override
	public Advice getAdvice() {
		return new TestAfterAdvice();
	}

	@Override
	public boolean isPerInstance() {
		return false;
	}

	/**
	 * 获取切入点
	 */
	@Override
	public Pointcut getPointcut() {
		return new TestPointcut();
	}

}
