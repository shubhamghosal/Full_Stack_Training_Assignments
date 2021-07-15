<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>from test1</h5>
<%--how attributes under various scopes: page|request|session|application --%>
<%
/* out.flush(); */
pageContext.setAttribute("nm1", 1234); //page scoped
request.setAttribute("nm2", 3456); //req scoped
session.setAttribute("nm3", 5341); //session scoped
application.setAttribute("nm4", 7689); //application scoped
//server pull : forward
/* RequestDispatcher rd = request.getRequestDispatcher("test2.jsp");
rd.forward(request,response); */
//cllnt pull II
response.sendRedirect("test2.jsp");
%>
<%--how to get value of page scoped attribute? scriptlet | expr | EL--%>
<%-- <h5>Page Scoped attribute value via EL : ${pageScope.nm1}</h5> --%>
</body>
</html>