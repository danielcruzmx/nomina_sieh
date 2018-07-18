package _web_2d_inf._jsp._expediente._gestion._expedientes;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _busquedaExpedientes extends com.orionserver.http.OrionHttpJspPage {


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
    _busquedaExpedientes page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("busquedaExpedientesDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("beanName");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("urlOrigen");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("urlDestino");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.oficinaVirtual.gestionExpedientes.expedientesPrestamo");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.oficinaVirtual.gestionExpedientes.idUnidadNom");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_7=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setKey("");
                __jsp_taghandler_7.setValue("selectList.nonValue");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_8=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setBeanName("tcUnidadSinCiclo");
                __jsp_taghandler_8.setPath("idUnidadNom");
                __jsp_taghandler_8.setStyle("width:200px;");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.oficinaVirtual.gestionExpedientes.rfcEmpleado");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_10=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setPath("rfcEmpleado");
                __jsp_taghandler_10.setMaxlength("13");
                __jsp_taghandler_10.setSize("60");
                __jsp_taghandler_10.setCss("anchoInput alphanumeric");
                __jsp_taghandler_10.setUppercase("true");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.oficinaVirtual.gestionExpedientes.nombreEmpleado");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_12=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setPath("nombreEmpleado");
                __jsp_taghandler_12.setMaxlength("40");
                __jsp_taghandler_12.setSize("60");
                __jsp_taghandler_12.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_12.setUppercase("true");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.oficinaVirtual.gestionExpedientes.primerApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_13.doCatch(th);
                } finally {
                  __jsp_taghandler_13.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,2);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_14=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("primerApellido");
                __jsp_taghandler_14.setMaxlength("40");
                __jsp_taghandler_14.setSize("60");
                __jsp_taghandler_14.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_14.setUppercase("true");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.oficinaVirtual.gestionExpedientes.segundoApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_15.doCatch(th);
                } finally {
                  __jsp_taghandler_15.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_16=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setPath("segundoApellido");
                __jsp_taghandler_16.setMaxlength("40");
                __jsp_taghandler_16.setSize("60");
                __jsp_taghandler_16.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_16.setUppercase("true");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_17=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setPath("muestraRegistros");
                __jsp_taghandler_17.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${busquedaExpedientesDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_17.setValue("submit.search");
                __jsp_taghandler_17.setProgressBar("true");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_18=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("cancel");
                __jsp_taghandler_18.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${busquedaExpedientesDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_18.setValue("submit.clean");
                __jsp_taghandler_18.setProgressBar("true");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[23]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_20.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${busquedaExpedientesDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[24]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_21=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_21.setJspContext(pageContext);
                            __jsp_taghandler_21.setProperty("E.RFC_EMPLEADO");
                            __jsp_taghandler_21.setCondition("contains");
                            __jsp_taghandler_21.setPath("rfcEmpleado");
                            __jsp_taghandler_21.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                          }
                          out.write(__oracle_jsp_text[25]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_22=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_22.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_22.setJspContext(pageContext);
                            __jsp_taghandler_22.setProperty("E.NOMBRE_EMPLEADO");
                            __jsp_taghandler_22.setCondition("contains");
                            __jsp_taghandler_22.setPath("nombreEmpleado");
                            __jsp_taghandler_22.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                          }
                          out.write(__oracle_jsp_text[26]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_23=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_23.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_23.setJspContext(pageContext);
                            __jsp_taghandler_23.setProperty("E.PRIMER_APELLIDO");
                            __jsp_taghandler_23.setCondition("contains");
                            __jsp_taghandler_23.setPath("primerApellido");
                            __jsp_taghandler_23.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                          }
                          out.write(__oracle_jsp_text[27]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_24=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_24.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_24.setJspContext(pageContext);
                            __jsp_taghandler_24.setProperty("E.SEGUNDO_APELLIDO");
                            __jsp_taghandler_24.setCondition("contains");
                            __jsp_taghandler_24.setPath("segundoApellido");
                            __jsp_taghandler_24.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                          }
                          out.write(__oracle_jsp_text[28]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_25=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_25.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_25.setJspContext(pageContext);
                            __jsp_taghandler_25.setProperty("U.ID_UNIDAD");
                            __jsp_taghandler_25.setCondition("=");
                            __jsp_taghandler_25.setPath("idUnidadNom");
                            __jsp_taghandler_25.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                          }
                          out.write(__oracle_jsp_text[29]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_26=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_26.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_26.setJspContext(pageContext);
                            __jsp_taghandler_26.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${busquedaExpedientesDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_26.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${busquedaExpedientesDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_26.setAppendFilters("false");
                            __jsp_taghandler_26.setMaxRows("200");
                            __jsp_taghandler_26.setJspBody(new _busquedaExpedientes_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_26, __ojsp_varRes));
                            __jsp_taghandler_26.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                          }
                          out.write(__oracle_jsp_text[30]);
                        } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_38.setParent(__jsp_taghandler_19);
                      __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[32]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                            __jsp_taghandler_39.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                              if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_39.doCatch(th);
                            } finally {
                              __jsp_taghandler_39.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,4);
                          }
                          out.write(__oracle_jsp_text[33]);
                        } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,3);
                    }
                    out.write(__oracle_jsp_text[34]);
                  } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[35]);
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

  private class _busquedaExpedientes_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _busquedaExpedientes_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_26       = parent;
      out.write("\r\n                                <div id=\"displayTagDiv\" style=\"width:1000px;height:350px;overflow:auto;\"> \r\n                                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_27=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_27.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_26));
        __jsp_taghandler_27.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${busquedaExpedientesDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_27.setPagesize(10);
        __jsp_taghandler_27.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_27.setClass("displaytag");
        __jsp_taghandler_27.setExport(true);
        __jsp_taghandler_27.setUid("row");
        __jsp_taghandler_27.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_28=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                __jsp_taghandler_28.setProperty("empleado");
                __jsp_taghandler_28.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.empleado");
                __jsp_taghandler_28.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                __jsp_taghandler_29.setProperty("usuarioExpediente");
                __jsp_taghandler_29.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.usuarioExpediente");
                __jsp_taghandler_29.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_30=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_30.setParent(__jsp_taghandler_27);
                __jsp_taghandler_30.setProperty("exePrestado");
                __jsp_taghandler_30.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.exePrestado");
                __jsp_taghandler_30.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_31=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_31.setParent(__jsp_taghandler_27);
                __jsp_taghandler_31.setProperty("telefonoUsuario");
                __jsp_taghandler_31.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.telefonoUsuario");
                __jsp_taghandler_31.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_32.setParent(__jsp_taghandler_27);
                __jsp_taghandler_32.setProperty("fechaPrestamo");
                __jsp_taghandler_32.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.fechaPrestamo");
                __jsp_taghandler_32.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_33=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_33.setParent(__jsp_taghandler_27);
                __jsp_taghandler_33.setProperty("unidadUsuario");
                __jsp_taghandler_33.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.unidadUsuario");
                __jsp_taghandler_33.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_34=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_34.setParent(__jsp_taghandler_27);
                __jsp_taghandler_34.setName("paging.banner.placement");
                __jsp_taghandler_34.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,6);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_35=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_35.setParent(__jsp_taghandler_27);
                __jsp_taghandler_35.setName("export.pdf");
                __jsp_taghandler_35.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_36=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_36.setParent(__jsp_taghandler_27);
                __jsp_taghandler_36.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_36,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                        __jsp_taghandler_37.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                          if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_37.doCatch(th);
                        } finally {
                          __jsp_taghandler_37.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,7);
                      }
                      out.write("<br><br></span>\r\n                                            ");
                    } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
              }
              out.write("\r\n                                     ");
            } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,5);
      }
      out.write("\r\n                                </div>\r\n                            ");
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

  private static final char __oracle_jsp_text[][]=new char[36][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n</style>\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[9] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>B&uacute;squeda de expedientes</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"5\">\r\n                                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"5\">\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[19] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"center\">\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "&nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Expedientes en prestamo</strong></legend>\r\n                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            \r\n                            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[33] = 
    "<br><br></span>\r\n                        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){\r\n            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n        });\r\n        \r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
