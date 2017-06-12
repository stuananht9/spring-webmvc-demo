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
        <td>Product</td>
        <td>Quantity</td>
    </tr>
    <c:forEach items="${orderItemList}" var="orderItem">
        <tr>
            <td>${orderItem.product.name}</td>
            <td>${orderItem.quantity}</td>
        </tr>
    </c:forEach>
    <tr>

    </tr>
</table>

</body>
</html>