<%@page import="com.cetpa.entities.ProductEntity"%>
<%@page import="com.cetpa.services.ProductService"%>
<html>
<body  onload = makeActive("save")>
	<%
	
		int pid = Integer.parseInt(request.getParameter("pid"));
		ProductEntity product = ProductService.getProduct(pid);
		ProductService.deleteRecord(product);
	%>
	<div class="div">
	<jsp:include page="show-list.jsp"/>
		<h4>Product record with id <%=pid %> has been deleted successfully</h4>
		
	</div>
	<%-- <% 
		response.sendRedirect("show-list.jsp");
		% --%>>

	
</body>
</html>
