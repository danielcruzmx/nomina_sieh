package _web_2d_inf._jsp._spc._capcer._registro;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _consultaContrato extends com.orionserver.http.OrionHttpJspPage {


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
    _consultaContrato page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("checkBoxTest");
        __jsp_taghandler_1.setModelAttribute("consultaContratoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
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
              out.write(__oracle_jsp_text[8]);
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
              out.write(__oracle_jsp_text[9]);
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
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("urlAltaContrato");
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
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("urlDeleteContrato");
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
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("rolAdministradorCapacitacion");
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
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("rolEjecutivoContratacion");
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
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.spc.capcer.registro.consultaContrato.title");
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
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.spc.capcer.registro.consultaContrato.filtro.ciclo");
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
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_11=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setKey("");
                __jsp_taghandler_11.setValue("selectList.nonValue");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_12=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setBeanName("tnCapContratoCurso-ciclo-consultaContrato");
                __jsp_taghandler_12.setPath("contratoCursoCiclo");
                __jsp_taghandler_12.setStyle("width:200px;");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.spc.capcer.registro.consultaContrato.filtro.tipoContratacion");
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
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_14=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setKey("");
                __jsp_taghandler_14.setValue("selectList.nonValue");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_15=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setBeanName("tcCapTipoContratacion-consultaContrato");
                __jsp_taghandler_15.setPath("idTipoContratacion");
                __jsp_taghandler_15.setStyle("width:200px;");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.label.spc.capcer.registro.consultaContrato.filtro.situacion");
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
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_17=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setKey("");
                __jsp_taghandler_17.setValue("selectList.nonValue");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_18=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setBeanName("tcCapSituacionContrato-consultaContrato");
                __jsp_taghandler_18.setPath("idSituacionContrato");
                __jsp_taghandler_18.setStyle("width:200px;");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_19=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPath("muestraRegistros");
                __jsp_taghandler_19.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_19.setValue("submit.search");
                __jsp_taghandler_19.setProgressBar("true");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_20=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setPath("cancel");
                __jsp_taghandler_20.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_20.setValue("submit.clean");
                __jsp_taghandler_20.setProgressBar("true");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[27]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_22.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[28]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_23=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_23.setJspContext(pageContext);
                            __jsp_taghandler_23.setProperty("CC.ID_CONTRATO_CURSO");
                            __jsp_taghandler_23.setCondition("=");
                            __jsp_taghandler_23.setPath("idContratoCurso");
                            __jsp_taghandler_23.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                          }
                          out.write(__oracle_jsp_text[29]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_24=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_24.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_24.setJspContext(pageContext);
                            __jsp_taghandler_24.setProperty("CC.CONTRATO_CURSO_CICLO");
                            __jsp_taghandler_24.setCondition("=");
                            __jsp_taghandler_24.setPath("contratoCursoCiclo");
                            __jsp_taghandler_24.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                          }
                          out.write(__oracle_jsp_text[30]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_25=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_25.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_25.setJspContext(pageContext);
                            __jsp_taghandler_25.setProperty("CC.ID_TIPO_CONTRATACION");
                            __jsp_taghandler_25.setCondition("=");
                            __jsp_taghandler_25.setPath("idTipoContratacion");
                            __jsp_taghandler_25.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                          }
                          out.write(__oracle_jsp_text[31]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_26=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_26.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_26.setJspContext(pageContext);
                            __jsp_taghandler_26.setProperty("CC.ID_SITUACION_CONTRATO");
                            __jsp_taghandler_26.setCondition("=");
                            __jsp_taghandler_26.setPath("idSituacionContrato");
                            __jsp_taghandler_26.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                          }
                          out.write(__oracle_jsp_text[32]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_27=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_27.setParent(__jsp_taghandler_22);
                            __jsp_taghandler_27.setJspContext(pageContext);
                            __jsp_taghandler_27.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_27.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_27.setAppendFilters("false");
                            __jsp_taghandler_27.setCheckbox("true");
                            __jsp_taghandler_27.setChkProperty("idContratos");
                            __jsp_taghandler_27.setJspBody(new _consultaContrato_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_27, __ojsp_varRes));
                            __jsp_taghandler_27.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                          }
                          out.write(__oracle_jsp_text[33]);
                        } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                    }
                    out.write(__oracle_jsp_text[34]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_61=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_61.setParent(__jsp_taghandler_21);
                      __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[35]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_62.setParent(__jsp_taghandler_61);
                            __jsp_taghandler_62.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                              if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_62.doCatch(th);
                            } finally {
                              __jsp_taghandler_62.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,4);
                          }
                          out.write(__oracle_jsp_text[36]);
                        } while (__jsp_taghandler_61.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,3);
                    }
                    out.write(__oracle_jsp_text[37]);
                  } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_63=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaContratoDTO.rolAdministradorCapacitacion || consultaContratoDTO.rolEjecutivoContratacion)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[39]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_64=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_64.setParent(__jsp_taghandler_63);
                      __jsp_taghandler_64.setJspContext(pageContext);
                      __jsp_taghandler_64.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.urlAltaContrato}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_64.setValue("submit.registrar");
                      __jsp_taghandler_64.setProgressBar("true");
                      __jsp_taghandler_64.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_64, pageContext);
                    }
                    out.write(__oracle_jsp_text[40]);
                  } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,2);
              }
              out.write(__oracle_jsp_text[41]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_65=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.rolAdministradorCapacitacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[42]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_66=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_66.setParent(__jsp_taghandler_65);
                      __jsp_taghandler_66.setJspContext(pageContext);
                      __jsp_taghandler_66.setPath("eliminarContratos");
                      __jsp_taghandler_66.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.urlDeleteContrato}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_66.setValue("submit.delete");
                      __jsp_taghandler_66.setAlertCode("confirm.spc.capcer.registro.eliminarCurso");
                      __jsp_taghandler_66.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
                    }
                    out.write(__oracle_jsp_text[43]);
                  } while (__jsp_taghandler_65.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,2);
              }
              out.write(__oracle_jsp_text[44]);
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

  private class _consultaContrato_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _consultaContrato_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_27       = parent;
      out.write("\r\n                            <div id=\"displayTagDiv\" style=\"width:1000px; min-height:200px;overflow:auto;text-align:center;\"> \r\n                                ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_28=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_28.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_27));
        __jsp_taghandler_28.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_28.setPagesize(20);
        __jsp_taghandler_28.setDecorator("checkboxTableDecorator");
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
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                __jsp_taghandler_29.setVar("rojo");
                __jsp_taghandler_29.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idSituacionContrato == 13 ? 'color: red;font-weight: bold;' : ''}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_30=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_30.setParent(__jsp_taghandler_28);
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                      __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaContratoDTO.rolAdministradorCapacitacion && row.idSituacionContrato != 13}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                            __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                            __jsp_taghandler_32.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.idContratos");
                            __jsp_taghandler_32.setStyle("text-align: center");
                            __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_32,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                                                <input name=\"idContratos\" \r\n                                                       class=\"checkbox\"\r\n                                                       type=\"checkbox\" \r\n                                                       value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                                    __jsp_taghandler_33.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idContratos}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                                    if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,9);
                                  }
                                  out.write("\"/>\r\n                                            ");
                                } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,7);
                    }
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_34=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_34.setParent(__jsp_taghandler_30);
                      __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                            __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                            __jsp_taghandler_35.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.idContratos");
                            __jsp_taghandler_35.setStyle((java.lang.String) ("text-align: center;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_35,__jsp_tag_starteval,out);
                                do {
                                  out.write(" - ");
                                } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_36.setParent(__jsp_taghandler_28);
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                      __jsp_taghandler_37.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(row.idSituacionContrato != 13)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_38=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                            __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                            __jsp_taghandler_38.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.idContrato");
                            __jsp_taghandler_38.setSortable(true);
                            __jsp_taghandler_38.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_38,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                                                <a href=\"editContrato.do?idContrato=");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                                    __jsp_taghandler_39.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idContratoCurso}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                                    if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,9);
                                  }
                                  out.write("\"\r\n                                                   class=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_40.setParent(__jsp_taghandler_38);
                                    __jsp_taghandler_40.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idSituacionContrato == 13 ? 'cancelado' : ''}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                                    if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,9);
                                  }
                                  out.write("\"\r\n                                                   style=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_41.setParent(__jsp_taghandler_38);
                                    __jsp_taghandler_41.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                                    if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,9);
                                  }
                                  out.write("\" title=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_42.setParent(__jsp_taghandler_38);
                                    __jsp_taghandler_42.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idContratoCurso}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                                    if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,9);
                                  }
                                  out.write("\">");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_43.setParent(__jsp_taghandler_38);
                                    __jsp_taghandler_43.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.contratoCursoNumero}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                                    if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,9);
                                  }
                                  out.write("</a>\r\n                                            ");
                                } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,7);
                    }
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_44.setParent(__jsp_taghandler_36);
                      __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                            __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                            __jsp_taghandler_45.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.idContrato");
                            __jsp_taghandler_45.setSortable(true);
                            __jsp_taghandler_45.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_45,__jsp_tag_starteval,out);
                                do {
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                                    __jsp_taghandler_46.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.contratoCursoNumero}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                                    if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,9);
                                  }
                                } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
              }
              out.write("\r\n                                                    \r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable maxLength style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_28);
                __jsp_taghandler_47.setProperty("tipoContratacion");
                __jsp_taghandler_47.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.idTipoContratacion");
                __jsp_taghandler_47.setSortable(true);
                __jsp_taghandler_47.setMaxLength(35);
                __jsp_taghandler_47.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_28);
                __jsp_taghandler_48.setProperty("contratoCursoCiclo");
                __jsp_taghandler_48.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.ciclo");
                __jsp_taghandler_48.setSortable(true);
                __jsp_taghandler_48.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_49=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_49.setParent(__jsp_taghandler_28);
                __jsp_taghandler_49.setProperty("contratoCursoRepresentante");
                __jsp_taghandler_49.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.representante");
                __jsp_taghandler_49.setSortable(true);
                __jsp_taghandler_49.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_50=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_50.setParent(__jsp_taghandler_28);
                __jsp_taghandler_50.setProperty("contratoCursoAdministrador");
                __jsp_taghandler_50.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.administrador");
                __jsp_taghandler_50.setSortable(true);
                __jsp_taghandler_50.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_51.setParent(__jsp_taghandler_28);
                __jsp_taghandler_51.setProperty("contratoCursoMonto");
                __jsp_taghandler_51.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.monto");
                __jsp_taghandler_51.setSortable(true);
                __jsp_taghandler_51.setFormat(" {0,number,#,##0.00}");
                __jsp_taghandler_51.setStyle((java.lang.String) ("text-align: right;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_52=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_52.setParent(__jsp_taghandler_28);
                __jsp_taghandler_52.setProperty("fechaAdjud");
                __jsp_taghandler_52.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.fechaAdjud");
                __jsp_taghandler_52.setSortable(true);
                __jsp_taghandler_52.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_53=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_53.setParent(__jsp_taghandler_28);
                __jsp_taghandler_53.setProperty("fechaContr");
                __jsp_taghandler_53.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.fechaContr");
                __jsp_taghandler_53.setSortable(true);
                __jsp_taghandler_53.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_54=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_54.setParent(__jsp_taghandler_28);
                __jsp_taghandler_54.setProperty("usuario");
                __jsp_taghandler_54.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.usuario");
                __jsp_taghandler_54.setSortable(true);
                __jsp_taghandler_54.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_28);
                __jsp_taghandler_55.setProperty("fecModifico");
                __jsp_taghandler_55.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.fechaModificacion");
                __jsp_taghandler_55.setSortable(true);
                __jsp_taghandler_55.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,6);
              }
              out.write("      \r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_56=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_56.setParent(__jsp_taghandler_28);
                __jsp_taghandler_56.setProperty("situacion");
                __jsp_taghandler_56.setTitleKey("sireh.label.spc.capcer.registro.consultaContrato.grid.situacion");
                __jsp_taghandler_56.setSortable(true);
                __jsp_taghandler_56.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,6);
              }
              out.write("\r\n                                                    \r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_57=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_57.setParent(__jsp_taghandler_28);
                __jsp_taghandler_57.setName("paging.banner.placement");
                __jsp_taghandler_57.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_58=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_58.setParent(__jsp_taghandler_28);
                __jsp_taghandler_58.setName("export.pdf");
                __jsp_taghandler_58.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_59=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_59.setParent(__jsp_taghandler_28);
                __jsp_taghandler_59.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_59,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_60.setParent(__jsp_taghandler_59);
                        __jsp_taghandler_60.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                          if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_60.doCatch(th);
                        } finally {
                          __jsp_taghandler_60.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,7);
                      }
                      out.write("<br/><br/></span>\r\n                                    ");
                    } while (__jsp_taghandler_59.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,6);
              }
              out.write("\r\n                                ");
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
      out.write("\r\n                            </div>\r\n                        ");
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

  private static final char __oracle_jsp_text[][]=new char[45][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[15] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[16] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[19] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[22] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td colspan=\"4\">\r\n                <table width=\"90%\" border=\"0\" align=\"center\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[25] = 
    "&nbsp;\r\n                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n    </table>\r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                        <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[36] = 
    "<br/><br/></span>\r\n                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>\r\n                <table width=\"100%\" border=\"0\" align=\"center\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[40] = 
    "&nbsp;\r\n                            ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){            \r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.claveCurso').alphanumeric({allow:\"-\"});\r\n            $j('.numeric').numeric();\r\n        });\r\n        \r\n        // PagedList asincrono\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n        \r\n        // Descripciones cortas\r\n        var span = document.getElementsByTagName('span');\r\n        for (i = 0; i < span.length; i++) {\r\n            if (span[i].id == 'descCorta') {\r\n                var text = span[i].innerHTML;\r\n                if (text != null && text != \"\" && text != \"undefined\") {\r\n                    span[i].innerHTML = text.substring(0, 35) + \"...\";\r\n                }\r\n            }\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
