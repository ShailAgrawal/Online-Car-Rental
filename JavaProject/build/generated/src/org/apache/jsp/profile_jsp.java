package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UserDao;
import Bean.User;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
 String a = String.valueOf(session.getAttribute("loggedin")); 
                   String id=a; 
                    User u=UserDao.getRecordById(Integer.parseInt(id));
      out.write(" \n");
      out.write("    <header> \n");
      out.write("\t<div class=\"width\">\n");
      out.write("    \t\t<h1><a href=\"/\">Wild<strong>Card</strong></a></h1>\n");
      out.write("                \n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"sf-menu dropdown\">\n");
      out.write("\n");
      out.write("            <li class=\"selected\"><a href=\"index.jsp\"><i class=\"fa fa-home\"></i> Home</a></li>\n");
      out.write("\n");
      out.write("     <li>    <a href=\"aboutus.jsp\"><i class=\"fa fa-info\"></i> Services</a></li>\n");
      out.write("\n");
      out.write("    <li>    <a href=\"bookacar.jsp\"><i class=\"fa fa-briefcase\"></i> Book Now</a></li>\n");
      out.write("                     \n");
      out.write("    <li>    <a href=\"contactus.jsp\"><i class=\"fa fa-phone\"></i> Contact Us</a></li> \n");
      out.write("     <li> <a>");
      out.print( u.getName() );
      out.write("</a></li>\n");
      out.write("      <li> <a></a></li>\n");
      out.write("    <li><a href=\"logout.jsp\"> Logout</a>\n");
      out.write("        \n");
      out.write("    \n");
      out.write("            \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("\t\t\t \n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("    \t\t</nav>\n");
      out.write("       \t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"page-banner\" style=\"background-image: url('images/car.jpg')\">\n");
      out.write("                    <div class=\"page-banner__content has-large-heading h1\">\n");
      out.write("                        \n");
      out.write("                        <h1>Rent Exclusive Car</h1>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("        \n");
      out.write("        <section id=\"content\" class=\"one-column\">\n");
      out.write("\n");
      out.write("\t    <article>\n");
      out.write("\t\t\t\n");
      out.write("                            <ul class=\"rig columns-3\">\n");
      out.write("\t<li>\n");
      out.write("\t\t<center><a href=\"#\"><img src=\"images/changeoil_1.jpg\">\n");
      out.write("\t\t<h3>Change Oil</h3></center>\n");
      out.write("\t\t\n");
      out.write("                            </li>\n");
      out.write("\t<li>\n");
      out.write("\t\t<center><a href=\"#\"><img src=\"images/WOF.jpg\">\n");
      out.write("\t\t<h3>Warranty of Fitness</h3></center>\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("        <li>\n");
      out.write("\t\t<center><a href=\"#\"><img src=\"images/mechanic_1.jpg\">\n");
      out.write("\t\t<h3>Wheel Alignment</h3></center>\n");
      out.write("\t</li>\n");
      out.write("\t</ul>\n");
      out.write("</ul>\n");
      out.write("            </article>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \t<div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <footer class=\"width\">\n");
      out.write("        <div class=\"footer-content\">\n");
      out.write("            <ul>\n");
      out.write("                \n");
      out.write("                <li><h4>ALINA AQUINO</h4> <a href=\"#\"><img src=\"images/alina.png\" alt=\"alina\" style=\"width:160px;height:160px;\"></li>    \n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            <ul>\n");
      out.write("            \t<li><h4>SARAH GAMBOA</h4> <a href=\"#\"><img src=\"images/sarah.png\" alt=\"sarah\" style=\"width:160px;height:160px;\"></li>\n");
      out.write("            </ul>\n");
      out.write(" \t    <ul>\n");
      out.write("                <li><h4>MICHELLE PAJIMULA</h4><a href=\"#\"><img src=\"images/mich.png\" alt=\"michelle\" style=\"width:160px;height:160px;\"></li></li>\n");
      out.write("                \n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            <ul class=\"endfooter\">\n");
      out.write("            \t<li><h4>Rate Us</h4></li>\n");
      out.write("                \n");
      out.write("\n");
      out.write("<div class=\"social-icons\">\n");
      out.write("\n");
      out.write("<a href=\"#\"><img src=\"images/Ntec-Logo.png\" style=\"width:100px;height:100px;\"></a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-bottom\">\n");
      out.write("            <p>&copy; Automotive Services Management System by Alina.Sarah.Michelle</p>\n");
      out.write("         </div>\n");
      out.write("    </footer>\n");
      out.write("</div>\n");
      out.write("\t\t\t\t\n");
      out.write("        </form>  \n");
      out.write("    </center>\n");
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
