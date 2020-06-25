<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<script type="text/javascript">
	function validation()
	{
		var userText = document.text.text.value;
				
		if(userText=="")
		{
			alert("Field Can not be empty");
			return false;
		}
	}
	</script>
	
	<form name = "text" action="Assignment22">
	Enter User Name <input type="text" name="name"><br><br>
	Enter Password <input type="password" name="pwd"><br><br>
	
	<input type="submit" value= "Say Hello" onClick="return validation()"> <br>
	</form>
</body>
</html>