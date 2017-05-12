package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.UserDao;
import dao.StaffDao;
import java.util.List;
import Bean.User;

public final class adminPanelUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write('\n');
      out.write('\n');
 String a = String.valueOf(session.getAttribute("loggedin")); 
                   String id=a; 
                    User u=StaffDao.getRecordById(Integer.parseInt(id));
                    
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);

  if(session.getAttribute("loggedin")==null)
      response.sendRedirect("../index.jsp");

  
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("<html lang=\"en\"><head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"payment page\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Car Rental - Admin panel</title>\n");
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
      out.write("        padding-bottom: 20p\n");
      out.write("        background-color: #FFFFFF;  \n");
      out.write("      }\n");
      out.write("      .navbar {\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .line {\n");
      out.write("        background-color: black;\n");
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
      out.write("        background-color: black;\n");
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
      out.write("            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\">\n");
      out.write("              <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("              <span class=\"icon-bar\"></span>\n");
      out.write("            </button>\n");
      out.write("            <a class=\"navbar-brand\" >Admin</a>\n");
      out.write("          </div>\n");
      out.write("          <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("              <li><a href=\"/admin/adminhome.jsp\" >Home</a></li>\n");
      out.write("\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\">Admin <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                  <li><a href=\"adminPanelUsers.jsp\" >Users</a></li>\n");
      out.write("                \n");
      out.write("                </ul>\n");
      out.write("              </li>\n");
      out.write("             \n");
      out.write("            <li class=\"dropdown\">\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" >Manager <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                  <li><a >Cars</a></li>\n");
      out.write("                  <li><a >Orders</a></li>\n");
      out.write("                  <li><a >Reports</a></li>\n");
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
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" >Administrator <span class=\"caret\"></span></a>\n");
      out.write("                <ul class=\"dropdown-menu\" role=\"menu\">\n");
      out.write("                  <li><a href=\"../admin/adminhome.jsp\" >Web Site</a></li>\n");
      out.write("                  <li><a href = ../logout.jsp>Logout</a></li>\n");
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
      out.write("    ");
  
            List<User> list=StaffDao.getAllRecords();  
            request.setAttribute("list",list);  
            
      out.write("  \n");
      out.write("\n");
      out.write("<table style=\"text-align: center\" border=\"1\" width=\"90%\">  \n");
      out.write("    <h4> Staff User List</h4>\n");
      out.write("    <tr><th style=\"text-align: center\" >Id</th>\n");
      out.write("    <th style=\"text-align: center\">Name</th>\n");
      out.write("    <th style=\"text-align: center\">Email</th>\n");
      out.write("    <th style=\"text-align: center\">Password</th>\n");
      out.write("<th style=\"text-align: center\">Edit</th>\n");
      out.write("<th style=\"text-align: center\">Delete</th></tr>\n");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("</table>  \n");
      out.write("            \n");
      out.write("             ");
  
            List<User> list1=UserDao.getAllRecords();  
            request.setAttribute("list1",list1);  
            
      out.write("  \n");
      out.write("\n");
      out.write("<table style=\"text-align: center\" border=\"1\" width=\"90%\">  \n");
      out.write("    <h4> Customer User List</h4>\n");
      out.write("    <tr><th style=\"text-align: center\" >Id</th>\n");
      out.write("    <th style=\"text-align: center\">Name</th>\n");
      out.write("    <th style=\"text-align: center\">Email</th>\n");
      out.write("    <th style=\"text-align: center\">Password</th>\n");
      out.write("<th style=\"text-align: center\">Edit</th>\n");
      out.write("<th style=\"text-align: center\">Delete</th></tr>\n");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("</table>  \n");
      out.write("   \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("u");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("<tr><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getPassword()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td><a style=\" color: #666ec5\" href=\"editStaff.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a></td>  \n");
          out.write("<td><a style=\" color: #666ec5\" href=\"deletestaff.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a></td></tr>  \n");
          out.write("\n");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("u");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("  \n");
          out.write("<tr><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td><td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getPassword()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("    <td><a style=\" color: #666ec5\" href=\"editCustomer.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Edit</a></td>  \n");
          out.write("<td><a style=\" color: #666ec5\" href=\"deleteCustomer.jsp?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${u.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Delete</a></td></tr>  \n");
          out.write("\n");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
