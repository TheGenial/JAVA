<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<form action="registration.jsp" method="post">
    <center>
        <table border="1" width="30%" cellpadding="3" >
            <thead>
            <tr>
                <th colspan="2">Regisration Here</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>First Name</td>
                <td><input type="text" name="first_name" value=""></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="last_name" value=""></td>
            </tr>
            <tr>
                <td>User Name</td>
                <td><input type="text" name="user_name" value=""></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="pass" value=""></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email" value=""></td>
            </tr>
            <tr>
                <td><input type="submit"value="Submit"> </td>
                <td><input type="submit"value="Reset"> </td>
            </tr>
            <tr>
                <td colspan="2">Already Registered!!
                    <a href="index.jsp">Login Here</a></td>
            </tr>
            </tbody>
        </table>
    </center>
</form>
</body>
</html>
