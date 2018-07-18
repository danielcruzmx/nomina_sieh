package _web_2d_inf._jsp._reportes._terceros;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _rechazos extends com.orionserver.http.OrionHttpJspPage {


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
    _rechazos page = this;
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
        __jsp_taghandler_1.setModelAttribute("reportesTercerosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("idUnidadRequired");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("qnaCapturaRequired");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setCode("sireh.label.terceros.reportes.titulo.link");
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
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.terceros.reportes.seccion.titulo.link");
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
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.terceros.reportes.rechazos.detalle.titulo.link");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_7=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setKey("0");
                __jsp_taghandler_7.setValue("selectList.nonValue");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_8=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setBeanName("catalogoTerceros");
                __jsp_taghandler_8.setPath("idTercero");
                __jsp_taghandler_8.setUppercase("false");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_9=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setKey("0");
                __jsp_taghandler_9.setValue("selectList.nonValue");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_10=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setBeanName("listaQuincenasAnteriores");
                __jsp_taghandler_10.setPath("qnaCaptura");
                __jsp_taghandler_10.setProgress("true");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                  if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_11.doCatch(th);
                } finally {
                  __jsp_taghandler_11.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_12=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setPath("muestraReporte");
                __jsp_taghandler_12.setAction("reporteTercerosNomina/rechazos.do");
                __jsp_taghandler_12.setValue("submit.accept");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_13=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setPath("cancel");
                __jsp_taghandler_13.setAction("reporteTercerosNomina/rechazos.do");
                __jsp_taghandler_13.setValue("submit.cancel");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ (reportesTercerosDTO.idTercero!='0') &&  (reportesTercerosDTO.qnaCaptura!='0')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[17]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_15=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                      __jsp_taghandler_15.setJspContext(pageContext);
                      __jsp_taghandler_15.setName("PAR_TERCERO");
                      __jsp_taghandler_15.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesTercerosDTO.idTercero}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_15.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                    }
                    out.write(__oracle_jsp_text[18]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_16=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_16.setParent(__jsp_taghandler_14);
                      __jsp_taghandler_16.setJspContext(pageContext);
                      __jsp_taghandler_16.setName("PAR_QNA");
                      __jsp_taghandler_16.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesTercerosDTO.qnaCaptura}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_16.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
                    }
                    out.write(__oracle_jsp_text[19]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_17=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_17.setParent(__jsp_taghandler_14);
                      __jsp_taghandler_17.setJspContext(pageContext);
                      __jsp_taghandler_17.setProvider("jasper");
                      __jsp_taghandler_17.setViewUri("/terceros/rechazos");
                      __jsp_taghandler_17.setImagesUri("/images/reports");
                      __jsp_taghandler_17.setFormat("pdf");
                      __jsp_taghandler_17.setFileName("rechazos");
                      __jsp_taghandler_17.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_17.setWidth("1060");
                      __jsp_taghandler_17.setHeight("350");
                      __jsp_taghandler_17.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
                    }
                    out.write(__oracle_jsp_text[20]);
                  } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write(__oracle_jsp_text[21]);
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
  private static final char __oracle_jsp_text[][]=new char[22][];
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
    "\r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[8] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n        </strong>\r\n    </h1>\r\n    <p>&nbsp;</p>\r\n    <div align=\"center\">\r\n        <table width=\"50%\">\r\n             <tr>\r\n                <td align=\"right\" class=\"label\">* Tipo de Aseguradora</td>\r\n                <td align=\"left\">\r\n                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    \r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"right\" class=\"label\">* Quincena</td>\r\n                <td align=\"left\">\r\n                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                </td>\r\n            </tr>       \r\n            <tr>\r\n                <td colspan=\"2\" align=\"left\" height=\"20px\" valign=\"middle\">".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n            </tr>\r\n            <tr>\r\n                <td align=\"right\">\r\n                    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                </td>\r\n                <td align=\"left\">\r\n                    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td colspan=\"2\" height=\"20px\">&nbsp;</td>\r\n            </tr>\r\n        </table>\r\n               ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n            <table>\r\n                <tr>\r\n                    <th align=\"left\"></th>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"left\">\r\n                        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n</div>\r\n<p>&nbsp;</p>\r\n<div align=\"center\">\r\n  \r\n</div>\r\n<p>&nbsp;</p>\r\n<div align=\"center\">\r\n  \r\n</div>\r\n<p>&nbsp;</p>\r\n<div align=\"center\">\r\n  \r\n</div>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
