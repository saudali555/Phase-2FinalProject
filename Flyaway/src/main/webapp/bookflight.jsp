<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Flight</title>
</head>
<body>
<form action="book" method="post">
	<label for="src">Enter Source:</label>
	<select id="src" name="src">
  		<option>Mumbai</option>
  		<option>Delhi</option>
  		<option>Indore</option>
  		<option>Banglore</option>
  		<option>Chennai</option>
	</select>
	<br>
	<label for="dest">Enter Destination:</label>
	<select id="dest" name="dest">
  		<option>Mumbai</option>
  		<option>Delhi</option>
  		<option>Indore</option>
  		<option>Banglore</option>
  		<option>Chennai</option>
	</select>
	<br>
	<label for="date">Enter Date:</label>
	<select id="date" name="date">
  		<option>2022-03-01</option>
  		<option>2022-03-02</option>
  		<option>2022-03-03</option>
  		<option>2022-03-04</option>
  		<option>2022-03-05</option>
  		<option>2022-03-06</option>
	</select>
	<br>
	<input type="submit" value="Search"/>
</form>
</body>
</html>