<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>

<body>
	<h5 align="center">${requestScope.mesg}</h5>
	<table style="background-color: lightgrey; margin: auto;">
		<caption>All Available Departments</caption>
		<c:forEach var="title" items="${requestScope.dept_list}">
			<tr>
				<td>${title}</td>
				<td><a
					href="<spring:url value='/employees/hire?deptname=${title}'/>">Hire
						Employee</a></td>
				<td><a
					href="<spring:url value='/department/details?deptname=${title}'/>">Department
						Details</a></td>

			</tr>
		</c:forEach>
	</table>

</body>
</html>