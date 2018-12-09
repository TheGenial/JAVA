<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
    <link type="text/css" rel="stylesheet" href="<c:url value="/styles/bootstrap.min.css"/>" />
</head>

<body>
    <h1> This is our First spring Boot App</h1>

    <h3>${myMessage}</h3>
    <a class="btn btn-warning" href="/upsertStudent">Create Student</a>
    <table Class="table">
        <thead>
        <tr>
            <th>Sl#</th>
            <th>Name</th>
            <th>Age</th>
            <th>Roll No</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${studentList}" var="std" varStatus="status">
            <tr>
                <td>${status.index+1}</td>
                <td>${std.name}</td>
                <td>${std.age}</td>
                <td>${std.rolNo}</td>
            </tr>
        </c:forEach>


        </tbody>
    </table>

</body>

</html>