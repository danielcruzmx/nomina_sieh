package _web_2d_inf._jsp._expediente._gestion._expedientes;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _controlExpedientes extends com.orionserver.http.OrionHttpJspPage {


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
    _controlExpedientes page = this;
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
        __jsp_taghandler_1.setModelAttribute("controlExpedientesDTO");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("showPagedList");
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
                __jsp_taghandler_6.setCode("sireh.label.oficinaVirtual.gestionExpedientes.controlExpedientes");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setCode("sireh.label.oficinaVirtual.gestionExpedientes.idUnidadNom");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_8=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setKey("");
                __jsp_taghandler_8.setValue("selectList.nonValue");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_9=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setBeanName("tcUnidadSinCiclo");
                __jsp_taghandler_9.setPath("idUnidadNom");
                __jsp_taghandler_9.setStyle("width:200px;");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.oficinaVirtual.gestionExpedientes.rfcEmpleado");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_11=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("rfcEmpleado");
                __jsp_taghandler_11.setMaxlength("13");
                __jsp_taghandler_11.setSize("60");
                __jsp_taghandler_11.setCss("anchoInput alphanumeric");
                __jsp_taghandler_11.setUppercase("true");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.oficinaVirtual.gestionExpedientes.nombreEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_12.doCatch(th);
                } finally {
                  __jsp_taghandler_12.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_13=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setPath("nombreEmpleado");
                __jsp_taghandler_13.setMaxlength("40");
                __jsp_taghandler_13.setSize("60");
                __jsp_taghandler_13.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_13.setUppercase("true");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.oficinaVirtual.gestionExpedientes.primerApellido");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_15=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setPath("primerApellido");
                __jsp_taghandler_15.setMaxlength("40");
                __jsp_taghandler_15.setSize("60");
                __jsp_taghandler_15.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_15.setUppercase("true");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.label.oficinaVirtual.gestionExpedientes.segundoApellido");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_17=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setPath("segundoApellido");
                __jsp_taghandler_17.setMaxlength("40");
                __jsp_taghandler_17.setSize("60");
                __jsp_taghandler_17.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_17.setUppercase("true");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_18=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("muestraRegistros");
                __jsp_taghandler_18.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${controlExpedientesDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_18.setValue("submit.search");
                __jsp_taghandler_18.setProgressBar("true");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_19=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPath("cancel");
                __jsp_taghandler_19.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${controlExpedientesDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_19.setValue("submit.clean");
                __jsp_taghandler_19.setProgressBar("true");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[24]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_21.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${controlExpedientesDTO.showPagedList}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[25]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_22=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_22.setJspContext(pageContext);
                            __jsp_taghandler_22.setProperty("E.RFC_EMPLEADO");
                            __jsp_taghandler_22.setCondition("contains");
                            __jsp_taghandler_22.setPath("rfcEmpleado");
                            __jsp_taghandler_22.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                          }
                          out.write(__oracle_jsp_text[26]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_23=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_23.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_23.setJspContext(pageContext);
                            __jsp_taghandler_23.setProperty("E.NOMBRE_EMPLEADO");
                            __jsp_taghandler_23.setCondition("contains");
                            __jsp_taghandler_23.setPath("nombreEmpleado");
                            __jsp_taghandler_23.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                          }
                          out.write(__oracle_jsp_text[27]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_24=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_24.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_24.setJspContext(pageContext);
                            __jsp_taghandler_24.setProperty("E.PRIMER_APELLIDO");
                            __jsp_taghandler_24.setCondition("contains");
                            __jsp_taghandler_24.setPath("primerApellido");
                            __jsp_taghandler_24.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                          }
                          out.write(__oracle_jsp_text[28]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_25=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_25.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_25.setJspContext(pageContext);
                            __jsp_taghandler_25.setProperty("E.SEGUNDO_APELLIDO");
                            __jsp_taghandler_25.setCondition("contains");
                            __jsp_taghandler_25.setPath("segundoApellido");
                            __jsp_taghandler_25.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                          }
                          out.write(__oracle_jsp_text[29]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_26=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_26.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_26.setJspContext(pageContext);
                            __jsp_taghandler_26.setProperty("U.ID_UNIDAD");
                            __jsp_taghandler_26.setCondition("=");
                            __jsp_taghandler_26.setPath("idUnidadNom");
                            __jsp_taghandler_26.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                          }
                          out.write(__oracle_jsp_text[30]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_27=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_27.setParent(__jsp_taghandler_21);
                            __jsp_taghandler_27.setJspContext(pageContext);
                            __jsp_taghandler_27.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${controlExpedientesDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_27.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${controlExpedientesDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_27.setAppendFilters("false");
                            __jsp_taghandler_27.setJspBody(new _controlExpedientes_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_27, __ojsp_varRes));
                            __jsp_taghandler_27.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                          }
                          out.write(__oracle_jsp_text[31]);
                        } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,3);
                    }
                    out.write(__oracle_jsp_text[32]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_46.setParent(__jsp_taghandler_20);
                      __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[33]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                            __jsp_taghandler_47.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                              if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_47.doCatch(th);
                            } finally {
                              __jsp_taghandler_47.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,4);
                          }
                          out.write(__oracle_jsp_text[34]);
                        } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,3);
                    }
                    out.write(__oracle_jsp_text[35]);
                  } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setCode("sireh.label.oficinaVirtual.gestionExpedientes.nombreEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                  if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_48.doCatch(th);
                } finally {
                  __jsp_taghandler_48.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,2);
              }
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_49=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setJspContext(pageContext);
                __jsp_taghandler_49.setPath("usuNombreEmpleado");
                __jsp_taghandler_49.setMaxlength("60");
                __jsp_taghandler_49.setReadonly("true");
                __jsp_taghandler_49.setSize("60");
                __jsp_taghandler_49.setCss("anchoInput");
                __jsp_taghandler_49.setUppercase("true");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setCode("sireh.label.oficinaVirtual.gestionExpedientes.primerApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                  if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_50.doCatch(th);
                } finally {
                  __jsp_taghandler_50.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,2);
              }
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_51=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setPath("usuPrimerApellido");
                __jsp_taghandler_51.setMaxlength("60");
                __jsp_taghandler_51.setReadonly("true");
                __jsp_taghandler_51.setSize("60");
                __jsp_taghandler_51.setCss("anchoInput");
                __jsp_taghandler_51.setUppercase("true");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setCode("sireh.label.oficinaVirtual.gestionExpedientes.segundoApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                  if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_52.doCatch(th);
                } finally {
                  __jsp_taghandler_52.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,2);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_53=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setJspContext(pageContext);
                __jsp_taghandler_53.setPath("usuSegundoApellido");
                __jsp_taghandler_53.setMaxlength("60");
                __jsp_taghandler_53.setReadonly("true");
                __jsp_taghandler_53.setSize("60");
                __jsp_taghandler_53.setCss("anchoInput");
                __jsp_taghandler_53.setUppercase("true");
                __jsp_taghandler_53.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setCode("sireh.label.oficinaVirtual.gestionExpedientes.usuRfcEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                  if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_54.doCatch(th);
                } finally {
                  __jsp_taghandler_54.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,2);
              }
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_55=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setPath("usuRfcEmpleado");
                __jsp_taghandler_55.setMaxlength("60");
                __jsp_taghandler_55.setReadonly("true");
                __jsp_taghandler_55.setSize("60");
                __jsp_taghandler_55.setCss("anchoInput");
                __jsp_taghandler_55.setUppercase("true");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setCode("sireh.label.oficinaVirtual.gestionExpedientes.exePrestado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                  if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_56.doCatch(th);
                } finally {
                  __jsp_taghandler_56.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,2);
              }
              out.write(__oracle_jsp_text[45]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_57=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setPath("exePrestado");
                __jsp_taghandler_57.setValue("SI");
                __jsp_taghandler_57.setLabel(" Si");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                  if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_57.doCatch(th);
                } finally {
                  __jsp_taghandler_57.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,2);
              }
              out.write(__oracle_jsp_text[46]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setPath("exePrestado");
                __jsp_taghandler_58.setValue("NO");
                __jsp_taghandler_58.setLabel(" No");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                  if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_58.doCatch(th);
                } finally {
                  __jsp_taghandler_58.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,2);
              }
              out.write(__oracle_jsp_text[47]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_59=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setCode("sireh.label.oficinaVirtual.gestionExpedientes.exeRfcUsuarioPrestamo");
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
              out.write(__oracle_jsp_text[48]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_60=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setJspContext(pageContext);
                __jsp_taghandler_60.setKey("");
                __jsp_taghandler_60.setValue("selectList.nonValue");
                __jsp_taghandler_60.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_60, pageContext);
              }
              out.write(__oracle_jsp_text[49]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_61=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setJspContext(pageContext);
                __jsp_taghandler_61.setBeanName("tdExpUsuarios-controlExpediente");
                __jsp_taghandler_61.setPath("exeRfcUsuarioPrestamo");
                __jsp_taghandler_61.setStyle("width:200px;");
                __jsp_taghandler_61.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_61, pageContext);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setCode("sireh.label.oficinaVirtual.gestionExpedientes.exeFechaPrestamo");
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
              out.write(__oracle_jsp_text[51]);
              {
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_63=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setJspContext(pageContext);
                __jsp_taghandler_63.setPath("exeFechaPrestamo");
                __jsp_taghandler_63.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_63, pageContext);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_64=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setCode("sireh.label.oficinaVirtual.gestionExpedientes.exeDatosClasificacion");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                  if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_64.doCatch(th);
                } finally {
                  __jsp_taghandler_64.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,2);
              }
              out.write(__oracle_jsp_text[53]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_65=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setJspContext(pageContext);
                __jsp_taghandler_65.setPath("exeDatosClasificacion");
                __jsp_taghandler_65.setMaxlength("50");
                __jsp_taghandler_65.setReadonly("false");
                __jsp_taghandler_65.setSize("60");
                __jsp_taghandler_65.setCss("anchoInput");
                __jsp_taghandler_65.setUppercase("true");
                __jsp_taghandler_65.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_65, pageContext);
              }
              out.write(__oracle_jsp_text[54]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_66=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setCode("sireh.label.oficinaVirtual.gestionExpedientes.exeDatosUbicacion");
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
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_67=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_67.setParent(__jsp_taghandler_1);
                __jsp_taghandler_67.setJspContext(pageContext);
                __jsp_taghandler_67.setPath("exeDatosUbicacion");
                __jsp_taghandler_67.setMaxlength("50");
                __jsp_taghandler_67.setReadonly("false");
                __jsp_taghandler_67.setSize("60");
                __jsp_taghandler_67.setCss("anchoInput");
                __jsp_taghandler_67.setUppercase("true");
                __jsp_taghandler_67.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_67, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_68=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setJspContext(pageContext);
                __jsp_taghandler_68.setPath("guardar");
                __jsp_taghandler_68.setAction("gestionExpediente/saveControlExpedientes");
                __jsp_taghandler_68.setValue("submit.save");
                __jsp_taghandler_68.setProgressBar("true");
                __jsp_taghandler_68.setAlertCode("confirm.expediente.alta.guardar");
                __jsp_taghandler_68.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_69=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_taghandler_69.setJspContext(pageContext);
                __jsp_taghandler_69.setPath("cancelar");
                __jsp_taghandler_69.setAction((java.lang.String) ("gestionExpediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${controlExpedientesDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_69.setValue("submit.cancel");
                __jsp_taghandler_69.setProgressBar("true");
                __jsp_taghandler_69.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_69, pageContext);
              }
              out.write(__oracle_jsp_text[58]);
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

  private class _controlExpedientes_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _controlExpedientes_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_27       = parent;
      out.write("\r\n                                <div id=\"displayTagDiv\" style=\"width:1000px;overflow:auto;\"> \r\n                                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_28=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_28.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_27));
        __jsp_taghandler_28.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${controlExpedientesDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_28.setPagesize(10);
        __jsp_taghandler_28.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_28.setClass("displaytag");
        __jsp_taghandler_28.setExport(true);
        __jsp_taghandler_28.setUid("row");
        __jsp_taghandler_28.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_28,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_29=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                __jsp_taghandler_29.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.id");
                __jsp_taghandler_29.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                            <input name=\"empleadoGrupo\" \r\n                                                   class=\"box\"\r\n                                                   type=\"checkbox\" \r\n                                                   value=\"");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                        __jsp_taghandler_30.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.rfcEmpleado}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                        if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,7);
                      }
                      out.write("\"/>\r\n                                        ");
                    } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
              }
              out.write("\r\n                                        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_31=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_31.setParent(__jsp_taghandler_28);
                __jsp_taghandler_31.setProperty("descUnidad");
                __jsp_taghandler_31.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.unidad");
                __jsp_taghandler_31.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_32.setParent(__jsp_taghandler_28);
                __jsp_taghandler_32.setProperty("rfcEmpleado");
                __jsp_taghandler_32.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.rfcEmpleado");
                __jsp_taghandler_32.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_33=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_33.setParent(__jsp_taghandler_28);
                __jsp_taghandler_33.setProperty("nombreEmpleado");
                __jsp_taghandler_33.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.nombreEmpleado");
                __jsp_taghandler_33.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_34.setParent(__jsp_taghandler_28);
                __jsp_taghandler_34.setProperty("primerApellido");
                __jsp_taghandler_34.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.primerApellido");
                __jsp_taghandler_34.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_35.setParent(__jsp_taghandler_28);
                __jsp_taghandler_35.setProperty("segundoApellido");
                __jsp_taghandler_35.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.segundoApellido");
                __jsp_taghandler_35.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_36=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_36.setParent(__jsp_taghandler_28);
                __jsp_taghandler_36.setProperty("descPuesto");
                __jsp_taghandler_36.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.descPuesto");
                __jsp_taghandler_36.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_37=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_37.setParent(__jsp_taghandler_28);
                __jsp_taghandler_37.setProperty("exePrestado");
                __jsp_taghandler_37.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exePrestado");
                __jsp_taghandler_37.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_38=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_38.setParent(__jsp_taghandler_28);
                __jsp_taghandler_38.setProperty("exeRfcUsuarioPrestamo");
                __jsp_taghandler_38.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exeRfcUsuarioPrestamo");
                __jsp_taghandler_38.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_39=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format");
                __jsp_taghandler_39.setParent(__jsp_taghandler_28);
                __jsp_taghandler_39.setProperty("exeFechaPrestamo");
                __jsp_taghandler_39.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exeFechaPrestamo");
                __jsp_taghandler_39.setSortable(true);
                __jsp_taghandler_39.setFormat("{0,date,dd/MM/yyyy}");
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_40=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_40.setParent(__jsp_taghandler_28);
                __jsp_taghandler_40.setProperty("exeDatosClasificacion");
                __jsp_taghandler_40.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exeDatosClasificacion");
                __jsp_taghandler_40.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_41=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_41.setParent(__jsp_taghandler_28);
                __jsp_taghandler_41.setProperty("exeDatosUbicacion");
                __jsp_taghandler_41.setTitleKey("sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exeDatosUbicacion");
                __jsp_taghandler_41.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_42=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_42.setParent(__jsp_taghandler_28);
                __jsp_taghandler_42.setName("paging.banner.placement");
                __jsp_taghandler_42.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_43=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_43.setParent(__jsp_taghandler_28);
                __jsp_taghandler_43.setName("export.pdf");
                __jsp_taghandler_43.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_44=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_44.setParent(__jsp_taghandler_28);
                __jsp_taghandler_44.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_44,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                        __jsp_taghandler_45.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                          if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_45.doCatch(th);
                        } finally {
                          __jsp_taghandler_45.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,7);
                      }
                      out.write("<br/><br/></span>\r\n                                            ");
                    } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
              }
              out.write("\r\n                                     ");
            } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,5);
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

  private static final char __oracle_jsp_text[][]=new char[59][];
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
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[10] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>B&uacute;squeda de empleados</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"5\">\r\n                                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"5\">\r\n                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"center\">\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "&nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Empleados localizados</strong></legend>\r\n                    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            \r\n                            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[34] = 
    "<br><br></span>\r\n                        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Datos del expediente</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[37] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[39] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[41] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[43] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[45] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[48] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[51] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[53] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                            </td>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[55] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"center\">\r\n                            <td>&nbsp;</td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[57] = 
    "&nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(\"#text_exeFechaPrestamo\").prop(\"disabled\", true);\r\n    </script>\r\n        \r\n    <script type=\"text/javascript\">\r\n        var globalAuxUsuario;\r\n        var globalAuxExeFechaPrestamo;\r\n        \r\n        // Validaciones\r\n        $j(document).ready(function(){\r\n            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n        });\r\n        \r\n        // Checkbox unico\r\n        $j(':checkbox').on('change',function(){\r\n            var th = $j(this), name = th.prop('name'); \r\n            if(th.is(':checked')){\r\n                $j(':checkbox[name=\"'  + name + '\"]').not($(this)).prop('checked',false);   \r\n            }\r\n        });\r\n        \r\n        // Recuperar fila selecccionada\r\n        $j('.box').change(function(){\r\n            $j('.box:checked').each(function(){\r\n                var auxRcf                   = $j(this).parent().next('td').next('td').text();\r\n                var auxNombre                = $j(this).parent().next('td').next('td').next('td').text();\r\n                var auxPrimerApellido        = $j(this).parent().next('td').next('td').next('td').next('td').text();\r\n                var auxSegundoApellido       = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxExePrestado           = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxUsuario               = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxExeFechaPrestamo      = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxExeDatosClasificacion = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxExeDatosUbicacion     = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                \r\n                globalAuxUsuario = auxUsuario;\r\n                globalAuxExeFechaPrestamo = auxExeFechaPrestamo;\r\n                \r\n                if (auxExePrestado == 'SI') {\r\n                   $j(\"#exePrestado1\").prop(\"checked\", true);\r\n                   $j(\"#exePrestado2\").prop(\"checked\", false);\r\n                } else if(auxExePrestado == 'NO') {\r\n                    $j(\"#exePrestado1\").prop(\"checked\", false);\r\n                    $j(\"#exePrestado2\").prop(\"checked\", true);\r\n                }\r\n                \r\n                //$j(\"#exeRfcUsuarioPrestamo\").attr('disabled','disabled');    \r\n                $j(\"#text_exeFechaPrestamo\").attr('readonly','readonly');\r\n                //$j('#button_exeFechaPrestamo').hide();\r\n                \r\n                $j(\"#usuRfcEmpleado\").val(auxRcf);\r\n                $j(\"#usuNombreEmpleado\").val(auxNombre);\r\n                $j(\"#usuPrimerApellido\").val(auxPrimerApellido);\r\n                $j(\"#usuSegundoApellido\").val(auxSegundoApellido);\r\n                $j(\"#exeRfcUsuarioPrestamo\").val(auxUsuario);\r\n                $j(\"#text_exeFechaPrestamo\").val(auxExeFechaPrestamo);\r\n                $j(\"#exeFechaPrestamo\").val(auxExeFechaPrestamo);\r\n                $j(\"#exeDatosClasificacion\").val(auxExeDatosClasificacion);\r\n                $j(\"#exeDatosUbicacion\").val(auxExeDatosUbicacion);\r\n            });\r\n        });\r\n        \r\n        $j('#exePrestado2').click(function() {\r\n            $j(\"#exeRfcUsuarioPrestamo\").attr('disabled','disabled');   \r\n            $j(\"#exeRfcUsuarioPrestamo\").val(globalAuxUsuario);\r\n            $j(\"#text_exeFechaPrestamo\").attr('disabled','disabled');\r\n            $j(\"#text_exeFechaPrestamo\").val(globalAuxExeFechaPrestamo);\r\n            $j('#button_exeFechaPrestamo').hide();\r\n        });\r\n        \r\n        $j('#exePrestado1').click(function() {\r\n            $j(\"#exeRfcUsuarioPrestamo\").removeAttr('disabled');   \r\n            $j(\"#exeRfcUsuarioPrestamo\").val('');\r\n            $j(\"#text_exeFechaPrestamo\").removeAttr('readonly');\r\n            $j(\"#text_exeFechaPrestamo\").val('');\r\n            $j('#button_exeFechaPrestamo').show();\r\n        });\r\n        \r\n        // Pagedlist asincrono\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
