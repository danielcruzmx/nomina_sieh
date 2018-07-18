package _web_2d_inf._jsp._expediente._gestion._documentos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _modificacionDescripcion extends com.orionserver.http.OrionHttpJspPage {


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
    _modificacionDescripcion page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("expedienteModificacionDescripcionDTO");
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
                __jsp_taghandler_6.setPath("idTipoDoctoBusqueda");
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
                __jsp_taghandler_7.setPath("hiddenIdDocto");
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
                __jsp_taghandler_8.setCode("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.title");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.oficinaVirtual.gestionDocumentos.expedientePersonal.title");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_10=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setPath("nombreEmpleadoCompleto");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setText("Datos");
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
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("casa.jpg");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setText("personales");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.documento");
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
                __jsp_taghandler_16.setBeanName("tcTipoDoctosExpediente-altaDocumentosSinCaptura");
                __jsp_taghandler_16.setPath("auxDocto");
                __jsp_taghandler_16.setDisabled("true");
                __jsp_taghandler_16.setStyle("width:500px;");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.auxDescripcionDocto");
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
                __jsp_taghandler_19.setBeanName("tcDescripcionAux-documentosSinDatos");
                __jsp_taghandler_19.setPath("auxDescripcionDocto");
                __jsp_taghandler_19.setParentPath("auxDocto");
                __jsp_taghandler_19.setProgress("true");
                __jsp_taghandler_19.setStyle("width:500px;");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.auxdsdDescripDocto");
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
                __jsp_taghandler_21.setPath("auxdsdDescripDocto");
                __jsp_taghandler_21.setMaxlength("100");
                __jsp_taghandler_21.setSize("120");
                __jsp_taghandler_21.setUppercase("true");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setCode("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.auxAnioDocto");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_23=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setPath("auxAnioDocto");
                __jsp_taghandler_23.setMaxlength("4");
                __jsp_taghandler_23.setSize("5");
                __jsp_taghandler_23.setCss("numeric");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.auxEstadoDocto");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_25=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setKey("");
                __jsp_taghandler_25.setValue("selectList.nonValue");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_26=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setBeanName("tcEstadoRegistro-modificacionDescripcion");
                __jsp_taghandler_26.setPath("auxEstadoDocto");
                __jsp_taghandler_26.setStyle("width:200px;");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_27=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setPath("registrar");
                __jsp_taghandler_27.setAction((java.lang.String) ("gestionDocumentos/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteModificacionDescripcionDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_27.setValue("submit.save");
                __jsp_taghandler_27.setProgressBar("true");
                __jsp_taghandler_27.setAlertCode("confirm.expediente.alta.guardar");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_28=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setPath("cancel");
                __jsp_taghandler_28.setAction((java.lang.String) ("gestionDocumentos/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteModificacionDescripcionDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_28.setValue("submit.cancel");
                __jsp_taghandler_28.setProgressBar("true");
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[33]);
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_30=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setProperty("ED.ID_DOCTO");
                __jsp_taghandler_30.setCondition("=");
                __jsp_taghandler_30.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_31=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setProperty("EMPD.RFC_UNICO");
                __jsp_taghandler_31.setCondition("contains");
                __jsp_taghandler_31.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_32=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setProperty("CAP.ID_DOCTO");
                __jsp_taghandler_32.setCondition("=");
                __jsp_taghandler_32.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_33=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setProperty("EMPCAP.RFC_UNICO");
                __jsp_taghandler_33.setCondition("contains");
                __jsp_taghandler_33.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              out.write(__oracle_jsp_text[40]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_34=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setProperty("DANA.ID_DOCTO");
                __jsp_taghandler_34.setCondition("=");
                __jsp_taghandler_34.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_35=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setProperty("EMPDN.RFC_UNICO");
                __jsp_taghandler_35.setCondition("contains");
                __jsp_taghandler_35.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_36=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setProperty("CM.ID_DOCTO");
                __jsp_taghandler_36.setCondition("=");
                __jsp_taghandler_36.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_37=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setJspContext(pageContext);
                __jsp_taghandler_37.setProperty("EMPCM.RFC_UNICO");
                __jsp_taghandler_37.setCondition("contains");
                __jsp_taghandler_37.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_37.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_38=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setProperty("AA.ID_DOCTO");
                __jsp_taghandler_38.setCondition("=");
                __jsp_taghandler_38.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_39=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setProperty("EMPAC.RFC_UNICO");
                __jsp_taghandler_39.setCondition("contains");
                __jsp_taghandler_39.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[48]);
              out.write(__oracle_jsp_text[49]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_40=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setProperty("EC.ID_DOCTO");
                __jsp_taghandler_40.setCondition("=");
                __jsp_taghandler_40.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[50]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_41=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setProperty("EMPC.RFC_UNICO");
                __jsp_taghandler_41.setCondition("contains");
                __jsp_taghandler_41.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[51]);
              out.write(__oracle_jsp_text[52]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_42=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setProperty("CTA.ID_DOCTO");
                __jsp_taghandler_42.setCondition("=");
                __jsp_taghandler_42.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[53]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_43=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setJspContext(pageContext);
                __jsp_taghandler_43.setProperty("EMPCTA.RFC_UNICO");
                __jsp_taghandler_43.setCondition("contains");
                __jsp_taghandler_43.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_43.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
              }
              out.write(__oracle_jsp_text[54]);
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_44=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setProperty("EDOM.ID_DOCTO");
                __jsp_taghandler_44.setCondition("=");
                __jsp_taghandler_44.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_45=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setProperty("EMPDOM.RFC_UNICO");
                __jsp_taghandler_45.setCondition("contains");
                __jsp_taghandler_45.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
              out.write(__oracle_jsp_text[58]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_46=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setJspContext(pageContext);
                __jsp_taghandler_46.setProperty("EL.ID_DOCTO");
                __jsp_taghandler_46.setCondition("=");
                __jsp_taghandler_46.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_46.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_46, pageContext);
              }
              out.write(__oracle_jsp_text[59]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_47=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setJspContext(pageContext);
                __jsp_taghandler_47.setProperty("EMPL.RFC_UNICO");
                __jsp_taghandler_47.setCondition("contains");
                __jsp_taghandler_47.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_47.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
              }
              out.write(__oracle_jsp_text[60]);
              out.write(__oracle_jsp_text[61]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_48=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setJspContext(pageContext);
                __jsp_taghandler_48.setProperty("EB.ID_DOCTO");
                __jsp_taghandler_48.setCondition("=");
                __jsp_taghandler_48.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_48.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
              }
              out.write(__oracle_jsp_text[62]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_49=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setJspContext(pageContext);
                __jsp_taghandler_49.setProperty("EMPB.RFC_UNICO");
                __jsp_taghandler_49.setCondition("contains");
                __jsp_taghandler_49.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[63]);
              out.write(__oracle_jsp_text[64]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_50=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setJspContext(pageContext);
                __jsp_taghandler_50.setProperty("ELAB.ID_DOCTO");
                __jsp_taghandler_50.setCondition("=");
                __jsp_taghandler_50.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_50.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
              }
              out.write(__oracle_jsp_text[65]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_51=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setProperty("EMPLAB.RFC_UNICO");
                __jsp_taghandler_51.setCondition("contains");
                __jsp_taghandler_51.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[66]);
              out.write(__oracle_jsp_text[67]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_52=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setProperty("ER.ID_DOCTO");
                __jsp_taghandler_52.setCondition("=");
                __jsp_taghandler_52.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[68]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_53=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setJspContext(pageContext);
                __jsp_taghandler_53.setProperty("EMPR.RFC_UNICO");
                __jsp_taghandler_53.setCondition("contains");
                __jsp_taghandler_53.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_53.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
              }
              out.write(__oracle_jsp_text[69]);
              out.write(__oracle_jsp_text[70]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_54=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setJspContext(pageContext);
                __jsp_taghandler_54.setProperty("EF.ID_DOCTO");
                __jsp_taghandler_54.setCondition("=");
                __jsp_taghandler_54.setPath("idTipoDoctoBusqueda");
                __jsp_taghandler_54.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
              }
              out.write(__oracle_jsp_text[71]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_55=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setProperty("EMPF.RFC_UNICO");
                __jsp_taghandler_55.setCondition("contains");
                __jsp_taghandler_55.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[72]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_56=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setJspContext(pageContext);
                __jsp_taghandler_56.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteModificacionDescripcionDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_56.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteModificacionDescripcionDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_56.setAppendFilters("false");
                __jsp_taghandler_56.setMaxRows("200");
                __jsp_taghandler_56.setJspBody(new _modificacionDescripcion_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_56, __ojsp_varRes));
                __jsp_taghandler_56.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_56, pageContext);
              }
              out.write(__oracle_jsp_text[73]);
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

  private class _modificacionDescripcion_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _modificacionDescripcion_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_56       = parent;
      out.write("\r\n                                                    <div id=\"displayTagDiv\" style=\"width:1000px;height:350px;overflow:auto;\">\r\n                                                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_57=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_57.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_56));
        __jsp_taghandler_57.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteModificacionDescripcionDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_57.setPagesize(400);
        __jsp_taghandler_57.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_57.setClass("displaytag");
        __jsp_taghandler_57.setExport(true);
        __jsp_taghandler_57.setUid("row");
        __jsp_taghandler_57.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_57,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                                            \r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_58=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_58.setParent(__jsp_taghandler_57);
                __jsp_taghandler_58.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.docGrupo");
                __jsp_taghandler_58.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_58,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <input name=\"docGrupo\" \r\n                                                                       class=\"box\"\r\n                                                                       type=\"checkbox\" \r\n                                                                       value=\"");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_59.setParent(__jsp_taghandler_58);
                        __jsp_taghandler_59.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.rfcEmpleado}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idDocumento}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idDocto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.ID_DOCUMENTO}",java.lang.String.class, __ojsp_varRes, null)));
                        __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                        if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,5);
                      }
                      out.write("\"/>\r\n                                                            ");
                    } while (__jsp_taghandler_58.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_60=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_60.setParent(__jsp_taghandler_57);
                __jsp_taghandler_60.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.documento");
                __jsp_taghandler_60.setSortable(false);
                __jsp_taghandler_60.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_60,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <a href=\"downloadFile.do?uuid=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_61=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_61.setParent(__jsp_taghandler_60);
                        __jsp_taghandler_61.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.doctoRef}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                        if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,5);
                      }
                      out.write("\" title=\"Descargar documento\" target=\"_blank\">\r\n                                                                    <img src=\"");
                      {
                        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                        __jsp_taghandler_62.setParent(__jsp_taghandler_60);
                        __jsp_taghandler_62.setCode("pdf-download.jpg");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                          if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_62.doCatch(th);
                        } finally {
                          __jsp_taghandler_62.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,5);
                      }
                      out.write("\" border=\"0\" width=\"20\"/>\r\n                                                                </a>\r\n                                                            ");
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
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_63=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_63.setParent(__jsp_taghandler_57);
                __jsp_taghandler_63.setProperty("idDocumento");
                __jsp_taghandler_63.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.id");
                __jsp_taghandler_63.setSortable(true);
                __jsp_taghandler_63.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_64=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_64.setParent(__jsp_taghandler_57);
                __jsp_taghandler_64.setProperty("documento");
                __jsp_taghandler_64.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.descTipoDocumento");
                __jsp_taghandler_64.setSortable(true);
                __jsp_taghandler_64.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_65=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_65.setParent(__jsp_taghandler_57);
                __jsp_taghandler_65.setProperty("descDocto");
                __jsp_taghandler_65.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.descDocumento");
                __jsp_taghandler_65.setSortable(true);
                __jsp_taghandler_65.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_66=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_66.setParent(__jsp_taghandler_57);
                __jsp_taghandler_66.setProperty("anioDocto");
                __jsp_taghandler_66.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.anio");
                __jsp_taghandler_66.setSortable(true);
                __jsp_taghandler_66.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_67=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_67.setParent(__jsp_taghandler_57);
                __jsp_taghandler_67.setProperty("desStatus");
                __jsp_taghandler_67.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.estado");
                __jsp_taghandler_67.setSortable(true);
                __jsp_taghandler_67.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_68=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_68.setParent(__jsp_taghandler_57);
                __jsp_taghandler_68.setProperty("descRechazo");
                __jsp_taghandler_68.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.rechazo");
                __jsp_taghandler_68.setSortable(true);
                __jsp_taghandler_68.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_69=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_69.setParent(__jsp_taghandler_57);
                __jsp_taghandler_69.setProperty("usuario");
                __jsp_taghandler_69.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.usuario");
                __jsp_taghandler_69.setSortable(true);
                __jsp_taghandler_69.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_70=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_70.setParent(__jsp_taghandler_57);
                __jsp_taghandler_70.setProperty("fecModifico");
                __jsp_taghandler_70.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.fecModifico");
                __jsp_taghandler_70.setSortable(true);
                __jsp_taghandler_70.setFormat("{0,date,dd/MM/yyyy}");
                __jsp_taghandler_70.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,4);
              }
              out.write("\r\n                                                                            \r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_71=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_71.setParent(__jsp_taghandler_57);
                __jsp_taghandler_71.setName("paging.banner.placement");
                __jsp_taghandler_71.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_72=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_72.setParent(__jsp_taghandler_57);
                __jsp_taghandler_72.setName("export.pdf");
                __jsp_taghandler_72.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_73=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_73.setParent(__jsp_taghandler_57);
                __jsp_taghandler_73.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_73,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_74=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_74.setParent(__jsp_taghandler_73);
                        __jsp_taghandler_74.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                          if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_74.doCatch(th);
                        } finally {
                          __jsp_taghandler_74.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,5);
                      }
                      out.write("<br/><br/></span>\r\n                                                            ");
                    } while (__jsp_taghandler_73.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,4);
              }
              out.write("\r\n                                                        ");
            } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,3);
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

  private static final char __oracle_jsp_text[][]=new char[74][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 400px;\r\n    }\r\n</style>\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
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
    "\r\n\r\n    <h1>".toCharArray();
    __oracle_jsp_text[12] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr align=\"left\">\r\n            <td>\r\n                <h1>".toCharArray();
    __oracle_jsp_text[13] = 
    " ".toCharArray();
    __oracle_jsp_text[14] = 
    "</h1>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            <fieldset>\r\n                                <legend>\r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[15] = 
    "</strong>\r\n                                    <img class=\"fotografia\" width=\"55\" src=\"".toCharArray();
    __oracle_jsp_text[16] = 
    "\" align=\"middle\"/>       \r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[17] = 
    "</strong>\r\n                                </legend>\r\n                                <table width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"left\">\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>Documento a modificar</strong></legend><br/>\r\n                                                <table width=\"100%\">\r\n                                                    <colgroup>\r\n                                                        <col width=\"20%\"/>\r\n                                                        <col width=\"80%\"/>\r\n                                                    </colgroup>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\" id=\"tr_auxDescripcionDocto\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td class=\"label\">  ".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                                <table width=\"100%\">\r\n                                                    <tr align=\"center\">\r\n                                                        <td>\r\n                                                            ".toCharArray();
    __oracle_jsp_text[31] = 
    " &nbsp; \r\n                                                            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                                            <strong>\r\n                                                ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                            </strong>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr align=\"center\">\r\n                                        <td>&nbsp;</td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"left\">\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>Documentos localizados</strong></legend><br/>\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[71] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[72] = 
    "\r\n                                                \r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                                            </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){\r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.alphaNumericEspacios').alphanumeric({allow:\"-/ *_\"});\r\n            $j('.numeric').numeric();\r\n        });\r\n        \r\n        // Checkbox unico\r\n        $j(':checkbox').on('change',function(){\r\n            var th = $j(this), name = th.prop('name'); \r\n            if(th.is(':checked')){\r\n                $j(':checkbox[name=\"'  + name + '\"]').not($(this)).prop('checked',false);   \r\n            }\r\n        });\r\n        \r\n        // Recuperar fila selecccionada\r\n        $j('.box').change(function(){\r\n            $j('.box:checked').each(function(){\r\n                var auxDocto            = $j(this).parent().next('td').next('td').next('td').text();\r\n                var auxDocto2           = auxDocto.split(\" - \");\r\n                var auxDescripcionDocto = $j(this).parent().next('td').next('td').next('td').next('td').text();\r\n                var aux1                = auxDescripcionDocto.split(\"-\");\r\n                var auxDescripcionDocumento = aux1[0];                           \r\n                var auxDescripcionDocumento1 = aux1[1];                                           \r\n                var auxAnioDocto        = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxEstadoDocto      = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxEstadoDocto2     = auxEstadoDocto.split(\" - \");\r\n                //console.log(auxDocto + \" - \" + auxDescripcionDocto + \" - \" + auxAnioDocto + \" - \" + auxEstadoDocto);\r\n                \r\n                $j(\"#auxDocto\").val(auxDocto2);\r\n                $j(\"#hiddenIdDocto\").val(auxDocto2);\r\n                $j(\"#auxEstadoDocto\").val(auxEstadoDocto2[0]);\r\n                $j(\"#auxDescripcionDocto\").val(auxDescripcionDocto);\r\n                $j(\"#auxAnioDocto\").val(auxAnioDocto);\r\n                $j(\"#auxEstadoDocto option[value='\" + auxEstadoDocto2[0] + \"']\").attr(\"selected\",\"selected\");\r\n                var pardoc = $j('select[id=\"auxDocto\"]').val() + '-' + aux1[0];\r\n                \r\n                getDescripDocto(pardoc);\r\n                $j(\"#auxdsdDescripDocto\").val(auxDescripcionDocumento1);        \r\n                \r\n                var DOCUMENTOS_SIN_CAPTURA = new Array(\"SOEMP\", \"CURRV\", \"CERME\", \"IDOFI\", \"DCLFD\", \"MBPDV\", \"CNISF\", \"CILAB\", \"SOCEM\", \"ABMIS\", \r\n                                                        \"CIFON\", \"INSAR\", \"AHOSO\", \"CSGMM\", \"SEGUR\", \"OFIDO\", \"CONNO\", \"ACSPF\", \"PSPAS\", \"DOSPF\", \r\n                                                        \"COSER\", \"HUSER\", \"CONES\", \"ACTAD\", \"RNOIC\", \"AEOIC\", \"ACTAT\", \"MEDDI\", \"CONHE\", \"CAISS\", \r\n                                                        \"DEMAN\", \"LAUEJ\", \"BECAS\", \"ACDEF\", \"OFIRE\", \"OFISU\", \"ACUBA\", \"DMINC\", \"DESBE\", \"LICIS\");\r\n                                                                \r\n                if(DOCUMENTOS_SIN_CAPTURA.indexOf(auxDocto2[0]) >= 0){\r\n                    $j(\"#tr_auxDescripcionDocto\").show();\r\n                    \r\n                }\r\n                else{\r\n                    $j(\"#auxdsdDescripDocto\").val(auxDescripcionDocto);\r\n                    $j(\"#tr_auxDescripcionDocto\").hide();\r\n                    \r\n                    //$j(\"#auxDescripcionDocto\").prop(\"disabled\",true);\r\n                    //$j(\"#auxdsdDescripDocto\").prop(\"disabled\",true);\r\n                }\r\n            });\r\n        });\r\n\r\n        function getDescripDocto(pardoc){\r\n        var idDocto = pardoc.split('-')[0];            \r\n        $j.ajax({\r\n            url: 'getDescripAuxDocto.do',\r\n            type: 'GET',\r\n            data: 'idDocto=' + idDocto,\r\n            success: function(data) {\r\n                $j('select[id=\"auxDescripcionDocto\"]').find('option').remove().end();\r\n                $j('select[id=\"auxDescripcionDocto\"]').append(data);\r\n                $j(\"#auxDescripcionDocto option[value='\" + pardoc.split('-')[1] + \"']\").attr(\"selected\",\"selected\");\r\n            }\r\n        });\r\n    }\r\n    </script>\r\n    \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
