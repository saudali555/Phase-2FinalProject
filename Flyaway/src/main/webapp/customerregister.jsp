<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CustomerRegistration</title>
</head>
<body>
<form action="cregister" method="post">
<h5>(All the fields are required!)</h5>
	Enter Username: <input type="text" name="cname"><br>
	Enter Password: <input type="password" name="pass"><br>
	Enter Age: <input type="text" name="age"><br>
	Enter City of Residence: <input type="text" name="cr"><br>
	<input type="submit" value="Register"/>
</form>
</body>
</html>