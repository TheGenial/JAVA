<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">

<body>
    <h1> Student Form</h1>
    <form:form commandName="student" method="post">
    <table>
        <tbody>
            <tr>
                <td>1</td>
                <td>Name: </td>
                <td><form:input path="name"/></td>
            </tr>
            <tr>
                <td>2</td>
                <td>Age: </td>
                <td><form:input path="age"/></td>
            </tr>
            <tr>
                <td>3</td>
                <td>RollNo: </td>
                <td><form:input path="rolNo"/></td>
            </tr>
            <tr>
                <td colspan="3"><input type="submit"></td>
            </tr>
        </tbody>
    </table>
    </form:form>
</body>

</html>