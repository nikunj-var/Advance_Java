<%@page import="java.sql.*"%>
<html>
<body>
<div style="text-align:center; margin-top:20px"> 
<%
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/jspuser","root","nikunj123");

	String uid = request.getParameter("userid");
	
	String checkquery = "select * from jspuser where uid = ?";
	PreparedStatement ps1 = cn.prepareStatement(checkquery);
	
	ps1.setString(1,uid);
	ResultSet rs = ps1.executeQuery();
	
	if(rs.next()){
		%>
		<h2 style='color:red'>User id already exists.</h2>
		
		<!-- use instead of Request Dispatcher -->
		<jsp:include page="registration.jsp"/>  
		
		<% 
		return;
	}
	
	String password = request.getParameter("password");
	String username = request.getParameter("username");
	
	String query = "insert into jspuser values(?,?,?)";
	PreparedStatement ps2 = cn.prepareStatement(query);
	ps2.setString(1,uid);
	ps2.setString(2, username);
	ps2.setString(3, password);
	ps2.executeUpdate();
 %>
			<h2><%=username %>you have been registered successfully </h2>
			<a href="login.jsp">CLick to login</a>
		</div>
	</body>
</html>