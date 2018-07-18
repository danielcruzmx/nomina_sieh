package _web_2d_inf._jsp._configuracion._mantenimiento._plantillas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _crearPlantillasTerceros extends com.orionserver.http.OrionHttpJspPage {


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
    _crearPlantillasTerceros page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute method enctype");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("datosPlantillaDTO");
        __jsp_taghandler_1.setMethod("post");
        __jsp_taghandler_1.setEnctype("multipart/form-data");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[3]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.configuracion.manto.plantilla.titulo");
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
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.configuracion.manto.plantillas.opcion");
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
              out.write(__oracle_jsp_text[5]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_4=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setKey("0");
                __jsp_taghandler_4.setValue("selectList.nonValue");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[6]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_5=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setJspContext(pageContext);
                __jsp_taghandler_5.setBeanName("catalogoTercerosManto");
                __jsp_taghandler_5.setPath("nomReg");
                __jsp_taghandler_5.setProgress("true");
                __jsp_taghandler_5.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
              }
              out.write(__oracle_jsp_text[7]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_6=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setJspContext(pageContext);
                __jsp_taghandler_6.setPath("rfc.start");
                __jsp_taghandler_6.setMaxlength("4");
                __jsp_taghandler_6.setSize("4");
                __jsp_taghandler_6.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[8]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_7=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setPath("rfc.end");
                __jsp_taghandler_7.setMaxlength("4");
                __jsp_taghandler_7.setSize("4");
                __jsp_taghandler_7.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("rfc.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[10]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                        __jsp_taghandler_9.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[11]);
                              } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
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
                      out.write(__oracle_jsp_text[12]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_10.setParent(__jsp_taghandler_8);
                        __jsp_taghandler_10.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_10.setItemValue("key");
                        __jsp_taghandler_10.setItemLabel("value");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                          if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_10.doCatch(th);
                        } finally {
                          __jsp_taghandler_10.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                      }
                      out.write(__oracle_jsp_text[13]);
                    } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_8.doCatch(th);
                } finally {
                  __jsp_taghandler_8.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_11=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("curp.start");
                __jsp_taghandler_11.setMaxlength("4");
                __jsp_taghandler_11.setSize("4");
                __jsp_taghandler_11.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_12=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setPath("curp.end");
                __jsp_taghandler_12.setMaxlength("4");
                __jsp_taghandler_12.setSize("4");
                __jsp_taghandler_12.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setPath("curp.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[17]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_14.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[18]);
                              } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_14.doCatch(th);
                        } finally {
                          __jsp_taghandler_14.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                      }
                      out.write(__oracle_jsp_text[19]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_15.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_15.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_15.setItemValue("key");
                        __jsp_taghandler_15.setItemLabel("value");
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
                      out.write(__oracle_jsp_text[20]);
                    } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_13.doCatch(th);
                } finally {
                  __jsp_taghandler_13.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_16=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setPath("tipoMovto.start");
                __jsp_taghandler_16.setMaxlength("4");
                __jsp_taghandler_16.setSize("4");
                __jsp_taghandler_16.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_17=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setPath("tipoMovto.end");
                __jsp_taghandler_17.setMaxlength("4");
                __jsp_taghandler_17.setSize("4");
                __jsp_taghandler_17.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setPath("tipoMovto.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[24]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_19.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[25]);
                              } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_19.doCatch(th);
                        } finally {
                          __jsp_taghandler_19.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                      }
                      out.write(__oracle_jsp_text[26]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_20.setParent(__jsp_taghandler_18);
                        __jsp_taghandler_20.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_20.setItemValue("key");
                        __jsp_taghandler_20.setItemLabel("value");
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
                    } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_18.doCatch(th);
                } finally {
                  __jsp_taghandler_18.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_21=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setPath("importe.start");
                __jsp_taghandler_21.setMaxlength("4");
                __jsp_taghandler_21.setSize("4");
                __jsp_taghandler_21.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_22=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setPath("importe.end");
                __jsp_taghandler_22.setMaxlength("4");
                __jsp_taghandler_22.setSize("4");
                __jsp_taghandler_22.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setPath("importe.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[31]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                        __jsp_taghandler_24.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_24,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[32]);
                              } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_24.doCatch(th);
                        } finally {
                          __jsp_taghandler_24.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,3);
                      }
                      out.write(__oracle_jsp_text[33]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                        __jsp_taghandler_25.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_25.setItemValue("key");
                        __jsp_taghandler_25.setItemLabel("value");
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
                      out.write(__oracle_jsp_text[34]);
                    } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_23.doCatch(th);
                } finally {
                  __jsp_taghandler_23.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
              }
              out.write(__oracle_jsp_text[35]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_26=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setPath("referencia.start");
                __jsp_taghandler_26.setMaxlength("4");
                __jsp_taghandler_26.setSize("4");
                __jsp_taghandler_26.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_27=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setPath("referencia.end");
                __jsp_taghandler_27.setMaxlength("4");
                __jsp_taghandler_27.setSize("4");
                __jsp_taghandler_27.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setPath("referencia.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[38]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                        __jsp_taghandler_29.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[39]);
                              } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_29.doCatch(th);
                        } finally {
                          __jsp_taghandler_29.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,3);
                      }
                      out.write(__oracle_jsp_text[40]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_30.setParent(__jsp_taghandler_28);
                        __jsp_taghandler_30.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_30.setItemValue("key");
                        __jsp_taghandler_30.setItemLabel("value");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                          if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_30.doCatch(th);
                        } finally {
                          __jsp_taghandler_30.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,3);
                      }
                      out.write(__oracle_jsp_text[41]);
                    } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_28.doCatch(th);
                } finally {
                  __jsp_taghandler_28.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_31=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setPath("qna.start");
                __jsp_taghandler_31.setMaxlength("4");
                __jsp_taghandler_31.setSize("4");
                __jsp_taghandler_31.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_32=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setPath("qna.end");
                __jsp_taghandler_32.setMaxlength("4");
                __jsp_taghandler_32.setSize("4");
                __jsp_taghandler_32.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setPath("qna.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[45]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                        __jsp_taghandler_34.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_34,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[46]);
                              } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_34.doCatch(th);
                        } finally {
                          __jsp_taghandler_34.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,3);
                      }
                      out.write(__oracle_jsp_text[47]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_35.setParent(__jsp_taghandler_33);
                        __jsp_taghandler_35.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_35.setItemValue("key");
                        __jsp_taghandler_35.setItemLabel("value");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                          if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_35.doCatch(th);
                        } finally {
                          __jsp_taghandler_35.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,3);
                      }
                      out.write(__oracle_jsp_text[48]);
                    } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_33.doCatch(th);
                } finally {
                  __jsp_taghandler_33.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
              }
              out.write(__oracle_jsp_text[49]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_36=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setPath("qnaFin.start");
                __jsp_taghandler_36.setMaxlength("4");
                __jsp_taghandler_36.setSize("4");
                __jsp_taghandler_36.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[50]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_37=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setJspContext(pageContext);
                __jsp_taghandler_37.setPath("qnaFin.end");
                __jsp_taghandler_37.setMaxlength("4");
                __jsp_taghandler_37.setSize("4");
                __jsp_taghandler_37.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_37.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setPath("qnaFin.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[52]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                        __jsp_taghandler_39.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_39,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[53]);
                              } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_39.doCatch(th);
                        } finally {
                          __jsp_taghandler_39.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,3);
                      }
                      out.write(__oracle_jsp_text[54]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_40.setParent(__jsp_taghandler_38);
                        __jsp_taghandler_40.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_40.setItemValue("key");
                        __jsp_taghandler_40.setItemLabel("value");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                          if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_40.doCatch(th);
                        } finally {
                          __jsp_taghandler_40.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,3);
                      }
                      out.write(__oracle_jsp_text[55]);
                    } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_38.doCatch(th);
                } finally {
                  __jsp_taghandler_38.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
              }
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_41=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setPath("numQuincenas.start");
                __jsp_taghandler_41.setMaxlength("4");
                __jsp_taghandler_41.setSize("4");
                __jsp_taghandler_41.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_42=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setPath("numQuincenas.end");
                __jsp_taghandler_42.setMaxlength("4");
                __jsp_taghandler_42.setSize("4");
                __jsp_taghandler_42.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setPath("numQuincenas.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[59]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_44.setParent(__jsp_taghandler_43);
                        __jsp_taghandler_44.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_44,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[60]);
                              } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_44.doCatch(th);
                        } finally {
                          __jsp_taghandler_44.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,3);
                      }
                      out.write(__oracle_jsp_text[61]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_45.setParent(__jsp_taghandler_43);
                        __jsp_taghandler_45.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_45.setItemValue("key");
                        __jsp_taghandler_45.setItemLabel("value");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                          if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_45.doCatch(th);
                        } finally {
                          __jsp_taghandler_45.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,3);
                      }
                      out.write(__oracle_jsp_text[62]);
                    } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_43.doCatch(th);
                } finally {
                  __jsp_taghandler_43.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,2);
              }
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_46=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setJspContext(pageContext);
                __jsp_taghandler_46.setPath("porcentaje.start");
                __jsp_taghandler_46.setMaxlength("4");
                __jsp_taghandler_46.setSize("4");
                __jsp_taghandler_46.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_46.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_46, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_47=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setJspContext(pageContext);
                __jsp_taghandler_47.setPath("porcentaje.end");
                __jsp_taghandler_47.setMaxlength("4");
                __jsp_taghandler_47.setSize("4");
                __jsp_taghandler_47.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_47.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
              }
              out.write(__oracle_jsp_text[65]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setPath("porcentaje.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[66]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_49=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                        __jsp_taghandler_49.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_49,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[67]);
                              } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_49.doCatch(th);
                        } finally {
                          __jsp_taghandler_49.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,3);
                      }
                      out.write(__oracle_jsp_text[68]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_50.setParent(__jsp_taghandler_48);
                        __jsp_taghandler_50.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_50.setItemValue("key");
                        __jsp_taghandler_50.setItemLabel("value");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                          if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_50.doCatch(th);
                        } finally {
                          __jsp_taghandler_50.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,3);
                      }
                      out.write(__oracle_jsp_text[69]);
                    } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_48.doCatch(th);
                } finally {
                  __jsp_taghandler_48.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,2);
              }
              out.write(__oracle_jsp_text[70]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_51=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setPath("concepto.start");
                __jsp_taghandler_51.setMaxlength("4");
                __jsp_taghandler_51.setSize("4");
                __jsp_taghandler_51.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[71]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_52=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setPath("concepto.end");
                __jsp_taghandler_52.setMaxlength("4");
                __jsp_taghandler_52.setSize("4");
                __jsp_taghandler_52.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[72]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_53=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setPath("concepto.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[73]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_54.setParent(__jsp_taghandler_53);
                        __jsp_taghandler_54.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_54,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[74]);
                              } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_54.doCatch(th);
                        } finally {
                          __jsp_taghandler_54.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,3);
                      }
                      out.write(__oracle_jsp_text[75]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_55=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_55.setParent(__jsp_taghandler_53);
                        __jsp_taghandler_55.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_55.setItemValue("key");
                        __jsp_taghandler_55.setItemLabel("value");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                          if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_55.doCatch(th);
                        } finally {
                          __jsp_taghandler_55.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,3);
                      }
                      out.write(__oracle_jsp_text[76]);
                    } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_53.doCatch(th);
                } finally {
                  __jsp_taghandler_53.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,2);
              }
              out.write(__oracle_jsp_text[77]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_56=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setJspContext(pageContext);
                __jsp_taghandler_56.setPath("fechaIncidencia.start");
                __jsp_taghandler_56.setMaxlength("4");
                __jsp_taghandler_56.setSize("4");
                __jsp_taghandler_56.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_56.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_56, pageContext);
              }
              out.write(__oracle_jsp_text[78]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_57=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setJspContext(pageContext);
                __jsp_taghandler_57.setPath("fechaIncidencia.end");
                __jsp_taghandler_57.setMaxlength("4");
                __jsp_taghandler_57.setSize("4");
                __jsp_taghandler_57.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_57.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
              }
              out.write(__oracle_jsp_text[79]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setPath("fechaIncidencia.type");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[80]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value");
                        __jsp_taghandler_59.setParent(__jsp_taghandler_58);
                        __jsp_taghandler_59.setValue("0");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                          if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                          {
                            try {
                              out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_59,__jsp_tag_starteval,out);
                              do {
                                value = (java.lang.Object) pageContext.findAttribute("value");
                                displayValue = (java.lang.String) pageContext.findAttribute("displayValue");
                                out.write(__oracle_jsp_text[81]);
                              } while (__jsp_taghandler_59.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            finally {
                              out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                            }
                          }
                          if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_59.doCatch(th);
                        } finally {
                          __jsp_taghandler_59.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,3);
                      }
                      out.write(__oracle_jsp_text[82]);
                      {
                        org.springframework.web.servlet.tags.form.OptionsTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.form.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionsTag.class,"org.springframework.web.servlet.tags.form.OptionsTag items itemValue itemLabel");
                        __jsp_taghandler_60.setParent(__jsp_taghandler_58);
                        __jsp_taghandler_60.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${datosPlantillaDTO.listaTipos}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_taghandler_60.setItemValue("key");
                        __jsp_taghandler_60.setItemLabel("value");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                          if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_60.doCatch(th);
                        } finally {
                          __jsp_taghandler_60.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,3);
                      }
                      out.write(__oracle_jsp_text[83]);
                    } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_58.doCatch(th);
                } finally {
                  __jsp_taghandler_58.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,2);
              }
              out.write(__oracle_jsp_text[84]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_61=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setJspContext(pageContext);
                __jsp_taghandler_61.setAction("/mantenimientoPlantillas/savePlantillas.do");
                __jsp_taghandler_61.setValue("submit.save");
                __jsp_taghandler_61.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_61, pageContext);
              }
              out.write(__oracle_jsp_text[85]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_62=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setJspContext(pageContext);
                __jsp_taghandler_62.setAction("/mantenimientoPlantillas/mantoPlantillas.do");
                __jsp_taghandler_62.setValue("submit.back");
                __jsp_taghandler_62.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_62, pageContext);
              }
              out.write(__oracle_jsp_text[86]);
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
  private static final char __oracle_jsp_text[][]=new char[87][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n<script  type=\"text/javascript\">\r\n    var nav4 = window.Event ? true : false;\r\n    function IsNumber(e){\r\n        var tecla= document.all ? tecla = e.keyCode : tecla = e.which;\r\n       return ((tecla > 47 && tecla < 58) || tecla == 46);\r\n    }\r\n\r\n </script>\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n    <h1>\r\n        <strong>\r\n                ".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n               ".toCharArray();
    __oracle_jsp_text[5] = 
    " \r\n        </strong>\r\n    </h1>\r\n    <p>&nbsp;</p>\r\n<table align=\"center\" border=\"0\">\r\n        <tr>\r\n                <td colspan=\"4\" align=\"center\"><table  width=\"100%\"  border=\"0\" ><tr><td ><b>Crear Planilla</b></td></table> </td>\r\n        </tr>\r\n\t<tr>\r\n\t\t<td colspan=\"4\">Nombre de regisrro \r\n                ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n                \r\n                </td>\r\n\t</tr>\r\n\t<tr >\r\n\t\t<td>&nbsp;</td>\r\n\t\t <td>&nbsp;</td>\r\n\t\t  <td>&nbsp;</td>\r\n\t\t  <td>&nbsp;</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td></td>\r\n\t\t<td align=\"center\">Posicion Inicial</td>\r\n\t\t<td align=\"center\">Posicion Finnal</td>\r\n\t\t<td align=\"center\">Tipo</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"right\">RFC : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[8] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[11] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n\t\t</td>\r\n\t</tr>\r\n\t\t<tr>\r\n\t\t<td align=\"right\">CURP : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[18] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n\t\t</td>\r\n\t</tr>\r\n\t\t<tr>\r\n\t\t<td align=\"right\">TIPO DE MOVIMIENTO : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                       ".toCharArray();
    __oracle_jsp_text[25] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n\t\t</td>\r\n\t</tr>\r\n\t\t<tr>\r\n\t\t<td align=\"right\">IMPORTE : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[29] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                       ".toCharArray();
    __oracle_jsp_text[32] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n\t\t</td>\r\n\t</tr>\r\n\t\t<tr>\r\n\t\t<td align=\"right\">REFERENCIA : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[37] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[39] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n\t\t</td>\r\n\r\n\t</tr>\r\n\t\t<tr>\r\n\t\t<td align=\"right\">QUINCENA INICIAL : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[43] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[46] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n\t\t</td>\r\n\r\n\t</tr>\r\n\t\t<tr>\r\n\t\t<td align=\"right\">QUINCENA FINAL : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[50] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[51] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                       ".toCharArray();
    __oracle_jsp_text[53] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n\t\t</td>\r\n\r\n\t</tr>\r\n\t\t<tr>\r\n\t\t<td align=\"right\">N&UacuteMRO DE QUINCENAS : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[57] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[58] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                       ".toCharArray();
    __oracle_jsp_text[60] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n\t\t</td>\r\n\r\n\t</tr>\r\n\t\t<tr>\r\n\t\t<td align=\"right\">PORCENTAJE : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[64] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[65] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                       ".toCharArray();
    __oracle_jsp_text[67] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n\t\t</td>\r\n\r\n\t</tr>\r\n        <tr>\r\n\t\t<td align=\"right\">CONCEPTO : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[71] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[72] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[74] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[77] = 
    "\r\n\t\t</td>\r\n\t</tr>\r\n        <tr>\r\n\t\t<td align=\"right\">FECHA DE INCIDENCIA : </td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[78] = 
    "</td>\r\n\t\t<td align=\"center\">".toCharArray();
    __oracle_jsp_text[79] = 
    "</td>\r\n\t\t<td align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[80] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[81] = 
    "Seleccione...".toCharArray();
    __oracle_jsp_text[82] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[83] = 
    "\r\n                     ".toCharArray();
    __oracle_jsp_text[84] = 
    "\r\n\t\t</td>\r\n\t</tr>\r\n        \r\n\t\t<tr>\r\n\t\t<td colspan=\"4\">&nbsp;</td>\r\n\t</tr>\r\n                <tr>\r\n\t\t\t<td colspan=\"4\" align=\"center\">\r\n                         ".toCharArray();
    __oracle_jsp_text[85] = 
    "\r\n                          ".toCharArray();
    __oracle_jsp_text[86] = 
    "</td>\r\n\t\t</tr>\r\n</table>\r\n \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
