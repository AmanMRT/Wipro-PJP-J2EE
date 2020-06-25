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
		var userName = document.register.username.value;
		var passwordtype = document.register.passwordtype.value;
		var passwordconfirm = document.register.passwordconfirm.value;
		
		if(userName=="" || passwordtype=="" || passwordconfirm=="")
		{
			alert("Fields Can not be empty");
			return false;
		}
	}
	</script>
	
	<!-- Login Fields in HTML page  -->
	<form name = "register" action="MP2RegisterServlet" method = "post" >
	<table>
        <tr><td>Enter Username<b class="asterik">*</b></td> <td><input type="text" name="username" required ></td></tr>
        <tr><td>Enter Password<b class="asterik">*</b></td> <td><input type="password" name="passwordtype" required></td></tr>
        <tr><td>Confirm Password<b class="asterik">*</b></td> <td><input type="password" name="passwordconfirm" required></td></tr>
         <tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>
        <tr><td></td> <td><input type="submit" value= "Add User" onClick="return validation()"></td></tr>
    </table>            
	</form>
	
	
</body>
</html>