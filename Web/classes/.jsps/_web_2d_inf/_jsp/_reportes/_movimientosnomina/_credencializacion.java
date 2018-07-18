package _web_2d_inf._jsp._reportes._movimientosnomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _credencializacion extends com.orionserver.http.OrionHttpJspPage {


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
    _credencializacion page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("reportesConstanciasDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.terceros.reportes.titulo.link");
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
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.movimiento.nomina.reportes.seccion.titulo.link");
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
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setCode("sireh.label.terceros.reportes.credencializacion");
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
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path id onclick value label");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("origen");
                __jsp_taghandler_5.setId("origenQna");
                __jsp_taghandler_5.setOnclick("toggle(this); ");
                __jsp_taghandler_5.setValue("r");
                __jsp_taghandler_5.setLabel("Rfc");
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
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path id onclick value label");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("origen");
                __jsp_taghandler_6.setId("origenQna");
                __jsp_taghandler_6.setOnclick("toggle(this); ");
                __jsp_taghandler_6.setValue("m");
                __jsp_taghandler_6.setLabel("Movimientos");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path id onclick value label");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("origen");
                __jsp_taghandler_7.setId("origenQna");
                __jsp_taghandler_7.setOnclick("toggle(this); ");
                __jsp_taghandler_7.setValue("b");
                __jsp_taghandler_7.setLabel("Bajas");
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
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.reportes.quincena");
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
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setKey("0");
                __jsp_taghandler_9.setValue("selectList.nonValue");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_10=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setBeanName("listaQuincenasAnteriores");
                __jsp_taghandler_10.setPath("qnaIni");
                __jsp_taghandler_10.setUppercase("false");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.reportes.rfc");
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
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_12=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setBeanName("EmpleadosDetalle");
                __jsp_taghandler_12.setPath("rfcEmpleado");
                __jsp_taghandler_12.setFieldMapping("rfcEmpleado");
                __jsp_taghandler_12.setWidth("1000");
                __jsp_taghandler_12.setLeftPosition("17");
                __jsp_taghandler_12.setHeight("400");
                __jsp_taghandler_12.setTopPosition("20");
                __jsp_taghandler_12.setMaxlength("20");
                __jsp_taghandler_12.setDisabled("true");
                __jsp_taghandler_12.setSize("20");
                __jsp_taghandler_12.setTitle("Seleccione el RFC");
                __jsp_taghandler_12.setMultiple("true");
                __jsp_taghandler_12.setOnClose("message()");
                __jsp_taghandler_12.setMaxRows("200");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.reportes.quincena");
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
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_14=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setKey("0");
                __jsp_taghandler_14.setValue("selectList.nonValue");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_15=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setBeanName("listaQuincenasAnteriores");
                __jsp_taghandler_15.setPath("qnaFin");
                __jsp_taghandler_15.setUppercase("false");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_17=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setPath("muestraReporte");
                __jsp_taghandler_17.setAction("reporteMoviminentos/credencializacion.do");
                __jsp_taghandler_17.setValue("submit.accept");
                __jsp_taghandler_17.setProgressIcon("false");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_18=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("cancel");
                __jsp_taghandler_18.setAction("reporteMoviminentos/credencializacion.do");
                __jsp_taghandler_18.setValue("submit.clean");
                __jsp_taghandler_18.setProgressIcon("false");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'RCF') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[22]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_20=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_20.setJspContext(pageContext);
                      __jsp_taghandler_20.setName("P_CICLO");
                      __jsp_taghandler_20.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_20.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
                    }
                    out.write(__oracle_jsp_text[23]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_21=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_21.setJspContext(pageContext);
                      __jsp_taghandler_21.setName("P_RFC");
                      __jsp_taghandler_21.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_21.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                    }
                    out.write(__oracle_jsp_text[24]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_22=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_22.setJspContext(pageContext);
                      __jsp_taghandler_22.setProvider("jasper");
                      __jsp_taghandler_22.setViewUri("/nomina/constanciaSueldoCFirmaCicloRFC");
                      __jsp_taghandler_22.setImagesUri("/images/reports");
                      __jsp_taghandler_22.setFormat("pdf");
                      __jsp_taghandler_22.setFileName("constanciaSueldoCFirmaCicloRFC");
                      __jsp_taghandler_22.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_22.setWidth("1060");
                      __jsp_taghandler_22.setHeight("350");
                      __jsp_taghandler_22.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                    }
                    out.write(__oracle_jsp_text[25]);
                  } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'RSF') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[27]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_24=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_24.setJspContext(pageContext);
                      __jsp_taghandler_24.setName("P_CICLO");
                      __jsp_taghandler_24.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_24.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                    }
                    out.write(__oracle_jsp_text[28]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_25=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_25.setJspContext(pageContext);
                      __jsp_taghandler_25.setName("P_RFC");
                      __jsp_taghandler_25.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_25.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                    }
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_26=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_26.setParent(__jsp_taghandler_23);
                      __jsp_taghandler_26.setJspContext(pageContext);
                      __jsp_taghandler_26.setProvider("jasper");
                      __jsp_taghandler_26.setViewUri("/nomina/constanciaSueldoSFirmaCicloRFC");
                      __jsp_taghandler_26.setImagesUri("/images/reports");
                      __jsp_taghandler_26.setFormat("pdf");
                      __jsp_taghandler_26.setFileName("constanciaSueldoSFirmaCicloRFC");
                      __jsp_taghandler_26.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_26.setWidth("1060");
                      __jsp_taghandler_26.setHeight("350");
                      __jsp_taghandler_26.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                  } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,2);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'UCF') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[32]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_28=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_28.setJspContext(pageContext);
                      __jsp_taghandler_28.setName("P_CICLO");
                      __jsp_taghandler_28.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_28.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                    }
                    out.write(__oracle_jsp_text[33]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_29=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_29.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_29.setJspContext(pageContext);
                      __jsp_taghandler_29.setName("P_UNIDAD");
                      __jsp_taghandler_29.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.unidad}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_29.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                    }
                    out.write(__oracle_jsp_text[34]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_30=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_30.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_30.setJspContext(pageContext);
                      __jsp_taghandler_30.setProvider("jasper");
                      __jsp_taghandler_30.setViewUri("/nomina/constanciaSueldoCFirmaCicloUnidad");
                      __jsp_taghandler_30.setImagesUri("/images/reports");
                      __jsp_taghandler_30.setFormat("pdf");
                      __jsp_taghandler_30.setFileName("constanciaSueldoCFirmaCicloUnidad");
                      __jsp_taghandler_30.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_30.setWidth("1060");
                      __jsp_taghandler_30.setHeight("350");
                      __jsp_taghandler_30.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                    }
                    out.write(__oracle_jsp_text[35]);
                  } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'USF') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[37]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_32=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_32.setJspContext(pageContext);
                      __jsp_taghandler_32.setName("P_CICLO");
                      __jsp_taghandler_32.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_32.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_33=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_33.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_33.setJspContext(pageContext);
                      __jsp_taghandler_33.setName("P_UNIDAD");
                      __jsp_taghandler_33.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.unidad}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_33.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_34=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_34.setParent(__jsp_taghandler_31);
                      __jsp_taghandler_34.setJspContext(pageContext);
                      __jsp_taghandler_34.setProvider("jasper");
                      __jsp_taghandler_34.setViewUri("/nomina/constanciaSueldoSFirmaCicloUnidad");
                      __jsp_taghandler_34.setImagesUri("/images/reports");
                      __jsp_taghandler_34.setFormat("pdf");
                      __jsp_taghandler_34.setFileName("constanciaSueldoSFirmaCicloUnidad");
                      __jsp_taghandler_34.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_34.setWidth("1060");
                      __jsp_taghandler_34.setHeight("350");
                      __jsp_taghandler_34.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                    }
                    out.write(__oracle_jsp_text[40]);
                  } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,2);
              }
              out.write(__oracle_jsp_text[41]);
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
  private static final char __oracle_jsp_text[][]=new char[42][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n\r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[5] = 
    " &#45;\r\n            ".toCharArray();
    __oracle_jsp_text[6] = 
    " &#45; \r\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n        </strong>\r\n    </h1>\r\n  \r\n        <table width=\"100%\" align=\"center\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    <fieldset>\r\n                        <legend style=\"font-size:1.1em\"><strong>&nbsp;&nbsp;Tipo de reporte&nbsp;&nbsp; </strong></legend>\r\n                        <table width=\"100%\" align=\"center\" border=\"0\" >\r\n                            <tr>\r\n                                <td align=\"right\" class=\"label\" width=\"20%\">* Origen</td>\r\n                                <td align=\"left\" colspan=\"3\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td colspan=\"3\">\r\n                                    <div id=\"rfcc\" style=\"display:none\">\r\n                                        <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                            <tr>\r\n                                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                                                <td align=\"left\">\r\n                                                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                    </div>\r\n                                    <div id=\"qna\"  style=\"display:none\">\r\n                                        <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                            <tr>\r\n                                                <td  align=\"right\" class=\"label\"  width=\"20%\">".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                                                <td align=\"left\"  colspan=\"2\">\r\n                                                    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                                </td> \r\n                                            </tr>\r\n                                        </table>\r\n                                    </div>\r\n\r\n                                    <div id=\"baja\"  style=\"display:none\">\r\n                                        <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                            <tr>\r\n                                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                                                <td align=\"left\">\r\n                                                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                    </div>\r\n\r\n\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td align=\"left\"><strong>".toCharArray();
    __oracle_jsp_text[19] = 
    "</strong></td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[20] = 
    " </td>\r\n                                <td align=\"center\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            </tr>\r\n                        </table>\r\n                    </fieldset>\r\n                </td>\r\n            </tr>\r\n        </table><br/><br/>\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n            <table align=\"center\" width=\"100%\" border=\"0\">\r\n                <tr>\r\n                    <td>\r\n                        ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n            <table align=\"center\" width=\"100%\" border=\"0\">\r\n                <tr>\r\n                    <td>\r\n                        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n            <table align=\"center\" width=\"100%\" border=\"0\">\r\n                <tr>\r\n                    <td>\r\n                        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n            <table align=\"center\" width=\"100%\" border=\"0\">\r\n                <tr>\r\n                    <td>\r\n                        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n        \r\n        \r\n        \r\n        <script type=\"text/javascript\">\r\n            \r\n            function toggle(elemento){\r\n                \r\n                if(elemento.value == 'r'){\r\n                    document.getElementById(\"rfcc\").style.display = \"none\";\r\n                    document.getElementById(\"qna\").style.display = \"block\";\r\n                    document.getElementById(\"baja\").style.display = \"none\";\r\n                }\r\n                else if(elemento.value == 'm'){\r\n                    document.getElementById(\"rfcc\").style.display = \"block\";\r\n                    document.getElementById(\"qna\").style.display = \"none\";\r\n                    document.getElementById(\"baja\").style.display = \"none\";\r\n                }\r\n                else if (elemento.value == 'b'){\r\n                    document.getElementById(\"rfcc\").style.display = \"none\";\r\n                    document.getElementById(\"qna\").style.display = \"none\";\r\n                    document.getElementById(\"baja\").style.display = \"block\";\r\n                }\r\n            }\r\n\r\n            function message(){\r\n                alert(\"Los RFC han sido seleccionados, presione ACEPTAR para generar el reporte\");\r\n            }\r\n            \r\n      </script>\r\n        \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
