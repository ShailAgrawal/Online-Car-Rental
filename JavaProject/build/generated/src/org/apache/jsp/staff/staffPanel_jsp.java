package org.apache.jsp.staff;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html lang=\"en\"><head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"payment page\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Car Rental - Manager page</title>\n");
      out.write("\n");
      out.write("    <link href=\"http://ntectestinglevel5.rf.gd/testapp/assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"http://ntectestinglevel5.rf.gd/testapp/assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"http://ntectestinglevel5.rf.gd/testapp/assets/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link media=\"all\" type=\"text/css\" rel=\"stylesheet\" href=\"http://ntectestinglevel5.rf.gd/testapp/assets/css/bootstrap-formhelpers.min.css\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/js/jquery-1.11.2.min.js\"></script>\n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/js/bootstrap-formhelpers.min.js\"></script>\n");
      out.write("\t\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/themes/flexigrid/css/flexigrid.css\">\n");
      out.write(" \n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/css/jquery_plugins/fancybox/jquery.fancybox.css\">\n");
      out.write(" \n");
      out.write("    <link type=\"text/css\" rel=\"stylesheet\" href=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/css/ui/simple/jquery-ui-1.10.1.custom.min.css\">\n");
      out.write(" \n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery-1.11.1.min.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.noty.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/config/jquery.noty.config.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/common/lazyload-min.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/common/list.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/themes/flexigrid/js/cookies.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/themes/flexigrid/js/flexigrid.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.form.min.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.numeric.min.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/themes/flexigrid/js/jquery.printElement.min.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.fancybox-1.3.4.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/jquery.easing-1.3.pack.js\"></script>\n");
      out.write(" \n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/grocery_crud/js/jquery_plugins/ui/jquery-ui-1.10.3.custom.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("     <style>\n");
      out.write("      body {\n");
      out.write("        padding-top: 20px;\n");
      out.write("        padding-bottom: 20px;\n");
      out.write("        background-image: url(\"http://ntectestinglevel5.rf.gd/testapp/assets/pics/003-subtle-light-pattern-background-texture-vol5.jpg\");\n");
      out.write("        background-color: #FFFFFF;  \n");
      out.write("      }\n");
      out.write("      .navbar {\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .line {\n");
      out.write("        background-color: #666666;\n");
      out.write("        content: \"\";\n");
      out.write("        display: inline-block;\n");
      out.write("        height: 3px;\n");
      out.write("        position: relative;\n");
      out.write("        vertical-align: middle;\n");
      out.write("        width: 30px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("   @media print {\n");
      out.write("    .MapToPrint {\n");
      out.write("        background-color: white;\n");
      out.write("        height: 100%;\n");
      out.write("        width: 100%;\n");
      out.write("        position: fixed;\n");
      out.write("        top: 0;\n");
      out.write("        left: 0;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 15px;\n");
      out.write("        font-size: 14px;\n");
      out.write("        line-height: 18px;\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("   \n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("  \t<div class=\"container\">\n");
      out.write("      <nav class=\"navbar navbar-default\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <div class=\"navbar-header\">\n");
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" href=\"http://ntectestinglevel5.rf.gd/testapp/manager\">Admin</a>\n");
      out.write("          </div>\n");
      out.write("          <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li><a href=\"http://ntectestinglevel5.rf.gd/testapp/manager\">Home</a></li>\n");
      out.write("\n");
      out.write("               \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Manager <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                  <li><a href=\"http://ntectestinglevel5.rf.gd/testapp/manager/cars\">Cars</a></li>\n");
      out.write("                  <li><a href=\"http://ntectestinglevel5.rf.gd/testapp/manager/orders\">Orders</a></li>\n");
      out.write("                  <li><a href=\"http://ntectestinglevel5.rf.gd/testapp/manager/reports\">Reports</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\">Staff <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                  <li><a href=\"http://ntectestinglevel5.rf.gd/testapp/\">Web Site</a></li>\n");
      out.write("                  <li><a href=\"http://ntectestinglevel5.rf.gd/testapp/home/logout\">Logout</a></li>\n");
      out.write("                </ul>\n");
      out.write("              </li>  \n");
      out.write("                       \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("          </div><!--/.nav-collapse -->\n");
      out.write("        </div><!--/.container-fluid -->\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panel panel-default\">\n");
      out.write("  <div class=\"panel-heading\">Admin Page</div>\n");
      out.write("  <div class=\"panel-body\">\n");
      out.write("    Welcome\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("    <script src=\"http://ntectestinglevel5.rf.gd/testapp/assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("  \n");
      out.write("</body></html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
