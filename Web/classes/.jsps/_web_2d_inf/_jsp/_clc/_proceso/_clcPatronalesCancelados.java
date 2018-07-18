package _web_2d_inf._jsp._clc._proceso;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _clcPatronalesCancelados extends com.orionserver.http.OrionHttpJspPage {


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
    _clcPatronalesCancelados page = this;
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
        __jsp_taghandler_1.setModelAttribute("clcPatronalesCanceladosDTO");
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
                __jsp_taghandler_4.setCode("sireh.label.clc.proceso.clcPatronalesCancelados.titulo");
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
                __jsp_taghandler_5.setCode("sireh.label.clc.proceso.clcPatronalesCancelados.ciclo");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_6=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setJspContext(pageContext);
                __jsp_taghandler_6.setKey("");
                __jsp_taghandler_6.setValue("selectList.nonValue");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_7=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setBeanName("tdCxlcCicloBusquedaCancelados");
                __jsp_taghandler_7.setPath("ciclo");
                __jsp_taghandler_7.setProgress("true");
                __jsp_taghandler_7.setStyle("width: 200px;");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.clc.proceso.clcPatronalesCancelados.quincenaPago");
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
                __jsp_taghandler_9.setKey("");
                __jsp_taghandler_9.setValue("selectList.nonValue");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_10=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setBeanName("tdCxlcQnaPagoBusquedaCancelados");
                __jsp_taghandler_10.setPath("quincena");
                __jsp_taghandler_10.setParentPath("ciclo");
                __jsp_taghandler_10.setProgress("true");
                __jsp_taghandler_10.setStyle("width: 200px;");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.clc.proceso.clcPatronalesCancelados.complemento");
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
                __jsp_taghandler_13.setBeanName("tdCxlcComplementoBusquedaCancelados");
                __jsp_taghandler_13.setPath("complemento");
                __jsp_taghandler_13.setParentPath("quincena");
                __jsp_taghandler_13.setProgress("true");
                __jsp_taghandler_13.setStyle("width: 200px;");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.clc.proceso.clcPatronalesCancelados.tipoNominaPatronales");
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
                __jsp_taghandler_16.setBeanName("tdCxlcTipoNominaBusquedaPatronalesAjustes");
                __jsp_taghandler_16.setPath("tipoNominaPatronales");
                __jsp_taghandler_16.setParentPath("complemento");
                __jsp_taghandler_16.setProgress("true");
                __jsp_taghandler_16.setFilterPaths("ciclo,quincena");
                __jsp_taghandler_16.setStyle("width: 200px;");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.clc.proceso.clcPatronalesCancelados.clc");
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
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_18=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setBeanName("tdCxlcBusquedaPatronalesCancelados");
                __jsp_taghandler_18.setPath("clcCancelacion");
                __jsp_taghandler_18.setParentPath("tipoNominaPatronales");
                __jsp_taghandler_18.setProgress("true");
                __jsp_taghandler_18.setFilterPaths("ciclo,quincena,complemento");
                __jsp_taghandler_18.setStyle("width: 200px;");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.clc.proceso.clcPatronales.estado");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                  if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_19.doCatch(th);
                } finally {
                  __jsp_taghandler_19.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_20=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setKey("");
                __jsp_taghandler_20.setValue("selectList.nonValue");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_21=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setBeanName("tcEstadoProcesaPatronalesCancelados");
                __jsp_taghandler_21.setPath("estado");
                __jsp_taghandler_21.setProgress("true");
                __jsp_taghandler_21.setStyle("width: 200px;");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setCode("sireh.label.clc.proceso.clcPatronalesCancelados.quincenaCancelacion");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                  if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_22.doCatch(th);
                } finally {
                  __jsp_taghandler_22.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write(__oracle_jsp_text[26]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_23=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setKey("");
                __jsp_taghandler_23.setValue("selectList.nonValue");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[27]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_24=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setBeanName("tnCapturaPagoCancBusquedaCancelados");
                __jsp_taghandler_24.setPath("qnaCancelacion");
                __jsp_taghandler_24.setProgress("true");
                __jsp_taghandler_24.setStyle("width: 200px;");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_25=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setPath("busquedaClc");
                __jsp_taghandler_25.setAction("clcProcesoPatronales/clcPatronalesCancelados.do");
                __jsp_taghandler_25.setValue("submit.search");
                __jsp_taghandler_25.setProgressBar("true");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_26=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setPath("cancel");
                __jsp_taghandler_26.setAction("clcProcesoPatronales/clcPatronalesCancelados.do");
                __jsp_taghandler_26.setValue("submit.cancel");
                __jsp_taghandler_26.setProgressBar("true");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[31]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                      __jsp_taghandler_28.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.busquedaClc}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[32]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_29=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_29.setJspContext(pageContext);
                            __jsp_taghandler_29.setProperty("P.CPC_QNA_APLICA");
                            __jsp_taghandler_29.setCondition("IN");
                            __jsp_taghandler_29.setPath("quincenasList");
                            __jsp_taghandler_29.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                          }
                          out.write(__oracle_jsp_text[33]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_30=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_30.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_30.setJspContext(pageContext);
                            __jsp_taghandler_30.setProperty("C.ID_CPTO_PAGO");
                            __jsp_taghandler_30.setCondition("IN");
                            __jsp_taghandler_30.setPath("conceptoPagoList");
                            __jsp_taghandler_30.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                          }
                          out.write(__oracle_jsp_text[34]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_31.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_31.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.tipoNominaPatronales == 'N2'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[35]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_32=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                                  __jsp_taghandler_32.setJspContext(pageContext);
                                  __jsp_taghandler_32.setProperty("H.ID_EDO_NOM");
                                  __jsp_taghandler_32.setCondition("=");
                                  __jsp_taghandler_32.setPath("estado");
                                  __jsp_taghandler_32.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
                                }
                                out.write(__oracle_jsp_text[36]);
                              } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,4);
                          }
                          out.write(__oracle_jsp_text[37]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_33=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_33.setParent(__jsp_taghandler_28);
                            __jsp_taghandler_33.setJspContext(pageContext);
                            __jsp_taghandler_33.setBeanName("canceladosProcesaTerceros");
                            __jsp_taghandler_33.setBaseUrl("clcPatronalesCancelados");
                            __jsp_taghandler_33.setAppendFilters("false");
                            __jsp_taghandler_33.setCheckbox("true");
                            __jsp_taghandler_33.setChkProperty("folioGrupo");
                            __jsp_taghandler_33.setJspBody(new _clcPatronalesCancelados_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_33, __ojsp_varRes));
                            __jsp_taghandler_33.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
                          }
                          out.write(__oracle_jsp_text[38]);
                          out.write(__oracle_jsp_text[39]);
                        } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,3);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_61=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_61.setParent(__jsp_taghandler_27);
                      __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[41]);
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
                          out.write(__oracle_jsp_text[42]);
                        } while (__jsp_taghandler_61.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,3);
                    }
                    out.write(__oracle_jsp_text[43]);
                  } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
              }
              out.write(__oracle_jsp_text[44]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_63=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.muestraErrores}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[45]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_64=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_64.setParent(__jsp_taghandler_63);
                      __jsp_taghandler_64.setJspContext(pageContext);
                      __jsp_taghandler_64.setProperty("E.CE_CICLO");
                      __jsp_taghandler_64.setCondition("=");
                      __jsp_taghandler_64.setPath("ciclo");
                      __jsp_taghandler_64.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_64, pageContext);
                    }
                    out.write(__oracle_jsp_text[46]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_65=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_65.setParent(__jsp_taghandler_63);
                      __jsp_taghandler_65.setJspContext(pageContext);
                      __jsp_taghandler_65.setProperty("E.CE_QNA_PAGO");
                      __jsp_taghandler_65.setCondition("=");
                      __jsp_taghandler_65.setPath("qnaCancelacion");
                      __jsp_taghandler_65.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_65, pageContext);
                    }
                    out.write(__oracle_jsp_text[47]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_66=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_66.setParent(__jsp_taghandler_63);
                      __jsp_taghandler_66.setJspContext(pageContext);
                      __jsp_taghandler_66.setProperty("E.ID_TIPO_NOMINA");
                      __jsp_taghandler_66.setCondition("=");
                      __jsp_taghandler_66.setPath("tipoNominaPatronales");
                      __jsp_taghandler_66.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
                    }
                    out.write(__oracle_jsp_text[48]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_67=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_67.setParent(__jsp_taghandler_63);
                      __jsp_taghandler_67.setJspContext(pageContext);
                      __jsp_taghandler_67.setProperty("E.CE_COMPLEMENTO");
                      __jsp_taghandler_67.setCondition("=");
                      __jsp_taghandler_67.setPath("complemento");
                      __jsp_taghandler_67.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_67, pageContext);
                    }
                    out.write(__oracle_jsp_text[49]);
                    {
                      _oracle._jsp._tag._pagedList_tag __jsp_taghandler_68=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                      __jsp_taghandler_68.setParent(__jsp_taghandler_63);
                      __jsp_taghandler_68.setJspContext(pageContext);
                      __jsp_taghandler_68.setBeanName("clcPatronalesErrores");
                      __jsp_taghandler_68.setBaseUrl("clcPatronalesCancelados");
                      __jsp_taghandler_68.setAppendFilters("false");
                      __jsp_taghandler_68.setJspBody(new _clcPatronalesCancelados_OjspFragmentSupport( 1, pageContext, __jsp_taghandler_68, __ojsp_varRes));
                      __jsp_taghandler_68.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
                    }
                    out.write(__oracle_jsp_text[50]);
                  } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_89=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_89.setParent(__jsp_taghandler_1);
                __jsp_taghandler_89.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                  if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_89.doCatch(th);
                } finally {
                  __jsp_taghandler_89.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89,2);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_90=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_90.setParent(__jsp_taghandler_1);
                __jsp_taghandler_90.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.muestraErrores}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[53]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_91=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_91.setParent(__jsp_taghandler_90);
                      __jsp_taghandler_91.setJspContext(pageContext);
                      __jsp_taghandler_91.setAction("clcProcesoPatronales/marcaRevisadoExisteErrorPatronalesCancelados");
                      __jsp_taghandler_91.setValue("submit.revisarErrores");
                      __jsp_taghandler_91.setProgressBar("true");
                      __jsp_taghandler_91.setAlertCode("confirm.clc.proceso.terceros.revisar");
                      __jsp_taghandler_91.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_91, pageContext);
                    }
                    out.write(__oracle_jsp_text[54]);
                  } while (__jsp_taghandler_90.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90,2);
              }
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_92=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_92.setParent(__jsp_taghandler_1);
                __jsp_taghandler_92.setJspContext(pageContext);
                __jsp_taghandler_92.setAction("clcProcesoPatronales/executeProcedureAplicaCxlcCancelado");
                __jsp_taghandler_92.setValue("submit.aplicaCancelados");
                __jsp_taghandler_92.setProgressBar("true");
                __jsp_taghandler_92.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_92, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_93=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_93.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[57]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_94=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_94.setParent(__jsp_taghandler_93);
                      __jsp_taghandler_94.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.busquedaDisabled}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[58]);
                        } while (__jsp_taghandler_94.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94,3);
                    }
                    out.write(__oracle_jsp_text[59]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_95=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_95.setParent(__jsp_taghandler_93);
                      __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[60]);
                        } while (__jsp_taghandler_95.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95,3);
                    }
                    out.write(__oracle_jsp_text[61]);
                  } while (__jsp_taghandler_93.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93,2);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_96=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_96.setParent(__jsp_taghandler_1);
                __jsp_taghandler_96.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.ciclo}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_96.doStartTag();
                if (__jsp_taghandler_96.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_96,2);
              }
              out.write(__oracle_jsp_text[63]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_97=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_97.setParent(__jsp_taghandler_1);
                __jsp_taghandler_97.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.clcCancelacion}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_97.doStartTag();
                if (__jsp_taghandler_97.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_97,2);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_98=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_98.setParent(__jsp_taghandler_1);
                __jsp_taghandler_98.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.ciclo}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_98.doStartTag();
                if (__jsp_taghandler_98.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_98,2);
              }
              out.write(__oracle_jsp_text[65]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_99=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_99.setParent(__jsp_taghandler_1);
                __jsp_taghandler_99.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.clcCancelacion}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_99.doStartTag();
                if (__jsp_taghandler_99.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_99,2);
              }
              out.write(__oracle_jsp_text[66]);
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

  private class _clcPatronalesCancelados_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _clcPatronalesCancelados_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_33       = parent;
      out.write("\r\n                                                                                           \r\n                                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_34=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_34.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_33));
        __jsp_taghandler_34.setName("canceladosProcesaTerceros");
        __jsp_taghandler_34.setPagesize(200);
        __jsp_taghandler_34.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_34.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_34.setClass("displaytag");
        __jsp_taghandler_34.setExport(true);
        __jsp_taghandler_34.setUid("row");
        __jsp_taghandler_34.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_34,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                                        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                __jsp_taghandler_35.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.compensadaGrupo");
                __jsp_taghandler_35.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_35,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                            ");
                      {
                        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                        __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                                ");
                            {
                              org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                              __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_37.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.aplicado == 2}",java.lang.Boolean.class, __ojsp_varRes,null)));
                              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write("\r\n                                                    <input name=\"compensadaGrupo\" \r\n                                                           class=\"boxCompensada\"\r\n                                                           type=\"checkbox\" \r\n                                                           value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                                    __jsp_taghandler_38.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.ciclo}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.clcCancelacion}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.hpFolio}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.hpDifFolio}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idTipoCpto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idCptoPago}",java.lang.String.class, __ojsp_varRes, null)+"|2201|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.monto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idUnidad}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idGrupopagoNom}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idEdoNom}",java.lang.String.class, __ojsp_varRes, null)));
                                    __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                    if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,9);
                                  }
                                  out.write("\"\r\n                                                           title=\"Este cheque ya esta aplicado\"\r\n                                                           disabled=\"\"/>\r\n                                                ");
                                } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,8);
                            }
                            out.write("\r\n                                                ");
                            {
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                              __jsp_taghandler_39.setParent(__jsp_taghandler_36);
                              __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write("\r\n                                                    <input name=\"compensadaGrupo\" \r\n                                                           class=\"boxCompensada\"\r\n                                                           type=\"checkbox\" \r\n                                                           value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                                    __jsp_taghandler_40.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.ciclo}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcPatronalesCanceladosDTO.clcCancelacion}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.hpFolio}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.hpDifFolio}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idTipoCpto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idCptoPago}",java.lang.String.class, __ojsp_varRes, null)+"|2201|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.monto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idUnidad}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idGrupopagoNom}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idEdoNom}",java.lang.String.class, __ojsp_varRes, null)));
                                    __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                                    if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,9);
                                  }
                                  out.write("\"/>\r\n                                                ");
                                } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,8);
                            }
                            out.write("\r\n                                            ");
                          } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,7);
                      }
                      out.write("\r\n                                            <input name=\"compensadaGrupoArrayValores\" \r\n                                                   type=\"checkbox\"\r\n                                                   style=\"display:none\"\r\n                                                   value=\"");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_41.setParent(__jsp_taghandler_35);
                        __jsp_taghandler_41.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.hpFolio}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.hpDifFolio}",java.lang.String.class, __ojsp_varRes, null)+"|2201|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idCptoPago}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idTipoCpto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.monto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idUnidad}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idGrupopagoNom}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idEdoNom}",java.lang.String.class, __ojsp_varRes, null)));
                        __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                        if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,7);
                      }
                      out.write("\"/>\r\n                                        ");
                    } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
              }
              out.write("\r\n                                        \r\n                                        ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_42.setParent(__jsp_taghandler_34);
                __jsp_taghandler_42.setVar("rojo");
                __jsp_taghandler_42.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.aplicado == 2 ? 'color: red;' : ''}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
              }
              out.write("\r\n                                        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_43=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_43.setParent(__jsp_taghandler_34);
                __jsp_taghandler_43.setProperty("hpFolio");
                __jsp_taghandler_43.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.folioGrupo");
                __jsp_taghandler_43.setSortable(true);
                __jsp_taghandler_43.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_44=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_44.setParent(__jsp_taghandler_34);
                __jsp_taghandler_44.setProperty("hpDifFolio");
                __jsp_taghandler_44.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.hpDifFolio");
                __jsp_taghandler_44.setSortable(true);
                __jsp_taghandler_44.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,6);
              }
              out.write("\r\n                                                        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_45.setParent(__jsp_taghandler_34);
                __jsp_taghandler_45.setProperty("cpcQnaAplica");
                __jsp_taghandler_45.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.quincenaAplica");
                __jsp_taghandler_45.setSortable(true);
                __jsp_taghandler_45.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_46=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_46.setParent(__jsp_taghandler_34);
                __jsp_taghandler_46.setProperty("hpNumComplem");
                __jsp_taghandler_46.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.hpNumComplem");
                __jsp_taghandler_46.setSortable(true);
                __jsp_taghandler_46.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_34);
                __jsp_taghandler_47.setProperty("idUnidad");
                __jsp_taghandler_47.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.idUnidad");
                __jsp_taghandler_47.setSortable(true);
                __jsp_taghandler_47.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_34);
                __jsp_taghandler_48.setProperty("idEdoNom");
                __jsp_taghandler_48.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.idEdoNom");
                __jsp_taghandler_48.setSortable(true);
                __jsp_taghandler_48.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_49=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_49.setParent(__jsp_taghandler_34);
                __jsp_taghandler_49.setProperty("idTipoCpto");
                __jsp_taghandler_49.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.tipoConcepto");
                __jsp_taghandler_49.setSortable(true);
                __jsp_taghandler_49.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_50=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_50.setParent(__jsp_taghandler_34);
                __jsp_taghandler_50.setProperty("idCptoPago");
                __jsp_taghandler_50.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.conceptoPago");
                __jsp_taghandler_50.setSortable(true);
                __jsp_taghandler_50.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,6);
              }
              out.write("        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style value");
                __jsp_taghandler_51.setParent(__jsp_taghandler_34);
                __jsp_taghandler_51.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.guiaContable");
                __jsp_taghandler_51.setSortable(true);
                __jsp_taghandler_51.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_51.setValue("2201");
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_52=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_52.setParent(__jsp_taghandler_34);
                __jsp_taghandler_52.setProperty("idGrupopagoNom");
                __jsp_taghandler_52.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.grupoPago");
                __jsp_taghandler_52.setSortable(true);
                __jsp_taghandler_52.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_53=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format class style");
                __jsp_taghandler_53.setParent(__jsp_taghandler_34);
                __jsp_taghandler_53.setProperty("monto");
                __jsp_taghandler_53.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.monto");
                __jsp_taghandler_53.setSortable(true);
                __jsp_taghandler_53.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_53.setClass("amount");
                __jsp_taghandler_53.setStyle((java.lang.String) ("text-align: right; "+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_54=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_54.setParent(__jsp_taghandler_34);
                __jsp_taghandler_54.setProperty("cpcAtentaNota");
                __jsp_taghandler_54.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.atentaNota");
                __jsp_taghandler_54.setSortable(true);
                __jsp_taghandler_54.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,6);
              }
              out.write("\r\n                                        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_34);
                __jsp_taghandler_55.setTitleKey("sireh.label.clc.proceso.clcPatronales.quincenas.aplicado");
                __jsp_taghandler_55.setSortable(true);
                __jsp_taghandler_55.setStyle((java.lang.String) ("text-align: center; "+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_55,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                            ");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_56=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_56.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_56.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.aplicado == 2 ? 'Aplicado' : 'No Aplicado'}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                        if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,7);
                      }
                      out.write("\r\n                                        ");
                    } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,6);
              }
              out.write("\r\n                                \r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_57=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_57.setParent(__jsp_taghandler_34);
                __jsp_taghandler_57.setName("paging.banner.placement");
                __jsp_taghandler_57.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_58=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_58.setParent(__jsp_taghandler_34);
                __jsp_taghandler_58.setName("export.pdf");
                __jsp_taghandler_58.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_59=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_59.setParent(__jsp_taghandler_34);
                __jsp_taghandler_59.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_59,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
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
                      out.write("<br><br></span>\r\n                                        ");
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
              out.write("\r\n                                    ");
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
      out.write("\r\n                                ");
      return;
    }

      
    public void invoke1(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_68       = parent;
      out.write("\r\n                               \r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_69=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_69.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_68));
        __jsp_taghandler_69.setName("clcPatronalesErrores");
        __jsp_taghandler_69.setPagesize(10);
        __jsp_taghandler_69.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_69.setClass("displaytag");
        __jsp_taghandler_69.setExport(true);
        __jsp_taghandler_69.setUid("row3");
        __jsp_taghandler_69.setSort("list");
        java.lang.Object row3 = null;
        java.lang.Integer row3_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_69,__jsp_tag_starteval,out);
            do {
              row3 = (java.lang.Object) pageContext.findAttribute("row3");
              row3_rowNum = (java.lang.Integer) pageContext.findAttribute("row3_rowNum");
              out.write("\r\n                                       \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_70=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_70.setParent(__jsp_taghandler_69);
                __jsp_taghandler_70.setProperty("ceSecuencia");
                __jsp_taghandler_70.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.id");
                __jsp_taghandler_70.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_71=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_71.setParent(__jsp_taghandler_69);
                __jsp_taghandler_71.setProperty("ceCiclo");
                __jsp_taghandler_71.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.ciclo");
                __jsp_taghandler_71.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_72=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_72.setParent(__jsp_taghandler_69);
                __jsp_taghandler_72.setProperty("ceQnaPago");
                __jsp_taghandler_72.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.quincenaPago");
                __jsp_taghandler_72.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,5);
              }
              out.write("          \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_73=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_73.setParent(__jsp_taghandler_69);
                __jsp_taghandler_73.setProperty("idTipoNomina");
                __jsp_taghandler_73.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.tipoNomina");
                __jsp_taghandler_73.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_74=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_74.setParent(__jsp_taghandler_69);
                __jsp_taghandler_74.setProperty("ceComplemento");
                __jsp_taghandler_74.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.complemento");
                __jsp_taghandler_74.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_75=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_75.setParent(__jsp_taghandler_69);
                __jsp_taghandler_75.setProperty("descError");
                __jsp_taghandler_75.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.descError");
                __jsp_taghandler_75.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_76=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_76.setParent(__jsp_taghandler_69);
                __jsp_taghandler_76.setProperty("idFolio");
                __jsp_taghandler_76.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.folio");
                __jsp_taghandler_76.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_77=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_77.setParent(__jsp_taghandler_69);
                __jsp_taghandler_77.setProperty("idTipoCpto");
                __jsp_taghandler_77.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.tipoConcepto");
                __jsp_taghandler_77.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_78=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_78.setParent(__jsp_taghandler_69);
                __jsp_taghandler_78.setProperty("idCptoPago");
                __jsp_taghandler_78.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.conceptoPago");
                __jsp_taghandler_78.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_79=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_79.setParent(__jsp_taghandler_69);
                __jsp_taghandler_79.setProperty("idUnidadNom");
                __jsp_taghandler_79.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.unidad");
                __jsp_taghandler_79.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_80=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_80.setParent(__jsp_taghandler_69);
                __jsp_taghandler_80.setProperty("idEdo");
                __jsp_taghandler_80.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.estado");
                __jsp_taghandler_80.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_81=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_81.setParent(__jsp_taghandler_69);
                __jsp_taghandler_81.setProperty("ceMonto");
                __jsp_taghandler_81.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.monto");
                __jsp_taghandler_81.setSortable(true);
                __jsp_taghandler_81.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_81.setStyle("text-align:right");
                __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_82=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_82.setParent(__jsp_taghandler_69);
                __jsp_taghandler_82.setProperty("revisado");
                __jsp_taghandler_82.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.revisado");
                __jsp_taghandler_82.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_83=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_83.setParent(__jsp_taghandler_69);
                __jsp_taghandler_83.setProperty("usuario");
                __jsp_taghandler_83.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.usuario");
                __jsp_taghandler_83.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_84=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_84.setParent(__jsp_taghandler_69);
                __jsp_taghandler_84.setProperty("fecModifico");
                __jsp_taghandler_84.setTitleKey("sireh.label.clc.proceso.clcPatronales.errores.fecha");
                __jsp_taghandler_84.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,5);
              }
              out.write("\r\n                                        \r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_85=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_85.setParent(__jsp_taghandler_69);
                __jsp_taghandler_85.setName("paging.banner.placement");
                __jsp_taghandler_85.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_86=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_86.setParent(__jsp_taghandler_69);
                __jsp_taghandler_86.setName("export.pdf");
                __jsp_taghandler_86.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_87=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_87.setParent(__jsp_taghandler_69);
                __jsp_taghandler_87.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_87,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_88=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_88.setParent(__jsp_taghandler_87);
                        __jsp_taghandler_88.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                          if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_88.doCatch(th);
                        } finally {
                          __jsp_taghandler_88.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88,6);
                      }
                      out.write("<br><br></span>\r\n                        ");
                    } while (__jsp_taghandler_87.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87,5);
              }
              out.write("\r\n                    ");
            } while (__jsp_taghandler_69.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,4);
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

  private static final char __oracle_jsp_text[][]=new char[67][];
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
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"100%\">        \r\n        <tr valign=\"top\">\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp; Criterios de b&uacute;squeda &nbsp;&nbsp;</strong>\r\n                    </legend>\r\n                    <table>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td height=\"10px\" colspan=\"2\"></td>\r\n                        </tr>\r\n                        \r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                \r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td height=\"10px\" colspan=\"2\"></td>\r\n                        </tr>\r\n                        \r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"left\" height=\"20px\" valign=\"middle\"> &nbsp; </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[29] = 
    " &nbsp; \r\n                            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n                \r\n    <br/>\r\n    <table align=\"center\" width=\"100%\">\r\n        <tr valign=\"top\">\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp; Recuperaciones &nbsp;&nbsp;</strong>\r\n                    </legend>\r\n                    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                \r\n                            ".toCharArray();
    __oracle_jsp_text[33] = 
    "                           \r\n                            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                            \r\n                            <table align=\"center\" width=\"100%\">\r\n                                <tr>\r\n                                    <td height=\"20px\"> &nbsp; </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td align=\"right\" height=\"10px\" valign=\"middle\">\r\n                                        <b>Seleccione una opci&oacute;n:</b><br/>\r\n                                        <a href=\"javascript:checkAll()\">+ Seleccionar Todos</a><br/>\r\n                                        <a href=\"javascript:uncheckAll()\">- Ninguno</a>\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                            <div id=\"displayTagDiv\" style=\"width:1000px;height:300px;overflow:auto;\">\r\n                                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                            </div>\r\n                            \r\n                            <table align=\"center\" width=\"100%\">\r\n                                <tr>\r\n                                    <td align=\"left\" height=\"10px\" valign=\"middle\"> &nbsp; </td>\r\n                                </tr>\r\n                                <tr valign=\"top\">\r\n                                    <td align=\"right\">\r\n                                        <span id=\"montoTotalCompensada\" style=\"font-size:2em\">Total compensada: $ 0.00</span>\r\n                                    </td>\r\n                                </tr>\r\n                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                <tr>\r\n                                    <td height=\"20px\"> &nbsp; </td>\r\n                                </tr>\r\n                            </table>\r\n                        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[42] = 
    "<br><br></span>\r\n                        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n        <br/>\r\n        <fieldset>\r\n            <legend style=\"font-size:1.3em\">\r\n                <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>\r\n            </legend>\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n            \r\n            <div id=\"displayTagDiv3\">\r\n                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n            </div>\r\n        </fieldset>\r\n    ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n    \r\n    <table align=\"left\" width=\"100%\">\r\n        <tr>\r\n            <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                <strong>\r\n                    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                </strong>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[54] = 
    " &nbsp; \r\n                            ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n            <script type=\"text/javascript\">\r\n                $j(\"#10001\").prop(\"disabled\",true);\r\n            </script>\r\n        ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n            <script type=\"text/javascript\">\r\n                $j(\"#10001\").prop(\"disabled\",false);\r\n            </script>\r\n        ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j('.boxCompensada').change(function(){\r\n            var total = 0;\r\n            var compensadaGrupo = window.document.getElementsByName('compensadaGrupo');\r\n            var compensadaGrupoArrayValores = window.document.getElementsByName('compensadaGrupoArrayValores');\r\n                \r\n            $j('.boxCompensada').each(function(){\r\n                for(var i = 0; i < compensadaGrupo.length; i++) {\r\n                    if (compensadaGrupo[i].checked == true) {\r\n                        compensadaGrupoArrayValores[i].checked = true;\r\n                    } else {\r\n                        compensadaGrupoArrayValores[i].checked = false;\r\n                    }\r\n                }\r\n            });\r\n            \r\n            $j('.boxCompensada:checked').each(function(){\r\n                for(var i = 0; i < compensadaGrupo.length; i++) {\r\n                    if (compensadaGrupo[i].checked == true) {\r\n                        compensadaGrupoArrayValores[i].checked = true;\r\n                    } else {\r\n                        compensadaGrupoArrayValores[i].checked = false;\r\n                    }\r\n                }\r\n                \r\n                var llave = \"\";\r\n                var auxCiclo = '".toCharArray();
    __oracle_jsp_text[63] = 
    "';\r\n                var auxCxlc = '".toCharArray();
    __oracle_jsp_text[64] = 
    "';\r\n        \r\n                // Folio\r\n                var auxFolio    = $j(this).parent().next('td').text();\r\n                var auxDifFolio = $j(this).parent().next('td').next('td').text();\r\n                var auxTipoCpto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxCptoPag  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxGuia     = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                llave = auxCiclo + \"|\" + auxCxlc + \"|\" + auxFolio + \"|\" + auxDifFolio + \"|\" + auxTipoCpto + \"|\" + auxCptoPag + \"|\" + auxGuia;\r\n                \r\n                // Monto\r\n                var auxMonto = $j(this).parent()\r\n                    .next('td').next('td').next('td')\r\n                    .next('td').next('td').next('td')\r\n                    .next('td').next('td').next('td')\r\n                    .next('td').next('td').text();\r\n                auxMonto = auxMonto.replace(\"$ \", \"\");\r\n                auxMonto = auxMonto.replace(/,/g, \"\");\r\n                //console.log(\"Folio compensada: \" + llave + \" Monto: \"+ auxMonto);\r\n                \r\n                var checkedList = window.document.getElementsByName('trabajadorGrupo');\r\n                var checkedListArrayValores = window.document.getElementsByName('trabajadorGrupoArrayValores');\r\n                for(var i = 0; i < checkedList.length; i++) {\r\n                    //console.log(\"List -> \" + checkedList[i].value);\r\n                    if (checkedList[i].value != \"\" && checkedList[i].value == llave && checkedList[i].checked == true) {\r\n                        //console.log(\"Iguales: \" + llave + \" - \" + checkedList[i].value);\r\n                        checkedList[i].checked = false;\r\n                        checkedListArrayValores[i].checked = false;\r\n                        \r\n                        var montoOriginal = $j(\"#montoTotalTrabajador\").text();\r\n                        montoOriginal = montoOriginal.replace(\"Total trabajador: $ \", \"\");\r\n                        montoOriginal = montoOriginal.replace(/,/g, \"\");\r\n                        //console.log(\"Monto original: \" + montoOriginal);\r\n                        \r\n                        var montoNuevo = parseFloat(montoOriginal) - parseFloat(auxMonto);\r\n                        $j(\"#montoTotalTrabajador\").text(\"Total trabajador: $ \" + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();\r\n                    }\r\n                }\r\n                total+=parseFloat(auxMonto);\r\n            });\r\n            $j(\"#montoTotalCompensada\").text(\"Total compensada: $ \" + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();\r\n        });\r\n        \r\n        $j('.boxTrabajador').change(function(){\r\n            var total = 0;\r\n            var trabajadorGrupo = window.document.getElementsByName('trabajadorGrupo');\r\n            var trabajadorGrupoArrayValores = window.document.getElementsByName('trabajadorGrupoArrayValores');\r\n            \r\n            $j('.boxTrabajador').each(function(){\r\n                for(var i = 0; i < trabajadorGrupo.length; i++) {\r\n                    if (trabajadorGrupo[i].checked == true) {\r\n                        trabajadorGrupoArrayValores[i].checked = true;\r\n                    } else {\r\n                        trabajadorGrupoArrayValores[i].checked = false;\r\n                    }\r\n                }\r\n            });\r\n            \r\n            $j('.boxTrabajador:checked').each(function(){\r\n                for(var i = 0; i < trabajadorGrupo.length; i++) {\r\n                    if (trabajadorGrupo[i].checked == true) {\r\n                        trabajadorGrupoArrayValores[i].checked = true;\r\n                    } else {\r\n                        trabajadorGrupoArrayValores[i].checked = false;\r\n                    }\r\n                }\r\n                \r\n                var llave = \"\";\r\n                var auxCiclo = '".toCharArray();
    __oracle_jsp_text[65] = 
    "';\r\n                var auxCxlc = '".toCharArray();
    __oracle_jsp_text[66] = 
    "';\r\n                \r\n                // Folio\r\n                var auxFolio    = $j(this).parent().next('td').text();\r\n                var auxDifFolio = $j(this).parent().next('td').next('td').text();\r\n                var auxTipoCpto = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxCptoPag  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxGuia     = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                llave = auxCiclo + \"|\" + auxCxlc + \"|\" + auxFolio + \"|\" + auxDifFolio + \"|\" + auxTipoCpto + \"|\" + auxCptoPag + \"|\" + auxGuia;\r\n                \r\n                // Monto\r\n                var auxMonto = $j(this).parent()\r\n                    .next('td').next('td').next('td')\r\n                    .next('td').next('td').next('td')\r\n                    .next('td').next('td').next('td')\r\n                    .next('td').next('td').text();\r\n                auxMonto = auxMonto.replace(\"$ \", \"\");\r\n                auxMonto = auxMonto.replace(/,/g, \"\");\r\n                //console.log(\"Folio trabajador: \" + llave + \" Monto: \"+ auxMonto);\r\n                \r\n                var checkedList = window.document.getElementsByName('compensadaGrupo');\r\n                var checkedListArrayValores = window.document.getElementsByName('compensadaGrupoArrayValores');\r\n                for(var i = 0; i < checkedList.length; i++) {\r\n                    //console.log(\"List -> \" + checkedList[i].value);\r\n                    if (checkedList[i].value != \"\" && checkedList[i].value == llave && checkedList[i].checked == true) {\r\n                        //console.log(\"Iguales: \" + llave + \" - \" + checkedList[i].value);\r\n                        checkedList[i].checked = false;\r\n                        checkedListArrayValores[i].checked = false;\r\n                        \r\n                        var montoOriginal = $j(\"#montoTotalCompensada\").text();\r\n                        montoOriginal = montoOriginal.replace(\"Total compensada: $ \", \"\");\r\n                        montoOriginal = montoOriginal.replace(/,/g, \"\");\r\n                        //console.log(\"Monto original: \" + montoOriginal);\r\n                        \r\n                        var montoNuevo = parseFloat(montoOriginal) - parseFloat(auxMonto);\r\n                        $j(\"#montoTotalCompensada\").text(\"Total compensada: $ \" + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();\r\n                    }\r\n                }             \r\n                total+=parseFloat(auxMonto);\r\n            });\r\n            // Monto\r\n            $j(\"#montoTotalTrabajador\").text(\"Total trabajador: $ \" + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();\r\n        });\r\n        \r\n        $j.fn.digits = function(){ \r\n            return this.each(function(){ \r\n                $j(this).text($j(this).text().replace(/(\\d)(?=(\\d\\d\\d)+(?!\\d))/g, \"$1,\")); \r\n            });\r\n        }\r\n        \r\n        function checkAll() {\r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('compensadaGrupo');\r\n        \r\n            for (var i = 0; i < checkboxes.length; i++) {\r\n                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {\r\n                    checkboxes[i].setAttribute('checked', true);\r\n                } else {\r\n                    checkboxes[i].removeAttribute('checked');\r\n                }\r\n            }\r\n            \r\n            var checkboxes2 = new Array();\r\n            checkboxes2 = document.getElementsByName('compensadaGrupoArrayValores');\r\n            \r\n            for (var i = 0; i < checkboxes2.length; i++) {\r\n                if (checkboxes2[i].type == 'checkbox' && checkboxes2[i].disabled == false) {\r\n                    checkboxes2[i].setAttribute('checked', true);\r\n                } else {\r\n                    checkboxes2[i].removeAttribute('checked');\r\n                }\r\n            }\r\n            // Monto\r\n            getTotal();\r\n        }\r\n        \r\n        function uncheckAll() {\r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('compensadaGrupo');\r\n        \r\n            for (var i = 0; i < checkboxes.length; i++) {\r\n                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {\r\n                    checkboxes[i].removeAttribute('checked');\r\n                }\r\n            }\r\n            \r\n            var checkboxes2 = new Array();\r\n            checkboxes2 = document.getElementsByName('compensadaGrupoArrayValores');\r\n            \r\n            for (var i = 0; i < checkboxes2.length; i++) {\r\n                if (checkboxes2[i].type == 'checkbox' && checkboxes2[i].disabled == false) {\r\n                    checkboxes2[i].removeAttribute('checked');\r\n                }\r\n            }\r\n            // Monto\r\n            $j(\"#montoTotalCompensada\").text(\"Total compensada: $ 0.00\");\r\n        }\r\n        \r\n        function getTotal() {\r\n            var total = 0;\r\n            \r\n            $j('.boxCompensada:checked').each(function(){\r\n                // Monto\r\n                var auxMonto = $j(this).parent().next('td').next('td').next('td')\r\n                                                .next('td').next('td').next('td')\r\n                                                .next('td').next('td').next('td')\r\n                                                .next('td').next('td').text();\r\n                auxMonto = auxMonto.replace(\"$ \", \"\");\r\n                auxMonto = auxMonto.replace(/,/g, \"\");\r\n                total+=parseFloat(auxMonto);\r\n            });\r\n            // Monto\r\n            $j(\"#montoTotalCompensada\").text(\"Total compensada: $ \" + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
