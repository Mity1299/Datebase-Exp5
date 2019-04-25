<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>教师首页</title>
</head>
<body>
	${loginTea.tName} 欢迎来到教师首页！
	<br/>
	<a href="/rollcall/courseList/${loginTea.tId}">查看课程列表</a>
	
	
</body>
</html>