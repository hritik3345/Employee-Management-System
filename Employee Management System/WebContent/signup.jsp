<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign-up page</title>
<style>
body{
	margin:0;
	padding:0;
	background-color:whitesmoke;
}
#form{
	display:flex;
	flex-direction:column;
	margin:auto;
	height:300px;
	width:350px;
	padding:30px;
	margin-top:60px;
	background-color:aliceblue;
	border:1px solid lightrey;
	border-radius:10px;
}
h2{
	text-align:center;
	color:lemonchiffon;
	
}
#id,#name,#sal,#place{
	height:80px;
	border-radius:5px;
	border:none;
}
#submit{
		height:45px;
		border-radius:10px;
		border:none;
		background-color:green;
		color:white;
		font-size:1.2rem;
		cursor:pointer;
}
#back{
		height:30px;
		border-radius:10px;
		border:none;
		background-color:blueviolet;
		color:white;
		font-size:1.2rem;
		cursor:pointer;
		
}
h1{
	text-align:center;
	font-size:2rem;
	color:brown;
}
#bck{
	text-decoration:none;
	color:white;
}
</style>
</head>
<body>
	<form action="insert" method="post">
	<h1>Sign-up page</h1>
		<div id="form">
		 <input type="text" placeholder="Enter Id"  name="id"  id="id" required> <br> <br> 
		  <input type="text" placeholder="Enter Name"  name="name" id="name" required> <br> <br>
		  <input type="text" placeholder="Enter Salary"  name="sal" id="sal" required> <br> <br>
		  <input type="text" placeholder="Enter Place"  name="place" id="place" required> <br> <br>
		<input type="submit" value="Register" id="submit"> <br> 
		<button id="back"><a id="bck" href="login.jsp"> back</a></button>
		</div>
		</form>
</body>
</html>
