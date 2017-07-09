<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: joyce
  Date: 2017/7/8
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Support</title>
</head>
<body>
    <h2>Login</h2>
    You must log in to access the customer support site.<br /><br />
    <%
        if((Boolean)request.getAttribute("logFailed")) {
            %>
        The username or password you entered are not correc. Please try again <br /><br />
    <%
        }
    %>

    <form method="POST" action="<c:url value="/login" />">
        Username<br />
        <input type="text" name="username" /><br /><br />
        Password<br />
        <input type="password" name="password" /><br /><br />
        <input type="submit" value="Log In" />
    </form>
</body>
</html>
