<%
    if((session.getAttribute("userid")==null) ||
            (session.getAttribute("userid")=="")){
%>
You are not logged in<br>
<a href="index.jsp">Please Login</a>
<%} else {
%>
Welcome <%=session.getAttribute("userid")%>
<a href="editinfo.jsp">Edit Information</a><br>
<a href="logout.jsp">Log out</a>
<%    } %>