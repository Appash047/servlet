<%@page import="com.jsp.dto.Admin"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table {
	border-collapse: collapse;
}

th {
	color: red;
}
</style>
</head>
<body>
	<%
	List<Admin> admins = (List<Admin>) request.getAttribute("list");
	%>
	<table border="2px">
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>PHONE</th>
			<th>EMAIL</th>
			<th>PASSWORD</th>
		</tr>
		<%
		for (Admin admin : admins) {
		%>
		<tr>


			<td><%=admin.getId()%></td>
			<td><%=admin.getName()%></td>
			<td><%=admin.getPhone()%></td>
			<td><%=admin.getEmail()%></td>
			<td><%=admin.getPassword()%></td>

		</tr>
		<%
		}
		%>

	</table>
</body>
</html>