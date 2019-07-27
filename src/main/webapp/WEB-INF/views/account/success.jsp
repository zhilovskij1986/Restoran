<%--
  Created by IntelliJ IDEA.
  User: Виталий
  Date: 12.06.2019
  Time: 22:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Success Page</title>
</head>
<body>
<h3>Success Page</h3>
Welcome ${sessionScope.username}
<br>
<a href="${pageContext.request.contextPath}/account/order">Order</a>

</body>
</html>
