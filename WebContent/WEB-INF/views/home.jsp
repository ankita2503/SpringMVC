<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="springForm"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>lOGIN Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>

	<springForm:form method="POST" commandName="login"
		action="/SpringMVCDemo/user">
		<table>
			<tr>
				<td>UserName:</td>
				<td><springForm:input path="userName" /></td>
				<td><springForm:errors path="userName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><springForm:input path="passwrd" /></td>
				<td><springForm:errors path="passwrd" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</springForm:form>

</body>
</html>