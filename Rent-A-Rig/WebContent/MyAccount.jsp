<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>My Account</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


<link href="css/mainStyles.css" rel="stylesheet" type="text/css">
<link href="css/ContactInfoStyle.css" rel="stylesheet" type="text/css">
<script src="js/Rent-A-Rig.js"></script>
</head>
<body>
	<div class="myNav">
		<nav id="navbar"></nav>
	</div>
	<header id="header"></header>
	<!--Navigation Section-->
	<div class="container-fluid headofpage">
		<br> <br>
		<header class="col-lg-12 col-med-8 col-sm-6 col-xs-4 headspace">
			<h1>My Account</h1>
		</header>
	</div>
	<hr>
	<div class="container myOptions">
		<p id="quicklinks">Quick Links:</p>
		<div class="row myRow1">
			<div class="col-med-4 col-sm-6 col-lg-3 myCol">
				<p>
					<a href="OrderHistory.html">Order History</a>
				</p>
			</div>
			<div class="col-med-4 col-sm-6 col-lg-3 myCol">
				<a href="WishList.html">Save For Later</a>
			</div>
		</div>
	</div>
	<hr>
	<div class="container-fluid myContainer">
		<div class="row myRow">
			<div class="col-lg-6 myCol">
				<p>
					<strong>Name:</strong>
				</p>
			</div>
			<div class="col-lg-6 myCol">
				<p>${cookie.firstNameCookie.value}</p>
			</div>
		</div>
	</div>
	<div class="row myRow">
		<div class="col-lg-6 myCol">
			<p>
				<strong>Last Name: </strong>
			</p>
		</div>
		<div class="col-lg-6 myCol">
			<p>${cookie.lastNameCookie.value}</p>
		</div>
	</div>
	</div>
	<div class="row myRow">
		<div class="col-lg-6 myCol">
			<p>
				<strong>Email: </strong>
			</p>
		</div>
		<div class="col-lg-6 myCol">
			<p>${cookie.emailCookie.value}</p>
		</div>
	</div>
	<div class="row myRow">
		<div class="col-lg-6 myCol">
			<p>
				<strong>Account Number: </strong>
			</p>
		</div>
		<div class="col-lg-6 myCol">
			<p>123456789</p>
		</div>
	</div>
	<div class="col-med-4 col-sm-6 col-lg-3 myCol">
		<p>
			<a href="NewContact.html">Update Contact Info</a>
		</p>
	</div>
	<form name="logout" action="form" method="post">
		<input type="hidden" name="buttonName"> 
		<div>
			<button type="submit"><a href="index.jsp">Log Out</button>
		</div>
	</form>
	</div>
	<hr>
	<br>
	<div class="container-fluid MApreferences">
		<p>
			Select Your Preferred method of contact: <select name="Preferences:">
				<option value="Email">Email</option>
				<option value="Phone Call">Phone Call</option>
				<option value="snail mail">Snail Mail</option>
			</select> Preferred time of day: <select name="Time of Day">
				<option value="morning">Morning (8am - 12noon)</option>
				<option value="afternoon">Afternoon (12noon - 5pm)</option>
				<option value="evening">Evening (5pm - 10pm)</option>
			</select>
		</p>
	</div>
	<hr>
	<footer id="footer"> </footer>
	<!--Includes contact info and feedback link-->
</body>
</html>