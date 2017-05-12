<%-- 
    Document   : admin
    Created on : 14/09/2016, 1:56:48 AM
    Author     : OEM
--%>
<%@page import="dao.StaffDao"%>
<%@page import="Bean.User"%>
<% String a = String.valueOf(session.getAttribute("loggedin")); 
                   String id=a; 
                    User u=StaffDao.getRecordById(Integer.parseInt(id));
                    
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  if(session.getAttribute("loggedin")==null)
      response.sendRedirect("../index.jsp");

  %> 
<%@page import="dao.StaffDao"%>
<%@page import="dao.UserDao"%>
<%@page import="Bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Page</title>
   
    <link rel="stylesheet" href="<css/reset.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" type="text/css" />
 </head>
    <body>
        <header> 
	<div class="width">
    		<h1><a href="/">Wild<strong>Card</strong></a></h1>
                
        <nav>
            <ul class="sf-menu dropdown">

            <li class="selected"><a href="adminhome.jsp"><i class="fa fa-home"></i> Home</a></li>

        <li>    <a href="adminCar.jsp"><i class="fa fa-briefcase"></i> Car & Rates</a></li>
                     
    <li>    <a href="adminContact.jsp"><i class="fa fa-phone"></i> Contact Us</a></li> 

       <li>    <a href="admin.jsp"><i class="fa fa-phone"></i> <%= u.getName() %></a></li>
          <li>    <a href="adminPanel.jsp"><i class="fa fa-phone"></i> Admin Panel</a></li>

    <li><a href="../logout.jsp"> Logout</a> </li>

    
            
     </ul>
            
            

			
	<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

        </header>
                    <article class="content color" style="background-color: white;">
    		
                    
                    
                <form id="contactform" action="adminupdateinfo.jsp" method="post"> 
                    <input type="hidden" name="id" value="<%= u.getId() %>" />
                 
                    <h3> Profile </h3>
                    
                     <h5> Updated Successfully </h5>
                    <br>
               
                    <table style="border-collapse: separate;border-spacing:10px;">
                        
 <tr>
                                <td><label for="name">Full Name</label>
                                <br><input type="text" name="name" value="<%= u.getName() %>" required>
                                </td>
                            </tr>
                            
                            <tr>
                                <td><label for="email">Email</label>
                               <br><input type="email" id="email" name="email" value="<%= u.getEmail() %>" required >
                                </td>
                                                               
                            </tr>
                            
                            <tr>
                                                              
                                <td><label for="password">password</label>
                                    <br><input type="password" id="password" name="password" value="<%= u.getPassword() %>" >
                                </td>
                            </tr>                                            
                            
                       
                    </table>
              
                    <br><p><input 
                           class="buttom" name="submit" id="submit" value="Save" type="submit"></p>  	 
   </form> 
</article> 
    </body>
</html>