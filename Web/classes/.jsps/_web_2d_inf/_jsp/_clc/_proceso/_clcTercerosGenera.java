package _web_2d_inf._jsp._clc._proceso;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _clcTercerosGenera extends com.orionserver.http.OrionHttpJspPage {


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
    _clcTercerosGenera page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("checkBoxTest");
        __jsp_taghandler_1.setModelAttribute("clcTercerosDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.clc.titulo.link");
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
                __jsp_taghandler_3.setCode("sireh.label.clc.proceso.titulo.link");
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
                __jsp_taghandler_4.setCode("sireh.label.clc.proceso.clcTerceros.titulo");
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
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("tipoClc");
                __jsp_taghandler_5.setValue("QUINCENAL");
                __jsp_taghandler_5.setLabel(" Quincenal");
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
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("tipoClc");
                __jsp_taghandler_6.setValue("MENSUAL");
                __jsp_taghandler_6.setLabel(" Mensual");
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
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_7=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setPath("verificaTipoClc");
                __jsp_taghandler_7.setAction("clcProceso/verificaTipoClc");
                __jsp_taghandler_7.setValue("submit.accept");
                __jsp_taghandler_7.setProgressBar("true");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.verificaTipoClc}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[12]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_9.setCode("sireh.label.clc.proceso.clcTerceros.ciclo");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_9.doCatch(th);
                      } finally {
                        __jsp_taghandler_9.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                    }
                    out.write(__oracle_jsp_text[13]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_10=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_10.setJspContext(pageContext);
                      __jsp_taghandler_10.setKey("");
                      __jsp_taghandler_10.setValue("selectList.nonValue");
                      __jsp_taghandler_10.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
                    }
                    out.write(__oracle_jsp_text[14]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_11=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_11.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_11.setJspContext(pageContext);
                      __jsp_taghandler_11.setBeanName("tdCxlcCicloProcesaTerceros");
                      __jsp_taghandler_11.setPath("ciclo");
                      __jsp_taghandler_11.setProgress("true");
                      __jsp_taghandler_11.setStyle("width: 200px;");
                      __jsp_taghandler_11.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
                    }
                    out.write(__oracle_jsp_text[15]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_12.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.tipoClc == 'QUINCENAL'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[16]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_13.setCode("sireh.label.clc.proceso.clcTerceros.quincena");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_13.doCatch(th);
                            } finally {
                              __jsp_taghandler_13.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
                          }
                          out.write(__oracle_jsp_text[17]);
                          {
                            _oracle._jsp._tag._selectList_tag __jsp_taghandler_14=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                            __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_14.setJspContext(pageContext);
                            __jsp_taghandler_14.setBeanName("tdCxlcQnaPagoProcesaTerceros");
                            __jsp_taghandler_14.setPath("quincena");
                            __jsp_taghandler_14.setParentPath("ciclo");
                            __jsp_taghandler_14.setProgress("true");
                            __jsp_taghandler_14.setMultiple("true");
                            __jsp_taghandler_14.setStyle("width: 200px;");
                            __jsp_taghandler_14.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                          }
                          out.write(__oracle_jsp_text[18]);
                        } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                    }
                    out.write(__oracle_jsp_text[19]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_15.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_15.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.tipoClc == 'MENSUAL'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[20]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                            __jsp_taghandler_16.setCode("sireh.label.clc.proceso.clcTerceros.mes");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_16.doCatch(th);
                            } finally {
                              __jsp_taghandler_16.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,4);
                          }
                          out.write(__oracle_jsp_text[21]);
                          {
                            org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                            __jsp_taghandler_17.setParent(__jsp_taghandler_15);
                            __jsp_taghandler_17.setPath("mes");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[22]);
                                  {
                                    org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                                    __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                                    __jsp_taghandler_18.setValue("");
                                    __jsp_taghandler_18.setLabel("SELECCIONE...");
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
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,5);
                                  }
                                  out.write(__oracle_jsp_text[23]);
                                  {
                                    org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                                    __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                                    __jsp_taghandler_19.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.mesesValores}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_taghandler_19.setItemValue("clave");
                                    __jsp_taghandler_19.setItemLabel("valor");
                                    try {
                                      __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                                      if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                    } catch (Throwable th) {
                                      __jsp_taghandler_19.doCatch(th);
                                    } finally {
                                      __jsp_taghandler_19.doFinally();
                                    }
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,5);
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
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
                          }
                          out.write(__oracle_jsp_text[25]);
                        } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,3);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_20.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_20.setCode("sireh.label.clc.proceso.clcTerceros.tipoNominaTerceros");
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
                    out.write(__oracle_jsp_text[27]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_21=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_21.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_21.setJspContext(pageContext);
                      __jsp_taghandler_21.setKey("");
                      __jsp_taghandler_21.setValue("selectList.nonValue");
                      __jsp_taghandler_21.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                    }
                    out.write(__oracle_jsp_text[28]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_22=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_22.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_22.setJspContext(pageContext);
                      __jsp_taghandler_22.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.beanNameTipoNomina}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_22.setPath("tipoNominaTerceros");
                      __jsp_taghandler_22.setProgress("true");
                      __jsp_taghandler_22.setStyle("width: 200px;");
                      __jsp_taghandler_22.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                    }
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_23=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_23.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_23.setJspContext(pageContext);
                      __jsp_taghandler_23.setPath("busquedaClc");
                      __jsp_taghandler_23.setAction("clcProceso/clcTercerosGenera");
                      __jsp_taghandler_23.setValue("submit.search");
                      __jsp_taghandler_23.setProgressBar("true");
                      __jsp_taghandler_23.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_24=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_24.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_24.setJspContext(pageContext);
                      __jsp_taghandler_24.setPath("cancel");
                      __jsp_taghandler_24.setAction("clcProceso/clcTercerosGenera");
                      __jsp_taghandler_24.setValue("submit.cancel");
                      __jsp_taghandler_24.setProgressBar("true");
                      __jsp_taghandler_24.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                    }
                    out.write(__oracle_jsp_text[31]);
                  } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[33]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[34]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_27=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_27.setJspContext(pageContext);
                            __jsp_taghandler_27.setProperty("C.CXLC_CICLO");
                            __jsp_taghandler_27.setCondition("=");
                            __jsp_taghandler_27.setPath("ciclo");
                            __jsp_taghandler_27.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                          }
                          out.write(__oracle_jsp_text[35]);
                          {
                            org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                            __jsp_taghandler_28.setParent(__jsp_taghandler_26);
                            __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[36]);
                                {
                                  org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                                  __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                                  __jsp_taghandler_29.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.tipoClc == 'MENSUAL'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                                  __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    do {
                                      out.write(__oracle_jsp_text[37]);
                                      {
                                        _oracle._jsp._tag._filter_tag __jsp_taghandler_30=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                        __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                                        __jsp_taghandler_30.setJspContext(pageContext);
                                        __jsp_taghandler_30.setProperty("C.CXLC_QNA_PAGO");
                                        __jsp_taghandler_30.setCondition("IN");
                                        __jsp_taghandler_30.setPath("quincenasList");
                                        __jsp_taghandler_30.doTag();
                                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                                      }
                                      out.write(__oracle_jsp_text[38]);
                                    } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  }
                                  if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,5);
                                }
                                out.write(__oracle_jsp_text[39]);
                                {
                                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                                  __jsp_taghandler_31.setParent(__jsp_taghandler_28);
                                  __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    do {
                                      out.write(__oracle_jsp_text[40]);
                                      {
                                        _oracle._jsp._tag._filter_tag __jsp_taghandler_32=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                        __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                                        __jsp_taghandler_32.setJspContext(pageContext);
                                        __jsp_taghandler_32.setProperty("C.CXLC_QNA_PAGO");
                                        __jsp_taghandler_32.setCondition("IN");
                                        __jsp_taghandler_32.setPath("quincenasList");
                                        __jsp_taghandler_32.doTag();
                                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                                      }
                                      out.write(__oracle_jsp_text[41]);
                                    } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  }
                                  if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,5);
                                }
                                out.write(__oracle_jsp_text[42]);
                              } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,4);
                          }
                          out.write(__oracle_jsp_text[43]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_33.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.beanName == 'busquedaClcProcesaTerceros_OTROS'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[44]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_34=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                                  __jsp_taghandler_34.setJspContext(pageContext);
                                  __jsp_taghandler_34.setProperty("S.SEC_GUIA_CONTABLE_EJER");
                                  __jsp_taghandler_34.setCondition("IN");
                                  __jsp_taghandler_34.setPath("guiasContablesList");
                                  __jsp_taghandler_34.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                                }
                                out.write(__oracle_jsp_text[45]);
                              } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,4);
                          }
                          out.write(__oracle_jsp_text[46]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_35=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_35.setParent(__jsp_taghandler_26);
                            __jsp_taghandler_35.setJspContext(pageContext);
                            __jsp_taghandler_35.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_35.setBaseUrl("clcTerceros");
                            __jsp_taghandler_35.setAppendFilters("false");
                            __jsp_taghandler_35.setCheckbox("true");
                            __jsp_taghandler_35.setChkProperty("cxlcGrupo");
                            __jsp_taghandler_35.setJspBody(new _clcTercerosGenera_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_35, __ojsp_varRes));
                            __jsp_taghandler_35.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
                          }
                          out.write(__oracle_jsp_text[47]);
                        } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                    }
                    out.write(__oracle_jsp_text[48]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_57=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_57.setParent(__jsp_taghandler_25);
                      __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[49]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_58.setParent(__jsp_taghandler_57);
                            __jsp_taghandler_58.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                              if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_58.doCatch(th);
                            } finally {
                              __jsp_taghandler_58.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,4);
                          }
                          out.write(__oracle_jsp_text[50]);
                        } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,3);
                    }
                    out.write(__oracle_jsp_text[51]);
                  } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setCode("sireh.label.clc.proceso.clcTerceros.quincenaPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                  if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_59.doCatch(th);
                } finally {
                  __jsp_taghandler_59.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,2);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setPath("qnaPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[54]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_61=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_61.setParent(__jsp_taghandler_60);
                        __jsp_taghandler_61.setValue("");
                        __jsp_taghandler_61.setLabel("SELECCIONE...");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                          if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_61.doCatch(th);
                        } finally {
                          __jsp_taghandler_61.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,3);
                      }
                      out.write(__oracle_jsp_text[55]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_62.setParent(__jsp_taghandler_60);
                        __jsp_taghandler_62.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.cicloValoresQnaPago}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_62.setItemValue("clave");
                        __jsp_taghandler_62.setItemLabel("valor");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                          if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_62.doCatch(th);
                        } finally {
                          __jsp_taghandler_62.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,3);
                      }
                      out.write(__oracle_jsp_text[56]);
                    } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_60.doCatch(th);
                } finally {
                  __jsp_taghandler_60.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,2);
              }
              out.write(__oracle_jsp_text[57]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_63=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setCode("sireh.label.clc.proceso.clcTerceros.complemento");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                  if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_63.doCatch(th);
                } finally {
                  __jsp_taghandler_63.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,2);
              }
              out.write(__oracle_jsp_text[58]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_64=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setJspContext(pageContext);
                __jsp_taghandler_64.setPath("complemento");
                __jsp_taghandler_64.setSize("2");
                __jsp_taghandler_64.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_64, pageContext);
              }
              out.write(__oracle_jsp_text[59]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_65=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setCode("sireh.label.clc.proceso.clcTerceros.reprocesa");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                  if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_65.doCatch(th);
                } finally {
                  __jsp_taghandler_65.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,2);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_66=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setPath("checkBoxReprocesa");
                __jsp_taghandler_66.setValue("S");
                __jsp_taghandler_66.setLabel(" SI");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                  if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_66.doCatch(th);
                } finally {
                  __jsp_taghandler_66.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,2);
              }
              out.write(__oracle_jsp_text[61]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_67=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_67.setParent(__jsp_taghandler_1);
                __jsp_taghandler_67.setPath("checkBoxReprocesa");
                __jsp_taghandler_67.setValue("N");
                __jsp_taghandler_67.setLabel(" NO");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                  if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_67.doCatch(th);
                } finally {
                  __jsp_taghandler_67.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,2);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_68=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.muestraErrores}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[63]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_69=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_69.setParent(__jsp_taghandler_68);
                      __jsp_taghandler_69.setJspContext(pageContext);
                      __jsp_taghandler_69.setProperty("E.CE_CICLO");
                      __jsp_taghandler_69.setCondition("=");
                      __jsp_taghandler_69.setPath("ciclo");
                      __jsp_taghandler_69.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_69, pageContext);
                    }
                    out.write(__oracle_jsp_text[64]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_70=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_70.setParent(__jsp_taghandler_68);
                      __jsp_taghandler_70.setJspContext(pageContext);
                      __jsp_taghandler_70.setProperty("E.CE_QNA_PAGO");
                      __jsp_taghandler_70.setCondition("=");
                      __jsp_taghandler_70.setPath("qnaPago");
                      __jsp_taghandler_70.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_70, pageContext);
                    }
                    out.write(__oracle_jsp_text[65]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_71=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_71.setParent(__jsp_taghandler_68);
                      __jsp_taghandler_71.setJspContext(pageContext);
                      __jsp_taghandler_71.setProperty("E.ID_TIPO_NOMINA");
                      __jsp_taghandler_71.setCondition("=");
                      __jsp_taghandler_71.setPath("tipoNominaTerceros");
                      __jsp_taghandler_71.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_71, pageContext);
                    }
                    out.write(__oracle_jsp_text[66]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_72=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_72.setParent(__jsp_taghandler_68);
                      __jsp_taghandler_72.setJspContext(pageContext);
                      __jsp_taghandler_72.setProperty("E.CE_COMPLEMENTO");
                      __jsp_taghandler_72.setCondition("=");
                      __jsp_taghandler_72.setPath("complemento");
                      __jsp_taghandler_72.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_72, pageContext);
                    }
                    out.write(__oracle_jsp_text[67]);
                    {
                      _oracle._jsp._tag._pagedList_tag __jsp_taghandler_73=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                      __jsp_taghandler_73.setParent(__jsp_taghandler_68);
                      __jsp_taghandler_73.setJspContext(pageContext);
                      __jsp_taghandler_73.setBeanName("clcTercerosErrores");
                      __jsp_taghandler_73.setBaseUrl("clcTerceros");
                      __jsp_taghandler_73.setAppendFilters("false");
                      __jsp_taghandler_73.setJspBody(new _clcTercerosGenera_OjspFragmentSupport( 1, pageContext, __jsp_taghandler_73, __ojsp_varRes));
                      __jsp_taghandler_73.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_73, pageContext);
                    }
                    out.write(__oracle_jsp_text[68]);
                  } while (__jsp_taghandler_68.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,2);
              }
              out.write(__oracle_jsp_text[69]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_94=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_94.setParent(__jsp_taghandler_1);
                __jsp_taghandler_94.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
                  if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_94.doCatch(th);
                } finally {
                  __jsp_taghandler_94.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94,2);
              }
              out.write(__oracle_jsp_text[70]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_95=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_95.setParent(__jsp_taghandler_1);
                __jsp_taghandler_95.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.muestraErrores}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[71]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_96=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_96.setParent(__jsp_taghandler_95);
                      __jsp_taghandler_96.setJspContext(pageContext);
                      __jsp_taghandler_96.setAction("clcProceso/marcaRevisadoExisteErrorTerceros");
                      __jsp_taghandler_96.setValue("submit.revisarErrores");
                      __jsp_taghandler_96.setProgressBar("true");
                      __jsp_taghandler_96.setAlertCode("confirm.clc.proceso.terceros.revisar");
                      __jsp_taghandler_96.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_96, pageContext);
                    }
                    out.write(__oracle_jsp_text[72]);
                  } while (__jsp_taghandler_95.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95,2);
              }
              out.write(__oracle_jsp_text[73]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_97=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_97.setParent(__jsp_taghandler_1);
                __jsp_taghandler_97.setJspContext(pageContext);
                __jsp_taghandler_97.setPath("generar");
                __jsp_taghandler_97.setAction("clcProceso/executeProcedureClcTerceros");
                __jsp_taghandler_97.setValue("submit.generate");
                __jsp_taghandler_97.setProgressBar("true");
                __jsp_taghandler_97.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_97, pageContext);
              }
              out.write(__oracle_jsp_text[74]);
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
      out.write(__oracle_jsp_text[75]);

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

  private class _clcTercerosGenera_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _clcTercerosGenera_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_35       = parent;
      out.write("\r\n                                                                               \r\n                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_36=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_36.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_35));
        __jsp_taghandler_36.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_36.setPagesize(10);
        __jsp_taghandler_36.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_36.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_36.setClass("displaytag");
        __jsp_taghandler_36.setExport(true);
        __jsp_taghandler_36.setUid("row");
        __jsp_taghandler_36.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_36,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                             \r\n                             ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                      __jsp_taghandler_38.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty row.secCxlcTerceros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_39=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                            __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                            __jsp_taghandler_39.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcGrupo");
                            __jsp_taghandler_39.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_39,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                                        <input name=\"cxlcGrupo\" \r\n                                               class=\"box\"\r\n                                               type=\"checkbox\" \r\n                                               value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                                    __jsp_taghandler_40.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cxlc}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.secCxlcTerceros}",java.lang.String.class, __ojsp_varRes, null)));
                                    __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                                    if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,9);
                                  }
                                  out.write("\" \r\n                                               disabled=\"\" \r\n                                               title=\"Esta clc ya ha sido procesada\"/>\r\n                                    ");
                                } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,8);
                          }
                          out.write("\r\n                                ");
                        } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,7);
                    }
                    out.write("\r\n                                ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_41.setParent(__jsp_taghandler_37);
                      __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_42=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                            __jsp_taghandler_42.setParent(__jsp_taghandler_41);
                            __jsp_taghandler_42.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcGrupo");
                            __jsp_taghandler_42.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_42,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                                        <input name=\"cxlcGrupo\" \r\n                                               class=\"box\"\r\n                                               type=\"checkbox\" \r\n                                               value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_43.setParent(__jsp_taghandler_42);
                                    __jsp_taghandler_43.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cxlc}",java.lang.String.class, __ojsp_varRes, null)+"|0"));
                                    __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                                    if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,9);
                                  }
                                  out.write("\"/>\r\n                                    ");
                                } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,8);
                          }
                          out.write("\r\n                                ");
                        } while (__jsp_taghandler_41.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,7);
                    }
                    out.write("\r\n                            ");
                  } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
              }
              out.write("\r\n                                \r\n                            ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_44.setParent(__jsp_taghandler_36);
                __jsp_taghandler_44.setVar("rojo");
                __jsp_taghandler_44.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.secCxlcTerceros ne null ? 'color: red;' : ''}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
              }
              out.write("\r\n                                \r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_45.setParent(__jsp_taghandler_36);
                __jsp_taghandler_45.setProperty("cxlc");
                __jsp_taghandler_45.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlc");
                __jsp_taghandler_45.setSortable(true);
                __jsp_taghandler_45.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_46=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_46.setParent(__jsp_taghandler_36);
                __jsp_taghandler_46.setProperty("cxlcQnaPago");
                __jsp_taghandler_46.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcQnaPago");
                __jsp_taghandler_46.setSortable(true);
                __jsp_taghandler_46.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_36);
                __jsp_taghandler_47.setProperty("idTipoNomina");
                __jsp_taghandler_47.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.idTipoNomina");
                __jsp_taghandler_47.setSortable(true);
                __jsp_taghandler_47.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_36);
                __jsp_taghandler_48.setProperty("cxlcComplemento");
                __jsp_taghandler_48.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcComplemento");
                __jsp_taghandler_48.setSortable(true);
                __jsp_taghandler_48.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_49=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_49.setParent(__jsp_taghandler_36);
                __jsp_taghandler_49.setProperty("secCxlcTerceros");
                __jsp_taghandler_49.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.secCxlcTerceros");
                __jsp_taghandler_49.setSortable(true);
                __jsp_taghandler_49.setStyle((java.lang.String) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)+" font-weight: bold;"));
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_50=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_50.setParent(__jsp_taghandler_36);
                __jsp_taghandler_50.setProperty("cxlcCompromiso");
                __jsp_taghandler_50.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcCompromiso");
                __jsp_taghandler_50.setSortable(true);
                __jsp_taghandler_50.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_51.setParent(__jsp_taghandler_36);
                __jsp_taghandler_51.setProperty("cxlcDevengado");
                __jsp_taghandler_51.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcDevengado");
                __jsp_taghandler_51.setSortable(true);
                __jsp_taghandler_51.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_52=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format class style");
                __jsp_taghandler_52.setParent(__jsp_taghandler_36);
                __jsp_taghandler_52.setProperty("monto");
                __jsp_taghandler_52.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.monto");
                __jsp_taghandler_52.setSortable(true);
                __jsp_taghandler_52.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_52.setClass("amount");
                __jsp_taghandler_52.setStyle((java.lang.String) ("text-align: right; "+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,6);
              }
              out.write("\r\n                            \r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_53=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_53.setParent(__jsp_taghandler_36);
                __jsp_taghandler_53.setName("paging.banner.placement");
                __jsp_taghandler_53.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_54=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_54.setParent(__jsp_taghandler_36);
                __jsp_taghandler_54.setName("export.pdf");
                __jsp_taghandler_54.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_55=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_55.setParent(__jsp_taghandler_36);
                __jsp_taghandler_55.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_55,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_56.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_56.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                          if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_56.doCatch(th);
                        } finally {
                          __jsp_taghandler_56.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,7);
                      }
                      out.write("<br><br></span>\r\n                            ");
                    } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,6);
              }
              out.write("\r\n                        ");
            } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,5);
      }
      out.write("\r\n                    ");
      return;
    }

      
    public void invoke1(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_73       = parent;
      out.write("\r\n                               \r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_74=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_74.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_73));
        __jsp_taghandler_74.setName("clcTercerosErrores");
        __jsp_taghandler_74.setPagesize(10);
        __jsp_taghandler_74.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_74.setClass("displaytag");
        __jsp_taghandler_74.setExport(true);
        __jsp_taghandler_74.setUid("row3");
        __jsp_taghandler_74.setSort("list");
        java.lang.Object row3 = null;
        java.lang.Integer row3_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_74,__jsp_tag_starteval,out);
            do {
              row3 = (java.lang.Object) pageContext.findAttribute("row3");
              row3_rowNum = (java.lang.Integer) pageContext.findAttribute("row3_rowNum");
              out.write("\r\n                                       \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_75=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_75.setParent(__jsp_taghandler_74);
                __jsp_taghandler_75.setProperty("ceSecuencia");
                __jsp_taghandler_75.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.id");
                __jsp_taghandler_75.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_76=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_76.setParent(__jsp_taghandler_74);
                __jsp_taghandler_76.setProperty("ceCiclo");
                __jsp_taghandler_76.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.ciclo");
                __jsp_taghandler_76.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_77=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_77.setParent(__jsp_taghandler_74);
                __jsp_taghandler_77.setProperty("ceQnaPago");
                __jsp_taghandler_77.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.quincenaPago");
                __jsp_taghandler_77.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,5);
              }
              out.write("          \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_78=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_78.setParent(__jsp_taghandler_74);
                __jsp_taghandler_78.setProperty("idTipoNomina");
                __jsp_taghandler_78.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.tipoNomina");
                __jsp_taghandler_78.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_79=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_79.setParent(__jsp_taghandler_74);
                __jsp_taghandler_79.setProperty("ceComplemento");
                __jsp_taghandler_79.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.complemento");
                __jsp_taghandler_79.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_80=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_80.setParent(__jsp_taghandler_74);
                __jsp_taghandler_80.setProperty("descError");
                __jsp_taghandler_80.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.descError");
                __jsp_taghandler_80.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_81=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_81.setParent(__jsp_taghandler_74);
                __jsp_taghandler_81.setProperty("idFolio");
                __jsp_taghandler_81.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.folio");
                __jsp_taghandler_81.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_82=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_82.setParent(__jsp_taghandler_74);
                __jsp_taghandler_82.setProperty("idTipoCpto");
                __jsp_taghandler_82.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.tipoConcepto");
                __jsp_taghandler_82.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_83=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_83.setParent(__jsp_taghandler_74);
                __jsp_taghandler_83.setProperty("idCptoPago");
                __jsp_taghandler_83.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.conceptoPago");
                __jsp_taghandler_83.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_84=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_84.setParent(__jsp_taghandler_74);
                __jsp_taghandler_84.setProperty("idUnidadNom");
                __jsp_taghandler_84.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.unidad");
                __jsp_taghandler_84.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_85=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_85.setParent(__jsp_taghandler_74);
                __jsp_taghandler_85.setProperty("idEdo");
                __jsp_taghandler_85.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.estado");
                __jsp_taghandler_85.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_86=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_86.setParent(__jsp_taghandler_74);
                __jsp_taghandler_86.setProperty("ceMonto");
                __jsp_taghandler_86.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.monto");
                __jsp_taghandler_86.setSortable(true);
                __jsp_taghandler_86.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_86.setStyle("text-align:right");
                __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_87=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_87.setParent(__jsp_taghandler_74);
                __jsp_taghandler_87.setProperty("revisado");
                __jsp_taghandler_87.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.revisado");
                __jsp_taghandler_87.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_88=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_88.setParent(__jsp_taghandler_74);
                __jsp_taghandler_88.setProperty("usuario");
                __jsp_taghandler_88.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.usuario");
                __jsp_taghandler_88.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_89=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_89.setParent(__jsp_taghandler_74);
                __jsp_taghandler_89.setProperty("fecModifico");
                __jsp_taghandler_89.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.fecha");
                __jsp_taghandler_89.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89,5);
              }
              out.write("\r\n                                        \r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_90=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_90.setParent(__jsp_taghandler_74);
                __jsp_taghandler_90.setName("paging.banner.placement");
                __jsp_taghandler_90.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_91=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_91.setParent(__jsp_taghandler_74);
                __jsp_taghandler_91.setName("export.pdf");
                __jsp_taghandler_91.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_92=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_92.setParent(__jsp_taghandler_74);
                __jsp_taghandler_92.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_92,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_93=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_93.setParent(__jsp_taghandler_92);
                        __jsp_taghandler_93.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                          if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_93.doCatch(th);
                        } finally {
                          __jsp_taghandler_93.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93,6);
                      }
                      out.write("<br><br></span>\r\n                        ");
                    } while (__jsp_taghandler_92.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92,5);
              }
              out.write("\r\n                    ");
            } while (__jsp_taghandler_74.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,4);
      }
      out.write("\r\n                ");
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
          case 1:
            invoke1( out );
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

  private static final char __oracle_jsp_text[][]=new char[76][];
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
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[6] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"60%\">\r\n        <tr>                        \r\n            <td align=\"right\">\r\n                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n            </td>\r\n            <td align=\"left\">\r\n                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td height=\"10px\" colspan=\"2\"> &nbsp; </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"2\" align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td height=\"20px\" colspan=\"2\"> &nbsp; </td>\r\n        </tr>\r\n    </table>\r\n        \r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n        <table align=\"center\" width=\"100%\">        \r\n            <tr valign=\"top\">\r\n                <td>\r\n                    <fieldset>\r\n                        <legend style=\"font-size:1.3em\">\r\n                            <strong>&nbsp;&nbsp; Criterios de b&uacute;squeda &nbsp;&nbsp;</strong>\r\n                        </legend>\r\n                        <table>\r\n                            <tr>\r\n                                <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                                <td width=\"200px\" align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                <tr id=\"quincenal\">\r\n                                    <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                                    <td width=\"200px\" align=\"left\">\r\n                                        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                                    </td>\r\n                                </tr>\r\n                            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                                <tr id=\"mensual\">\r\n                                    <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                                    <td width=\"200px\" align=\"left\">\r\n                                        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                    </td>\r\n                                </tr>\r\n                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            <tr>\r\n                                <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                                <td width=\"200px\" align=\"left\" align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                    \r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </fieldset>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>\r\n                    <table width=\"100%\">\r\n                        <tr>\r\n                            <td align=\"left\" height=\"20px\" valign=\"middle\"> &nbsp; </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"center\">\r\n                                ".toCharArray();
    __oracle_jsp_text[30] = 
    " &nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n        \r\n    <br/>\r\n    <fieldset>\r\n        <legend style=\"font-size:1.3em\">\r\n            <strong>&nbsp;&nbsp; N&oacute;minas &nbsp;&nbsp;</strong>\r\n        </legend>\r\n        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                \r\n                <div id=\"displayTagDiv\">\r\n                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                </div>\r\n                    \r\n                <table align=\"center\" width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"left\" height=\"10px\" valign=\"middle\"> &nbsp; </td>\r\n                    </tr>\r\n                    <tr valign=\"top\">\r\n                        <td align=\"right\">\r\n                            <span id=\"montoTotal\" style=\"font-size:2em\">Total N&oacute;minas: $ 0.00</span>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td height=\"20px\"> &nbsp; </td>\r\n                    </tr>\r\n                </table>\r\n            ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[50] = 
    "<br><br></span>\r\n            ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n    </fieldset>\r\n    \r\n    <br/>\r\n    <table align=\"center\" width=\"100%\">\r\n        <tr valign=\"top\">\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp; Procesar &nbsp;&nbsp;</strong>\r\n                    </legend>\r\n                    <table>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[53] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">                                    \r\n                                ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[58] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[60] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n        \r\n    ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n        <br/>\r\n        <fieldset>\r\n            <legend style=\"font-size:1.3em\">\r\n                <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>\r\n            </legend>\r\n        \r\n            ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n            \r\n            <div id=\"displayTagDiv3\">\r\n                ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n            </div>\r\n        </fieldset>\r\n    ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n    \r\n    <table align=\"left\" width=\"100%\">\r\n        <tr>\r\n            <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                <strong>\r\n                    ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n                </strong>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[71] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[72] = 
    " &nbsp; \r\n                            ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j('.box').change(function(){\r\n            var total = 0;\r\n            var tercerosArray = [];\r\n            var tercerosValidos = false;\r\n            \r\n            $j('.box:checked').each(function(){\r\n                // Monto\r\n                var auxMonto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                auxMonto = auxMonto.replace(\"$ \", \"\");\r\n                auxMonto = auxMonto.replace(/,/g, \"\");\r\n                total+=parseFloat(auxMonto);\r\n                \r\n                // Terceros\r\n                var auxTerceros = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();\r\n                if (auxTerceros != null && auxTerceros != '') {\r\n                    tercerosArray.push(auxTerceros);\r\n                    //console.log(\"Terceros: \" + auxTerceros);\r\n                }\r\n            });\r\n            // Monto\r\n            $j(\"#montoTotal\").text(\"Total N\\u00f3minas: $ \" + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();\r\n            \r\n            // Terceros\r\n            var sorted_arr = tercerosArray.sort();\r\n            //console.log(\"Sorted: \" + sorted_arr);\r\n            \r\n            var checkBoxReprocesa = \"\";\r\n            var selected = $j(\"input:radio[name=checkBoxReprocesa]:checked\");\r\n            if (selected.length > 0) {\r\n                checkBoxReprocesa = selected.val();\r\n            }\r\n            //console.log(\"checkBoxReprocesa: \" + checkBoxReprocesa);\r\n            if (checkBoxReprocesa == 'N' && tercerosArray.length == 0) {\r\n                tercerosValidos = true;\r\n            } else if (tercerosArray.length == 1) {\r\n                tercerosValidos = true;\r\n            } else {\r\n                for (var i = 0; i < tercerosArray.length; i++) {\r\n                    //console.log(sorted_arr[i + 1] + \" - \" + sorted_arr[i]);\r\n                    if (sorted_arr[i + 1] != null) {\r\n                        if (sorted_arr[i + 1] != sorted_arr[i]) {\r\n                            tercerosValidos = false;\r\n                            break;\r\n                        } else {\r\n                            tercerosValidos = true;\r\n                        }\r\n                    }\r\n                }\r\n            }\r\n            \r\n            if (checkBoxReprocesa == 'S' && tercerosArray.length > 0) {\r\n                if (tercerosValidos) {\r\n                    $j(\"input[id=10004]\").removeAttr(\"disabled\");\r\n                } else {\r\n                    alert(\"No es posible procesar clc de diferentes terceros.\");\r\n                    $j(\"input[id=10004]\").attr(\"disabled\", \"disabled\");\r\n                }\r\n            }\r\n        });\r\n        \r\n        $j.fn.digits = function(){ \r\n            return this.each(function(){ \r\n                $j(this).text($j(this).text().replace(/(\\d)(?=(\\d\\d\\d)+(?!\\d))/g, \"$1,\")); \r\n            });\r\n        }\r\n        \r\n        $j(\"input:radio[name=checkBoxReprocesa]\").click(function() {\r\n            var checkBoxReprocesa = $j(this).val();            \r\n            if (checkBoxReprocesa == 'S') {\r\n                $j('[name=\"cxlcGrupo\"]').prop('disabled', false);\r\n            }\r\n        });\r\n        \r\n        $j(document).ready(function(){\r\n            $j('#complemento').mask('99');\r\n        });\r\n    </script>\r\n".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
