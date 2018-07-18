package _web_2d_inf._jsp._clc._proceso;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _clcManualesCaptura extends com.orionserver.http.OrionHttpJspPage {


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
    _clcManualesCaptura page = this;
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
        __jsp_taghandler_1.setModelAttribute("clcManualesCapturaDTO");
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
                __jsp_taghandler_4.setCode("sireh.label.clc.proceso.clcManualesCaptura.titulo");
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
                __jsp_taghandler_5.setPath("secuencia");
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
                __jsp_taghandler_6.setPath("numCxlc");
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
                __jsp_taghandler_7.setCode("sireh.label.clc.proceso.clcManualesCaptura.subTitulo");
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
                __jsp_taghandler_8.setCode("sireh.label.clc.proceso.clcManualesCaptura.ciclo");
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
                __jsp_taghandler_10.setBeanName("tdCxlcCicloProcesaManuales");
                __jsp_taghandler_10.setPath("ciclo");
                __jsp_taghandler_10.setProgress("true");
                __jsp_taghandler_10.setOnchange("getQnaCaptura(false);getConsecutivos(false);");
                __jsp_taghandler_10.setStyle("width: 200px;");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.clc.proceso.clcManualesCaptura.cxlc");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_12=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setPath("cxlc");
                __jsp_taghandler_12.setDisabled("true");
                __jsp_taghandler_12.setSize("10");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.clc.proceso.clcManualesCaptura.tipoNomina");
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
              out.write(__oracle_jsp_text[17]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_14=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setKey("");
                __jsp_taghandler_14.setValue("selectList.nonValue");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_15=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setBeanName("tcTipoNominaProcesaManuales");
                __jsp_taghandler_15.setPath("tipoNomina");
                __jsp_taghandler_15.setProgress("true");
                __jsp_taghandler_15.setOnchange("getUnidad(false)");
                __jsp_taghandler_15.setStyle("width: 200px;");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.label.clc.proceso.clcManualesCaptura.importe");
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
                __jsp_taghandler_17.setPath("importe");
                __jsp_taghandler_17.setSize("10");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setCode("sireh.label.clc.proceso.clcManualesCaptura.qnaCaptura");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                  if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_18.doCatch(th);
                } finally {
                  __jsp_taghandler_18.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.clc.proceso.clcManualesCaptura.unidad");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.clc.proceso.clcManualesCaptura.iva");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_21=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setPath("iva");
                __jsp_taghandler_21.setDisabled("true");
                __jsp_taghandler_21.setSize("10");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setCode("sireh.label.clc.proceso.clcManualesCaptura.partida");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.clc.proceso.clcManualesCaptura.situacion");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.clc.proceso.clcManualesCaptura.nota");
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
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._textarea_tag __jsp_taghandler_25=(_oracle._jsp._tag._textarea_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._textarea_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setPath("nota");
                __jsp_taghandler_25.setCols("60");
                __jsp_taghandler_25.setRows("4");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_26=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setAction("clcProceso/clcManualesCxlcPrevia");
                __jsp_taghandler_26.setValue("submit.generate");
                __jsp_taghandler_26.setProgressBar("true");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_27=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setPath("cancel");
                __jsp_taghandler_27.setAction("clcProceso/clcManualesCaptura");
                __jsp_taghandler_27.setValue("submit.cancel");
                __jsp_taghandler_27.setProgressBar("true");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[32]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_29.setParent(__jsp_taghandler_28);
                      __jsp_taghandler_29.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcManualesCapturaDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[33]);
                          {
                            org.displaytag.tags.TableTag __jsp_taghandler_30=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag list pagesize requestURI class export id sort");
                            __jsp_taghandler_30.setParent(__jsp_taghandler_29);
                            __jsp_taghandler_30.setList((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcManualesCapturaDTO.clcToInsert}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_taghandler_30.setPagesize(10);
                            __jsp_taghandler_30.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_30.setClass("displaytag");
                            __jsp_taghandler_30.setExport(false);
                            __jsp_taghandler_30.setUid("cxlc");
                            __jsp_taghandler_30.setSort("list");
                            java.lang.Object cxlc = null;
                            java.lang.Integer cxlc_rowNum = null;
                            __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_30,__jsp_tag_starteval,out);
                                do {
                                  cxlc = (java.lang.Object) pageContext.findAttribute("cxlc");
                                  cxlc_rowNum = (java.lang.Integer) pageContext.findAttribute("cxlc_rowNum");
                                  out.write(__oracle_jsp_text[34]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_31=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_31.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_31.setProperty("cxlcCiclo");
                                    __jsp_taghandler_31.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcCiclo");
                                    __jsp_taghandler_31.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_31.doStartTag();
                                    if (__jsp_taghandler_31.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_31,5);
                                  }
                                  out.write(__oracle_jsp_text[35]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_32=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_32.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_32.setProperty("cxlcNumero");
                                    __jsp_taghandler_32.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcNumero");
                                    __jsp_taghandler_32.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                                    if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,5);
                                  }
                                  out.write(__oracle_jsp_text[36]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_33=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_33.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_33.setProperty("cxlcSecuencia");
                                    __jsp_taghandler_33.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcSecuencia");
                                    __jsp_taghandler_33.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                                    if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,5);
                                  }
                                  out.write(__oracle_jsp_text[37]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_34=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_34.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_34.setProperty("cxlcUnidadResponsable");
                                    __jsp_taghandler_34.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcUnidadResponsable");
                                    __jsp_taghandler_34.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                                    if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,5);
                                  }
                                  out.write(__oracle_jsp_text[38]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_35.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_35.setProperty("cxlcUnidadEjecutora");
                                    __jsp_taghandler_35.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcUnidadEjecutora");
                                    __jsp_taghandler_35.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                                    if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,5);
                                  }
                                  out.write(__oracle_jsp_text[39]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_36=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_36.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_36.setProperty("cxlcEstado");
                                    __jsp_taghandler_36.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcEstado");
                                    __jsp_taghandler_36.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                                    if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,5);
                                  }
                                  out.write(__oracle_jsp_text[40]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_37=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_37.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_37.setProperty("cxlcFuncion");
                                    __jsp_taghandler_37.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcFuncion");
                                    __jsp_taghandler_37.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                                    if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,5);
                                  }
                                  out.write(__oracle_jsp_text[41]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_38=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_38.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_38.setProperty("cxlcPrograma");
                                    __jsp_taghandler_38.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcPrograma");
                                    __jsp_taghandler_38.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                    if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,5);
                                  }
                                  out.write(__oracle_jsp_text[42]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_39=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_39.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_39.setProperty("cxlcActInst");
                                    __jsp_taghandler_39.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcActInst");
                                    __jsp_taghandler_39.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                                    if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,5);
                                  }
                                  out.write(__oracle_jsp_text[43]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_40=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_40.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_40.setProperty("cxlcActInstPri");
                                    __jsp_taghandler_40.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcActInstPri");
                                    __jsp_taghandler_40.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                                    if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,5);
                                  }
                                  out.write(__oracle_jsp_text[44]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_41=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_41.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_41.setProperty("cxlcActInstEsp");
                                    __jsp_taghandler_41.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcActInstEsp");
                                    __jsp_taghandler_41.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                                    if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,5);
                                  }
                                  out.write(__oracle_jsp_text[45]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_42=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_42.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_42.setProperty("cxlcPartida");
                                    __jsp_taghandler_42.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcPartida");
                                    __jsp_taghandler_42.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                                    if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,5);
                                  }
                                  out.write(__oracle_jsp_text[46]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_43=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_43.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_43.setProperty("cxlcTipoGasto");
                                    __jsp_taghandler_43.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcTipoGasto");
                                    __jsp_taghandler_43.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                                    if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,5);
                                  }
                                  out.write(__oracle_jsp_text[47]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_44=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_44.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_44.setProperty("cxlcFuente");
                                    __jsp_taghandler_44.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcFuente");
                                    __jsp_taghandler_44.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                                    if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,5);
                                  }
                                  out.write(__oracle_jsp_text[48]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_45.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_45.setProperty("cxlcSecuenciaSiaff");
                                    __jsp_taghandler_45.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcSecuenciaSiaff");
                                    __jsp_taghandler_45.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                                    if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,5);
                                  }
                                  out.write(__oracle_jsp_text[49]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_46=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable format style");
                                    __jsp_taghandler_46.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_46.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcMonto");
                                    __jsp_taghandler_46.setSortable(false);
                                    __jsp_taghandler_46.setFormat("$ {0,number,#,##0.00}");
                                    __jsp_taghandler_46.setStyle("text-align: right;");
                                    __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                    {
                                      try {
                                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_46,__jsp_tag_starteval,out);
                                        do {
                                          out.write(__oracle_jsp_text[50]);
                                          {
                                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                            __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                                            __jsp_taghandler_47.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${cxlc.cxlcMonto}",java.lang.Object.class, __ojsp_varRes,null));
                                            __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                                            if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                              return;
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,6);
                                          }
                                          out.write(__oracle_jsp_text[51]);
                                        } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      finally {
                                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                      }
                                    }
                                    if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,5);
                                  }
                                  out.write(__oracle_jsp_text[52]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_48.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_48.setProperty("cxlcNota");
                                    __jsp_taghandler_48.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcNota");
                                    __jsp_taghandler_48.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                                    if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,5);
                                  }
                                  out.write(__oracle_jsp_text[53]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_49=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_49.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_49.setProperty("cxlcIva");
                                    __jsp_taghandler_49.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcIva");
                                    __jsp_taghandler_49.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                                    if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,5);
                                  }
                                  out.write(__oracle_jsp_text[54]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_50=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable");
                                    __jsp_taghandler_50.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_50.setProperty("cxlcUsuario");
                                    __jsp_taghandler_50.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcUsuario");
                                    __jsp_taghandler_50.setSortable(false);
                                    __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                                    if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,5);
                                  }
                                  out.write(__oracle_jsp_text[55]);
                                  {
                                    org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format");
                                    __jsp_taghandler_51.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_51.setProperty("cxlcFechaModificacion");
                                    __jsp_taghandler_51.setTitleKey("sireh.label.clc.proceso.clcManuales.cxlcFechaModificacion");
                                    __jsp_taghandler_51.setSortable(false);
                                    __jsp_taghandler_51.setFormat("{0,date,dd-MM-yyyy}");
                                    __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                                    if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,5);
                                  }
                                  out.write(__oracle_jsp_text[56]);
                                  {
                                    org.displaytag.tags.SetPropertyTag __jsp_taghandler_52=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                                    __jsp_taghandler_52.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_52.setName("paging.banner.placement");
                                    __jsp_taghandler_52.setValue("bottom");
                                    __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                                    if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,5);
                                  }
                                  out.write(__oracle_jsp_text[57]);
                                  {
                                    org.displaytag.tags.SetPropertyTag __jsp_taghandler_53=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                                    __jsp_taghandler_53.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_53.setName("export.pdf");
                                    __jsp_taghandler_53.setValue("false");
                                    __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                                    if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,5);
                                  }
                                  out.write(__oracle_jsp_text[58]);
                                  {
                                    org.displaytag.tags.SetPropertyTag __jsp_taghandler_54=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                                    __jsp_taghandler_54.setParent(__jsp_taghandler_30);
                                    __jsp_taghandler_54.setName("basic.msg.empty_list");
                                    __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                    {
                                      try {
                                        out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_54,__jsp_tag_starteval,out);
                                        do {
                                          out.write(__oracle_jsp_text[59]);
                                          {
                                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_55=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                                            __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                                            __jsp_taghandler_55.setCode("pagedList.empty.content");
                                            try {
                                              __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                                              if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                return;
                                            } catch (Throwable th) {
                                              __jsp_taghandler_55.doCatch(th);
                                            } finally {
                                              __jsp_taghandler_55.doFinally();
                                            }
                                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,6);
                                          }
                                          out.write(__oracle_jsp_text[60]);
                                        } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                      }
                                      finally {
                                        out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                      }
                                    }
                                    if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                      return;
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,5);
                                  }
                                  out.write(__oracle_jsp_text[61]);
                                } while (__jsp_taghandler_30.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,4);
                          }
                          out.write(__oracle_jsp_text[62]);
                        } while (__jsp_taghandler_29.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,3);
                    }
                    out.write(__oracle_jsp_text[63]);
                  } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
              }
              out.write(__oracle_jsp_text[64]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_56=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setJspContext(pageContext);
                __jsp_taghandler_56.setAction("clcProceso/clcManualesCxlcGuardar");
                __jsp_taghandler_56.setValue("submit.save");
                __jsp_taghandler_56.setProgressBar("true");
                __jsp_taghandler_56.setAlertCode("confirm.clc.proceso.manual.captura");
                __jsp_taghandler_56.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_56, pageContext);
              }
              out.write(__oracle_jsp_text[65]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_57=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcManualesCapturaDTO.tipoNomina}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,2);
              }
              out.write(__oracle_jsp_text[66]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_58=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcManualesCapturaDTO.qnaCaptura}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,2);
              }
              out.write(__oracle_jsp_text[67]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcManualesCapturaDTO.unidad}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,2);
              }
              out.write(__oracle_jsp_text[68]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_60=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${clcManualesCapturaDTO.partida}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,2);
              }
              out.write(__oracle_jsp_text[69]);
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
  private static final char __oracle_jsp_text[][]=new char[70][];
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
    "\r\n\r\n<script type=\"text/javascript\">\r\n    function formato_numero(numero, decimales, separador_decimal, separador_miles){\r\n         numero = parseFloat(numero);\r\n         if (isNaN(numero)) {\r\n             return \"\";\r\n         }\r\n    \r\n         if (decimales !== undefined) {\r\n             // Redondeamos\r\n             numero = numero.toFixed(decimales);\r\n         }\r\n    \r\n         // Convertimos el punto en separador_decimal\r\n         numero = numero.toString().replace(\".\", separador_decimal!==undefined ? separador_decimal : \",\");\r\n    \r\n         if (separador_miles) {\r\n             // Añadimos los separadores de miles\r\n             var miles = new RegExp(\"(-?[0-9]+)([0-9]{3})\");\r\n             while (miles.test(numero)) {\r\n                 numero = numero.replace(miles, \"$1\" + separador_miles + \"$2\");\r\n             }\r\n         }\r\n         return numero;\r\n    }\r\n</script>\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[6] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    " - \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    \r\n    <table align=\"center\" width=\"100%\">        \r\n        <tr valign=\"top\">\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\">\r\n                        <strong>&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[11] = 
    "&nbsp;&nbsp;</strong>\r\n                    </legend>\r\n                    <table>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                <select name='qnaCaptura' id='qnaCaptura'>\r\n                                    <option value=''>SELECCIONE...</option>\r\n                                </select>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                <select name='unidad' id='unidad'>\r\n                                    <option value=''>SELECCIONE...</option>\r\n                                </select>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                <select name='partida' id='partida'>\r\n                                    <option value=''>SELECCIONE...</option>\r\n                                </select>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">CAPTURADA</td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td width=\"200px\" align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                            <td width=\"200px\" align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"left\" height=\"20px\" valign=\"middle\"> &nbsp; </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[30] = 
    " &nbsp; \r\n                            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <br/>\r\n    <fieldset>\r\n        <legend style=\"font-size:1.3em\">\r\n            <strong>&nbsp;&nbsp; CXLC &nbsp;&nbsp;</strong>\r\n        </legend>\r\n        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                <div id=\"displayTagDiv\" style=\"width:1000px;overflow:auto;\">                                                                             \r\n                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[45] = 
    "                       \r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[48] = 
    "                \r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[49] = 
    " \r\n                        ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                            <div id=\"monto\">".toCharArray();
    __oracle_jsp_text[51] = 
    "</div>\r\n                        ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[53] = 
    " \r\n                        ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                        \r\n                        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                            <br><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[60] = 
    "<br><br></span>\r\n                        ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                </div>\r\n            ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n    </fieldset>\r\n    \r\n    <table align=\"center\" width=\"100%\">        \r\n        <tr valign=\"top\">\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"left\" height=\"20px\" valign=\"middle\"> &nbsp; </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        divs = document.getElementsByTagName('div');\r\n        for (i = 0; i < divs.length; i++) {\r\n            if (divs[i].id == 'monto') {\r\n                divs[i].innerHTML = formato_numero(divs[i].innerHTML,2,'.',',');\r\n            }\r\n        }\r\n        \r\n        function getConsecutivos(verify) {\r\n            var ciclo = $j('select[id=\"ciclo\"]').val();\r\n            //console.log(ciclo);\r\n            $j.ajax({\r\n                url: 'getNumCxlcCallback.do',\r\n                type: 'GET',\r\n                data: 'ciclo=' + ciclo,\r\n                success: function(data) {\r\n                    //console.log(\"success: \" + data);\r\n                    $j('#cxlc').val(\"\");\r\n                    $j('#cxlc').val(data);\r\n                    \r\n                    $j('#numCxlc').val(\"\");\r\n                    $j('#numCxlc').val(data);\r\n                }\r\n            });\r\n        }\r\n        \r\n        function getQnaCaptura(verify) {\r\n            var ciclo = $j('select[id=\"ciclo\"]').val();\r\n            //console.log(ciclo);\r\n            $j.ajax({\r\n                url: 'getQnaCapturaCallback.do',\r\n                type: 'GET',\r\n                data: 'ciclo=' + ciclo,\r\n                success: function(data) {\r\n                    //console.log(\"success\");\r\n                    $j('select[id=\"qnaCaptura\"]').find('option').remove().end();\r\n                    $j('select[id=\"qnaCaptura\"]').append(data);\r\n                    \r\n                    if (verify) {\r\n                        verifyQnaCaptura();\r\n                    }\r\n                }\r\n            });\r\n        }\r\n        function getUnidad(verify) {\r\n            var idTipoNomina = $j('select[id=\"tipoNomina\"]').val();\r\n            //console.log(idTipoNomina);\r\n            if (idTipoNomina != null && idTipoNomina != \"\") {\r\n            \r\n                if (idTipoNomina == 'DH' || idTipoNomina == 'CE') {\r\n                    $j('#iva').prop('disabled', false);\r\n                    $j('#iva').val(0.00);\r\n                } else {\r\n                    $j('#iva').prop('disabled', true);\r\n                    $j('#iva').val(0.00);\r\n                }\r\n                $j.ajax({\r\n                    url: 'getUnidadCallback.do',\r\n                    type: 'GET',\r\n                    data: 'idTipoNomina=' + idTipoNomina,\r\n                    success: function(data) {\r\n                        //console.log(\"success\");\r\n                        $j('select[id=\"unidad\"]').find('option').remove().end();\r\n                        $j('select[id=\"unidad\"]').append(data);\r\n                        \r\n                        if (verify) {\r\n                            verifyUnidad();\r\n                        }\r\n                    }\r\n                });\r\n                $j.ajax({\r\n                    url: 'getPartidaCallback.do',\r\n                    type: 'GET',\r\n                    data: 'idTipoNomina=' + idTipoNomina,\r\n                    success: function(data) {\r\n                        //console.log(\"success\");\r\n                        $j('select[id=\"partida\"]').find('option').remove().end();\r\n                        $j('select[id=\"partida\"]').append(data);\r\n                        \r\n                        if (verify) {\r\n                            verifyPartida();\r\n                        }\r\n                    }\r\n                });\r\n            }            \r\n        }\r\n        \r\n        function verifyTipoNomina() {\r\n            var idTipoNomina = '".toCharArray();
    __oracle_jsp_text[66] = 
    "';\r\n            //console.log(idTipoNomina);\r\n            if (idTipoNomina != null && idTipoNomina != \"\") {\r\n                $j(\"#tipoNomina option[value=\" + idTipoNomina +\"]\").attr(\"selected\",\"selected\") ;\r\n            }\r\n        }\r\n        function verifyQnaCaptura() {\r\n            var qnaCaptura = '".toCharArray();
    __oracle_jsp_text[67] = 
    "';\r\n            //console.log(qnaCaptura);\r\n            if (qnaCaptura != null && qnaCaptura != \"\") {\r\n                $j(\"#qnaCaptura option[value=\" + qnaCaptura +\"]\").attr(\"selected\",\"selected\") ;\r\n            }\r\n        }\r\n        function verifyUnidad() {\r\n            var unidad = '".toCharArray();
    __oracle_jsp_text[68] = 
    "';\r\n            //console.log(unidad);\r\n            if (unidad != null && unidad != \"\") {\r\n                $j(\"#unidad option[value=\" + unidad +\"]\").attr(\"selected\",\"selected\") ;\r\n            }\r\n        }\r\n        function verifyPartida() {\r\n            var partida = '".toCharArray();
    __oracle_jsp_text[69] = 
    "';\r\n            //console.log(partida);\r\n            if (partida != null && partida != \"\") {\r\n                $j(\"#partida option[value=\" + partida +\"]\").attr(\"selected\",\"selected\") ;\r\n            }\r\n        }\r\n        \r\n        // Ciclo\r\n        getQnaCaptura(true);\r\n        //getConsecutivos(true);\r\n        \r\n        // Tipo nomina\r\n        verifyTipoNomina();\r\n        \r\n        // Unidad\r\n        getUnidad(true);\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
