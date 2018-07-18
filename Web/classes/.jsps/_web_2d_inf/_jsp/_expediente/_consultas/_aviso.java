package _web_2d_inf._jsp._expediente._consultas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _aviso extends com.orionserver.http.OrionHttpJspPage {


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
    _aviso page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setText(" Protecci&oacute;n de");
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
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setCode("logoinai2.jpg");
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
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setText("Datos Personales ");
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
      out.write(__oracle_jsp_text[6]);

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
  private static final char __oracle_jsp_text[][]=new char[7][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n\r\n<table width=\"100%\">\r\n    <tr>\r\n        <td align=\"center\">    \r\n            <fieldset style='border-style:outset; border-width: <c:out value=\"".toCharArray();
    __oracle_jsp_text[1] = 
    "\"/>; border-color: <c:out value=\"".toCharArray();
    __oracle_jsp_text[2] = 
    "\"/>;'>\r\n                <legend style='font-size:<c:out value=\"".toCharArray();
    __oracle_jsp_text[3] = 
    "\"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                    <strong>\r\n                        ".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n                        <img class=\"fotografia\" width=\"85\" src=\"".toCharArray();
    __oracle_jsp_text[5] = 
    "\"  align=\"middle\"/>     \r\n                        ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n                    </strong>\r\n                </legend>\r\n                <table width=\"100%\">\r\n                    <tr> \r\n                        <td>&nbsp;</td> <td>&nbsp;</td>\r\n                        <td align=\"left\" style=\"color: darkblue; font-size: 1.2em;\">\r\n                            <i>La informaci&oacute;n contenida en este m&oacute;dulo, es de uso exclusivamente oficial y se deber&aacute;n  adoptar las medidades necesarias para garantizar su protecci&oacute;n.</br> </br>\r\n                            LEY FEDERAL DE TRANSPARENCIA Y ACCESO A LA INFORMACION PUBLICA GUBERNAMENTAL </br> </br>\r\n                            Art&iacute;culo 21. Los sujetos obligados no podr&aacute;n difundir, distribuir o comercializar los datos personales contenidos en los sistemas de informaci&oacute;n, desarrollados en el ejercicio de sus funciones, salvo que haya mediado el consentimiento expreso, por escrito o por un medio de autenticaci&oacute;n similar, de los individuos a que haga referencia la informaci&oacute;n.  </br> </br>\r\n                        </td>\r\n                    </tr>\r\n                    <tr> <td>&nbsp;</td> </tr>\r\n                </table>\r\n            </fieldset>\r\n        </td>\r\n    </tr>\r\n    <tr> <td>&nbsp;</td> </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n</table>\r\n<br/>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
