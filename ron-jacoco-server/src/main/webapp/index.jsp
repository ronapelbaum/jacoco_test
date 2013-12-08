<%@ page import="java.util.Date" %>
<%@ page import="ron.server.message.HelloMessage" %>

<%
    HelloMessage my = new HelloMessage("jsp");
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
