package _web_2d_inf._jsp._expediente._gestion._documentos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _altaDependientes extends com.orionserver.http.OrionHttpJspPage {


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
    _altaDependientes page = this;
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
        __jsp_taghandler_1.setModelAttribute("expedienteDependientesDTO");
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
                __jsp_taghandler_11.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.title");
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
                __jsp_taghandler_17.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.nombreEmpleado");
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
                __jsp_taghandler_18.setPath("nombreEmpleado");
                __jsp_taghandler_18.setMaxlength("40");
                __jsp_taghandler_18.setSize("60");
                __jsp_taghandler_18.setCss("anchoInput alphaNumericEspacios");
                __jsp_taghandler_18.setUppercase("true");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.primerApellido");
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
                __jsp_taghandler_20.setPath("primerApellido");
                __jsp_taghandler_20.setMaxlength("40");
                __jsp_taghandler_20.setSize("60");
                __jsp_taghandler_20.setCss("anchoInput alphaNumericEspacios");
                __jsp_taghandler_20.setUppercase("true");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.segundoApellido");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_22=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setPath("segundoApellido");
                __jsp_taghandler_22.setMaxlength("40");
                __jsp_taghandler_22.setSize("60");
                __jsp_taghandler_22.setCss("anchoInput alphaNumericEspacios");
                __jsp_taghandler_22.setUppercase("true");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.fecNacimiento");
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
                _oracle._jsp._tag._calendar_tag __jsp_taghandler_24=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setPath("fecNacimiento");
                __jsp_taghandler_24.setReadonly("true");
                __jsp_taghandler_24.setSize("10");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.parentesco");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_26=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setKey("0");
                __jsp_taghandler_26.setValue("selectList.nonValue");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_27=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setBeanName("tcParentesco-altaDependientes");
                __jsp_taghandler_27.setPath("parentesco");
                __jsp_taghandler_27.setStyle("width:200px;");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.nivelEscolar");
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
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_29=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setJspContext(pageContext);
                __jsp_taghandler_29.setBeanName("tcNivelEscolar-altaDependientes");
                __jsp_taghandler_29.setPath("nivelEscolar");
                __jsp_taghandler_29.setOnchange("getNivelEscolar();");
                __jsp_taghandler_29.setStyle("width:200px;");
                __jsp_taghandler_29.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
              }
              out.write(__oracle_jsp_text[33]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.promedioEscolar");
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
                _oracle._jsp._tag._input_tag __jsp_taghandler_31=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setPath("promedioEscolar");
                __jsp_taghandler_31.setMaxlength("6");
                __jsp_taghandler_31.setSize("60");
                __jsp_taghandler_31.setCss("anchoInput");
                __jsp_taghandler_31.setUppercase("true");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.genero");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_32.doStartTag();
                  if (__jsp_taghandler_32.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_32.doCatch(th);
                } finally {
                  __jsp_taghandler_32.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_32,2);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setPath("genero");
                __jsp_taghandler_33.setValue("M");
                __jsp_taghandler_33.setLabel(" Masculino");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setPath("genero");
                __jsp_taghandler_34.setValue("F");
                __jsp_taghandler_34.setLabel(" Femenino");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_34.doStartTag();
                  if (__jsp_taghandler_34.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_34.doCatch(th);
                } finally {
                  __jsp_taghandler_34.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_34,2);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_35=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(expedienteDependientesDTO.rolAutorizar || expedienteDependientesDTO.rolRechazar) && (expedienteDependientesDTO.totalRegistrados > 0)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_35.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[39]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_36=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_36.setParent(__jsp_taghandler_35);
                      __jsp_taghandler_36.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.rechazo");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_36.doStartTag();
                        if (__jsp_taghandler_36.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_36.doCatch(th);
                      } finally {
                        __jsp_taghandler_36.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_36,3);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_37=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_37.setParent(__jsp_taghandler_35);
                      __jsp_taghandler_37.setJspContext(pageContext);
                      __jsp_taghandler_37.setKey("");
                      __jsp_taghandler_37.setValue("selectList.nonValue");
                      __jsp_taghandler_37.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
                    }
                    out.write(__oracle_jsp_text[41]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_38=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_38.setParent(__jsp_taghandler_35);
                      __jsp_taghandler_38.setJspContext(pageContext);
                      __jsp_taghandler_38.setBeanName("tcExpRechazo-altaDependientes");
                      __jsp_taghandler_38.setPath("rechazo");
                      __jsp_taghandler_38.setStyle("width:200px;");
                      __jsp_taghandler_38.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
                    }
                    out.write(__oracle_jsp_text[42]);
                  } while (__jsp_taghandler_35.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_35.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_35,2);
              }
              out.write(__oracle_jsp_text[43]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setCode("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.documentoSoporte");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                  if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_39.doCatch(th);
                } finally {
                  __jsp_taghandler_39.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_40=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setPath("registrar");
                __jsp_taghandler_40.setAction((java.lang.String) ("gestionDocumentos/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDependientesDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_40.setValue("submit.save");
                __jsp_taghandler_40.setProgressBar("true");
                __jsp_taghandler_40.setAlertCode("confirm.expediente.alta.guardar");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_41=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setPath("autorizar");
                __jsp_taghandler_41.setAction("gestionDocumentos/autorizaAltaDependientes.do");
                __jsp_taghandler_41.setValue("submit.autorizar");
                __jsp_taghandler_41.setProgressBar("true");
                __jsp_taghandler_41.setAlertCode("confirm.expediente.alta.autorizar");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_42=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setJspContext(pageContext);
                __jsp_taghandler_42.setPath("rechazar");
                __jsp_taghandler_42.setAction("gestionDocumentos/rechazaAltaDependientes.do");
                __jsp_taghandler_42.setValue("submit.rechazar");
                __jsp_taghandler_42.setProgressBar("true");
                __jsp_taghandler_42.setAlertCode("confirm.expediente.alta.rechazar");
                __jsp_taghandler_42.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_43=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setJspContext(pageContext);
                __jsp_taghandler_43.setPath("eliminar");
                __jsp_taghandler_43.setAction("gestionDocumentos/eliminarDependientes.do");
                __jsp_taghandler_43.setValue("submit.delete");
                __jsp_taghandler_43.setProgressBar("true");
                __jsp_taghandler_43.setAlertCode("confirm.expediente.eliminar");
                __jsp_taghandler_43.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
              }
              out.write(__oracle_jsp_text[48]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_44=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setJspContext(pageContext);
                __jsp_taghandler_44.setPath("cancel");
                __jsp_taghandler_44.setAction("gestionDocumentos/busquedaDocEmpleado.do");
                __jsp_taghandler_44.setValue("submit.cancel");
                __jsp_taghandler_44.setProgressBar("true");
                __jsp_taghandler_44.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
              }
              out.write(__oracle_jsp_text[49]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_45=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setCode("sireh.form.required.fields");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                  if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_45.doCatch(th);
                } finally {
                  __jsp_taghandler_45.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,2);
              }
              out.write(__oracle_jsp_text[50]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_46=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setJspContext(pageContext);
                __jsp_taghandler_46.setProperty("EF.RFC_EMPLEADO");
                __jsp_taghandler_46.setCondition("=");
                __jsp_taghandler_46.setPath("rfcEmpleadoBusqueda");
                __jsp_taghandler_46.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_46, pageContext);
              }
              out.write(__oracle_jsp_text[51]);
              {
                _oracle._jsp._tag._pagedList_tag __jsp_taghandler_47=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setJspContext(pageContext);
                __jsp_taghandler_47.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDependientesDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_47.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDependientesDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_47.setAppendFilters("false");
                __jsp_taghandler_47.setMaxRows("200");
                __jsp_taghandler_47.setJspBody(new _altaDependientes_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_47, __ojsp_varRes));
                __jsp_taghandler_47.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_74=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_74.setParent(__jsp_taghandler_1);
                __jsp_taghandler_74.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDependientesDTO.rolRegistrar}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_74.doStartTag();
                if (__jsp_taghandler_74.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_74,2);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_75=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_75.setParent(__jsp_taghandler_1);
                __jsp_taghandler_75.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDependientesDTO.rolAutorizar}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,2);
              }
              out.write(__oracle_jsp_text[54]);
              out.write(__oracle_jsp_text[55]);
              out.write(__oracle_jsp_text[56]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_76=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_76.setParent(__jsp_taghandler_1);
                __jsp_taghandler_76.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDependientesDTO.rolRegistrar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[57]);
                  } while (__jsp_taghandler_76.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,2);
              }
              out.write(__oracle_jsp_text[58]);
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

  private class _altaDependientes_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _altaDependientes_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_47       = parent;
      out.write("\r\n                                                    <div id=\"displayTagDiv\" style=\"width:1000px;height:350px;overflow:auto;\">\r\n                                                        ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_48=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize requestURI class export id sort");
        __jsp_taghandler_48.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_47));
        __jsp_taghandler_48.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDependientesDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_48.setPagesize(200);
        __jsp_taghandler_48.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_48.setClass("displaytag");
        __jsp_taghandler_48.setExport(true);
        __jsp_taghandler_48.setUid("row");
        __jsp_taghandler_48.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_48,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                                            ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_49.setParent(__jsp_taghandler_48);
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                                                ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_50=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                      __jsp_taghandler_50.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${ (row.idStatus == 'REG' && (expedienteDependientesDTO.rolAutorizar || expedienteDependientesDTO.rolRechazar || expedienteDependientesDTO.rolRegistrar)) || (row.idStatus == 'REC' && expedienteDependientesDTO.rolRegistrar)}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                                                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                            __jsp_taghandler_51.setParent(__jsp_taghandler_50);
                            __jsp_taghandler_51.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.docGrupo");
                            __jsp_taghandler_51.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_51,__jsp_tag_starteval,out);
                                do {
                                  out.write("\r\n                                                                        <input name=\"docGrupo\" \r\n                                                                               class=\"box\"\r\n                                                                               type=\"checkbox\" \r\n                                                                               value=\"");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_52=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_52.setParent(__jsp_taghandler_51);
                                    __jsp_taghandler_52.setValue((java.lang.Object) ( (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.rfcEmpleado}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idDocto}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.fdbSecuencia}",java.lang.String.class, __ojsp_varRes, null)+"|"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.fdbDoctoRef}",java.lang.String.class, __ojsp_varRes, null)));
                                    __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                                    if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,7);
                                  }
                                  out.write("\"/>\r\n                                                                    ");
                                } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,6);
                          }
                          out.write("\r\n                                                                ");
                        } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,5);
                    }
                    out.write("\r\n                                                                ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_53.setParent(__jsp_taghandler_49);
                      __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                                                    ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_54=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                            __jsp_taghandler_54.setParent(__jsp_taghandler_53);
                            __jsp_taghandler_54.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.docGrupo");
                            __jsp_taghandler_54.setStyle("text-align: center;");
                            __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_54,__jsp_tag_starteval,out);
                                do {
                                  out.write(" - ");
                                } while (__jsp_taghandler_54.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,6);
                          }
                          out.write("\r\n                                                                ");
                        } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,5);
                    }
                    out.write("\r\n                                                            ");
                  } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_55=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                __jsp_taghandler_55.setParent(__jsp_taghandler_48);
                __jsp_taghandler_55.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.documento");
                __jsp_taghandler_55.setSortable(false);
                __jsp_taghandler_55.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_55,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <a href=\"downloadFile.do?uuid=");
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_56=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_56.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_56.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.fdbDoctoRef}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                        if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                           throw new javax.servlet.jsp.SkipPageException();
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,5);
                      }
                      out.write("\" title=\"Descargar documento\" target=\"_blank\">\r\n                                                                    <img src=\"");
                      {
                        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_57=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                        __jsp_taghandler_57.setParent(__jsp_taghandler_55);
                        __jsp_taghandler_57.setCode("pdf-download.jpg");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                          if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_57.doCatch(th);
                        } finally {
                          __jsp_taghandler_57.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,5);
                      }
                      out.write("\" border=\"0\" width=\"20\"/>\r\n                                                                </a>\r\n                                                            ");
                    } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_58=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_58.setParent(__jsp_taghandler_48);
                __jsp_taghandler_58.setProperty("fdbSecuencia");
                __jsp_taghandler_58.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.id");
                __jsp_taghandler_58.setSortable(false);
                __jsp_taghandler_58.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_59=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_59.setParent(__jsp_taghandler_48);
                __jsp_taghandler_59.setProperty("nombreEmpleado");
                __jsp_taghandler_59.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.nombreEmpleado");
                __jsp_taghandler_59.setSortable(false);
                __jsp_taghandler_59.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_60=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_60.setParent(__jsp_taghandler_48);
                __jsp_taghandler_60.setProperty("primerApellido");
                __jsp_taghandler_60.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.primerApellido");
                __jsp_taghandler_60.setSortable(false);
                __jsp_taghandler_60.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_61=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_61.setParent(__jsp_taghandler_48);
                __jsp_taghandler_61.setProperty("segundoApellido");
                __jsp_taghandler_61.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.segundoApellido");
                __jsp_taghandler_61.setSortable(false);
                __jsp_taghandler_61.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_62=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_62.setParent(__jsp_taghandler_48);
                __jsp_taghandler_62.setProperty("fdbFechaNacimiento");
                __jsp_taghandler_62.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.fecNacimiento");
                __jsp_taghandler_62.setSortable(false);
                __jsp_taghandler_62.setFormat("{0,date,dd/MM/yyyy}");
                __jsp_taghandler_62.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_63=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_63.setParent(__jsp_taghandler_48);
                __jsp_taghandler_63.setProperty("descGenero");
                __jsp_taghandler_63.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.genero");
                __jsp_taghandler_63.setSortable(false);
                __jsp_taghandler_63.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_64=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_64.setParent(__jsp_taghandler_48);
                __jsp_taghandler_64.setProperty("descParentesco");
                __jsp_taghandler_64.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.parentesco");
                __jsp_taghandler_64.setSortable(false);
                __jsp_taghandler_64.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_65=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_65.setParent(__jsp_taghandler_48);
                __jsp_taghandler_65.setProperty("descNivelEscolar");
                __jsp_taghandler_65.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.nivelEscolar");
                __jsp_taghandler_65.setSortable(false);
                __jsp_taghandler_65.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_66=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_66.setParent(__jsp_taghandler_48);
                __jsp_taghandler_66.setProperty("fdbPromedio");
                __jsp_taghandler_66.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.promedioEscolar");
                __jsp_taghandler_66.setSortable(false);
                __jsp_taghandler_66.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_67=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_67.setParent(__jsp_taghandler_48);
                __jsp_taghandler_67.setProperty("desStatus");
                __jsp_taghandler_67.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.estado");
                __jsp_taghandler_67.setSortable(false);
                __jsp_taghandler_67.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_68=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_68.setParent(__jsp_taghandler_48);
                __jsp_taghandler_68.setProperty("descRechazo");
                __jsp_taghandler_68.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.rechazo");
                __jsp_taghandler_68.setSortable(false);
                __jsp_taghandler_68.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_69=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                __jsp_taghandler_69.setParent(__jsp_taghandler_48);
                __jsp_taghandler_69.setProperty("fecModifico");
                __jsp_taghandler_69.setTitleKey("sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.fecModifico");
                __jsp_taghandler_69.setSortable(false);
                __jsp_taghandler_69.setFormat("{0,date,dd/MM/yyyy}");
                __jsp_taghandler_69.setStyle("text-align: center");
                __jsp_tag_starteval=__jsp_taghandler_69.doStartTag();
                if (__jsp_taghandler_69.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_69,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_70=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_70.setParent(__jsp_taghandler_48);
                __jsp_taghandler_70.setName("paging.banner.placement");
                __jsp_taghandler_70.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_70.doStartTag();
                if (__jsp_taghandler_70.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_70,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_71=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_71.setParent(__jsp_taghandler_48);
                __jsp_taghandler_71.setName("export.pdf");
                __jsp_taghandler_71.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_71.doStartTag();
                if (__jsp_taghandler_71.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_71,4);
              }
              out.write("\r\n                                                            ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_72=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_72.setParent(__jsp_taghandler_48);
                __jsp_taghandler_72.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_72,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                                                <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_73=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_73.setParent(__jsp_taghandler_72);
                        __jsp_taghandler_73.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_73.doStartTag();
                          if (__jsp_taghandler_73.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_73.doCatch(th);
                        } finally {
                          __jsp_taghandler_73.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_73,5);
                      }
                      out.write("<br/><br/></span>\r\n                                                            ");
                    } while (__jsp_taghandler_72.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,4);
              }
              out.write("\r\n                                                        ");
            } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,3);
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

  private static final char __oracle_jsp_text[][]=new char[59][];
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
    "</strong>\r\n                                </legend>\r\n                                <table width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"left\">\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>Alta y/o modificaci&oacute;n de familiares, dependientes o beneficiarios</strong></legend><br/>\r\n                                                <table width=\"100%\">\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[21] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\"> ".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\"> ".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"center\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[27] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[29] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr align=\"center\">\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                                        </td>\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                                                        <td align=\"left\">\r\n                                                            <table align=\"left\" width=\"80%\">\r\n                                                                <tr>                        \r\n                                                                    <td align=\"left\">\r\n                                                                        ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                                                                    </td>\r\n                                                                    <td align=\"left\">\r\n                                                                        ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                                        <tr align=\"left\">\r\n                                                            <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[40] = 
    "</td>\r\n                                                            <td align=\"left\" colspan=\"3\">\r\n                                                                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                                                ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                                    <tr align=\"center\">\r\n                                                        <td colspan=\"6\">&nbsp;</td>\r\n                                                    </tr>\r\n                                                    <tr align=\"left\">\r\n                                                        <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                                                        <td align=\"left\" colspan=\"5\">\r\n                                                            <input type=\"file\" name=\"documentoSoporte\" id=\"documentoSoporte\" value=\"*.*\" size=\"50\" class=\"anchoInput\"/>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                                <table width=\"100%\">\r\n                                                    <tr align=\"center\">\r\n                                                        <td>&nbsp;</td>\r\n                                                    </tr>\r\n                                                    <tr align=\"center\">\r\n                                                        <td>\r\n                                                            ".toCharArray();
    __oracle_jsp_text[45] = 
    " &nbsp; \r\n                                                            ".toCharArray();
    __oracle_jsp_text[46] = 
    " &nbsp;\r\n                                                            ".toCharArray();
    __oracle_jsp_text[47] = 
    " &nbsp;\r\n                                                            ".toCharArray();
    __oracle_jsp_text[48] = 
    " &nbsp;            \r\n                                                            ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr align=\"center\">\r\n                                        <td>&nbsp;</td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"left\" height=\"20px\" valign=\"middle\">\r\n                                            <strong>\r\n                                                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                                            </strong>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr align=\"center\">\r\n                                        <td>&nbsp;</td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td>\r\n                                            <fieldset>\r\n                                                <legend style=\"font-size:1.3em\"><strong>Antecedentes de familiares, dependientes o beneficiarios</strong></legend>\r\n                                                \r\n                                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                    \r\n                                                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                            </fieldset>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <script type=\"text/javascript\">\r\n        function enableRegistrarButtons(){\r\n            // Boton registrar\r\n            $j(\"#10001\").removeAttr('disabled');\r\n        }\r\n        function disableRegistrarButtons(){\r\n            // Boton registrar\r\n            $j(\"#10001\").attr('disabled','true');\r\n        }\r\n        \r\n        function disableAutorizarButtons(){\r\n            // Boton autorizar\r\n            $j(\"#10002\").attr('disabled','true');\r\n            // Boton rechazar\r\n            $j(\"#10003\").attr('disabled','true');\r\n        }\r\n        function enableAutorizarButtons(){            \r\n            // Boton autorizar\r\n            $j(\"#10002\").removeAttr('disabled');\r\n            // Boton rechazar\r\n            $j(\"#10003\").removeAttr('disabled');\r\n        }\r\n        function enableEliminarButtons(){\r\n            $j(\"#10004\").removeAttr('disabled','true');\r\n        }\r\n        function disableEliminarButtons(){\r\n            $j(\"#10004\").attr('disabled','true');\r\n        }        \r\n        function disableFormButtons(){\r\n            $j(\"#nombreEmpleado\").prop(\"disabled\", true);\r\n            $j(\"#primerApellido\").prop(\"disabled\", true);\r\n            $j(\"#segundoApellido\").prop(\"disabled\", true);\r\n            $j(\"#fecNacimiento\").prop(\"disabled\", true);\r\n            $j(\"#text_fecNacimiento\").prop(\"disabled\", true);\r\n            $j(\"#button_fecNacimiento\").prop(\"disabled\", true);\r\n            $j(\"#parentesco\").prop(\"disabled\", true);\r\n            $j(\"#nivelEscolar\").prop(\"disabled\", true);\r\n            $j(\"#promedioEscolar\").prop(\"disabled\", true);\r\n            $j(\"input[type=radio]\").attr('disabled', true);\r\n            $j(\"#documentoSoporte\").prop(\"disabled\", true);\r\n        }\r\n        function enableFormButtons(){\r\n            $j(\"#nombreEmpleado\").removeAttr('disabled');\r\n            $j(\"#primerApellido\").removeAttr('disabled');\r\n            $j(\"#segundoApellido\").removeAttr('disabled');\r\n            $j(\"#fecNacimiento\").removeAttr('disabled');\r\n            $j(\"#text_fecNacimiento\").removeAttr('disabled');\r\n            $j(\"#button_fecNacimiento\").removeAttr('disabled');\r\n            $j(\"#parentesco\").removeAttr('disabled');\r\n            $j(\"#nivelEscolar\").removeAttr('disabled');\r\n            $j(\"#promedioEscolar\").removeAttr('disabled');\r\n            $j(\"input[type=radio]\").removeAttr('disabled');\r\n            $j(\"#documentoSoporte\").removeAttr('disabled');\r\n        }\r\n        \r\n        function cleanForm(){\r\n            $j(\"#nombreEmpleado\").val('');\r\n            $j(\"#primerApellido\").val('');\r\n            $j(\"#segundoApellido\").val('');\r\n            $j(\"#fecNacimiento\").val('');\r\n            $j(\"#text_fecNacimiento\").val('');\r\n            $j(\"#button_fecNacimiento\").val('');\r\n            $j(\"#parentesco\").val('');\r\n            $j(\"#nivelEscolar\").val('');\r\n            $j(\"#promedioEscolar\").val('');\r\n            $j(\"input[type=radio]\").val('');\r\n            $j(\"#documentoSoporte\").val('');\r\n            $j(\"#genero\").val('');\r\n            $j(\"#genero1\").attr('checked', false);\r\n            $j(\"#genero2\").attr('checked', false);\r\n        }\r\n        disableRegistrarButtons();\r\n        disableAutorizarButtons();\r\n        disableEliminarButtons();\r\n    </script>\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){\r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.numeric').numeric();\r\n            $j(\"#promedioEscolar\").mask(\"999.99\");\r\n        });\r\n        \r\n        // Pagedlist asincrono\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Recuperar fila selecccionada\r\n        var rolRegistrar = ".toCharArray();
    __oracle_jsp_text[53] = 
    "; \r\n        var rolAutorizar = ".toCharArray();
    __oracle_jsp_text[54] = 
    "; \r\n        $j('.box').change(function(){\r\n            disableRegistrarButtons();\r\n            disableAutorizarButtons();\r\n            disableEliminarButtons();\r\n            $j('.box:checked').each(function(){\r\n                var auxNombreEmpleado   = $j(this).parent().next('td').next('td').next('td').text();\r\n                var auxPrimerApellido   = $j(this).parent().next('td').next('td').next('td').next('td').text();\r\n                var auxSegundoApellido  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxFecNacimiento    = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxGenero           = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                \r\n                var auxParentesco       = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxParentesco2      = auxParentesco.split(\" - \"); \r\n                \r\n                var auxNivelEscolar     = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxNivelEscolar2    = auxNivelEscolar.split(\" - \");\r\n                \r\n                var auxPromedioEscolar  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                \r\n                $j(\"#nombreEmpleado\").val(auxNombreEmpleado);\r\n                $j(\"#primerApellido\").val(auxPrimerApellido);\r\n                $j(\"#segundoApellido\").val(auxSegundoApellido);\r\n                $j(\"#fecNacimiento\").val(auxFecNacimiento);\r\n                $j(\"#text_fecNacimiento\").val(auxFecNacimiento);\r\n                \r\n                //auxGenero == 'Masculino' ? 'M' : 'F';\r\n                if (auxGenero == 'Masculino') {\r\n                    $j(\"#genero1\").attr('checked', 'checked');\r\n                } else {\r\n                    $j(\"#genero2\").attr('checked', 'checked');\r\n                }\r\n                \r\n                $j(\"#parentesco\").val(auxParentesco2[0]);\r\n                $j(\"#nivelEscolar\").val(auxNivelEscolar2[0]);\r\n                $j(\"#promedioEscolar\").val(auxPromedioEscolar);\r\n                \r\n                // Rechazo\r\n                var auxRechazo  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                var auxRechazo2 = auxRechazo.split(\" - \");\r\n                $j(\"#rechazo\").val(auxRechazo2);\r\n                \r\n                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();\r\n                if (auxEstatus == 'RECHAZADO') {\r\n                    if(rolRegistrar){\r\n                        enableRegistrarButtons();\r\n                    }\r\n                    disableAutorizarButtons();\r\n                }\r\n                if (auxEstatus == 'REGISTRO') {\r\n                    if(rolAutorizar){\r\n                        enableAutorizarButtons();\r\n                    } else {\r\n                        enableEliminarButtons();\r\n                    }\r\n                    disableFormButtons();\r\n                    disableRegistrarButtons();\r\n                }\r\n            });\r\n        });\r\n        \r\n        // Checkbox unico\r\n        $j(':checkbox').on('change',function(){\r\n            var th = $j(this), name = th.prop('name'); \r\n            if(th.is(':checked')){\r\n                $j(':checkbox[name=\"'  + name + '\"]').not($(this)).prop('checked',false);   \r\n            } else {\r\n                cleanForm();\r\n                enableFormButtons();\r\n                if(rolRegistrar){\r\n                    enableRegistrarButtons();\r\n                }\r\n            }\r\n        });\r\n        \r\n    </script>\r\n    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n        <script type=\"text/javascript\">\r\n            $j(document).ready(function(){\r\n                enableRegistrarButtons();\r\n            });\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
