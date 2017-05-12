<%@page import="dao.UserDao"%>
<%@page import="Bean.User"%>
<% String a = String.valueOf(session.getAttribute("loggedin")); 
                   String id=a; 
                    User u=UserDao.getRecordById(Integer.parseInt(id));
                    
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  if(session.getAttribute("loggedin")==null)
      response.sendRedirect("../index.jsp");

  %> 
<%@page import="dao.UserDao"%>
<%@page import="Bean.User"%>
<%-- 
    Document   : profile
    Created on : 23/08/2016, 2:37:14 AM
    Author     : OEM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Car Rental</title>
    </head>
    <body>
        

<link rel="stylesheet" href="<css/reset.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" type="text/css" />


    <header> 
	<div class="width">
    		<h1><a href="index.jsp">Car Rental</a></h1>
                
        <nav>
            <ul class="sf-menu dropdown">

            <li class="selected"><a href="customerProfile.jsp"><i class="fa fa-home"></i> Home</a></li>

        <li>    <a href="custbookacar.jsp"><i class="fa fa-briefcase"></i> Car & Rates</a></li>
                     
    <li>    <a href="custcontactus.jsp"><i class="fa fa-phone"></i> Contact Us</a></li> 

       <li>    <a href="custSetting.jsp"><i class="fa fa-phone"></i> My Settings</a></li>

    <li><a href="../logout.jsp"> Logout</a> </li>

    
            
     </ul>
            
            

			
	<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

        </header>
  <article class="content color" style="background-color: white;">
    		
   
                    
                <form id="contactform" action="custupdateinfo.jsp" method="post"> 
                    <input type="hidden" name="id" value="<%= u.getId() %>" />
                 
                    <h3> Profile </h3>
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
