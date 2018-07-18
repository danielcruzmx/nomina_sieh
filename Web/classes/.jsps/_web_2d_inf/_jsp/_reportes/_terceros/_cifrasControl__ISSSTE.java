package _web_2d_inf._jsp._reportes._terceros;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _cifrasControl__ISSSTE extends com.orionserver.http.OrionHttpJspPage {


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
    _cifrasControl__ISSSTE page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setCode("sireh.label.reportes.en.qna");
        __jsp_taghandler_1.setVar("enQna");
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
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setCode("sireh.label.reportes.no.qna");
        __jsp_taghandler_2.setVar("noQna");
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
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setCode("sireh.label.reportes.tipo.entero");
        __jsp_taghandler_3.setVar("tEntero");
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
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setCode("sireh.label.reportes.tipo.cancelado");
        __jsp_taghandler_4.setVar("tCancelado");
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
      out.write(__oracle_jsp_text[8]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setCode("sireh.label.reportes.tipo.devoluciones");
        __jsp_taghandler_5.setVar("tDevoluciones");
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
      out.write(__oracle_jsp_text[9]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setName("checkBoxTest");
        __jsp_taghandler_6.setModelAttribute("generaArchivosTercerosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_6);
                __jsp_taghandler_7.setCode("sireh.label.terceros.reportes.titulo.link");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                  if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_7.doCatch(th);
                } finally {
                  __jsp_taghandler_7.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_6);
                __jsp_taghandler_8.setCode("sireh.label.terceros.reportes.seccion.titulo.link");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_8.doCatch(th);
                } finally {
                  __jsp_taghandler_8.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_6);
                __jsp_taghandler_9.setCode("sireh.label.terceros.reportes.cifrasControlI.detalle.titulo.link");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                  if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_9.doCatch(th);
                } finally {
                  __jsp_taghandler_9.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_6);
                __jsp_taghandler_10.setCode("sireh.label.nomina.calculo.fin.contrato");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                  if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_10.doCatch(th);
                } finally {
                  __jsp_taghandler_10.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_6);
                __jsp_taghandler_11.setCode("sireh.label.nomina.creaArchivoTerceros.quincena");
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
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_12=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_6);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setKey("");
                __jsp_taghandler_12.setValue("selectList.nonValue");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_13=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_6);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setBeanName("listaQuincenasAnteriores");
                __jsp_taghandler_13.setPath("hpQnaPago");
                __jsp_taghandler_13.setProgress("true");
                __jsp_taghandler_13.setStyle("width: 100px;");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_6);
                __jsp_taghandler_14.setCode("sireh.label.nomina.creaArchivoTerceros.tipoQna");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                  if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_14.doCatch(th);
                } finally {
                  __jsp_taghandler_14.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,2);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass");
                __jsp_taghandler_15.setParent(__jsp_taghandler_6);
                __jsp_taghandler_15.setPath("tipoQna");
                __jsp_taghandler_15.setCssClass("uppercase");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[19]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                        __jsp_taghandler_16.setValue("");
                        __jsp_taghandler_16.setLabel("SELECCIONE");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_16.doCatch(th);
                        } finally {
                          __jsp_taghandler_16.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
                      }
                      out.write(__oracle_jsp_text[20]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_17.setParent(__jsp_taghandler_15);
                        __jsp_taghandler_17.setValue("0");
                        __jsp_taghandler_17.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${enQna}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                          if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_17.doCatch(th);
                        } finally {
                          __jsp_taghandler_17.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,3);
                      }
                      out.write(__oracle_jsp_text[21]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_18.setParent(__jsp_taghandler_15);
                        __jsp_taghandler_18.setValue("1");
                        __jsp_taghandler_18.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${noQna}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                          if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_18.doCatch(th);
                        } finally {
                          __jsp_taghandler_18.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,3);
                      }
                      out.write(__oracle_jsp_text[22]);
                    } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_15.doCatch(th);
                } finally {
                  __jsp_taghandler_15.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_6);
                __jsp_taghandler_19.setCode("sireh.label.nomina.creaArchivoTerceros.tipoTercero");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                  if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_19.doCatch(th);
                } finally {
                  __jsp_taghandler_19.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass");
                __jsp_taghandler_20.setParent(__jsp_taghandler_6);
                __jsp_taghandler_20.setPath("tipoEntero");
                __jsp_taghandler_20.setCssClass("uppercase");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[25]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                        __jsp_taghandler_21.setValue("");
                        __jsp_taghandler_21.setLabel("SELECCIONE");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                          if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_21.doCatch(th);
                        } finally {
                          __jsp_taghandler_21.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,3);
                      }
                      out.write(__oracle_jsp_text[26]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_22.setParent(__jsp_taghandler_20);
                        __jsp_taghandler_22.setValue("e");
                        __jsp_taghandler_22.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tEntero}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                          if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_22.doCatch(th);
                        } finally {
                          __jsp_taghandler_22.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                      }
                      out.write(__oracle_jsp_text[27]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_23.setParent(__jsp_taghandler_20);
                        __jsp_taghandler_23.setValue("c");
                        __jsp_taghandler_23.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tCancelado}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                          if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_23.doCatch(th);
                        } finally {
                          __jsp_taghandler_23.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,3);
                      }
                      out.write(__oracle_jsp_text[28]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_24.setParent(__jsp_taghandler_20);
                        __jsp_taghandler_24.setValue("d");
                        __jsp_taghandler_24.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tDevoluciones}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                          if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_24.doCatch(th);
                        } finally {
                          __jsp_taghandler_24.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,3);
                      }
                      out.write(__oracle_jsp_text[29]);
                    } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_20.doCatch(th);
                } finally {
                  __jsp_taghandler_20.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_25.setParent(__jsp_taghandler_6);
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[31]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[32]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_27=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_27.setJspContext(pageContext);
                            __jsp_taghandler_27.setPath("muestraRegistros");
                            __jsp_taghandler_27.setAction("reporteTercerosNomina/cifrasDeControlReporte.do");
                            __jsp_taghandler_27.setValue("submit.search");
                            __jsp_taghandler_27.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                          }
                          out.write(__oracle_jsp_text[33]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_28=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_28.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_28.setJspContext(pageContext);
                            __jsp_taghandler_28.setPath("cancel");
                            __jsp_taghandler_28.setAction("reporteTercerosNomina/cifrasDeControlI.do");
                            __jsp_taghandler_28.setValue("submit.clean");
                            __jsp_taghandler_28.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                          }
                          out.write(__oracle_jsp_text[34]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_29=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_29.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_29.setJspContext(pageContext);
                            __jsp_taghandler_29.setProperty("h.hp_qna_pago");
                            __jsp_taghandler_29.setCondition("=");
                            __jsp_taghandler_29.setPath("hpQnaPago");
                            __jsp_taghandler_29.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                          }
                          out.write(__oracle_jsp_text[35]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_30=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_30.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_30.setJspContext(pageContext);
                            __jsp_taghandler_30.setProperty("c.cpc_qna_aplica");
                            __jsp_taghandler_30.setCondition("=");
                            __jsp_taghandler_30.setPath("hpQnaPago");
                            __jsp_taghandler_30.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                          }
                          out.write(__oracle_jsp_text[36]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_31.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.tipoQna eq '0'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[37]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_32=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                                  __jsp_taghandler_32.setJspContext(pageContext);
                                  __jsp_taghandler_32.setProperty("hp_ini_pago");
                                  __jsp_taghandler_32.setCondition("=");
                                  __jsp_taghandler_32.setPath("hpIniPago");
                                  __jsp_taghandler_32.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                                }
                                out.write(__oracle_jsp_text[38]);
                              } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,4);
                          }
                          out.write(__oracle_jsp_text[39]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_33.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.tipoQna eq '1'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[40]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_34=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                                  __jsp_taghandler_34.setJspContext(pageContext);
                                  __jsp_taghandler_34.setProperty("hp_ini_pago");
                                  __jsp_taghandler_34.setCondition("<>");
                                  __jsp_taghandler_34.setPath("hpIniPago");
                                  __jsp_taghandler_34.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                                }
                                out.write(__oracle_jsp_text[41]);
                              } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,4);
                          }
                          out.write(__oracle_jsp_text[42]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_35.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_35.setVar("clave");
                            __jsp_taghandler_35.setValue("");
                            __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                            if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,4);
                          }
                          out.write(__oracle_jsp_text[43]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_36=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_36.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_36.setJspContext(pageContext);
                            __jsp_taghandler_36.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.beanlista}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_36.setBaseUrl("reporteTercerosNomina/cifrasDeControlReporteVer.do");
                            __jsp_taghandler_36.setAppendFilters("false");
                            __jsp_taghandler_36.setCheckbox("true");
                            __jsp_taghandler_36.setChkProperty("seleccionConsecNomina");
                            __jsp_taghandler_36.setJspBody(new _cifrasControl__ISSSTE_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_36, __ojsp_varRes));
                            __jsp_taghandler_36.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
                          }
                          out.write(__oracle_jsp_text[44]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_48=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_48.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_48.setJspContext(pageContext);
                            __jsp_taghandler_48.setPath("generaArchivo");
                            __jsp_taghandler_48.setAction("reporteTercerosNomina/cifrasDeControlReporteVer.do");
                            __jsp_taghandler_48.setValue("submit.generate");
                            __jsp_taghandler_48.setProgressIcon("false");
                            __jsp_taghandler_48.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
                          }
                          out.write(__oracle_jsp_text[45]);
                        } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                    }
                    out.write(__oracle_jsp_text[46]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_49.setParent(__jsp_taghandler_25);
                      __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[47]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_50=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                            __jsp_taghandler_50.setJspContext(pageContext);
                            __jsp_taghandler_50.setAction("reporteTercerosNomina/cifrasDeControlReporte.do");
                            __jsp_taghandler_50.setValue("submit.search");
                            __jsp_taghandler_50.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
                          }
                          out.write(__oracle_jsp_text[48]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_51=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_51.setParent(__jsp_taghandler_49);
                            __jsp_taghandler_51.setJspContext(pageContext);
                            __jsp_taghandler_51.setPath("cancel");
                            __jsp_taghandler_51.setAction("reporteTercerosNomina/cifrasDeControlI.do");
                            __jsp_taghandler_51.setValue("submit.clean");
                            __jsp_taghandler_51.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
                          }
                          out.write(__oracle_jsp_text[49]);
                        } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,3);
                    }
                    out.write(__oracle_jsp_text[50]);
                  } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_52=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_52.setParent(__jsp_taghandler_6);
                __jsp_taghandler_52.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.generaArchivo}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[52]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_53=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_53.setParent(__jsp_taghandler_52);
                      __jsp_taghandler_53.setJspContext(pageContext);
                      __jsp_taghandler_53.setName("PAR_QNA");
                      __jsp_taghandler_53.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.hpQnaPago}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_53.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
                    }
                    out.write(__oracle_jsp_text[53]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_54=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_54.setParent(__jsp_taghandler_52);
                      __jsp_taghandler_54.setJspContext(pageContext);
                      __jsp_taghandler_54.setName("PAR_COMPLEMENTO");
                      __jsp_taghandler_54.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.hpConsecNomina}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_54.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
                    }
                    out.write(__oracle_jsp_text[54]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_55=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_55.setParent(__jsp_taghandler_52);
                      __jsp_taghandler_55.setJspContext(pageContext);
                      __jsp_taghandler_55.setName("PAR_FECHA");
                      __jsp_taghandler_55.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.hpIniPago}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_55.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
                    }
                    out.write(__oracle_jsp_text[55]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_56=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_56.setParent(__jsp_taghandler_52);
                      __jsp_taghandler_56.setJspContext(pageContext);
                      __jsp_taghandler_56.setName("PAR_TIPO_REPORTE");
                      __jsp_taghandler_56.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.descTercero}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_56.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_56, pageContext);
                    }
                    out.write(__oracle_jsp_text[56]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_57=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_57.setParent(__jsp_taghandler_52);
                      __jsp_taghandler_57.setJspContext(pageContext);
                      __jsp_taghandler_57.setProvider("jasper");
                      __jsp_taghandler_57.setViewUri("/terceros/cifrasControl_ISSSTE");
                      __jsp_taghandler_57.setImagesUri("/images/reports");
                      __jsp_taghandler_57.setFormat("pdf");
                      __jsp_taghandler_57.setFileName("cifrasControlISSSTE");
                      __jsp_taghandler_57.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_57.setWidth("1060");
                      __jsp_taghandler_57.setHeight("350");
                      __jsp_taghandler_57.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
                    }
                    out.write(__oracle_jsp_text[57]);
                  } while (__jsp_taghandler_52.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,2);
              }
              out.write(__oracle_jsp_text[58]);
            } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_6.doCatch(th);
        } finally {
          __jsp_taghandler_6.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[59]);

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

  private class _cifrasControl__ISSSTE_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _cifrasControl__ISSSTE_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_36       = parent;
      out.write("\r\n                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_37=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort form");
        __jsp_taghandler_37.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_36));
        __jsp_taghandler_37.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.beanlista}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_37.setPagesize(100);
        __jsp_taghandler_37.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_37.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_37.setClass("displaytag");
        __jsp_taghandler_37.setExport(true);
        __jsp_taghandler_37.setUid("row");
        __jsp_taghandler_37.setSort("list");
        __jsp_taghandler_37.setForm("checkBoxTest");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_37,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                           ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_38=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey media style");
                __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                __jsp_taghandler_38.setProperty("checkbox");
                __jsp_taghandler_38.setTitleKey("sireh.label.nomina.creaArchivoTerceros.selecciona");
                __jsp_taghandler_38.setMedia("html");
                __jsp_taghandler_38.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
              }
              out.write("                            \r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_39=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_39.setParent(__jsp_taghandler_37);
                __jsp_taghandler_39.setProperty("qnaPago");
                __jsp_taghandler_39.setTitleKey("sireh.label.nomina.creaArchivoTerceros.quincenaPago");
                __jsp_taghandler_39.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_40=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_40.setParent(__jsp_taghandler_37);
                __jsp_taghandler_40.setProperty("tipoNomina");
                __jsp_taghandler_40.setTitleKey("sireh.label.nomina.creaArchivoTerceros.tipoNomina");
                __jsp_taghandler_40.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,6);
              }
              out.write("             \r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_41=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_41.setParent(__jsp_taghandler_37);
                __jsp_taghandler_41.setProperty("consecNomina");
                __jsp_taghandler_41.setTitleKey("sireh.label.nomina.creaArchivoTerceros.consecutivoNomina");
                __jsp_taghandler_41.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_42=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_42.setParent(__jsp_taghandler_37);
                __jsp_taghandler_42.setProperty("numComplem");
                __jsp_taghandler_42.setTitleKey("sireh.label.nomina.creaArchivoTerceros.complemento");
                __jsp_taghandler_42.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
              }
              out.write(" \r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_43=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_43.setParent(__jsp_taghandler_37);
                __jsp_taghandler_43.setProperty("gpoPago");
                __jsp_taghandler_43.setTitleKey("sireh.label.nomina.creaArchivoTerceros.grupoPago");
                __jsp_taghandler_43.setSortable(false);
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
              }
              out.write("            \r\n     \r\n\r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_44=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_44.setParent(__jsp_taghandler_37);
                __jsp_taghandler_44.setName("paging.banner.placement");
                __jsp_taghandler_44.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_45=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_45.setParent(__jsp_taghandler_37);
                __jsp_taghandler_45.setName("export.pdf");
                __jsp_taghandler_45.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_46=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_46.setParent(__jsp_taghandler_37);
                __jsp_taghandler_46.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_46,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                        __jsp_taghandler_47.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                          if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_47.doCatch(th);
                        } finally {
                          __jsp_taghandler_47.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,7);
                      }
                      out.write("<br/><br/></span>\r\n                            ");
                    } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
              }
              out.write("\r\n                        ");
            } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,5);
      }
      out.write("\r\n                    ");
      return;
    }

    public void invoke(java.io.Writer writer )
     throws javax.servlet.jsp.JspException 
    {
      JspWriter out = null;
      if (writer != null ) {
        out = this.jspContext.pushBody(writer);
      }
      else
      {
         out = this.jspContext.getOut();
      }
      try {
        switch( this.fragId ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch (Throwable e) {
        if (e instanceof javax.servlet.jsp.SkipPageException) 
           throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException(e);
      }
      finally {
        if (writer != null) {
          this.jspContext.popBody();
        }
      }
    }

  }

  private static final char __oracle_jsp_text[][]=new char[60][];
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
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n\r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <h1> \r\n                    <strong> \r\n                        ".toCharArray();
    __oracle_jsp_text[11] = 
    " &#45; \r\n                        ".toCharArray();
    __oracle_jsp_text[12] = 
    " &#45;\r\n                        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                    </strong> \r\n                </h1> \r\n                <p>&nbsp;</p>\r\n            </td>   \r\n        </tr>\r\n        <tr> <td> </td> </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset id=\"quincenasFieldSet\">\r\n                    <legend style='font-size:1.1em' >\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[14] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr> <td>  </td> </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    " ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>      \r\n                            <td>  </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "    \r\n                                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n            <td>  </td>\r\n        </tr>\r\n        <tr><td>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n            <table width=\"100%\" align=\"center\" border=\"0\">\r\n                <tr>\r\n                    <td align=\"right\">\r\n                        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                    </td>\r\n                </tr>\r\n            \r\n            </table>\r\n            \r\n\r\n            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n\r\n            ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[38] = 
    "    \r\n            ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n\r\n                <table width=\"100%\">\r\n                    <tr align=\"center\">\r\n                        <td>\r\n                            ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n                \r\n            ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n            \r\n           \r\n        ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n            <table width=\"100%\" align=\"center\" border=\"0\">\r\n                <tr>\r\n                    <td align=\"right\">\r\n                        ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n     </td> </tr>\r\n     <tr><td>\r\n        ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n            <table>\r\n                <tr>\r\n                    <th align=\"left\"></th>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"left\">\r\n                       \r\n                       ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                       ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                       ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                       ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n     </td></tr>\r\n    </table>\r\n".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
