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
<h1>Applications Details</h1>
	<table>
		<tr>
			<th>Applicant Name</th>
			<th>Status</th>
			<th>Click To change Status</th>
		</tr>
		<c:forEach items="${alist}" var="app">
				<tr>
					<td>${app.fullName}</td>
					<td>${app.status}</td>
					<td><a href="ApplicationDetails_AcceptReject.jsp?appId=${app.applicationId}">Click here to change Status</a></td>
				</tr>	
		</c:forEach>
	</table>
</body>
</html>