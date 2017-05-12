


<%@page import="dao.UserDao"%>
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
           System.out.println("--------------"+u.getEmail()+"--------------"+u.getName()
           +"--------------"+u.getPassword()+"--------------"+u.getAge()+"--------------"+u.getId());
int i=UserDao.updateprofile(u);
response.sendRedirect("../Customer/custsetting-succ.jsp");  
%>  
    </body>
</html>
