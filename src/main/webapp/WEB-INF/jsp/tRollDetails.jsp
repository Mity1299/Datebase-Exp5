<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>考勤详情界面</title>
</head>
<body>
<h2>${course.title}考勤详情界面</h2>
	<!-- 应该还要写这是第几次考勤 -->
	第${count}次考勤
	  第${timeslot.week}周     周 ${timeslot.day} 第${timeslot.timeno}节课

   <table border="1">
       <tr>
           <td>姓名</td>
           <td>学号</td>
           <td>班级</td>
           <td>是否签到</td>
       </tr>
		<c:forEach items="${vAttendanceStuList}" var="vAttendanceStu">
           <tr>
               <td>${vAttendanceStu.stuName}</td>
               <td>${vAttendanceStu.stuId}</td>
               <td>${vAttendanceStu.classTemp.className}</td>
               <td>${vAttendanceStu.attendance}</td>

           </tr>
		</c:forEach>
   </table>

</body>
</html>