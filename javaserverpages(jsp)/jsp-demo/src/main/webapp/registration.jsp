<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="create-account.jsp" method="post">
		<table style="margin: auto;">
			<tr>
				<td>
					<label>Enter userid</label>
				</td>
				<td>
					<input type="text" name="userid" required>
				</td>
			</tr>
			<tr>
				<td>
					<label>Enter username</label>
				</td>
				<td>
					<input type="text" name="username" required>
				</td>
			</tr>
			<tr>
				<td>
					<label>Enter password</label>
				</td>
				<td>
					<input type="password" name="password" required>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">Submit</button>
					<button type="reset">Cancel</button>
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>