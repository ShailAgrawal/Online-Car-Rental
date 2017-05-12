    <%-- 
    Document   : profile
    Created on : 23/08/2016, 2:37:14 AM
    Author     : OEM
--%>
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



<section id="content" class="one-column">

	    <article>
			
                            <ul class="rig columns-4">
	
       <li>
             <div style="float:left;width:330px">
		<center><a href="Cars/custPorsche.jsp"><img src="images/sports.jpg"></a> <br>
		<h4>Porsche</h4></center><br>
        
	</li>
	 <li>
		<center><a href="Cars/Rolls.jsp"><img src="images/royce.jpg"></a> <br>
		<h4>Rolls Royce</h4></center><br>
        	 <li>
                     <center><a href="Cars/Buggati.jsp"><img src="images/bugati.jpg"></a> <br>
                         <h4>Bugati</h4></center><br></div>
	
	</li>
</ul>
            </article>
    
</section> 
               

</body>
</html>
