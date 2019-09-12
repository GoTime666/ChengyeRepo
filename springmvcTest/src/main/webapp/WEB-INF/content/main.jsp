<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main</title>
</head>
<body>
	<h1>欢迎[${user.username}]</h1>
	<table>
		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.bookName}</td>
				<td>${book.bookPrice}</td>
				<td>${book.publisher}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>