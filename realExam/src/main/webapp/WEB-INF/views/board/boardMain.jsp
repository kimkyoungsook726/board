<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
	<h1>게시판</h1>

		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<c:forEach var="vo" items="${list }">
				<tr>
					<td>${vo.boardNum }</td>
					<td>${vo.boardTitle }</td>
					<td>${vo.boardContent }</td>
					<td>${vo.irum }</td>
					<td>${vo.regiDate }</td>
				</tr>
			</c:forEach>


		</table>

</body>
</html>