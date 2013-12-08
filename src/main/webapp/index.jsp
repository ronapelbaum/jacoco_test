<%@ page import="java.util.Date" %>
<%@ page import="ron.server.MyMessage" %>

<%
    ron.server.MyMessage my = new ron.server.MyMessage("jsp");
%>
<html>
<body>
<h2>Hello World!</h2>

<h3>Message: <%=my.getMessage()%>
</h3>

<p>
    Login Time: <%=new Date()%>
</p>
<a href="/app">app</a>
</body>
</html>
