<%--
  Created by IntelliJ IDEA.
  User: wl
  Date: 2020/8/8
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file">
    <input type="submit" value="upload">
  </form>
  <br><br>
  <form action="${pageContext.request.contextPath}/download" method="post">
    你要下载的:<input type="text" name="download">
    <input type="submit" value="提交">
  </form>
  </body>
</html>
