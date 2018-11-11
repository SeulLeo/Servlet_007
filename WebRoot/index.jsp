<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
    <!-- 告诉浏览器不缓存 -->
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <script type="text/javascript">
  function changeCode(){
  //得到图片元素
  var img=document.getElementById("img")[0];
  //img.setAttribute("src","/Servlet_007/demo2");//xml dom 语法
  img.src="/Servlet_007/demo2";
  }
  </script>
  <body>
    <form action="#" method="post">
    用户名 :<input type="text" name="username" />
    <br><br>
    密码:<input type="password" name="password" />
    <br><br>
    验证码:<input type="text" nam="code" />
    <img src="/Servlet_007/demo2"><a href="javascript:changeCode()">看不清换一张</a>
    <br><br>
    <input type="submit" value="登录" />
    </form>
  </body>
</html>
