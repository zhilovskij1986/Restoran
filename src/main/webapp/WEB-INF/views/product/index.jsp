<%--
  Created by IntelliJ IDEA.
  User: Виталий
  Date: 11.06.2019
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Product Page</title>
</head>
<body>
    <h3>Products Page</h3>
    <table cellpadding="2" cellspacing="2" border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Photo</th>
            <th>Price</th>
            <th>Buy</th>
        </tr>
        <c:forEach var="product" items="${products}">
            <tr>
                <td>${product.id}</td>
                    <td>${product.name}</td>
                     <td><IMG src="${pageContext.request.contextPath}/resources/images/${product.photo}" width="50"></td>
                     <td>${product.price}</td>
                     <td align="center">
                         <a href="${pageContext.request.contextPath}/cart/buy/${product.id}">Buy Now</a>
                 </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
