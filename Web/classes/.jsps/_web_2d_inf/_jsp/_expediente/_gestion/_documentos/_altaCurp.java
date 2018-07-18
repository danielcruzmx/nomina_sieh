package _web_2d_inf._jsp._expediente._gestion._documentos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _altaCurp extends com.orionserver.http.OrionHttpJspPage {


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
    _altaCurp page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute enctype");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("expedienteCurpDTO");
        __jsp_taghandler_1.setEnctype("multipart/form-data");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("rfcEmpleadoBusqueda");
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
                __jsp_taghandler_6.setPath("totalRegistrados");
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
                __jsp_taghandler_7.setPath("totalRechazados");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("rolRegistrar");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("rolAutorizar");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setPath("rolRechazar");
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
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.title");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.oficinaVirtual.gestionDocumentos.expedientePersonal.title");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                  if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_12.doCatch(th);
                } finally {
                  __jsp_taghandler_12.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_13=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setPath("nombreEmpleadoCompleto");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setText("Datos");
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
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("casa.jpg");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                  if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_15.doCatch(th);
                } finally {
                  __jsp_taghandler_15.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setText("personales");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.curp");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_18=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("curp");
                __jsp_taghandler_18.setMaxlength("18");
                __jsp_taghandler_18.setSize("18");
                __jsp_taghandler_18.setCss("anchoInput");
                __jsp_taghandler_18.setUppercase("true");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.folio");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_20=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setPath("folio");
                __jsp_taghandler_20.setMaxlength("20");
                __jsp_taghandler_20.setSize("20");
                __jsp_taghandler_20.setCss("anchoInput");
                __jsp_taghandler_20.setUppercase("true");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(expedienteCurpDTO.rolAutorizar || expedienteCurpDTO.rolRechazar) && (expedienteCurpDTO.totalRegistrados > 0)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[25]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_22.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.rechazo");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
                        if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_22.doCatch(th);
                      } finally {
                        __jsp_taghandler_22.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,3);
                    }
                    out.write(__oracle_jsp_text[26]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_23=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_23.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_23.setJspContext(pageContext);
                      __jsp_taghandler_23.setKey("");
                      __jsp_taghandler_23.setValue("selectList.nonValue");
                      __jsp_taghandler_23.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                    }
                    out.write(__oracle_jsp_text[27]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_24=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_24.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_24.setJspContext(pageContext);
                      __jsp_taghandler_24.setBeanName("tcExpRechazo-altaCurp");
                      __jsp_taghandler_24.setPath("rechazo");
                      __jsp_taghandler_24.setStyle("width:200px;");
                      __jsp_taghandler_24.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                    }
                    out.write(__oracle_jsp_text[28]);
                  } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.documentoSoporte");
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
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_26=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setPath("registrar");
                __jsp_taghandler_26.setAction((java.lang.String) ("gestionDocumentos/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteCurpDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_26.setValue("submit.save");
                __jsp_taghandler_26.setProgressBar("true");
                __jsp_taghandler_26.setAlertCode("confirm.expediente.alta.guardar");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_27=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setPath("autorizar");
                __jsp_taghandler_27.setAction("gestionDocumentos/autorizaAltaCurp.do");
                __jsp_taghandler_27.setValue("submit.autorizar");
                __jsp_taghandler_27.setProgressBar("true");
                __jsp_taghandler_27.setAlertCode("confirm.expediente.alta.autorizar");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_28=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setPath("rechazar");
                __jsp_taghandler_28.setAction("gestionDocumentos/rechazaAltaCurp.do");
                __jsp_taghandler_28.setValue("submit.rechazar");
                __jsp_taghandler_28.setProgressBar("true");
                __jsp_taghandler_28.setAlertCode("confirm.expediente.alta.rechazar");
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[33]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_29=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setPath("eliminar");
                __jsp_taghandler_29.setAction("gestionDocumentos/eliminarCurp.do");
                __jsp_taghandler_29.setValue("submit.delete");
                __jsp_taghandler_29.setProgressBar("true");
                __jsp_taghandler_29.setAlertCode("confirm.expediente.eliminar");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_30=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("cancel");
                __jsp_taghandler_30.setAction("gestionDocumentos/busquedaDocEmpleado.do");
                __jsp_taghandler_30.setValue("submit.cancel");
                __jsp_taghandler_30.setProgressBar("true");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[36]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_32=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setProperty("EC.RFC_EMPLEADO");
                __jsp_taghandler_32.setCondition("=");
                __jsp_taghandler_32.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_33=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteCurpDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_33.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteCurpDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_33.setAppendFilters("false");
                __jsp_taghandler_33.setMaxRows("200");
                __jsp_taghandler_33.setJspBody(new _altaCurp_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_33, __ojsp_varRes));
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteCurpDTO.rolRegistrar}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,2);
              }
              out.write(__oracle_jsp_text[39]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_54=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteCurpDTO.rolAutorizar}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,2);
              }
              out.write(__oracle_jsp_text[40]);
              out.write(__oracle_jsp_text[41]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_55=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteCurpDTO.rolRegistrar && expedienteCurpDTO.totalRegistrados == 0 && expedienteCurpDTO.totalRechazados == 0}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[42]);
                  } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,2);
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

  private class _altaCurp_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _altaCurp_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_33       = parent;
      out.write("\r\n                                                    <div id=\"displayTagDiv\" style=\"width:1000px;height:350px;overflow:auto;\">\r\n                                                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_34=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_34.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_33));
        __jsp_taghandler_34.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteCurpDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_34.setPagesize(200);
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
              out.write("                                                                     \r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_35=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_35.setParent(__jsp_taghandler_34);
                __jsp_taghandler_35.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.docGrupo");
                __jsp_taghandler_35.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_35,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                ");
                      {
                        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_36=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                        __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                                                    ");
                            {
                              org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_37=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                              __jsp_taghandler_37.setParent(__jsp_taghandler_36);
                              __jsp_taghandler_37.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ (row.idStatus == 'REG' && (expedienteCurpDTO.rolRegistrar || expedienteCurpDTO.rolAutorizar || expedienteCurpDTO.rolRechazar)) || (row.idStatus == 'REC' && expedienteCurpDTO.rolRegistrar) }",java.lang.Boolean.class, __ojsp_varRes,null)));
                              __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write("\r\n                                                                            <input name=\"docGrupo\" \r\n                                                                                   class=\"box\"\r\n                                                                                   type=\"checkbox\" \r\n                                                                                   value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_38.setParent(__jsp_taghandler_37);
                                    __jsp_taghandler_38.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.rfcEmpleado}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idDocto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.curpSecuencia}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.curpDoctoRef}",java.lang.String.class, __ojsp_varRes, null)));
                                    __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                                    if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,7);
                                  }
                                  out.write("\"/>\r\n                                                                    ");
                                } while (__jsp_taghandler_37.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,6);
                            }
                            out.write("\r\n                                                                    ");
                            {
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                              __jsp_taghandler_39.setParent(__jsp_taghandler_36);
                              __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write("\r\n                                                                        - \r\n                                                                    ");
                                } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,6);
                            }
                            out.write("\r\n                                                                ");
                          } while (__jsp_taghandler_36.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,5);
                      }
                      out.write("\r\n                                                            ");
                    } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_40=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_40.setParent(__jsp_taghandler_34);
                __jsp_taghandler_40.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.documento");
                __jsp_taghandler_40.setSortable(false);
                __jsp_taghandler_40.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_40,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <a href='downloadFile.do?uuid=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_41.setParent(__jsp_taghandler_40);
                        __jsp_taghandler_41.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.curpDoctoRef}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                        if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,5);
                      }
                      out.write("' title=\"Descargar documento\" target=\"_blank\">\r\n                                                                    <img src='");
                      {
                        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                        __jsp_taghandler_42.setParent(__jsp_taghandler_40);
                        __jsp_taghandler_42.setCode("pdf-download.jpg");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                          if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_42.doCatch(th);
                        } finally {
                          __jsp_taghandler_42.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,5);
                      }
                      out.write("' border=\"0\" width=\"20\"/>\r\n                                                                </a>\r\n                                                            ");
                    } while (__jsp_taghandler_40.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_43=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_43.setParent(__jsp_taghandler_34);
                __jsp_taghandler_43.setProperty("curpSecuencia");
                __jsp_taghandler_43.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.id");
                __jsp_taghandler_43.setSortable(false);
                __jsp_taghandler_43.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_44=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_44.setParent(__jsp_taghandler_34);
                __jsp_taghandler_44.setProperty("curpCve");
                __jsp_taghandler_44.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.curpClave");
                __jsp_taghandler_44.setSortable(false);
                __jsp_taghandler_44.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_45=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_45.setParent(__jsp_taghandler_34);
                __jsp_taghandler_45.setProperty("curpFolio");
                __jsp_taghandler_45.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.curpFolio");
                __jsp_taghandler_45.setSortable(false);
                __jsp_taghandler_45.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_46=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_46.setParent(__jsp_taghandler_34);
                __jsp_taghandler_46.setProperty("desStatus");
                __jsp_taghandler_46.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.estado");
                __jsp_taghandler_46.setSortable(false);
                __jsp_taghandler_46.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_34);
                __jsp_taghandler_47.setProperty("descRechazo");
                __jsp_taghandler_47.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.rechazo");
                __jsp_taghandler_47.setSortable(false);
                __jsp_taghandler_47.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_48.setParent(__jsp_taghandler_34);
                __jsp_taghandler_48.setProperty("fecModifico");
                __jsp_taghandler_48.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.fecModifico");
                __jsp_taghandler_48.setSortable(false);
                __jsp_taghandler_48.setFormat("{0,date,dd/MM/yyyy}");
                __jsp_taghandler_48.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_49=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_49.setParent(__jsp_taghandler_34);
                __jsp_taghandler_49.setName("paging.banner.placement");
                __jsp_taghandler_49.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_50=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_50.setParent(__jsp_taghandler_34);
                __jsp_taghandler_50.setName("export.pdf");
                __jsp_taghandler_50.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_51=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_51.setParent(__jsp_taghandler_34);
                __jsp_taghandler_51.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_51,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <br/><span class=\"pagebanner\">&nbsp;</span>\r\n                                                                <span class=\"norecords\">\r\n                                                                    ");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_52.setParent(__jsp_taghandler_51);
                        __jsp_taghandler_52.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                          if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_52.doCatch(th);
                        } finally {
                          __jsp_taghandler_52.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,5);
                      }
                      out.write("\r\n                                                                    <br/>\r\n                                                                    <br/>\r\n                                                                </span>\r\n                                                            ");
                    } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,4);
              }
              out.write("\r\n                                                        ");
            } while (__jsp_taghandler_34.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,3);
      }
      out.write("\r\n                                                    </div>\r\n                                                ");
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

  private static final char __oracle_jsp_text[][]=new char[44][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n</style>\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "    \r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[15] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr align=\"left\">\r\n            <td>\r\n                <h1>".toCharArray();
    __oracle_jsp_text[16] = 
    " ".toCharArray();
    __oracle_jsp_text[17] = 
    "</h1>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            <fieldset>\r\n                                <legend>\r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[18] = 
    "</strong>\r\n                                    <img class=\"fotografia\" width=\"55\" src=\"".toCharArray();
    __oracle_jsp_text[19] = 
    "\" align=\"middle\"/>       \r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[20] = 
    "</strong>\r\n                                </legend>\r\n                                <table width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"left\">\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>Alta de clave &uacute;nica de registro de poblaci&oacute;n</strong></legend><br/>\r\n                                                <table width=\"70%\">\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                                        <tr align=\"left\">\r\n                                                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                                                            <td align=\"left\" colspan=\"3\">\r\n                                                                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                                                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                                    <tr align=\"center\">\r\n                                                        <td colspan=\"4\">&nbsp;</td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                                                        <td align=\"left\" colspan=\"3\">\r\n                                                            <input type=\"file\" name=\"documentoSoporte\" id=\"documentoSoporte\" value=\"*.*\" size=\"50\" class=\"anchoInput\"/>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                                <table width=\"100%\">\r\n                                                    <tr align=\"center\">\r\n                                                        <td>&nbsp;</td>\r\n                                                    </tr>\r\n                                                    <tr align=\"center\">\r\n                                                        <td>                                                            \r\n                                                            ".toCharArray();
    __oracle_jsp_text[31] = 
    " &nbsp; \r\n                                                            ".toCharArray();
    __oracle_jsp_text[32] = 
    " &nbsp; \r\n                                                            ".toCharArray();
    __oracle_jsp_text[33] = 
    " &nbsp;\r\n                                                            ".toCharArray();
    __oracle_jsp_text[34] = 
    " &nbsp;            \r\n                                                            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr align=\"center\">\r\n                                        <td>&nbsp;</td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                                            <strong>\r\n                                                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                                            </strong>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr align=\"center\">\r\n                                        <td>&nbsp;</td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td>\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>Antecedentes de clave &uacute;nica de registro de poblaci&oacute;n</strong></legend>\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                            </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    \r\n    <script type=\"text/javascript\">\r\n        function enableRegistrarButtons(){\r\n            // Boton registrar\r\n            $j(\"#10001\").removeAttr('disabled');\r\n        }\r\n        function disableRegistrarButtons(){\r\n            // Boton registrar\r\n            $j(\"#10001\").attr('disabled','true');\r\n        }\r\n        \r\n        function disableAutorizarButtons(){\r\n            // Boton autorizar\r\n            $j(\"#10002\").attr('disabled','true');\r\n            // Boton rechazar\r\n            $j(\"#10003\").attr('disabled','true');\r\n        }\r\n        function enableAutorizarButtons(){            \r\n            // Boton autorizar\r\n            $j(\"#10002\").removeAttr('disabled');\r\n            // Boton rechazar\r\n            $j(\"#10003\").removeAttr('disabled');\r\n        }\r\n        function enableEliminarButtons(){\r\n            $j(\"#10004\").removeAttr('disabled','true');\r\n        }\r\n        function disableEliminarButtons(){\r\n            $j(\"#10004\").attr('disabled','true');\r\n        }\r\n        \r\n        function disableFormButtons(){\r\n            $j(\"#curp\").prop('disabled', 'true');\r\n            $j(\"#folio\").prop('disabled', 'true');\r\n            $j(\"#documentoSoporte\").prop('disabled', 'true');\r\n        }\r\n        function enableFormButtons(){\r\n            $j(\"#curp\").removeAttr('disabled');\r\n            $j(\"#folio\").removeAttr('disabled');\r\n            $j(\"#documentoSoporte\").removeAttr('disabled');\r\n        }\r\n        function cleanForm(){\r\n            $j(\"#curp\").val('');\r\n            $j(\"#folio\").val('');\r\n            $j(\"#documentoSoporte\").val('');\r\n        }\r\n        disableRegistrarButtons();\r\n        disableAutorizarButtons();\r\n        disableEliminarButtons();\r\n    </script>\r\n    \r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(document).ready(function(){\r\n            $j('#curp').mask('AAAAAAAAAAAAAAAAAA');\r\n            $j('#folio').mask('AAAAAAAAAAAAAAAAAAAA');\r\n        });\r\n\r\n        var rolRegistrar = ".toCharArray();
    __oracle_jsp_text[39] = 
    ";\r\n        var rolAutorizar = ".toCharArray();
    __oracle_jsp_text[40] = 
    ";\r\n        $j('.box').change(function(){\r\n            disableRegistrarButtons();\r\n            disableAutorizarButtons();\r\n            disableEliminarButtons();\r\n            $j('.box:checked').each(function(){\r\n                var auxCurpClave = $j(this).parent().next('td').next('td').next('td').text();\r\n                var auxRcfFolio = $j(this).parent().next('td').next('td').next('td').next('td').text();\r\n                \r\n                $j(\"#curp\").val(auxCurpClave);\r\n                $j(\"#folio\").val(auxRcfFolio);\r\n                \r\n                 // Rechazo\r\n                var auxRechazo  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxRechazo2 = auxRechazo.split(\" - \");\r\n                $j(\"#rechazo\").val(auxRechazo2);\r\n                \r\n                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();\r\n                if (auxEstatus == 'RECHAZADO') {\r\n                    if(rolRegistrar){\r\n                        enableRegistrarButtons();\r\n                    }\r\n                    disableAutorizarButtons();\r\n                    enableFormButtons();\r\n                }\r\n                if (auxEstatus == 'REGISTRO') {\r\n                    if(rolAutorizar){\r\n                        enableAutorizarButtons();\r\n                        disableRegistrarButtons();\r\n                        disableFormButtons();\r\n                    } else {\r\n                        disableAutorizarButtons();\r\n                        disableFormButtons();\r\n                        enableEliminarButtons();\r\n                    }\r\n                }\r\n            });\r\n        });\r\n        \r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n        \r\n        // Checkbox unico\r\n        $j(':checkbox').on('change',function(){\r\n            var th = $j(this), name = th.prop('name'); \r\n            if(th.is(':checked')){\r\n                $j(':checkbox[name=\"'  + name + '\"]').not($(this)).prop('checked',false);   \r\n            } else {\r\n                cleanForm();\r\n            }\r\n        });\r\n    </script>\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n        <script type=\"text/javascript\">\r\n            $j(document).ready(function(){\r\n                enableRegistrarButtons();\r\n            });\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
