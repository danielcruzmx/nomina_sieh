package _web_2d_inf._jsp._spc._capcer._consultas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _consultaAvanceCertificacion extends com.orionserver.http.OrionHttpJspPage {


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
    _consultaAvanceCertificacion page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag");
        __jsp_taghandler_1.setParent(null);
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.spc.capcer.reportes.general.consultaAvanceCertificacion.title");
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
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.spc.capcer.reportes.general.consultaAvanceCertificacion.ciclo");
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
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setCode("sireh.label.spc.capcer.reportes.general.consultaAvanceCertificacion.trimestre");
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
              out.write(__oracle_jsp_text[8]);
            } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }

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
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n\r\n    <h1>".toCharArray();
    __oracle_jsp_text[6] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n                                \r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <!--FORMULARIO BUSQUEDA-->\r\n                <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n                    <tr>\r\n                        <td valign=\"top\" align=\"left\" style=\"vertical-align: top\">\r\n                            <fieldset>\r\n                                <legend style=\"font-size:1.3em\"><strong>Filtros de búsqueda</strong></legend>\r\n                                <table width=\"100%\">\r\n                                    <tbody>\r\n                                        <tr align=\"left\">\r\n                                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[7] = 
    ":</td>\r\n                                            <td colspan=\"3\">\r\n                                                <select class=\"uppercase\" name=\"ciclo\" id=\"ciclo\" style=\"width:200px;\">\r\n                                                    <option value=\"\">Seleccione...</option>\r\n                                                    <option value=\"2015\">2015</option>\r\n                                                    <option value=\"2014\">2014</option>\r\n                                                </select>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr align=\"left\">\r\n                                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[8] = 
    ":</td>\r\n                                            <td colspan=\"3\">\r\n                                                <select class=\"uppercase\" name=\"trimestre\" id=\"trimestre\" style=\"width:200px;\">\r\n                                                    <option value=\"\">Seleccione...</option>\r\n                                                    <option value=\"1\">1er Trimestre</option>\r\n                                                    <option value=\"2\">2do Trimestre</option>\r\n                                                    <option value=\"3\">3er Trimestre</option>\r\n                                                    <option value=\"4\">4to Trimestre</option>\r\n                                                </select>\r\n                                            </td>\r\n                                        </tr>\r\n                                    </tbody>\r\n                                </table>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr align=\"left\">\r\n                        <td colspan=\"2\"> &nbsp; </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td colspan=\"2\" valign=\"middle\" height=\"20px\" align=\"left\">\r\n                            <b>* Campos requeridos</b>\r\n                        </td>\r\n                    </tr>\r\n                    <tr align=\"center\">\r\n                        <td colspan=\"2\">\r\n                            <table width=\"90%\" border=\"0\" align=\"center\">\r\n                                <tr>\r\n                                    <td align=\"right\">\r\n                                        <input type=\"submit\" \r\n                                               alertcode=\"\" \r\n                                               path=\"\" \r\n                                               progresstype=\"icon\" \r\n                                               onclick=\"return doSubmit(10001);\" \r\n                                               class=\"uppercase\" \r\n                                               value=\"Aceptar\" \r\n                                               id=\"10001\" />\r\n                                    </td>\r\n                                    <td align=\"left\">\r\n                                        <input type=\"submit\" \r\n                                               alertcode=\"\" \r\n                                               path=\"\" \r\n                                               action=\"calendario.html\" \r\n                                               progresstype=\"icon\" \r\n                                               onclick=\"return doSubmit(10002);\" \r\n                                               class=\"uppercase\" \r\n                                               value=\"Cancelar\" \r\n                                               id=\"10002\" />\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n                <!--FORMULARIO BUSQUEDA-->\r\n            </td>\r\n        </tr>\r\n    </table>\r\n            \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
