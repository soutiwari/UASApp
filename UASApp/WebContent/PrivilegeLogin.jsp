<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><c:if test="${not empty error}">
	<c:out value="${error}"/>
</c:if></h4>
<h1 align="center">Login Page</h1>
<form action="./privlogin" method="post">
<table align="center">
	<tr>
		<td>Login Id:</td>
		<td><input type="text" name="loginId" pattern="[A-Za-z0-9]{5}" required></td>
	</tr>
	<tr>
		<td>Password</td>
		<td><input type="password" name="password" pattern="[A-Za-z0-9]{5,10}" required></td>
	</tr>
	<tr>
		<td>Role</td>
		<td><input type="radio" name="role" value="admin" checked>Administrator
		<input type="radio" name="role" value="mac">Member of Admission Committee</td>
	</tr>
	<tr>
		<td><input type="submit" value="submit"/></td>
		<td><input type="reset" value="clear"/></td>
	</tr>
</table>
</form>
</body>
</html>