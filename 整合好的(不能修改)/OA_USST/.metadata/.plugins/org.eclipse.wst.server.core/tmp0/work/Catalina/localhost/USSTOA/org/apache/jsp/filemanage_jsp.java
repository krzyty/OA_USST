/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.78
 * Generated at: 2017-07-05 06:54:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.FileDao;
import model.File;
import java.util.*;
import java.lang.*;

public final class filemanage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>文档管理</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//apps.bdimg.com/libs/jqueryui/1.10.4/css/jquery-ui.min.css\">\r\n");
      out.write("<script src=\"//apps.bdimg.com/libs/jquery/1.10.2/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"//apps.bdimg.com/libs/jqueryui/1.10.4/jquery-ui.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/style.css\">\r\n");
      out.write("<script>\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#tabs\").tabs();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction showSearchResult() {\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar str=document.getElementById(\"searchtext\").value;\r\n");
      out.write("\t\r\n");
      out.write("\t\tvar xmlhttp;\r\n");
      out.write("\t\tif (str == \"\") {\r\n");
      out.write("\t\t\tdocument.getElementById(\"txtHint\").innerHTML = \"\";\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif (window.XMLHttpRequest) {\r\n");
      out.write("\t\t\t// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码\r\n");
      out.write("\t\t\txmlhttp = new XMLHttpRequest();\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t// IE6, IE5 浏览器执行代码\r\n");
      out.write("\t\t\txmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\txmlhttp.onreadystatechange = function() {\r\n");
      out.write("\t\t\tif (xmlhttp.readyState == 4 && xmlhttp.status == 200) {\r\n");
      out.write("\t\t\t\tdocument.getElementById(\"txtHint\").innerHTML = xmlhttp.responseText;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\txmlhttp.open(\"POST\", \"fileSearch?fileName=\"+str, true);\r\n");
      out.write("\t\txmlhttp.send();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"tabs\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><a href=\"#fragment-1\"><span>文档上传</span> </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#fragment-2\"><span>文档查看</span> </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#fragment-3\"><span>文档搜索</span> </a></li>\r\n");
      out.write("\t\t\t<li><a href=\"#fragment-4\"><span>回收站</span> </a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div id=\"fragment-1\">\r\n");
      out.write("\t\t\t<form action=\"fileUpload\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t文档名：<input type=\"text\" name=\"fileName\" required><br /> 类 型：<select\r\n");
      out.write("\t\t\t\t\tname=\"fileType\" required>\r\n");
      out.write("\t\t\t\t\t<option value=\"文本\">文本</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"图片\">图片</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"其他\">其他</option>\r\n");
      out.write("\t\t\t\t</select> <br /> 选 择：<input type=\"file\" name=\"fileSrc\" required><br />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"提交\"> <input type=\"reset\"><br />\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"fragment-2\">\r\n");
      out.write("\t\t\t<table border=\"1\" cellspacing=\"0\" width=\"50%\">\r\n");
      out.write("\t\t\t\t<tr align=\"left\">\r\n");
      out.write("\t\t\t\t\t<th>文件名</th>\r\n");
      out.write("\t\t\t\t\t<th>文件类型</th>\r\n");
      out.write("\t\t\t\t\t<th>上传时间</th>\r\n");
      out.write("\t\t\t\t\t<th>文件大小</th>\r\n");
      out.write("\t\t\t\t\t<th>下载</th>\r\n");
      out.write("\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f0_reused = false;
      try {
        _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f0.setParent(null);
        // /filemanage.jsp(82,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setVar("file");
        // /filemanage.jsp(82,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f0.setItems( new FileDao().getAllFiles(((Integer)session.getAttribute("ID")).intValue()) );
        int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
          if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t<tr align=\"left\">\r\n");
              out.write("\t\t\t\t\t\t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileType }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileDate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileSize }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td><a href=\"");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileAddress }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("\">下载地址</a>\r\n");
              out.write("\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t\t<td><a href=\"fileUpdate.jsp?fileID=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("\">修改</a>&nbsp;&nbsp;<a\r\n");
              out.write("\t\t\t\t\t\t\thref=\"fileDelete?fileID=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("\">删除</a>\r\n");
              out.write("\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f0.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
        _jspx_th_c_005fforEach_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
      }
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"fragment-3\">\r\n");
      out.write("\t\t\t<input type=\"text\" name=\"fileName\" required id=\"searchtext\"> <input\r\n");
      out.write("\t\t\t\ttype=\"submit\" value=\"搜索\" onclick=\"showSearchResult()\" ><br />\r\n");
      out.write("\t\t\t<div id=\"txtHint\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"fragment-4\">\r\n");
      out.write("\t\t\t<table border=\"1\" cellspacing=\"0\" width=\"50%\">\r\n");
      out.write("\t\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t<th>文件名</th>\r\n");
      out.write("\t\t\t\t\t<th>文件类型</th>\r\n");
      out.write("\t\t\t\t\t<th>上传时间</th>\r\n");
      out.write("\t\t\t\t\t<th>文件大小</th>\r\n");
      out.write("\t\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      boolean _jspx_th_c_005fforEach_005f1_reused = false;
      try {
        _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
        _jspx_th_c_005fforEach_005f1.setParent(null);
        // /filemanage.jsp(113,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setVar("file");
        // /filemanage.jsp(113,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
        _jspx_th_c_005fforEach_005f1.setItems( new FileDao().getFilesFromGarbage(((Integer)session.getAttribute("ID")).intValue()) );
        int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
        try {
          int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
          if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t\t\t<tr align=\"center\">\r\n");
              out.write("\t\t\t\t\t\t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileType }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileDate }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td>");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileSize }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("</td>\r\n");
              out.write("\t\t\t\t\t\t<td><a href=\"fileRecovery?fileID=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("\">回收</a>&nbsp;&nbsp;<a\r\n");
              out.write("\t\t\t\t\t\t\thref=\"fileThoroughDelete?fileID=");
              out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${file.fileID }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
              out.write("\">彻底删除</a>\r\n");
              out.write("\t\t\t\t\t\t</td>\r\n");
              out.write("\t\t\t\t\t</tr>\r\n");
              out.write("\t\t\t\t");
              int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (java.lang.Throwable _jspx_exception) {
          while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
        } finally {
          _jspx_th_c_005fforEach_005f1.doFinally();
        }
        _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
        _jspx_th_c_005fforEach_005f1_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
      }
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
