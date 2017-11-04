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
