
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<form action="authenticateuser.jsp" method="post">
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
					<label>Enter password</label>
				</td>
				<td>
					<input type="password" name="password" required>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit">Submit</button>
					<a href="login_form.html">Login</a>
				</td>
			</tr>
		</table>
	</form>
	<div style="text-align: center; margin-top: 10px;">
		<a href="registration.jsp" style="font-size: 25px;">Create Account</a>
	</div>
</body>
</html>