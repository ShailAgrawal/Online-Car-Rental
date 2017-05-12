<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact us Page</title>
    </head>
    <body>
        

<link rel="stylesheet" href="css/reset.css" type="text/css" />
<link rel="stylesheet" href="css/styles.css" type="text/css" />


    <header> 
	<div class="width">
    		<h1><a href="/">Car Rental</a></h1>
                
        <nav>
            <ul class="sf-menu dropdown">

            <li><a href="index.jsp"><i class="fa fa-home"></i> Home</a></li>

        <li>    <a href="bookacar.jsp"><i class="fa fa-briefcase"></i> Car & Rates</a></li>
                     
     
    <li>    <a href="registration.jsp"><i class="fa fa-phone"></i> Registration</a></li> 
    <li>    <a href="Customer/customerLogin.jsp"><i class="fa fa-phone"></i> Customer login</a></li>
    <li>  <a href="staff/staffLogin.jsp"><i class="fa fa-phone"></i> Staff Login</a></li>
    
            
            </ul>

			
	<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

        </header>

			
		<form action="http://www.SnapHost.com/captcha/send.aspx" id="ContactUsCaptchaWebForm" method="post" onsubmit="return ValidateForm(this);">
<input name="skip_WhereToSend" type="hidden" value="automotiveservicesms@gmail.com" />
<input name="skip_SnapHostID" type="hidden" value="A9PCQ7CFF63F" />
<input name="skip_WhereToReturn" type="hidden" value="http://localhost:8080/JavaProject/index.jsp" />
<input name="skip_Subject" type="hidden" value="Contact Us Form" />
<input name="skip_ShowUsersIp" type="hidden" value="1" />
<input name="skip_SendCopyToUser" type="hidden" value="1" />
<script type="text/javascript">
    

function ReloadCaptchaImage(captchaImageId) {
var obj = document.getElementById(captchaImageId);
var src = obj.src;
var date = new Date();
var pos = src.indexOf('&rad=');
if (pos >= 0) { src = src.substr(0, pos); }
obj.src = src + '&rad=' + date.getTime();
return false; }
</script>

			
			<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

       
    </header>
           

    <center> <div id="form-div">
    <form class="form" id="form1">
      
      <p class="name">
        <input name="name" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Name" id="name" value="" required>
      </p>
      
      <p class="email">
        <input name="email" type="text" class="validate[required,custom[email]] feedback-input" id="email" placeholder="Email" value="" required>
      </p>
      
      <p class="text">
    <textarea name="text" class="validate[required,length[6,300]] feedback-input" id="comment" placeholder="Comment" required></textarea>
      </p>
      
      <div><tr valign="top"><td> <i>Enter code:</i>

      <center><input name="skip_CaptchaCode" type="text" style="width:80px; height:35px;" maxlength="6" />

      <td>

          
          <a href="#"><img id="CaptchaImage" alt="Contact Us form" title="HTML code for Contact Us form"
                style="margin-left:20px;"
                    src="http://www.SnapHost.com/captcha/CaptchaImage.aspx?id=A9PCQ7CFF63F&ImgType=2" /></a><br />
                       <a href="#" onclick="return ReloadCaptchaImage('CaptchaImage');"><span style="font-size:12px;">reload image</span></a> </td></tr>
       <br><br></center>
      
      <div class="submit">
        <input type="submit" value="SEND" id="button-blue"/>        
        <div class="ease"></div>
      </div>
   
  </div>
    
    

    <section id="content" class="one-column">

    	<div class="clear"></div>
        </div></center>

    
</body>
</html>