<%-- 
    Document   : logout
    Created on : 23/08/2016, 2:37:29 AM
    Author     : OEM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <!--clearing objects and destroying the session-->
         <%
            session.invalidate();
            response.sendRedirect("/JavaProject/logoutSucess.jsp");
            %>
    </body>
</html>
