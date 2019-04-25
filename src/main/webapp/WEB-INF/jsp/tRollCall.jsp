<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>点名界面</title>
<script>
function myFunction()
{
    alert("成功提交！");
}
</script>
</head>
<body>
<h2>${course.title}点名界面</h2>
第${count}次考勤
第${timeslot.week}周     周 ${timeslot.day} 第${timeslot.timeno}节课

<form action="/rollcall/rocallnow.do/${course.courseId}" method="post">

<input type="hidden" name="courseId" value="${course.courseId}"/>
<input type="hidden" name="count" value="${count}"/>
<table border="1">
		<tr>

           <td>姓名</td>
           <td>学号</td>
           <td>班级</td>
           <td>是否签到</td>
       </tr>
       
       <c:forEach items="${stuAndClassList}" var="stu">
       <tr>
               <td>${stu.stuName}</td>
               <td><input type="hidden" name="stuId" value="${stu.stuId}">
              		${stu.stuId}
               </td>
               <td>${stu.classTemp.className}</td>
       <td>
		<input type="radio" name="status${stu.stuId}" value="0" /> 缺勤 <br/>
		<input type="radio" name="status${stu.stuId}" value="1" /> 签到 <br/>
		</td>
	</tr>
	</c:forEach>
</table>
	<br/><input type="submit" onclick="myFunction()" value="提交">
</form>


</body>
</html>