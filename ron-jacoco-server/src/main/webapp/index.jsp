<%@ page import="java.util.Date" %>
<html>
<body>
<p>
    Login Time: <%=new Date()%>
</p>
<hr/>
<form action="app" method="GET">
    Name:
    <label>
        <input type="text" name="name">
    </label>
    Show length:
    <label>
        <input type="checkbox" name="additional" value="length">
    </label>
    <input type="submit" value="Submit">
</form>
</body>
</html>
