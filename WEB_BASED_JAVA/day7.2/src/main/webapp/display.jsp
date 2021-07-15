<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<h5>
		JsessionID from display page:
		<%=session.getId()%></h5>
		<h5>page : <%=page %></h5>
		<h5>pageContext : <%=pageContext %></h5>
	<h5>Request parameter via scriptlet</h5>
	<h5>
		Email :
		<%
	//JSP Scriplet
	out.print(request.getParameter("em"));
	%>
	</h5>
	<h5>
		Password :
		<%
	//JSP Scriplet
	out.print(request.getParameter("pass"));
	%>
	</h5>
	<hr>
	<h5>Request parameter via JSP Expression</h5>
	<h5>
		Email :<%=request.getParameter("em")%>
	</h5>
	<h5>
		Password :<%=request.getParameter("pass")%>
	</h5>
	<h5>Via EL Syntax : ${param}</h5>
	<h5>Via EL Syntax : ${param.em}</h5>
	<%--Add logout link --%>
	<h5>
		<a href="logout.jsp">Log Me Out</a>
	</h5>
</body>
</html>