<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1 style="color: green; text-align: center">
		<a href="emp_register">Please fill below details</a>
	</h1>
	<hr>
	<form method="post">
	<table >
		<tr> <td>First Name:</td><td><input type="text" name="fname"></td> </tr>
		<tr> <td>Middle Name:</td><td><input type="text" name="mname"></td> </tr>
		<tr> <td>Last Name:</td><td><input type="text" name="lname"></td> </tr>
		<tr> <td>Address:</td><td><input type="text" name="addrs"></td> </tr>
		<tr> <td>Mobile:</td><td><input type="text" name="mobile"></td> </tr>
		<tr> <td></td>   <td><input type="submit" name="save" value="REGISTER"></td> </tr>
	</table>
	</form>
	<h1 style="color: red; text-align: center">
		<a href="./">GO HOME</a>
	</h1>
</body>
</html>