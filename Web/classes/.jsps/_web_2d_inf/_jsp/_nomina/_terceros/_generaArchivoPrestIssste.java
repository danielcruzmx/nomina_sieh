package _web_2d_inf._jsp._nomina._terceros;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _generaArchivoPrestIssste extends com.orionserver.http.OrionHttpJspPage {


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
    _generaArchivoPrestIssste page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
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
      out.write(__oracle_jsp_text[4]);
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
      out.write(__oracle_jsp_text[5]);
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
      out.write(__oracle_jsp_text[6]);
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
      out.write(__oracle_jsp_text[7]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setName("checkBoxTest");
        __jsp_taghandler_5.setModelAttribute("generaArchivosTercerosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                __jsp_taghandler_6.setCode("sireh.label.nomina.creaArchivoTerceros.titulo.issste");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                __jsp_taghandler_7.setCode("sireh.label.nomina.creaArchivoTerceros.titulo3");
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
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                __jsp_taghandler_8.setCode("sireh.label.nomina.creaArchivoTerceros.quincena");
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
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_9=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setKey("");
                __jsp_taghandler_9.setValue("selectList.nonValue");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_10=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setBeanName("listaSoloQnasHistorico");
                __jsp_taghandler_10.setPath("hpQnaPago");
                __jsp_taghandler_10.setProgress("true");
                __jsp_taghandler_10.setStyle("width: 100px;");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_5);
                __jsp_taghandler_11.setCode("sireh.label.nomina.creaArchivoTerceros.tipoQna");
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
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass");
                __jsp_taghandler_12.setParent(__jsp_taghandler_5);
                __jsp_taghandler_12.setPath("tipoQna");
                __jsp_taghandler_12.setCssClass("uppercase");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[15]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                        __jsp_taghandler_13.setValue("");
                        __jsp_taghandler_13.setLabel("SELECCIONE");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
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
                      out.write(__oracle_jsp_text[16]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                        __jsp_taghandler_14.setValue("0");
                        __jsp_taghandler_14.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${enQna}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_14.doCatch(th);
                        } finally {
                          __jsp_taghandler_14.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                      }
                      out.write(__oracle_jsp_text[17]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_15.setParent(__jsp_taghandler_12);
                        __jsp_taghandler_15.setValue("1");
                        __jsp_taghandler_15.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${noQna}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                          if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_15.doCatch(th);
                        } finally {
                          __jsp_taghandler_15.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,3);
                      }
                      out.write(__oracle_jsp_text[18]);
                    } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_12.doCatch(th);
                } finally {
                  __jsp_taghandler_12.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_5);
                __jsp_taghandler_16.setCode("sireh.label.nomina.creaArchivoTerceros.tipoTercero");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                  if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_16.doCatch(th);
                } finally {
                  __jsp_taghandler_16.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass");
                __jsp_taghandler_17.setParent(__jsp_taghandler_5);
                __jsp_taghandler_17.setPath("tipoEntero");
                __jsp_taghandler_17.setCssClass("uppercase");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[21]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_18.setValue("");
                        __jsp_taghandler_18.setLabel("SELECCIONE");
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
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_19.setValue("e");
                        __jsp_taghandler_19.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tEntero}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_19.doCatch(th);
                        } finally {
                          __jsp_taghandler_19.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                      }
                      out.write(__oracle_jsp_text[23]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_20.setParent(__jsp_taghandler_17);
                        __jsp_taghandler_20.setValue("c");
                        __jsp_taghandler_20.setLabel((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${tCancelado}",java.lang.String.class, __ojsp_varRes,null));
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                          if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_20.doCatch(th);
                        } finally {
                          __jsp_taghandler_20.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                      }
                      out.write(__oracle_jsp_text[24]);
                    } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_17.doCatch(th);
                } finally {
                  __jsp_taghandler_17.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_21.setParent(__jsp_taghandler_5);
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[26]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_22.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[27]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_23=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_23.setJspContext(pageContext);
                            __jsp_taghandler_23.setPath("muestraRegistros");
                            __jsp_taghandler_23.setAction("tercerosNomina/generacionArchivoTerceroPrestIssste.do");
                            __jsp_taghandler_23.setValue("submit.search");
                            __jsp_taghandler_23.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                          }
                          out.write(__oracle_jsp_text[28]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_24=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_24.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_24.setJspContext(pageContext);
                            __jsp_taghandler_24.setPath("cancel");
                            __jsp_taghandler_24.setAction("tercerosNomina/initGeneraArchivoTercerosPrestIssste.do");
                            __jsp_taghandler_24.setValue("submit.clean");
                            __jsp_taghandler_24.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                          }
                          out.write(__oracle_jsp_text[29]);
                          {
                            String __url=OracleJspRuntime.toStr("generaArchivoPrestIsssteGrid.jsp");
                            // Include 
                            pageContext.include( __url,false);
                            if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                          }

                          out.write(__oracle_jsp_text[30]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_25=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_25.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_25.setJspContext(pageContext);
                            __jsp_taghandler_25.setPath("generaArchivo");
                            __jsp_taghandler_25.setAction("tercerosNomina/generaTerceroPrestIssste.do");
                            __jsp_taghandler_25.setValue("submit.generate");
                            __jsp_taghandler_25.setProgressIcon("false");
                            __jsp_taghandler_25.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                          }
                          out.write(__oracle_jsp_text[31]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_26.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_26.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.leyenda}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                            if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,4);
                          }
                          out.write(__oracle_jsp_text[32]);
                        } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                    }
                    out.write(__oracle_jsp_text[33]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_27.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.generaArchivo}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[34]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_28=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_28.setJspContext(pageContext);
                            __jsp_taghandler_28.setPath("cancel");
                            __jsp_taghandler_28.setAction("tercerosNomina/initGeneraArchivoTercerosPrestIssste.do");
                            __jsp_taghandler_28.setValue("submit.clean");
                            __jsp_taghandler_28.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                          }
                          out.write(__oracle_jsp_text[35]);
                          {
                            String __url=OracleJspRuntime.toStr("generaArchivoPrestIsssteGrid.jsp");
                            // Include 
                            pageContext.include( __url,false);
                            if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                          }

                          out.write(__oracle_jsp_text[36]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_29.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${generaArchivosTercerosDTO.leyendag}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                            if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,4);
                          }
                          out.write(__oracle_jsp_text[37]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var scope value");
                            __jsp_taghandler_30.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_30.setVar("_action");
                            __jsp_taghandler_30.setScope("page");
                            __jsp_taghandler_30.setValue("/tercerosNomina/generaTerceroPrestIssste.do");
                            __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                            if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
                          }
                          out.write(__oracle_jsp_text[38]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_31.setParent(__jsp_taghandler_27);
                            __jsp_taghandler_31.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${_action}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                            if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,4);
                          }
                          out.write(__oracle_jsp_text[39]);
                        } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,3);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_32.setParent(__jsp_taghandler_21);
                      __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[41]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_33=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                            __jsp_taghandler_33.setJspContext(pageContext);
                            __jsp_taghandler_33.setPath("muestraRegistros");
                            __jsp_taghandler_33.setAction("tercerosNomina/generacionArchivoTerceroPrestIssste.do");
                            __jsp_taghandler_33.setValue("submit.search");
                            __jsp_taghandler_33.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                          }
                          out.write(__oracle_jsp_text[42]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_34=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_34.setParent(__jsp_taghandler_32);
                            __jsp_taghandler_34.setJspContext(pageContext);
                            __jsp_taghandler_34.setPath("cancel");
                            __jsp_taghandler_34.setAction("tercerosNomina/initGeneraArchivoTercerosPrestIssste.do");
                            __jsp_taghandler_34.setValue("submit.clean");
                            __jsp_taghandler_34.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                          }
                          out.write(__oracle_jsp_text[43]);
                        } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,3);
                    }
                    out.write(__oracle_jsp_text[44]);
                  } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write(__oracle_jsp_text[45]);
            } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_5.doCatch(th);
        } finally {
          __jsp_taghandler_5.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[46]);

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
  private static final char __oracle_jsp_text[][]=new char[47][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n<!--%@ taglib uri=\"http://displaytag.sf.net\" prefix=\"display\"%-->\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n\r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <h1> <strong> ".toCharArray();
    __oracle_jsp_text[9] = 
    " </strong> </h1>\r\n                <p>&nbsp;</p>\r\n            </td>   \r\n        </tr>\r\n        <tr> <td> </td> </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset id=\"quincenasFieldSet\">\r\n                    <legend style='font-size:1.2em'>\r\n                        <strong>".toCharArray();
    __oracle_jsp_text[10] = 
    "</strong>\r\n                    </legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr> <td>  </td> </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[12] = 
    " ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                            </td>      \r\n                            <td>  </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "    \r\n                                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[24] = 
    " \r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n            <td></td>\r\n        </tr>\r\n        <tr><td>\r\n    \r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n            <table width=\"100%\" align=\"center\" border=\"0\">\r\n                <tr>\r\n                    <td align=\"right\">\r\n                        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n            \r\n                ".toCharArray();
    __oracle_jsp_text[30] = 
    "  \r\n\r\n            <table width=\"100%\">\r\n                <tr align=\"center\">\r\n                    <td>\r\n                        ".toCharArray();
    __oracle_jsp_text[31] = 
    " \r\n                        <h1> ".toCharArray();
    __oracle_jsp_text[32] = 
    "  </h1>\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n                \r\n            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n             ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n             <table width=\"100%\" align=\"center\" border=\"0\">\r\n                <tr>\r\n                    <td align=\"right\">\r\n                        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n            \r\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "  \r\n\r\n                <tr> <td align=\"center\">\r\n                    <h1> ".toCharArray();
    __oracle_jsp_text[37] = 
    "  </h1>\r\n                </td> </tr>\r\n\r\n                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                \r\n                <script type=\"text/javascript\" >\r\n                document.forms[0].action=\"".toCharArray();
    __oracle_jsp_text[39] = 
    "\";\r\n                document.forms[0].submit();\r\n                </script>\r\n             ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n            <table width=\"100%\" align=\"center\" border=\"0\">\r\n                <tr>\r\n                    <td align=\"right\">\r\n                        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n     </td> </tr>\r\n    </table>\r\n".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
