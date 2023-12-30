<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
	<body>
	<%
		String name = (String) request.getAttribute("name_key");
	%>
		<h2> Welcome :<%= name %> </h2>
		
		<a href="home.jsp">Home</a> &nbsp;&nbsp;
		<a href="about.jsp">About Us</a>
	</body>
</html>