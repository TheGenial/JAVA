<%@page import="java.sql.*"%>
<%
    if((session.getAttribute("userid")==null) ||
            (session.getAttribute("userid")=="")){
%>
You are not logged in<br>
<a href="index.jsp">Please Login</a>
<%} else {

        Class.forName("com.mysql.jdbc.Driver");
        String first_name = "", last_name = "", password = "", email = "";
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
        Statement st = conn.createStatement();
        ResultSet rs;
        rs = st.executeQuery("select first_name,last_name,password,email from users where user_name='" + session.getAttribute("userid") + "'");
        while (rs.next()) {
            first_name = rs.getString("first_name");
            last_name = rs.getString("last_name");
            email = rs.getString("email");
            password = rs.getString("password");
        }

%>
<form action="edituser.jsp" method="post">
    <center>
        <table border="1" width="30%" cellpadding="3" >
            <thead>
            <tr>
                <th colspan="2">User Info</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>First Name</td>
                <td><input type="text" name="first_name" value="<%=first_name%>"></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><input type="text" name="last_name" value="<%=last_name%>"></td>
            </tr>
            <tr>
                <td>User Name</td>
                <td><%=session.getAttribute("userid")%></td>
            </tr>
            <tr>
                <td>New Password</td>
                <td><input type="password" name="password" value="<%=password%>"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="email" name="email" value="<%=email%>"></td>
            </tr>
            <tr>
                <td><input type="submit"value="Edit" name="edit"> </td>
                <td><input type="submit"value="Delete" name="edit"> </td>
            </tr>
            <tr>
                <td colspan="2">HomePage
                    <a href="index.jsp">Login Here</a></td>
            </tr>
            </tbody>
        </table>
    </center>
</form>
<a href="success.jsp">Go Home</a>
<a href="logout.jsp">Log Out</a>
<% }%>

