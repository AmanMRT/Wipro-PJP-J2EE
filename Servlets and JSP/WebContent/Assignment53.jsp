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
		int number = Integer.parseInt(request.getParameter("num"));
		int num = number;
				
		int fac = 1;
		while(num > 0)
		{		
			fac = fac * num;
			num--;
		}
		
		String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " +"transitional//en\">\n";

		out.println(docType +
			"<html>\n" +
	          "<head></head>\n" +
	          
	          "<body>\n" +
	             "<h2 align = \"center\">Factorial of a Number</h2>\n" +
	             "<table border = \"1\" align = \"center\">\n" +
	                
	                "<tr>\n" +"  <th> Number </th><th> Factorial </th></tr>\n" +
	                  
	                "<tr>\n" + "  <td>" + number + "  </td>\n" +"  <td>" + fac + "  </td></tr>\n" +
	               	                
	             "</table>\n" +
	             "</body></html>"
	    );
	
	%>
</body>
</html>