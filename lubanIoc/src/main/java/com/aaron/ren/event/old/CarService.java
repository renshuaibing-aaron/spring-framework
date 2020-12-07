package com.aaron.ren.event.old;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

public class CarService  implements ApplicationListener<OrderSuccessEvent> {
	@Override
	public void onApplicationEvent(OrderSuccessEvent event) {
		this.dispatch();
	}

	public void dispatch() {
		System.out.println("发车咯...");
	}
}