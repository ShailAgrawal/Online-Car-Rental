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

             <li class="selected"><a href="staffHome.jsp"><i class="fa fa-home"></i> Home</a></li>

        <li>    <a href="staffCar.jsp"><i class="fa fa-briefcase"></i> Car & Rates</a></li>
                     
    <li>    <a href="staffContact.jsp"><i class="fa fa-phone"></i> Contact Us</a></li> 

       <li>    <a href="staff.jsp"><i class="fa fa-phone"></i> <%= u.getName() %></a></li>
       <li>    <a href="staffPanel.jsp"><i class="fa fa-phone"></i> Staff Panel</a></li>

    <li><a href="../logout.jsp"> Logout</a> </li>

    
            
     </ul>
            
            

			
	<div class="clear"></div>
    		</nav>
       	</div>

	<div class="clear"></div>

        </header>
                    	
		<form action="http://www.SnapHost.com/captcha/send.aspx" id="ContactUsCaptchaWebForm" method="post" onsubmit="return ValidateForm(this);">
<input name="skip_WhereToSend" type="hidden" value="automotiveservicesms@gmail.com" />
<input name="skip_SnapHostID" type="hidden" value="A9PCQ7CFF63F" />
<input name="skip_WhereToReturn" type="hidden" value="http://localhost:8080/JavaProject/staff/staffHome.jsp" />
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
           

  <div id="form-div">
    <form class="form" id="form1">
      
      <p class="name">
        <input name="name" type="text" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" placeholder="Name" id="name" value="" required>
      </p>
      
      <p class="email">
        <input name="email" type="text" class="validate[required,custom[email]] feedback-input" id="email" placeholder="Email" value="" required>
      </p>
      
      <p class="text">
    <textarea name="text" class="validate[required,length[6,300]] feedback-input" id="comment" placeholder="Comment"  required></textarea>
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
    </div>
</body>
</html>