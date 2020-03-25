package com.aaron.ren.bean;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author renshuaibing
 */
public class HelloWorldFilter implements bean {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
		System.out.println("触发 hello world 过滤器...");
		filterChain.doFilter(servletRequest,servletResponse);
	}

	@Override
	public void destroy() {

	}
}