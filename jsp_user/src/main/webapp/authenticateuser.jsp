<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<body>
<div style = 'text-align:center; margin-top:20px;'>
<%
String uid = request.getParameter("userid");
String password = request.getParameter("password");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/jsp12","root","Nikunj@123");

PreparedStatement ps1 = cn.prepareStatement("select * from user_info where userid = ?");
ps1.setString(1, uid);
ResultSet rst = ps1.executeQuery();

if(rst.next()){
	String dbpassword = rst.getString(2);
	if(password.equals(dbpassword)){
		response.sendRedirect("home.html");
	}
	else{
		%>		
		<h1>Password is wrong</h1>
		<jsp:include page="login_form.jsp"/>
		<% 
	}
}
else{
	%>
	<h1>Userid does not exist</h1>
	<jsp:include page="registration.jsp"/>
	<% 
}

%>
</div>
</body>
</html>