<%@ include file = "navbar.jsp"%>


<html>
	<body>
	<form action = "search-record" method = "post">
		<table class='table'>
			<tr >
				<td class='tabledata'>Enter product id</td>
				<td class='tabledata'>
					<input type="text" class="textbox" id = "id" name="id" onblur=checkvalue(this)><br>
					<span id="spanid"></span>
				</td>
			</tr>
			
			<tr>
				<td colspan = '2' align='right'>
					<button class='button'>Search</button>
				</td>
			</tr>
		</table>
		<div class="div">
		<h2>${msg}</h2>
		</div>
	</form>
		
	</body>
</html>