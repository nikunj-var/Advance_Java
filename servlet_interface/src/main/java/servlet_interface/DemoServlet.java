package servlet_interface;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;


@WebServlet("/demo")
public class DemoServlet implements Servlet{
	
	public DemoServlet() {
		System.out.println("constructor method is called");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy method is called");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig method is called");

			return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo method is called");

		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init method is called");

		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service method is called");

		
	}

}
