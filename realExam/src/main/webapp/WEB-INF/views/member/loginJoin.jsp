<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인</h1>
	<form action="/member/logIn" method="post">
	<input type="text" name="memId" /><br />
	<input type="password" name="memPwd" /><br />
	<input type="submit" value="로그인" /><br />
	<input type="reset" value = "취소"/>
	</form>
</body>
</html>