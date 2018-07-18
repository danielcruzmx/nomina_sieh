package _web_2d_inf._jsp._clc._proceso;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _clcPatronalesGenera extends com.orionserver.http.OrionHttpJspPage {


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
    _clcPatronalesGenera page = this;
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
        __jsp_taghandler_1.setModelAttribute("clcPatronalesDTO");
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
                __jsp_taghandler_4.setCode("sireh.label.clc.proceso.clcPatronales.titulo");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("beanName");
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
                __jsp_taghandler_6.setValue("QUINCENAL");
                __jsp_taghandler_6.setLabel(" Quincenal");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("tipoClc");
                __jsp_taghandler_7.setValue("MENSUAL");
                __jsp_taghandler_7.setLabel(" Mensual");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("tipoClc");
                __jsp_taghandler_8.setValue("BIMESTRAL");
                __jsp_taghandler_8.setLabel(" Bimestral");
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
                _oracle._jsp._tag._submit_tag __jsp_taghandler_9=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setPath("verificaTipoClc");
                __jsp_taghandler_9.setAction("clcProcesoPatronales/verificaTipoClc");
                __jsp_taghandler_9.setValue("submit.accept");
                __jsp_taghandler_9.setProgressBar("true");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.verificaTipoClc}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[14]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_11.setCode("sireh.label.clc.proceso.clcPatronales.ciclo");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_11.doCatch(th);
                      } finally {
                        __jsp_taghandler_11.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                    }
                    out.write(__oracle_jsp_text[15]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_12=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_12.setJspContext(pageContext);
                      __jsp_taghandler_12.setKey("");
                      __jsp_taghandler_12.setValue("selectList.nonValue");
                      __jsp_taghandler_12.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
                    }
                    out.write(__oracle_jsp_text[16]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_13=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_13.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_13.setJspContext(pageContext);
                      __jsp_taghandler_13.setBeanName("tdCxlcCicloProcesaPatronales");
                      __jsp_taghandler_13.setPath("ciclo");
                      __jsp_taghandler_13.setProgress("true");
                      __jsp_taghandler_13.setStyle("width: 200px;");
                      __jsp_taghandler_13.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_14.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_14.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.tipoClc == 'QUINCENAL' || clcPatronalesDTO.tipoClc == 'BIMESTRAL'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[18]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_15.setParent(__jsp_taghandler_14);
                            __jsp_taghandler_15.setCode("sireh.label.clc.proceso.clcPatronales.quincena");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_15.doCatch(th);
                            } finally {
                              __jsp_taghandler_15.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
                          }
                          out.write(__oracle_jsp_text[19]);
                          {
                            _oracle._jsp._tag._selectList_tag __jsp_taghandler_16=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                            __jsp_taghandler_16.setParent(__jsp_taghandler_14);
                            __jsp_taghandler_16.setJspContext(pageContext);
                            __jsp_taghandler_16.setBeanName("tdCxlcQnaPagoProcesaPatronales");
                            __jsp_taghandler_16.setPath("quincena");
                            __jsp_taghandler_16.setParentPath("ciclo");
                            __jsp_taghandler_16.setProgress("true");
                            __jsp_taghandler_16.setMultiple("true");
                            __jsp_taghandler_16.setStyle("width: 200px;");
                            __jsp_taghandler_16.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
                          }
                          out.write(__oracle_jsp_text[20]);
                        } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                    }
                    out.write(__oracle_jsp_text[21]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_17.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_17.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.tipoClc == 'MENSUAL'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[22]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_18.setCode("sireh.label.clc.proceso.clcPatronales.mes");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_18.doCatch(th);
                            } finally {
                              __jsp_taghandler_18.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
                          }
                          out.write(__oracle_jsp_text[23]);
                          {
                            org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                            __jsp_taghandler_19.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_19.setPath("mes");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write(__oracle_jsp_text[24]);
                                  {
                                    org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                                    __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                                    __jsp_taghandler_20.setValue("");
                                    __jsp_taghandler_20.setLabel("SELECCIONE...");
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
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,5);
                                  }
                                  out.write(__oracle_jsp_text[25]);
                                  {
                                    org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                                    __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                                    __jsp_taghandler_21.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.mesesValores}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_taghandler_21.setItemValue("clave");
                                    __jsp_taghandler_21.setItemLabel("valor");
                                    try {
                                      __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                                      if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                        return;
                                    } catch (Throwable th) {
                                      __jsp_taghandler_21.doCatch(th);
                                    } finally {
                                      __jsp_taghandler_21.doFinally();
                                    }
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,5);
                                  }
                                  out.write(__oracle_jsp_text[26]);
                                } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_19.doCatch(th);
                            } finally {
                              __jsp_taghandler_19.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,4);
                          }
                          out.write(__oracle_jsp_text[27]);
                        } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,3);
                    }
                    out.write(__oracle_jsp_text[28]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_22.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_22.setCode("sireh.label.clc.proceso.clcPatronales.tipoNominaPatronales");
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
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_23=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_23.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_23.setJspContext(pageContext);
                      __jsp_taghandler_23.setKey("");
                      __jsp_taghandler_23.setValue("selectList.nonValue");
                      __jsp_taghandler_23.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_24=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_24.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_24.setJspContext(pageContext);
                      __jsp_taghandler_24.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.beanNameTipoNomina}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_24.setPath("tipoNominaPatronales");
                      __jsp_taghandler_24.setProgress("true");
                      __jsp_taghandler_24.setStyle("width: 200px;");
                      __jsp_taghandler_24.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_25.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_25.setCode("sireh.label.clc.proceso.clcPatronales.estado");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                        if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_25.doCatch(th);
                      } finally {
                        __jsp_taghandler_25.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,3);
                    }
                    out.write(__oracle_jsp_text[32]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_26=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_26.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_26.setJspContext(pageContext);
                      __jsp_taghandler_26.setKey("");
                      __jsp_taghandler_26.setValue("selectList.nonValue");
                      __jsp_taghandler_26.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                    }
                    out.write(__oracle_jsp_text[33]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_27=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_27.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_27.setJspContext(pageContext);
                      __jsp_taghandler_27.setBeanName("tcEstadoProcesaPatronales");
                      __jsp_taghandler_27.setPath("estado");
                      __jsp_taghandler_27.setProgress("true");
                      __jsp_taghandler_27.setStyle("width: 200px;");
                      __jsp_taghandler_27.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                    }
                    out.write(__oracle_jsp_text[34]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_28=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_28.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_28.setJspContext(pageContext);
                      __jsp_taghandler_28.setPath("busquedaClc");
                      __jsp_taghandler_28.setAction("clcProcesoPatronales/clcPatronalesGenera");
                      __jsp_taghandler_28.setValue("submit.search");
                      __jsp_taghandler_28.setProgressBar("true");
                      __jsp_taghandler_28.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                    }
                    out.write(__oracle_jsp_text[35]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_29=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_29.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_29.setJspContext(pageContext);
                      __jsp_taghandler_29.setPath("cancel");
                      __jsp_taghandler_29.setAction("clcProcesoPatronales/clcPatronalesGenera");
                      __jsp_taghandler_29.setValue("submit.cancel");
                      __jsp_taghandler_29.setProgressBar("true");
                      __jsp_taghandler_29.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                    }
                    out.write(__oracle_jsp_text[36]);
                  } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[38]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                      __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[39]);
                          {
                            org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                            __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                            __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[40]);
                                {
                                  org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                                  __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                                  __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.tipoClc == 'MENSUAL'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                                  __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    do {
                                      out.write(__oracle_jsp_text[41]);
                                      {
                                        _oracle._jsp._tag._filter_tag __jsp_taghandler_34=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                        __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                                        __jsp_taghandler_34.setJspContext(pageContext);
                                        __jsp_taghandler_34.setProperty("H.HP_QNA_PAGO");
                                        __jsp_taghandler_34.setCondition("IN");
                                        __jsp_taghandler_34.setPath("quincenasList");
                                        __jsp_taghandler_34.doTag();
                                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                                      }
                                      out.write(__oracle_jsp_text[42]);
                                    } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  }
                                  if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,5);
                                }
                                out.write(__oracle_jsp_text[43]);
                                {
                                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                                  __jsp_taghandler_35.setParent(__jsp_taghandler_32);
                                  __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    do {
                                      out.write(__oracle_jsp_text[44]);
                                      {
                                        _oracle._jsp._tag._filter_tag __jsp_taghandler_36=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                        __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                                        __jsp_taghandler_36.setJspContext(pageContext);
                                        __jsp_taghandler_36.setProperty("H.HP_QNA_PAGO");
                                        __jsp_taghandler_36.setCondition("IN");
                                        __jsp_taghandler_36.setPath("quincenasList");
                                        __jsp_taghandler_36.doTag();
                                        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
                                      }
                                      out.write(__oracle_jsp_text[45]);
                                    } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  }
                                  if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                    return;
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,5);
                                }
                                out.write(__oracle_jsp_text[46]);
                              } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,4);
                          }
                          out.write(__oracle_jsp_text[47]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_37=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_37.setParent(__jsp_taghandler_31);
                            __jsp_taghandler_37.setJspContext(pageContext);
                            __jsp_taghandler_37.setProperty("C.ID_CPTO_PAGO");
                            __jsp_taghandler_37.setCondition("IN");
                            __jsp_taghandler_37.setPath("conceptoPagoList");
                            __jsp_taghandler_37.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
                          }
                          out.write(__oracle_jsp_text[48]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_38.setParent(__jsp_taghandler_31);
                            __jsp_taghandler_38.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.tipoNominaPatronales == 'N2'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[49]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_39=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                                  __jsp_taghandler_39.setJspContext(pageContext);
                                  __jsp_taghandler_39.setProperty("H.ID_EDO_NOM");
                                  __jsp_taghandler_39.setCondition("=");
                                  __jsp_taghandler_39.setPath("estado");
                                  __jsp_taghandler_39.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
                                }
                                out.write(__oracle_jsp_text[50]);
                              } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,4);
                          }
                          out.write(__oracle_jsp_text[51]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_40=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_40.setParent(__jsp_taghandler_31);
                            __jsp_taghandler_40.setJspContext(pageContext);
                            __jsp_taghandler_40.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_40.setBaseUrl("clcPatronales");
                            __jsp_taghandler_40.setAppendFilters("false");
                            __jsp_taghandler_40.setCheckbox("true");
                            __jsp_taghandler_40.setChkProperty("nominaGrupo");
                            __jsp_taghandler_40.setJspBody(new _clcPatronalesGenera_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_40, __ojsp_varRes));
                            __jsp_taghandler_40.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
                          }
                          out.write(__oracle_jsp_text[52]);
                        } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,3);
                    }
                    out.write(__oracle_jsp_text[53]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_53.setParent(__jsp_taghandler_30);
                      __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[54]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_54.setParent(__jsp_taghandler_53);
                            __jsp_taghandler_54.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                              if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_54.doCatch(th);
                            } finally {
                              __jsp_taghandler_54.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,4);
                          }
                          out.write(__oracle_jsp_text[55]);
                        } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,3);
                    }
                    out.write(__oracle_jsp_text[56]);
                  } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,2);
              }
              out.write(__oracle_jsp_text[57]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_55=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setCode("sireh.label.clc.proceso.clcPatronales.quincenaPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                  if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_55.doCatch(th);
                } finally {
                  __jsp_taghandler_55.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,2);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setPath("qnaPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[59]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_57=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_57.setParent(__jsp_taghandler_56);
                        __jsp_taghandler_57.setValue("");
                        __jsp_taghandler_57.setLabel("SELECCIONE...");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                          if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_57.doCatch(th);
                        } finally {
                          __jsp_taghandler_57.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,3);
                      }
                      out.write(__oracle_jsp_text[60]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_58.setParent(__jsp_taghandler_56);
                        __jsp_taghandler_58.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.cicloValoresQnaPago}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_58.setItemValue("clave");
                        __jsp_taghandler_58.setItemLabel("valor");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                          if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_58.doCatch(th);
                        } finally {
                          __jsp_taghandler_58.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,3);
                      }
                      out.write(__oracle_jsp_text[61]);
                    } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_56.doCatch(th);
                } finally {
                  __jsp_taghandler_56.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,2);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setCode("sireh.label.clc.proceso.clcPatronales.complemento");
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
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_60=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setJspContext(pageContext);
                __jsp_taghandler_60.setPath("complemento");
                __jsp_taghandler_60.setSize("2");
                __jsp_taghandler_60.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_60, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_61=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setCode("sireh.label.clc.proceso.clcPatronales.reprocesa");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                  if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_61.doCatch(th);
                } finally {
                  __jsp_taghandler_61.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,2);
              }
              out.write(__oracle_jsp_text[65]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setPath("checkBoxReprocesa");
                __jsp_taghandler_62.setValue("S");
                __jsp_taghandler_62.setLabel(" SI");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                  if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_62.doCatch(th);
                } finally {
                  __jsp_taghandler_62.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,2);
              }
              out.write(__oracle_jsp_text[66]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_63=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setPath("checkBoxReprocesa");
                __jsp_taghandler_63.setValue("N");
                __jsp_taghandler_63.setLabel(" NO");
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
              out.write(__oracle_jsp_text[67]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_64=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.muestraErrores}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[68]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_65=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_65.setParent(__jsp_taghandler_64);
                      __jsp_taghandler_65.setJspContext(pageContext);
                      __jsp_taghandler_65.setProperty("E.CE_CICLO");
                      __jsp_taghandler_65.setCondition("=");
                      __jsp_taghandler_65.setPath("ciclo");
                      __jsp_taghandler_65.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_65, pageContext);
                    }
                    out.write(__oracle_jsp_text[69]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_66=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_66.setParent(__jsp_taghandler_64);
                      __jsp_taghandler_66.setJspContext(pageContext);
                      __jsp_taghandler_66.setProperty("E.CE_QNA_PAGO");
                      __jsp_taghandler_66.setCondition("=");
                      __jsp_taghandler_66.setPath("qnaPago");
                      __jsp_taghandler_66.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
                    }
                    out.write(__oracle_jsp_text[70]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_67=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_67.setParent(__jsp_taghandler_64);
                      __jsp_taghandler_67.setJspContext(pageContext);
                      __jsp_taghandler_67.setProperty("E.ID_TIPO_NOMINA");
                      __jsp_taghandler_67.setCondition("=");
                      __jsp_taghandler_67.setPath("tipoNominaPatronales");
                      __jsp_taghandler_67.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_67, pageContext);
                    }
                    out.write(__oracle_jsp_text[71]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_68=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_68.setParent(__jsp_taghandler_64);
                      __jsp_taghandler_68.setJspContext(pageContext);
                      __jsp_taghandler_68.setProperty("E.CE_COMPLEMENTO");
                      __jsp_taghandler_68.setCondition("=");
                      __jsp_taghandler_68.setPath("complemento");
                      __jsp_taghandler_68.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
                    }
                    out.write(__oracle_jsp_text[72]);
                    {
                      _oracle._jsp._tag._pagedList_tag __jsp_taghandler_69=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                      __jsp_taghandler_69.setParent(__jsp_taghandler_64);
                      __jsp_taghandler_69.setJspContext(pageContext);
                      __jsp_taghandler_69.setBeanName("clcPatronalesErrores");
                      __jsp_taghandler_69.setBaseUrl("clcPatronales");
                      __jsp_taghandler_69.setAppendFilters("false");
                      __jsp_taghandler_69.setJspBody(new _clcPatronalesGenera_OjspFragmentSupport( 1, pageContext, __jsp_taghandler_69, __ojsp_varRes));
                      __jsp_taghandler_69.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_69, pageContext);
                    }
                    out.write(__oracle_jsp_text[73]);
                  } while (__jsp_taghandler_64.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,2);
              }
              out.write(__oracle_jsp_text[74]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_90=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_90.setParent(__jsp_taghandler_1);
                __jsp_taghandler_90.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                  if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_90.doCatch(th);
                } finally {
                  __jsp_taghandler_90.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90,2);
              }
              out.write(__oracle_jsp_text[75]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_91=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_91.setParent(__jsp_taghandler_1);
                __jsp_taghandler_91.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.muestraErrores}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[76]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_92=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_92.setParent(__jsp_taghandler_91);
                      __jsp_taghandler_92.setJspContext(pageContext);
                      __jsp_taghandler_92.setAction("clcProcesoPatronales/marcaRevisadoExisteErrorPatronales");
                      __jsp_taghandler_92.setValue("submit.revisarErrores");
                      __jsp_taghandler_92.setProgressBar("true");
                      __jsp_taghandler_92.setAlertCode("confirm.clc.proceso.terceros.revisar");
                      __jsp_taghandler_92.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_92, pageContext);
                    }
                    out.write(__oracle_jsp_text[77]);
                  } while (__jsp_taghandler_91.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91,2);
              }
              out.write(__oracle_jsp_text[78]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_93=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_93.setParent(__jsp_taghandler_1);
                __jsp_taghandler_93.setJspContext(pageContext);
                __jsp_taghandler_93.setPath("generar");
                __jsp_taghandler_93.setAction("clcProcesoPatronales/executeProcedureClcPatronales");
                __jsp_taghandler_93.setValue("submit.generate");
                __jsp_taghandler_93.setProgressBar("true");
                __jsp_taghandler_93.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_93, pageContext);
              }
              out.write(__oracle_jsp_text[79]);
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

  private class _clcPatronalesGenera_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _clcPatronalesGenera_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_40       = parent;
      out.write("\r\n                    <div id=\"displayTagDiv\">                                                               \r\n                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_41=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_41.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_40));
        __jsp_taghandler_41.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_41.setPagesize(200);
        __jsp_taghandler_41.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_41.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_41.setClass("displaytag");
        __jsp_taghandler_41.setExport(true);
        __jsp_taghandler_41.setUid("row");
        __jsp_taghandler_41.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_41,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                             \r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_42=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_42.setParent(__jsp_taghandler_41);
                __jsp_taghandler_42.setTitleKey("sireh.label.clc.proceso.clcPatronales.cuentas.nominaGrupo");
                __jsp_taghandler_42.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_42,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                <input name=\"nominaGrupo\" \r\n                                       class=\"box\"\r\n                                       type=\"checkbox\" \r\n                                       value=\"");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_43.setParent(__jsp_taghandler_42);
                        __jsp_taghandler_43.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idNomina}",java.lang.String.class, __ojsp_varRes, null)+"|0"));
                        __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                        if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,7);
                      }
                      out.write("\"/>\r\n                            ");
                    } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_44=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_44.setParent(__jsp_taghandler_41);
                __jsp_taghandler_44.setProperty("idNomina");
                __jsp_taghandler_44.setTitleKey("sireh.label.clc.proceso.clcPatronales.cuentas.idNomina");
                __jsp_taghandler_44.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_45.setParent(__jsp_taghandler_41);
                __jsp_taghandler_45.setProperty("hpQnaPago");
                __jsp_taghandler_45.setTitleKey("sireh.label.clc.proceso.clcPatronales.cuentas.hpQnaPago");
                __jsp_taghandler_45.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_46=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_46.setParent(__jsp_taghandler_41);
                __jsp_taghandler_46.setProperty("idTipoNomina");
                __jsp_taghandler_46.setTitleKey("sireh.label.clc.proceso.clcPatronales.cuentas.idTipoNomina");
                __jsp_taghandler_46.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_47.setParent(__jsp_taghandler_41);
                __jsp_taghandler_47.setProperty("hpNumComplem");
                __jsp_taghandler_47.setTitleKey("sireh.label.clc.proceso.clcPatronales.cuentas.hpNumComplemento");
                __jsp_taghandler_47.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format class style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_41);
                __jsp_taghandler_48.setProperty("monto");
                __jsp_taghandler_48.setTitleKey("sireh.label.clc.proceso.clcPatronales.cuentas.monto");
                __jsp_taghandler_48.setSortable(true);
                __jsp_taghandler_48.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_48.setClass("amount");
                __jsp_taghandler_48.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,6);
              }
              out.write("\r\n                            \r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_49=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_49.setParent(__jsp_taghandler_41);
                __jsp_taghandler_49.setName("paging.banner.placement");
                __jsp_taghandler_49.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_50=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_50.setParent(__jsp_taghandler_41);
                __jsp_taghandler_50.setName("export.pdf");
                __jsp_taghandler_50.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,6);
              }
              out.write("\r\n                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_51=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_51.setParent(__jsp_taghandler_41);
                __jsp_taghandler_51.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_51,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_52.setParent(__jsp_taghandler_51);
                        __jsp_taghandler_52.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                          if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_52.doCatch(th);
                        } finally {
                          __jsp_taghandler_52.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,7);
                      }
                      out.write("<br><br></span>\r\n                            ");
                    } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,6);
              }
              out.write("\r\n                        ");
            } while (__jsp_taghandler_41.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,5);
      }
      out.write("\r\n                    </div>\r\n                ");
      return;
    }

      
    public void invoke1(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_69       = parent;
      out.write("\r\n                               \r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_70=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_70.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_69));
        __jsp_taghandler_70.setName("clcPatronalesErrores");
        __jsp_taghandler_70.setPagesize(10);
        __jsp_taghandler_70.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_70.setClass("displaytag");
        __jsp_taghandler_70.setExport(true);
        __jsp_taghandler_70.setUid("row3");
        __jsp_taghandler_70.setSort("list");
        java.lang.Object row3 = null;
        java.lang.Integer row3_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_70,__jsp_tag_starteval,out);
            do {
              row3 = (java.lang.Object) pageContext.findAttribute("row3");
              row3_rowNum = (java.lang.Integer) pageContext.findAttribute("row3_rowNum");
              out.write("\r\n                                       \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_71=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_71.setParent(__jsp_taghandler_70);
                __jsp_taghandler_71.setProperty("ceSecuencia");
                __jsp_taghandler_71.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.id");
                __jsp_taghandler_71.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_72=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_72.setParent(__jsp_taghandler_70);
                __jsp_taghandler_72.setProperty("ceCiclo");
                __jsp_taghandler_72.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.ciclo");
                __jsp_taghandler_72.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_73=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_73.setParent(__jsp_taghandler_70);
                __jsp_taghandler_73.setProperty("ceQnaPago");
                __jsp_taghandler_73.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.quincenaPago");
                __jsp_taghandler_73.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,5);
              }
              out.write("          \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_74=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_74.setParent(__jsp_taghandler_70);
                __jsp_taghandler_74.setProperty("idTipoNomina");
                __jsp_taghandler_74.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.tipoNomina");
                __jsp_taghandler_74.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_75=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_75.setParent(__jsp_taghandler_70);
                __jsp_taghandler_75.setProperty("ceComplemento");
                __jsp_taghandler_75.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.complemento");
                __jsp_taghandler_75.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_76=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_76.setParent(__jsp_taghandler_70);
                __jsp_taghandler_76.setProperty("descError");
                __jsp_taghandler_76.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.descError");
                __jsp_taghandler_76.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_77=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_77.setParent(__jsp_taghandler_70);
                __jsp_taghandler_77.setProperty("idFolio");
                __jsp_taghandler_77.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.folio");
                __jsp_taghandler_77.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_78=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_78.setParent(__jsp_taghandler_70);
                __jsp_taghandler_78.setProperty("idTipoCpto");
                __jsp_taghandler_78.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.tipoConcepto");
                __jsp_taghandler_78.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_79=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_79.setParent(__jsp_taghandler_70);
                __jsp_taghandler_79.setProperty("idCptoPago");
                __jsp_taghandler_79.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.conceptoPago");
                __jsp_taghandler_79.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_80=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_80.setParent(__jsp_taghandler_70);
                __jsp_taghandler_80.setProperty("idUnidadNom");
                __jsp_taghandler_80.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.unidad");
                __jsp_taghandler_80.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_81=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_81.setParent(__jsp_taghandler_70);
                __jsp_taghandler_81.setProperty("idEdo");
                __jsp_taghandler_81.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.estado");
                __jsp_taghandler_81.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_82=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_82.setParent(__jsp_taghandler_70);
                __jsp_taghandler_82.setProperty("ceMonto");
                __jsp_taghandler_82.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.monto");
                __jsp_taghandler_82.setSortable(true);
                __jsp_taghandler_82.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_82.setStyle("text-align:right");
                __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_83=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_83.setParent(__jsp_taghandler_70);
                __jsp_taghandler_83.setProperty("revisado");
                __jsp_taghandler_83.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.revisado");
                __jsp_taghandler_83.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_84=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_84.setParent(__jsp_taghandler_70);
                __jsp_taghandler_84.setProperty("usuario");
                __jsp_taghandler_84.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.usuario");
                __jsp_taghandler_84.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_85=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_85.setParent(__jsp_taghandler_70);
                __jsp_taghandler_85.setProperty("fecModifico");
                __jsp_taghandler_85.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.fecha");
                __jsp_taghandler_85.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,5);
              }
              out.write("\r\n                                        \r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_86=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_86.setParent(__jsp_taghandler_70);
                __jsp_taghandler_86.setName("paging.banner.placement");
                __jsp_taghandler_86.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_87=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_87.setParent(__jsp_taghandler_70);
                __jsp_taghandler_87.setName("export.pdf");
                __jsp_taghandler_87.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_88=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_88.setParent(__jsp_taghandler_70);
                __jsp_taghandler_88.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_88,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_89=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_89.setParent(__jsp_taghandler_88);
                        __jsp_taghandler_89.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                          if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_89.doCatch(th);
                        } finally {
                          __jsp_taghandler_89.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89,6);
                      }
                      out.write("<br><br></span>\r\n                        ");
                    } while (__jsp_taghandler_88.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88,5);
              }
              out.write("\r\n                    ");
            } while (__jsp_taghandler_70.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,4);
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

  private static final char __oracle_jsp_text[][]=new char[80][];
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
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    \r\n    <table align=\"center\" width=\"30%\">\r\n        <tr>                        \r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n            </td>\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n            </td>\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td height=\"10px\" colspan=\"3\"> &nbsp; </td>\r\n        </tr>\r\n        <tr>\r\n            <td colspan=\"3\" align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td height=\"20px\" colspan=\"3\"> &nbsp; </td>\r\n        </tr>\r\n    </table>\r\n        \r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n        <table align=\"center\" width=\"100%\">        \r\n            <tr valign=\"top\">\r\n                <td>\r\n                    <fieldset>\r\n                        <legend style=\"font-size:1.3em\">\r\n                            <strong>&nbsp;&nbsp; Criterios de b&uacute;squeda &nbsp;&nbsp;</strong>\r\n                        </legend>\r\n                        <table>\r\n                            <tr>\r\n                                <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                                <td width=\"200px\" align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                                <tr id=\"quincenal\">\r\n                                    <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[19] = 
    "</td>\r\n                                    <td width=\"200px\" align=\"left\">\r\n                                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                                    </td>\r\n                                </tr>\r\n                            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                <tr id=\"mensual\">\r\n                                    <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                                    <td width=\"200px\" align=\"left\">\r\n                                        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                    </td>\r\n                                </tr>\r\n                            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                            <tr>\r\n                                <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[29] = 
    "</td>\r\n                                <td width=\"200px\" align=\"left\" align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                                    \r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                                <td width=\"200px\" align=\"left\" align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                    \r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </fieldset>\r\n                </td>\r\n            </tr>\r\n            <tr>\r\n                <td>\r\n                    <table width=\"100%\">\r\n                        <tr>\r\n                            <td align=\"left\" height=\"20px\" valign=\"middle\"> &nbsp; </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"center\">\r\n                                ".toCharArray();
    __oracle_jsp_text[35] = 
    " &nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n        \r\n    <br/>\r\n    <fieldset>\r\n        <legend style=\"font-size:1.3em\">\r\n            <strong>&nbsp;&nbsp; N&oacute;minas &nbsp;&nbsp;</strong>\r\n        </legend>\r\n        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                \r\n                <table align=\"center\" width=\"100%\">\r\n                    <tr>\r\n                        <td height=\"20px\"> &nbsp; </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"right\" height=\"10px\" valign=\"middle\">\r\n                            <b>Seleccione una opci&oacute;n:</b><br/>\r\n                            <a href=\"javascript:checkAll()\">+ Seleccionar Todos</a><br/>\r\n                            <a href=\"javascript:uncheckAll()\">- Ninguno</a>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                    \r\n                <table align=\"center\" width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"left\" height=\"10px\" valign=\"middle\"> &nbsp; </td>\r\n                    </tr>\r\n                    <tr valign=\"top\">\r\n                        <td align=\"right\">\r\n                            <span id=\"montoTotal\" style=\"font-size:2em\">Total N&oacute;minas: $ 0.00</span>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td height=\"20px\"> &nbsp; </td>\r\n                    </tr>\r\n                </table>\r\n            ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[55] = 
    "<br><br></span>\r\n            ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n    </fieldset>\r\n    \r\n    <br/>\r\n    <table align=\"center\" width=\"100%\">\r\n        <tr valign=\"top\">\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp; Procesar &nbsp;&nbsp;</strong>\r\n                    </legend>\r\n                    <table>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[58] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">                                    \r\n                                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[63] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[65] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n        \r\n    ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n        <br/>\r\n        <fieldset>\r\n            <legend style=\"font-size:1.3em\">\r\n                <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>\r\n            </legend>\r\n        \r\n            ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[71] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[72] = 
    "\r\n            \r\n            <div id=\"displayTagDiv3\">\r\n                ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n            </div>\r\n        </fieldset>\r\n    ".toCharArray();
    __oracle_jsp_text[74] = 
    "\r\n    \r\n    <table align=\"left\" width=\"100%\">\r\n        <tr>\r\n            <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                <strong>\r\n                    ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                </strong>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[77] = 
    " &nbsp; \r\n                            ".toCharArray();
    __oracle_jsp_text[78] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[79] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        function checkAll() {\r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('nominaGrupo');\r\n        \r\n            for (var i = 0; i < checkboxes.length; i++) {\r\n                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {\r\n                    checkboxes[i].setAttribute('checked', true);\r\n                }\r\n            }\r\n            // Monto\r\n            getTotal();\r\n        }\r\n        \r\n        function uncheckAll() {\r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('nominaGrupo');\r\n        \r\n            for (var i = 0; i < checkboxes.length; i++) {\r\n                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {\r\n                    checkboxes[i].removeAttribute('checked');\r\n                }\r\n            }\r\n            // Monto\r\n            $j(\"#montoTotal\").text(\"Total N\\u00f3minas: $ 0.00\");\r\n        }\r\n        \r\n        function getTotal() {\r\n            var total = 0;\r\n            \r\n            $j('.box:checked').each(function(){\r\n                // Monto\r\n                var auxMonto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();\r\n                auxMonto = auxMonto.replace(\"$ \", \"\");\r\n                auxMonto = auxMonto.replace(/,/g, \"\");\r\n                total+=parseFloat(auxMonto);\r\n            });\r\n            // Monto\r\n            $j(\"#montoTotal\").text(\"Total N\\u00f3minas: $ \" + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();\r\n        }\r\n        \r\n        $j('.box').change(function(){\r\n            var total = 0;\r\n            var tercerosArray = [];\r\n            var tercerosValidos = false;\r\n            \r\n            $j('.box:checked').each(function(){\r\n                // Monto\r\n                var auxMonto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();\r\n                auxMonto = auxMonto.replace(\"$ \", \"\");\r\n                auxMonto = auxMonto.replace(/,/g, \"\");\r\n                total+=parseFloat(auxMonto);\r\n            });\r\n            // Monto\r\n            $j(\"#montoTotal\").text(\"Total N\\u00f3minas: $ \" + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();\r\n        });\r\n        \r\n        $j.fn.digits = function(){ \r\n            return this.each(function(){ \r\n                $j(this).text($j(this).text().replace(/(\\d)(?=(\\d\\d\\d)+(?!\\d))/g, \"$1,\")); \r\n            });\r\n        }\r\n        \r\n        $j(\"input:radio[name=checkBoxReprocesa]\").click(function() {\r\n            var checkBoxReprocesa = $j(this).val();            \r\n            if (checkBoxReprocesa == 'S') {\r\n                $j('[name=\"cxlcGrupo\"]').prop('disabled', false);\r\n            }\r\n        });\r\n        \r\n        $j(document).ready(function(){\r\n            $j('#complemento').mask('99');\r\n        });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
