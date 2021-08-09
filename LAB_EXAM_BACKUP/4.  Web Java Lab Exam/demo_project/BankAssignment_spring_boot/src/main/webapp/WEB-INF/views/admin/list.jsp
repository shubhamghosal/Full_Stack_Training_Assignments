<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>${requestScope.message}</h4>
	
	<table style="background-color: lightgrey; margin: auto">
		<c:forEach var="user" items="${requestScope.users}">
			<tr>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.role}</td>
			</tr>
		</c:forEach>
	</table>

	<h4>
		<a href="<spring:url value='/admin/add'/>">Add New User</a>
	</h4>
	<h4>
		<a href="<spring:url value='/user/logout'/>">Log Out</a>
	</h4>

</body>
</html>