<%--
  Created by IntelliJ IDEA.
  User: mehdi
  Date: 4/25/15
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>


<table>
    <c:if test="${not empty evaluations}">
        <c:forEach var="evaluation" items="${evaluations}" varStatus="i">
            <tr>
                <td>{evaluation.title}</td>
                <td><a href="add/${evaluation.id}">add</a></td>
                <td><a href="update/${evaluation.id}">update</a></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
</body>
</html>
