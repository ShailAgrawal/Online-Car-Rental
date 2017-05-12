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
                    	
		<section id="content" class="one-column">

	    <article
			
                            class="rig columns-4">
	
        
         
		<center><a href="#"><img src="images/corvette.jpg"></a> <br>
		<h4>Corvette</h4></center><br>
      
        <a style="text-align: left; font-weight:bold;">Description:</a> Automatic transmission. It’s sharp, it’s street smart, it’s everything you need. Airconditioning, multi airbags, ABS brakes, USB & AUX plugs.<br><br>
        <a style="text-align: left; font-weight:bold;"> Year:</a> 2013 to 2015<br><br>
        
        <a style="text-align: left; font-weight:bold;">Capacity:</a> 2 Passengers<br><br>
        <a style="text-align: left; font-weight:bold;">Luggage:</a> 2 large, 2 small<br><br>
        <center> <span class="value">$300</span><span class="price">$250</span><br><br></center>
	

            </article>
               <hr>
                          <section class="one-page" style="background-color: cadetblue;">
                <center>
                        

        <h3>Reservation Form</h3>  
                <form action="action_page.php">
           From: <input type="date" name="from" max="2018-12-31"><br><br>
            Till: <input type="date" name="till" min="2016-01-02"><br><br>
            Comment: <p class="text1"> <textarea name="text" id="comment" placeholder="Comment" required></textarea>
      </p> 
      <input type="submit">
      </form>

      </center>
        </section>
             </section>

</body>
</html>
