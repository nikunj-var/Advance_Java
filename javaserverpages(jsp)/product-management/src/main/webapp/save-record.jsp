<%@ include file="nav.jsp" %>
<%@ include file="connection.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 	String pid = request.getParameter("id");
		String name = request.getParameter("name");
		String brand = request.getParameter("brand");
		String quantity = request.getParameter("quantity");
		String price = request.getParameter("price");
		String query = "insert into product values(?,?,?,?,?)";
		PreparedStatement ps = cn.prepareStatement(query);
		ps.setString(1,pid);
		ps.setString(2,name);
		ps.setString(3,brand);
		ps.setString(4,quantity);
		ps.setString(5,price);
		ps.executeUpdate();
	%>
	<h2 style="text-align:center">Product record has been added successfully</h2>
</body>
</html>