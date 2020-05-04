<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
</head>
<body>
	
	<div class="mt-5">
		<h1>Sign in to access your Rent-A-Rig account.</h1>
		<form name="myForm" action="signin" method="post">
			<input type="hidden" name="action" value="add">
			<div>
				<label for="email">Email Address</label> 
				<input type="email"
					id="email" name="email">
			</div>
			<div>
				<label for="password">Password</label> 	
				<input type="password"
					id="password" name="password">
			</div>

			<button type="submit">Sign in</button>
		</form>
	</div>

</body>
</html>