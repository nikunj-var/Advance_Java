<%@include file = "navbar.jsp"%>
<%@page import="java.util.List"%>
<%@page import="com.cetpa.entities.ProductEntity"%>
<%@page import="com.cetpa.services.ProductService"%>
<html>
<body  onload = makeActive("list")>
	
	<div class="div">
		<h1>Product Details</h1>
	</div>
	<table class ="table tar" border="1" cellpadding="5px">
		<tr >
			<th>Product Id</th>
			<th>Name</th>
			<th>Brand</th>
			<th>Price</th>
			<!-- <th style="color:grey;">Action</th> -->
		</tr>
		<%
			List<ProductEntity> list = ProductService.showRecord(); 
			for(ProductEntity rst : list){
				%>
				<tr>

					<td><%=rst.getPid() %></td>
					<td><%=rst.getName() %></td>
					<td><%=rst.getBrand() %></td>
					<td><%=rst.getPrice() %></td>
					<%-- <td><a href="edit.jsp?pid=<%=pid%>">Edit |</a> 
					<!-- url rewriting -->
					<a href="delete.jsp?pid=<%= pid %>" onclick="return confirm('Are you sure to delete this record?')">Delete</a></td>
					  --%>
				</tr>
				<% 
			}
		%>
	</table>
	
</body>
</html>
