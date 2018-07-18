package _web_2d_inf._jsp._layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _message extends com.orionserver.http.OrionHttpJspPage {


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
    _message page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.struts.taglib.logic.PresentTag __jsp_taghandler_1=(org.apache.struts.taglib.logic.PresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.PresentTag.class,"org.apache.struts.taglib.logic.PresentTag name");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName(OracleJspRuntime.toStr( gob.shcp.catalog.core.common.util.CatalogConstants.REQUEST_ACTION_ERRORS));
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[4]);
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
            out.write(__oracle_jsp_text[5]);
            {
              org.apache.struts.taglib.html.ErrorsTag __jsp_taghandler_3=(org.apache.struts.taglib.html.ErrorsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.ErrorsTag.class,"org.apache.struts.taglib.html.ErrorsTag");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[6]);
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.struts.taglib.logic.NotPresentTag __jsp_taghandler_4=(org.apache.struts.taglib.logic.NotPresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.NotPresentTag.class,"org.apache.struts.taglib.logic.NotPresentTag name");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setName(OracleJspRuntime.toStr( gob.shcp.catalog.core.common.util.CatalogConstants.REQUEST_ACTION_ERRORS));
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[8]);
            {
              org.apache.struts.taglib.logic.PresentTag __jsp_taghandler_5=(org.apache.struts.taglib.logic.PresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.PresentTag.class,"org.apache.struts.taglib.logic.PresentTag name");
              __jsp_taghandler_5.setParent(__jsp_taghandler_4);
              __jsp_taghandler_5.setName("javax.servlet.error.exception");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[9]);
                  {
                    org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_6.setCode("error.gif");
                    try {
                      __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                      if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                    } catch (Throwable th) {
                      __jsp_taghandler_6.doCatch(th);
                    } finally {
                      __jsp_taghandler_6.doFinally();
                    }
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,3);
                  }
                  out.write(__oracle_jsp_text[10]);
                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_7=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                    __jsp_taghandler_7.setName("javax.servlet.error.exception");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                  }
                  out.write(__oracle_jsp_text[11]);
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
            }
            out.write(__oracle_jsp_text[12]);
            {
              org.apache.struts.taglib.logic.PresentTag __jsp_taghandler_8=(org.apache.struts.taglib.logic.PresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.PresentTag.class,"org.apache.struts.taglib.logic.PresentTag name");
              __jsp_taghandler_8.setParent(__jsp_taghandler_4);
              __jsp_taghandler_8.setName(OracleJspRuntime.toStr( gob.shcp.catalog.core.common.util.CatalogConstants.REQUEST_ACTION_WARNINGS));
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[13]);
                  {
                    org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                    __jsp_taghandler_9.setCode("warn.gif");
                    try {
                      __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                      if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                    } catch (Throwable th) {
                      __jsp_taghandler_9.doCatch(th);
                    } finally {
                      __jsp_taghandler_9.doFinally();
                    }
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                  }
                  out.write(__oracle_jsp_text[14]);
                  {
                    org.apache.struts.taglib.html.MessagesTag __jsp_taghandler_10=(org.apache.struts.taglib.html.MessagesTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.MessagesTag.class,"org.apache.struts.taglib.html.MessagesTag id name");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                    __jsp_taghandler_10.setId("warns");
                    __jsp_taghandler_10.setName(OracleJspRuntime.toStr( gob.shcp.catalog.core.common.util.CatalogConstants.REQUEST_ACTION_WARNINGS));
                    java.lang.String warns = null;
                    __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                      do {
                        warns = (java.lang.String) pageContext.findAttribute("warns");
                        out.write(__oracle_jsp_text[15]);
                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_11=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name");
                          __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                          __jsp_taghandler_11.setName("warns");
                          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,4);
                        }
                        out.write(__oracle_jsp_text[16]);
                      } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                  }
                  out.write(__oracle_jsp_text[17]);
                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
            }
            out.write(__oracle_jsp_text[18]);
            {
              org.apache.struts.taglib.logic.MessagesPresentTag __jsp_taghandler_12=(org.apache.struts.taglib.logic.MessagesPresentTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.MessagesPresentTag.class,"org.apache.struts.taglib.logic.MessagesPresentTag message");
              __jsp_taghandler_12.setParent(__jsp_taghandler_4);
              __jsp_taghandler_12.setMessage("true");
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[19]);
                  {
                    org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                    __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                    __jsp_taghandler_13.setCode("info.gif");
                    try {
                      __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                      if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                    } catch (Throwable th) {
                      __jsp_taghandler_13.doCatch(th);
                    } finally {
                      __jsp_taghandler_13.doFinally();
                    }
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                  }
                  out.write(__oracle_jsp_text[20]);
                  {
                    org.apache.struts.taglib.html.MessagesTag __jsp_taghandler_14=(org.apache.struts.taglib.html.MessagesTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.MessagesTag.class,"org.apache.struts.taglib.html.MessagesTag id message");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                    __jsp_taghandler_14.setId("msg");
                    __jsp_taghandler_14.setMessage("true");
                    java.lang.String msg = null;
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                      do {
                        msg = (java.lang.String) pageContext.findAttribute("msg");
                        out.write(__oracle_jsp_text[21]);
                        {
                          org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_15=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name");
                          __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                          __jsp_taghandler_15.setName("msg");
                          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
                        }
                        out.write(__oracle_jsp_text[22]);
                      } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                  }
                  out.write(__oracle_jsp_text[23]);
                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
            }
            out.write(__oracle_jsp_text[24]);
          } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[25]);

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
  private static final char __oracle_jsp_text[][]=new char[26][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n<div id=\"messages\">\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n  <table width=\"100%\">\r\n    <tr align=\"center\">\r\n      <td>\r\n        <table class=\"message\">\r\n          <tr>\r\n            <td class=\"error\"><img src=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "\" alt=\"error\" width=\"30\" height=\"30\"></td>\r\n            <td>\r\n              ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n            </td></tr>\r\n        </table>\r\n      </td>\r\n    </tr>\r\n  </table>    \r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n  ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    <table width=\"100%\">\r\n      <tr align=\"center\">\r\n        <td>\r\n          <table class=\"message\">\r\n            <tr>\r\n              <td class=\"error\"><img src=\"".toCharArray();
    __oracle_jsp_text[10] = 
    "\" alt=\"error\" width=\"30\" height=\"30\"></td>\r\n              <td>\r\n                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n              </td>\r\n            </tr>\r\n          </table>\r\n        </td>\r\n      </tr>\r\n    </table>\r\n  ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n  ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    <table width=\"100%\">\r\n       <tr align=\"center\">\r\n         <td>\r\n           <table class=\"message\">\r\n             <tr>\r\n               <td class=\"warn\"><img src=\"".toCharArray();
    __oracle_jsp_text[14] = 
    "\" alt=\"warn\" width=\"30\" height=\"30\"></td>\r\n               <td>\r\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[16] = 
    "<br>\r\n                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n               </td>\r\n             </tr>\r\n           </table>\r\n         </td>\r\n       </tr>\r\n    </table>\r\n  ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n  ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n    <table width=\"100%\">\r\n       <tr align=\"center\">\r\n         <td>\r\n           <table class=\"message\">\r\n             <tr>\r\n               <td class=\"info\"><img src=\"".toCharArray();
    __oracle_jsp_text[20] = 
    "\" alt=\"info\" width=\"30\" height=\"30\"></td>\r\n               <td>\r\n                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                  ".toCharArray();
    __oracle_jsp_text[22] = 
    "<br>\r\n                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n               </td>\r\n             </tr>\r\n           </table>\r\n         </td>\r\n       </tr>\r\n    </table>\r\n  ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n</div>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
