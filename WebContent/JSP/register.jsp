<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register page</title>
</head>
<style>
#title{
	text-align: center;
}
.main{
	text-align:center;
	font-size:large;
	
}
.sub{
	border-style:solid;
	border-width:2px;
	height:500px;
	width:300px;
	border-radius:10px;
	
}

</style>
<body>
<div class="main">
<h2>Register here</h2>
</div>
<div class="sub">
	<form method="post" action="<%=request.getContextPath()%>/Employee">
		<table>
			<tr>
			<td>Name: </td>
			<td><input type = "text" name= "Uname"></td>
			</tr>
			<tr>
			<td>Address</td>
			<td><input type="text" name="Address"></td>
			</tr>
			<tr>
			<td>Email:</td>
			<td><input type="email" name="Email"></td>
			</tr>
			<tr>
			<td>Password</td>
			<td><input type="password" name="Password"></td>
			</tr>
			<tr>
			<td>Confirm Password</td>
			<td><input type="password" name="ConfirmPassword"></td>
			</tr>
			<tr>
			<td>Mobile Number</td>
			<td><input type="number" name="mobile"></td>
			</tr>
		</table>
	
	</form>

</div>

</body>
</html>