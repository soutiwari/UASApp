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
	<form action="./displayApplications" method="post">
	Select Program to view applications:
		<select id="scheduledProg" name="scheduledProg">
			<c:forEach items="${plist}" var="ps">
				<option value="${ps.scheduledProgramId}">${ps.scheduledProgramId} ${ps.programName}</option> 
			</c:forEach>
		</select>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>