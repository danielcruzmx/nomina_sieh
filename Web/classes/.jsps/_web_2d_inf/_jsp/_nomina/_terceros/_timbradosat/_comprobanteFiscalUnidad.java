package _web_2d_inf._jsp._nomina._terceros._timbradosat;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _comprobanteFiscalUnidad extends com.orionserver.http.OrionHttpJspPage {


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
    _comprobanteFiscalUnidad page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("comprobanteFiscalDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.nomina.reportes.satInpresionCFDI.unidad");
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
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.terceros.sat.impresion.cfdi.pdf.unidad");
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
              out.write(__oracle_jsp_text[8]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_4=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setKey("");
                __jsp_taghandler_4.setValue("selectList.nonValue");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_5=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setJspContext(pageContext);
                __jsp_taghandler_5.setBeanName("tcUnidadSinCiclo");
                __jsp_taghandler_5.setPath("unidad");
                __jsp_taghandler_5.setStyle("width: 600px;");
                __jsp_taghandler_5.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.terceros.sat.impresion.cfdi.pdf.quincena");
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
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_7=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setProperty("N.NOM_QNA_CAPTURA");
                __jsp_taghandler_7.setCondition("<=");
                __jsp_taghandler_7.setPath("qnaCaptura");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_8=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setKey("0");
                __jsp_taghandler_8.setValue("selectList.nonValue");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_9=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setBeanName("impresionCFDIQnaPago");
                __jsp_taghandler_9.setPath("qnaPago");
                __jsp_taghandler_9.setProgress("true");
                __jsp_taghandler_9.setAppendFilters("false");
                __jsp_taghandler_9.setStyle("width: 600px;");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.terceros.sat.impresion.cfdi.pdf.tipoNomina");
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
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_11=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setKey("0");
                __jsp_taghandler_11.setValue("selectList.nonValue");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_12=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setBeanName("impresionCFDITipoNomina");
                __jsp_taghandler_12.setPath("tipoNomina");
                __jsp_taghandler_12.setParentPath("qnaPago");
                __jsp_taghandler_12.setProgress("true");
                __jsp_taghandler_12.setStyle("width: 600px;");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.terceros.sat.impresion.cfdi.pdf.consecutivoNomina");
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
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_14=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setKey("");
                __jsp_taghandler_14.setValue("selectList.nonValue");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_15=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setBeanName("impresionCFDIConsecutivo");
                __jsp_taghandler_15.setPath("hpConsecNomina");
                __jsp_taghandler_15.setParentPath("qnaPago");
                __jsp_taghandler_15.setProgress("true");
                __jsp_taghandler_15.setFilterPaths("tipoNomina");
                __jsp_taghandler_15.setStyle("width: 600px;");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
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
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_17=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setPath("buscar");
                __jsp_taghandler_17.setAction("timbradoSat/impresionCfdiPorQna.do");
                __jsp_taghandler_17.setValue("submit.search");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.muestraRegistros eq false}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[23]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_19=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                      __jsp_taghandler_19.setJspContext(pageContext);
                      __jsp_taghandler_19.setPath("limpiar");
                      __jsp_taghandler_19.setAction("timbradoSat/impresionCfdiPorQna.do");
                      __jsp_taghandler_19.setValue("submit.clean");
                      __jsp_taghandler_19.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
                    }
                    out.write(__oracle_jsp_text[24]);
                  } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[26]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_21=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                      __jsp_taghandler_21.setJspContext(pageContext);
                      __jsp_taghandler_21.setPath("limpiar");
                      __jsp_taghandler_21.setAction("timbradoSat/impresionCfdiPorQna.do");
                      __jsp_taghandler_21.setValue("submit.clean");
                      __jsp_taghandler_21.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
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
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_23=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                      __jsp_taghandler_23.setJspContext(pageContext);
                      __jsp_taghandler_23.setPath("procesar");
                      __jsp_taghandler_23.setAction("timbradoSat/generarPdfDeCfdi.do");
                      __jsp_taghandler_23.setValue("submit.generate");
                      __jsp_taghandler_23.setProgressIcon("false");
                      __jsp_taghandler_23.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                  } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[32]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                      __jsp_taghandler_25.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[33]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_26=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                            __jsp_taghandler_26.setJspContext(pageContext);
                            __jsp_taghandler_26.setProperty("HP.HP_CONSEC_NOMINA");
                            __jsp_taghandler_26.setCondition("=");
                            __jsp_taghandler_26.setPath("hpConsecNomina");
                            __jsp_taghandler_26.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
                          }
                          out.write(__oracle_jsp_text[34]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_27.setParent(__jsp_taghandler_25);
                            __jsp_taghandler_27.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.unidad != '0'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[35]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_28=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_28.setParent(__jsp_taghandler_27);
                                  __jsp_taghandler_28.setJspContext(pageContext);
                                  __jsp_taghandler_28.setProperty("HP.ID_UNIDAD_NOM");
                                  __jsp_taghandler_28.setCondition("=");
                                  __jsp_taghandler_28.setPath("unidad");
                                  __jsp_taghandler_28.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                                }
                                out.write(__oracle_jsp_text[36]);
                              } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,4);
                          }
                          out.write(__oracle_jsp_text[37]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_29=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_29.setParent(__jsp_taghandler_25);
                            __jsp_taghandler_29.setJspContext(pageContext);
                            __jsp_taghandler_29.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_29.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_29.setAppendFilters("false");
                            __jsp_taghandler_29.setCheckbox("true");
                            __jsp_taghandler_29.setChkProperty("idGrupo");
                            __jsp_taghandler_29.setJspBody(new _comprobanteFiscalUnidad_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_29, __ojsp_varRes));
                            __jsp_taghandler_29.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                          }
                          out.write(__oracle_jsp_text[38]);
                        } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,3);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_42.setParent(__jsp_taghandler_24);
                      __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[40]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_43.setParent(__jsp_taghandler_42);
                            __jsp_taghandler_43.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                              if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_43.doCatch(th);
                            } finally {
                              __jsp_taghandler_43.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,4);
                          }
                          out.write(__oracle_jsp_text[41]);
                        } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,3);
                    }
                    out.write(__oracle_jsp_text[42]);
                  } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,2);
              }
              out.write(__oracle_jsp_text[43]);
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
      out.write(__oracle_jsp_text[44]);

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

  private class _comprobanteFiscalUnidad_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _comprobanteFiscalUnidad_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_29       = parent;
      out.write("\r\n                <div id=\"displayTagDiv\" style=\"text-align:center;width:1000px;height:500px;overflow:auto;\">\r\n                    ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_30=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_30.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_29));
        __jsp_taghandler_30.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_30.setPagesize(500);
        __jsp_taghandler_30.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_30.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_30.setClass("displaytag");
        __jsp_taghandler_30.setExport(true);
        __jsp_taghandler_30.setUid("row");
        __jsp_taghandler_30.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                   \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_31=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                __jsp_taghandler_31.setTitleKey("sireh.label.nomina.tercero.aportacion.consulta.check");
                __jsp_taghandler_31.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_31,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <input name=\"idGrupo\" \r\n                                    class=\"box\"\r\n                                    type=\"checkbox\"\r\n                                    value='");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_32=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_32.setParent(__jsp_taghandler_31);
                        __jsp_taghandler_32.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idGrupo}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                        if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,7);
                      }
                      out.write("'\r\n                                    onclick=\"javascript:searCheckeds(); \"/>\r\n                        ");
                    } while (__jsp_taghandler_31.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,6);
              }
              out.write("\r\n                        \r\n                        ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_33.setParent(__jsp_taghandler_30);
                __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${comprobanteFiscalDTO.unidad == '0'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                            ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                      __jsp_taghandler_34.setProperty("unidad");
                      __jsp_taghandler_34.setTitleKey("sireh.label.nomina.movimiento.cambioRfc.unidad");
                      __jsp_taghandler_34.setSortable(true);
                      __jsp_taghandler_34.setStyle("text-align: center;");
                      __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                      if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,7);
                    }
                    out.write("\r\n                        ");
                  } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,6);
              }
              out.write("\r\n                        \r\n                                        \r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_35.setParent(__jsp_taghandler_30);
                __jsp_taghandler_35.setProperty("rfc");
                __jsp_taghandler_35.setTitleKey("sireh.label.nomina.movimiento.cambioRfc.rfcEmpleado");
                __jsp_taghandler_35.setSortable(true);
                __jsp_taghandler_35.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_36=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_36.setParent(__jsp_taghandler_30);
                __jsp_taghandler_36.setProperty("nombre");
                __jsp_taghandler_36.setTitleKey("sireh.label.nomina.movimiento.cambioRfc.nombreEmpleado");
                __jsp_taghandler_36.setSortable(true);
                __jsp_taghandler_36.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_37=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_37.setParent(__jsp_taghandler_30);
                __jsp_taghandler_37.setProperty("nivel");
                __jsp_taghandler_37.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.nivelCurso");
                __jsp_taghandler_37.setSortable(true);
                __jsp_taghandler_37.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
              }
              out.write("\r\n                                        \r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_38=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_38.setParent(__jsp_taghandler_30);
                __jsp_taghandler_38.setName("paging.banner.placement");
                __jsp_taghandler_38.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_39=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_39.setParent(__jsp_taghandler_30);
                __jsp_taghandler_39.setName("export.pdf");
                __jsp_taghandler_39.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
              }
              out.write("\r\n                        ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_40=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_40.setParent(__jsp_taghandler_30);
                __jsp_taghandler_40.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_40,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                            <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_41=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                        __jsp_taghandler_41.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                          if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_41.doCatch(th);
                        } finally {
                          __jsp_taghandler_41.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,7);
                      }
                      out.write("<br/></span>\r\n                        ");
                    } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,6);
              }
              out.write("\r\n                    ");
            } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,5);
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

  private static final char __oracle_jsp_text[][]=new char[45][];
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
    " \r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n    <h1> <strong> ".toCharArray();
    __oracle_jsp_text[7] = 
    " </strong> </h1> \r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\"  align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr><td></td></tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[8] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    " \r\n                            </td>\r\n                        </tr>                        \r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td colspan=\"4\">\r\n                                <table align=\"center\" width=\"100%\" border=\"0\">\r\n                                    <tr>\r\n                                        <td align=\"left\" colspan=\"2\"><strong>".toCharArray();
    __oracle_jsp_text[21] = 
    "</strong></td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"right\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                        </td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                            <td align=\"left\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                            </td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                            <td align=\"center\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                            </td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                            <td align=\"left\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                                            </td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n            <table align=\"center\" width=\"100%\">\r\n                <tr>\r\n                    <td height=\"20px\"> &nbsp; </td>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"center\" height=\"10px\" valign=\"middle\">\r\n                        <b>Seleccione una opci&oacute;n:</b><br/>\r\n                        <a href=\"javascript:checkAll()\">+ Seleccionar todas</a><br/>\r\n                        <a href=\"javascript:uncheckAll()\">- Ninguna</a>\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n\r\n            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n            \r\n            ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n            <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[41] = 
    "<br/><br/></span>\r\n        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(\"#10003\").prop(\"disabled\",true);\r\n        \r\n        function checkAll() {\r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('idGrupo');\r\n            for (var i = 0; i < checkboxes.length; i++) {\r\n                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {\r\n                    checkboxes[i].setAttribute('checked', true);\r\n                    $j(\"#10003\").prop(\"disabled\",false);\r\n                }\r\n            }\r\n            $j(\"#10003\").prop(\"disabled\",false);\r\n        }\r\n        \r\n        function uncheckAll() {\r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('idGrupo');\r\n            for (var i = 0; i < checkboxes.length; i++) {\r\n                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {\r\n                    checkboxes[i].removeAttribute('checked');\r\n                }\r\n            }\r\n            $j(\"#10003\").prop(\"disabled\",true);\r\n        }\r\n        \r\n        function searCheckeds(){\r\n            var cont = 0; \r\n            var checkboxes = new Array();\r\n            checkboxes = document.getElementsByName('idGrupo');\r\n            \r\n            for (var x=0; x < checkboxes.length; x++) {\r\n                if (checkboxes[x].checked) {\r\n                    cont = cont + 1;\r\n                }\r\n            }\r\n            if(cont > 0){\r\n                $j(\"#10003\").prop(\"disabled\",false);\r\n            } else { $j(\"#10003\").prop(\"disabled\",true); }\r\n        }\r\n        \r\n    </script>\r\n    \r\n".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
