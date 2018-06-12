<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/9
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
      姓名:<input type="text" name="username" value="${user.username}"/><br>
      年龄：<input type="text" name="userage" value="${user.userage}"/><br>
      生日:<input type="text" name="birthday" value="${user.birthday}"/><br>
</body>
</html>
