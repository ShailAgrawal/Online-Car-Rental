    <%-- 
    Document   : profile
    Created on : 23/08/2016, 2:37:14 AM
    Author     : OEM
--%>
<%@page import="dao.UserDao"%>
<%@page import="Bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Car Rental</title>
    </head>

<% String a = String.valueOf(session.getAttribute("loggedin")); 
                   String id=a; 
                    User u=UserDao.getRecordById(Integer.parseInt(id));%> 
    <body>
        

<link rel="stylesheet" href="css/reset.css" type="text/css" />
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
    <li><a href="../logout.jsp"><i class="fa fa-phone"></i> Logout</a></li>
     </ul>

			
	<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

        </header>


    <div class="page-banner" style="background-image: url('images/car.jpg')">
                    <div class="page-banner__content has-large-heading h1">
                        
                        <h1>Rent Exclusive Car</h1>
                        
                        
                    </div>
                </div>
        
        
        
    	<div class="clear"></div>
  
    
    
    <footer class="width">
        <div class="footer-content">
            <div style="float:left;width:330px">
            	<div><h4>Shail Agrawal</h4> <a href="#"><img src="images/shail.jpg" alt="shail" style="width:303px;height:310px;"></a></div></div><div style="float:left;width:330px">
                    <a href="#"><h4>Suresh Kumar</h4></a><a href="#"><img src="images/suresh.jpg" alt="Suresh" style="width:303px;height:310px;"></a></div><a href="#">
             
          
            
            <div class="clear"></div>
        </div>
        <div class="footer-bottom">
            <p>&copy; All Rights Reserved.</p>
         </div>
    </footer>
</div>
				
        </form>  
    </center>

</body>
</html>
<%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  if(session.getAttribute("loggedin")==null)
      response.sendRedirect("../index.jsp");

  %> 