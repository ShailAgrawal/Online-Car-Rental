<%@page import="dao.UserDao"%>  
<jsp:useBean id="u" class="Bean.User"/>  
  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=UserDao.save(u);  
if(i>0) { 
response.sendRedirect("registration-succ.jsp");  }

else{  
out.print("no");  
}  
%>  
  