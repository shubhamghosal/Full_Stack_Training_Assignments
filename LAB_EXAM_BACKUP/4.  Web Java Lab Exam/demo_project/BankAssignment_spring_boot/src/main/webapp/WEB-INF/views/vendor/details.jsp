<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>${sessionScope.message}</h4>
	<h4>${sessionScope.user_details}</h4>
	<h4>
		<a href="<spring:url value='/user/logout'/>">Log Out</a>
	</h4>
</body>
</html>