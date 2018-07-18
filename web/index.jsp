<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2018/7/18
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="mvc/param?username=lisi&age=11">hello param</a>
  <br>
  <a href="mvc/helloworld">hello world</a>
  <br>
  <a href="mvc/testmethod">hello testmethod</a>
  <br>
  <form action="mvc/testmethod" method="post">
    <input type="submit" value="post请求">
  </form>
  </body>
</html>
