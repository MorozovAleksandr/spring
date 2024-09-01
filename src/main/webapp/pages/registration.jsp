<%--
  Created by IntelliJ IDEA.
  User: iamal
  Date: 01.09.2024
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<s:form action="registration" method="post" modelAttribute="newUser">
    <s:input path="name" placeholder="Name"/>
    <s:errors path="name"/>

    <s:input path="username" placeholder="Username"/>
    <s:errors path="username"/>

    <s:input path="password" placeholder="Password"/>
    <s:errors path="password"/>
    <s:button>Submit</s:button>
</s:form>
</body>
</html>
