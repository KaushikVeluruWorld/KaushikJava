<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<form action="SignIn.jsp" method="GET">

<table>

<tr> <td> User Id:</td>
     <td><input type="text" name="username"></td></tr>
<tr> <td> Password:</td>
     <td><input type="password" name="password"></td></tr>
<tr> 
     <td align="center" colspan="2"><input type="submit" name="submit" value="Sign In"></td></tr>
     
</table>
</form>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>