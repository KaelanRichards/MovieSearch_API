<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />

</head>
<body>
		<h1>Search Movie by Keyword</h1>
		<form action="/search">
			Insert Keyword: <input type="text" name="keyword">
			<input type="submit" class="btn btn-info" value="Submit">
		</form>
		
		<h1>Display Your Favorites</h1>
		<a class="btn btn-secondary" href="/favorites">GO</a>
</body>
</html>