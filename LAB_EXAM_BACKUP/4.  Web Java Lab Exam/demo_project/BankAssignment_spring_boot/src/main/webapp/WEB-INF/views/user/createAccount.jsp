<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
</head>
<body>
<form:form method="post" modelAttribute="accounts">
<form:select path="type" >
<form:option value="CURRENT">CURRENT</form:option>
<form:option value="SAVING">SAVING</form:option>
<form:option value="FD">FD</form:option>
</form:select>

<form:input type="date" path="creationDate" />
<form:input path="balance" type="number"/>


<form:button type="submit" >Create Account</form:button>

</form:form>



</body>
</html>