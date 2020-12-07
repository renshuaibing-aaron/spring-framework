package com.aaron.ren.event.anno;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

public class CarService   {
	@EventListener(OrderSuccessEvent.class)
	public void sendSms() {

		try {
			Thread.sleep(1000L * 5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("发送短信..."+Thread.currentThread().getName());
	}
}