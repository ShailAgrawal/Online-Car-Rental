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
<%@page import="Bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    
    <head>
        <link rel="stylesheet" href="<css/reset.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Page</title>
    </head>
    
    <body>
        <header> 
	<div class="width">
    		<h1><a href="index.jsp">Car Rental</a></h1>
                
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
