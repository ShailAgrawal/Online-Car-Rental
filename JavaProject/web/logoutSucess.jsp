<%-- 
    Document   : logoutSuccess
    Created on : 8/09/2016, 12:19:34 AM
    Author     : OEM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Car Rental</title>


<link rel="stylesheet" href="css/reset.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" type="text/css" />

<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />

</head>
<body>
    
    <header> 
	<div class="width">
    		<h1><a href="index.jsp">Car Rental</a></h1>
                
       <nav>
            <ul class="sf-menu dropdown">

            <li class="selected"><a href="index.jsp"><i class="fa fa-home"></i> Home</a></li>

        <li>    <a href="bookacar.jsp"><i class="fa fa-briefcase"></i> Car & Rates</a></li>
                     
    <li>    <a href="contactus.jsp"><i class="fa fa-phone"></i> Contact Us</a></li> 
    <li>    <a href="registration.jsp"><i class="fa fa-phone"></i> Registration</a></li> 
    
    <li><a href="#"> Sign in</a>
    <ul>
        <li><a href="Customer/customerLogin.jsp">Customer Login</a></li>
            <li><a href="staff/staffLogin.jsp">Staff Login</a></li>
            
     </ul></li>
            
            </ul>

			
	<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

        </header>
    
     <div class="boxed" style="float: left;">
				
			<h4>Thank you!</h4>

                        <p>You have successfully logout.Click here to go back to <a href="index.jsp">HomePage</p>
	</div>
		


</body>
</html>
