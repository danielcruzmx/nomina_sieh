package _web_2d_inf._jsp._clc._proceso;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _clcTercerosAjustes extends com.orionserver.http.OrionHttpJspPage {


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
    _clcTercerosAjustes page = this;
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
        __jsp_taghandler_1.setModelAttribute("clcTercerosAjustesDTO");
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
                __jsp_taghandler_4.setCode("sireh.label.clc.proceso.clcTercerosAjustes.titulo");
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
                __jsp_taghandler_5.setCode("sireh.label.clc.proceso.clcTercerosAjustes.nominaOrigen");
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
                __jsp_taghandler_7.setBeanName("tdCxlcDivideBusquedaAjustes");
                __jsp_taghandler_7.setPath("nominaOrigen");
                __jsp_taghandler_7.setProgress("true");
                __jsp_taghandler_7.setStyle("width: 200px;");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.clc.proceso.clcTerceros.ciclo");
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
                __jsp_taghandler_10.setBeanName("tdCxlcCicloBusquedaAjustes");
                __jsp_taghandler_10.setPath("ciclo");
                __jsp_taghandler_10.setProgress("true");
                __jsp_taghandler_10.setStyle("width: 200px;");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.clc.proceso.clcTercerosAjustes.quincenaPago");
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
                __jsp_taghandler_13.setBeanName("tdCxlcQnaPagoBusquedaAjustes");
                __jsp_taghandler_13.setPath("quincena");
                __jsp_taghandler_13.setParentPath("ciclo");
                __jsp_taghandler_13.setProgress("true");
                __jsp_taghandler_13.setStyle("width: 200px;");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.clc.proceso.clcTercerosAjustes.complemento");
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
                __jsp_taghandler_16.setBeanName("tdCxlcComplementoBusquedaAjustes");
                __jsp_taghandler_16.setPath("complemento");
                __jsp_taghandler_16.setParentPath("quincena");
                __jsp_taghandler_16.setProgress("true");
                __jsp_taghandler_16.setStyle("width: 200px;");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.clc.proceso.clcTerceros.tipoNominaTerceros");
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
                __jsp_taghandler_19.setBeanName("tdCxlcTipoNominaByNominaOrigenBusquedaAjustes");
                __jsp_taghandler_19.setPath("tipoNominaTerceros");
                __jsp_taghandler_19.setParentPath("complemento");
                __jsp_taghandler_19.setProgress("true");
                __jsp_taghandler_19.setFilterPaths("ciclo,quincena,nominaOrigen");
                __jsp_taghandler_19.setStyle("width: 200px;");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_20=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setPath("busquedaClc");
                __jsp_taghandler_20.setAction("clcProceso/clcTercerosAjustes");
                __jsp_taghandler_20.setValue("submit.search");
                __jsp_taghandler_20.setProgressBar("true");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_21=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setPath("cancel");
                __jsp_taghandler_21.setAction("clcProceso/clcTercerosAjustes");
                __jsp_taghandler_21.setValue("submit.cancel");
                __jsp_taghandler_21.setProgressBar("true");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[26]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_23=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                      __jsp_taghandler_23.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosAjustesDTO.busquedaClc}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[27]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_24=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_24.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_24.setJspContext(pageContext);
                            __jsp_taghandler_24.setProperty("C.CXLC_CICLO");
                            __jsp_taghandler_24.setCondition("=");
                            __jsp_taghandler_24.setPath("ciclo");
                            __jsp_taghandler_24.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                          }
                          out.write(__oracle_jsp_text[28]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_25=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_25.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_25.setJspContext(pageContext);
                            __jsp_taghandler_25.setProperty("C.CXLC_QNA_PAGO");
                            __jsp_taghandler_25.setCondition("=");
                            __jsp_taghandler_25.setPath("quincena");
                            __jsp_taghandler_25.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
                          }
                          out.write(__oracle_jsp_text[29]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_26=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_26.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_26.setJspContext(pageContext);
                            __jsp_taghandler_26.setProperty("C.ID_TIPO_NOMINA");
                            __jsp_taghandler_26.setCondition("=");
                            __jsp_taghandler_26.setPath("tipoNominaTerceros");
                            __jsp_taghandler_26.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                          }
                          out.write(__oracle_jsp_text[30]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_27=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_27.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_27.setJspContext(pageContext);
                            __jsp_taghandler_27.setProperty("C.CXLC_COMPLEMENTO");
                            __jsp_taghandler_27.setCondition("=");
                            __jsp_taghandler_27.setPath("complemento");
                            __jsp_taghandler_27.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                          }
                          out.write(__oracle_jsp_text[31]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_28=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_28.setParent(__jsp_taghandler_23);
                            __jsp_taghandler_28.setJspContext(pageContext);
                            __jsp_taghandler_28.setBeanName("busquedaClcProcesaTercerosAjustes");
                            __jsp_taghandler_28.setBaseUrl("clcTerceros");
                            __jsp_taghandler_28.setAppendFilters("false");
                            __jsp_taghandler_28.setCheckbox("true");
                            __jsp_taghandler_28.setChkProperty("cxlcGrupo");
                            __jsp_taghandler_28.setJspBody(new _clcTercerosAjustes_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_28, __ojsp_varRes));
                            __jsp_taghandler_28.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                          }
                          out.write(__oracle_jsp_text[32]);
                        } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,3);
                    }
                    out.write(__oracle_jsp_text[33]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_45.setParent(__jsp_taghandler_22);
                      __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[34]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                            __jsp_taghandler_46.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                              if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_46.doCatch(th);
                            } finally {
                              __jsp_taghandler_46.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,4);
                          }
                          out.write(__oracle_jsp_text[35]);
                        } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,3);
                    }
                    out.write(__oracle_jsp_text[36]);
                  } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_47=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setCode("sireh.label.clc.proceso.clcTercerosAjustes.signo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                  if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_47.doCatch(th);
                } finally {
                  __jsp_taghandler_47.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,2);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setPath("signo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[39]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_49=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                        __jsp_taghandler_49.setValue("");
                        __jsp_taghandler_49.setLabel("SELECCIONE...");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                          if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_49.doCatch(th);
                        } finally {
                          __jsp_taghandler_49.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,3);
                      }
                      out.write(__oracle_jsp_text[40]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_50.setParent(__jsp_taghandler_48);
                        __jsp_taghandler_50.setValue("+");
                        __jsp_taghandler_50.setLabel("+");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
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
                      out.write(__oracle_jsp_text[41]);
                      {
                        org.springframework.web.servlet.tags.form.OptionTag __jsp_taghandler_51=(org.springframework.web.servlet.tags.form.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.OptionTag.class,"org.springframework.web.servlet.tags.form.OptionTag value label");
                        __jsp_taghandler_51.setParent(__jsp_taghandler_48);
                        __jsp_taghandler_51.setValue("-");
                        __jsp_taghandler_51.setLabel("-");
                        java.lang.Object value = null;
                        java.lang.String displayValue = null;
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                          if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                            return;
                        } catch (Throwable th) {
                          __jsp_taghandler_51.doCatch(th);
                        } finally {
                          __jsp_taghandler_51.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,3);
                      }
                      out.write(__oracle_jsp_text[42]);
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
              out.write(__oracle_jsp_text[43]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setCode("sireh.label.clc.proceso.clcTercerosAjustes.importeAjuste");
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
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_53=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setJspContext(pageContext);
                __jsp_taghandler_53.setPath("importeAjuste");
                __jsp_taghandler_53.setSize("10");
                __jsp_taghandler_53.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_54=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosAjustesDTO.muestraErrores}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[46]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_55=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                      __jsp_taghandler_55.setJspContext(pageContext);
                      __jsp_taghandler_55.setProperty("E.CE_CICLO");
                      __jsp_taghandler_55.setCondition("=");
                      __jsp_taghandler_55.setPath("ciclo");
                      __jsp_taghandler_55.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
                    }
                    out.write(__oracle_jsp_text[47]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_56=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_56.setParent(__jsp_taghandler_54);
                      __jsp_taghandler_56.setJspContext(pageContext);
                      __jsp_taghandler_56.setProperty("E.CE_QNA_PAGO");
                      __jsp_taghandler_56.setCondition("=");
                      __jsp_taghandler_56.setPath("quincena");
                      __jsp_taghandler_56.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_56, pageContext);
                    }
                    out.write(__oracle_jsp_text[48]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_57=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_57.setParent(__jsp_taghandler_54);
                      __jsp_taghandler_57.setJspContext(pageContext);
                      __jsp_taghandler_57.setProperty("E.ID_TIPO_NOMINA");
                      __jsp_taghandler_57.setCondition("=");
                      __jsp_taghandler_57.setPath("tipoNominaTerceros");
                      __jsp_taghandler_57.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
                    }
                    out.write(__oracle_jsp_text[49]);
                    {
                      _oracle._jsp._tag._filter_tag __jsp_taghandler_58=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                      __jsp_taghandler_58.setParent(__jsp_taghandler_54);
                      __jsp_taghandler_58.setJspContext(pageContext);
                      __jsp_taghandler_58.setProperty("E.CE_COMPLEMENTO");
                      __jsp_taghandler_58.setCondition("=");
                      __jsp_taghandler_58.setPath("complemento");
                      __jsp_taghandler_58.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_58, pageContext);
                    }
                    out.write(__oracle_jsp_text[50]);
                    {
                      _oracle._jsp._tag._pagedList_tag __jsp_taghandler_59=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                      __jsp_taghandler_59.setParent(__jsp_taghandler_54);
                      __jsp_taghandler_59.setJspContext(pageContext);
                      __jsp_taghandler_59.setBeanName("clcTercerosErrores");
                      __jsp_taghandler_59.setBaseUrl("clcTercerosCancelados");
                      __jsp_taghandler_59.setAppendFilters("false");
                      __jsp_taghandler_59.setJspBody(new _clcTercerosAjustes_OjspFragmentSupport( 1, pageContext, __jsp_taghandler_59, __ojsp_varRes));
                      __jsp_taghandler_59.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_59, pageContext);
                    }
                    out.write(__oracle_jsp_text[51]);
                  } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,2);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_80=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_80.setParent(__jsp_taghandler_1);
                __jsp_taghandler_80.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                  if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_80.doCatch(th);
                } finally {
                  __jsp_taghandler_80.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,2);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_81=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_81.setParent(__jsp_taghandler_1);
                __jsp_taghandler_81.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcTercerosAjustesDTO.muestraErrores}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[54]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_82=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_82.setParent(__jsp_taghandler_81);
                      __jsp_taghandler_82.setJspContext(pageContext);
                      __jsp_taghandler_82.setAction("clcProceso/marcaRevisadoExisteErrorTercerAjustes");
                      __jsp_taghandler_82.setValue("submit.revisarErrores");
                      __jsp_taghandler_82.setProgressBar("true");
                      __jsp_taghandler_82.setAlertCode("confirm.clc.proceso.terceros.revisar");
                      __jsp_taghandler_82.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_82, pageContext);
                    }
                    out.write(__oracle_jsp_text[55]);
                  } while (__jsp_taghandler_81.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81,2);
              }
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_83=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_83.setParent(__jsp_taghandler_1);
                __jsp_taghandler_83.setJspContext(pageContext);
                __jsp_taghandler_83.setAction("clcProceso/executeProcedureAplicaCxlcAjustes");
                __jsp_taghandler_83.setValue("submit.aplicaAjuste");
                __jsp_taghandler_83.setProgressBar("true");
                __jsp_taghandler_83.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_83, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
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

  private class _clcTercerosAjustes_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _clcTercerosAjustes_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_28       = parent;
      out.write("\r\n                                                                                       \r\n                                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_29=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_29.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_28));
        __jsp_taghandler_29.setName("busquedaClcProcesaTercerosAjustes");
        __jsp_taghandler_29.setPagesize(200);
        __jsp_taghandler_29.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_29.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_29.setClass("displaytag");
        __jsp_taghandler_29.setExport(true);
        __jsp_taghandler_29.setUid("row");
        __jsp_taghandler_29.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_29,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_30=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                __jsp_taghandler_30.setTitleKey("sireh.label.clc.proceso.clcTercerosAjustes.ajusteGrupo");
                __jsp_taghandler_30.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                            <input name=\"ajusteGrupo\" \r\n                                                   class=\"boxAjuste\"\r\n                                                   type=\"checkbox\" \r\n                                                   value=\"");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_31=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                        __jsp_taghandler_31.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.cxlc}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                        if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,7);
                      }
                      out.write("\"/>  \r\n                                        ");
                    } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,6);
              }
              out.write("\r\n                                        \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_32.setParent(__jsp_taghandler_29);
                __jsp_taghandler_32.setProperty("nominaOrigen");
                __jsp_taghandler_32.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.nominaOrigen");
                __jsp_taghandler_32.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,6);
              }
              out.write("   \r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_33=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_33.setParent(__jsp_taghandler_29);
                __jsp_taghandler_33.setProperty("cxlc");
                __jsp_taghandler_33.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlc");
                __jsp_taghandler_33.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_34.setParent(__jsp_taghandler_29);
                __jsp_taghandler_34.setProperty("cxlcQnaPago");
                __jsp_taghandler_34.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcQnaPago");
                __jsp_taghandler_34.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_35.setParent(__jsp_taghandler_29);
                __jsp_taghandler_35.setProperty("idTipoNomina");
                __jsp_taghandler_35.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.idTipoNomina");
                __jsp_taghandler_35.setSortable(true);
                __jsp_taghandler_35.setStyle((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_36=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_36.setParent(__jsp_taghandler_29);
                __jsp_taghandler_36.setProperty("cxlcComplemento");
                __jsp_taghandler_36.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcComplemento");
                __jsp_taghandler_36.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_37=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_37.setParent(__jsp_taghandler_29);
                __jsp_taghandler_37.setProperty("secCxlcTerceros");
                __jsp_taghandler_37.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.secCxlcTerceros");
                __jsp_taghandler_37.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_38=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_38.setParent(__jsp_taghandler_29);
                __jsp_taghandler_38.setProperty("cxlcCompromiso");
                __jsp_taghandler_38.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcCompromiso");
                __jsp_taghandler_38.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_39=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_39.setParent(__jsp_taghandler_29);
                __jsp_taghandler_39.setProperty("cxlcDevengado");
                __jsp_taghandler_39.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.cxlcDevengado");
                __jsp_taghandler_39.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_40=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format class style");
                __jsp_taghandler_40.setParent(__jsp_taghandler_29);
                __jsp_taghandler_40.setProperty("monto");
                __jsp_taghandler_40.setTitleKey("sireh.label.clc.proceso.clcTerceros.cuentas.monto");
                __jsp_taghandler_40.setSortable(true);
                __jsp_taghandler_40.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_40.setClass("amount");
                __jsp_taghandler_40.setStyle("text-align: right;");
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,6);
              }
              out.write("\r\n                                                        \r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_41=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_41.setParent(__jsp_taghandler_29);
                __jsp_taghandler_41.setName("paging.banner.placement");
                __jsp_taghandler_41.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_42=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_42.setParent(__jsp_taghandler_29);
                __jsp_taghandler_42.setName("export.pdf");
                __jsp_taghandler_42.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,6);
              }
              out.write("\r\n                                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_43=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_43.setParent(__jsp_taghandler_29);
                __jsp_taghandler_43.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_43,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_44.setParent(__jsp_taghandler_43);
                        __jsp_taghandler_44.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                          if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_44.doCatch(th);
                        } finally {
                          __jsp_taghandler_44.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,7);
                      }
                      out.write("<br><br></span>\r\n                                        ");
                    } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,6);
              }
              out.write("\r\n                                    ");
            } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,5);
      }
      out.write("\r\n                                ");
      return;
    }

      
    public void invoke1(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_59       = parent;
      out.write("\r\n                               \r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_60=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_60.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_59));
        __jsp_taghandler_60.setName("clcTercerosErrores");
        __jsp_taghandler_60.setPagesize(10);
        __jsp_taghandler_60.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_60.setClass("displaytag");
        __jsp_taghandler_60.setExport(true);
        __jsp_taghandler_60.setUid("row3");
        __jsp_taghandler_60.setSort("list");
        java.lang.Object row3 = null;
        java.lang.Integer row3_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_60,__jsp_tag_starteval,out);
            do {
              row3 = (java.lang.Object) pageContext.findAttribute("row3");
              row3_rowNum = (java.lang.Integer) pageContext.findAttribute("row3_rowNum");
              out.write("\r\n                           \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_61=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_61.setParent(__jsp_taghandler_60);
                __jsp_taghandler_61.setProperty("ceSecuencia");
                __jsp_taghandler_61.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.id");
                __jsp_taghandler_61.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_62=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_62.setParent(__jsp_taghandler_60);
                __jsp_taghandler_62.setProperty("ceCiclo");
                __jsp_taghandler_62.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.ciclo");
                __jsp_taghandler_62.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_63=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_63.setParent(__jsp_taghandler_60);
                __jsp_taghandler_63.setProperty("ceQnaPago");
                __jsp_taghandler_63.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.quincenaPago");
                __jsp_taghandler_63.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,5);
              }
              out.write("          \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_64=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_64.setParent(__jsp_taghandler_60);
                __jsp_taghandler_64.setProperty("idTipoNomina");
                __jsp_taghandler_64.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.tipoNomina");
                __jsp_taghandler_64.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_65=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_65.setParent(__jsp_taghandler_60);
                __jsp_taghandler_65.setProperty("ceComplemento");
                __jsp_taghandler_65.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.complemento");
                __jsp_taghandler_65.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_66=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_66.setParent(__jsp_taghandler_60);
                __jsp_taghandler_66.setProperty("descError");
                __jsp_taghandler_66.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.descError");
                __jsp_taghandler_66.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_67=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_67.setParent(__jsp_taghandler_60);
                __jsp_taghandler_67.setProperty("idFolio");
                __jsp_taghandler_67.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.folio");
                __jsp_taghandler_67.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_68=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_68.setParent(__jsp_taghandler_60);
                __jsp_taghandler_68.setProperty("idTipoCpto");
                __jsp_taghandler_68.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.tipoConcepto");
                __jsp_taghandler_68.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_69=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_69.setParent(__jsp_taghandler_60);
                __jsp_taghandler_69.setProperty("idCptoPago");
                __jsp_taghandler_69.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.conceptoPago");
                __jsp_taghandler_69.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_70=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_70.setParent(__jsp_taghandler_60);
                __jsp_taghandler_70.setProperty("idUnidadNom");
                __jsp_taghandler_70.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.unidad");
                __jsp_taghandler_70.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_71=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_71.setParent(__jsp_taghandler_60);
                __jsp_taghandler_71.setProperty("idEdo");
                __jsp_taghandler_71.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.estado");
                __jsp_taghandler_71.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_72=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_72.setParent(__jsp_taghandler_60);
                __jsp_taghandler_72.setProperty("ceMonto");
                __jsp_taghandler_72.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.monto");
                __jsp_taghandler_72.setSortable(true);
                __jsp_taghandler_72.setFormat("$ {0,number,#,##0.00}");
                __jsp_taghandler_72.setStyle("text-align:right");
                __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_73=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_73.setParent(__jsp_taghandler_60);
                __jsp_taghandler_73.setProperty("revisado");
                __jsp_taghandler_73.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.revisado");
                __jsp_taghandler_73.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_74=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_74.setParent(__jsp_taghandler_60);
                __jsp_taghandler_74.setProperty("usuario");
                __jsp_taghandler_74.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.usuario");
                __jsp_taghandler_74.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_75=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                __jsp_taghandler_75.setParent(__jsp_taghandler_60);
                __jsp_taghandler_75.setProperty("fecModifico");
                __jsp_taghandler_75.setTitleKey("sireh.label.clc.proceso.clcTerceros.errores.fecha");
                __jsp_taghandler_75.setSortable(true);
                __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,5);
              }
              out.write("\r\n                                        \r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_76=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_76.setParent(__jsp_taghandler_60);
                __jsp_taghandler_76.setName("paging.banner.placement");
                __jsp_taghandler_76.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_77=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_77.setParent(__jsp_taghandler_60);
                __jsp_taghandler_77.setName("export.pdf");
                __jsp_taghandler_77.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,5);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_78=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_78.setParent(__jsp_taghandler_60);
                __jsp_taghandler_78.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_78,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
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
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,6);
                      }
                      out.write("<br><br></span>\r\n                        ");
                    } while (__jsp_taghandler_78.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,5);
              }
              out.write("\r\n                    ");
            } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,4);
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

  private static final char __oracle_jsp_text[][]=new char[58][];
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
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td height=\"10px\" colspan=\"2\"></td>\r\n                        </tr>\r\n                        \r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
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
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td height=\"10px\" colspan=\"2\"></td>\r\n                        </tr>\r\n                        \r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"left\" height=\"20px\" valign=\"middle\"> &nbsp; </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[24] = 
    " &nbsp; \r\n                            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <br/>\r\n    <table align=\"center\" width=\"100%\">        \r\n        <tr valign=\"top\">\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp; CLC &nbsp;&nbsp;</strong>\r\n                    </legend>\r\n                    ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                            \r\n                            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                            \r\n                            <div id=\"displayTagDiv\">\r\n                                ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                            </div>\r\n                            \r\n                            <table align=\"center\" width=\"100%\">\r\n                                <tr>\r\n                                    <td align=\"left\" height=\"10px\" valign=\"middle\"> &nbsp; </td>\r\n                                </tr>\r\n                                <tr valign=\"top\">\r\n                                    <td align=\"right\">\r\n                                        <span id=\"montoTotalAjuste\" style=\"font-size:2em\">Total ajuste: $ 0.00</span>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"20px\"> &nbsp; </td>\r\n                                </tr>\r\n                            </table>\r\n                        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[35] = 
    "<br><br></span>\r\n                        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <br/>\r\n    <table align=\"center\" width=\"100%\">        \r\n        <tr valign=\"top\">\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp; Procesar &nbsp;&nbsp;</strong>\r\n                    </legend>\r\n                    <table>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[38] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[45] = 
    " &nbsp; <span style=\"color: red;\">Max.+- $25.00</span>\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n        <br/>\r\n        <fieldset>\r\n            <legend style=\"font-size:1.3em\">\r\n                <strong>&nbsp;&nbsp; Errores &nbsp;&nbsp;</strong>\r\n            </legend>\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n            \r\n            <div id=\"displayTagDiv3\">\r\n                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n            </div>\r\n        </fieldset>\r\n    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n    \r\n    <table align=\"left\" width=\"100%\">\r\n        <tr>\r\n            <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                <strong>\r\n                    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                </strong>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[55] = 
    " &nbsp; \r\n                            ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j('[name=\"ajusteGrupo\"]').addClass('uniqueAjuste');\r\n        var $juniqueAjuste = $j('input.uniqueAjuste');\r\n        $juniqueAjuste.click(function() {\r\n            $juniqueAjuste.filter(':checked').not(this).removeAttr('checked');\r\n        });\r\n        \r\n        $j('.boxAjuste').change(function(){\r\n            var total = 0;\r\n            var ajusteGrupo = window.document.getElementsByName('ajusteGrupo');\r\n            \r\n            $j('.boxAjuste:checked').each(function(){\r\n            \r\n                // Folio\r\n                var auxFolio = $j(this).parent().next('td').text();\r\n                \r\n                // Monto\r\n                var auxMonto = $j(this).parent()\r\n                    .next('td').next('td').next('td')\r\n                    .next('td').next('td').next('td')\r\n                    .next('td').next('td').next('td').text();\r\n                auxMonto = auxMonto.replace(\"$ \", \"\");\r\n                auxMonto = auxMonto.replace(/,/g, \"\");\r\n                //console.log(\"Folio ajuste: \" + auxFolio + \" Monto: \"+ auxMonto);\r\n                \r\n                var checkedList = window.document.getElementsByName('compensadaGrupo');\r\n                for(var i = 0; i < checkedList.length; i++) {\r\n                    //console.log(\"List -> \" + checkedList[i].value);\r\n                    if (checkedList[i].value != \"\" && checkedList[i].value == auxFolio && checkedList[i].checked == true) {\r\n                        //console.log(\"Iguales: \" + auxFolio + \" - \" + checkedList[i].value);\r\n                        checkedList[i].checked = false;\r\n                        \r\n                        var montoOriginal = $j(\"#montoTotalCompensada\").text();\r\n                        montoOriginal = montoOriginal.replace(\"Total compensada: $ \", \"\");\r\n                        montoOriginal = montoOriginal.replace(/,/g, \"\");\r\n                        //console.log(\"Monto original: \" + montoOriginal);\r\n                        \r\n                        var montoNuevo = parseFloat(montoOriginal) - parseFloat(auxMonto);\r\n                        $j(\"#montoTotalCompensada\").text(\"Total compensada: $ \" + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();\r\n                    }\r\n                }             \r\n                total+=parseFloat(auxMonto);\r\n            });\r\n            // Monto\r\n            $j(\"#montoTotalAjuste\").text(\"Total ajuste: $ \" + parseFloat(Math.round(total * 100) / 100).toFixed(2)).digits();\r\n        });\r\n        \r\n        $j.fn.digits = function(){ \r\n            return this.each(function(){ \r\n                $j(this).text($j(this).text().replace(/(\\d)(?=(\\d\\d\\d)+(?!\\d))/g, \"$1,\")); \r\n            });\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
