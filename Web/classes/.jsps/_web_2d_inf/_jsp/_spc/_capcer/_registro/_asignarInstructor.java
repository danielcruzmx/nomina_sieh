package _web_2d_inf._jsp._spc._capcer._registro;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _asignarInstructor extends com.orionserver.http.OrionHttpJspPage {


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
    _asignarInstructor page = this;
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
        __jsp_taghandler_1.setModelAttribute("asignarInstructorDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("rolEjecutivoContratacion");
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
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setPath("idCurso");
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
                __jsp_taghandler_5.setPath("enCurso");
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
                __jsp_taghandler_6.setCode("sireh.label.spc.capcer.registro.general.consultaCursos.asignarInstructor.title");
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
                __jsp_taghandler_7.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.claveCurso");
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
                __jsp_taghandler_8.setPath("claveCurso");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.nombreCurso");
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
                __jsp_taghandler_10.setPath("nombreCurso");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.Subprograma");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_12=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setPath("subPrograma");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.ejeTematico");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_14=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("ejeTematico");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[18]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.modalidad");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_16=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setJspContext(pageContext);
                __jsp_taghandler_16.setPath("modalidad");
                __jsp_taghandler_16.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_16, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.finalidad");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_18=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setPath("finalidad");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.duracion");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_20=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setPath("duracion");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.proveedor");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_22=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setPath("proveedor");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.fechaInicio");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_24=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setPath("fechaInicio");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.fechaTermino");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_26=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setPath("fechaTermino");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_27=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.sede");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_28=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setJspContext(pageContext);
                __jsp_taghandler_28.setPath("sede");
                __jsp_taghandler_28.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
              }
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.aula");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_30=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("aula");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.horario");
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_32=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setJspContext(pageContext);
                __jsp_taghandler_32.setPath("horario");
                __jsp_taghandler_32.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_32, pageContext);
              }
              out.write(__oracle_jsp_text[36]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.instructores");
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
                _oracle._jsp._tag._filter_tag __jsp_taghandler_34=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setProperty("id_proveedor");
                __jsp_taghandler_34.setCondition("=");
                __jsp_taghandler_34.setPath("idProveedor");
                __jsp_taghandler_34.setId("lInstructores");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_35=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setProperty("cc.id_curso");
                __jsp_taghandler_35.setCondition("=");
                __jsp_taghandler_35.setPath("idCurso");
                __jsp_taghandler_35.setId("lInstructores");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_36=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setProperty(" cc.id_curso ");
                __jsp_taghandler_36.setCondition("=");
                __jsp_taghandler_36.setPath("idCurso");
                __jsp_taghandler_36.setId("lInstructores");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_37=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setJspContext(pageContext);
                __jsp_taghandler_37.setKey("0");
                __jsp_taghandler_37.setValue("selectList.nonValue");
                __jsp_taghandler_37.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_38=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setBeanName("tnCapCurso-AsignarInstructor-listaInstructores");
                __jsp_taghandler_38.setPath("idInstructor");
                __jsp_taghandler_38.setOnchange("botonesAsignar();");
                __jsp_taghandler_38.setAppendFilters("false");
                __jsp_taghandler_38.setStyle("width:200px;");
                __jsp_taghandler_38.setFilterId("lInstructores");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.rolAdministradorCapacitacion || asignarInstructorDTO.rolOperadorCapacitacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[43]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_40=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                      __jsp_taghandler_40.setJspContext(pageContext);
                      __jsp_taghandler_40.setPath("asignarTitular");
                      __jsp_taghandler_40.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_40.setValue("submit.asignar.titular");
                      __jsp_taghandler_40.setProgressBar("true");
                      __jsp_taghandler_40.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
                    }
                    out.write(__oracle_jsp_text[44]);
                  } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,2);
              }
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_41=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setPath("cancelar");
                __jsp_taghandler_41.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_41.setValue("submit.cancel");
                __jsp_taghandler_41.setProgressBar("true");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_42=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.rolAdministradorCapacitacion || asignarInstructorDTO.rolOperadorCapacitacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[47]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_43=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_43.setParent(__jsp_taghandler_42);
                      __jsp_taghandler_43.setJspContext(pageContext);
                      __jsp_taghandler_43.setPath("asignarSuplente");
                      __jsp_taghandler_43.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_43.setValue("submit.asignar.suplente");
                      __jsp_taghandler_43.setProgressBar("true");
                      __jsp_taghandler_43.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
                    }
                    out.write(__oracle_jsp_text[48]);
                  } while (__jsp_taghandler_42.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,2);
              }
              out.write(__oracle_jsp_text[49]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.instructor.titular");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_44.doStartTag();
                  if (__jsp_taghandler_44.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_44.doCatch(th);
                } finally {
                  __jsp_taghandler_44.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_44,2);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[51]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_46=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_46.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.desAsignado && asignarInstructorDTO.enCurso && asignarInstructorDTO.motivoDesasigna == 1}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[52]);
                          {
                            _oracle._jsp._tag._label_tag __jsp_taghandler_47=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                            __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                            __jsp_taghandler_47.setJspContext(pageContext);
                            __jsp_taghandler_47.setPath("instructorTitular");
                            __jsp_taghandler_47.setId("instructorTitular");
                            __jsp_taghandler_47.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
                          }
                          out.write(__oracle_jsp_text[53]);
                        } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,3);
                    }
                    out.write(__oracle_jsp_text[54]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_48=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_48.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_48.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.desAsignado && asignarInstructorDTO.enCurso && asignarInstructorDTO.motivoDesasigna != 1}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[55]);
                        } while (__jsp_taghandler_48.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,3);
                    }
                    out.write(__oracle_jsp_text[56]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_49.setParent(__jsp_taghandler_45);
                      __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[57]);
                          {
                            _oracle._jsp._tag._label_tag __jsp_taghandler_50=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                            __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                            __jsp_taghandler_50.setJspContext(pageContext);
                            __jsp_taghandler_50.setPath("instructorTitular");
                            __jsp_taghandler_50.setId("instructorTitular");
                            __jsp_taghandler_50.setJspBody(new _asignarInstructor_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_50, __ojsp_varRes));
                            __jsp_taghandler_50.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
                          }
                          out.write(__oracle_jsp_text[58]);
                        } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,3);
                    }
                    out.write(__oracle_jsp_text[59]);
                  } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,2);
              }
              out.write(__oracle_jsp_text[60]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_51=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.instructor.suplente");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                  if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_51.doCatch(th);
                } finally {
                  __jsp_taghandler_51.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,2);
              }
              out.write(__oracle_jsp_text[61]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_52=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setJspContext(pageContext);
                __jsp_taghandler_52.setPath("instructorSuplente");
                __jsp_taghandler_52.setId("instructorSuplente");
                __jsp_taghandler_52.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_52, pageContext);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_53=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setCode("sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.cuasa");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                  if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_53.doCatch(th);
                } finally {
                  __jsp_taghandler_53.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,2);
              }
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_54=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setJspContext(pageContext);
                __jsp_taghandler_54.setKey("0");
                __jsp_taghandler_54.setValue("selectList.nonValue");
                __jsp_taghandler_54.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_55=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setBeanName("tnCapCurso-AsignarInstructor-motivoDesasignaInstructor");
                __jsp_taghandler_55.setPath("motivoDesasigna");
                __jsp_taghandler_55.setOnchange("botonesDesasignar();");
                __jsp_taghandler_55.setStyle("width:200px;");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[65]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_56=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_taghandler_56.setJspContext(pageContext);
                __jsp_taghandler_56.setPath("desasignarTitular");
                __jsp_taghandler_56.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_56.setValue("submit.desasignar.titular");
                __jsp_taghandler_56.setProgressBar("true");
                __jsp_taghandler_56.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_56, pageContext);
              }
              out.write(__oracle_jsp_text[66]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_57=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_57.setParent(__jsp_taghandler_1);
                __jsp_taghandler_57.setJspContext(pageContext);
                __jsp_taghandler_57.setPath("desasignarSuplente");
                __jsp_taghandler_57.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_57.setValue("submit.desasignar.suplente");
                __jsp_taghandler_57.setProgressBar("true");
                __jsp_taghandler_57.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_57, pageContext);
              }
              out.write(__oracle_jsp_text[67]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_58=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_58.setParent(__jsp_taghandler_1);
                __jsp_taghandler_58.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.enCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,2);
              }
              out.write(__oracle_jsp_text[68]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_59.setParent(__jsp_taghandler_1);
                __jsp_taghandler_59.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.rolAdministradorCapacitacion}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,2);
              }
              out.write(__oracle_jsp_text[69]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_60=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_60.setParent(__jsp_taghandler_1);
                __jsp_taghandler_60.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${asignarInstructorDTO.desAsignado}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,2);
              }
              out.write(__oracle_jsp_text[70]);
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

  private class _asignarInstructor_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _asignarInstructor_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_50       = parent;
      out.write(" - ");
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

  private static final char __oracle_jsp_text[][]=new char[71][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput { width: 200px; }\r\n    .tachado{text-decoration:line-through;}\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[10] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Datos del curso</strong></legend>\r\n                    <table width=\"100%\" align=\"center\">\r\n                        <tbody>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\" width=\"15%\">".toCharArray();
    __oracle_jsp_text[11] = 
    ":</td>\r\n                                <td align=\"left\" width=\"35%\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                                <td class=\"label\" width=\"15%\">".toCharArray();
    __oracle_jsp_text[13] = 
    ":</td>\r\n                                <td align=\"left\" width=\"35%\">".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[15] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[16] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[17] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[19] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[23] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[24] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[25] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[27] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[28] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[29] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[30] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[31] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[32] = 
    "</td>\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[33] = 
    ":</td>\r\n                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[34] = 
    "</td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[35] = 
    ":</td>\r\n                                <td align=\"left\" colspan=\"4\">".toCharArray();
    __oracle_jsp_text[36] = 
    "</td>\r\n                           </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                        <legend style=\"font-size:1.3em\"><strong>Asignar</strong></legend>\r\n                        <table width=\"100%\" align=\"center\"  border=\"0\">\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[37] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                    \r\n                                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[42] = 
    "&nbsp;\r\n                                </td>\r\n                                <td>           \r\n                                    ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[44] = 
    " &nbsp;\r\n                                    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[46] = 
    "&nbsp;\r\n                                                    \r\n                                    ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                                        ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Des asignar</strong></legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[50] = 
    ":</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                        <table align=\"center\" width=\"100%\">\r\n                                            <tr>\r\n                                                <td align=\"left\" style=\"color:#ff0000\">".toCharArray();
    __oracle_jsp_text[53] = 
    "</td>\r\n                                            </tr>\r\n                                        </table>\r\n                                    ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                        <table align=\"center\" width=\"100%\">\r\n                                            <tr>\r\n                                                <td align=\"left\"> - </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                    ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                                        <table align=\"center\" width=\"100%\">\r\n                                            <tr>\r\n                                                <td align=\"left\">".toCharArray();
    __oracle_jsp_text[58] = 
    "</td>\r\n                                            </tr>\r\n                                        </table>\r\n                                    ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[60] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[61] = 
    ":</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[62] = 
    "</td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td align=\"center\" colspan=\"2\">\r\n                                <table align=\"center\" border=\"0\" width=\"100%\">\r\n                                    <tr>\r\n                                        <td width=\"40%\">\r\n                                                <table width=\"100%\" align=\"center\" border=\"0\">\r\n                                                    <tr>\r\n                                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[63] = 
    ":</td>\r\n                                                        <td align=\"left\">\r\n                                                            ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                                                            ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                        </td>\r\n                                        <td width=\"60%\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[66] = 
    "&nbsp;\r\n                                                ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <script type=\"text/javascript\">\r\n        var enCurso         = ".toCharArray();
    __oracle_jsp_text[68] = 
    ";\r\n        var rolAdmin        = ".toCharArray();
    __oracle_jsp_text[69] = 
    ";\r\n        var desasignado     = ".toCharArray();
    __oracle_jsp_text[70] = 
    ";\r\n        var instructorTitular   = $j(\"#instructorTitular\").val();\r\n        var instructorSuplente  = $j(\"#instructorSuplente\").val();\r\n        var idInstructor        = $j(\"#idInstructor\").val();\r\n        \r\n        var tamanioT = $j.trim(instructorTitular).length;\r\n        var tamanioS = $j.trim(instructorSuplente).length;\r\n        \r\n        \r\n        if(desasignado && enCurso){\r\n            tamanioT = 1;\r\n        }\r\n        \r\n        if(tamanioT == 1){ tamanioT = 0; }\r\n        if(tamanioS == 1){ tamanioS = 0; }\r\n        \r\n        //console.log(\"enCurso: \" + enCurso);\r\n        if(enCurso){\r\n            if(rolAdmin){\r\n                if(tamanioT != 0  && tamanioS != 0){ //OK\r\n                    $j(\"#idInstructor\").attr('disabled','true');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").removeAttr('disabled');\r\n                }\r\n                else if(tamanioT == 0 && tamanioS == 0){ //OK\r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").attr('disabled','true');\r\n                }\r\n                else if(tamanioT == 0 && tamanioS != 0){ //OK\r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").attr('disabled','true');\r\n                }\r\n                else if(tamanioT != 0 && tamanioS == 0){ //OK\r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").attr('disabled','true');\r\n                }  \r\n            }\r\n            else{ // Operador de Capacitacion\r\n                if(tamanioT != 0  && tamanioS != 0){ //OK\r\n                    $j(\"#idInstructor\").attr('disabled','true');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").removeAttr('disabled');\r\n                }\r\n                else if(tamanioT == 0 && tamanioS == 0){ //OK\r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").attr('disabled','true');\r\n                }\r\n                else if(tamanioT == 0 && tamanioS != 0){ //OK\r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").attr('disabled','true');\r\n                }\r\n                else if(tamanioT != 0 && tamanioS == 0){ //OK\r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").attr('disabled','true');\r\n                }\r\n            }\r\n        }\r\n        else{ // ****** no en curso\r\n            if(rolAdmin){\r\n                if(tamanioT != 0  && tamanioS != 0){ \r\n                    $j(\"#idInstructor\").attr('disabled','true');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").removeAttr('disabled');\r\n                }\r\n                else if(tamanioT == 0 && tamanioS == 0){ \r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").attr('disabled','true');\r\n                }\r\n                else if(tamanioT == 0 && tamanioS != 0){ \r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").removeAttr('disabled');\r\n                }\r\n                else if(tamanioT != 0 && tamanioS == 0){ \r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").removeAttr('disabled');\r\n                }\r\n            }\r\n            else{ // ********* operador\r\n                if(tamanioT != 0  && tamanioS != 0){ \r\n                    $j(\"#idInstructor\").attr('disabled','true');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").removeAttr('disabled');\r\n                }\r\n                else if(tamanioT == 0 && tamanioS == 0){ \r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").attr('disabled','true');\r\n                }\r\n                else if(tamanioT == 0 && tamanioS != 0){ \r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").removeAttr('disabled');\r\n                }\r\n                else if(tamanioT != 0 && tamanioS == 0){ \r\n                    $j(\"#idInstructor\").removeAttr('disabled');\r\n                    $j(\"#10001\").attr('disabled','true');\r\n                    $j(\"#10003\").attr('disabled','true');\r\n                    $j(\"#10004\").attr('disabled','true');\r\n                    $j(\"#10005\").attr('disabled','true');\r\n                    $j(\"#motivoDesasigna\").removeAttr('disabled');\r\n                }\r\n            }\r\n            \r\n        }\r\n        // *********************************************************************\r\n        function botonesAsignar(){\r\n            if(enCurso){\r\n                if(rolAdmin){\r\n                    if(tamanioT != 0 && tamanioS != 0){ // no procede\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS == 0){ //OK\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT != 0 && tamanioS == 0){ //OK\r\n                        $j(\"#10001\").attr('disabled','true');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS != 0){ //OK\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").attr('disabled','true');\r\n                    }\r\n                }\r\n                else { // operadorCapacitacion\r\n                    if(tamanioT != 0 && tamanioS != 0){ // no procede\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS == 0){ //OK\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT != 0 && tamanioS == 0){ //OK\r\n                        $j(\"#10001\").attr('disabled','true');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS != 0){ //OK\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").attr('disabled','true');\r\n                    }\r\n                }\r\n            }\r\n            else { // no en curso\r\n                if(rolAdmin){\r\n                    if(tamanioT != 0 && tamanioS != 0){ // no procede\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS == 0){ //OK\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT != 0 && tamanioS == 0){ //OK\r\n                        $j(\"#10001\").attr('disabled','true');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS != 0){ //OK\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").attr('disabled','true');\r\n                    }\r\n                }\r\n                else { // operadorCapacitacion\r\n                    if(tamanioT != 0 && tamanioS != 0){ // no procede\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS == 0){ //OK\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT != 0 && tamanioS == 0){ //OK\r\n                        $j(\"#10001\").attr('disabled','true');\r\n                        $j(\"#10003\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS != 0){ //OK\r\n                        $j(\"#10001\").removeAttr('disabled');\r\n                        $j(\"#10003\").attr('disabled','true');\r\n                    }\r\n                }\r\n            }\r\n        }\r\n        function botonesDesasignar(){\r\n            if(enCurso){ // ****** EN CURSO ********\r\n                if(rolAdmin){ // ***** ADMINISTRADOR ******\r\n                    if(tamanioT != 0 && tamanioS != 0){ //OK\r\n                        $j(\"#10004\").removeAttr('disabled');\r\n                        $j(\"#10005\").removeAttr('disabled');\r\n                    }\r\n                }\r\n                else { // operador capacitacion\r\n                    if(tamanioT != 0 && tamanioS != 0){ //OK\r\n                        $j(\"#10004\").removeAttr('disabled');\r\n                        $j(\"#10005\").removeAttr('disabled');\r\n                    }\r\n                }\r\n            }\r\n            else{ // no en curso\r\n                if(rolAdmin){\r\n                    if(tamanioT != 0 && tamanioS != 0){ //OK\r\n                        $j(\"#10004\").removeAttr('disabled');\r\n                        $j(\"#10005\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS == 0){\r\n                        $j(\"#10004\").attr('disabled','true');\r\n                        $j(\"#10005\").attr('disabled','true');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS != 0){\r\n                        $j(\"#10004\").attr('disabled','true');\r\n                        $j(\"#10005\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT != 0 && tamanioS == 0){\r\n                        $j(\"#10004\").removeAttr('disabled');\r\n                        $j(\"#10005\").attr('disabled','true');\r\n                    }\r\n                }\r\n                else { // operador capacitacion\r\n                    if(tamanioT != 0 && tamanioS != 0){ //OK\r\n                        $j(\"#10004\").removeAttr('disabled');\r\n                        $j(\"#10005\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS == 0){\r\n                        $j(\"#10004\").attr('disabled','true');\r\n                        $j(\"#10005\").attr('disabled','true');\r\n                    }\r\n                    else if(tamanioT == 0 && tamanioS != 0){\r\n                        $j(\"#10004\").attr('disabled','true');\r\n                        $j(\"#10005\").removeAttr('disabled');\r\n                    }\r\n                    else if(tamanioT != 0 && tamanioS == 0){\r\n                        $j(\"#10004\").removeAttr('disabled');\r\n                        $j(\"#10005\").attr('disabled','true');\r\n                    }\r\n                }\r\n            }\r\n        }\r\n        \r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
