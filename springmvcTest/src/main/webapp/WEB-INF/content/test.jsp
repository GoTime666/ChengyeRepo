<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
	just test
	${message}
	<table>
		<c:forEach items="${bookList}" var="book">
			<tr>
				<td>${book.bookName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>