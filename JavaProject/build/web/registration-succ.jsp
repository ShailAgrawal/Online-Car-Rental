<%-- 
    Document   : registration
    Created on : 14/09/2016, 1:15:53 AM
    Author     : OEM
--%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
    </head>
    <body>
        

<link rel="stylesheet" href="css/reset.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" type="text/css" />


    <header> 
	<div class="width">
    		<h1><a href="/">Wild<strong>Card</strong></a></h1>
                
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

<div id="container" class="width">
    <section class="one-page">

            <center>
	<h1 class="text-center">Registration form</h1>
        </br> <h4> You are successfully registered </h4>
        <section class="one-page">

            <center>
	  	    
	<form class="form-horizontal"  action="registerprocess.jsp" method="post" >
<center>
	  <table style="border-collapse: separate;border-spacing:10px; align-items: center">
                        
                            <tr>
                                <td><label for="name">Full Name</label>
                                <br><input type="text" name="name" placeholder="Full name"  required>
                                </td>
                            </tr>
                            
                            <tr>
                                <td><label for="email">Email</label>
                               <br><input type="email" id="email" name="email" placeholder="example@domain.com" required >
                                </td>
                                
                            </tr>
                            
                            <tr>
                                    <td><label for="password">Create a password</label>
                                        <br><input type="password" id="password" name="password"  required pattern=".{6,}" onchange="form.repassword.pattern = this.value">
                                </td>
                            </tr>
                            <tr>
                                <td><label for="repassword">Confirm your password</label>
                                    <br><input type="password" id="repassword" name="repassword" required> 
                                </td>
                            </tr>
                            
                            
                                    
                                
                                <td>
                                    <label for="payrate">Age</label>
                                    <br><input type="number" id="age" name="age" required>
                                </td>
                            </tr>
                           
                           
                       
                    </table>
              
                    <br><p><input 
                           class="buttom" name="submit" id="submit" value="Register" type="submit"></p>
</center>
	</form>
                
            </center>
	</div>
    </body>
</html>
