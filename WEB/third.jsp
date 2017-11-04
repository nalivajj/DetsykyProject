
<%--
  Created by IntelliJ IDEA.
  User: Pavlo
  Date: 20.10.2017
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GetPage</title>
</head>
<body>
<form action="ServletForth" method="get">
    Enter id value: <br>
    <input type="number" name="idValue"> <br>
    <input type="submit" value="Add">
</form>
<h1>
    <% String temp = (String)session.getAttribute("atr");
     if(temp!=null) %>
   <% { %>
    <%= temp%>
    <% } %>

</h1>

</body>
</html>
