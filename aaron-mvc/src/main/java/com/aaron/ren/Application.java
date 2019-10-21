package com.aaron.ren;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

public class Application {
	public static void main(String[] args) throws LifecycleException {

		AnnotationConfigWebApplicationContext contest = new AnnotationConfigWebApplicationContext();
		contest.register(Appconfig.class);
		contest.refresh();


		System.out.println("===wevb=============");


		File base = new File(System.getProperty("java.io.tmpdir"));


		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);

		Context rootCtx = tomcat.addContext("/", base.getAbsolutePath());
		DispatcherServlet dispatcher = new DispatcherServlet(contest);


		//tomcat启动会调用DispatcherServlet#init
		Tomcat.addServlet(rootCtx, "aaron", dispatcher).setLoadOnStartup(0);

		rootCtx.addServletMapping("/", "aaron");

		System.out.println("======tomcat启动==========");
		tomcat.start();
		tomcat.getServer().await();


	}
}
