<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Cookie[] c = request.getCookies(); %>
message sent by <h1>
<%= c[1].getValue()  %>
</h1>

</body>
</html>