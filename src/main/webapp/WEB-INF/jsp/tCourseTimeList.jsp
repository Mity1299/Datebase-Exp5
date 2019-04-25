<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${course.title}课程时间列表</title>
</head>
<body>
<h2>${course.title}课程时间列表</h2>
   <table border="1">
       <tr>
           <td>课次</td>
           <td>已点名</td>
           <td>教学周</td>
           <td>周几</td>
           <td>开始时间</td>
       </tr>
		<c:forEach items="${tempClassTimeList}" var="tClassTime">
           <tr>
               <td><a href="/rollcall/rollDeatils/${tClassTime.timeSlotId}/${course.courseId}">${tClassTime.count}</a></td>
               <td>${tClassTime.status}</td>
               <td>${tClassTime.week}</td>
               <td>${tClassTime.day}</td>
               <td>
              	<fmt:formatDate value="${tClassTime.startTime}" pattern="HH:mm"/>
              	</td>
           </tr>
		</c:forEach>
   </table>
</body>
</html>