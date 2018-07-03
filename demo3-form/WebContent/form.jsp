<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lomake</title>
</head>
<body>
	<h3>What is your first name?</h3>
	<form action="show_inserted_name" method="GET">
		<!-- get -->
		<input type="text" name="firstname"
			placeholder="Insert your name here" />
		<button type="submit">Send</button>
	</form>
</body>
</html>