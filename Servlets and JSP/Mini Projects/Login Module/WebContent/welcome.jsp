<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		//to control back button control
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	
		response.setHeader("pragma", "no-cache"); 	// for HTTP 1.0
		
		response.setHeader("Expires", "0");		//for proxy server
		
		//check if username is null i.e if one directly wants to access the page
		if(session.getAttribute("username") == null)
		{
			response.sendRedirect("login.jsp");
		}
		
	%>
		
		Welcome ${username}
				
		<form action="MP2Logout" method="post" >
			<input type="submit" value= "Logout"> <br>
		</form>
</body>
</html>