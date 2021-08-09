<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hire Employee</title>
</head>

<body>
	<h5 align="center" style="color: red;">${requestScope.mesg}</h5>
	<form:form method="post" modelAttribute="emps">
		<table style="background-color: lightgrey; margin: auto;">
			<tr>
				<td>Employee Name: </td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" />
			</tr>
			<tr>
				<td>Employee Email: </td>
				<td><form:input path="email" required="true" /></td>
				<td><form:errors path="email" />
			</tr>
			<tr>
				<td>Employee Salary: </td>
				<td><form:input path="salary" type="number" /></td>
				<td><form:errors path="salary" />
			</tr>
			<tr>
				<td>Employee's DoB: </td>
				<td><form:input path="dob" type="date" /></td>
				<td><form:errors path="dob" />
			</tr>

			<tr>
				<td><input type="submit" value="Hire New Employee" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>