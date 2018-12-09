<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
    <link type="text/css" rel="stylesheet" href="<c:url value="/styles/bootstrap.min.css"/>" />
</head>

<body>
    <h1> MBSTU Student Database</h1>

    <%--<h3>${myMessage}</h3>--%>
    <a class="btn btn-warning" href="/upsertStudent">Create Student</a>
    <table Class="table">
        <thead>
        <tr>
            <th>Sl#</th>
            <th>Name</th>
            <th>Father's Name</th>
            <th>Mother's Name</th>
            <th>Roll No</th>
            <th>Gender</th>
            <th>Email</th>
            <th>Cell No</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${studentList}" var="std" varStatus="status">
            <tr>
                <td>${status.index+1}</td>
                <td>${std.name}</td>
                <td>${std.fatherName}</td>
                <td>${std.motherName}</td>
                <td>${std.roolNo}</td>
                <td>${std.gender}</td>
                <td>${std.email}</td>
                <td>${std.mobile}</td>
                <td>
                    <a class="btn btn-warning btn-sm" href="./upsertStudent?studentId=${std.id}">Edit</a>
                </td>
                <td>
                    <a class="btn btn-warning btn-sm" href="./deletStudent?studentId=${std.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>


        </tbody>
    </table>

</body>

</html>