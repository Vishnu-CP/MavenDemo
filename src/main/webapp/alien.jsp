<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="mavendemo.pojo.Alien" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>No Title now</title>
</head>
<body>
<% 
Alien a = (Alien)request.getAttribute("alien");
	//out.print((Alien)request.getAttribute("alien")); 
	out.println("<h1>WElcome" +a.getName()+"</h1>");
	out.println("Your Info" +a);
%>	

</body>
</html>