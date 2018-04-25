<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="header.jsp"%>

<table class="table">
    <thead class="thead-dark">
    <tr>
        <th>#</th>
        <th>Name</th>
        <th>Email</th>
        <th>Login</th>
        <th>Avatar</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach var="githuber" items="${githubers}">

            <tr>
                <td>
                        ${githuber.id}
                </td>

                <td>
                    ${githuber.name}
                </td>

                <td>
                        ${githuber.email}
                </td>

                <td>
                        ${githuber.login}
                </td>

                <td>
                        <img src="${githuber.avatarUrl}" width="60px"/>
                </td>
            </tr>

        </c:forEach>

    </tbody>
</table>

<%@include file="footer.jsp"%>
