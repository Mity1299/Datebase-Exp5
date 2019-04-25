<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--显示某个教师的任课课程列表
	 同时点击课程名称可以进入课程时间界面
 -->
<body>
<h1>课程列表</h1>
	<c:forEach items="${courseList}" var="c">
		<tr><!-- 直接进入点名系统 -->
			<td><a href="/rollcall/callname/${c.courseId}">${c.title}</a><br/></td>
		</tr>
	</c:forEach>
	
		
	
</body>
</html>