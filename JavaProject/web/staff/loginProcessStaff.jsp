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
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/cars?" + "user=root&password=root");    
        PreparedStatement pst = conn.prepareStatement("Select * from staff where Email=? and Password=?");
        pst.setString(1, username);
        pst.setString(2, password);
        ResultSet rs = pst.executeQuery();                        
        int id;
        
        
        if(rs.next())
        {
            type=rs.getString("type");
            if(type.equals("A"))
            {
                id = rs.getInt("Staff_id");
                session.setAttribute("loggedin",id);
                response.sendRedirect("../admin/adminhome.jsp");
        
            }
            else if (type.equals("S"))
            {
                 
                id = rs.getInt("Staff_id");
                session.setAttribute("loggedin",id );
                response.sendRedirect("../staff/staffHome.jsp");
            }
        }
        else
            response.sendRedirect("../staff/staffLogin-again.jsp");            
   }
   catch(Exception e){       
       out.println("Something went wrong !! Please try again");       
   }      
%>
    </body>
</html>
