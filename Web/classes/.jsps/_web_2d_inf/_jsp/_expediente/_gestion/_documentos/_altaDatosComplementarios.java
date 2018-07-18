package _web_2d_inf._jsp._expediente._gestion._documentos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _altaDatosComplementarios extends com.orionserver.http.OrionHttpJspPage {


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
    _altaDatosComplementarios page = this;
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
        __jsp_taghandler_1.setModelAttribute("expedienteDatosComplementariosDTO");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.title");
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
                __jsp_taghandler_7.setCode("sireh.label.oficinaVirtual.gestionDocumentos.expedientePersonal.title");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_8=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setPath("nombreEmpleadoCompleto");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setText("Datos");
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
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("casa.jpg");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setText("personales");
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
                __jsp_taghandler_12.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.telParticular");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_13=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setPath("telParticular");
                __jsp_taghandler_13.setMaxlength("15");
                __jsp_taghandler_13.setSize("15");
                __jsp_taghandler_13.setCss("anchoInput");
                __jsp_taghandler_13.setUppercase("true");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.celParticular");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_15=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setJspContext(pageContext);
                __jsp_taghandler_15.setPath("celParticular");
                __jsp_taghandler_15.setMaxlength("15");
                __jsp_taghandler_15.setSize("15");
                __jsp_taghandler_15.setCss("anchoInput");
                __jsp_taghandler_15.setUppercase("true");
                __jsp_taghandler_15.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.emailParticular");
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
                __jsp_taghandler_17.setPath("emailParticular");
                __jsp_taghandler_17.setMaxlength("60");
                __jsp_taghandler_17.setSize("60");
                __jsp_taghandler_17.setCss("anchoInput");
                __jsp_taghandler_17.setUppercase("false");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.tipoSangre");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_19=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setKey("");
                __jsp_taghandler_19.setValue("selectList.nonValue");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_20=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setBeanName("tcTipoSangre-altaDatosComplementarios");
                __jsp_taghandler_20.setPath("tipoSangre");
                __jsp_taghandler_20.setStyle("width:200px;");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.genero");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                  if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_21.doCatch(th);
                } finally {
                  __jsp_taghandler_21.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setPath("genero");
                __jsp_taghandler_22.setValue("M");
                __jsp_taghandler_22.setLabel(" Masculino");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setPath("genero");
                __jsp_taghandler_23.setValue("F");
                __jsp_taghandler_23.setLabel(" Femenino");
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
                __jsp_taghandler_24.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.padreMadre");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setPath("padreMadre");
                __jsp_taghandler_25.setValue("S");
                __jsp_taghandler_25.setLabel(" SI");
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
              out.write(__oracle_jsp_text[29]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setPath("padreMadre");
                __jsp_taghandler_26.setValue("N");
                __jsp_taghandler_26.setLabel(" NO");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                  if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_26.doCatch(th);
                } finally {
                  __jsp_taghandler_26.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,2);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.edoCivil");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
                  if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_27.doCatch(th);
                } finally {
                  __jsp_taghandler_27.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,2);
              }
              out.write(__oracle_jsp_text[31]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_28=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setKey("");
                __jsp_taghandler_28.setValue("selectList.nonValue");
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_29=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setBeanName("tcEstadoCivil-altaDatosComplementarios");
                __jsp_taghandler_29.setPath("edoCivil");
                __jsp_taghandler_29.setStyle("width:200px;");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[33]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.tipoDiscapacidad");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_30.doStartTag();
                  if (__jsp_taghandler_30.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_30.doCatch(th);
                } finally {
                  __jsp_taghandler_30.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_30,2);
              }
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_31=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setKey("");
                __jsp_taghandler_31.setValue("selectList.nonValue");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_32=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setBeanName("tcTipoDiscapacidad-altaDatosComplementarios");
                __jsp_taghandler_32.setPath("tipoDiscapacidad");
                __jsp_taghandler_32.setStyle("width:200px;");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.numRusp");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                  if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_33.doCatch(th);
                } finally {
                  __jsp_taghandler_33.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
              }
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_34=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setPath("numRusp");
                __jsp_taghandler_34.setMaxlength("7");
                __jsp_taghandler_34.setSize("7");
                __jsp_taghandler_34.setCss("anchoInput numeric");
                __jsp_taghandler_34.setUppercase("true");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.numSegSoc");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                  if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_35.doCatch(th);
                } finally {
                  __jsp_taghandler_35.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,2);
              }
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_36=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setPath("numSegSoc");
                __jsp_taghandler_36.setMaxlength("11");
                __jsp_taghandler_36.setSize("11");
                __jsp_taghandler_36.setCss("anchoInput numeric");
                __jsp_taghandler_36.setUppercase("true");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.hablaIdioma");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_37.doStartTag();
                  if (__jsp_taghandler_37.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_37.doCatch(th);
                } finally {
                  __jsp_taghandler_37.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_37,2);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_38=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setKey("");
                __jsp_taghandler_38.setValue("selectList.nonValue");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_39=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setBeanName("tcIdioma-altaDatosComplementarios");
                __jsp_taghandler_39.setPath("hablaIdioma");
                __jsp_taghandler_39.setStyle("width:200px;");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_40=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.dominioIdioma");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                  if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_40.doCatch(th);
                } finally {
                  __jsp_taghandler_40.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,2);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_41=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setKey("");
                __jsp_taghandler_41.setValue("selectList.nonValue");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_42=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setBeanName("tcDominioIdioma-altaDatosComplementarios");
                __jsp_taghandler_42.setPath("dominioIdioma");
                __jsp_taghandler_42.setStyle("width:200px;");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.instProtecCivil");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                  if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_43.doCatch(th);
                } finally {
                  __jsp_taghandler_43.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,2);
              }
              out.write(__oracle_jsp_text[47]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_44=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setKey("");
                __jsp_taghandler_44.setValue("selectList.nonValue");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[48]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_45=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setBeanName("tcInstProtCiv-altaDatosComplementarios");
                __jsp_taghandler_45.setPath("instProtecCivil");
                __jsp_taghandler_45.setStyle("width:200px;");
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[49]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.espProtecCivil");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                  if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_46.doCatch(th);
                } finally {
                  __jsp_taghandler_46.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,2);
              }
              out.write(__oracle_jsp_text[50]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_47=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setJspContext(pageContext);
                __jsp_taghandler_47.setKey("");
                __jsp_taghandler_47.setValue("selectList.nonValue");
                __jsp_taghandler_47.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
              }
              out.write(__oracle_jsp_text[51]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_48=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setJspContext(pageContext);
                __jsp_taghandler_48.setBeanName("tcEspProtCiv-altaDatosComplementarios");
                __jsp_taghandler_48.setPath("espProtecCivil");
                __jsp_taghandler_48.setStyle("width:200px;");
                __jsp_taghandler_48.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosComplementariosDTO.registrar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[53]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_50=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                      __jsp_taghandler_50.setJspContext(pageContext);
                      __jsp_taghandler_50.setPath("registrar");
                      __jsp_taghandler_50.setAction((java.lang.String) ("gestionDocumentos/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosComplementariosDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_50.setValue("submit.save");
                      __jsp_taghandler_50.setProgressBar("true");
                      __jsp_taghandler_50.setAlertCode("confirm.expediente.alta.guardar");
                      __jsp_taghandler_50.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
                    }
                    out.write(__oracle_jsp_text[54]);
                  } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,2);
              }
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_51=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setPath("cancel");
                __jsp_taghandler_51.setAction("gestionDocumentos/busquedaDocEmpleado.do");
                __jsp_taghandler_51.setValue("submit.cancel");
                __jsp_taghandler_51.setProgressBar("true");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_52=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setProperty("RFC_EMPLEADO");
                __jsp_taghandler_52.setCondition("=");
                __jsp_taghandler_52.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_53=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setJspContext(pageContext);
                __jsp_taghandler_53.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosComplementariosDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_53.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosComplementariosDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_53.setAppendFilters("false");
                __jsp_taghandler_53.setMaxRows("200");
                __jsp_taghandler_53.setJspBody(new _altaDatosComplementarios_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_53, __ojsp_varRes));
                __jsp_taghandler_53.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_75=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_75.setParent(__jsp_taghandler_1);
                __jsp_taghandler_75.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteCartillaMiliarDTO.autorizar || expedienteCartillaMilitarDTO.rechazar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[59]);
                  } while (__jsp_taghandler_75.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,2);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_76=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_76.setParent(__jsp_taghandler_1);
                __jsp_taghandler_76.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosComplementariosDTO.autorizar || expedienteDatosComplementariosDTO.rechazar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[61]);
                  } while (__jsp_taghandler_76.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,2);
              }
              out.write(__oracle_jsp_text[62]);
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

  private class _altaDatosComplementarios_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _altaDatosComplementarios_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_53       = parent;
      out.write("\r\n                                    <div id=\"displayTagDiv\" style=\"width:1000px;height:350px;overflow:auto;\">\r\n                                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_54=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_54.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_53));
        __jsp_taghandler_54.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosComplementariosDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_54.setPagesize(200);
        __jsp_taghandler_54.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_54.setClass("displaytag");
        __jsp_taghandler_54.setExport(true);
        __jsp_taghandler_54.setUid("row");
        __jsp_taghandler_54.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_54,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                            ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_55=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_55.setParent(__jsp_taghandler_54);
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                                ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_56=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_56.setParent(__jsp_taghandler_55);
                      __jsp_taghandler_56.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ ((row.idStatus == 'REG' || row.idStatus == 'REC') && (expedienteDatosComplementariosDTO.autorizar || expedienteDatosComplementariosDTO.rechazar)) ||\r\n                                                                  (row.idStatus == 'REG' && expedienteDatosComplementariosDTO.registrar) }",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_57=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                            __jsp_taghandler_57.setParent(__jsp_taghandler_56);
                            __jsp_taghandler_57.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.consulta.docGrupo");
                            __jsp_taghandler_57.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_57,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                                                             <input name=\"docGrupo\" \r\n                                                                    class=\"box\"\r\n                                                                    type=\"checkbox\" \r\n                                                                    value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_58=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_58.setParent(__jsp_taghandler_57);
                                    __jsp_taghandler_58.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.rfcEmpleado}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idDocto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.DoctoRef}",java.lang.String.class, __ojsp_varRes, null)));
                                    __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                                    if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,7);
                                  }
                                  out.write("\"/>\r\n                                                    ");
                                } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,6);
                          }
                          out.write("\r\n                                                ");
                        } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,5);
                    }
                    out.write("\r\n                                                ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_59.setParent(__jsp_taghandler_55);
                      __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_60=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                            __jsp_taghandler_60.setParent(__jsp_taghandler_59);
                            __jsp_taghandler_60.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.consulta.docGrupo");
                            __jsp_taghandler_60.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_60,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                                                        - \r\n                                                    ");
                                } while (__jsp_taghandler_60.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,6);
                          }
                          out.write("\r\n                                                ");
                        } while (__jsp_taghandler_59.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,5);
                    }
                    out.write("\r\n                                            ");
                  } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,4);
              }
              out.write("\r\n                                                       \r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_61=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_61.setParent(__jsp_taghandler_54);
                __jsp_taghandler_61.setProperty("comTelPart");
                __jsp_taghandler_61.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.telParticular");
                __jsp_taghandler_61.setSortable(false);
                __jsp_taghandler_61.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_62=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_62.setParent(__jsp_taghandler_54);
                __jsp_taghandler_62.setProperty("comCelPart");
                __jsp_taghandler_62.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.celParticular");
                __jsp_taghandler_62.setSortable(false);
                __jsp_taghandler_62.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_63=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_63.setParent(__jsp_taghandler_54);
                __jsp_taghandler_63.setProperty("comEmailPart");
                __jsp_taghandler_63.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.emailParticular");
                __jsp_taghandler_63.setSortable(false);
                __jsp_taghandler_63.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_64=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_64.setParent(__jsp_taghandler_54);
                __jsp_taghandler_64.setProperty("idTipoSangre");
                __jsp_taghandler_64.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.tipoSangre");
                __jsp_taghandler_64.setSortable(false);
                __jsp_taghandler_64.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_65=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_65.setParent(__jsp_taghandler_54);
                __jsp_taghandler_65.setProperty("genero");
                __jsp_taghandler_65.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.genero");
                __jsp_taghandler_65.setSortable(false);
                __jsp_taghandler_65.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_66=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_66.setParent(__jsp_taghandler_54);
                __jsp_taghandler_66.setProperty("comEsPadreMadre");
                __jsp_taghandler_66.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.padreMadre");
                __jsp_taghandler_66.setSortable(false);
                __jsp_taghandler_66.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_67=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_67.setParent(__jsp_taghandler_54);
                __jsp_taghandler_67.setProperty("edoCivil");
                __jsp_taghandler_67.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.edoCivil");
                __jsp_taghandler_67.setSortable(false);
                __jsp_taghandler_67.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_68=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_68.setParent(__jsp_taghandler_54);
                __jsp_taghandler_68.setProperty("discapacidad");
                __jsp_taghandler_68.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.tipoDiscapacidad");
                __jsp_taghandler_68.setSortable(false);
                __jsp_taghandler_68.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_69=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_69.setParent(__jsp_taghandler_54);
                __jsp_taghandler_69.setProperty("comNumRusp");
                __jsp_taghandler_69.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.numRusp");
                __jsp_taghandler_69.setSortable(false);
                __jsp_taghandler_69.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_70=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_70.setParent(__jsp_taghandler_54);
                __jsp_taghandler_70.setProperty("comNumSegSoc");
                __jsp_taghandler_70.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.numSegSoc");
                __jsp_taghandler_70.setSortable(false);
                __jsp_taghandler_70.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_71=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_71.setParent(__jsp_taghandler_54);
                __jsp_taghandler_71.setProperty("idioma");
                __jsp_taghandler_71.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.hablaIdioma");
                __jsp_taghandler_71.setSortable(false);
                __jsp_taghandler_71.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_72=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_72.setParent(__jsp_taghandler_54);
                __jsp_taghandler_72.setProperty("dominio");
                __jsp_taghandler_72.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.dominioIdioma");
                __jsp_taghandler_72.setSortable(false);
                __jsp_taghandler_72.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_73=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_73.setParent(__jsp_taghandler_54);
                __jsp_taghandler_73.setProperty("instProt");
                __jsp_taghandler_73.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.instProtecCivil");
                __jsp_taghandler_73.setSortable(false);
                __jsp_taghandler_73.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,4);
              }
              out.write("\r\n                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_74=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_74.setParent(__jsp_taghandler_54);
                __jsp_taghandler_74.setProperty("espProt");
                __jsp_taghandler_74.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosComplementarios.espProtecCivil");
                __jsp_taghandler_74.setSortable(false);
                __jsp_taghandler_74.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,4);
              }
              out.write("\r\n                                        ");
            } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,3);
      }
      out.write("\r\n                                    </div>\r\n                                ");
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

  private static final char __oracle_jsp_text[][]=new char[63][];
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
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[10] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr align=\"left\">\r\n            <td>\r\n                <h1>".toCharArray();
    __oracle_jsp_text[11] = 
    " ".toCharArray();
    __oracle_jsp_text[12] = 
    "</h1>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            <fieldset>\r\n                                <legend>\r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[13] = 
    "</strong>\r\n                                    <img class=\"fotografia\" width=\"55\" src=\"".toCharArray();
    __oracle_jsp_text[14] = 
    "\" align=\"middle\"/>       \r\n                                    <strong>".toCharArray();
    __oracle_jsp_text[15] = 
    "</strong>\r\n                                </legend>\r\n                                <table width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"left\">\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>* Datos Complementarios</strong></legend><br/>\r\n                                                <table width=\"100%\">\r\n                                                    <tr>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            <table align=\"left\" width=\"80%\">\r\n                                                                <tr>                        \r\n                                                                    <td align=\"center\">\r\n                                                                        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                                                    </td>\r\n                                                                    <td align=\"center\">\r\n                                                                        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            <table align=\"left\" width=\"50%\">\r\n                                                                <tr>                        \r\n                                                                    <td align=\"center\">\r\n                                                                        ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                                                    </td>\r\n                                                                    <td align=\"center\">\r\n                                                                        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[31] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[37] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[39] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[41] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[47] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[50] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                                <table width=\"100%\">\r\n                                                      <tr align=\"center\">\r\n                                                         <td>&nbsp;</td>\r\n                                                      </tr>\r\n                                                      <tr align=\"center\">\r\n                                                          <td>                                                            \r\n                                                              ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                                                                  ".toCharArray();
    __oracle_jsp_text[54] = 
    " &nbsp; \r\n                                                              ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                                              ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                                          </td>\r\n                                                      </tr>\r\n                                                 </table>\r\n                                               </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr align=\"center\">\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                            <strong>\r\n                                 * Campos requeridos.<br/>\r\n                            </strong>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>\r\n                             <fieldset>\r\n                                <legend style=\"font-size:1.3em\"><strong>Antecedentes de Datos Complementarios</strong></legend>\r\n                                \r\n                                ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                \r\n                                ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n\r\n    ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n        <script type=\"text/javascript\">\r\n            $j(\"#telParticular\").prop(\"disabled\", true);\r\n            $j(\"#celParticular\").prop(\"disabled\", true);\r\n            $j(\"#emailParticular\").prop(\"disabled\", true);\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n\r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){\r\n            $j('.numeric').numeric();\r\n        });\r\n        \r\n        // Recuperar fila selecccionada\r\n        $j('.box').change(function(){\r\n            disableAutorizaButtons();\r\n            $j('.box:checked').each(function(){\r\n                var auxtelParticular = $j(this).parent().next('td').next('td').text();\r\n                var auxcelParticular = $j(this).parent().next('td').next('td').next('td').text();\r\n                var auxemailParticular = $j(this).parent().next('td').next('td').next('td').text();\r\n                \r\n                $j(\"#telParticular\").val(auxtelParticular);\r\n                $j(\"#celParticular\").val(auxcelParticular);\r\n                $j(\"#emailParticular\").val(auxemailParticular);\r\n                enableAutorizaButtons();\r\n            });\r\n        });\r\n\r\n        function disableAutorizaButtons(){\r\n            $j(\"#10002\").attr('disabled','true');\r\n            $j(\"#10003\").attr('disabled','true');\r\n        }\r\n        \r\n        function enableAutorizaButtons(){\r\n            $j(\"#10002\").removeAttr('disabled');\r\n            $j(\"#10003\").removeAttr('disabled');\r\n        }\r\n        \r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n        <script type=\"text/javascript\">\r\n            $j(document).ready(function(){\r\n                disableAutorizaButtons();\r\n            });\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
