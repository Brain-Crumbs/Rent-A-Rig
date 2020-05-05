<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>

<!-- BootStrap -->
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://use.fontawesome.com/c560c025cf.js"></script>



</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<header id="header"></header>
	<div class="mt-5">
		<h1>My Registration Form</h1>
		<form name="myForm" action="form" method="post">
			<input type="hidden" name="action" value="add">
			<div>
				<label for="firstName">First Name</label> 
				<input type="text"
					id="firstName" name="firstName" value="${user.firstName}">
			</div>
			<div>
				<label for="lastName">Last Name</label> 
				<input type="text"
					id="lastName" name="lastName" value="${user.lastName}">
			</div>
			<div>
				<label for="email">Email</label> 
				<input type="email"
					id="email" name="email" >
			</div>
			<div >
				<label for="password">Password</label> 
				<input type="password"
				 id="password" name="password">
			</div>
			

			<button type="submit">Submit</button>
		</form>
	</div>
	<a href="login.jsp">Sign In</a>
		<jsp:include page="footer.html"></jsp:include>
</body>
</html>