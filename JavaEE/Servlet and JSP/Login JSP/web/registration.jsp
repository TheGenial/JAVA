<%@page import="java.sql.*"%>
<%
    String first_name=request.getParameter("first_name");
    String last_name=request.getParameter("last_name");
    String user_name=request.getParameter("user_name");
    String pass=request.getParameter("pass");
    String email=request.getParameter("email");

    try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
            Statement st=conn.createStatement();
    int i=st.executeUpdate("insert into users(first_name,last_name,user_name,password,email)values('"+first_name+"','"+last_name+"','"+user_name+"','"+pass+"','"+email+"')");
    if(i>0) {
        response.sendRedirect("welcome.jsp");
    }else{
        response.sendRedirect("index.jsp"); }
    }
    catch (Exception e)
    {
        System.out.println(e);
        e.printStackTrace();
    }
%>
