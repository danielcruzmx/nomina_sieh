package _web_2d_inf._jsp._layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _mainLayout extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=ISO_8859-1");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, "/unknownError.do", true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _mainLayout page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.tiles.jsp.taglib.InsertAttributeTag __jsp_taghandler_1=(org.apache.tiles.jsp.taglib.InsertAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.tiles.jsp.taglib.InsertAttributeTag.class,"org.apache.tiles.jsp.taglib.InsertAttributeTag name ignore");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("javaScript");
        __jsp_taghandler_1.setIgnore(true);
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.tiles.jsp.taglib.InsertAttributeTag __jsp_taghandler_2=(org.apache.tiles.jsp.taglib.InsertAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.tiles.jsp.taglib.InsertAttributeTag.class,"org.apache.tiles.jsp.taglib.InsertAttributeTag name ignore");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setName("htmlHeader");
        __jsp_taghandler_2.setIgnore(true);
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setCode("main.header.system.name");
        try {
          __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
          if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_3.doCatch(th);
        } finally {
          __jsp_taghandler_3.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setCode("main.header.application.name");
        try {
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_4.doCatch(th);
        } finally {
          __jsp_taghandler_4.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.tiles.jsp.taglib.InsertAttributeTag __jsp_taghandler_5=(org.apache.tiles.jsp.taglib.InsertAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.tiles.jsp.taglib.InsertAttributeTag.class,"org.apache.tiles.jsp.taglib.InsertAttributeTag name");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setName("header");
        try {
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_5.doCatch(th);
        } finally {
          __jsp_taghandler_5.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.tiles.jsp.taglib.InsertAttributeTag __jsp_taghandler_6=(org.apache.tiles.jsp.taglib.InsertAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.tiles.jsp.taglib.InsertAttributeTag.class,"org.apache.tiles.jsp.taglib.InsertAttributeTag name");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setName("message");
        try {
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_6.doCatch(th);
        } finally {
          __jsp_taghandler_6.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.tiles.jsp.taglib.InsertAttributeTag __jsp_taghandler_7=(org.apache.tiles.jsp.taglib.InsertAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.tiles.jsp.taglib.InsertAttributeTag.class,"org.apache.tiles.jsp.taglib.InsertAttributeTag name");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setName("body");
        try {
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_7.doCatch(th);
        } finally {
          __jsp_taghandler_7.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[11]);
      {
        org.apache.tiles.jsp.taglib.InsertAttributeTag __jsp_taghandler_8=(org.apache.tiles.jsp.taglib.InsertAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.tiles.jsp.taglib.InsertAttributeTag.class,"org.apache.tiles.jsp.taglib.InsertAttributeTag name");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setName("footer");
        try {
          __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
          if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_8.doCatch(th);
        } finally {
          __jsp_taghandler_8.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[12]);
      {
        org.apache.tiles.jsp.taglib.InsertAttributeTag __jsp_taghandler_9=(org.apache.tiles.jsp.taglib.InsertAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.tiles.jsp.taglib.InsertAttributeTag.class,"org.apache.tiles.jsp.taglib.InsertAttributeTag name");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setName("nocache");
        try {
          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
          if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_9.doCatch(th);
        } finally {
          __jsp_taghandler_9.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
      }
      out.write(__oracle_jsp_text[13]);

    }
    catch (Throwable e) {
      if (!(e instanceof javax.servlet.jsp.SkipPageException)){
        try {
          if (out != null) out.clear();
        }
        catch (Exception clearException) {
        }
        pageContext.handlePageException(e);
      }
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext, true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static final char __oracle_jsp_text[][]=new char[14][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n  <head>\r\n    <META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html;charset=ISO_8859-1\"/>\r\n    <META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\"/>\r\n    <META HTTP-EQUIV=\"Expires\" CONTENT=\"0\"/>\r\n    <META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-cache\"/>\r\n    <META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-store\"/>\r\n    <META HTTP-EQUIV=\"X-UA-Compatible\" CONTENT=\"IE=8\" />\r\n    <base target=\"_self\"/>\r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    <title>.:".toCharArray();
    __oracle_jsp_text[7] = 
    "&nbsp;".toCharArray();
    __oracle_jsp_text[8] = 
    ":.</title>\r\n  </head>\r\n  <body>\r\n      <table width=\"100%\" align=\"center\">\r\n        <tr> <!--Header-->\r\n          <td>\r\n            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n          </td>\r\n        </tr>        \r\n      </table>\r\n      <table width=\"100%\" align=\"center\">\r\n        <tr> <!--Body-->\r\n          <td align=\"center\">\r\n            <table class=\"body\">\r\n              <tr>\r\n                <td>\r\n                  ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                </td>\r\n              </tr>\r\n            </table>\r\n          </td>\r\n        </tr>\r\n      </table>\r\n      <table width=\"100%\" align=\"center\">\r\n        <tr> <!--Footer-->\r\n          <td align=\"center\">\r\n            ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n          </td>\r\n        </tr>\r\n      </table>\r\n  </body>\r\n  ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n</html>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
