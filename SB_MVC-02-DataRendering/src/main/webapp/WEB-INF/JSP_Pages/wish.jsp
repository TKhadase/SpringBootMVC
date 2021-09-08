<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wish</title>
<style>
ul{
list-style-type:disc;
}

</style>
</head>
<body>
<h2 style="color:blue; text-align:center"> Welcome ${Name}, ${msg}</h2>
<h3 style="color:green"><br>

<table border="1px solid black">
<tr>
<td><font  style="color:black; text-align:left">Your Details are::(Model Class)</font></td><td> ${person}</td>
</tr>

<tr>
<td><font  style="color:black; text-align:left">Your Nicknames are:: (Arrays)</font></td>
<td><c:forEach  items="${nickNames}" var="nickName">
<ul><li>${nickName}</li></ul>
</c:forEach>
</td>
</tr>

<tr>
<td><font  style="color:black; text-align:left">Your ContactNumber's are (Set)::</font></td>
<td><c:forEach  items="${phones}" var="phone">
<ul><li>${phone}</li></ul>
</c:forEach>
</td>
</tr>

<tr>
<td><font  style="color:black; text-align:left">Your idDetails are (Map):: </font></td>
<td><c:forEach  items="${idDetails}"  var="id">
<ul><li>${id.key}--${id.value}</li></ul>
</c:forEach>
</td>
</tr>

<tr>
<td><font  style="color:black; text-align:left">Person Details are:: (List)</font></td>
<td><c:forEach  items="${personList}"  var="personL">
<ul><li>${personL}</li></ul>
</c:forEach>
</td>
</tr>

</h3>
</table>
<h3 style="text-align:center"><a href="./"   style="color:red"> Go Home</a></h3>
</body>
</html>