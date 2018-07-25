<%--
  Created by IntelliJ IDEA.
  User: John
  Date: 2018/7/18
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>success!!</h1>
time:${requestScope.time}
<br>
<br>
names:${requestScope.names}


<br>
<fmt:message key="i18n.username"></fmt:message>
<br>
<fmt:message key="i18n.password"></fmt:message>
</body>
</html>
