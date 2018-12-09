<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index Page</title>
  </head>
  <body>
  <h1>Hello World!</h1>

  <!-- Expression -->
  <%=(2+2)%>
  <p>The Current time is <%=new java.util.Date()%></p>

  <!-- Declaration -->
  <%! int a =5;%>

  <!-- Scriptlets -->
  <% if(a>5) {%>
  <input type ="text"/>
  <%} else {%>
  <input type = "button" value="ok"/>
  <%}%>
  <p><a href="usebean.jsp">Use Bean Sample</a> </p>
  <p><a href="test">Sample Servlet</a> </p>
  <p><a href="student-form.jsp">Student Form</a> </p>
  </body>
</html>
