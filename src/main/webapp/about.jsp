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
		String name = (String) session.getAttribute("name_key");
	%>
		<h2> Welcome :<%= name %> </h2>
		
		<a href="home.jsp">Home</a> &nbsp;&nbsp;
		<a href="profile.jsp">Profile</a>&nbsp;&nbsp;
		<a href="logOut">LogOut</a>
</body>
</html>