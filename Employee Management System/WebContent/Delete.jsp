
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body{
	margin:0;
	padding:0;
	
}
#del{
	display:flex;
	flex-direction:column;
	margin:auto;
	height:300px;
	width:350px;
	padding:30px;
	margin-top:60px;
	border-radius:10px;
	border:1px solid lightgrey;
	background-color:whitesmoke;
}
h2{
	text-align:center;
	
}
#id{
	height:30px;
	border-radius:10px;
	border:none;
}
#submit{
		height:30px;
		border-radius:7px;
		border:none;
		background-color:red;
		color:white;
		font-size:1.3rem;
		width:100px;
		position:relative;
		left:120px;
		bottom:20px;
		cursor: pointer;
}
#home{
		height:30px;
		border-radius:10px;
		border:none;
		background-color:green;
		font-size:1rem;
		width:100px;
		position:relative;
		left:120px;
		bottom:10px;
}
#home1{
text-decoration:none;
color:white;
}



</style>
</head>
<body>
<form action="delete" method="post">
		<div id="del">
		<h2>Do you really wish to delete?</h2>
	 	<input type="text" placeholder="Enter your id" name="id" id="id"> <br> <br>  
		<input type="submit" value="Delete" name="id" id="submit">
		<h2>Please press home key to back</h2>
		<button name="id" id="home"> <a id="home1" href="login.jsp">Home</a></button>
		</div>
		
</form>


	
</body>
</html>