<%--
  Created by IntelliJ IDEA.
  User: szmx004
  Date: 2019/7/3
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    <div align="center">
        <table border="1" cellpadding="0" cellspacing="0">
            <c:forEach items="${userByUname}" var="un">
                <tr>
                    <td>用户id</td>
                    <td>${un.id}</td>
                </tr>
                <tr>
                    <td>用户姓名</td>
                    <td>${un.username}</td>
                </tr>
                <tr>
                    <td>用户密码</td>
                    <td>${un.password}</td>
                </tr>
                <tr>
                    <td>用户名称</td>
                    <td>${un.name}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="/index">返回首页</a>
    </div>
</body>
</html>
