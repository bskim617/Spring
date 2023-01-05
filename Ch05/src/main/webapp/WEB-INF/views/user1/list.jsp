<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::list</title>
	</head>
	<body>
		<h3>user1 목록</h3>
		<a href="/Ch05/">Ch05 메인</a>
		<a href="/Ch05/user1/register">user1 등록</a>
		
		<table border="1">
			<tr>
				<th>아이디</th>
				<th>이름</th>
				<th>휴대폰</th>
				<th>나이</th>
				<th>관리</th>
			</tr>
			
			<c:forEach var="users" items="${users}">
				<tr>
					<td>${users.uid}</td>
					<td>${users.name}</td>
					<td>${users.hp}</td>
					<td>${users.age}</td>
					<td>
						<a href="/Ch05/user1/modify?uid=${users.uid}">수정</a>
						<a href="/Ch05/user1/delete?uid=${users.uid}">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</table>
		
	</body>
</html>