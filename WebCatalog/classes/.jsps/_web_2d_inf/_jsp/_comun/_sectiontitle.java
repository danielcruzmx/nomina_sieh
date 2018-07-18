package _web_2d_inf._jsp._comun;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _sectiontitle extends com.orionserver.http.OrionHttpJspPage {


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
    _sectiontitle page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        org.apache.struts.taglib.html.LinkTag __jsp_taghandler_1=(org.apache.struts.taglib.html.LinkTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.LinkTag.class,"org.apache.struts.taglib.html.LinkTag page");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setPage("/administracion/home.do");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_1,__jsp_tag_starteval,out);
          do {
            {
              org.apache.struts.taglib.tiles.GetAttributeTag __jsp_taghandler_2=(org.apache.struts.taglib.tiles.GetAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.GetAttributeTag.class,"org.apache.struts.taglib.tiles.GetAttributeTag name ignore");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setName("link");
              __jsp_taghandler_2.setIgnore(true);
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
            }
          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.struts.taglib.tiles.GetAttributeTag __jsp_taghandler_3=(org.apache.struts.taglib.tiles.GetAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.GetAttributeTag.class,"org.apache.struts.taglib.tiles.GetAttributeTag name");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setName("value");
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      {
        org.apache.struts.taglib.tiles.GetAttributeTag __jsp_taghandler_4=(org.apache.struts.taglib.tiles.GetAttributeTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.tiles.GetAttributeTag.class,"org.apache.struts.taglib.tiles.GetAttributeTag name ignore");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setName("name");
        __jsp_taghandler_4.setIgnore(true);
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[3]);

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
  private static final char __oracle_jsp_text[][]=new char[4][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"2\">\r\n  <tr> \r\n    <td valign=\"top\" height=\"22\" colspan=\"6\">\t\t\t\t\t\r\n            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                    <tr class=\"TopTabla\">\r\n                            \r\n                            <td width=\"98%\" height=\"22\" align=\"left\" valign=\"middle\" class=\"TopTabla\">\r\n                                ".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n                                <strong>".toCharArray();
    __oracle_jsp_text[3] = 
    "</strong>\r\n                            </td>\r\n                    </tr>\r\n            </table>\r\n    </td>\r\n  </tr>\r\n</table>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
