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
String fname =request.getParameter("fname");
String lname=request.getParameter("pwd");
String dob=request.getParameter("dob");
String gender=request.getParameter("gender");
String login=request.getParameter("login");
String password=request.getParameter("pwd");


out.println(fname+"\n");
out.println(lname+"\n");
out.println(dob+"\n");
out.println(gender+"\n");
out.println(login+"\n");
out.println(password);
%>
</body>
</html>