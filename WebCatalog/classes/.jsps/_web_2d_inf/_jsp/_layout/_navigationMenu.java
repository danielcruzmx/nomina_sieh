package _web_2d_inf._jsp._layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _navigationMenu extends com.orionserver.http.OrionHttpJspPage {


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
    _navigationMenu page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
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
      out.write(__oracle_jsp_text[2]);
      {
        net.sf.navigator.taglib.el.UseMenuDisplayerTag __jsp_taghandler_2=(net.sf.navigator.taglib.el.UseMenuDisplayerTag)OracleJspRuntime.getTagHandler(pageContext,net.sf.navigator.taglib.el.UseMenuDisplayerTag.class,"net.sf.navigator.taglib.el.UseMenuDisplayerTag id name bundle permissions repository");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setId("primary-nav");
        __jsp_taghandler_2.setName("CSSIFrameMenu");
        __jsp_taghandler_2.setBundle("menuBundle");
        __jsp_taghandler_2.setPermissions("rolesAdapter");
        __jsp_taghandler_2.setRepository("repository");
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[3]);
            {
              org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
              __jsp_taghandler_3.setParent(__jsp_taghandler_2);
              __jsp_taghandler_3.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${repository.topMenus}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_taghandler_3.setVar("menu");
              try {
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[4]);
                    {
                      net.sf.navigator.taglib.el.DisplayMenuTag __jsp_taghandler_4=(net.sf.navigator.taglib.el.DisplayMenuTag)OracleJspRuntime.getTagHandler(pageContext,net.sf.navigator.taglib.el.DisplayMenuTag.class,"net.sf.navigator.taglib.el.DisplayMenuTag name");
                      __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                      __jsp_taghandler_4.setName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${menu.name}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                      if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                    }
                    out.write(__oracle_jsp_text[5]);
                  } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_3.doCatch(th);
              } finally {
                __jsp_taghandler_3.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
            }
            out.write(__oracle_jsp_text[6]);
          } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[7]);

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
  private static final char __oracle_jsp_text[][]=new char[8][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[6] = 
    "        \r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
