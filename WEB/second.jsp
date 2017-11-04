<%--
  Created by IntelliJ IDEA.
  User: Pavlo
  Date: 19.10.2017
  Time: 23:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add page</title>
</head>
<body>
    <h1>
        Please add user on this page
    </h1> <br> <br> <br>
    <form action="ServletThird" method="post">
        Enter your email: <br>
        <input type="email" name="userEmail"> <br>
        Enter your password: <br>
        <input type="password" name="userPassword"> <br>
        <input type="submit" value="Add">
    </form>
</body>
</html>
