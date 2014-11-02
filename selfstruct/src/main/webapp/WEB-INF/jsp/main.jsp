<%@page import="com.smart.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% 
	UserBean user = (UserBean)request.getAttribute("user");
%>
<html>
	<head>
		<title>景区网站后台</title>
	</head>
	<body>
		${user.userName},欢迎您！
	</body>
</html>