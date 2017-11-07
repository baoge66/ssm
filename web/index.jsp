<%--
  Created by IntelliJ IDEA.
  User: P0105144
  Date: 2017/10/26
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form action="/account/login" method="post">
    <label for="username">用户:</label>
    <input name="username" type="text">
    <br>
    <label for="password">密码:</label>
    <input name="password" type="password">
    <br>
    <input type="submit" value="登录" >
</form>
</body>
</html>
