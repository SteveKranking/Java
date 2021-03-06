<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Register</title>
		<link rel="stylesheet" type="text/css" href="/css/styles.css">	
		<script src="/js/main.js"></script>
	</head>

	<body>
		<h2>Login:</h2>
		<form method="POST" action="/login">
			<p><label>Username: <input type="text" name="Username"></label></p>
			<p><label>Password: <input type="password" name="password"></label></p>
			<p><button type="submit">Login</button></p>
		</form>
		<h2>Register as a new user!</h2>
		<form:form action="/register" method="POST" modelAttribute="user">
		<p>
			<form:label path="username">First Name: 
				<form:input path="username"></form:input>
				<form:errors path="username"></form:errors>
			</form:label>
		</p>

		<p>
			<form:label path="email">Email: 
				<form:input path="email"></form:input>
				<form:errors path="email"></form:errors>
			</form:label>
		</p>

		<p>
			<form:label path="password">Password: 
				<form:input type="password" path="password"></form:input>
				<form:errors path="password"></form:errors>
			</form:label>
		</p>
		<p>
			<form:label path="confirm">Confirm password: 
				<form:input type="password" path="confirm"></form:input>
				<form:errors path="confirm"></form:errors>
			</form:label>
		</p>
		<p><form:errors path="user.*"/></p>
		<input type="submit" value="register">
		</form:form>
	</body>
</html>