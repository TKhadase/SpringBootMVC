<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
		<a href="emp_register"><h1 style="color: green; text-align: center">Please fill below details</h1></a>
	<hr>
	<sf:form modelAttribute="emp">
		<table>
			<tr>
				<td>First Name:</td>
				<td><sf:input path="fname" /></td>
			</tr>
			<tr>
				<td>Middle Name:</td>
				<td><sf:input path="mname" /></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><sf:input path="lname" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><sf:input path="addrs" /></td>
			</tr>
			<tr>
				<td>Mobile:</td>
				<td><sf:input path="mobile" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" name="save" value="REGISTER"></td>
			</tr>
		</table>
	</sf:form>

		<a href="./"><h1 style="color: red; text-align: center">GO HOME	</h1></a>

</body>
</html>