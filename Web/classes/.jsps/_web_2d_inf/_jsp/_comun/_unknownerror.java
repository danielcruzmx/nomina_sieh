package _web_2d_inf._jsp._comun;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _unknownerror extends com.orionserver.http.OrionHttpJspPage {


  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _unknownerror page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);
    Throwable exception = (Throwable) request.getAttribute(PageContext.EXCEPTION);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("contextPath");
        __jsp_taghandler_1.setValue("/");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!empty exceptionStackTrace}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[4]);
            {
              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setCode("error.gif");
              try {
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_3.doCatch(th);
              } finally {
                __jsp_taghandler_3.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[5]);
            java.util.Date today;
            synchronized (pageContext) {
              if ((today = (java.util.Date) pageContext.getAttribute( "today", PageContext.PAGE_SCOPE)) == null) {
                today = (java.util.Date) new java.util.Date();
                pageContext.setAttribute( "today", today, PageContext.PAGE_SCOPE);
              }
            }
            out.write(__oracle_jsp_text[6]);
            {
              org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments");
              __jsp_taghandler_4.setParent(__jsp_taghandler_2);
              __jsp_taghandler_4.setCode("unknown.error.text");
              __jsp_taghandler_4.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${today}",java.lang.Object.class, __ojsp_varRes,null));
              try {
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_4.doCatch(th);
              } finally {
                __jsp_taghandler_4.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
            }
            out.write(__oracle_jsp_text[7]);
            {
              org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
              __jsp_taghandler_5.setParent(__jsp_taghandler_2);
              __jsp_taghandler_5.setCode("unknown.error.system.info");
              try {
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_5.doCatch(th);
              } finally {
                __jsp_taghandler_5.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[8]);
            {
              org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
              __jsp_taghandler_6.setParent(__jsp_taghandler_2);
              __jsp_taghandler_6.setCode("unknown.error.help.desk.info");
              try {
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_6.doCatch(th);
              } finally {
                __jsp_taghandler_6.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
            }
            out.write(__oracle_jsp_text[9]);
            {
              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
              __jsp_taghandler_7.setParent(__jsp_taghandler_2);
              __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${exceptionStackTrace}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
            }
            out.write(__oracle_jsp_text[10]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[11]);

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
  private static final char __oracle_jsp_text[][]=new char[12][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    <table width=\"100%\">\r\n        <tr align=\"center\">\r\n          <td>\r\n            <table class=\"unknownerror\">\r\n              <tr>\r\n                <td class=\"error\"><img src=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "\" alt=\"error\" width=\"30\" height=\"30\"></td>\r\n                <td>\r\n                  ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                </td>\r\n              </tr>\r\n              </table>\r\n            </td>\r\n          </tr>\r\n        <tr>\r\n          <td align=\"center\">&nbsp;</td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"center\">Esta informacion es solo para desarrollo...</td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n          <td>\r\n\t    <input name=\"addrows\" type=\"button\" value=\"  +  \" class=\"normal\" onClick=\"document.getElementById('stackTrace').rows = (document.getElementById('stackTrace').rows + 5);\">\r\n\t    <input name=\"delrows\" type=\"button\" value=\"  -  \" class=\"normal\" onClick=\"document.getElementById('stackTrace').rows = (document.getElementById('stackTrace').rows - 5);\">\r\n\t    <input name=\"restorerows\" type=\"button\" value=\"restore\" class=\"normal\" onClick=\"document.getElementById('stackTrace').rows = 40;\">\r\n\t    <br>\r\n            <br>\r\n            <textarea id=\"stackTrace\" cols=\"185\" rows=\"40\" readonly=\"readonly\" wrap=\"OFF\">\r\n              ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n            </textarea>\t  \t\t  \r\n          </td>\r\n        </tr>\r\n      </table>    \r\n".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
