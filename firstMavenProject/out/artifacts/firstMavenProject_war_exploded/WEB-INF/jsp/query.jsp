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
    <title>查询页面</title>
</head>
<body>
  <form action ="${pageContext.request.contextPath}/user/findByName", method="post">
      姓名:<input type="text" name="username" value="${username}"/><br>
      提交:<input type="submit"/>
  </form>
</body>
</html>
