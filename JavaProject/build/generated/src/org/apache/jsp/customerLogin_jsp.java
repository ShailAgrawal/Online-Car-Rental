package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>AutomotiveSMS</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\" type=\"text/css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, minimum-scale=1.0, maximum-scale=1.0\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"container\" class=\"width\">\n");
      out.write("\n");
      out.write("    <header> \n");
      out.write("\t<div class=\"width\">\n");
      out.write("            <h1><a href=\"/\">Wild<strong>Card</strong></a></h1>\n");
      out.write("                \n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"sf-menu dropdown\">\n");
      out.write("\n");
      out.write("            <li class=\"selected\"><a href=\"index.jsp\"><i class=\"fa fa-home\"></i> Home</a></li>\n");
      out.write("\n");
      out.write("        <li>    <a href=\"bookacar.jsp\"><i class=\"fa fa-briefcase\"></i> Car & Rates</a></li>\n");
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
      out.write("           \n");
      out.write("  \n");
      out.write("\n");
      out.write("    <div id=\"body\" class=\"width\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<br></br>\n");
      out.write("\t\t\n");
      out.write("                            <section class=\"one-page\">\n");
      out.write("                <center>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("        <h3>Customer Login</h3>  \n");
      out.write("\n");
      out.write("        <br/> \n");
      out.write("        <!--to obtain login information from the user -->\n");
      out.write("        <form action=\"loginProcess.jsp\" method=\"post\">  \n");
      out.write("            Email:<input type=\"text\" name=\"email\" value=\"\" required/><br/><br/>  \n");
      out.write("            Password:<input type=\"password\" name=\"password\" value=\"\" required/><br/><br/>  \n");
      out.write("            <input type=\"submit\" value=\"Login\"><br/><br/>\n");
      out.write("        </form>  \n");
      out.write("  \n");
      out.write("   \t\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \t        \n");
      out.write("    \t<div class=\"clear\"></div>\n");
      out.write("        </div>\n");
      out.write("</div>\n");
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
