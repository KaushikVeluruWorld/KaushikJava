
<%@page import="com.onlineQuiz.login.Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>


<% 
Login l=new Login();

if(l.login(request.getParameter("username"), request.getParameter("password")))
{
	out.println("Welcome, "+request.getParameter("username")); 
	session.setAttribute("username", request.getParameter("username"));%>
	
	<jsp:forward page="createQuiz.jsp"></jsp:forward>
	
<%}
else 
{
	out.println("Username or password is incorrect");
}
   %>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>