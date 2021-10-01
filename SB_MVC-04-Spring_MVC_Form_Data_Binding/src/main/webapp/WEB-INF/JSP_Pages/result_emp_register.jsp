<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Status</title>
</head>
<body>
	<h1 style="color: green; text-align: center">
	${result}
	</h1>
	<hr>
	<sf:form modelAttribute="emp">
		<table>
			<tr>
				<td>First Name:</td>
				<td><sf:input path="fname"  readonly="true"/></td>
			</tr>
			<tr>
				<td>Middle Name:</td>
				<td><sf:input path="mname"  readonly="true"/></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><sf:input path="lname" readonly="true" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><sf:input path="addrs" readonly="true"/></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><sf:input path="mobile" readonly="true"/></td>
			</tr>
		</table>
	</sf:form>
	<hr>
	<a href="emp_register"><h1 style="color:red;text-align:center">Register Employee Here</h1></a>

	<br><br>
	
	<h1 style="color: red; text-align: center">
		<a href="./">GO HOME</a>
	</h1>
	<hr>
</body>
</html>