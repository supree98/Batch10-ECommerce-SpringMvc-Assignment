<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   
   
<%
	String message = (String) request.getAttribute("message");
	String cookie = (String) request.getAttribute("cookieValue");
%>
   
   
   <% if(message != null &&  !message.isEmpty())  {%>
   <h1> <%= message %> </h1>
   
   <% } %>
   
   <%if(cookie != null &&  !cookie .isEmpty())  {%>

	<h2> The cookie value is <%= cookie %> </h2>

	<% } %>	

   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
	
	

	<h1>   <a href ="./createCookie"> Create Cookie</a>  </h1>
	<h1>   <a href ="./showCookie">   Show Cookie  </a>  </h1>
	<h1>   <a href ="./deleteCookie"> Delete Cookie </a> </h1>

</body>
</html>