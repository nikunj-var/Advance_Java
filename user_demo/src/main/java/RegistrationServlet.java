

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/create-account")
public class RegistrationServlet extends  HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		String uid = req.getParameter("userid");
		String password = req.getParameter("password");
		String username = req.getParameter("username");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/servlet12","root","Nikunj@123");
			String query = "insert into user_info values(?,?,?)";
			PreparedStatement ps = cn.prepareStatement(query);
			ps.setString(1,uid);
			ps.setString(2, password);
			ps.setString(3, username);
			ps.executeUpdate();
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<div style='text-align:center'>");
			out.println("<h2 style='color:red; font-size:100px;'>"+username+" You have been registered successfully.</h2>");
			out.println("<a href='login_form.html'>Login</a>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
