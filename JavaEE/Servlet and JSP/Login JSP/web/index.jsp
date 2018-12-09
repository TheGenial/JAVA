<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Log In Page</title>
</head>
<body>
<form action="login.jsp" method="post">
  <center>
    <table border="1" width="30%" cellpadding="3" >
      <thead>
      <tr>
        <th colspan="2">Login Here</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td>User Name</td>
        <td><input type="text" name="user_name" value=""></td>
      </tr>
      <tr>
        <td>Password</td>
        <td><input type="password" name="pass" value=""></td>
      </tr>
      <tr>
        <td><input type="submit"value="login"> </td>
        <td><input type="submit"value="Reset"> </td>
      </tr>
      <tr>
        <td colspan="2">Your are Not Registered!!
          <a href="reg.jsp">Click Here</a></td>
      </tr>
      </tbody>
    </table>
  </center>
</form>
</body>
</html>
