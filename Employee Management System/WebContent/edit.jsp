<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit form</title>
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
	height:400px;
	width:350px;
	padding:30px;
	margin-top:60px;
	background-color:darkgray;
}
h2{
	text-align:center;
	color:lemonchiffon;
	
}
#id,#name,#sal,#place{
	height:30px;
	border-radius:5px;
	border:none;
}
#submit{
		height:30px;
		border-radius:5px;
		border:none;
		background-color:green;
		color:white;
		font-size:1rem;
		cursor:pointer;
}
#back{
		height:30px;
		border-radius:5px;
		border:none;
		background-color:red;
		color:white;
		font-size:1.2rem;
}
#bck{
	text-decoration:none;
	color:white;
}
</style>
</head>
<body>
		<form action="edit" method="post" >
		<div id="form">
		<h2>Edit form</h2>

		 <input type="text" placeholder="Enter Id"  name="id"  id="id" required> <br> <br> 
		  <input type="text" placeholder="Enter name"  name="name" id="name"> <br> <br>
		 <input type="text" placeholder="Enter Salary"  name="sal" id="sal"> <br> <br>
		  <input type="text" placeholder="Enter Place"  name="place" id="place"> <br> <br>
		<input type="submit" value="Update details" id="submit"> <br>
		<button id="back"><a href="login.jsp" id="bck">back</a></button>
		
		</div>
		</form>
</body>
</html>