<%--
  Created by IntelliJ IDEA.
  User: Arif Parvez
  Date: 10/9/2018
  Time: 9:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Use Bean</title>
</head>
<body>
    <h1>Use Bean Example</h1>
    <jsp:useBean id="useBean" class="usebean.MessageBean" scope="request"></jsp:useBean>
    Initial message using jsp:getProperty:<br><br>
    <jsp:getProperty name="useBean" property="message"></jsp:getProperty><br><br>
    Initial message using jsp:getProperty:<br><br>
    <%=useBean.getMessage()%><br><br>

    <jsp:setProperty name="useBean" property="message" value="New Mesage"></jsp:setProperty>
    Message using jsp:getProperty after setting message:<br><br>
    <jsp:getProperty name="useBean" property="message"></jsp:getProperty><br><br>
    Message using jsp expression after setting message:<br><br>
    <%=useBean.getMessage()%><br><br>

    <% useBean.setMessage("message set using jsp expression");
    <%=useBean.getMessage()%>
    </body>
</html>
