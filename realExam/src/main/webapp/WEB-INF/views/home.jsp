<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	welcome! 
</h1>
<header>
	<c:if test="${vo != null}"> <!--세션영역에 vo상자가 있으면  -->
		<span>${vo.memName }님 환영합니다</span><br />
		<hr />
		<a href="">정보변경</a>&nbsp;&nbsp;&nbsp;<a href="/member/logOut">로그아웃</a>&nbsp;&nbsp;&nbsp;
		<a href="/board/boardMain">게시판</a>
		
		
		
	</c:if>

	<c:if test="${vo == null}">
		<a href="/member/loginForm">로그인</a>
		<a href="/member/memberJoin">회원가입</a>
	</c:if>
	
</header>

<p>상품리스트 1</p>
<p>상품리스트 2</p>
<p>상품리스트 3</p>
<p>상품리스트 4</p>
</body>
</html>
