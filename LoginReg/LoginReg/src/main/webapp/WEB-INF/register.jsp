<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Index</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css">	
		<script src="/js/main.js"></script>
	</head>

	<body>
		<h1> Register </h1> <br />
		
		<form:form action="/register" method="post" modelAttribute="user">

			<form:label> Email</form:label>
			<form:errors></form:errors>
			<form:input type="text" path="email"></form:input> <br />

			<form:label> First Name </form:label>
			<form:errors></form:errors>
			<form:input type="text" path="firstName"></form:input> <br />

			<form:label> Last Name </form:label>
			<form:errors></form:errors>
			<form:input type="text" path="lastName"></form:input> <br />

			<form:label> Password </form:label>
			<form:errors></form:errors>
			<form:input type="text" path="password"></form:input> <br />

			<form:label> Confirm Password </form:label>
			<form:errors></form:errors>
			<form:input type="text" path="confirm"></form:input> <br />


			<input type="submit" value="Register" />

		</form:form>
	</body>
</html>