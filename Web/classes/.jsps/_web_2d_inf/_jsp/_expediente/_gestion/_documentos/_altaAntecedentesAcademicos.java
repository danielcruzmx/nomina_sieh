package _web_2d_inf._jsp._expediente._gestion._documentos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _altaAntecedentesAcademicos extends com.orionserver.http.OrionHttpJspPage {


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
    _altaAntecedentesAcademicos page = this;
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
        __jsp_taghandler_1.setModelAttribute("expedienteDatosAcademicosDTO");
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
                __jsp_taghandler_11.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.title");
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
                __jsp_taghandler_14.setText("Antecedentes");
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
                __jsp_taghandler_15.setCode("titulado.jpg");
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
                __jsp_taghandler_16.setText("acedemicos");
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
                __jsp_taghandler_17.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.nivelEscolar");
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
                __jsp_taghandler_19.setBeanName("tcNivelEscolar-busquedaDocEmpleado");
                __jsp_taghandler_19.setPath("nivelEscolar");
                __jsp_taghandler_19.setStyle("width:200px;");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.carrera");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_21=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setKey("");
                __jsp_taghandler_21.setValue("selectList.nonValue");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_22=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setBeanName("tcProfnCarrera-busquedaDocEmpleado");
                __jsp_taghandler_22.setPath("carrera");
                __jsp_taghandler_22.setStyle("width:200px;");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.instEducat");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_24=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setKey("");
                __jsp_taghandler_24.setValue("selectList.nonValue");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_25=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setJspContext(pageContext);
                __jsp_taghandler_25.setBeanName("tcInstEducat-busquedaDocEmpleado");
                __jsp_taghandler_25.setPath("instEducat");
                __jsp_taghandler_25.setStyle("width:200px;");
                __jsp_taghandler_25.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_25, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.estudiosConcluidos");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setPath("estudiosConcluidos");
                __jsp_taghandler_27.setValue("S");
                __jsp_taghandler_27.setLabel(" SI");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setPath("estudiosConcluidos");
                __jsp_taghandler_28.setValue("N");
                __jsp_taghandler_28.setLabel(" NO");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                  if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_28.doCatch(th);
                } finally {
                  __jsp_taghandler_28.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,2);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.promedioEscolar");
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
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_30=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("promedioEscolar");
                __jsp_taghandler_30.setMaxlength("8");
                __jsp_taghandler_30.setSize("60");
                __jsp_taghandler_30.setCss("anchoInput");
                __jsp_taghandler_30.setUppercase("true");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.cedulaProfesional");
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
              out.write(__oracle_jsp_text[35]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_32=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setPath("cedulaProfesional");
                __jsp_taghandler_32.setMaxlength("9");
                __jsp_taghandler_32.setSize("60");
                __jsp_taghandler_32.setCss("anchoInput numeric");
                __jsp_taghandler_32.setUppercase("true");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_33=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(expedienteDatosAcademicosDTO.rolAutorizar || expedienteDatosAcademicosDTO.rolRechazar) && (expedienteDatosAcademicosDTO.totalRegistrados > 0)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_33.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[37]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_34.setParent(__jsp_taghandler_33);
                      __jsp_taghandler_34.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.rechazo");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                        if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_34.doCatch(th);
                      } finally {
                        __jsp_taghandler_34.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,3);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_35=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_35.setParent(__jsp_taghandler_33);
                      __jsp_taghandler_35.setJspContext(pageContext);
                      __jsp_taghandler_35.setKey("");
                      __jsp_taghandler_35.setValue("selectList.nonValue");
                      __jsp_taghandler_35.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_36=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_36.setParent(__jsp_taghandler_33);
                      __jsp_taghandler_36.setJspContext(pageContext);
                      __jsp_taghandler_36.setBeanName("tcExpRechazo-altaCurp");
                      __jsp_taghandler_36.setPath("rechazo");
                      __jsp_taghandler_36.setStyle("width:200px;");
                      __jsp_taghandler_36.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
                    }
                    out.write(__oracle_jsp_text[40]);
                  } while (__jsp_taghandler_33.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_33.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_33,2);
              }
              out.write(__oracle_jsp_text[41]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.documentoSoporte");
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
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_38=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setPath("registrar");
                __jsp_taghandler_38.setAction((java.lang.String) ("gestionDocumentos/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosAcademicosDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_38.setValue("submit.save");
                __jsp_taghandler_38.setProgressBar("true");
                __jsp_taghandler_38.setAlertCode("confirm.expediente.alta.guardar");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_39=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setPath("autorizar");
                __jsp_taghandler_39.setAction("gestionDocumentos/autorizaAltaAntecedentesAcademicos.do");
                __jsp_taghandler_39.setValue("submit.autorizar");
                __jsp_taghandler_39.setProgressBar("true");
                __jsp_taghandler_39.setAlertCode("confirm.expediente.alta.autorizar");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_40=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setPath("rechazar");
                __jsp_taghandler_40.setAction("gestionDocumentos/rechazaAltaAntecedentesAcademicos.do");
                __jsp_taghandler_40.setValue("submit.rechazar");
                __jsp_taghandler_40.setProgressBar("true");
                __jsp_taghandler_40.setAlertCode("confirm.expediente.alta.rechazar");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_41=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setPath("eliminar");
                __jsp_taghandler_41.setAction("gestionDocumentos/eliminarAntecedentesAcademicos.do");
                __jsp_taghandler_41.setValue("submit.delete");
                __jsp_taghandler_41.setProgressBar("true");
                __jsp_taghandler_41.setAlertCode("confirm.expediente.eliminar");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_42=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setPath("cancel");
                __jsp_taghandler_42.setAction("gestionDocumentos/busquedaDocEmpleado.do");
                __jsp_taghandler_42.setValue("submit.cancel");
                __jsp_taghandler_42.setProgressBar("true");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_43=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[48]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_44=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setProperty("aa.rfc_empleado");
                __jsp_taghandler_44.setCondition("=");
                __jsp_taghandler_44.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[49]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_45=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosAcademicosDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_45.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosAcademicosDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_45.setAppendFilters("false");
                __jsp_taghandler_45.setMaxRows("200");
                __jsp_taghandler_45.setJspBody(new _altaAntecedentesAcademicos_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_45, __ojsp_varRes));
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_69=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_taghandler_69.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosAcademicosDTO.rolRegistrar}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_70=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_70.setParent(__jsp_taghandler_1);
                __jsp_taghandler_70.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosAcademicosDTO.rolAutorizar}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,2);
              }
              out.write(__oracle_jsp_text[52]);
              out.write(__oracle_jsp_text[53]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_71=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_71.setParent(__jsp_taghandler_1);
                __jsp_taghandler_71.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosAcademicosDTO.rolRegistrar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[54]);
                  } while (__jsp_taghandler_71.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,2);
              }
              out.write(__oracle_jsp_text[55]);
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

  private class _altaAntecedentesAcademicos_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _altaAntecedentesAcademicos_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_45       = parent;
      out.write("\r\n                                                    <div id=\"displayTagDiv\" style=\"width:1000px;height:350px;overflow:auto;\">\r\n                                                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_46=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_46.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_45));
        __jsp_taghandler_46.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDatosAcademicosDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_46.setPagesize(200);
        __jsp_taghandler_46.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_46.setClass("displaytag");
        __jsp_taghandler_46.setExport(true);
        __jsp_taghandler_46.setUid("row");
        __jsp_taghandler_46.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_46,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_47=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                __jsp_taghandler_47.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.docGrupo");
                __jsp_taghandler_47.setStyle("text-align: center;");
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_47,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                ");
                      {
                        org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_48=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                        __jsp_taghandler_48.setParent(__jsp_taghandler_47);
                        __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                        {
                          do {
                            out.write("\r\n                                                                    ");
                            {
                              org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                              __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                              __jsp_taghandler_49.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ (row.idStatus == 'REG' && (expedienteDatosAcademicosDTO.rolAutorizar || expedienteDatosAcademicosDTO.rolRechazar || expedienteDatosAcademicosDTO.rolRegistrar)) || \r\n                                                                    (row.idStatus == 'REC' && expedienteDatosAcademicosDTO.rolRegistrar)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                              __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write("\r\n                                                                            <input name=\"docGrupo\" \r\n                                                                                   class=\"box\"\r\n                                                                                   type=\"checkbox\" \r\n                                                                                   value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_50=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                                    __jsp_taghandler_50.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.rfcEmpleado}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idDocto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.aacSecuencia}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.aacDoctoRef}",java.lang.String.class, __ojsp_varRes, null)));
                                    __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                                    if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,7);
                                  }
                                  out.write("\"/>\r\n                                                                    ");
                                } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
                            }
                            out.write("\r\n                                                                    ");
                            {
                              org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                              __jsp_taghandler_51.setParent(__jsp_taghandler_48);
                              __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write("\r\n                                                                         - \r\n                                                                    ");
                                } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,6);
                            }
                            out.write("\r\n                                                                ");
                          } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,5);
                      }
                      out.write("\r\n                                                            ");
                    } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_52=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_52.setParent(__jsp_taghandler_46);
                __jsp_taghandler_52.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.documentoSoporte");
                __jsp_taghandler_52.setSortable(false);
                __jsp_taghandler_52.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_52,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <a href=\"downloadFile.do?uuid=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_53.setParent(__jsp_taghandler_52);
                        __jsp_taghandler_53.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.aacDoctoRef}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                        if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,5);
                      }
                      out.write("\" title=\"Descargar documento\" target=\"_blank\">\r\n                                                                    <img src=\"");
                      {
                        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                        __jsp_taghandler_54.setParent(__jsp_taghandler_52);
                        __jsp_taghandler_54.setCode("pdf-download.jpg");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                          if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_54.doCatch(th);
                        } finally {
                          __jsp_taghandler_54.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,5);
                      }
                      out.write("\" border=\"0\" width=\"20\"/>\r\n                                                                </a>\r\n                                                            ");
                    } while (__jsp_taghandler_52.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_46);
                __jsp_taghandler_55.setProperty("aacSecuencia");
                __jsp_taghandler_55.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.id");
                __jsp_taghandler_55.setSortable(false);
                __jsp_taghandler_55.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_56=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_56.setParent(__jsp_taghandler_46);
                __jsp_taghandler_56.setProperty("descNivelEscolar");
                __jsp_taghandler_56.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.nivelEscolar");
                __jsp_taghandler_56.setSortable(false);
                __jsp_taghandler_56.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_57=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_57.setParent(__jsp_taghandler_46);
                __jsp_taghandler_57.setProperty("descProfnCarrera");
                __jsp_taghandler_57.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.carrera");
                __jsp_taghandler_57.setSortable(false);
                __jsp_taghandler_57.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_58=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_58.setParent(__jsp_taghandler_46);
                __jsp_taghandler_58.setProperty("aacEstConcluidos");
                __jsp_taghandler_58.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.estudiosConcluidos");
                __jsp_taghandler_58.setSortable(false);
                __jsp_taghandler_58.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_59=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_59.setParent(__jsp_taghandler_46);
                __jsp_taghandler_59.setProperty("descInstEducat");
                __jsp_taghandler_59.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.instEducat");
                __jsp_taghandler_59.setSortable(false);
                __jsp_taghandler_59.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_60=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_60.setParent(__jsp_taghandler_46);
                __jsp_taghandler_60.setProperty("aacPromedio");
                __jsp_taghandler_60.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.promedioEscolar");
                __jsp_taghandler_60.setSortable(false);
                __jsp_taghandler_60.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,4);
              }
              out.write("                                                                            \r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_61=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_61.setParent(__jsp_taghandler_46);
                __jsp_taghandler_61.setProperty("aacCedProfesional");
                __jsp_taghandler_61.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.cedulaProfesional");
                __jsp_taghandler_61.setSortable(false);
                __jsp_taghandler_61.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,4);
              }
              out.write("                                                                           \r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_62=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_62.setParent(__jsp_taghandler_46);
                __jsp_taghandler_62.setProperty("desStatus");
                __jsp_taghandler_62.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.idStatus");
                __jsp_taghandler_62.setSortable(false);
                __jsp_taghandler_62.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,4);
              }
              out.write("                                                                                                                                                        \r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_63=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_63.setParent(__jsp_taghandler_46);
                __jsp_taghandler_63.setProperty("descRechazo");
                __jsp_taghandler_63.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.rechazo");
                __jsp_taghandler_63.setSortable(false);
                __jsp_taghandler_63.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_64=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_64.setParent(__jsp_taghandler_46);
                __jsp_taghandler_64.setProperty("fecModifico");
                __jsp_taghandler_64.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.fecModifico");
                __jsp_taghandler_64.setSortable(false);
                __jsp_taghandler_64.setFormat("{0,date,dd/MM/yyyy}");
                __jsp_taghandler_64.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_65=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_65.setParent(__jsp_taghandler_46);
                __jsp_taghandler_65.setName("paging.banner.placement");
                __jsp_taghandler_65.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_66=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_66.setParent(__jsp_taghandler_46);
                __jsp_taghandler_66.setName("export.pdf");
                __jsp_taghandler_66.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_67=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_67.setParent(__jsp_taghandler_46);
                __jsp_taghandler_67.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_67,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_68=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_68.setParent(__jsp_taghandler_67);
                        __jsp_taghandler_68.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                          if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_68.doCatch(th);
                        } finally {
                          __jsp_taghandler_68.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,5);
                      }
                      out.write("<br/><br/></span>\r\n                                                            ");
                    } while (__jsp_taghandler_67.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,4);
              }
              out.write("\r\n                                                        ");
            } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,3);
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

  private static final char __oracle_jsp_text[][]=new char[56][];
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
    "\r\n    ".toCharArray();
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
    "</strong>\r\n                                </legend>\r\n                                <table width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"left\">\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>Alta y/o modificaci&oacute;n de datos acad&eacute;micos</strong></legend><br/>\r\n                                                <table width=\"100%\">\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            <table align=\"left\" width=\"50%\">\r\n                                                                <tr>                        \r\n                                                                    <td align=\"center\">\r\n                                                                        ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                                                                    </td>\r\n                                                                    <td align=\"center\">\r\n                                                                        ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[33] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[35] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[36] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                                                        <tr align=\"left\">\r\n                                                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[38] = 
    "</td>\r\n                                                            <td align=\"left\" colspan=\"3\">\r\n                                                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                                                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                                    <tr align=\"center\">\r\n                                                        <td colspan=\"6\">&nbsp;</td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[42] = 
    "</td>\r\n                                                        <td align=\"left\" colspan=\"5\">\r\n                                                            <input type=\"file\" name=\"documentoSoporte\" id=\"documentoSoporte\" value=\"*.*\" size=\"50\" class=\"anchoInput\"/>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                                <table width=\"100%\">\r\n                                                    <tr align=\"center\">\r\n                                                        <td>&nbsp;</td>\r\n                                                    </tr>\r\n                                                    <tr align=\"center\">\r\n                                                        <td>\r\n                                                            ".toCharArray();
    __oracle_jsp_text[43] = 
    " &nbsp; \r\n                                                            ".toCharArray();
    __oracle_jsp_text[44] = 
    " &nbsp; \r\n                                                            ".toCharArray();
    __oracle_jsp_text[45] = 
    " &nbsp;\r\n                                                            ".toCharArray();
    __oracle_jsp_text[46] = 
    " &nbsp;            \r\n                                                            ".toCharArray();
    __oracle_jsp_text[47] = 
    "                                                                        \r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr align=\"center\">\r\n                                        <td>&nbsp;</td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                                            <strong>\r\n                                                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                                            </strong>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr align=\"center\">\r\n                                        <td>&nbsp;</td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td>\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>Antecedentes de datos acad&eacute;micos</strong></legend>\r\n                                                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                                            </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n\r\n    <script type=\"text/javascript\">\r\n        function enableRegistrarButtons(){\r\n            // Boton registrar\r\n            $j(\"#10001\").removeAttr('disabled');\r\n        }\r\n        function disableRegistrarButtons(){\r\n            // Boton registrar\r\n            $j(\"#10001\").attr('disabled','true');\r\n        }\r\n        function disableAutorizarButtons(){\r\n            // Boton autorizar\r\n            $j(\"#10002\").attr('disabled','true');\r\n            // Boton rechazar\r\n            $j(\"#10003\").attr('disabled','true');\r\n        }\r\n        function enableAutorizarButtons(){            \r\n            // Boton autorizar\r\n            $j(\"#10002\").removeAttr('disabled');\r\n            // Boton rechazar\r\n            $j(\"#10003\").removeAttr('disabled');\r\n        }\r\n        function enableEliminarButtons(){\r\n                $j(\"#10004\").removeAttr('disabled','true');\r\n            }\r\n        function disableEliminarButtons(){\r\n                $j(\"#10004\").attr('disabled','true');\r\n            }\r\n            \r\n        function disableFormButtons(){\r\n            $j(\"#nivelEscolar\").prop('disabled', 'true');\r\n            $j(\"#carrera\").prop('disabled', 'true');\r\n            $j(\"#instEducat\").prop('disabled', 'true');\r\n            $j(\"#estudiosConcluidos1\").prop('disabled', 'true');\r\n            $j(\"#estudiosConcluidos2\").prop('disabled', 'true');\r\n            $j(\"#promedioEscolar\").prop('disabled', 'true');\r\n            $j(\"#cedulaProfesional\").prop('disabled', 'true');\r\n            $j(\"#documentoSoporte\").prop('disabled', 'true');\r\n            \r\n        }\r\n        function enableFormButtons(){\r\n            $j(\"#nivelEscolar\").removeAttr('disabled');\r\n            $j(\"#carrera\").removeAttr('disabled');\r\n            $j(\"#instEducat\").removeAttr('disabled');\r\n            $j(\"#estudiosConcluidos1\").removeAttr('disabled');\r\n            $j(\"#estudiosConcluidos2\").removeAttr('disabled');\r\n            $j(\"#promedioEscolar\").removeAttr('disabled');\r\n            $j(\"#cedulaProfesional\").removeAttr('disabled');\r\n            $j(\"#documentoSoporte\").removeAttr('disabled');\r\n        }\r\n        \r\n        function cleanForm(){\r\n            $j(\"#nivelEscolar\").val('');\r\n            $j(\"#carrera\").val('');\r\n            $j(\"#instEducat\").val('');\r\n            $j(\"#estudiosConcluidos\").val('');\r\n            $j(\"input[type=radio]\").val('');\r\n            \r\n            $j(\"#text_estudiosConcluidos1\").val('');\r\n            $j(\"#estudiosConcluidos\").val('');\r\n            $j(\"#estudiosConcluidos1\").attr('checked', false);\r\n            $j(\"#estudiosConcluidos2\").attr('checked', false);\r\n            \r\n            $j(\"#promedioEscolar\").val('');\r\n            $j(\"#cedulaProfesional\").val('');\r\n            $j(\"#documentoSoporte\").val('');\r\n        }\r\n        \r\n        disableRegistrarButtons();\r\n        disableAutorizarButtons();    \r\n        disableEliminarButtons();\r\n    </script>\r\n\r\n    \r\n    <script type=\"text/javascript\">\r\n        var rolRegistrar = ".toCharArray();
    __oracle_jsp_text[51] = 
    ";\r\n        var rolAutorizar = ".toCharArray();
    __oracle_jsp_text[52] = 
    ";\r\n        // Validaciones\r\n        $j(document).ready(function(){\r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.numeric').numeric();\r\n            $j(\"#promedioEscolar\").mask(\"999.99\");\r\n        });\r\n        \r\n        \r\n        \r\n        \r\n        // Recuperar fila selecccionada\r\n        $j('.box').change(function(){\r\n            disableRegistrarButtons();\r\n            disableAutorizarButtons();\r\n            disableEliminarButtons();\r\n            $j('.box:checked').each(function(){\r\n                var auxNivelEscolar         =   $j(this).parent().next('td').next('td').next('td').text();\r\n                var auxNivelEscolar2        =   auxNivelEscolar.split(\" - \");\r\n                \r\n                var auxCarrera              =   $j(this).parent().next('td').next('td').next('td').next('td').text();\r\n                var auxCarrera2             =   auxCarrera.split(\" - \");\r\n                \r\n                var auxEstudiosConcluidos   =   $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();\r\n                \r\n                var auxInstEducat           =   $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxInstEducat2          =   auxInstEducat.split(\" - \");\r\n                \r\n                var auxPromedioEscolar      =   $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxCedulaProfesional    =   $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                \r\n                if (auxEstudiosConcluidos == 'S') {\r\n                    $j(\"#estudiosConcluidos1\").attr('checked', 'checked');  \r\n                } else if(auxEstudiosConcluidos == 'N') {   \r\n                    $j(\"#estudiosConcluidos2\").attr('checked', 'checked');\r\n                }\r\n                \r\n                $j(\"#nivelEscolar\").val(auxNivelEscolar2);\r\n                $j(\"#carrera\").val(auxCarrera2);\r\n                $j(\"#instEducat\").val(auxInstEducat2);\r\n                $j(\"#promedioEscolar\").val(auxPromedioEscolar);\r\n                $j(\"#cedulaProfesional\").val(auxCedulaProfesional);\r\n                \r\n                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                if (auxEstatus == 'RECHAZADO') {\r\n                    if(rolRegistrar){\r\n                        enableRegistrarButtons();\r\n                    }\r\n                    disableAutorizarButtons();\r\n                }\r\n                if (auxEstatus == 'REGISTRO') {\r\n                    if(rolAutorizar){\r\n                        enableAutorizarButtons();\r\n                    } else {\r\n                        enableEliminarButtons();\r\n                    }\r\n                    disableFormButtons();\r\n                    disableRegistrarButtons();\r\n                }\r\n            });\r\n        });\r\n        \r\n        // Checkbox unico\r\n        $j(':checkbox').on('change',function(){\r\n            var th = $j(this), name = th.prop('name'); \r\n            if(th.is(':checked')){\r\n                $j(':checkbox[name=\"'  + name + '\"]').not($(this)).prop('checked',false);   \r\n            } else {\r\n                cleanForm();\r\n                enableFormButtons();\r\n                if(rolRegistrar){\r\n                    enableRegistrarButtons();\r\n                }\r\n            }\r\n        });\r\n        // Pagedlist asincrono\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n        <script type=\"text/javascript\">\r\n            $j(document).ready(function(){\r\n                enableRegistrarButtons();\r\n            });\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n    \r\n\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
