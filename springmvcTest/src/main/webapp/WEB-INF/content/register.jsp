<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
</head>
<body>
	<form action="register" method="post">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input type="text" name="username" id="username" /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册" /></td>
			</tr>
		</table>
	</form>
</body>
</html>