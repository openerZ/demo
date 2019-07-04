<%--
  Created by IntelliJ IDEA.
  User: szmx004
  Date: 2019/7/2
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更新用户信息</title>
    <script type="text/javascript">
        function submitFun(){
            var c = confirm("是否更新");
            if(c==true){
                return true;
            }else{
                return false;
            }
        }
    </script>

</head>
<body>
<div align="center">
    <table border="1px">
        <tr>
            <td>原用户名</td>
            <td>原密码</td>
            <td>原姓名</td>
        </tr>
        <tr>
            <td>${one.username}</td>
            <td>${one.password}</td>
            <td>${one.name}</td>
        </tr>

    </table>

    <form action="/updateUser" method="post" id="f" onsubmit="return submitFun()">
        <input type="hidden" name="id" value="${id}">
        用户名:   <input type="text" name="username" value="${one.username}"
                      onfocus='if(this.value=="${one.username}"){this.value="";}'
                      onblur='if(this.value==""){this.value="${one.username}";}'><br>
        用户密码: <input type="password" name="password" value="${one.password}"
                        onfocus='if (this.value=="${one.password}"){this.value=""}; '
                        onblur='if(this.value==""){this.value="${one.password}"};'><br>
        用户名:   <input type="text" name="name" value="${one.name}"
                      onfocus='if (this.value=="${one.name}"){this.value=""};'
                      onblur='if(this.value==""){this.value="${one.name}"};'><br>
                    <input type="submit" name="提交"><br>
    </form>
    <hr>

    <a href="index">返回首页</a>
</div>
</body>
</html>
