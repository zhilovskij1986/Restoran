<%--
  Created by IntelliJ IDEA.
  User: Виталий
  Date: 12.06.2019
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login Page</title>
</head>
<body>

<h3>Login Page</h3>
${error}
<form method="post"
      action="${pageContext.request.contextPath}/account/login">
    <table border="0" cellpadding="2" cellspacing="2">
        <tr>
            <td>Username</td>
            <td><input type="text" name="usernama"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type="submit" value="Login"></td>
        </tr>
    </table>
</form>

</body>
</html>
