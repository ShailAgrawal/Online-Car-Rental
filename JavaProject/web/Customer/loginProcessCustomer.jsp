<%-- 
    Document   : logincheck
    Created on : 19/08/2016, 12:49:17 AM
    Author     : OEM
--%>
<%@page import="java.sql.*"%>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Check</title>
    </head>
    <body>
        <%
      try{
        String username = request.getParameter("email");   
        String password = request.getParameter("password");
        String type;
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/cars", "root","root");    
        PreparedStatement pst = conn.prepareStatement("Select * from customer where `Cus_email`=? and `password`=?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        int id;
        
        
        if(rs.next())
        {
            
                id = rs.getInt("CustmorID");
                session.setAttribute("loggedin",id);
                response.sendRedirect("customerProfile.jsp");
        
            }
           
        
        else
          response.sendRedirect("customerLoging-again.jsp");            
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>
    </body>
</html>
