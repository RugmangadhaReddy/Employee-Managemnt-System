<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management System</title>
<style>

body, html {
  /* The image used */
  background-image: url("Images/office.jpg");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  background-attachment: fixed;
}
.main
{

text-align:center;
}
#title
{
	text-align: center;
}

.sub
{

	position: absolute;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
	text-align: center;
	display: inline-block;
	height: 300px;
	width: 500px;
	border-width: 3px;
	border-color: black;
	border-style:solid;
	border-radius:25px;
	margin: auto;
}
form
{

display: inline-block;

}
#button1
{
	border-width:2px;
	border-color:black;
	border-style:solid;
	width:80px;
	height:30px;
	text-allign:center;
}

#button2
{
	border-width:2px;
	border-color:black;
	border-style:solid;
	width:80px;
	height:30px;
	text-allign:center;
}
#Uname
{
	border-width:2px;
	border-color:black;
	border-style:solid;
}
#password
{
	border-width:2px;
	border-color:black;
	border-style:solid;
}
a{
	font-style:oblique;
	float:left;
}
#UnameLabel
{
	font-weight: bold;
}
#PwdLabel
{
	font-weight:bold;
}

</style>
</head>
<body>
<div class ="main">
<h1 id="title">Rk Employee Management System</h1>
<div class="sub">
<h2>Login</h2>
<%
	String message = (String) request.getAttribute("Message");
	System.out.println("Message:"+message);	
	if(message != null && message.equals("Login Failed"))
	{
		System.out.println(message);
	
%>
<h4><font color="red">Some of the info entered is incorrect, please try again</font></h4>
<%
}
%>
<form method="post" action="<%=request.getContextPath()%>/Employee">
<table>
<tr>
<td><p id="UnameLabel">User Name:</p></td>
<td><input type="email" id="Uname" name="userName" placeholder="Enter your Email" required /></td>
</tr>
<tr>
<td><p id="PwdLabel">Password:</p></td>
<td>
<input type="password" id="password"  name="password" placeholder="Password" required /><br/></td>
</tr>
<tr>
<td>
<br/>
</td>
</tr>
<tr>
<td><input type="submit" id="button1" name="action" value="Login" /></td>
<td><input type="submit" id="button2" name="action" value="Cancel" /></td>
</tr>

</table>
<a href="<%=request.getContextPath()%>/Employee?action=ShowRegisterPage"><b>Sign up</b></a>
</form>

</div>

</div>
</body>
</html>