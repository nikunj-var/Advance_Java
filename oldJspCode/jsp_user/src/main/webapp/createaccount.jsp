<%@page import = "java.sql.*" %>
 
<html>
<body>
<div style="text-align:center; margin-top:20px"> 
<%

Class.forName("com.mysql.cj.jdbc.Driver");
Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/jsp12","root","Nikunj@123");
String uid = request.getParameter("userid");
/* to check duplicacy */
PreparedStatement ps1 = cn.prepareStatement("select * from user_info where userid = ?");
ps1.setString(1, uid);
ResultSet rst = ps1.executeQuery();
if(rst.next()){
	%>
	<h2>Taken user id already exists.</h2>
	<jsp:include page="registration.jsp"/>
	<% 
	return;
}
String password = request.getParameter("password");
String username = request.getParameter("username");

String query = "insert into user_info values(?,?,?)";
PreparedStatement ps = cn.prepareStatement(query);
ps.setString(1,uid);
ps.setString(2, password);
ps.setString(3, username);
ps.executeUpdate();
%>

 	<h2><%=username %> have been registered successfully</h2>
 	<a href="login_form.jsp">Click to login</a>
</div>
</body>
</html>