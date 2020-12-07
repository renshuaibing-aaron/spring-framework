package com.aaron.ren.event.old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


public class OrderService {

	@Autowired
	private ApplicationContext applicationContext;

	public void order() {
		// 下单成功
		System.out.println("下单成功...");
		// 发布通知
		applicationContext.publishEvent(new OrderSuccessEvent(this));
		System.out.println("main线程结束...");
	}
}