<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" href="img/header.png" type="image/x-icon">
<title>MySchool</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script> 
$(function(){
  $("#header").load("header"); 
  $("#footer").load("footer"); 
});
</script>
</head>
<body>
<div id="header"></div>
<h1 style="color:red; text-align:left">Student Portal</h1>
 <img src="img/student_habit.JPG" >   <br>

 <br>  
 <div id="footer"></div>
</body>
</html>