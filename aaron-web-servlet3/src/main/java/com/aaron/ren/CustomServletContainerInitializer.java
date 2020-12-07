package com.aaron.ren;

import com.aaron.ren.filter.HelloWorldFilter;
import com.aaron.ren.servlet.HelloWorldServlet;

import javax.servlet.*;
import java.util.EnumSet;
import java.util.Set;

/**
 * 这里的web容器怎么识别这个类 用到SPI机制
 * @author renshuaibing
 */
public class CustomServletContainerInitializer implements ServletContainerInitializer {

	private final static String JAR_HELLO_URL = "/hello";

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext servletContext) {

		System.out.println("创建 helloWorldServlet...");

		ServletRegistration.Dynamic servlet = servletContext.addServlet(
				HelloWorldServlet.class.getSimpleName(),
				HelloWorldServlet.class);
		servlet.addMapping(JAR_HELLO_URL);

		System.out.println("创建 helloWorldFilter...");

		FilterRegistration.Dynamic bean = servletContext.addFilter(
				HelloWorldFilter.class.getSimpleName(), HelloWorldFilter.class);
		EnumSet<DispatcherType> dispatcherTypes = EnumSet.allOf(DispatcherType.class);
		dispatcherTypes.add(DispatcherType.REQUEST);
		dispatcherTypes.add(DispatcherType.FORWARD);
		bean.addMappingForUrlPatterns(dispatcherTypes, true, JAR_HELLO_URL);
	}

}