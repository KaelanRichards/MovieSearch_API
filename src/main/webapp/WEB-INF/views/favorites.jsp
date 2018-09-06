<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />

</head>
<body>
<div class="container">
		<table border="1">
			<tr>

				<th>Title</th>
				<th>overview</th>
				<th>18+</th>
				<th>Delete</th>
			</tr>
			<c:forEach var="f" items="${favoriteList}">
				<tr>
					
					<td>${f.title}</td>
					<td>${f.overview}</td>
					<td>${f.video }</td>
					<td><a class="btn btn-dark btn-sm"
						href="/favorites/${f.id}/delete">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	
		<br>
		<a class="btn btn-secondary" href="/">Back</a>
		</div>
</body>
</html>