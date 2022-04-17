<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.Cookie"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String s = request.getParameter("username");
	%>
	<%
		Cookie c = new Cookie("username", s);
	response.addCookie(c);
	%>



	<h1>
		Welcome
		<%=s%></h1>
	<form action="./message">
		<Label>Type your message </Label> <input type="text" value=message><br>
		<input type="submit" value=Send>
	</form>
</body>
</html>