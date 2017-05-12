<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login Page</title>


<link rel="stylesheet" href="css/reset.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" type="text/css" />


<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />

</head>
<body>
<div id="container" class="width">

    <header> 
	<div class="width">
            <h1><a href="index.jsp">Car Rental</a></h1>
                
        <nav>
            <ul class="sf-menu dropdown">

            <li ><a href="../index.jsp"><i class="fa fa-home"></i> Home</a></li>

        <li>    <a href="../bookacar.jsp"><i class="fa fa-briefcase"></i> Car & Rates</a></li>
                     
    <li>    <a href="../contactus.jsp"><i class="fa fa-phone"></i> Contact Us</a></li> 
    <li>    <a href="../registration.jsp"><i class="fa fa-phone"></i> Registration</a></li> 
    
    <li ><a href="#">Customer Login</a>
    <ul>
        <li ><a href="customerLogin.jsp">Customer Login</a></li>
            <li><a href="../staff/staffLogin.jsp">Staff Login</a></li>
            
     </ul></li>
            
            </ul>

			
	<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

        </header>

           
  

    <div id="body" class="width">


<br></br>
		
                            <section class="one-page">
                <center>
                        

        <h3>Customer Login</h3>  
        
        <h5> Invalid email or password </h5>

        <br/> 
        <!--to obtain login information from the user -->
        <form action="loginProcessCustomer.jsp" method="post">  
            Email:<input type="text" name="email" value="" required/><br/><br/>  
            Password:<input type="password" name="password" value="" required/><br/><br/>  
            <input type="submit" value="Login"><br/><br/>
        </form>  
  
   	
        
        
    	        
    	<div class="clear"></div>
        </div>
</div>
</body>
</html>
