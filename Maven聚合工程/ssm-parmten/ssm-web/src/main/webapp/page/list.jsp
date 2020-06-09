<%--
  Created by IntelliJ IDEA.
  User: yinzh
  Date: 2020/6/8
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="account">
        ${account.id} ${account.name} ${account.password} <br/>
    </c:forEach>
</body>
</html>
