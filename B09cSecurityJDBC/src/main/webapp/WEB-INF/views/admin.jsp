<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="s" %>       
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>Admin영역</h2>
		ADMIN권한만 접근할 수 있습니다.
		
		<s:authoriz access="hasRole('ADMIN')">
			로그인아이디: <s:authentication property="name"/>
		</s:authoriz>
		
		<%@ include file="/link.jsp" %><br />
	</body>
</html>