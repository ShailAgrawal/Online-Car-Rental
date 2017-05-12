

<%@page import="dao.StaffDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="u" class="Bean.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
       <%  
int i=StaffDao.update(u);  
response.sendRedirect("adminPanelUsers.jsp");  
%>  
    </body>
</html>
