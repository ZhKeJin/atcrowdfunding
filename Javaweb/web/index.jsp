<%--
  Created by IntelliJ IDEA.
  User: 26948
  Date: 2019/4/17
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form action="${pageContext.request.contextPath }/HelloWorld" method="post" >
    姓名： <input type="text" name="username">
    密码： <input type="password" name="password">
    <input type="submit" value="提交">
  </form>
       hello world
  </body>
</html>
