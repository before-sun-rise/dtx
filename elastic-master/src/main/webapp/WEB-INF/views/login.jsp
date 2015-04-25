<%--
  Created by IntelliJ IDEA.
  User: mehdi
  Date: 4/25/15
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>

<form:form method="POST" commandName="login">

    <table>
        <tr>
            <td>username</td>
            <td><form:input path="username"/></td>
            <td><form:errors path="username" cssStyle="color: #ff0091;"/></td>
        </tr>

        <tr>
            <td>password</td>
            <td><form:input path="password"/></td>
            <td><form:errors path="password" cssStyle="color: #ff0091"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="login"/></td>
        </tr>
    </table>



</form:form>

</body>
</html>
