
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
<html lang="en"><head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="payment page">
    <meta name="author" content="">

    <title>Car Rental - Manager page</title>

    <link href="http://ntectestinglevel5.rf.gd/testapp/assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="http://ntectestinglevel5.rf.gd/testapp/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="http://ntectestinglevel5.rf.gd/testapp/assets/css/font-awesome.min.css" rel="stylesheet">
    <link media="all" type="text/css" rel="stylesheet" href="http://ntectestinglevel5.rf.gd/testapp/assets/css/bootstrap-formhelpers.min.css">
    <style type="text/css">

    </style>
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/js/ie-emulation-modes-warning.js"></script>
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/js/jquery-1.11.2.min.js"></script>
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/js/bootstrap.min.js"></script>

    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/js/bootstrap-formhelpers.min.js"></script>
	
      <link type="text/css" rel="stylesheet" href="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/themes/flexigrid/css/flexigrid.css">
 
    <link type="text/css" rel="stylesheet" href="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/css/jquery_plugins/fancybox/jquery.fancybox.css">
 
    <link type="text/css" rel="stylesheet" href="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/css/ui/simple/jquery-ui-1.10.1.custom.min.css">
 
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery-1.11.1.min.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.noty.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/config/jquery.noty.config.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/common/lazyload-min.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/common/list.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/themes/flexigrid/js/cookies.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/themes/flexigrid/js/flexigrid.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.form.min.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.numeric.min.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/themes/flexigrid/js/jquery.printElement.min.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.fancybox-1.3.4.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.easing-1.3.pack.js"></script>
 
    <script src="http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/ui/jquery-ui-1.10.3.custom.min.js"></script>


    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

     <style>
      body {
        padding-top: 20px;
        padding-bottom: 20px;
        background-image: url("http://ntectestinglevel5.rf.gd/testapp/assets/pics/003-subtle-light-pattern-background-texture-vol5.jpg");
        background-color: #FFFFFF;  
      }
      .navbar {
        margin-bottom: 20px;
      }

      .line {
        background-color: #666666;
        content: "";
        display: inline-block;
        height: 3px;
        position: relative;
        vertical-align: middle;
        width: 30px;
      }

   @media print {
    .MapToPrint {
        background-color: white;
        height: 100%;
        width: 100%;
        position: fixed;
        top: 0;
        left: 0;
        margin: 0;
        padding: 15px;
        font-size: 14px;
        line-height: 18px;
    }
  }
   
    </style>


  </head>

  <body>
  	<div class="container">
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand">Staff</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li><a href="../staff/staffHome.jsp" >Home</a></li>

               
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Manager <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a >Cars</a></li>
                  <li><a >Orders</a></li>
                  <li><a >Reports</a></li>
                </ul>
              </li>
            </ul>

            


 
            <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" >Staff <span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                  <li><a href="../staff/staffHome.jsp">Web Site</a></li>
                  <li><a href="../logout.jsp">Logout</a></li>
                </ul>
              </li>  
                       
            </ul>



          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>


<div class="panel panel-default">
  <div class="panel-heading">Staff Page</div>
  <div class="panel-body">
    Welcome
  </div>
</div>
</div>
   
  
</body></html>