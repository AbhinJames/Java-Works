<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testing JSP</title>
</head>
<body>


<h3>Enter some Info</h3>

<form action = "ProcessInfo" method = "POST">
	<label> Name : </label>
	<input type = "text" name ="name"> <br>
	<input type = "submit" value = "Send">
</form>

</body>
</html>