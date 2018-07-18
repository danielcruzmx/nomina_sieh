package _web_2d_inf._jsp._layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _mainHeader extends com.orionserver.http.OrionHttpJspPage {


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
    _mainHeader page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        _oracle._jsp._tag._action_tag __jsp_taghandler_1=(_oracle._jsp._tag._action_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._action_tag.class, pageContext);
        __jsp_taghandler_1.setJspContext(pageContext);
        __jsp_taghandler_1.setUrl("/shcpHome");
        __jsp_taghandler_1.setVar("shcpHomePath");
        __jsp_taghandler_1.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_1, pageContext);
      }
      out.write(__oracle_jsp_text[4]);
      {
        _oracle._jsp._tag._action_tag __jsp_taghandler_2=(_oracle._jsp._tag._action_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._action_tag.class, pageContext);
        __jsp_taghandler_2.setJspContext(pageContext);
        __jsp_taghandler_2.setUrl("/singleSignoff");
        __jsp_taghandler_2.setVar("signoffPath");
        __jsp_taghandler_2.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_2, pageContext);
      }
      out.write(__oracle_jsp_text[5]);
      {
        _oracle._jsp._tag._user_tag __jsp_taghandler_3=(_oracle._jsp._tag._user_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._user_tag.class, pageContext);
        __jsp_taghandler_3.setJspContext(pageContext);
        __jsp_taghandler_3.setVar("usuario");
        __jsp_taghandler_3.setScope("request");
        __jsp_taghandler_3.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setCode("logo.gif");
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
      out.write(__oracle_jsp_text[7]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setCode("main.header.system.full.name");
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
      out.write(__oracle_jsp_text[8]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setCode("main.header.application.name");
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
      out.write(__oracle_jsp_text[9]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setCode("main.header.application.version");
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
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuario.operationYear}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[11]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setCode("logoapp.gif");
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
      out.write(__oracle_jsp_text[12]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${sessionScope['urlHome']}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[13]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setCode("background.gif");
        try {
          __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
          if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_11.doCatch(th);
        } finally {
          __jsp_taghandler_11.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
      }
      out.write(__oracle_jsp_text[14]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_12.setParent(null);
        __jsp_taghandler_12.setCode("background.gif");
        try {
          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_12.doCatch(th);
        } finally {
          __jsp_taghandler_12.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
      }
      out.write(__oracle_jsp_text[15]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_13.setParent(null);
        __jsp_taghandler_13.setCode("background.gif");
        try {
          __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
          if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_13.doCatch(th);
        } finally {
          __jsp_taghandler_13.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,1);
      }
      out.write(__oracle_jsp_text[16]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_14.setParent(null);
        __jsp_taghandler_14.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${shcpHomePath}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
      }
      out.write(__oracle_jsp_text[17]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setCode("background.gif");
        try {
          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_15.doCatch(th);
        } finally {
          __jsp_taghandler_15.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,1);
      }
      out.write(__oracle_jsp_text[18]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_16.setParent(null);
        __jsp_taghandler_16.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${signoffPath}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
        if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,1);
      }
      out.write(__oracle_jsp_text[19]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_17.setParent(null);
        __jsp_taghandler_17.setCode("background.gif");
        try {
          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_17.doCatch(th);
        } finally {
          __jsp_taghandler_17.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,1);
      }
      out.write(__oracle_jsp_text[20]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_18.setParent(null);
        __jsp_taghandler_18.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${usuario.userName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
        if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,1);
      }
      out.write(__oracle_jsp_text[21]);
      {
        org.apache.tiles.jsp.taglib.InsertAttributeTag __jsp_taghandler_19=(org.apache.tiles.jsp.taglib.InsertAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.tiles.jsp.taglib.InsertAttributeTag.class,"org.apache.tiles.jsp.taglib.InsertAttributeTag name");
        __jsp_taghandler_19.setParent(null);
        __jsp_taghandler_19.setName("navigationMenu");
        try {
          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_19.doCatch(th);
        } finally {
          __jsp_taghandler_19.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,1);
      }
      out.write(__oracle_jsp_text[22]);

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
  private static final char __oracle_jsp_text[][]=new char[23][];
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
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n<!-- HEADER -->\r\n    <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n        <tr> \r\n          <td>\r\n            <table class=\"logo\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n              <tr>\r\n                <td><img class=\"logoheader\" src=\"".toCharArray();
    __oracle_jsp_text[7] = 
    "\" alt=\"logo\"></td>\r\n              </tr>\r\n            </table>\r\n          </td>\r\n          <td>\r\n            <table class=\"header\">\r\n              <tr>\r\n                <td align=\"left\" width=\"60%\">\r\n                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                      <tr class=\"top\"> \r\n                        <td class=\"appname\" colspan=\"2\">".toCharArray();
    __oracle_jsp_text[8] = 
    "&nbsp;".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                      </tr>\r\n                      <tr class=\"bottom\">\r\n                        <td class=\"version\" width=\"50%\" align=\"left\">".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                        <td class=\"version\" width=\"50%\" align=\"left\">".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                      </tr>\r\n                  </table>\r\n                </td>\r\n                <td width=\"20%\" align=\"right\">\r\n                  <table class=\"logoapp\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                    <tr>\r\n                      <td><img src='".toCharArray();
    __oracle_jsp_text[12] = 
    "' alt=\"logoapp\" width=\"139\" height=\"60\" align=\"top\"></td>\r\n                    </tr>\r\n                  </table>\r\n                </td>\r\n                <td width=\"20%\" align=\"right\">\r\n                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                      <tr class=\"top\">\r\n                        <td class=\"home\"><a href='".toCharArray();
    __oracle_jsp_text[13] = 
    "'><img src=\"".toCharArray();
    __oracle_jsp_text[14] = 
    "\" alt=\"home\" width=\"26\" height=\"26\"></a></td>\r\n                        <td class=\"help\"><a href=\"#\"><img src=\"".toCharArray();
    __oracle_jsp_text[15] = 
    "\" alt=\"help\" width=\"26\" height=\"26\"></a></td>\r\n                        <td class=\"print\"><a href=\"#\"><img src=\"".toCharArray();
    __oracle_jsp_text[16] = 
    "\" alt=\"print\" width=\"26\" height=\"26\"></a></td>\r\n                        <td class=\"logout\"><a href=\"#\" onclick=\"delegateOpener('".toCharArray();
    __oracle_jsp_text[17] = 
    "')\"><img src=\"".toCharArray();
    __oracle_jsp_text[18] = 
    "\" alt=\"Menu Aplicaciones\" width=\"26\" height=\"26\"></a></td>\r\n                        <td class=\"signoff\"><a href=\"#\" onclick=\"delegateOpener('".toCharArray();
    __oracle_jsp_text[19] = 
    "')\"><img src=\"".toCharArray();
    __oracle_jsp_text[20] = 
    "\" alt=\"Single Sign Off\" width=\"26\" height=\"26\"></a></td>\r\n                      </tr>\r\n                      <tr class=\"bottom\">\r\n                        <td colspan=\"5\" class=\"username\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                      </tr>\r\n                  </table>\r\n                </td>\r\n              </tr>\r\n            </table>\r\n          </td>\r\n        </tr>\r\n        <tr>\r\n          <td colspan=\"5\">\r\n            <table class=\"menu\">\r\n                <tr>\r\n                  <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                  </td>\r\n                </tr>\r\n            </table>            \r\n          </td>\r\n        </tr>\r\n      </table>\r\n<!-- HEADER END -->\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
