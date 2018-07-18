package _web_2d_inf._jsp._reportes._constanciasueldos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _constanciaSueldos extends com.orionserver.http.OrionHttpJspPage {


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
    _constanciaSueldos page = this;
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
                __jsp_taghandler_3.setCode("sireh.label.terceros.reportes.constanciaSueldos");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path id onclick value label");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("origen");
                __jsp_taghandler_4.setId("origenRFC");
                __jsp_taghandler_4.setOnclick("toggle(this);");
                __jsp_taghandler_4.setValue("r");
                __jsp_taghandler_4.setLabel("Rfc");
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
                __jsp_taghandler_5.setId("origennUnidad");
                __jsp_taghandler_5.setOnclick("toggle(this);");
                __jsp_taghandler_5.setValue("u");
                __jsp_taghandler_5.setLabel("Unidad");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.reportes.unidad.notrequired");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_7=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setKey("0");
                __jsp_taghandler_7.setValue("selectList.nonValue");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_8=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setBeanName("tcUnidadSinCiclo");
                __jsp_taghandler_8.setPath("unidad");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.reportes.rfc");
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
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_10=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setBeanName("empleadosConstancias");
                __jsp_taghandler_10.setPath("rfcEmpleado");
                __jsp_taghandler_10.setFieldMapping("rfcEmpleado");
                __jsp_taghandler_10.setWidth("1000");
                __jsp_taghandler_10.setLeftPosition("17");
                __jsp_taghandler_10.setHeight("400");
                __jsp_taghandler_10.setTopPosition("20");
                __jsp_taghandler_10.setMaxlength("16");
                __jsp_taghandler_10.setDisabled("true");
                __jsp_taghandler_10.setSize("16");
                __jsp_taghandler_10.setTitle("Seleccione el RFC");
                __jsp_taghandler_10.setMaxRows("200");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_11=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setKey("0");
                __jsp_taghandler_11.setValue("selectList.nonValue");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_12=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setBeanName("cicloRegControlConsta");
                __jsp_taghandler_12.setPath("ciclo");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path cssClass");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setPath("firmado");
                __jsp_taghandler_13.setCssClass("uppercase");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[16]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_14.setValue("0");
                        __jsp_taghandler_14.setLabel("Seleccione...");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                          if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_14.doCatch(th);
                        } finally {
                          __jsp_taghandler_14.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                      }
                      out.write(__oracle_jsp_text[17]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_15.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_15.setValue("s");
                        __jsp_taghandler_15.setLabel("CON FIRMA");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
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
                      out.write(__oracle_jsp_text[18]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_16.setParent(__jsp_taghandler_13);
                        __jsp_taghandler_16.setValue("n");
                        __jsp_taghandler_16.setLabel("SIN FIRMA");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                          if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_16.doCatch(th);
                        } finally {
                          __jsp_taghandler_16.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
                      }
                      out.write(__oracle_jsp_text[19]);
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
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.form.required.fields");
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
                _oracle._jsp._tag._submit_tag __jsp_taghandler_18=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("muestraReporte");
                __jsp_taghandler_18.setAction("reporteCalculo/constanciaSueldosReporte.do");
                __jsp_taghandler_18.setValue("submit.accept");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_19=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPath("cancel");
                __jsp_taghandler_19.setAction("reporteCalculo/constanciaSueldos.do");
                __jsp_taghandler_19.setValue("submit.clean");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'RCF') && (reportesConstanciasDTO.ciclo!='2017') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[24]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_21=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_21.setJspContext(pageContext);
                      __jsp_taghandler_21.setName("P_CICLO");
                      __jsp_taghandler_21.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_21.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                    }
                    out.write(__oracle_jsp_text[25]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_22=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_22.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_22.setJspContext(pageContext);
                      __jsp_taghandler_22.setName("P_RFC");
                      __jsp_taghandler_22.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_22.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_23=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_23.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_23.setJspContext(pageContext);
                      __jsp_taghandler_23.setProvider("jasper");
                      __jsp_taghandler_23.setViewUri("/constanciaSueldos/constanciaSueldoCFirmaCicloRFC");
                      __jsp_taghandler_23.setImagesUri("/images/reports");
                      __jsp_taghandler_23.setFormat("pdf");
                      __jsp_taghandler_23.setFileName("constanciaSueldoCFirmaCicloRFC");
                      __jsp_taghandler_23.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_23.setWidth("1060");
                      __jsp_taghandler_23.setHeight("350");
                      __jsp_taghandler_23.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                    }
                    out.write(__oracle_jsp_text[27]);
                  } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,2);
              }
              out.write(__oracle_jsp_text[28]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'RSF') && (reportesConstanciasDTO.ciclo!='2017') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_25=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                      __jsp_taghandler_25.setJspContext(pageContext);
                      __jsp_taghandler_25.setName("P_CICLO");
                      __jsp_taghandler_25.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_25.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_26=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_26.setParent(__jsp_taghandler_24);
                      __jsp_taghandler_26.setJspContext(pageContext);
                      __jsp_taghandler_26.setName("P_RFC");
                      __jsp_taghandler_26.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_26.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_27=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_27.setParent(__jsp_taghandler_24);
                      __jsp_taghandler_27.setJspContext(pageContext);
                      __jsp_taghandler_27.setProvider("jasper");
                      __jsp_taghandler_27.setViewUri("/constanciaSueldos/constanciaSueldoSFirmaCicloRFC");
                      __jsp_taghandler_27.setImagesUri("/images/reports");
                      __jsp_taghandler_27.setFormat("pdf");
                      __jsp_taghandler_27.setFileName("constanciaSueldoSFirmaCicloRFC");
                      __jsp_taghandler_27.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_27.setWidth("1060");
                      __jsp_taghandler_27.setHeight("350");
                      __jsp_taghandler_27.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                    }
                    out.write(__oracle_jsp_text[32]);
                  } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
              }
              out.write(__oracle_jsp_text[33]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'UCF') && (reportesConstanciasDTO.ciclo!='2017') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[34]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_29=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                      __jsp_taghandler_29.setJspContext(pageContext);
                      __jsp_taghandler_29.setName("P_CICLO");
                      __jsp_taghandler_29.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_29.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                    }
                    out.write(__oracle_jsp_text[35]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_30=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_30.setParent(__jsp_taghandler_28);
                      __jsp_taghandler_30.setJspContext(pageContext);
                      __jsp_taghandler_30.setName("P_UNIDAD");
                      __jsp_taghandler_30.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.unidad}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_30.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                    }
                    out.write(__oracle_jsp_text[36]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_31=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_31.setParent(__jsp_taghandler_28);
                      __jsp_taghandler_31.setJspContext(pageContext);
                      __jsp_taghandler_31.setProvider("jasper");
                      __jsp_taghandler_31.setViewUri("/constanciaSueldos/constanciaSueldoCFirmaCicloUnidad");
                      __jsp_taghandler_31.setImagesUri("/images/reports");
                      __jsp_taghandler_31.setFormat("pdf");
                      __jsp_taghandler_31.setFileName("constanciaSueldoCFirmaCicloUnidad");
                      __jsp_taghandler_31.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_31.setWidth("1060");
                      __jsp_taghandler_31.setHeight("350");
                      __jsp_taghandler_31.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
                    }
                    out.write(__oracle_jsp_text[37]);
                  } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'USF') && (reportesConstanciasDTO.ciclo!='2017') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[39]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_33=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_33.setParent(__jsp_taghandler_32);
                      __jsp_taghandler_33.setJspContext(pageContext);
                      __jsp_taghandler_33.setName("P_CICLO");
                      __jsp_taghandler_33.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_33.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_34=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_34.setParent(__jsp_taghandler_32);
                      __jsp_taghandler_34.setJspContext(pageContext);
                      __jsp_taghandler_34.setName("P_UNIDAD");
                      __jsp_taghandler_34.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.unidad}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_34.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
                    }
                    out.write(__oracle_jsp_text[41]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_35=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_35.setParent(__jsp_taghandler_32);
                      __jsp_taghandler_35.setJspContext(pageContext);
                      __jsp_taghandler_35.setProvider("jasper");
                      __jsp_taghandler_35.setViewUri("/constanciaSueldos/constanciaSueldoSFirmaCicloUnidad");
                      __jsp_taghandler_35.setImagesUri("/images/reports");
                      __jsp_taghandler_35.setFormat("pdf");
                      __jsp_taghandler_35.setFileName("constanciaSueldoSFirmaCicloUnidad");
                      __jsp_taghandler_35.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_35.setWidth("1060");
                      __jsp_taghandler_35.setHeight("350");
                      __jsp_taghandler_35.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
                    }
                    out.write(__oracle_jsp_text[42]);
                  } while (__jsp_taghandler_32.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
              }
              out.write(__oracle_jsp_text[43]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'RCF') && (reportesConstanciasDTO.ciclo eq '2017') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[44]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_37=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                      __jsp_taghandler_37.setJspContext(pageContext);
                      __jsp_taghandler_37.setName("P_CICLO");
                      __jsp_taghandler_37.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_37.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
                    }
                    out.write(__oracle_jsp_text[45]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_38=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_38.setParent(__jsp_taghandler_36);
                      __jsp_taghandler_38.setJspContext(pageContext);
                      __jsp_taghandler_38.setName("P_RFC");
                      __jsp_taghandler_38.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_38.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
                    }
                    out.write(__oracle_jsp_text[46]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_39=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_39.setParent(__jsp_taghandler_36);
                      __jsp_taghandler_39.setJspContext(pageContext);
                      __jsp_taghandler_39.setProvider("jasper");
                      __jsp_taghandler_39.setViewUri("/constanciaSueldos/formatoConstanciaSueldos");
                      __jsp_taghandler_39.setImagesUri("/images/reports");
                      __jsp_taghandler_39.setFormat("pdf");
                      __jsp_taghandler_39.setFileName("formatoConstanciaSueldos");
                      __jsp_taghandler_39.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_39.setWidth("1060");
                      __jsp_taghandler_39.setHeight("350");
                      __jsp_taghandler_39.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
                    }
                    out.write(__oracle_jsp_text[47]);
                  } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,2);
              }
              out.write(__oracle_jsp_text[48]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'RSF') && (reportesConstanciasDTO.ciclo eq '2017') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[49]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_41=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                      __jsp_taghandler_41.setJspContext(pageContext);
                      __jsp_taghandler_41.setName("P_CICLO");
                      __jsp_taghandler_41.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_41.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
                    }
                    out.write(__oracle_jsp_text[50]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_42=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_42.setParent(__jsp_taghandler_40);
                      __jsp_taghandler_42.setJspContext(pageContext);
                      __jsp_taghandler_42.setName("P_RFC");
                      __jsp_taghandler_42.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_42.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
                    }
                    out.write(__oracle_jsp_text[51]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_43=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_43.setParent(__jsp_taghandler_40);
                      __jsp_taghandler_43.setJspContext(pageContext);
                      __jsp_taghandler_43.setProvider("jasper");
                      __jsp_taghandler_43.setViewUri("/constanciaSueldos/formatoConstanciaSueldos");
                      __jsp_taghandler_43.setImagesUri("/images/reports");
                      __jsp_taghandler_43.setFormat("pdf");
                      __jsp_taghandler_43.setFileName("formatoConstanciaSueldos");
                      __jsp_taghandler_43.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_43.setWidth("1060");
                      __jsp_taghandler_43.setHeight("350");
                      __jsp_taghandler_43.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
                    }
                    out.write(__oracle_jsp_text[52]);
                  } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,2);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_44=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'USF') && (reportesConstanciasDTO.ciclo eq '2017') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[54]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_45=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_45.setParent(__jsp_taghandler_44);
                      __jsp_taghandler_45.setJspContext(pageContext);
                      __jsp_taghandler_45.setName("P_CICLO");
                      __jsp_taghandler_45.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_45.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
                    }
                    out.write(__oracle_jsp_text[55]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_46=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_46.setParent(__jsp_taghandler_44);
                      __jsp_taghandler_46.setJspContext(pageContext);
                      __jsp_taghandler_46.setName("P_UNIDAD");
                      __jsp_taghandler_46.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.unidad}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_46.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_46, pageContext);
                    }
                    out.write(__oracle_jsp_text[56]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_47=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_47.setParent(__jsp_taghandler_44);
                      __jsp_taghandler_47.setJspContext(pageContext);
                      __jsp_taghandler_47.setProvider("jasper");
                      __jsp_taghandler_47.setViewUri("/constanciaSueldos/formatoConstanciaSueldos");
                      __jsp_taghandler_47.setImagesUri("/images/reports");
                      __jsp_taghandler_47.setFormat("pdf");
                      __jsp_taghandler_47.setFileName("formatoConstanciaSueldos");
                      __jsp_taghandler_47.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_47.setWidth("1060");
                      __jsp_taghandler_47.setHeight("350");
                      __jsp_taghandler_47.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
                    }
                    out.write(__oracle_jsp_text[57]);
                  } while (__jsp_taghandler_44.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,2);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_48=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesConstanciasDTO.muestraReporte) && (reportesConstanciasDTO.tipoReporte eq 'UCF')  && (reportesConstanciasDTO.ciclo eq '2017') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[59]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_49=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                      __jsp_taghandler_49.setJspContext(pageContext);
                      __jsp_taghandler_49.setName("P_CICLO");
                      __jsp_taghandler_49.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_49.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
                    }
                    out.write(__oracle_jsp_text[60]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_50=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_50.setParent(__jsp_taghandler_48);
                      __jsp_taghandler_50.setJspContext(pageContext);
                      __jsp_taghandler_50.setName("P_UNIDAD");
                      __jsp_taghandler_50.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesConstanciasDTO.unidad}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_50.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
                    }
                    out.write(__oracle_jsp_text[61]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_51=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_51.setParent(__jsp_taghandler_48);
                      __jsp_taghandler_51.setJspContext(pageContext);
                      __jsp_taghandler_51.setProvider("jasper");
                      __jsp_taghandler_51.setViewUri("/constanciaSueldos/formatoConstanciaSueldos");
                      __jsp_taghandler_51.setImagesUri("/images/reports");
                      __jsp_taghandler_51.setFormat("pdf");
                      __jsp_taghandler_51.setFileName("formatoConstanciaSueldos");
                      __jsp_taghandler_51.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_51.setWidth("1060");
                      __jsp_taghandler_51.setHeight("350");
                      __jsp_taghandler_51.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
                    }
                    out.write(__oracle_jsp_text[62]);
                  } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,2);
              }
              out.write(__oracle_jsp_text[63]);
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
  private static final char __oracle_jsp_text[][]=new char[64][];
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
    "\r\n    \r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[5] = 
    " &#45;\r\n            ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n        </strong>\r\n    </h1>\r\n    \r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.1em\"><strong>&nbsp;&nbsp;Tipo de reporte&nbsp;&nbsp; </strong></legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\" >\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\" width=\"20%\">* Origen</td>\r\n                            <td align=\"left\" colspan=\"2\">\r\n                                ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"3\">\r\n                                <div id=\"rfcc\" style=\"display:none\">\r\n                                    <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"right\" class=\"label\"  width=\"20%\">* ".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                                            <td align=\"left\" colspan=\"2\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </div>\r\n                                <div id=\"unidadd\"  style=\"display:none\">\r\n                                    <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                        <tr>\r\n                                            <td  align=\"right\" class=\"label\"  width=\"20%\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                                            <td align=\"left\" colspan=\"2\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                            </td> \r\n                                        </tr>\r\n                                    </table>\r\n                                </div>\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\" width=\"20%\">* Ciclo</td>\r\n                            <td align=\"left\" colspan=\"2\">\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\"  width=\"20%\">* Firma</td>\r\n                            <td align=\"left\"  colspan=\"2\">\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"left\"><strong>".toCharArray();
    __oracle_jsp_text[21] = 
    "</strong></td>\r\n                            <td align=\"center\">\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            </td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table><br/><br/>\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n        <table align=\"center\" width=\"100%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                </td>\r\n            </tr>\r\n        </table>\r\n    ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n\r\n    <script type=\"text/javascript\">\r\n        window.onload = enCargaInicial;\r\n\r\n        function toggle(elemento) {\r\n            if (elemento.value == 'u') {\r\n                //document.forms[0].getElementById(\"rfcc\").style.display = \"block\";\r\n                document.getElementById(\"rfcc\").style.display = \"block\";\r\n                document.getElementById(\"unidadd\").style.display = \"none\";\r\n            }\r\n            else if (elemento.value == 'r') {\r\n                document.getElementById(\"rfcc\").style.display = \"none\";\r\n                document.getElementById(\"unidadd\").style.display = \"block\";\r\n            }\r\n        }\r\n\r\n        function enCargaInicial() {\r\n            if (document.getElementById(\"origenRFC\").checked) {\r\n                document.getElementById(\"rfcc\").style.display = \"none\";\r\n                document.getElementById(\"unidadd\").style.display = \"block\";\r\n            }\r\n            if (document.getElementById(\"origennUnidad\").checked) {\r\n                document.getElementById(\"rfcc\").style.display = \"block\";\r\n                document.getElementById(\"unidadd\").style.display = \"none\";\r\n            }\r\n        }\r\n    </script>\r\n\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
