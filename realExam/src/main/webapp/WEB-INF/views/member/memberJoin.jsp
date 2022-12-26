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
<h1>회원가입</h1>
<form action="/member/memberJoin" method="post">
<label for="">아이디&nbsp;<input type="text" name="memId" /></label><br />
<label for="">이&nbsp;&nbsp;&nbsp;름&nbsp;<input type="text" name="memName" /></label><br />
<label for="">비밀번호<input type="password" name="memPwd" /></label><br />
<label for="">비번확인<input type="password" /></label><br />
<label for="">전화번호<input type="text" name="phone" /></label><br />


<button>회원가입</button>
</form>
</body>
</html>