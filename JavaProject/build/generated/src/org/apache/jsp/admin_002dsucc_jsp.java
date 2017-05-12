package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.StaffDao;
import dao.UserDao;
import Bean.User;

public final class admin_002dsucc_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Staff Page</title>\n");
      out.write("    </head>\n");
      out.write("     ");
 String a = String.valueOf(session.getAttribute("loggedin")); 
                   String id=a; 
                    User u=StaffDao.getRecordById(Integer.parseInt(id));
      out.write(" \n");
      out.write("    <body>\n");
      out.write("                    <article class=\"content color\" style=\"background-color: white;\">\n");
      out.write("    \t\t\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <form id=\"contactform\" action=\"adminupdateinfo.jsp\" method=\"post\"> \n");
      out.write("                    <input type=\"hidden\" name=\"id\" value=\"");
      out.print( u.getId() );
      out.write("\" />\n");
      out.write("                 \n");
      out.write("                    <h3> Profile </h3>\n");
      out.write("                    <br>\n");
      out.write("                    <h4> Your Profile has been updated <strong> Successfully</strong>...</h4>\n");
      out.write("                    <table style=\"border-collapse: separate;border-spacing:10px;\">\n");
      out.write("                        \n");
      out.write(" <tr>\n");
      out.write("                                <td><label for=\"name\">Full Name</label>\n");
      out.write("                                <br><input type=\"text\" name=\"name\" value=\"");
      out.print( u.getName() );
      out.write("\" required>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td><label for=\"email\">Email</label>\n");
      out.write("                               <br><input type=\"email\" id=\"email\" name=\"email\" value=\"");
      out.print( u.getEmail() );
      out.write("\" required >\n");
      out.write("                                </td>\n");
      out.write("                                                               \n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                                              \n");
      out.write("                                <td><label for=\"password\">password</label>\n");
      out.write("                                    <br><input type=\"password\" id=\"password\" name=\"password\" value=\"");
      out.print( u.getPassword() );
      out.write("\" required>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>                                            \n");
      out.write("                           \n");
      out.write("                       \n");
      out.write("                    </table>\n");
      out.write("              \n");
      out.write("                    <br><p><input \n");
      out.write("                           class=\"buttom\" name=\"submit\" id=\"submit\" value=\"Save\" type=\"submit\"></p>  \t \n");
      out.write("   </form> \n");
      out.write("</article> \n");
      out.write("    </body>\n");
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
