<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sform"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="shortcut icon" href="img/header.png" type="image/x-icon">
<link rel="stylesheet" href="css menu/tables.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<title>MySchool</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script>
	$(function() {
		$("#header").load("header");
		$("#footer").load("footer");
	});
</script>
</head>
<body>
	<div id="header"></div>
	<div class="divbody">
		<table width="100%">
			<tr width="100%">
				<td width="15%"></td>
				<td width="75%">
					<h3 style="text-align: center; color:blue;">Student Details</h3>
					 <p style="align: right; color:red;"><b>${resultMsg}</b></p> 
					<table class="tableList">
						<tr>
							<th>Enroll ID</th>
							<th>First name</th>
							<th>Middle name</th>
							<th>Last Name</th>
							<th>Class/Year</th>
							<th>City</th>
							<th>DOB</th>
							<th></th>
						</tr>
						<c:choose>
						<c:when test="${!empty listStudents}">
						<c:forEach var="stud" items="${listStudents}">
						<tr class="trlist">
							<td><b><a  style="color:red;" href="updateStudent?eid=${stud.ENROLLID}">${stud.ENROLLID}</a></b></td>
							<td>${stud.fname}</td>
							<td>${stud.mname}</td>
							<td>${stud.lname}</td>
							<td>${stud.currentStandard}</td>
							<td>${stud.address2}</td>
							<td>${stud.dob}</td>
							<td><a href="removeStudent?eid=${stud.ENROLLID}" onclick="confirm('Are u sure want to delete ?')">
									<i class="fa fa-trash" style="font-size: 25x; color: red"></i>
								</a></td>
						</tr>
						</c:forEach>
						</c:when>
						<c:otherwise>
							<tr class="trlist"><td colspan="8" text-align="center">No records</td></tr>
						</c:otherwise>
						</c:choose>
					</table>


				</td>
			</tr>
			<td width="10%"></td>
		</table>
		<p>
		<ul class="w3-pagination w3-border pagingbar" style="margin-left:25%;">
			<li><a href="#">«</a></li>
			<li><a class="w3-green" href="#">1</a></li>
			<li><a href="#">2</a></li>
			<li><a href="#">3</a></li>
			<li><a href="#">4</a></li>
			<li><a href="#">5</a></li>
			<li><a href="#">»</a></li>
		</ul>
		</p>
	</div>

	<div id="footer"></div>
</body>
</html>