
<%@page import = "java.sql.*" %>

<% 
Class.forName("com.mysql.cj.jdbc.Driver");
Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/product","root","nikunj123");
%>
