<%@page import="java.sql.*" %>
<html>
<body>
<% 	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/jspuser","root","nikunj123");
	String uid = request.getParameter("userid");
	String query = "select * from jspuser where uid = ?";
	PreparedStatement ps = cn.prepareStatement(query); 
	ps.setString(1,uid);
	ResultSet rst = ps.executeQuery();
	if(rst.next()){
		String password = request.getParameter("password");
		String dbpassword = rst.getString(3);
		if(password.equals(dbpassword)){
			%>
			<jsp:include page= "home.jsp"/>
			<% 
			return;
		}
		%>
		<h2>Password is not correct!</h2>
		<jsp:include page="login.jsp"/>
		<% 
	}
	else{
		%>
		<h2>User does not exists! Try again.</h2>
		<jsp:include page="login.jsp"/>
		<% 
	}
%>
</body>
</html>