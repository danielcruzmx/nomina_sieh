package _web_2d_inf._jsp._expediente;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _notasMerito extends com.orionserver.http.OrionHttpJspPage {


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
    _notasMerito page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setText("Notas de");
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
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setCode("acierto.jpg");
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
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setText("M&eacute;rito ");
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
        _oracle._jsp._tag._graficaMerito_tag __jsp_taghandler_4=(_oracle._jsp._tag._graficaMerito_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._graficaMerito_tag.class, pageContext);
        __jsp_taghandler_4.setJspContext(pageContext);
        __jsp_taghandler_4.setRfc((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_4.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
      }
      out.write(__oracle_jsp_text[8]);

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
  private static final char __oracle_jsp_text[][]=new char[9][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n<table width=\"100%\" align=\"center\">\r\n    <tr>\r\n        <td align=\"center\">\r\n            <fieldset style='border-style:outset; border-width: <c:out value=\"".toCharArray();
    __oracle_jsp_text[2] = 
    "\"/>; border-color: <c:out value=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\"/>;'>\r\n                <legend style='font-size:<c:out value=\"".toCharArray();
    __oracle_jsp_text[4] = 
    "\"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                    <strong>".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n                    <img class=\"fotografia\" width=\"65\" src=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "\" align=\"middle\"/>                                   \r\n                    <strong>".toCharArray();
    __oracle_jsp_text[7] = 
    "</strong>\r\n                </legend>\r\n                <table width=\"100%\">\r\n                    <tr> <td align=\"center\">  ".toCharArray();
    __oracle_jsp_text[8] = 
    " </td> </tr>\r\n                </table>\r\n            </fieldset>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n</table>\r\n<br/>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
