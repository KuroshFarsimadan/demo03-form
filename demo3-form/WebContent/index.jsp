<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Java EE - Demo 03</title>
<link rel="stylesheet" type="text/css" href="styles/common.css">
</head>
<body>

	<h1>Java EE</h1>
	<h2>DEMO 03 - Form</h2>

	<div id="contentbox">
		<h3>Content</h3>
		<ul>
			<li>HTML form</li>
			<li>HTTP request method GET</li>
			<li>Request parameter</li>
			<li>XSS (Cross site scripting)</li>
		</ul>
		<h3>Functionality</h3>
		<p>On the form, you will insert a name that will be sent to the
			servlet. The servlet will catch the request parameters and forms a
			page in which the inserted name will be printed.</p>
		<h3>Linkit</h3>
		<ul>
			<li><a href="form.jsp">form.jsp</a></li>
			<li><a href="show_inserted_name?firstname=Kurosh">show_inserted_name?firstname=Kurosh</a></li>
			<!-- 
				Tomcat 8.5.3:
				Ensure that requests with HTTP method names that are not tokens (as required by RFC 7231) are rejected with a 400 response
				
				Tomcat 8.5.7:
				Add additional checks for valid characters to the HTTP request line parsing so invalid request lines are rejected sooner. 
			-->
			<li><a
				href="show_inserted_name?firstname=Kurosh<script>alert('OH NO!');</script>">show_inserted_name?firstname=Kurosh&lt;script&gt;alert('OH
					NO!');&lt;/script&gt;</a></li>
		</ul>
	</div>
</body>
</html>