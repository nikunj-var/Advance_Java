package com.cetpa;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/demo")
public class DemoServlet implements Servlet{

	public DemoServlet() {
		System.out.println("constructor is called");
	}

	@Override
	public void destroy() {
		System.out.println("Servlet is destroy");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig is called");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo is called");	
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init is called");		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service is called");		
	}
	

}
