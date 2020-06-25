<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.asterik
{
    color: red;
}
</style>
</head>
<body>
	<!-- JavaScript to validate the fields -->
	<script type="text/javascript">
	function loginValidation()
	{
		var userName = document.login.username.value;
		var password = document.login.password.value;
		
		if(userName=="" || password=="")
		{
			alert("Fields Can not be empty");
			return false;
		}
	}
	</script>
	
	<!-- Login Fields in HTML page  -->
	<form name = "login" action="MP2LoginServlet" method = "post" >
	<table>
        <tr><td>Enter Username<b class="asterik">*</b></td> <td><input type="text" name="username" required ></td></tr>
        <tr><td>Enter Password<b class="asterik">*</b></td> <td><input type="password" name="password" required></td></tr>
         <tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>
        <tr><td></td> <td><input type="submit" value= "Login" onClick="return validation()"></td></tr>
       <tr><td></td></tr> <tr><td></td></tr> 
    </table>            
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="Mini_Project_2Register.jsp">New User</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="Mini_Project_2ChangePassword.jsp">Change Password</a>
	</form>
</body>
</html>