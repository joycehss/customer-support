<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: joyce
  Date: 2017/7/7
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Support</title>
</head>
<body>
    <h2>Create a Ticket</h2>
    <a href="<c:url value="/login?logout" />" >Logout</a>
    <form method="POST" action="tickets" enctype="multipart/form-data">
        <input type="hidden" name="action" value="create" />
        Your Name: <%= (String)request.getSession().getAttribute("username")%><br />
        <%--<input type="text" name="customerName"><br /><br />--%>
        Subject<br />
        <input type="text" name="subject"><br /><br />
        Body<br />
        <textarea name="body" rows="5" cols="30"></textarea><br /><br />
        <b>Attachments</b><br />
        <input type="file" name="file1"/><br /><br />
        <input type="submit" value="Submit">
    </form>

</body>
</html>
