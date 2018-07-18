package _web_2d_inf._jsp._spc._capcer._registro;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _asignarParticipante extends com.orionserver.http.OrionHttpJspPage {


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
    _asignarParticipante page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("asignarParticipanteDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("idCurso");
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
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setPath("rolAdministradorCapacitacion");
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
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("rolAdministradorCertificacion");
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
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setPath("rolCoordinacionAdministrativa");
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
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("anioOperacion");
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
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("cupoMaximoAula");
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
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("postDataInscribirParticipante");
                __jsp_taghandler_8.setId("postDataInscribirParticipante");
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
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("postDataCancelarParticipante");
                __jsp_taghandler_9.setId("postDataCancelarParticipante");
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
              out.write(__oracle_jsp_text[15]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setPath("urlInscribirParticipante");
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
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setPath("urlCancelarParticipante");
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
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setCode("sireh.label.spc.capcer.registro.asignarParticipante.title");
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
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.spc.capcer.registro.asignarParticipante.tipoCurso");
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
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_14=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("tipoCursoDescripcion");
                __jsp_taghandler_14.setReadonly("true");
                __jsp_taghandler_14.setSize("40");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.spc.capcer.registro.asignarParticipante.claveCurso");
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
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_16=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setPath("cursoClave");
                __jsp_taghandler_16.setReadonly("true");
                __jsp_taghandler_16.setSize("40");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.spc.capcer.registro.asignarParticipante.nombreCurso");
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
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_18=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("descCursoPrincipal");
                __jsp_taghandler_18.setReadonly("true");
                __jsp_taghandler_18.setSize("40");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.spc.capcer.registro.asignarParticipante.subPrograma");
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
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_20=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setPath("descSubprograma");
                __jsp_taghandler_20.setReadonly("true");
                __jsp_taghandler_20.setSize("40");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.spc.capcer.registro.asignarParticipante.ejeTematico");
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
              out.write(__oracle_jsp_text[27]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_22=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setPath("descEjeTematico");
                __jsp_taghandler_22.setReadonly("true");
                __jsp_taghandler_22.setSize("40");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.spc.capcer.registro.asignarParticipante.modalidad");
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
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_24=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setPath("descModalidad");
                __jsp_taghandler_24.setReadonly("true");
                __jsp_taghandler_24.setSize("40");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.spc.capcer.registro.asignarParticipante.finalidad");
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
              out.write(__oracle_jsp_text[31]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_26=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setPath("descFinalidad");
                __jsp_taghandler_26.setReadonly("true");
                __jsp_taghandler_26.setSize("40");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setCode("sireh.label.spc.capcer.registro.asignarParticipante.duracion");
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
              out.write(__oracle_jsp_text[33]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_28=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setPath("cursoDuracion");
                __jsp_taghandler_28.setReadonly("true");
                __jsp_taghandler_28.setSize("40");
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.label.spc.capcer.registro.asignarParticipante.noParticipantes");
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
              out.write(__oracle_jsp_text[35]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_30=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("cursoMinimoParticipantes");
                __jsp_taghandler_30.setReadonly("true");
                __jsp_taghandler_30.setSize("40");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.label.spc.capcer.registro.asignarParticipante.fechaInicio");
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
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_32=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setPath("cursoFecIniFormat");
                __jsp_taghandler_32.setReadonly("true");
                __jsp_taghandler_32.setSize("40");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.spc.capcer.registro.asignarParticipante.fechaTermino");
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
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_34=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setPath("cursoFecFinFormat");
                __jsp_taghandler_34.setReadonly("true");
                __jsp_taghandler_34.setSize("40");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setCode("sireh.label.spc.capcer.registro.asignarParticipante.sede");
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
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_36=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setPath("descSede");
                __jsp_taghandler_36.setReadonly("true");
                __jsp_taghandler_36.setSize("40");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.spc.capcer.registro.asignarParticipante.aula");
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
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_38=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setPath("descAula");
                __jsp_taghandler_38.setReadonly("true");
                __jsp_taghandler_38.setSize("40");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setCode("sireh.label.spc.capcer.registro.asignarParticipante.horario");
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
              out.write(__oracle_jsp_text[45]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_40=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.descHorarioCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_40.doStartTag();
                if (__jsp_taghandler_40.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_40,2);
              }
              out.write(__oracle_jsp_text[46]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.idCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,2);
              }
              out.write(__oracle_jsp_text[47]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.tipoCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,2);
              }
              out.write(__oracle_jsp_text[48]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.rolAdministradorCapacitacion || asignarParticipanteDTO.rolCoordinacionAdministrativa}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[49]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_44=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_44.setParent(__jsp_taghandler_43);
                      __jsp_taghandler_44.setJspContext(pageContext);
                      __jsp_taghandler_44.setPath("inscribirParticipantes");
                      __jsp_taghandler_44.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.urlInscribirParticipante}",java.lang.String.class, __ojsp_varRes, null)+".do"));
                      __jsp_taghandler_44.setValue("submit.save");
                      __jsp_taghandler_44.setOnclick("setJsonInscribirParticipante()");
                      __jsp_taghandler_44.setProgressBar("true");
                      __jsp_taghandler_44.setAlertCode("confirm.spc.capcer.registro.registrarCurso");
                      __jsp_taghandler_44.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
                    }
                    out.write(__oracle_jsp_text[50]);
                  } while (__jsp_taghandler_43.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_45=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setAction("registroCursoSPC/consultaAsignarParticipante.do");
                __jsp_taghandler_45.setValue("submit.cancel");
                __jsp_taghandler_45.setProgressBar("true");
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[52]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.idCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,2);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.tipoCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,2);
              }
              out.write(__oracle_jsp_text[54]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setCode("sireh.label.spc.capcer.registro.asignarParticipante.idMotivoDesasigna");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                  if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_48.doCatch(th);
                } finally {
                  __jsp_taghandler_48.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,2);
              }
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_49=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setJspContext(pageContext);
                __jsp_taghandler_49.setKey("");
                __jsp_taghandler_49.setValue("selectList.nonValue");
                __jsp_taghandler_49.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_50=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setJspContext(pageContext);
                __jsp_taghandler_50.setBeanName("tcCapMotivoDesasigna-asignarParticipante");
                __jsp_taghandler_50.setPath("idMotivoDesasigna");
                __jsp_taghandler_50.setStyle("width:300px;");
                __jsp_taghandler_50.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
              }
              out.write(__oracle_jsp_text[57]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.rolAdministradorCapacitacion || asignarParticipanteDTO.rolCoordinacionAdministrativa}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[58]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_52=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_52.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_52.setJspContext(pageContext);
                      __jsp_taghandler_52.setPath("cancelarInscripcion");
                      __jsp_taghandler_52.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.urlCancelarParticipante}",java.lang.String.class, __ojsp_varRes, null)+".do"));
                      __jsp_taghandler_52.setValue("submit.cancelar.asignacion");
                      __jsp_taghandler_52.setOnclick("setJsonCancelarParticipante()");
                      __jsp_taghandler_52.setProgressBar("true");
                      __jsp_taghandler_52.setAlertCode("confirm.spc.capcer.registro.registrarCurso");
                      __jsp_taghandler_52.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
                    }
                    out.write(__oracle_jsp_text[59]);
                  } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,2);
              }
              out.write(__oracle_jsp_text[60]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_53=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setJspContext(pageContext);
                __jsp_taghandler_53.setKey("");
                __jsp_taghandler_53.setValue("selectList.nonValue");
                __jsp_taghandler_53.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
              }
              out.write(__oracle_jsp_text[61]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_54=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setJspContext(pageContext);
                __jsp_taghandler_54.setBeanName("tcCapNotifCurso-asignarParticipante");
                __jsp_taghandler_54.setPath("idModalidad");
                __jsp_taghandler_54.setOnchange("cargarMensaje()");
                __jsp_taghandler_54.setStyle("width:200px;");
                __jsp_taghandler_54.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_55=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.idCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,2);
              }
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_56=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setJspContext(pageContext);
                __jsp_taghandler_56.setPath("enviarNotificacion");
                __jsp_taghandler_56.setAction("registroCursoSPC/enviarNotificaciones.do");
                __jsp_taghandler_56.setValue("submit.enviar.notificacion");
                __jsp_taghandler_56.setOnclick("setJsonCancelarParticipante()");
                __jsp_taghandler_56.setProgressBar("true");
                __jsp_taghandler_56.setAlertCode("confirm.spc.capcer.registro.enviarNotificaciones");
                __jsp_taghandler_56.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_56, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_57=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarParticipanteDTO.idCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,2);
              }
              out.write(__oracle_jsp_text[65]);
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
  private static final char __oracle_jsp_text[][]=new char[66][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n    .anchoInputSmall {\r\n        width: 100px;\r\n    }\r\n</style>\r\n                                \r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[18] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Datos del curso</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tbody>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[19] = 
    ":</td>\r\n                                <td><b>".toCharArray();
    __oracle_jsp_text[20] = 
    "</b></td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[23] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[25] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[27] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[29] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[31] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[33] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[35] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[37] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[38] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[39] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[40] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[41] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[42] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[43] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[44] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[45] = 
    ":</td>\r\n                                <td>".toCharArray();
    __oracle_jsp_text[46] = 
    "</td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </fieldset><br/><br/>\r\n                \r\n                <!--TABS-->\r\n                <div class=\"tabs\">\r\n                    <ul class=\"tab-links\">\r\n                        <li class=\"active\"><a href=\"#tab1\">Asignar participante</a></li>\r\n                        <li><a href=\"#tab2\">Participantes inscritos</a></li>\r\n                        <li><a href=\"#tab3\">Env&iacute;o de notificaciones</a></li>\r\n                    </ul>\r\n\r\n                    <div class=\"tab-content\">\r\n                        <div id=\"tab1\" class=\"tab active\">\r\n                            <fieldset>\r\n                                <legend style=\"font-size:1.3em\"><strong>Asignar Participante</strong></legend>\r\n                                <!-- json -->\r\n                                <table width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"center\" style=\"padding: 5px;\">\r\n                                            <br />\r\n                                            <div style=\"width:1000px;overflow:auto;\">\r\n                                                <table id=\"listParticipantesCandidatos\"></table>\r\n                                                <div id=\"pagerParticipantesCandidatos\"></div>\r\n                                            </div>\r\n                                            <br />\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n\r\n                                <script type=\"text/javascript\">                                    \r\n                                    var idCurso = '".toCharArray();
    __oracle_jsp_text[47] = 
    "';\r\n                                    var tipoCurso = '".toCharArray();
    __oracle_jsp_text[48] = 
    "';\r\n                                    var grid = $j('#listParticipantesCandidatos'), idsOfSelectedRows = [],\r\n                                    updateIdsOfSelectedRows = function (id, isSelected) {\r\n                                        var index = $j.inArray(id, idsOfSelectedRows);\r\n                                        if (!isSelected && index >= 0) {\r\n                                            idsOfSelectedRows.splice(index, 1); // remove id from the list\r\n                                        } else if (index < 0) {\r\n                                            idsOfSelectedRows.push(id);\r\n                                        }\r\n                                    };\r\n                                    var getColumnIndexByName = function(grid, columnName) {\r\n                                        var cm = grid.jqGrid('getGridParam', 'colModel'), i, l;\r\n                                        for (i = 0, l = cm.length; i < l; i += 1) {\r\n                                            if (cm[i].name === columnName) {\r\n                                                return i; // return the index\r\n                                            }\r\n                                        }\r\n                                        return -1;\r\n                                    }\r\n                                    \r\n                                    $j(\"#listParticipantesCandidatos\").jqGrid({\r\n                                        url: 'jsonCallbackParticipantesCandidatos.do?idCurso=' + idCurso + '&tipoCurso=' + tipoCurso, \r\n                                        datatype: 'json',\r\n                                        colNames: [\r\n                                            'Selecci&oacute;n',\r\n                                            'Unidad',\r\n                                            'Nivel',\r\n                                            'RFC',\r\n                                            'Nombre',\r\n                                            'Primer apellido',\r\n                                            'Segundo apellido',\r\n                                            'Email',\r\n                                            'Email alterno',\r\n                                            'Fecha de ingreso',\r\n                                            'Fecha de reingreso',\r\n                                            'Fecha de vigencia'\r\n                                        ],\r\n                                        colModel: [\r\n                                            {name: 'seleccion', index: 'seleccion', width: 60, align: \"center\", editable: true, edittype: 'checkbox', editoptions: {value: \"True:False\"}, formatter: \"checkbox\", formatoptions: {disabled: false}, search: false},\r\n                                            {name: 'unidad', index: 'unidad', width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'nivel', index: 'nivel', width: 110, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'rfcEmpleado', index: 'rfcEmpleado', width: 110, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'nombre', index: 'nombre', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'primerApellido', index: 'primerApellido', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'segundoApellido', index: 'segundoApellido', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            \r\n                                            {name: 'email', index: 'email', width: 200, align: \"left\", sortable: false, sorttype: \"text\", search: true},\r\n                                            {name: 'emailAlterno', index: 'emailAlterno', width: 200, align: \"left\", sortable: false, search: false, editable: true},\r\n                                            \r\n                                            {name: 'fechaIngreso', index: 'fechaIngreso', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'fechaReingreso', index: 'fechaReingreso', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            \r\n                                            {name: 'fechaVigencia', index: 'fechaVigencia', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true}\r\n                                        ],\r\n                                        rowNum: \"50\",\r\n                                        pager: '#pagerParticipantesCandidatos',\r\n                                        viewrecords: true,\r\n                                        loadonce: true,\r\n                                        loadComplete: function() {\r\n                                            var jthis = $j(this), ids = jthis.jqGrid('getDataIDs'), i, l = ids.length;\r\n                                            for (i = 0; i < l; i++) {\r\n                                                jthis.jqGrid('editRow', ids[i], true);\r\n                                                var fechaVigencia = $j(\"#listParticipantesCandidatos\").jqGrid('getCell',ids[i],'fechaVigencia');\r\n                                                if(fechaVigencia){\r\n                                                    $j(\"#\"+ids[i]+\"_seleccion\").attr(\"disabled\", true);\r\n                                                    }\r\n                                                }\r\n                                            var jthis = $j(this), i, count;\r\n                                            for (i = 0, count = idsOfSelectedRows.length; i < count; i++) {\r\n                                                //jthis.jqGrid('setSelection', idsOfSelectedRows[i], false);\r\n                                                $j(\"#\"+idsOfSelectedRows[i]+\"_seleccion\").prop('checked', true);\r\n                                            }\r\n                                            var iCol = getColumnIndexByName ($j(this), 'seleccion'), rows = this.rows, i, c = rows.length;\r\n                                            for (i = 0; i < c; i += 1) {\r\n                                                $j(rows[i].cells[iCol]).click(function (e) {\r\n                                                    var id = $j(e.target).closest('tr')[0].id,\r\n                                                        isChecked = $j(e.target).is(':checked');\r\n                                                        updateIdsOfSelectedRows(id, isChecked);\r\n                                                });\r\n                                            }\r\n                                        },\r\n                                        height: 200,\r\n                                        gridComplete: function() {\r\n                                            $j(\"#listParticipantesCandidatos\").setGridParam({datatype: 'local'});\r\n                                        }\r\n                                    });\r\n\r\n                                    \r\n                                    grid.jqGrid('inlineNav', '#pagerParticipantesCandidatos');\r\n                                    grid.jqGrid('filterToolbar', {searchOnEnter: true, enableClear: false});\r\n\r\n                                    $j(window).resize(function() {\r\n                                        $j('#listParticipantesCandidatos').jqGrid('setGridHeight', \"200.0\");\r\n                                    });\r\n                                </script>\r\n                                <!-- json -->\r\n\r\n                                <!--BOTONES-->\r\n                                <table width=\"100%\">\r\n                                    <tbody>\r\n                                        <tr>\r\n                                            <td align=\"center\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[50] = 
    " &nbsp;\r\n                                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                    </tbody>\r\n                                </table>\r\n                                <!--BOTONES-->\r\n                            </fieldset>\r\n                        </div>\r\n\r\n                        <div id=\"tab2\" class=\"tab\">\r\n                            <fieldset>\r\n                                <legend style=\"font-size:1.3em\"><strong>Participantes Inscritos</strong></legend>\r\n                                \r\n                                <!-- json -->\r\n                                <table width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"center\" style=\"padding: 5px;\">\r\n                                            <br />\r\n                                            <div style=\"width:1000px;overflow:auto;\">\r\n                                                <table id=\"listParticipantesInscritos\"></table>\r\n                                                <div id=\"pagerParticipantesInscritos\"></div>\r\n                                            </div>\r\n                                            <br />\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n\r\n                                <script type=\"text/javascript\">                                    \r\n                                    var idCurso = '".toCharArray();
    __oracle_jsp_text[53] = 
    "';\r\n                                    var tipoCurso = '".toCharArray();
    __oracle_jsp_text[54] = 
    "';\r\n                                    \r\n                                    $j(\"#listParticipantesInscritos\").jqGrid({\r\n                                        url: 'jsonCallbackParticipantesInscritos.do?idCurso=' + idCurso + '&tipoCurso=' + tipoCurso, \r\n                                        datatype: 'json',\r\n                                        colNames: [\r\n                                            'Selecci&oacute;n',\r\n                                            'Unidad',\r\n                                            'Nivel',\r\n                                            'RFC',\r\n                                            'Nombre',\r\n                                            'Primer apellido',\r\n                                            'Segundo apellido',\r\n                                            'Email',\r\n                                            'Notificado',\r\n                                            'Observaciones'\r\n                                        ],\r\n                                        colModel: [\r\n                                            {name: 'seleccion', index: 'seleccion', width: 60, align: \"center\", editable: true, edittype: 'checkbox', editoptions: {value: \"True:False\"}, formatter: \"checkbox\", formatoptions: {disabled: false}, search: false},\r\n                                            {name: 'unidad', index: 'unidad', width: 200, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'nivel', index: 'nivel', width: 110, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'rfcEmpleado', index: 'rfcEmpleado', width: 110, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'nombre', index: 'nombre', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'primerApellido', index: 'primerApellido', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'segundoApellido', index: 'segundoApellido', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'email', index: 'email', width: 200, align: \"left\", sortable: false, sorttype: \"text\", search: true},\r\n                                            {name: 'fechaNotificacion', index: 'fechaNotificacion', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: true},\r\n                                            {name: 'participanteObservaciones', index: 'participanteObservaciones', width: 110, align: \"left\", sortable: true, sorttype: \"text\", search: false}\r\n                                        ],\r\n                                        rowNum: \"50\",\r\n                                        pager: '#pagerParticipantesInscritos',\r\n                                        viewrecords: true,\r\n                                        loadonce: true,\r\n                                        loadComplete: function() {\r\n                                            var $jthis = $j(this), ids = $j(this).jqGrid('getDataIDs'), i, l = ids.length;\r\n                                            for (i = 0; i < l; i++) {\r\n                                                $jthis.jqGrid('editRow', ids[i], true);\r\n                                            }\r\n                                        },\r\n                                        height: 200,\r\n                                        gridComplete: function() {\r\n                                            $j(\"#listParticipantesInscritos\").setGridParam({datatype: 'local'});\r\n                                        }\r\n                                    });\r\n\r\n                                    var grid = $j('#listParticipantesInscritos');\r\n                                    grid.jqGrid('inlineNav', '#pagerParticipantesInscritos');\r\n                                    grid.jqGrid('filterToolbar', {searchOnEnter: true, enableClear: false});\r\n\r\n                                    $j(window).resize(function() {\r\n                                        $j('#listParticipantesInscritos').jqGrid('setGridHeight', \"200.0\");\r\n                                    });\r\n                                </script>\r\n                                <!-- json -->\r\n                                \r\n                                <!--MENSAJE-->\r\n                                <table width=\"100%\">\r\n                                    <tbody>\r\n                                        <tr align=\"left\">\r\n                                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[55] = 
    ":</td>\r\n                                            <td>\r\n                                                ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                    </tbody>\r\n                                </table>\r\n                                <!--MENSAJE-->\r\n                                \r\n                                <!--BOTONES-->\r\n                                <table width=\"100%\">\r\n                                    <tbody>\r\n                                        <tr align=\"center\">\r\n                                            <td>\r\n                                                ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[59] = 
    " &nbsp;\r\n                                                ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                    </tbody>\r\n                                </table><br/><br/>\r\n                                <!--BOTONES-->\r\n                                \r\n                            </fieldset>\r\n                        </div>\r\n\r\n                        <div id=\"tab3\" class=\"tab\">\r\n                            <fieldset>\r\n                                <legend style=\"font-size:1.3em\"><strong>Env&iacute;o de notificaciones</strong></legend>\r\n                                <table width=\"100%\">\r\n                                    <tbody>\r\n                                        <tr align=\"left\">\r\n                                            <td class=\"label\">Modalidad:</td>\r\n                                            <td>\r\n                                                ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr align=\"left\">\r\n                                            <td class=\"label\">Asunto:</td>\r\n                                            <td>\r\n                                                <div id=\"asuntoCorreo\">\r\n                                                    N/A\r\n                                                </div>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr align=\"left\">\r\n                                            <td class=\"label\" style=\"vertical-align: top\">Cuerpo del mensaje:</td>\r\n                                            <td>\r\n                                                <div id=\"mensajeCorreo\">\r\n                                                    N/A\r\n                                                </div>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr align=\"left\">\r\n                                            <td class=\"label\" style=\"vertical-align: top\">Archivo adjunto:</td>\r\n                                            <td>\r\n                                                <a id=\"linkNotificacion\" href='downloadNotificacion.do?idCurso=".toCharArray();
    __oracle_jsp_text[63] = 
    "' class='requestlink' title='Ver Notificacion' target='_blank'><img id=\"imgNotificacion\" width='20' align='middle' src='../images/pdf-download.jpg'/></a>\r\n                                            </td>\r\n                                        </tr>\r\n                                    </tbody>\r\n                                </table>\r\n\r\n                                <!--BOTONES-->\r\n                                <table width=\"100%\">\r\n                                    <tbody>\r\n                                        <tr align=\"center\">\r\n                                            <td>\r\n                                                ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                    </tbody>\r\n                                </table>\r\n                                <!--BOTONES-->\r\n                            </fieldset>\r\n                        </div>\r\n                    </div>\r\n                </div>\r\n                <!--TABS-->\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type='text/javascript'>        \r\n        var idCurso = ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n        $j(document).ready(function(){            \r\n            $j('#linkNotificacion').hide();\r\n        });\r\n        \r\n        // Asignar json\r\n        function setJsonInscribirParticipante() {\r\n            var gridData = $j('#listParticipantesCandidatos').getRowData();\r\n            var postData = JSON.stringify(gridData);\r\n            $j('#postDataInscribirParticipante').val(postData);\r\n        }\r\n        \r\n        function setJsonCancelarParticipante() {\r\n            var gridData = $j('#listParticipantesInscritos').getRowData();\r\n            var postData = JSON.stringify(gridData);\r\n            $j('#postDataCancelarParticipante').val(postData);\r\n        }\r\n        \r\n        function cargarMensaje(){\r\n            var idModalidad = $j('select[id=\"idModalidad\"]').val();\r\n            if(idModalidad){\r\n                var originalhref = \"downloadNotificacion.do?idCurso=\"+idCurso;\r\n                $j('#linkNotificacion').show();\r\n                $j('#linkNotificacion').attr('href', originalhref + '&idModalidad=' + idModalidad);    \r\n            }else{\r\n                $j('#linkNotificacion').hide();\r\n            }\r\n            $j.ajax({\r\n                url: 'getTcCapNotifCursoCallBack.do',\r\n                type: 'GET',\r\n                data: 'idModalidad=' + idModalidad,\r\n                success: function(data) {\r\n                    var tokens = data.split(\"|\");\r\n                    $j('#asuntoCorreo').text(tokens[0]);\r\n                    $j('#mensajeCorreo').text(tokens[1]);\r\n                }\r\n            });\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
