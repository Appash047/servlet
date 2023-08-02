<%@page import="com.jsp.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Admin admin=(Admin) request.getAttribute("updateadmin");%>
<form action="updateadmin" method="post">
Id: <input type="text" name="id" value="<%=admin.getId() %>"> <br>
Name : <input type="text" name="name" value="<%=admin.getName() %>>">> <br>

Phone : <input type="tel" name="phone"  value="<%=admin.getPhone() %>"> <br>
Email : <input type="email" name="email" value="<%=admin.getEmail()%>"> <br>
Password : <input type="password" name="password" value="<%=admin.getPassword() %>>">
<input type="submit" value="update">
</form>

</body>
</html>