package com.aaron.ren;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import java.io.File;

public class Application {
	public static void main(String[] args) throws LifecycleException, ServletException {

		AnnotationConfigWebApplicationContext contest = new AnnotationConfigWebApplicationContext();
		contest.register(Appconfig.class);
		contest.refresh();


		System.out.println("===wevb=============");


		File base = new File(System.getProperty("java.io.tmpdir"));


		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);

        //这个地方代表这个是web项目，需要加载jspservlet解析器？
		tomcat.addWebapp("/","");

		Context rootCtx = tomcat.addContext("/", base.getAbsolutePath());
		DispatcherServlet dispatcher = new DispatcherServlet(contest);


		//tomcat启动会调用DispatcherServlet#init

		//说明DispatcherServlet#init 这个方法 同样会加载refresh()这个方法，注意和上面的区别(说明spingmvc容器和IOC容器的区别)
		Tomcat.addServlet(rootCtx, "aaron", dispatcher).setLoadOnStartup(0);

		rootCtx.addServletMapping("/", "aaron");

		System.out.println("======tomcat启动==========");
		tomcat.start();
		tomcat.getServer().await();


	}
}
