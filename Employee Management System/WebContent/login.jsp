<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="css/bootstrap.css"></link>
<style >
body{
	margin:0;
	padding:0;
	
}
#login{
	display:flex;
	flex-direction:column;
	margin:auto;
	height:250px;
	width:350px;
	padding:30px;
	margin-top:60px;
	background-color:aliceblue;
	border:1px solid lightgray;
	border-radius:10px;
}
#frm{
	display:flex;
	height:80vh;
	justify-content:center;
	align-items:center;
	}
#id{
	height:30px;
	border:none;
	border-radius:5px;
	background-color:aliceblue;
	font:white;
}
#id:hover{
	border:1px solid blue;
}
#submit{
	height:30px;
	border-radius:10px;
	background-color:indigo;
	color:white;
	text-align:center;
	border:none;
	position:relative;
	bottom:30px;
	
}
#signup{
	border:none;
	background-color:green;
	height:30px;
	border-radius:10px;
	position:relative;
	bottom:5px;

}

h1{
	color:purple;
	height:10vh;
}
h5{
	color:red;
}
#sup{
	text-decoration:none;
	color:white;
}

</style>
</head>
<body >
	 <h1> <marquee behavior="scroll" direction="right">Login Page</marquee> </h1> 
	<form action="Output" method="post" id="frm">
	<div id="login">
	
	<input type="text" placeholder="Enter Your ID" name="id" id="id"  > <br> <br> <br>
	<input type="submit" value="Submit" id="submit"> 
		<h5>new user? </h5>
		<button id="signup" >
		<a href="signup.jsp" id="sup">Sign up</a></button>
		</div>
		
	</form>

</body>
</html>