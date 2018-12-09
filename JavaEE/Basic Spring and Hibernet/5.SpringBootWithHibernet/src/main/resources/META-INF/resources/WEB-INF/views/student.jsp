<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">

<head>
    <link type="text/css" rel="stylesheet" href="<c:url value="/styles/bootstrap.min.css"/>" />
</head>

<body>
    <h1> Student Form</h1>
    <form:form commandName="student" method="post" >
    <form:input path="id" cssStyle="display: none" />
    <table class="table">
        <tbody>
            <tr>
                <td>Name: </td>
                <td><form:input path="name" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>Father's Name </td>
                <td><form:input path="fatherName" cssClass="form-control"/></td>
            </tr><tr>
                <td>Mother's Name</td>
                <td><form:input path="motherName" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>Gender </td>
                <td><form:select path="gender" cssClass="form-control">
                    <option value="Male">Male</option>
                    <option value="FeMale">FeMale</option>
                    <option value="Others">Others</option>
                </form:select>
                </td>
            </tr>
            <tr>
                <td>Roll No </td>
                <td><form:input path="roolNo" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>Email </td>
                <td><form:input path="email" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>Mobile </td>
                <td><form:input path="mobile" cssClass="form-control"/></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" class="btn btn-success"></td>
            </tr>
        </tbody>
    </table>
    </form:form>
</body>

</html>