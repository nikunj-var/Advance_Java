package servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/nik")
public class helloservlet extends HttpServlet{

//	this function is run by server
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String name = "Nikunj";
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Hello "+name+"</h2>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}
//	public void service(HttpServletRequest request,HttpServletResponse response)throws  {
//		
//	}
	
	
}
