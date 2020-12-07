package com.aaron.ren.event.old;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 短信服务，监听OrderSuccessEvent
 */
public class SmsService implements ApplicationListener<OrderSuccessEvent> {

	@Override
	public void onApplicationEvent(OrderSuccessEvent event) {
		this.sendSms();
	}

	/**
	 * 发送短信
	 */
	public void sendSms(){
        System.out.println("发送短信...");
}
}