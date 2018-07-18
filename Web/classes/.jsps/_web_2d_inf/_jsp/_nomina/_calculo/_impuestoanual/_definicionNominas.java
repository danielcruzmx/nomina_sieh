package _web_2d_inf._jsp._nomina._calculo._impuestoanual;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _definicionNominas extends com.orionserver.http.OrionHttpJspPage {


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
    _definicionNominas page = this;
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
        __jsp_taghandler_1.setModelAttribute("administracionAnualDTO");
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
                __jsp_taghandler_5.setCode("calculo.menu");
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
                __jsp_taghandler_6.setCode("calculo.admonanual");
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
                __jsp_taghandler_7.setCode("reporte.calculo.nomina.definicion");
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
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.nomina.impuesto.anual.parametros.deducciones.ciclo");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_9=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setKey("0");
                __jsp_taghandler_9.setValue("selectList.nonValue");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_10=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setBeanName("cicloRegControl");
                __jsp_taghandler_10.setPath("ciclo");
                __jsp_taghandler_10.setStyle("width: 200px;");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.nomina.gestion.label.numQuincena");
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
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setKey("");
                __jsp_taghandler_12.setValue("selectList.nonValue");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_13=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setBeanName("tnNominaQuincena");
                __jsp_taghandler_13.setPath("quincena");
                __jsp_taghandler_13.setStyle("width: 200px;");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.nomina.gestion.label.tipoNomina");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_15=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setKey("");
                __jsp_taghandler_15.setValue("selectList.nonValue");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_16=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setBeanName("listaTiposNomina");
                __jsp_taghandler_16.setPath("tipoNomina");
                __jsp_taghandler_16.setStyle("width: 200px;");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.nomina.gestion.label.gpoPago");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                  if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_17.doCatch(th);
                } finally {
                  __jsp_taghandler_17.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,2);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_18=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setKey("");
                __jsp_taghandler_18.setValue("selectList.nonValue");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_19=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setBeanName("listaGruposPago");
                __jsp_taghandler_19.setPath("grupoPago");
                __jsp_taghandler_19.setStyle("width: 200px;");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.nomina.gestion.label.status");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                  if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_20.doCatch(th);
                } finally {
                  __jsp_taghandler_20.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_21=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setKey("");
                __jsp_taghandler_21.setValue("selectList.nonValue");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_22=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setBeanName("listaEstadosNomina");
                __jsp_taghandler_22.setPath("idEdoNom");
                __jsp_taghandler_22.setStyle("width: 200px;");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                  if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_23.doCatch(th);
                } finally {
                  __jsp_taghandler_23.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
              }
              out.write(__oracle_jsp_text[27]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_24=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setPath("muestraRegistros");
                __jsp_taghandler_24.setAction((java.lang.String) ("impuestoAnual/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${administracionAnualDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_24.setValue("submit.search");
                __jsp_taghandler_24.setProgressBar("true");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_25=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setPath("cancel");
                __jsp_taghandler_25.setAction((java.lang.String) ("impuestoAnual/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${administracionAnualDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_25.setValue("submit.clean");
                __jsp_taghandler_25.setProgressBar("true");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${administracionAnualDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[30]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_27=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_27.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_27.setJspContext(pageContext);
                      __jsp_taghandler_27.setProperty("H.HP_EJER_FISCAL");
                      __jsp_taghandler_27.setCondition("=");
                      __jsp_taghandler_27.setPath("ciclo");
                      __jsp_taghandler_27.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_28=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_28.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_28.setJspContext(pageContext);
                      __jsp_taghandler_28.setProperty("H.HP_QNA_PAGO");
                      __jsp_taghandler_28.setCondition("=");
                      __jsp_taghandler_28.setPath("quincena");
                      __jsp_taghandler_28.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                    }
                    out.write(__oracle_jsp_text[32]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_29=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_29.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_29.setJspContext(pageContext);
                      __jsp_taghandler_29.setProperty("H.ID_TIPO_NOMINA");
                      __jsp_taghandler_29.setCondition("=");
                      __jsp_taghandler_29.setPath("tipoNomina");
                      __jsp_taghandler_29.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                    }
                    out.write(__oracle_jsp_text[33]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_30=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_30.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_30.setJspContext(pageContext);
                      __jsp_taghandler_30.setProperty("H.ID_GRUPOPAGO_NOM");
                      __jsp_taghandler_30.setCondition("=");
                      __jsp_taghandler_30.setPath("grupoPago");
                      __jsp_taghandler_30.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                    }
                    out.write(__oracle_jsp_text[34]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_31=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_31.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_31.setJspContext(pageContext);
                      __jsp_taghandler_31.setProperty("N.ID_EDO_NOM");
                      __jsp_taghandler_31.setCondition("=");
                      __jsp_taghandler_31.setPath("idEdoNom");
                      __jsp_taghandler_31.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
                    }
                    out.write(__oracle_jsp_text[35]);
                    {
                      _oracle._jsp._tag._pagedList_tag __jsp_taghandler_32=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                      __jsp_taghandler_32.setParent(__jsp_taghandler_26);
                      __jsp_taghandler_32.setJspContext(pageContext);
                      __jsp_taghandler_32.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${administracionAnualDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_32.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${administracionAnualDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_32.setAppendFilters("false");
                      __jsp_taghandler_32.setCheckbox("true");
                      __jsp_taghandler_32.setChkProperty("idGrupo");
                      __jsp_taghandler_32.setMaxRows("200");
                      __jsp_taghandler_32.setJspBody(new _definicionNominas_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_32, __ojsp_varRes));
                      __jsp_taghandler_32.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                    }
                    out.write(__oracle_jsp_text[36]);
                  } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write(__oracle_jsp_text[37]);
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

  private class _definicionNominas_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _definicionNominas_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_32       = parent;
      out.write("\r\n                <div id=\"displayTagDiv\">        \r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_33=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_33.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_32));
        __jsp_taghandler_33.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${administracionAnualDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_33.setPagesize(15);
        __jsp_taghandler_33.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_33.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_33.setClass("displaytag");
        __jsp_taghandler_33.setExport(true);
        __jsp_taghandler_33.setUid("row");
        __jsp_taghandler_33.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_33,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                __jsp_taghandler_34.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.idQna");
                __jsp_taghandler_34.setSortable(true);
                __jsp_taghandler_34.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_34,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        <a href=\"modificacionNomina.do?idQna=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_35.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                        if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
                      }
                      out.write("&folio1=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_36.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_36.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.folio1}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
                      }
                      out.write("&folio2=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_37.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_37.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.folio2}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                        if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
                      }
                      out.write("&folio3=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_38.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_38.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.folio3}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                        if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
                      }
                      out.write("&tcpmonto=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_39.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_39.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.tcpmonto}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                        if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
                      }
                      out.write("&tcdmonto=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_40.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_40.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.tcdmonto}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                        if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,6);
                      }
                      out.write("&tcpisrgmonto=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_41.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_41.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.tcpisrgmonto}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                        if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
                      }
                      out.write("&tcpisremonto=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_42.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_42.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.tcpisremonto}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                        if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
                      }
                      out.write("&tcdisrgmonto=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_43.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_43.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.tcdisrgmonto}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                        if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
                      }
                      out.write("&tcdisremonto=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_44.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_44.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.tcdisremonto}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                        if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
                      }
                      out.write("&ciclo=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_45.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_45.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${administracionAnualDTO.ciclo}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                        if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
                      }
                      out.write("\">\r\n                                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_46.setParent(__jsp_taghandler_34);
                        __jsp_taghandler_46.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idQna}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                        if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
                      }
                      out.write("\r\n                                        </a>\r\n                        ");
                    } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_33);
                __jsp_taghandler_47.setProperty("qnaCaptura");
                __jsp_taghandler_47.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.qnaCaptura");
                __jsp_taghandler_47.setSortable(true);
                __jsp_taghandler_47.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_33);
                __jsp_taghandler_48.setProperty("numComplem");
                __jsp_taghandler_48.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.numComplem");
                __jsp_taghandler_48.setSortable(true);
                __jsp_taghandler_48.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_49=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_49.setParent(__jsp_taghandler_33);
                __jsp_taghandler_49.setProperty("descripcion");
                __jsp_taghandler_49.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.desc");
                __jsp_taghandler_49.setSortable(true);
                __jsp_taghandler_49.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_50=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_50.setParent(__jsp_taghandler_33);
                __jsp_taghandler_50.setProperty("tipoNomina");
                __jsp_taghandler_50.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.tipoNomina");
                __jsp_taghandler_50.setSortable(true);
                __jsp_taghandler_50.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_51.setParent(__jsp_taghandler_33);
                __jsp_taghandler_51.setProperty("grupoPago");
                __jsp_taghandler_51.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.grupoPago");
                __jsp_taghandler_51.setSortable(true);
                __jsp_taghandler_51.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_52=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_52.setParent(__jsp_taghandler_33);
                __jsp_taghandler_52.setProperty("descEstadoNom");
                __jsp_taghandler_52.setTitleKey("sireh.label.nomina.gestion.consulta.parametros.status");
                __jsp_taghandler_52.setSortable(true);
                __jsp_taghandler_52.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_53=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_53.setParent(__jsp_taghandler_33);
                __jsp_taghandler_53.setProperty("folio1");
                __jsp_taghandler_53.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.folio1");
                __jsp_taghandler_53.setSortable(true);
                __jsp_taghandler_53.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_54=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_54.setParent(__jsp_taghandler_33);
                __jsp_taghandler_54.setProperty("folio2");
                __jsp_taghandler_54.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.folio2");
                __jsp_taghandler_54.setSortable(true);
                __jsp_taghandler_54.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_33);
                __jsp_taghandler_55.setProperty("folio3");
                __jsp_taghandler_55.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.folio3");
                __jsp_taghandler_55.setSortable(true);
                __jsp_taghandler_55.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_56=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_56.setParent(__jsp_taghandler_33);
                __jsp_taghandler_56.setProperty("tcpmonto");
                __jsp_taghandler_56.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.tcpmonto");
                __jsp_taghandler_56.setSortable(true);
                __jsp_taghandler_56.setFormat("{0,number,#,##0.00}");
                __jsp_taghandler_56.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_57=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_57.setParent(__jsp_taghandler_33);
                __jsp_taghandler_57.setProperty("tcdmonto");
                __jsp_taghandler_57.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.tcdmonto");
                __jsp_taghandler_57.setSortable(true);
                __jsp_taghandler_57.setFormat("{0,number,#,##0.00}");
                __jsp_taghandler_57.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_58=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_58.setParent(__jsp_taghandler_33);
                __jsp_taghandler_58.setProperty("tcpisrgmonto");
                __jsp_taghandler_58.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.tcpisrgmonto");
                __jsp_taghandler_58.setSortable(true);
                __jsp_taghandler_58.setFormat("{0,number,#,##0.00}");
                __jsp_taghandler_58.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_59=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_59.setParent(__jsp_taghandler_33);
                __jsp_taghandler_59.setProperty("tcpisremonto");
                __jsp_taghandler_59.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.tcpisremonto");
                __jsp_taghandler_59.setSortable(true);
                __jsp_taghandler_59.setFormat("{0,number,#,##0.00}");
                __jsp_taghandler_59.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_60=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_60.setParent(__jsp_taghandler_33);
                __jsp_taghandler_60.setProperty("tcdisrgmonto");
                __jsp_taghandler_60.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.tcdisrgmonto");
                __jsp_taghandler_60.setSortable(true);
                __jsp_taghandler_60.setFormat("{0,number,#,##0.00}");
                __jsp_taghandler_60.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_61=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_61.setParent(__jsp_taghandler_33);
                __jsp_taghandler_61.setProperty("tcdisremonto");
                __jsp_taghandler_61.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.tcdisremonto");
                __jsp_taghandler_61.setSortable(true);
                __jsp_taghandler_61.setFormat("{0,number,#,##0.00}");
                __jsp_taghandler_61.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_62=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_62.setParent(__jsp_taghandler_33);
                __jsp_taghandler_62.setProperty("fcreacion");
                __jsp_taghandler_62.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.fcreacion");
                __jsp_taghandler_62.setSortable(true);
                __jsp_taghandler_62.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_63=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_63.setParent(__jsp_taghandler_33);
                __jsp_taghandler_63.setProperty("fanexo");
                __jsp_taghandler_63.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.fanexo");
                __jsp_taghandler_63.setSortable(true);
                __jsp_taghandler_63.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_64=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_64.setParent(__jsp_taghandler_33);
                __jsp_taghandler_64.setProperty("ftimbrado");
                __jsp_taghandler_64.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.ftimbrado");
                __jsp_taghandler_64.setSortable(true);
                __jsp_taghandler_64.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_65=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_65.setParent(__jsp_taghandler_33);
                __jsp_taghandler_65.setProperty("reftimbrado");
                __jsp_taghandler_65.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.reftimbrado");
                __jsp_taghandler_65.setSortable(true);
                __jsp_taghandler_65.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_66=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_66.setParent(__jsp_taghandler_33);
                __jsp_taghandler_66.setProperty("fcancelacionsireh");
                __jsp_taghandler_66.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.fcancelacionsireh");
                __jsp_taghandler_66.setSortable(true);
                __jsp_taghandler_66.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_67=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_67.setParent(__jsp_taghandler_33);
                __jsp_taghandler_67.setProperty("fcansat");
                __jsp_taghandler_67.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.fcansat");
                __jsp_taghandler_67.setSortable(true);
                __jsp_taghandler_67.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_68=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_68.setParent(__jsp_taghandler_33);
                __jsp_taghandler_68.setProperty("refsat");
                __jsp_taghandler_68.setTitleKey("sireh.label.nomina.impuesto.anual.parametros.refsat");
                __jsp_taghandler_68.setSortable(true);
                __jsp_taghandler_68.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_69=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_69.setParent(__jsp_taghandler_33);
                __jsp_taghandler_69.setName("paging.banner.placement");
                __jsp_taghandler_69.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_70=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_70.setParent(__jsp_taghandler_33);
                __jsp_taghandler_70.setName("export.pdf");
                __jsp_taghandler_70.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_71=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_71.setParent(__jsp_taghandler_33);
                __jsp_taghandler_71.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_71,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_72=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_72.setParent(__jsp_taghandler_71);
                        __jsp_taghandler_72.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                          if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_72.doCatch(th);
                        } finally {
                          __jsp_taghandler_72.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,6);
                      }
                      out.write("<br><br></span>\r\n                        ");
                    } while (__jsp_taghandler_71.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,5);
              }
              out.write("\r\n                    ");
            } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,4);
      }
      out.write("\r\n                </div>\r\n            ");
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

  private static final char __oracle_jsp_text[][]=new char[38][];
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
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    \r\n    <h1>\r\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "&#45;\r\n        ".toCharArray();
    __oracle_jsp_text[10] = 
    "&#45;\r\n        ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    </h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.1em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"95%\" align=\"center\" border=\"0\">\r\n                        <tr><td>&nbsp;</td></tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                         </tr>\r\n                         <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                         </tr>\r\n                         <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                         </tr>\r\n                         <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            </td>\r\n                         </tr>\r\n                    </table>\r\n                    <table width=\"95%\" align=\"center\" border=\"0\">\r\n                        <tr><td align=\"left\"><strong>".toCharArray();
    __oracle_jsp_text[27] = 
    "</strong></td></tr>\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[28] = 
    "&nbsp; \r\n                                ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            </td>\r\n                            <tr><td>&nbsp;</td></tr>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n        <div id=\"dataTable\" style=\"width: 1025px; overflow: auto;\">\r\n            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n        </div>\r\n    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
