<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%
        String userid=request.getParameter("user_name");
        String pass=request.getParameter("pass");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
            Statement st=conn.createStatement();
            ResultSet rs;
            rs=st.executeQuery("select * from users where user_name='"+userid+"'and password='"+pass+"' ");
        if(rs.next()){
            session.setAttribute("userid",userid);
            response.sendRedirect("success.jsp");
        }
        else{
            response.sendRedirect("index.jsp");
        }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
%>