/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-13 16:36:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import com.game.dataBase.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/jsp/header.jsp", Long.valueOf(1494330300625L));
    _jspx_dependants.put("/WEB-INF/jsp/header.css", Long.valueOf(1491154501495L));
    _jspx_dependants.put("/WEB-INF/jsp/footer.jsp", Long.valueOf(1491152158850L));
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <style>\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #444444;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".descriere h5 {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("hr {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\tsize: 100px;\r\n");
      out.write("}\r\n");
      out.write("@import url(//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css);\r\n");
      out.write("\r\n");
      out.write("fieldset, label { margin: 0; padding: 0; }\r\n");
      out.write("body{ margin: 20px; }\r\n");
      out.write("h1 { font-size: 1.5em; margin: 10px; }\r\n");
      out.write("\r\n");
      out.write("/****** Style Star Rating Widget *****/\r\n");
      out.write("\r\n");
      out.write(".rating { \r\n");
      out.write("  border: none;\r\n");
      out.write("  float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rating > input { display: none; } \r\n");
      out.write(".rating > label:before { \r\n");
      out.write("  margin: 5px;\r\n");
      out.write("  font-size: 1.25em;\r\n");
      out.write("  font-family: FontAwesome;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  content: \"\\f005\";\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rating > .half:before { \r\n");
      out.write("  content: \"\\f089\";\r\n");
      out.write("  position: absolute;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".rating > label { \r\n");
      out.write("  color: #ddd; \r\n");
      out.write(" float: right; \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/***** CSS Magic to Highlight Stars on Hover *****/\r\n");
      out.write("\r\n");
      out.write(".rating > input:checked ~ label, /* show gold star when clicked */\r\n");
      out.write(".rating:not(:checked) > label:hover, /* hover current star */\r\n");
      out.write(".rating:not(:checked) > label:hover ~ label { color: #FFD700;  } /* hover previous stars in list */\r\n");
      out.write("\r\n");
      out.write(".rating > input:checked + label:hover, /* hover current star when changing rating */\r\n");
      out.write(".rating > input:checked ~ label:hover,\r\n");
      out.write(".rating > label:hover ~ input:checked ~ label, /* lighten current selection */\r\n");
      out.write(".rating > input:checked ~ label:hover ~ label { color: #FFED85;  } \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");

Connection conn = DaoMVC.connection();
Statement statement = conn.createStatement() ;
ResultSet resultset = statement.executeQuery("select * from produs ") ; 

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(" \r\n");
      out.write("    ");
      out.write("/* Add a dark background color with a little bit see-through */\r\n");
      out.write(".navbar\r\n");
      out.write("{\r\n");
      out.write("    font-size: 15px !important;\r\n");
      out.write("\r\n");
      out.write("    margin-bottom: 0;\r\n");
      out.write("\r\n");
      out.write("    letter-spacing: 4px;\r\n");
      out.write("\r\n");
      out.write("    opacity: .9;\r\n");
      out.write("    border: 0;\r\n");
      out.write("    background-color: #252525;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add a gray color to all navbar links */\r\n");
      out.write(".navbar li a,\r\n");
      out.write(".navbar .navbar-brand\r\n");
      out.write("{\r\n");
      out.write("    color: #ffffff!important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* On hover, the links will turn white */\r\n");
      out.write(".navbar-nav li a:hover\r\n");
      out.write("{\r\n");
      out.write("    color: #ffffff!important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* The active link */\r\n");
      out.write(".navbar-nav li.active a\r\n");
      out.write("{\r\n");
      out.write("    color: #ffffff!important;\r\n");
      out.write("    background-color: #400000!important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Remove border color from the collapsible button */\r\n");
      out.write(".navbar-default .navbar-toggle\r\n");
      out.write("{\r\n");
      out.write("    border-color: transparent;\r\n");
      out.write("}");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("</style> \r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"/home\">Jocuri Pentru Toti</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <ul class=\"nav navbar-nav\">\r\n");
      out.write("     \t<li><a href=\"/home\"><span class=\"glyphicon glyphicon-home\"style=\"font-size:20px\"></span> Home </a></li>\r\n");
      out.write("        <li class=\"dropdown\">\r\n");
      out.write("        <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Categori\r\n");
      out.write("        <span class=\"caret\"></span></a>\r\n");
      out.write("        <ul class=\"dropdown-menu\">\r\n");
      out.write("          <li><a href=\"#\">Page 1-1</a></li>\r\n");
      out.write("          <li><a href=\"#\">Page 1-2</a></li>\r\n");
      out.write("          <li><a href=\"#\">Page 1-3</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"/registration\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("      <li><a href=\"/login\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"navbar-form navbar-left\">\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\r\n");
      out.write("      </div>\r\n");
      out.write("       <button type=\"submit\" class=\"btn btn-info\">\r\n");
      out.write("      \t\t<span class=\"glyphicon glyphicon-search\"></span> Search\r\n");
      out.write("    \t</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br><br><br><br><br><br>\r\n");
      out.write("<h1 style=\"text-align: center;color:white\" >Product Name!!!!!!!!!!!</h1>\r\n");
      out.write("<br><br><br>\r\n");
      out.write("\t<div class=\"container-fluid text-center\">\r\n");
      out.write("\t\t<div class=\"row content\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-6 text-left\">\r\n");
      out.write("\t\t\t\t<div class=\"imagineProdus\">\r\n");
      out.write("\r\n");
      out.write("   \t\t\t\t\t<img src=\"http://3.bp.blogspot.com/-NCUItQJE_ms/T2tsj-IR-jI/AAAAAAAAAwM/JImx5n5xbJA/s1600/Angry+Birds+Space+Download.png\">\r\n");
      out.write("    \t\t\t\t</img>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t<h2 style=\"color: white;\">Detali Produs</h2>\r\n");
      out.write("\t\t\t\t<p style=\"color:white;\"> Multeeeeee detaliii pentru fiecare produs in parte</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-3 text-left\">\r\n");
      out.write("\t\t\t\t<h1 style=\"color:white;\">Star Rating</h1>\r\n");
      out.write("\t\t\t\t<fieldset class=\"rating\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"star5\" name=\"rating\" value=\"5\" /><label\r\n");
      out.write("\t\t\t\t\t\tclass=\"full\" for=\"star5\" title=\"Awesome - 5 stars\"></label> \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"star4\" name=\"rating\" value=\"4\" /><label\r\n");
      out.write("\t\t\t\t\t\tclass=\"full\" for=\"star4\" title=\"Pretty good - 4 stars\"></label> \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"3\" /><label\r\n");
      out.write("\t\t\t\t\t\tclass=\"full\" for=\"star3\" title=\"Meh - 3 stars\"></label>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"star2\" name=\"rating\" value=\"2\" /><label\r\n");
      out.write("\t\t\t\t\t\tclass=\"full\" for=\"star2\" title=\"Kinda bad - 2 stars\"></label> \r\n");
      out.write("\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" id=\"star1\" name=\"rating\" value=\"1\" /><label\r\n");
      out.write("\t\t\t\t\t\tclass=\"full\" for=\"star1\" title=\"Sucks big time - 1 star\"></label>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2 sidenav\">\r\n");
      out.write("\t\t\t\t<div class=\"well\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-md\"><span class=\"fa fa-cart-plus\"style=\"font-size:20px\"></span> Adauga In Cos</button>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"well\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-md\"><span class=\"fa fa-heart-o\"style=\"font-size:20px\"></span>Adauga La Favorite</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"descriere\">\r\n");
      out.write("\t\t\t<h3>Produse asemanatoare:</h3>\r\n");
      out.write("\t\t\t<br><br><br>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/product\" target=\"_blank\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://static2.gamespot.com/uploads/screen_kubrick/1493/14930800/2412115-2204529282-tekke.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Lights\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Tekken Tag Tournament 2</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/product\" target=\"_blank\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"http://www.handy-games.com/wp-content/uploads/2015/11/handy-games-1944-burning-bridges-android-google-play-new-game-release-1280x720.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Nature\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>1944 Burning Bridges</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/product\" target=\"_blank\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"http://www.handy-games.com/wp-content/uploads/2015/02/handy-games-1942-pacific-front-android-google-play-new-game-release-1280x720.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Fjords\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Pacific Front</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"/product\" target=\"_blank\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"https://heavyeditorial.files.wordpress.com/2016/03/maxresdefault2.jpg?quality=65&strip=all\"\r\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Fjords\" style=\"width: 100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"caption\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Stand Storm-Pirates Wars</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("   \t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<br><br><br>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  a,h3{\r\n");
      out.write("  \tcolor:white;\r\n");
      out.write("  }\r\n");
      out.write("  footer{\r\n");
      out.write("  background:#444444;\r\n");
      out.write("  \r\n");
      out.write("  }\r\n");
      out.write("  </style>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm-3\" >\r\n");
      out.write("\t\t<h3>Servicii clienti</h3>\r\n");
      out.write("\t\t\t<a href=\"#\">Garantie</a> <br>\r\n");
      out.write("\t\t\t<a href=\"#\">Deschidere Colet</a> <br>\r\n");
      out.write("\t\t\t<a href=\"#\">Plata </a> <br>\r\n");
      out.write("\t\t\t<a href=\"#\">Drept de return </a><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"col-sm-4\" >\r\n");
      out.write("\t<h3>Comenzi si livrare</h3>\r\n");
      out.write("\t\t\t<a href=\"#\">Cum Comand?</a> <br>\r\n");
      out.write("\t\t\t<a href=\"#\">Livrare comenzi</a> <br>\r\n");
      out.write("\t\t\t<a href=\"#\">Cont client </a> <br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"col-sm-3\" >\r\n");
      out.write("    \t<h3>Suport clienti</h3>\r\n");
      out.write("\t\t\t<a href=\"#\">Formular returnare produs</a> <br>\r\n");
      out.write("\t\t\t<a href=\"#\">Intrebari</a> <br>\r\n");
      out.write("\t\t\t<a href=\"#\">Formular clienti </a> <br>\r\n");
      out.write("\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-0\" >\r\n");
      out.write("    \t<h3>Site</h3>\r\n");
      out.write("\t\t\t<a href=\"#\">Termeni si conditii</a> <br>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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