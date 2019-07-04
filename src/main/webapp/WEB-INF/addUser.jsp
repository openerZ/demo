<%--
  Created by IntelliJ IDEA.
  User: szmx004
  Date: 2019/7/2
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
    <script type="text/javascript">
        function bcFun() {
            var v = confirm("确认保存");
            if(v==true){
                return true;
            }else{
                return false;
            }
        }
    </script>
</head>
<body>
<div align="center">
    <form action="/addUser" method="post" id="f" onsubmit="return bcFun()">
        用户名: <input type="text" name="username"><br>
        用户密码: <input type="password" name="password"><br>
        用户名: <input type="text" name="name"><br>
        <input type="submit" name="保存"><br>
    </form>
    <hr>

    <a href="index">返回首页</a>
</div>
</body>
</html>
