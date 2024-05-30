

import java.io.IOException;
import java.io.PrintWriter;

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
		String name = req.getParameter("username");
		String password = req.getParameter("password");
		if(name.equals("nikunj") && password.equals("123456")) {
			res.sendRedirect("home.html");
		}
		else {
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<div style='text-align:center'>");
			out.println("<h2 style='color:red; font-size:100px;'>Authentication failed</h2>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
	}

}
