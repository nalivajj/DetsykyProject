<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GetPage</title>
</head>
<body>
<form action="ServletForth" method="get">
    Enter id value: <br>
    <input type="number" name="idValue"> <br>
    <input type="submit" value="Show">
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
