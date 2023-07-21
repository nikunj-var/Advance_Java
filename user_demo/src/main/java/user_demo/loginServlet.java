package user_demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/authenticate-user")
public class loginServlet extends  HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		String password = req.getParameter("password");
		String userid = req.getParameter("userid");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/servlet12","root","Nikunj@123");
			String query = "select * from user_info where userid = ?";
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setString(1,userid);
			ResultSet rst = ps.executeQuery();
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<div style='text-align:center'>");
				if(rst.next()) {
					String dbpassword = rst.getString(2);
					if(password.equals(dbpassword)) {
						res.sendRedirect("home.html");
						
					}
					else {
						out.println("<h2 style='color:red; font-size:50px;'>Your password is wrong.</h2>");
					}
				}
				else {
					out.println("<h2 style='color:red; font-size:50px;'>User does not exist</h2>");
				}
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher rd = req.getRequestDispatcher("login_form.html");
			rd.include(req,res);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
