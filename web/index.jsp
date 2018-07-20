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
<a href="mvc/testPathVariable/111">hello testPathVariable</a>
<br>
<a href="mvc/ant/bbb/ddd/abc">hello ant</a>
<br>
<a href="mvc/param?username=lisi&age=11">hello param</a>
<br>
<a href="mvc/helloworld">hello world</a>
<br>
<a href="mvc/testmethod">hello testmethod</a>
<br>
<form action="mvc/testmethod" method="post">
    <input type="submit" value="post请求">
</form>

<br>
<a href="mvc/testget/1">hello testmethod</a>
<br>


<form action="mvc/testpsot" method="post">
    <input type="submit" value="testpost">
</form>

<br>


<form action="mvc/testdelete/2" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="testdelete">
</form>

<br>


<form action="mvc/testput/3" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="testput">
</form>


<br>
<a href="mvc/testRequestParam?username=atguigu&age=11">hello testRequestParam</a>
<br>
<br>
<a href="mvc/testRequestHeader">hello testRequestHeader</a>
<br>
<br>
<a href="mvc/testCookieValue">hello testCookieValue</a>
<br>

<form action="mvc/testpojo" method="post">
    username:<input type="text" name="username">
    <br>
    password: <input type="password" name="password">
    <br>
    email:<input type="text" name="email">
    <br>
   <%-- age:<input type="text" name="age">--%>
    <br>
    city:<input type="text" name="address.city">
    <br>
    province:<input type="text" name="address.province">
    <input type="submit" name="submit">
</form>
<a href="mvc/testservletAPI">hello testservletAPI</a>
<br>
<a href="mvc/testModelAndView">hello testModelAndView</a>
<br>
<br><br>
<a href="mvc/testMap">hello testMap</a>
<br>
<br><br>
</body>
</html>
