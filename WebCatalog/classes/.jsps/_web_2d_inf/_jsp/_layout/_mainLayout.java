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
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("msgFullNameApp");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            out.write(__oracle_jsp_text[8]);
            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_2=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setKey("main.header.system.name");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[9]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[10]);
      {
        _oracle._jsp._tag._parameter_tag __jsp_taghandler_3=(_oracle._jsp._tag._parameter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._parameter_tag.class, pageContext);
        __jsp_taghandler_3.setJspContext(pageContext);
        __jsp_taghandler_3.setName("MAIN_HEADER_SYSTEM_FULL_NAME");
        __jsp_taghandler_3.setType("string");
        __jsp_taghandler_3.setVar("fullNameApp");
        __jsp_taghandler_3.setDefaultValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${msgFullNameApp}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_3.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
      }
      out.write(__oracle_jsp_text[11]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setVar("msgNameApp");
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
          do {
            out.write(__oracle_jsp_text[12]);
            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_5=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_5.setParent(__jsp_taghandler_4);
              __jsp_taghandler_5.setKey("main.header.application.name");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[13]);
          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[14]);
      {
        _oracle._jsp._tag._parameter_tag __jsp_taghandler_6=(_oracle._jsp._tag._parameter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._parameter_tag.class, pageContext);
        __jsp_taghandler_6.setJspContext(pageContext);
        __jsp_taghandler_6.setName("MAIN_HEADER_APPLICATION_NAME");
        __jsp_taghandler_6.setType("string");
        __jsp_taghandler_6.setVar("nameApp");
        __jsp_taghandler_6.setDefaultValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${msgNameApp}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_6.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
      }
      out.write(__oracle_jsp_text[15]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${fullNameApp}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[16]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${nameApp}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[17]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_9=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute ignore");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setAttribute("javaScript");
        __jsp_taghandler_9.setIgnore(true);
        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
      }
      out.write(__oracle_jsp_text[18]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_10=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute ignore");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setAttribute("htmlHeader");
        __jsp_taghandler_10.setIgnore(true);
        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[19]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_11=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setAttribute("header");
        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
      }
      out.write(__oracle_jsp_text[20]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_12=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
        __jsp_taghandler_12.setParent(null);
        __jsp_taghandler_12.setAttribute("message");
        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
      }
      out.write(__oracle_jsp_text[21]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_13=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setAttribute("body");
        __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
        if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
      }
      out.write(__oracle_jsp_text[22]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_14=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
        __jsp_taghandler_14.setParent(null);
        __jsp_taghandler_14.setAttribute("footer");
        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
      }
      out.write(__oracle_jsp_text[23]);
      {
        org.apache.struts.taglib.tiles.InsertTag __jsp_taghandler_15=(org.apache.struts.taglib.tiles.InsertTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.InsertTag.class,"org.apache.struts.taglib.tiles.InsertTag attribute");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setAttribute("nocache");
        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
      }
      out.write(__oracle_jsp_text[24]);

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
  private static final char __oracle_jsp_text[][]=new char[25][];
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
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n     ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n     ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n  <head>\r\n    <title>.:".toCharArray();
    __oracle_jsp_text[16] = 
    "&nbsp;".toCharArray();
    __oracle_jsp_text[17] = 
    ":.</title>\r\n    <META HTTP-EQUIV=\"Content-Type\" CONTENT=\"text/html;charset=ISO_8859-1\"/>\r\n    <META HTTP-EQUIV=\"Pragma\" CONTENT=\"no-cache\"/>\r\n    <META HTTP-EQUIV=\"Expires\" CONTENT=\"0\"/>\r\n    <META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-cache\"/>\r\n    <META HTTP-EQUIV=\"Cache-Control\" CONTENT=\"no-store\"/>\r\n    <base target=\"_self\"/>\r\n    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n  </head>\r\n  <body>\r\n      <table width=\"100%\" align=\"center\">\r\n        <tr> <!--Header-->\r\n          <td>\r\n            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n          </td>\r\n        </tr>        \r\n      </table>\r\n      <table width=\"100%\" align=\"center\">\r\n        <tr> <!--Body-->\r\n          <td align=\"center\">\r\n            <table class=\"body\">\r\n              <tr>\r\n                <td>\r\n                  ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                </td>\r\n              </tr>\r\n            </table>\r\n          </td>\r\n        </tr>\r\n      </table>\r\n      <table width=\"100%\" align=\"center\">\r\n        <tr> <!--Footer-->\r\n          <td align=\"center\">\r\n            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n          </td>\r\n        </tr>\r\n      </table>\r\n  </body>\r\n  ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n</html>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
