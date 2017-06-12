<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <style>
        table {
            border-collapse: collapse;
        }

        table, td, th {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <td>Order Date</td>
        <td>Customer</td>
        <td>Status</td>
        <td></td>
    </tr>
    <c:forEach items="${ordersList}" var="order">
        <tr>
            <td>${order.orderDate}</td>
            <td>${order.customer.name}</td>
            <td>${order.status}</td>
            <td><a href="/orderItem?orderId=${order.id}">Order items</a></td>
        </tr>
    </c:forEach>
    <tr>

    </tr>
</table>

</body>
</html>