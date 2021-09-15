<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
	<form method="post">
	<table >
		<tr> <td>First Name:</td><td><input type="text"  readonly="true"   name="fname" value="${employee.fname}"></td> </tr>
		<tr> <td>Middle Name:</td><td><input type="text"  readonly="true"   name="mname" value="${employee.mname}"></td> </tr>
		<tr> <td>Last Name:</td><td><input type="text"  readonly="true"  name="lname" value="${employee.mname}"></td> </tr>
		<tr> <td>Address:</td><td><input type="text"  readonly="true"  name="addrs" value="${employee.addrs}"></td> </tr>
		<tr> <td>Mobile:</td><td><input type="text"  readonly="true"  name="mobile" value="${employee.mobile}"></td> </tr>
	</table>
	</form>
	<hr>
	<h1 style="color:red;text-align:center"><a href="emp_register">Register Employee Here</a></h1>
	
	<br><br>
	
	<h1 style="color: red; text-align: center">
		<a href="./">GO HOME</a>
	</h1>
	<hr>
</body>
</html>