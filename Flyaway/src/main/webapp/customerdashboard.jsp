<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<table>
	<tr><th>	</th><th><h1>Welcome User <%= request.getSession().getAttribute("uname") %></h1></th><tr>
		<tr>
			<td><h2>Options</h2></td>	
		</tr>
		<tr>
			<td><a href="profile">Click here to view profile</a></td>
		</tr>
		<tr>
			<td><a href="bookflight.jsp">Click here to book a flight</a></td>
		</tr>
		<tr>
			<td><a href="lout">Click here to logout</a></td>
		</tr>
</table>
</body>
</html>