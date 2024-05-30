package userDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/create-account")
public class Register extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uid = req.getParameter("userid");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/servlet12","root","nikunj123");
			String query = "insert into user values(?,?,?)";
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setString(1,uid);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.executeUpdate();
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<div style='text-align:center'>");
			out.println("<h2 style='color:red; font-size:100px;'>"+username+" You have been registered successfully.</h2>");
			out.println("<a href='login.html'>Login</a>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	

}
