
<html>
<body  onload = makeActive("search")>

			<%@include file = "navbar.jsp"%>
			<table class='table' border='1' style="border-collapse:collapse;">
			<tr >
				<td class='tabledata'>Product id : </td>
				<td class='tabledata'>				
					<label>${product.id }</label>
				</td>
			</tr>
			<tr >
				<td class='tabledata'>Product name : </td>
				<td class='tabledata'><label>${product.name }</label></td>
			</tr>
			<tr >
				<td class='tabledata'>Product brand : </td>
				<td class='tabledata'><label>${product.brand }</label></td>
			</tr>
			<tr >
				<td class='tabledata'>Product quantity : </td>
				<td class='tabledata'><label>${product.quantity }</label></td>
			</tr>
			<tr >
				<td class='tabledata'>Product price : </td>
				<td class='tabledata'><label>${product.price }</label></td>
				</td>
			</tr>
			<tr>
					<td colspan = '2' align='right'>
					<a href='search.jsp'> <button class='button' type="submit">Back</button></a> 
				</td>

			</tr>
			
		</table>
	
</body>
</html>
