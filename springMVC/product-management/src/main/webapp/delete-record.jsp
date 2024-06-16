<%@ include file = "navbar.jsp"%>
<html>
	<body >
	<form action = "delete" method = "post">
		<table class='table'>
			<tr >
				<td class='tabledata'>Enter product id</td>
				<td class='tabledata'>
					<input type="text" class="textbox" id = "id" name="id"><br>
					<span id="spanid"></span>
				</td>
			</tr>
			
			<tr>
				<td colspan = '2' align='right'>
					<button class='button'>Delete</button>
				</td>
			</tr>
		</table>
	</form>
		
	</body>
</html>