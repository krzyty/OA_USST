/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.78
 * Generated at: 2017-07-05 06:27:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>上海理工大学办公自动化系统登录界面</title>\r\n");
      out.write("<style>\r\n");
      out.write("html,body {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("\tfont: 12px 'Lucida Sans Unicode', 'Trebuchet MS', Arial, Helvetica;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tbackground-color: #d9dee2;\r\n");
      out.write("\tbackground-image: -webkit-gradient(linear, left top, left bottom, from(#ebeef2),\r\n");
      out.write("\t\tto(#d9dee2) );\r\n");
      out.write("\tbackground-image: -webkit-linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("\tbackground-image: -moz-linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("\tbackground-image: -ms-linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("\tbackground-image: -o-linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("\tbackground-image: linear-gradient(top, #ebeef2, #d9dee2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login {\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("\tbackground-image: -webkit-gradient(linear, left top, left bottom, from(#fff),\r\n");
      out.write("\t\tto(#eee) );\r\n");
      out.write("\tbackground-image: -webkit-linear-gradient(top, #fff, #eee);\r\n");
      out.write("\tbackground-image: -moz-linear-gradient(top, #fff, #eee);\r\n");
      out.write("\tbackground-image: -ms-linear-gradient(top, #fff, #eee);\r\n");
      out.write("\tbackground-image: -o-linear-gradient(top, #fff, #eee);\r\n");
      out.write("\tbackground-image: linear-gradient(top, #fff, #eee);\r\n");
      out.write("\theight: 240px;\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\tmargin: -150px 0 0 -230px;\r\n");
      out.write("\tpadding: 30px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 50%;\r\n");
      out.write("\tleft: 50%;\r\n");
      out.write("\tz-index: 0;\r\n");
      out.write("\t-moz-border-radius: 3px;\r\n");
      out.write("\t-webkit-border-radius: 3px;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\t-webkit-box-shadow: 0 0 2px rgba(0, 0, 0, 0.2), 0 1px 1px\r\n");
      out.write("\t\trgba(0, 0, 0, .2), 0 3px 0 #fff, 0 4px 0 rgba(0, 0, 0, .2), 0 6px 0\r\n");
      out.write("\t\t#fff, 0 7px 0 rgba(0, 0, 0, .2);\r\n");
      out.write("\t-moz-box-shadow: 0 0 2px rgba(0, 0, 0, 0.2), 1px 1px 0 rgba(0, 0, 0, .1),\r\n");
      out.write("\t\t3px 3px 0 rgba(255, 255, 255, 1), 4px 4px 0 rgba(0, 0, 0, .1), 6px 6px\r\n");
      out.write("\t\t0 rgba(255, 255, 255, 1), 7px 7px 0 rgba(0, 0, 0, .1);\r\n");
      out.write("\tbox-shadow: 0 0 2px rgba(0, 0, 0, 0.2), 0 1px 1px rgba(0, 0, 0, .2), 0\r\n");
      out.write("\t\t3px 0 #fff, 0 4px 0 rgba(0, 0, 0, .2), 0 6px 0 #fff, 0 7px 0\r\n");
      out.write("\t\trgba(0, 0, 0, .2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#login:before {\r\n");
      out.write("\tcontent: '';\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tz-index: -1;\r\n");
      out.write("\tborder: 1px dashed #ccc;\r\n");
      out.write("\ttop: 5px;\r\n");
      out.write("\tbottom: 5px;\r\n");
      out.write("\tleft: 5px;\r\n");
      out.write("\tright: 5px;\r\n");
      out.write("\t-moz-box-shadow: 0 0 0 1px #fff;\r\n");
      out.write("\t-webkit-box-shadow: 0 0 0 1px #fff;\r\n");
      out.write("\tbox-shadow: 0 0 0 1px #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1 {\r\n");
      out.write("\ttext-shadow: 0 1px 0 rgba(255, 255, 255, .7), 0px 2px 0\r\n");
      out.write("\t\trgba(0, 0, 0, .5);\r\n");
      out.write("\ttext-transform: uppercase;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tcolor: #666;\r\n");
      out.write("\tmargin: 0 0 30px 0;\r\n");
      out.write("\tletter-spacing: 4px;\r\n");
      out.write("\tfont: normal 26px/1 Verdana, Helvetica;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1:after,h1:before {\r\n");
      out.write("\tbackground-color: #777;\r\n");
      out.write("\tcontent: \"\";\r\n");
      out.write("\theight: 1px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\ttop: 15px;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1:after {\r\n");
      out.write("\tbackground-image: -webkit-gradient(linear, left top, right top, from(#777),\r\n");
      out.write("\t\tto(#fff) );\r\n");
      out.write("\tbackground-image: -webkit-linear-gradient(left, #777, #fff);\r\n");
      out.write("\tbackground-image: -moz-linear-gradient(left, #777, #fff);\r\n");
      out.write("\tbackground-image: -ms-linear-gradient(left, #777, #fff);\r\n");
      out.write("\tbackground-image: -o-linear-gradient(left, #777, #fff);\r\n");
      out.write("\tbackground-image: linear-gradient(left, #777, #fff);\r\n");
      out.write("\tright: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1:before {\r\n");
      out.write("\tbackground-image: -webkit-gradient(linear, right top, left top, from(#777),\r\n");
      out.write("\t\tto(#fff) );\r\n");
      out.write("\tbackground-image: -webkit-linear-gradient(right, #777, #fff);\r\n");
      out.write("\tbackground-image: -moz-linear-gradient(right, #777, #fff);\r\n");
      out.write("\tbackground-image: -ms-linear-gradient(right, #777, #fff);\r\n");
      out.write("\tbackground-image: -o-linear-gradient(right, #777, #fff);\r\n");
      out.write("\tbackground-image: linear-gradient(right, #777, #fff);\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("fieldset {\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#inputs input {\r\n");
      out.write("\tbackground: #f1f1f1 url(http://www.mycodes.net/login-sprite.png)\r\n");
      out.write("\t\tno-repeat;\r\n");
      out.write("\tpadding: 15px 15px 15px 30px;\r\n");
      out.write("\tmargin: 0 0 10px 0;\r\n");
      out.write("\twidth: 353px; /* 353 + 2 + 45 = 400 */\r\n");
      out.write("\tborder: 1px solid #ccc;\r\n");
      out.write("\t-moz-border-radius: 5px;\r\n");
      out.write("\t-webkit-border-radius: 5px;\r\n");
      out.write("\tborder-radius: 5px;\r\n");
      out.write("\t-moz-box-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;\r\n");
      out.write("\tbox-shadow: 0 1px 1px #ccc inset, 0 1px 0 #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#username {\r\n");
      out.write("\tbackground-position: 5px -2px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#password {\r\n");
      out.write("\tbackground-position: 5px -52px !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#inputs input:focus {\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("\tborder-color: #e8c291;\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\t-moz-box-shadow: 0 0 0 1px #e8c291 inset;\r\n");
      out.write("\t-webkit-box-shadow: 0 0 0 1px #e8c291 inset;\r\n");
      out.write("\tbox-shadow: 0 0 0 1px #e8c291 inset;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#actions {\r\n");
      out.write("\tmargin: 25px 0 0 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#submit {\r\n");
      out.write("\tbackground-color: #ffb94b;\r\n");
      out.write("\tbackground-image: -webkit-gradient(linear, left top, left bottom, from(#fddb6f),\r\n");
      out.write("\t\tto(#ffb94b) );\r\n");
      out.write("\tbackground-image: -webkit-linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("\tbackground-image: -moz-linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("\tbackground-image: -ms-linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("\tbackground-image: -o-linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("\tbackground-image: linear-gradient(top, #fddb6f, #ffb94b);\r\n");
      out.write("\t-moz-border-radius: 3px;\r\n");
      out.write("\t-webkit-border-radius: 3px;\r\n");
      out.write("\tborder-radius: 3px;\r\n");
      out.write("\ttext-shadow: 0 1px 0 rgba(255, 255, 255, 0.5);\r\n");
      out.write("\t-moz-box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0\r\n");
      out.write("\t\trgba(255, 255, 255, 0.3) inset;\r\n");
      out.write("\t-webkit-box-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0\r\n");
      out.write("\t\trgba(255, 255, 255, 0.3) inset;\r\n");
      out.write("\tbox-shadow: 0 0 1px rgba(0, 0, 0, 0.3), 0 1px 0 rgba(255, 255, 255, 0.3)\r\n");
      out.write("\t\tinset;\r\n");
      out.write("\tborder-width: 1px;\r\n");
      out.write("\tborder-style: solid;\r\n");
      out.write("\tborder-color: #d69e31 #e3a037 #d5982d #e3a037;\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\twidth: 120px;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("\tfont: bold 15px Arial, Helvetica;\r\n");
      out.write("\tcolor: #8f5a0a;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#submit:hover,#submit:focus {\r\n");
      out.write("\tbackground-color: #fddb6f;\r\n");
      out.write("\tbackground-image: -webkit-gradient(linear, left top, left bottom, from(#ffb94b),\r\n");
      out.write("\t\tto(#fddb6f) );\r\n");
      out.write("\tbackground-image: -webkit-linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("\tbackground-image: -moz-linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("\tbackground-image: -ms-linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("\tbackground-image: -o-linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("\tbackground-image: linear-gradient(top, #ffb94b, #fddb6f);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#submit:active {\r\n");
      out.write("\toutline: none;\r\n");
      out.write("\t-moz-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;\r\n");
      out.write("\t-webkit-box-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;\r\n");
      out.write("\tbox-shadow: 0 1px 4px rgba(0, 0, 0, 0.5) inset;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#submit::-moz-focus-inner {\r\n");
      out.write("\tborder: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#actions a {\r\n");
      out.write("\tcolor: #3151A2;\r\n");
      out.write("\tfloat: right;\r\n");
      out.write("\tline-height: 35px;\r\n");
      out.write("\tmargin-left: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#back {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\ttop: 60px;\r\n");
      out.write("\tcolor: #999;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<form id=\"login\" action=\"login\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h1>Log In</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t<fieldset id=\"inputs\">\r\n");
      out.write("\t\t\t<input id=\"username\" name=\"id\" type=\"text\" placeholder=\"ID\" autofocus required> \r\n");
      out.write("\t\t\t<input id=\"password\" name=\"password\" type=\"password\" placeholder=\"PASSWORD\" required>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t<fieldset id=\"actions\">\r\n");
      out.write("\t\t\t<input type=\"submit\" id=\"submit\" value=\"Log in\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp \r\n");
      out.write("\t\t\t\t\t<input type=\"radio\"name=\"role\" value=\"user\" checked=\"checked\" />用户 &nbsp&nbsp&nbsp \r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"role\" value=\"admin\" />管理员 <!-- <a href=\"\">忘记密码?</a> -->\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t<a id=\"back\">©2017上海理工大学办公自动化系统.All rights reserved.</a>\r\n");
      out.write("\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t<div style=\"clear:both\"></div>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
