<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <form action="/Servlet_007/demo9" method="post">
    username:<input type="text" name="username" /><br/>
    password:<input type="password" name="password" /><br/>
    sex:<input type="radio" name="sex" value="male" checked="checked"/>male
    <input type="radio" name="sex" value="female"/>female<br/>
    hobby:<input type="checkbox" name="basketball" value="basketball" />basketball
    <input type="checkbox" name="football" value="football"/>football
    <input type="checkbox" name="coding" value="coding">coding
    <br>
    city:
    <select name="city">
    <option>请选择城市</option>
    <option value="BJ">北京</option>
    <option value="SH">上海</option>
    <option value=JN>济南</option>
    </select>
    <br>
    <input type="submit" value="register"/>
    </form>
  </body>
</html>
