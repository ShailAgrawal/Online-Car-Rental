package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Corvette_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Book Car</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("    <header> \n");
      out.write("\t<div class=\"width\">\n");
      out.write("    \t\t<h1><a href=\"/\">Wild<strong>Card</strong></a></h1>\n");
      out.write("                \n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"sf-menu dropdown\">\n");
      out.write("\n");
      out.write("            <li><a href=\"index.jsp\"><i class=\"fa fa-home\"></i> Home</a></li>\n");
      out.write("\n");
      out.write("        <li class=\"selected\">    <a href=\"bookacar.jsp\"><i class=\"fa fa-briefcase\"></i> Car & Rates</a></li>\n");
      out.write("                     \n");
      out.write("    <li>    <a href=\"contactus.jsp\"><i class=\"fa fa-phone\"></i> Contact Us</a></li> \n");
      out.write("    <li>    <a href=\"registration.jsp\"><i class=\"fa fa-phone\"></i> Registration</a></li> \n");
      out.write("    \n");
      out.write("    <li><a href=\"#\"> Sign in</a>\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"customerLogin.jsp\">Customer Login</a></li>\n");
      out.write("            <li><a href=\"staffLogin.jsp\">Staff Login</a></li>\n");
      out.write("            \n");
      out.write("     </ul></li>\n");
      out.write("            \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("    \t\t</nav>\n");
      out.write("       \t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<section id=\"content\" class=\"one-column\">\n");
      out.write("\n");
      out.write("\t    <article>\n");
      out.write("\t\t\t\n");
      out.write("                            <ul class=\"rig columns-4\">\n");
      out.write("\t\n");
      out.write("         <li>\n");
      out.write("\t\t<center><a href=\"#\"><img src=\"images/sports.jpg\"></a> <br>\n");
      out.write("\t\t<h4>Porsche</h4></center><hr><br>\n");
      out.write("         <a style=\"text-align: left; font-weight:bold;\">Description:</a> Automatic transmission. It’s sharp, it’s street smart, it’s everything you need. Airconditioning, multi airbags, ABS brakes, USB & AUX plugs.<br><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\"> Year:</a> 2013 to 2015<br><br>\n");
      out.write("        \n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Capacity:</a> 2 Passengers<br><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Luggage:</a> 2 large, 2 small<br><br>\n");
      out.write("       \n");
      out.write("        <center> <span class=\"value\">$300</span><span class=\"price\">$250</span><br><br>\n");
      out.write("   \n");
      out.write("\t</li>\n");
      out.write("\t <li>\n");
      out.write("\t\t<center><a href=\"#\"><img src=\"images/royce.jpeg\"></a> <br>\n");
      out.write("\t\t<h4>Rolls Royce</h4></center><br>\n");
      out.write("             <a style=\"text-align: left; font-weight:bold;\">Description:</a> Automatic transmission. It’s sharp, it’s street smart, it’s everything you need. Airconditioning, multi airbags, ABS brakes, USB & AUX plugs.<br><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\"> Year:</a> 2013 to 2015<br><br>\n");
      out.write("        \n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Capacity:</a> 2 Passengers<br><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Luggage:</a> 2 large, 2 small<br><br>\n");
      out.write("       \n");
      out.write("        <center> <span class=\"value\">$300</span><span class=\"price\">$250</span><br><br>\n");
      out.write("\t</li>\n");
      out.write("\t\t <li>\n");
      out.write("                     <center><a href=\"#\"><img src=\"images/bugati.jpg\"></a> <br>\n");
      out.write("\t\t<h4>Buggati</h4></center><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Description:</a> Automatic transmission. It’s sharp, it’s street smart, it’s everything you need. Airconditioning, multi airbags, ABS brakes, USB & AUX plugs.<br><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\"> Year:</a> 2013 to 2015<br><br>\n");
      out.write("        \n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Capacity:</a> 2 Passengers<br><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Luggage:</a> 2 large, 2 small<br><br>\n");
      out.write("       <center> <span class=\"value\">$300</span><span class=\"price\">$250</span><br><br>\n");
      out.write("\t</li>\n");
      out.write("        \n");
      out.write("         <li>\n");
      out.write("\t\t<center><a href=\"#\"><img src=\"images/corvette.jpg\"></a> <br>\n");
      out.write("\t\t<h4>Corvette</h4></center><br>\n");
      out.write("      \n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Description:</a> Automatic transmission. It’s sharp, it’s street smart, it’s everything you need. Airconditioning, multi airbags, ABS brakes, USB & AUX plugs.<br><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\"> Year:</a> 2013 to 2015<br><br>\n");
      out.write("        \n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Capacity:</a> 2 Passengers<br><br>\n");
      out.write("        <a style=\"text-align: left; font-weight:bold;\">Luggage:</a> 2 large, 2 small<br><br>\n");
      out.write("       <center> <span class=\"value\">$300</span><span class=\"price\">$250</span><br><br>\n");
      out.write("\t</li>   \n");
      out.write("</ul>\n");
      out.write("            </article>\n");
      out.write("            <hr>\n");
      out.write("                          <section class=\"one-page\" style=\"background-color: cadetblue;\">\n");
      out.write("                <center>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("        <h3>Reservation Form</h3>  \n");
      out.write("                <form action=\"action_page.php\">\n");
      out.write("           From: <input type=\"date\" name=\"from\" max=\"2018-12-31\"><br><br>\n");
      out.write("            Till: <input type=\"date\" name=\"till\" min=\"2016-01-02\"><br><br>\n");
      out.write("            Comment: <p class=\"text1\"> <textarea name=\"text\" id=\"comment\" placeholder=\"Comment\" required></textarea>\n");
      out.write("      </p>\n");
      out.write("            <input type=\"submit\">\n");
      out.write("</form>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("               \n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
