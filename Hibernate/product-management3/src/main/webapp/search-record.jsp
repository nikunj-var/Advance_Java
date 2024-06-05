<%@page import="com.cetpa.entities.ProductEntity"%>
<%@page import="com.cetpa.services.ProductService"%>
<html>
<body  onload = makeActive("search")>
	<%	
		int pid = Integer.parseInt(request.getParameter("pid"));
		ProductEntity product = ProductService.getProduct(pid);
		
		if(product != null){
			%>
			<%@include file = "navbar.jsp"%>
			<table class='table' border='1' style="border-collapse:collapse;">
			<tr >
				<td class='tabledata'>Product id : </td>
				<td class='tabledata'>				
					<label><%=product.getPid() %></label>
				</td>
			</tr>
			<tr >
				<td class='tabledata'>Product name : </td>
				<td class='tabledata'><label><%=product.getName() %></label></td>
			</tr>
			<tr >
				<td class='tabledata'>Product brand : </td>
				<td class='tabledata'><label><%=product.getBrand() %></label></td>
			</tr>
			<tr >
				<td class='tabledata'>Product price : </td>
				<td class='tabledata'><label><%=product.getPrice() %></label></td>
				</td>
			</tr>
			<tr>
					<td colspan = '2' align='right'>
					<a href='search.jsp'> <button class='button'" type="submit">Back</button></a> 
				</td>

			</tr>
			
		</table>
			<% 
		}
		else{
			%>
			<div class="div">
			<h4>Product record with id <%=pid %> does not exist</h4>
			</div>
			
			<jsp:include page="search.jsp"/>
			<% 

		}
	%>
	
</body>
</html>
