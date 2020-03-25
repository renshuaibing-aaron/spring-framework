package com.aaron.ren.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String message;

	@Override
	public void init() throws ServletException
	{
		System.out.println("触发 HelloWorldServlet  初始化...");
		// 执行必需的初始化
		message = "Hello World";
	}

	@Override
	public void doGet(HttpServletRequest request,
					  HttpServletResponse response)
			throws ServletException, IOException
	{
		// 设置响应内容类型
		response.setContentType("text/html");

		// 实际的逻辑是在这里
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	@Override
	public void destroy()
	{
		// 什么也不做
	}
}
