<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/6/9
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>

  welcome!<br>
  <a href="${pageContext.request.contextPath}/user/add">添加</a><br>

 <a href="${pageContext.request.contextPath}/user/findByName">查询</a><br>

</body>
</html>
