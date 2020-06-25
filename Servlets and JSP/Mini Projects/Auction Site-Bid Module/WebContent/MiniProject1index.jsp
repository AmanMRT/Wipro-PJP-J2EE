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
<body style="background-color: antiquewhite;"> 
<center>
	<!-- Login Fields in HTML page  -->
	<form action="MiniProject1" method = "get" >
	    <h1>Welcome to AP Auctions. Please Enter Bid</h1>
    <table>
        <tr><td> Item Id<b class="asterik">*</b> </td> <td> <input type="number" name= "id" required></td></tr>
        <tr><td> Item Name<b class="asterik">*</b> </td> <td> <input type="text" name="itemname" required></td></tr>
        <tr><td> Your Name<b class="asterik">*</b></td> <td><input type="text" name="username" required></td></tr>
        <tr><td> Your Email Address<b class="asterik">*</b> </td> <td><input type="email" name="email" required></td></tr>
        <tr><td> Amount Bid<b class="asterik">*</b> </td> <td><input type="number" name="amount" required></td></tr>
        <tr><td> Auto Increment Bid to match other Bidders?: </td> <td><input type="checkbox" name="status"></td></tr>
        <tr><td></td> <td><input type="submit" value ="Submit Bid"></td></tr>
    </table>
    </form>
</center>
</body>
</html>