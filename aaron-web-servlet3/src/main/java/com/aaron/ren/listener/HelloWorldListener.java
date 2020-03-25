package com.aaron.ren.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloWorldListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		System.out.println("=======监听器初始化=============");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
