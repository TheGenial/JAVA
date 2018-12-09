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
    <form:form commandName="student" method="post">
    <table class="table">
        <tbody>
            <tr>
                <td>1</td>
                <td>Name: </td>
                <td><form:input path="name" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>2</td>
                <td>Age: </td>
                <td><form:input path="age" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>3</td>
                <td>RollNo: </td>
                <td><form:input path="rolNo" cssClass="form-control"/></td>
            </tr>
            <tr>
                <td>4</td>
                <td>Occupation: </td>
                <td><select Class="form-control"/>
                    <option value="0">Select Any</option>
                    <option value="1">Business Man</option>
                    <option value="2">Student</option>
                    <option value="3">Fucker</option>
                    <option value="4">Lover</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit" class="btn btn-danger"></td>
            </tr>
        </tbody>
    </table>
    </form:form>
</body>

</html>