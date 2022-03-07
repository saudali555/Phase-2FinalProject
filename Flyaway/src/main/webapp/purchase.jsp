<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase</title>
</head>
<body>
<h4>Ticket Price for 1 passenger = <%= request.getSession().getAttribute("price") %></h4><br>
<% int id=(int) request.getSession().getAttribute("id1"); 
 request.getSession().setAttribute("cid",id); %>
<form action="purcalc" method="post">
	Enter no. of Passengers: <input type="text" name="calc"><br>
	<input type="submit" value="Finalise Booking"/>

</form>
</body>
</html>