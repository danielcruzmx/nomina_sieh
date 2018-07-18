package _web_2d_inf._jsp._expediente._gestion._documentos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _buscaDocumentosExpediente extends com.orionserver.http.OrionHttpJspPage {


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
    _buscaDocumentosExpediente page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("expedienteEliminaDocumentosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("numDocumentos");
                __jsp_taghandler_2.setId("numDocumentos");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.oficinaVirtual.gestionDocumentos.rechazos");
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
              out.write(__oracle_jsp_text[6]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(expedienteEliminaDocumentosDTO.numDocumentos > 0) && !(expedienteEliminaDocumentosDTO.procesar) }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[7]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_5.setCode("sireh.label.oficinaVirtual.gestionDocumentos.rechazos.fieldSet");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                        if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_5.doCatch(th);
                      } finally {
                        __jsp_taghandler_5.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                    }
                    out.write(__oracle_jsp_text[8]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_6.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_6.setCode("sireh.label.expediente.eliminaRegistros.num");
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
                    out.write(__oracle_jsp_text[9]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_7.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_7.setCode("sireh.label.expediente.eliminaRegistros.tabla");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_7.doCatch(th);
                      } finally {
                        __jsp_taghandler_7.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                    }
                    out.write(__oracle_jsp_text[10]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_8.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_8.setCode("sireh.label.expediente.eliminaRegistros.documento");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_8.doCatch(th);
                      } finally {
                        __jsp_taghandler_8.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                    }
                    out.write(__oracle_jsp_text[11]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
                      __jsp_taghandler_9.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_9.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteEliminaDocumentosDTO.listaDocumentos}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_taghandler_9.setVar("item");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write(__oracle_jsp_text[12]);
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                              __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${item.numero}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,4);
                            }
                            out.write(__oracle_jsp_text[13]);
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_11.setParent(__jsp_taghandler_9);
                              __jsp_taghandler_11.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${item.nombreTabla}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,4);
                            }
                            out.write(__oracle_jsp_text[14]);
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_12.setParent(__jsp_taghandler_9);
                              __jsp_taghandler_12.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${item.numDocumentos}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,4);
                            }
                            out.write(__oracle_jsp_text[15]);
                          } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_9.doCatch(th);
                      } finally {
                        __jsp_taghandler_9.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                    }
                    out.write(__oracle_jsp_text[16]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_13=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_13.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_13.setJspContext(pageContext);
                      __jsp_taghandler_13.setPath("procesar");
                      __jsp_taghandler_13.setAction("gestionDocumentos/buscaDocumentosExpediente.do");
                      __jsp_taghandler_13.setValue("submit.delete");
                      __jsp_taghandler_13.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_14.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_14.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteEliminaDocumentosDTO.numDocumentos}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                      if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                    }
                    out.write(__oracle_jsp_text[18]);
                  } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[19]);
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
  private static final char __oracle_jsp_text[][]=new char[20][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n<style type=\"text/css\">\r\n    .columnHeader {\r\n        background-color: rgb(109, 109, 109);\r\n        color: rgb(255, 255, 255);\r\n        font-weight: bold;\r\n        text-align: center;\r\n    }\r\n    .columnFoter {\r\n        background-color: rgb(0, 110, 219);\r\n        color: rgb(255, 255, 255);\r\n        font-weight: bold;\r\n        text-align: center;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[6] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n        <fieldset>\r\n            <legend><strong>".toCharArray();
    __oracle_jsp_text[8] = 
    "</strong></legend>\r\n            <table align=\"center\" width=\"100%\" border=\"0\">\r\n                <tr>\r\n                    <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                    <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                    <td class=\"columnHeader\">".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                </tr>\r\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                    <tr>\r\n                        <td class=\"label\" style=\"text-align: center;\">".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                        <td class=\"label\" style=\"text-align: left;\">".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                        <td class=\"label\" style=\"text-align: left;\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                    </tr>\r\n                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                <tr>\r\n                    <td >&nbsp;</td>\r\n                    <td >&nbsp;</td>\r\n                    <td >&nbsp;</td>\r\n                </tr>\r\n                <tr>\r\n                    <td >&nbsp;</td>\r\n                    <td align=\"center\">".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                    <td class=\"columnFoter\" style=\"text-align: left;\">TOTAL:&nbsp;&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[18] = 
    " </td>\r\n                </tr>\r\n            </table>\r\n        </fieldset>\r\n    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n    \r\n    <script  type=\"text/javascript\">\r\n        $j(document).ready(function(){\r\n            var numDocs = $j('#numDocumentos').val();\r\n                $j('#10001').click(function(){\r\n                    if(numDocs == 1){\r\n                        var mesaje = 'ADVENTENCIA:   ' + numDocs + '  documentos sera eliminado. \\n ESTE PROCESO ES IRREVERSIBLE! \\n \\u00BF Desea continuar ?';\r\n                    } else{\r\n                        var mesaje = 'ADVENTENCIA:  Los   ' + numDocs + '  documentos seran eliminados. \\n ESTE PROCESO ES IRREVERSIBLE! \\n \\u00BF Desea continuar ?';\r\n                    }\r\n                    var r = window.confirm(mesaje);\r\n                    $j('#procesar').val(r);\r\n                    if(r){\r\n                        \r\n                    }\r\n                });\r\n            });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
