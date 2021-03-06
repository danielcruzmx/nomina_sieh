package _web_2d_inf._jsp._reportes._incidencias;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _movsIntInc extends com.orionserver.http.OrionHttpJspPage {


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
    _movsIntInc page = this;
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
                __jsp_taghandler_3.setCode("sireh.label.terceros.reportes.incidencias.personal");
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
                __jsp_taghandler_4.setCode("sireh.label.terceros.reportes.incidencias.personal.movsInternos");
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
                __jsp_taghandler_5.setId("origenRFC");
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
                __jsp_taghandler_6.setId("origennUnidad");
                __jsp_taghandler_6.setOnclick("toggle(this); ");
                __jsp_taghandler_6.setValue("u");
                __jsp_taghandler_6.setLabel("Unidad");
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
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setCode("sireh.label.reportes.unidad.notrequired");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_8=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setKey("0");
                __jsp_taghandler_8.setValue("selectList.nonValue");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_9=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setBeanName("tcUnidadSinCiclo");
                __jsp_taghandler_9.setPath("unidad");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.reportes.rfc");
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
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_11=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setBeanName("EmpleadosDetalle");
                __jsp_taghandler_11.setPath("rfcEmpleado");
                __jsp_taghandler_11.setFieldMapping("rfcEmpleado");
                __jsp_taghandler_11.setWidth("1000");
                __jsp_taghandler_11.setLeftPosition("17");
                __jsp_taghandler_11.setHeight("400");
                __jsp_taghandler_11.setTopPosition("20");
                __jsp_taghandler_11.setMaxlength("16");
                __jsp_taghandler_11.setDisabled("true");
                __jsp_taghandler_11.setSize("16");
                __jsp_taghandler_11.setTitle("Seleccione el RFC");
                __jsp_taghandler_11.setMaxRows("200");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_12=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setKey("0");
                __jsp_taghandler_12.setValue("selectList.nonValue");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_13=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setBeanName("listaQuincenasAnteriores");
                __jsp_taghandler_13.setPath("qnaIni");
                __jsp_taghandler_13.setProgress("true");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
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
                __jsp_taghandler_15.setBeanName("listaQuincenasAnterioresFinales");
                __jsp_taghandler_15.setPath("qnaFin");
                __jsp_taghandler_15.setParentPath("qnaIni");
                __jsp_taghandler_15.setProgress("true");
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
                __jsp_taghandler_17.setAction("reporteCalculo/movsInternosIncidencias.do");
                __jsp_taghandler_17.setValue("submit.accept");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_18=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("cancel");
                __jsp_taghandler_18.setAction("reporteCalculo/movsInternosIncidencias.do");
                __jsp_taghandler_18.setValue("submit.clean");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.origen eq 'r') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[22]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_20=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_20.setJspContext(pageContext);
                      __jsp_taghandler_20.setName("P_QNA_INI");
                      __jsp_taghandler_20.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.qnaIni}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_20.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
                    }
                    out.write(__oracle_jsp_text[23]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_21=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_21.setJspContext(pageContext);
                      __jsp_taghandler_21.setName("P_QNA_FIN");
                      __jsp_taghandler_21.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.qnaFin}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_21.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                    }
                    out.write(__oracle_jsp_text[24]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_22=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_22.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_22.setJspContext(pageContext);
                      __jsp_taghandler_22.setName("P_RFC");
                      __jsp_taghandler_22.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_22.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                    }
                    out.write(__oracle_jsp_text[25]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_23=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_23.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_23.setJspContext(pageContext);
                      __jsp_taghandler_23.setProvider("jasper");
                      __jsp_taghandler_23.setViewUri("/incidenciasPersonal/movimientosinternosrfc");
                      __jsp_taghandler_23.setImagesUri("/images/reports");
                      __jsp_taghandler_23.setFormat("pdf");
                      __jsp_taghandler_23.setFileName("movimientosinternosrfc");
                      __jsp_taghandler_23.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_23.setWidth("1060");
                      __jsp_taghandler_23.setHeight("350");
                      __jsp_taghandler_23.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                    }
                    out.write(__oracle_jsp_text[26]);
                  } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.origen eq 'u') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[28]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_25=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                      __jsp_taghandler_25.setJspContext(pageContext);
                      __jsp_taghandler_25.setName("P_QNA_INI");
                      __jsp_taghandler_25.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.qnaIni}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_25.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                    }
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_26=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_26.setParent(__jsp_taghandler_24);
                      __jsp_taghandler_26.setJspContext(pageContext);
                      __jsp_taghandler_26.setName("P_QNA_FIN");
                      __jsp_taghandler_26.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.qnaFin}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_26.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_27=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_27.setParent(__jsp_taghandler_24);
                      __jsp_taghandler_27.setJspContext(pageContext);
                      __jsp_taghandler_27.setName("P_UNIDAD");
                      __jsp_taghandler_27.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.unidad}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_27.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_28=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_28.setParent(__jsp_taghandler_24);
                      __jsp_taghandler_28.setJspContext(pageContext);
                      __jsp_taghandler_28.setProvider("jasper");
                      __jsp_taghandler_28.setViewUri("/incidenciasPersonal/movimientosinternosunidad");
                      __jsp_taghandler_28.setImagesUri("/images/reports");
                      __jsp_taghandler_28.setFormat("pdf");
                      __jsp_taghandler_28.setFileName("movimientosinternosunidad");
                      __jsp_taghandler_28.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_28.setWidth("1060");
                      __jsp_taghandler_28.setHeight("350");
                      __jsp_taghandler_28.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                    }
                    out.write(__oracle_jsp_text[32]);
                  } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
              }
              out.write(__oracle_jsp_text[33]);
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
  private static final char __oracle_jsp_text[][]=new char[34][];
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
    " &#45;\r\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n        </strong>\r\n    </h1>\r\n    \r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.1em\"><strong>&nbsp;&nbsp;Tipo de reporte&nbsp;&nbsp; </strong></legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\" >\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\" width=\"20%\">* Origen</td>\r\n                            <td align=\"left\" colspan=\"2\">\r\n                                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"3\">\r\n                                <div id=\"rfcc\" style=\"display:none\">\r\n                                    <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"right\" class=\"label\"  width=\"20%\"> ".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                                            <td align=\"left\" colspan=\"2\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </div>\r\n                                <div id=\"unidadd\"  style=\"display:none\">\r\n                                    <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                        <tr>\r\n                                            <td  align=\"right\" class=\"label\"  width=\"20%\">".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                                            <td align=\"left\"  colspan=\"2\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                                            </td> \r\n                                        </tr>\r\n                                    </table>\r\n                                </div>\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\" width=\"20%\">* Quincena inicial</td>\r\n                            <td align=\"left\" colspan=\"2\">\r\n                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\"  width=\"20%\">* Quincena final</td>\r\n                            <td align=\"left\"  colspan=\"2\">\r\n                                 ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                 ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"left\"><strong>".toCharArray();
    __oracle_jsp_text[19] = 
    "</strong></td>\r\n                            <td align=\"center\">".toCharArray();
    __oracle_jsp_text[20] = 
    " </td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table><br/><br/>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n     \r\n    <script type=\"text/javascript\">\r\n        window.onload = enCargaInicial;\r\n        \r\n        function toggle(elemento){\r\n            if(elemento.value == 'u'){\r\n                //document.forms[0].getElementById(\"rfcc\").style.display = \"block\";\r\n                document.getElementById(\"rfcc\").style.display = \"block\";\r\n                document.getElementById(\"unidadd\").style.display = \"none\";\r\n            }\r\n            else if(elemento.value == 'r'){\r\n                document.getElementById(\"rfcc\").style.display = \"none\";\r\n                document.getElementById(\"unidadd\").style.display = \"block\";\r\n            }\r\n        }\r\n        \r\n        function enCargaInicial(){\r\n            if(document.getElementById(\"origenRFC\").checked){\r\n                document.getElementById(\"rfcc\").style.display = \"none\";\r\n                document.getElementById(\"unidadd\").style.display = \"block\";\r\n            }\r\n            if(document.getElementById(\"origennUnidad\").checked){\r\n                document.getElementById(\"rfcc\").style.display = \"block\";\r\n                document.getElementById(\"unidadd\").style.display = \"none\";\r\n            }\r\n            \r\n            \r\n        }\r\n    </script>\r\n        \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
