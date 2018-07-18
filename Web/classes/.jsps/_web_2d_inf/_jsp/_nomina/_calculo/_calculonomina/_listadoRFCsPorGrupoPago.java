package _web_2d_inf._jsp._nomina._calculo._calculonomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _listadoRFCsPorGrupoPago extends com.orionserver.http.OrionHttpJspPage {


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
    _listadoRFCsPorGrupoPago page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag id modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setId("formPago");
        __jsp_taghandler_1.setModelAttribute("pagoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("idGrupoPago");
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
                __jsp_taghandler_3.setPath("descGrupoPago");
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
                __jsp_taghandler_4.setPath("idQna");
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
                __jsp_taghandler_5.setPath("idTipoNomina");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("status");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("casoMuestraOld");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("idPlaza");
                __jsp_taghandler_8.setId("idPlaza");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.titulo");
                __jsp_taghandler_9.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.descGrupoPago}",java.lang.Object.class, __ojsp_varRes,null));
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
                _oracle._jsp._tag._filter_tag __jsp_taghandler_10=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setProperty("TN_NOMINA.ID_NOMINA");
                __jsp_taghandler_10.setCondition("=");
                __jsp_taghandler_10.setPath("idQna");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_11=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setBeanName("listaNominasQnaPorQna");
                __jsp_taghandler_11.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.viewName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_11.setAppendFilters("false");
                __jsp_taghandler_11.setMaxRows("200");
                __jsp_taghandler_11.setJspBody(new _listadoRFCsPorGrupoPago_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_11, __ojsp_varRes));
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.grupoInfo.busqueda");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                  if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_24.doCatch(th);
                } finally {
                  __jsp_taghandler_24.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                  if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_25.doCatch(th);
                } finally {
                  __jsp_taghandler_25.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_26=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setPath("rfcEmpleado");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombreEmpleado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                  if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_27.doCatch(th);
                } finally {
                  __jsp_taghandler_27.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_28=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setPath("nombreEmpleado");
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.primerApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                  if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_29.doCatch(th);
                } finally {
                  __jsp_taghandler_29.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,2);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_30=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("primerApellido");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.segundoApellido");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                  if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_31.doCatch(th);
                } finally {
                  __jsp_taghandler_31.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
              }
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_32=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setPath("segundoApellido");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                  if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_33.doCatch(th);
                } finally {
                  __jsp_taghandler_33.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
              }
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_34=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setKey("");
                __jsp_taghandler_34.setValue("selectList.nonValue");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_35=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setBeanName("listaJerarquias");
                __jsp_taghandler_35.setPath("idJerarquia");
                __jsp_taghandler_35.setStyle("width:117px;");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_36=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                  if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_36.doCatch(th);
                } finally {
                  __jsp_taghandler_36.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,2);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_37=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setJspContext(pageContext);
                __jsp_taghandler_37.setKey("");
                __jsp_taghandler_37.setValue("selectList.nonValue");
                __jsp_taghandler_37.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_38=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setBeanName("listaNombramientos");
                __jsp_taghandler_38.setPath("idNombramiento");
                __jsp_taghandler_38.setStyle("width:117px;");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                  if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_39.doCatch(th);
                } finally {
                  __jsp_taghandler_39.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
              }
              out.write(__oracle_jsp_text[31]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_40=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setKey("");
                __jsp_taghandler_40.setValue("selectList.nonValue");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_41=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setBeanName("listaNiveles");
                __jsp_taghandler_41.setPath("idNivelPto");
                __jsp_taghandler_41.setStyle("width:117px;");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[33]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_42=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setAction("calculoNomina/buscaRFCsPorGrupoPago.do");
                __jsp_taghandler_42.setValue("submit.search");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_43=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setJspContext(pageContext);
                __jsp_taghandler_43.setProperty("td_empleado.RFC_EMPLEADO");
                __jsp_taghandler_43.setCondition("contains");
                __jsp_taghandler_43.setPath("rfcEmpleado");
                __jsp_taghandler_43.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_44=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setProperty("td_empleado.NOMBRE_EMPLEADO");
                __jsp_taghandler_44.setCondition("contains");
                __jsp_taghandler_44.setPath("nombreEmpleado");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_45=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setProperty("td_empleado.PRIMER_APELLIDO");
                __jsp_taghandler_45.setCondition("contains");
                __jsp_taghandler_45.setPath("primerApellido");
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_46=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setJspContext(pageContext);
                __jsp_taghandler_46.setProperty("td_empleado.SEGUNDO_APELLIDO");
                __jsp_taghandler_46.setCondition("contains");
                __jsp_taghandler_46.setPath("segundoApellido");
                __jsp_taghandler_46.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_46, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_47=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setJspContext(pageContext);
                __jsp_taghandler_47.setProperty("tc_jerarquia.ID_JERARQUIA");
                __jsp_taghandler_47.setCondition("=");
                __jsp_taghandler_47.setPath("idJerarquia");
                __jsp_taghandler_47.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_48=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setJspContext(pageContext);
                __jsp_taghandler_48.setProperty("tc_nombramiento.ID_NOMBRAMIENTO");
                __jsp_taghandler_48.setCondition("=");
                __jsp_taghandler_48.setPath("idNombramiento");
                __jsp_taghandler_48.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_49=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setJspContext(pageContext);
                __jsp_taghandler_49.setProperty("TRIM(tc_atributo_puesto.ID_NIVEL_PTO)");
                __jsp_taghandler_49.setCondition("=");
                __jsp_taghandler_49.setPath("idNivelPto");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_50=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setJspContext(pageContext);
                __jsp_taghandler_50.setProperty("td_empleado.CASO_MUESTRA");
                __jsp_taghandler_50.setCondition("=");
                __jsp_taghandler_50.setPath("casoMuestra");
                __jsp_taghandler_50.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_51=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setProperty("p.ID_GRUPO_PAGO");
                __jsp_taghandler_51.setCondition("=");
                __jsp_taghandler_51.setPath("idGrupoPago");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_52=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setProperty("p.HP_CONSEC_NOMINA");
                __jsp_taghandler_52.setCondition("=");
                __jsp_taghandler_52.setPath("idQna");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_53=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setJspContext(pageContext);
                __jsp_taghandler_53.setBeanName("listaPagosPorGrupo");
                __jsp_taghandler_53.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.viewName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_53.setAppendFilters("false");
                __jsp_taghandler_53.setCheckbox("true");
                __jsp_taghandler_53.setChkProperty("casosMuestra");
                __jsp_taghandler_53.setMaxRows("200");
                __jsp_taghandler_53.setJspBody(new _listadoRFCsPorGrupoPago_OjspFragmentSupport( 1, pageContext, __jsp_taghandler_53, __ojsp_varRes));
                __jsp_taghandler_53.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_80=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_80.setParent(__jsp_taghandler_1);
                __jsp_taghandler_80.setJspContext(pageContext);
                __jsp_taghandler_80.setAction("calculoNomina/historicoRevisionTodos.do");
                __jsp_taghandler_80.setValue("submit.export.nomcontodoscptos");
                __jsp_taghandler_80.setProgressIcon("false");
                __jsp_taghandler_80.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_80, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_81=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_81.setParent(__jsp_taghandler_1);
                __jsp_taghandler_81.setJspContext(pageContext);
                __jsp_taghandler_81.setAction("calculoNomina/historicoRevisionConPago.do");
                __jsp_taghandler_81.setValue("submit.export.nomconcptospago");
                __jsp_taghandler_81.setProgressIcon("false");
                __jsp_taghandler_81.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_81, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_82=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_82.setParent(__jsp_taghandler_1);
                __jsp_taghandler_82.setJspContext(pageContext);
                __jsp_taghandler_82.setAction("calculoNomina/historicoRevisionConPA.do");
                __jsp_taghandler_82.setValue("submit.export.nomconpapago");
                __jsp_taghandler_82.setProgressIcon("false");
                __jsp_taghandler_82.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_82, pageContext);
              }
              out.write(__oracle_jsp_text[48]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_83=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_83.setParent(__jsp_taghandler_1);
                __jsp_taghandler_83.setJspContext(pageContext);
                __jsp_taghandler_83.setAction("calculoNomina/cancelarCalculoNomina.do");
                __jsp_taghandler_83.setValue("submit.clean");
                __jsp_taghandler_83.setProgressIcon("false");
                __jsp_taghandler_83.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_83, pageContext);
              }
              out.write(__oracle_jsp_text[49]);
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
      out.write(__oracle_jsp_text[50]);

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

  private class _listadoRFCsPorGrupoPago_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _listadoRFCsPorGrupoPago_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_11       = parent;
      out.write("\r\n        \r\n        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_12=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort defaultsort defaultorder");
        __jsp_taghandler_12.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_11));
        __jsp_taghandler_12.setName("listaNominasQnaPorQna");
        __jsp_taghandler_12.setPagesize(10);
        __jsp_taghandler_12.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_12.setClass("displaytag");
        __jsp_taghandler_12.setExport(false);
        __jsp_taghandler_12.setUid("qna");
        __jsp_taghandler_12.setSort("list");
        __jsp_taghandler_12.setDefaultsort(2);
        __jsp_taghandler_12.setDefaultorder("descending");
        java.lang.Object qna = null;
        java.lang.Integer qna_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
            do {
              qna = (java.lang.Object) pageContext.findAttribute("qna");
              qna_rowNum = (java.lang.Integer) pageContext.findAttribute("qna_rowNum");
              out.write("\r\n                       \r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_13=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                __jsp_taghandler_13.setName("paging.banner.no_items_found");
                __jsp_taghandler_13.setValue("");
                __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_14=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                __jsp_taghandler_14.setName("paging.banner.one_item_found");
                __jsp_taghandler_14.setValue("");
                __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_15=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_15.setParent(__jsp_taghandler_12);
                __jsp_taghandler_15.setName("paging.banner.all_items_found");
                __jsp_taghandler_15.setValue("");
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_16=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_16.setParent(__jsp_taghandler_12);
                __jsp_taghandler_16.setName("paging.banner.some_items_found");
                __jsp_taghandler_16.setValue("");
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_17=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_17.setParent(__jsp_taghandler_12);
                __jsp_taghandler_17.setName("paging.banner.page.selected");
                __jsp_taghandler_17.setValue("");
                __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,4);
              }
              out.write("\r\n            \r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_18=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_18.setParent(__jsp_taghandler_12);
                __jsp_taghandler_18.setProperty("nomQnaCaptura");
                __jsp_taghandler_18.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.qnaCaptura");
                __jsp_taghandler_18.setSortable(true);
                __jsp_taghandler_18.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_19=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_19.setParent(__jsp_taghandler_12);
                __jsp_taghandler_19.setProperty("nomNumComplem");
                __jsp_taghandler_19.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.numComplem");
                __jsp_taghandler_19.setSortable(true);
                __jsp_taghandler_19.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_20=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_20.setParent(__jsp_taghandler_12);
                __jsp_taghandler_20.setProperty("nomDescripcion");
                __jsp_taghandler_20.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.desc");
                __jsp_taghandler_20.setSortable(true);
                __jsp_taghandler_20.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_21=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_21.setParent(__jsp_taghandler_12);
                __jsp_taghandler_21.setProperty("nomDescTipoNomina");
                __jsp_taghandler_21.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.tipoNomina");
                __jsp_taghandler_21.setSortable(true);
                __jsp_taghandler_21.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_22=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_22.setParent(__jsp_taghandler_12);
                __jsp_taghandler_22.setProperty("nomDescGrupoPago");
                __jsp_taghandler_22.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.grupoPago");
                __jsp_taghandler_22.setSortable(true);
                __jsp_taghandler_22.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_23=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_23.setParent(__jsp_taghandler_12);
                __jsp_taghandler_23.setProperty("status");
                __jsp_taghandler_23.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.status");
                __jsp_taghandler_23.setSortable(true);
                __jsp_taghandler_23.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,4);
              }
              out.write("\r\n         ");
            } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
      }
      out.write("\r\n    ");
      return;
    }

      
    public void invoke1(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_53       = parent;
      out.write("\r\n                   \r\n        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_54=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_54.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_53));
        __jsp_taghandler_54.setName("listaPagosPorGrupo");
        __jsp_taghandler_54.setPagesize(10);
        __jsp_taghandler_54.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_54.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_54.setClass("displaytag");
        __jsp_taghandler_54.setExport(false);
        __jsp_taghandler_54.setUid("pagoRow");
        __jsp_taghandler_54.setSort("list");
        java.lang.Object pagoRow = null;
        java.lang.Integer pagoRow_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_54,__jsp_tag_starteval,out);
            do {
              pagoRow = (java.lang.Object) pageContext.findAttribute("pagoRow");
              pagoRow_rowNum = (java.lang.Integer) pageContext.findAttribute("pagoRow_rowNum");
              out.write("\r\n                       \r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                __jsp_taghandler_55.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc");
                __jsp_taghandler_55.setSortable(true);
                __jsp_taghandler_55.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_55,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                <a href=\"muestraDetallePorRFC.do?idGrupoPago=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_56=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_56.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_56.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idGrupoPago}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                        if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,5);
                      }
                      out.write("&idQna=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_57=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_57.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_57.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                        if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,5);
                      }
                      out.write("&rfcEmpleado=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_58=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_58.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_58.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoRow.casosMuestra}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                        if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,5);
                      }
                      out.write("&idPlaza=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_59.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_59.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoRow.idPlaza}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                        if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,5);
                      }
                      out.write("&idTipoNomina=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_60=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_60.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_60.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${param.idTipoNomina}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                        if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,5);
                      }
                      out.write("\">\r\n                    ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_61=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_61.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_61.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoRow.casosMuestra}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                        if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,5);
                      }
                      out.write("\r\n                </a>\r\n            ");
                    } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_62=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_62.setParent(__jsp_taghandler_54);
                __jsp_taghandler_62.setProperty("nombreEmpleado");
                __jsp_taghandler_62.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombreEmpleado");
                __jsp_taghandler_62.setSortable(true);
                __jsp_taghandler_62.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_63=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_63.setParent(__jsp_taghandler_54);
                __jsp_taghandler_63.setProperty("primerApellido");
                __jsp_taghandler_63.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.primerApellido");
                __jsp_taghandler_63.setSortable(true);
                __jsp_taghandler_63.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_64=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_64.setParent(__jsp_taghandler_54);
                __jsp_taghandler_64.setProperty("segundoApellido");
                __jsp_taghandler_64.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.segundoApellido");
                __jsp_taghandler_64.setSortable(true);
                __jsp_taghandler_64.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_65=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_65.setParent(__jsp_taghandler_54);
                __jsp_taghandler_65.setProperty("idPuestoNom");
                __jsp_taghandler_65.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPuestoNom");
                __jsp_taghandler_65.setSortable(true);
                __jsp_taghandler_65.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_66=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_66.setParent(__jsp_taghandler_54);
                __jsp_taghandler_66.setProperty("idNivelPto");
                __jsp_taghandler_66.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto");
                __jsp_taghandler_66.setSortable(true);
                __jsp_taghandler_66.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_67=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_67.setParent(__jsp_taghandler_54);
                __jsp_taghandler_67.setProperty("descJerarquia");
                __jsp_taghandler_67.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia");
                __jsp_taghandler_67.setSortable(true);
                __jsp_taghandler_67.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_68=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_68.setParent(__jsp_taghandler_54);
                __jsp_taghandler_68.setProperty("descNombramiento");
                __jsp_taghandler_68.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento");
                __jsp_taghandler_68.setSortable(true);
                __jsp_taghandler_68.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,4);
              }
              out.write("\r\n            ");
              out.write("\r\n            ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_69=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_69.setParent(__jsp_taghandler_54);
                __jsp_taghandler_69.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idTipoNomina != 'IN'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_70=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                      __jsp_taghandler_70.setParent(__jsp_taghandler_69);
                      __jsp_taghandler_70.setTitleKey("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.calculo");
                      __jsp_taghandler_70.setSortable(true);
                      __jsp_taghandler_70.setStyle("text-align: center;");
                      __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        try {
                          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_70,__jsp_tag_starteval,out);
                          do {
                            out.write("\r\n                    <a href=\"calculaNominaPorRFC.do?idGrupoPago=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_71=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_71.setParent(__jsp_taghandler_70);
                              __jsp_taghandler_71.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idGrupoPago}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                              if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,6);
                            }
                            out.write("&idQna=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_72=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_72.setParent(__jsp_taghandler_70);
                              __jsp_taghandler_72.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoDTO.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                              if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,6);
                            }
                            out.write("&rfcEmpleado=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_73=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_73.setParent(__jsp_taghandler_70);
                              __jsp_taghandler_73.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoRow.casosMuestra}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                              if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,6);
                            }
                            out.write("&idPlaza=");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_74=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_74.setParent(__jsp_taghandler_70);
                              __jsp_taghandler_74.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${pagoRow.idPlaza}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                              if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,6);
                            }
                            out.write("\">\r\n                        ");
                            {
                              org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_75=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                              __jsp_taghandler_75.setParent(__jsp_taghandler_70);
                              __jsp_taghandler_75.setCode("sireh.label.nomina.calculo.ordinaria.consultaPorRFC.calculoField");
                              try {
                                __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                                if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                   throw new javax.servlet.jsp.SkipPageException();
                              } catch (Throwable th) {
                                __jsp_taghandler_75.doCatch(th);
                              } finally {
                                __jsp_taghandler_75.doFinally();
                              }
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,6);
                            }
                            out.write("\r\n                    </a>\r\n                ");
                          } while (__jsp_taghandler_70.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        finally {
                          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                        }
                      }
                      if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,5);
                    }
                    out.write("\r\n            ");
                  } while (__jsp_taghandler_69.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,4);
              }
              out.write("\r\n            \r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_76=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_76.setParent(__jsp_taghandler_54);
                __jsp_taghandler_76.setName("paging.banner.placement");
                __jsp_taghandler_76.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_77=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_77.setParent(__jsp_taghandler_54);
                __jsp_taghandler_77.setName("export.pdf");
                __jsp_taghandler_77.setValue("false");
                __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,4);
              }
              out.write("\r\n            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_78=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_78.setParent(__jsp_taghandler_54);
                __jsp_taghandler_78.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_78,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_79=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_79.setParent(__jsp_taghandler_78);
                        __jsp_taghandler_79.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                          if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_79.doCatch(th);
                        } finally {
                          __jsp_taghandler_79.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,5);
                      }
                      out.write("<br><br></span>\r\n            ");
                    } while (__jsp_taghandler_78.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,4);
              }
              out.write("\r\n            \r\n         ");
            } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,3);
      }
      out.write("\r\n         \r\n    ");
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

  private static final char __oracle_jsp_text[][]=new char[51][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    #listaNominasQnaPorQna {\r\n        display:none;\r\n    }\r\n    \r\n    .pagelinks {\r\n        display:none;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[13] = 
    "</h1>\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n\r\n    <table align=\"center\" border=\"0\" width=\"100%\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend>\r\n                        <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[16] = 
    "&nbsp;&nbsp; </strong>\r\n                    </legend>\r\n                    <table align=\"center\" border=\"0\">\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\" width=\"10%\">".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                            <td align=\"left\" width=\"20%\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\" width=\"10%\">".toCharArray();
    __oracle_jsp_text[19] = 
    "</td>\r\n                            <td align=\"left\" width=\"20%\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\" width=\"10%\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td align=\"left\" width=\"20%\">".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                            <td align=\"right\" class=\"label\" width=\"10%\">".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                            <td align=\"left\" width=\"20%\">".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\" width=\"10%\">".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                            <td align=\"left\" width=\"20%\">\r\n                                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\" width=\"10%\">".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                            <td align=\"left\" width=\"20%\">\r\n                                ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\" width=\"10%\">".toCharArray();
    __oracle_jsp_text[31] = 
    "</td>\r\n                            <td align=\"left\" colspan=\"3\">\r\n                                ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"4\" align=\"center\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[35] = 
    "  \r\n    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n    \r\n    <table align=\"center\" width=\"50%\" border=\"0\">\r\n        <tr>\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n            </td>\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n            </td>\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n            </td>\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
