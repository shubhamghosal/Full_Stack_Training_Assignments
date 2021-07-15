<%@page import="pojos.User"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%!//JSP declaration block : add private member + override lifecycle methods(jspInit & jspDestroy)
	HashMap<String, User> users;

	public void jspInit() {
		System.out.println("in jsp init");
		//create map n populate sample data
		users = new HashMap<>();
		users.put("Shubham", new User("Shubham", "1234",24));
		users.put("Raghuveer", new User("Raghuveer", "12345",25));
		users.put("Ravi", new User("Ravi", "12346",26));
	}%>
<body>
	<%
	String nm = request.getParameter("name");
	String password = request.getParameter("pass");
	User user=users.get(nm);
	if(user!=null)
	{
		//nm is validated
		if(user.getPassword().equals(password))
		{
			//login successful
			session.setAttribute("user_details", user);
			response.sendRedirect("details.jsp");
			
		} else {
			%>
	<h5>
		Invalid Login, Please <a href="login.jsp">Retry</a>
	</h5>
	<%
		}
	}else {
		%>
	<h5>
		New User, Please <a href="register.jsp">Register Here</a>
	</h5>
	<%
		}
	%>
</body>
<%!public void jspDestroy() {
		System.out.println("in jsp Destroy");
	}%>
</html>