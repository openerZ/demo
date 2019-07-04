<%--
  Created by IntelliJ IDEA.
  User: szmx004
  Date: 2019/7/2
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户信息</title>
    <script type="text/javascript">
        function delFun(id) {
            var c=confirm("确定删除？");
            if(c==true){
                window.location.href="delUser.do?id="+id;
            }
        }

    </script>
</head>
<body>
    <div align="center">
        <table border="1" align="center">
            <tr>
                <td>id</td>
                <td>用户名</td>
                <td>用户密码</td>
                <td>姓名</td>
                <td>删除</td>
                <td>更新</td>
                <td><a href="/addUserView">添加</a> </td>
            </tr>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.name}</td>
                    <td><button onclick="delFun(${user.id})">删除</button></td>
                    <td><a href="/updateUserView?id=${user.id}">更新</a></td>
                </tr>
            </c:forEach>
            <br>
            <form action="/findByUsername" method="post">
                <input type="text" name="username">
                <input type="submit" value="查询">
            </form>
        </table>
    </div>
</body>
</html>
