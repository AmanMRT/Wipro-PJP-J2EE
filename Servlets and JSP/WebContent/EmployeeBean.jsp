<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<jsp:useBean id="person" class="JavaBeans_in_JSP.Employee"/>
	
	<% if (request.getParameter("submit") == null) { %>
		<form method="get" action="EmployeeBean.jsp">
			Employee Name <input type="text" name="name" /><br />
			Employee Id <input type="text" name="id" /><br />
			<input type="submit" name="submit" />
		</form>
	<% } else { %>
			<jsp:setProperty name="person" property="name" value='<%=request.getParameter("name")%>' />  
			<jsp:setProperty name="person" property="id" value='<%=Integer.parseInt(request.getParameter("id"))%>' />
			
			Name: <jsp:getProperty name="person" property="name"/><br />
			ID: <jsp:getProperty name="person" property="id"/><br />
	<% } %>
	
</body>
</html>