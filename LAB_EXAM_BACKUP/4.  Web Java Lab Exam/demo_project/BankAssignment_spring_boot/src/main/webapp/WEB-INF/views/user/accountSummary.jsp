<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
   	<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h4>Hello : ${sessionScope.user_details}</h4>
	
	<h4>Your Account Details</h4>
	<form method="post">
	<table style="background-color: lightgrey; margin: auto">
		<c:forEach var="account" items="${requestScope.accounts}">
			<tr>
				<td><input type="radio" name="bid" value="${account.id}" ></td>
				<td>${account.id}</td>
				<td>${account.type}</td>
				<td>${account.balance}</td>
			</tr>
		</c:forEach>
	</table>
	
	Amount <input type="number" name="amt">
	
	<input type="submit" value="Withdraw Amount" name="transaction" formaction= "<spring:url value='/user/transaction'/>" />
	<input type="submit" value="Deposit Amount" name="transaction" formaction= "<spring:url value='/user/transaction'/>" />
	
	<a href="createAccount" ><input type="button" value="Create Account"  /></a>
	
	</form>
	
	${requestScope.message}
	
</body>
</html>