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
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        org.apache.struts.taglib.logic.PresentTag __jsp_taghandler_1=(org.apache.struts.taglib.logic.PresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.PresentTag.class,"org.apache.struts.taglib.logic.PresentTag name");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("stackTrace");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[6]);
            {
              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setCode("error.gif");
              try {
                __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_2.doCatch(th);
              } finally {
                __jsp_taghandler_2.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
            out.write(__oracle_jsp_text[7]);
            java.util.Date today;
            synchronized (pageContext) {
              if ((today = (java.util.Date) pageContext.getAttribute( "today", PageContext.PAGE_SCOPE)) == null) {
                today = (java.util.Date) new java.util.Date();
                pageContext.setAttribute( "today", today, PageContext.PAGE_SCOPE);
              }
            }
            out.write(__oracle_jsp_text[8]);
            {
              org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class,"org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag value type pattern var scope");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setValue((java.util.Date)oracle.jsp.runtime.OracleJspRuntime.evaluate("${today}",java.util.Date.class, __ojsp_varRes,null));
              __jsp_taghandler_3.setType("date");
              __jsp_taghandler_3.setPattern("ddMMyyyy-HHmmssZ");
              __jsp_taghandler_3.setVar("formatedToday");
              __jsp_taghandler_3.setScope("page");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[9]);
            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_4=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag arg0 key");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setArg0((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${formatedToday}",java.lang.String.class, __ojsp_varRes,null));
              __jsp_taghandler_4.setKey("unknown.error.text");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
            }
            out.write(__oracle_jsp_text[10]);
            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_5=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setKey("unknown.error.system.info");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[11]);
            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setKey("unknown.error.help.desk.info");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
            }
            out.write(__oracle_jsp_text[12]);
            out.print(request.getAttribute("stackTrace"));
            out.write(__oracle_jsp_text[13]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[14]);

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
  private static final char __oracle_jsp_text[][]=new char[15][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    <table width=\"100%\">\r\n        <tr align=\"center\">\r\n          <td>\r\n            <table class=\"unknownerror\">\r\n              <tr>\r\n                <td class=\"error\"><img src=\"".toCharArray();
    __oracle_jsp_text[7] = 
    "\" alt=\"error\" width=\"30\" height=\"30\"></td>\r\n                <td>\r\n                  ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                </td>\r\n              </tr>\r\n              </table>\r\n            </td>\r\n          </tr>\r\n        <tr>\r\n          <td align=\"center\">&nbsp;</td>\r\n        </tr>\r\n        <tr>\r\n          <td align=\"center\">Esta informacion es solo para desarrollo...</td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n          <td>\r\n\t    <input name=\"addrows\" type=\"button\" value=\"  +  \" class=\"normal\" onClick=\"document.getElementById('stackTrace').rows = (document.getElementById('stackTrace').rows + 5);\">\r\n\t    <input name=\"delrows\" type=\"button\" value=\"  -  \" class=\"normal\" onClick=\"document.getElementById('stackTrace').rows = (document.getElementById('stackTrace').rows - 5);\">\r\n\t    <input name=\"restorerows\" type=\"button\" value=\"restore\" class=\"normal\" onClick=\"document.getElementById('stackTrace').rows = 40;\">\r\n\t    <br>\r\n            <br>\r\n            <textarea id=\"stackTrace\" cols=\"185\" rows=\"40\" readonly=\"readonly\" wrap=\"OFF\">\r\n              ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n            </textarea>\t  \t\t  \r\n          </td>\r\n        </tr>\r\n      </table>    \r\n".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
