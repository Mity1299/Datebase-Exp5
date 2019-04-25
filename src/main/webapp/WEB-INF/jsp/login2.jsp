<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<h2>登录界面</h2>
    <form action="/user/login.do" method="post">  
	  	  用户名：<input type="text" name="name" value="wulaoshi"/>
	    <br/>
	  	  用户密码：<input type="password" name="passwd" value="wulaoshi"/>
	    <br/>
		用户身份：
		<select name="identity">
			<option value="1" >学生</option>
			<option value="2" selected="selected">教师</option>
		</select>
	    <input type="submit" value="提交"/>
	</form>
	${msg }

</body>
</html>