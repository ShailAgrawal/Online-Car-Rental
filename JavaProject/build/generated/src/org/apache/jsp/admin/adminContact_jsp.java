package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.StaffDao;
import Bean.User;

public final class adminContact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"<css/reset.css\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/styles.css\" type=\"text/css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Staff Page</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("     ");
 String a = String.valueOf(session.getAttribute("loggedin")); 
                   String id=a; 
                    User u=StaffDao.getRecordById(Integer.parseInt(id));
      out.write(" \n");
      out.write("    <body>\n");
      out.write("        <header> \n");
      out.write("\t<div class=\"width\">\n");
      out.write("    \t\t<h1><a href=\"/\">Wild<strong>Card</strong></a></h1>\n");
      out.write("                \n");
      out.write("        <nav>\n");
      out.write("            <ul class=\"sf-menu dropdown\">\n");
      out.write("\n");
      out.write("            <li class=\"selected\"><a href=\"adminhome.jsp\"><i class=\"fa fa-home\"></i> Home</a></li>\n");
      out.write("\n");
      out.write("        <li>    <a href=\"adminCar.jsp\"><i class=\"fa fa-briefcase\"></i> Car & Rates</a></li>\n");
      out.write("                     \n");
      out.write("    <li>    <a href=\"adminContact.jsp\"><i class=\"fa fa-phone\"></i> Contact Us</a></li> \n");
      out.write("\n");
      out.write("       <li>    <a href=\"admin.jsp\"><i class=\"fa fa-phone\"></i> ");
      out.print( u.getName() );
      out.write("</a></li>\n");
      out.write("\n");
      out.write("    <li><a href=\"logout.jsp\"> Logout</a> </li>\n");
      out.write("\n");
      out.write("    \n");
      out.write("            \n");
      out.write("     </ul>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("    \t\t</nav>\n");
      out.write("       \t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("                    \t\n");
      out.write("\t\t<form action=\"http://www.SnapHost.com/captcha/send.aspx\" id=\"ContactUsCaptchaWebForm\" method=\"post\" onsubmit=\"return ValidateForm(this);\">\n");
      out.write("<input name=\"skip_WhereToSend\" type=\"hidden\" value=\"automotiveservicesms@gmail.com\" />\n");
      out.write("<input name=\"skip_SnapHostID\" type=\"hidden\" value=\"A9PCQ7CFF63F\" />\n");
      out.write("<input name=\"skip_WhereToReturn\" type=\"hidden\" value=\"http://localhost:8080/RegistrationForm/index.html\" />\n");
      out.write("<input name=\"skip_Subject\" type=\"hidden\" value=\"Contact Us Form\" />\n");
      out.write("<input name=\"skip_ShowUsersIp\" type=\"hidden\" value=\"1\" />\n");
      out.write("<input name=\"skip_SendCopyToUser\" type=\"hidden\" value=\"1\" />\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("function ReloadCaptchaImage(captchaImageId) {\n");
      out.write("var obj = document.getElementById(captchaImageId);\n");
      out.write("var src = obj.src;\n");
      out.write("var date = new Date();\n");
      out.write("var pos = src.indexOf('&rad=');\n");
      out.write("if (pos >= 0) { src = src.substr(0, pos); }\n");
      out.write("obj.src = src + '&rad=' + date.getTime();\n");
      out.write("return false; }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"clear\"></div>\n");
      out.write("    \t\t</nav>\n");
      out.write("       \t</div>\n");
      out.write("\n");
      out.write("\t<div class=\"clear\"></div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </header>\n");
      out.write("           \n");
      out.write("\n");
      out.write("  <div id=\"form-div\">\n");
      out.write("    <form class=\"form\" id=\"form1\">\n");
      out.write("      \n");
      out.write("      <p class=\"name\">\n");
      out.write("        <input name=\"name\" type=\"text\" class=\"validate[required,custom[onlyLetter],length[0,100]] feedback-input\" placeholder=\"Name\" id=\"name\" value=\"\" required>\n");
      out.write("      </p>\n");
      out.write("      \n");
      out.write("      <p class=\"email\">\n");
      out.write("        <input name=\"email\" type=\"text\" class=\"validate[required,custom[email]] feedback-input\" id=\"email\" placeholder=\"Email\" value=\"\" required>\n");
      out.write("      </p>\n");
      out.write("      \n");
      out.write("      <p class=\"text\">\n");
      out.write("    <textarea name=\"text\" class=\"validate[required,length[6,300]] feedback-input\" id=\"comment\" placeholder=\"Comment\" value=\"\" required></textarea>\n");
      out.write("      </p>\n");
      out.write("      \n");
      out.write("      <div><tr valign=\"top\"><td> <i>Enter code:</i>\n");
      out.write("\n");
      out.write("      <center><input name=\"skip_CaptchaCode\" type=\"text\" style=\"width:80px; height:35px;\" maxlength=\"6\" />\n");
      out.write("\n");
      out.write("      <td>\n");
      out.write("\n");
      out.write("          \n");
      out.write("          <a href=\"#\"><img id=\"CaptchaImage\" alt=\"Contact Us form\" title=\"HTML code for Contact Us form\"\n");
      out.write("                style=\"margin-left:20px;\"\n");
      out.write("                    src=\"http://www.SnapHost.com/captcha/CaptchaImage.aspx?id=A9PCQ7CFF63F&ImgType=2\" /></a><br />\n");
      out.write("                       <a href=\"#\" onclick=\"return ReloadCaptchaImage('CaptchaImage');\"><span style=\"font-size:12px;\">reload image</span></a> </td></tr>\n");
      out.write("       <br><br></center>\n");
      out.write("      \n");
      out.write("      <div class=\"submit\">\n");
      out.write("        <input type=\"submit\" value=\"SEND\" id=\"button-blue\"/>        \n");
      out.write("        <div class=\"ease\"></div>\n");
      out.write("      </div>\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    <section id=\"content\" class=\"one-column\">\n");
      out.write("\n");
      out.write("    \t<div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
