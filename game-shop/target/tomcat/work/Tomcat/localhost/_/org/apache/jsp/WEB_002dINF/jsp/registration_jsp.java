/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-11 10:04:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/registration.css", Long.valueOf(1491209273471L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("   \r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Website CSS style -->\r\n");
      out.write("\t\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Website Font style -->\r\n");
      out.write("\t    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\t\t<!-- Google Fonts -->\r\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("    \t\t");
      out.write("/*\r\n");
      out.write("/* Created by Filipe Pina\r\n");
      out.write(" * Specific styles of signin, register, component\r\n");
      out.write(" */\r\n");
      out.write("/*\r\n");
      out.write(" * General styles\r\n");
      out.write(" */\r\n");
      out.write("/* #playground-container {\r\n");
      out.write("\theight: 100px;\r\n");
      out.write("\toverflow: hidden !important;\r\n");
      out.write("\t-webkit-overflow-scrolling: touch;\r\n");
      out.write("} */\r\n");
      out.write("\r\n");
      out.write("body, html {\r\n");
      out.write("\theight: auto;\r\n");
      out.write("\tbackground-repeat: no-repeat;\r\n");
      out.write("\tbackground: url(https://i.ytimg.com/vi/4kfXjatgeEU/maxresdefault.jpg);\r\n");
      out.write("\tfont-family: 'Oxygen', sans-serif;\r\n");
      out.write("\tbackground-size: cover;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write(".main {\r\n");
      out.write("\tmargin-top:50px;\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("    margin-right: 50px;\r\n");
      out.write("    margin-left: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" h5 {\r\n");
      out.write("    align-text:center;\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("\tfont-family: 'Passion One', cursive;\r\n");
      out.write("\tfont-weight: 400;\r\n");
      out.write("\tcolor:#ffffff;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-group {\r\n");
      out.write("\tmargin-top: 5%;\r\n");
      out.write("    margin-bottom: 5%;\r\n");
      out.write("    margin-right: 5%;\r\n");
      out.write("    margin-left: 5%;\r\n");
      out.write("}\r\n");
      out.write(" \r\n");
      out.write("label {\r\n");
      out.write("\tmargin-bottom: auto;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(" input, input::-webkit-input-placeholder {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tpadding-top: 10px;\r\n");
      out.write("\tcolor:#ffffff\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write(".main-login {\r\n");
      out.write("\tbackground-color: #353535;\r\n");
      out.write("\t/* shadows and rounded borders */\r\n");
      out.write("\t-moz-border-radius: 5px;\r\n");
      out.write("\t-webkit-border-radius: 5px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\t-moz-box-shadow: 0px 0.5px 0.5px rgba(0, 0, 0, 0.3);\r\n");
      out.write("\t-webkit-box-shadow: 0px 0.5px 0.5px rgba(0, 0, 0, 0.3);\r\n");
      out.write("\tbox-shadow: 0px 0.5px 0.5px rgba(0, 0, 0, 0.3);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control {\r\n");
      out.write("\theight: auto !important;\r\n");
      out.write("\tpadding: 10px 100px !important;\r\n");
      out.write("\tmargin-top: auto;\r\n");
      out.write("    margin-bottom: auto;\r\n");
      out.write("    margin-right: auto;\r\n");
      out.write("    margin-left: auto;\r\n");
      out.write("    background: #363636;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-group {\r\n");
      out.write("\t-webkit-box-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.21) !important;\r\n");
      out.write("\t-moz-box-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.21) !important;\r\n");
      out.write("\t box-shadow: 0px 2px 4px 0px rgba(0, 0, 0, 0.21) !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("\tmargin-top: 1%;\r\n");
      out.write("    margin-bottom: 2%;\r\n");
      out.write("    margin-right: 10%;\r\n");
      out.write("    margin-left: 40%;\r\n");
      out.write("  \tdisplay: inline-block;\r\n");
      out.write("  \tpadding: 15px 25px;\r\n");
      out.write("  \tfont-size: 15px;\r\n");
      out.write(" \t cursor: pointer;\r\n");
      out.write("  \ttext-align: center;\r\n");
      out.write("  \ttext-decoration: none;\r\n");
      out.write("  \toutline: none;\r\n");
      out.write("  \tcolor: #fff;\r\n");
      out.write("  \tbackground-color: #4CAF50;\r\n");
      out.write(" \t border: none;\r\n");
      out.write("  \tborder-radius: 15px;\r\n");
      out.write("  \tbox-shadow: 0 3px #004000;\r\n");
      out.write("}\r\n");
      out.write(".button:hover {background-color: #3e8e41}\r\n");
      out.write("\r\n");
      out.write(".button:active {\r\n");
      out.write("  background-color: #3e8e41;\r\n");
      out.write("  box-shadow: 0 2px #666;\r\n");
      out.write("  transform: translateY(4px);\r\n");
      out.write("}\r\n");
      out.write(".main-center {\r\n");
      out.write("\tmargin-top: 600px;\r\n");
      out.write("\tmargin: auto auto;\r\n");
      out.write("\tmax-width: 400px;\r\n");
      out.write("\tpadding: 40px 80px;\r\n");
      out.write("\tbackground: #353535;\r\n");
      out.write("\tcolor: #ffffff;\r\n");
      out.write("\ttext-shadow: none;\r\n");
      out.write("\t -webkit-box-shadow: 0px 3px 5px 0px rgba(0, 0, 0, 0.31);\r\n");
      out.write("\t-moz-box-shadow: 0px 3px 5px 0px rgba(0, 0, 0, 0.31);\r\n");
      out.write("\tbox-shadow: 0px 3px 5px 0px rgba(0, 0, 0, 0.31); \r\n");
      out.write("}\r\n");
      out.write(".p-container{\r\n");
      out.write("\tcolor:#fffffd\r\n");
      out.write("}\r\n");
      out.write("span.input-group-addon i {\r\n");
      out.write("\tcolor: #808080;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-button {\r\n");
      out.write("\tmargin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".login-register {\r\n");
      out.write("\tfont-size: 16px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("\t\t</style> \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>Admin</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row main\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"main-login main-center\">\r\n");
      out.write("\t\t\t\t<h5>Sign up once and watch any of our games.</h5>\r\n");
      out.write("\t\t\t\t\t<form  action=\"/registration\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-users fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\"  placeholder=\"Enter your Username\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"fname\" id=\"fname\"  placeholder=\"Enter your First Name\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-user fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"lname\" id=\"lname\"  placeholder=\"Enter your Last Name\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-envelope fa\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name=\"email\" id=\"email\"  placeholder=\"Enter your Email\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"cols-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"input-group-addon\"><i class=\"fa fa-lock fa-lg\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\"  placeholder=\"Enter your Password\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"p-container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tname=\"checkbox\" ><i></i>I agree to the Terms and\r\n");
      out.write("\t\t\t\t\t\t\t\t\tConditions</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\"  class=\"button\">Sign Me Up></button>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}