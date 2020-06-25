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
		var userName = document.change.username.value;
		var passwordold = document.change.passwordold.value;
		var passwordnew = document.change.passwordnew.value;
		
		if(userName=="" || passwordnew==""|| passwordold=="")
		{
			alert("Fields Can not be empty");
			return false;
		}
	}
	</script>
	<!-- Login Fields in HTML page  -->
	<form name = "change" action="MP2ChangePasswordServlet" method = "post" >
	<table>
        <tr><td>Enter Username<b class="asterik">*</b></td> <td><input type="text" name="username" required ></td></tr>
        <tr><td>Old Password<b class="asterik">*</b></td> <td><input type="password" name="passwordold" required></td></tr>
        <tr><td>New Password<b class="asterik">*</b></td> <td><input type="password" name="passwordnew" required></td></tr>
         <tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>
        <tr><td></td> <td><input type="submit" value= "Change" onClick="return validation()"></td></tr>
    </table>            
	</form>
	
</body>
</html>