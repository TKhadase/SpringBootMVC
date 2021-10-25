<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error 5xx</title>
</head>
<body>
Something went wrong. Please try later !<BR>
${status}<BR>
 ${timestamp}<BR>
 ${message}<BR>
 ${type}<BR>
 ${path}<BR>
 ${trace}<BR>
<img src="img/5xx.png">
</body>
</html>