

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/authenticate-user")
public class LoginServlet extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String uid = req.getParameter("userid");
		String password = req.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/servlet12","root","nikunj123");
			String q = "select * from user where uid = ?";
			PreparedStatement p = cn.prepareStatement(q);
			p.setString(1, uid);
			ResultSet rst = p.executeQuery();
			System.out.println("rst"+rst);
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<div style='text-align:center;'>");
			if(rst.next()) {
				String dbpassword = rst.getString(3);
				System.out.println(password);
				System.out.println(dbpassword);
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
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req,res);

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
