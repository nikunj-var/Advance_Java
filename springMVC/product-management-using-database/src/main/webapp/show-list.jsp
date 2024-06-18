<%@include file = "navbar.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body  onload = makeActive("list")>

<!-- Presentation Logic -->
<c:if test="${list == '[]' }">
	<div>
	<h1> No record found!</h1>
	</div>
	
</c:if>
<c:if test="${list != '[]' }">
	<div class="div">
		<h1>Product Details</h1>
	</div>
	<table class ="table tar" border="1" cellpadding="5px">
		<tr >
			<th>Product Id</th>
			<th>Name</th>
			<th>Brand</th>
			<th>Quantity</th>
			<th>Price</th>
			
		</tr>
	<c:forEach var="product" items="${list}">
		<tr>
		<td>${product.id}</td>
		<td>${product.name}</td>
		<td>${product.brand}</td>
		<td>${product.quantity}</td>
		<td>${product.price}</td>
		</tr>
	</c:forEach>
	</table>
	</c:if>
</body>
</html>
