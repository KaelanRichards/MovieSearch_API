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
				<th>Favorites</th>

			</tr>
			<c:forEach var="r" items="${results}">
				<tr>
					
					<td>${r.title}</td>
					<td>${r.overview}</td>
					<td><a class="btn btn-secondary" href="/addfavorite/${r.id}/${r.title}/${r.overview}/${r.video}">Add</a></td>

				</tr>
			</c:forEach>
		</table>
	</div>


</body>
</html>