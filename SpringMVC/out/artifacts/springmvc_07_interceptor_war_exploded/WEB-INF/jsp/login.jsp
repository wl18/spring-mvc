<%--
  Created by IntelliJ IDEA.
  User: wl
  Date: 2020/8/8
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>

<%--在web-inf下的所有页面或者资源，只能通过controller,或者servlet进行访问--%>
<h1>登录页面</h1>

<form action="${pageContext.request.contextPath}/user/login" method="post">
    <label>用户名：<input type="text" name="username" /></label>
    <label>密码：<input type="password" name="password" /></label>
    <input type="submit" value="提交">
</form>

</body>
</html>
