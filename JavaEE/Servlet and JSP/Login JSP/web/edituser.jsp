<%@page import="java.sql.*"%>
<%
    if((session.getAttribute("userid")==null) ||
            (session.getAttribute("userid")=="")){
%>
You are not logged in<br>
<a href="index.jsp">Please Login</a>
<%} else {
        String action=request.getParameter("edit");
        System.out.println(action);
        if(action.equals("Edit")){
            System.out.println("editttt");
            String password=request.getParameter("password");
            String first_name=request.getParameter("first_name");
            String last_name=request.getParameter("last_name");
            String email=request.getParameter("email");

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
            Statement st = conn.createStatement();

            String query= "update users set first_name='"+first_name+"',last_name='"+last_name+"',password='"+password+"',email='"+email+"' where user_name='"+session.getAttribute("userid")+"'";
            System.out.println(query);
            int i =st.executeUpdate(query);
            if(i>0){
                response.sendRedirect("editinfo.jsp");
            }else{%>
                Edit Unsuccessfull!
                <a href="editinfo.jsp">Go to edit page</a>
            <%}}else{%>
                Caution! You have no permission to delete
                <a href="editinfo.jsp">Go to edit Page</a>
            <%}


        }%>

