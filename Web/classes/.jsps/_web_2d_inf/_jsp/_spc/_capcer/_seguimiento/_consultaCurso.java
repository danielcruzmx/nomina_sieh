package _web_2d_inf._jsp._spc._capcer._seguimiento;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _consultaCurso extends com.orionserver.http.OrionHttpJspPage {


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
    _consultaCurso page = this;
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
        __jsp_taghandler_1.setModelAttribute("consultaCursoDTO");
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
                __jsp_taghandler_5.setPath("urlRegistroCurso");
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
                __jsp_taghandler_6.setPath("urlDeleteRegistroCurso");
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
                __jsp_taghandler_7.setPath("linkDestino");
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
                __jsp_taghandler_8.setPath("paramIdDestino");
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
                __jsp_taghandler_9.setPath("propertyDestino");
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
                __jsp_taghandler_10.setPath("interior");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setCode("sireh.label.spc.capcer.registro.general.consultaCursos.seguimientoControl.title");
                __jsp_taghandler_11.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.interior}",java.lang.Object.class, __ojsp_varRes,null));
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
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolAdministradorCertificacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[16]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_13.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.coordinacion");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                        if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_13.doCatch(th);
                      } finally {
                        __jsp_taghandler_13.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_14=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_14.setJspContext(pageContext);
                      __jsp_taghandler_14.setKey("");
                      __jsp_taghandler_14.setValue("selectList.nonValue");
                      __jsp_taghandler_14.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                    }
                    out.write(__oracle_jsp_text[18]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_15=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_15.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_15.setJspContext(pageContext);
                      __jsp_taghandler_15.setBeanName("tcCapCoordinacion-consultaCurso");
                      __jsp_taghandler_15.setPath("idCoordinacion");
                      __jsp_taghandler_15.setStyle("width:200px;");
                      __jsp_taghandler_15.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                    }
                    out.write(__oracle_jsp_text[19]);
                  } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.ejeTematico");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_17=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setJspContext(pageContext);
                __jsp_taghandler_17.setKey("");
                __jsp_taghandler_17.setValue("selectList.nonValue");
                __jsp_taghandler_17.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_18=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setJspContext(pageContext);
                __jsp_taghandler_18.setBeanName("tcCapEjeTematico-consultaCurso");
                __jsp_taghandler_18.setPath("idEjeTematico");
                __jsp_taghandler_18.setStyle("width:200px;");
                __jsp_taghandler_18.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_18, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.subprograma");
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
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_20=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setJspContext(pageContext);
                __jsp_taghandler_20.setKey("");
                __jsp_taghandler_20.setValue("selectList.nonValue");
                __jsp_taghandler_20.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_21=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setJspContext(pageContext);
                __jsp_taghandler_21.setBeanName("tcCapSubprograma-consultaCurso");
                __jsp_taghandler_21.setPath("idSubprograma");
                __jsp_taghandler_21.setStyle("width:200px;");
                __jsp_taghandler_21.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
              }
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.modalidad");
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
              out.write(__oracle_jsp_text[27]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_23=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setKey("");
                __jsp_taghandler_23.setValue("selectList.nonValue");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_24=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setJspContext(pageContext);
                __jsp_taghandler_24.setBeanName("tcCapModalidad-consultaCurso");
                __jsp_taghandler_24.setPath("idModalidad");
                __jsp_taghandler_24.setStyle("width:200px;");
                __jsp_taghandler_24.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[30]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_26.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.fechaInicio");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
                        if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_26.doCatch(th);
                      } finally {
                        __jsp_taghandler_26.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,3);
                    }
                    out.write(__oracle_jsp_text[31]);
                    {
                      _oracle._jsp._tag._calendar_tag __jsp_taghandler_27=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                      __jsp_taghandler_27.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_27.setJspContext(pageContext);
                      __jsp_taghandler_27.setPath("cursoFecIni");
                      __jsp_taghandler_27.setReadonly("true");
                      __jsp_taghandler_27.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                    }
                    out.write(__oracle_jsp_text[32]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_28.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_28.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.fechaFin");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
                        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_28.doCatch(th);
                      } finally {
                        __jsp_taghandler_28.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,3);
                    }
                    out.write(__oracle_jsp_text[33]);
                    {
                      _oracle._jsp._tag._calendar_tag __jsp_taghandler_29=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                      __jsp_taghandler_29.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_29.setJspContext(pageContext);
                      __jsp_taghandler_29.setPath("cursoFecFin");
                      __jsp_taghandler_29.setReadonly("true");
                      __jsp_taghandler_29.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_29, pageContext);
                    }
                    out.write(__oracle_jsp_text[34]);
                  } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_30=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.claveCurso");
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
              out.write(__oracle_jsp_text[36]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_31=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setJspContext(pageContext);
                __jsp_taghandler_31.setPath("claveCurso");
                __jsp_taghandler_31.setMaxlength("60");
                __jsp_taghandler_31.setSize("60");
                __jsp_taghandler_31.setCss("anchoInput claveCurso");
                __jsp_taghandler_31.setUppercase("true");
                __jsp_taghandler_31.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
              }
              out.write(__oracle_jsp_text[37]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.estatus");
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
              out.write(__oracle_jsp_text[38]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_33=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setProperty("ID_CONTROL_CURSO");
                __jsp_taghandler_33.setCondition("IN");
                __jsp_taghandler_33.setPath("estatusCursos");
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[39]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_34=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setKey("");
                __jsp_taghandler_34.setValue("selectList.nonValue");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[40]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_35=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setJspContext(pageContext);
                __jsp_taghandler_35.setBeanName("tcCapControlCurso-consultaCurso");
                __jsp_taghandler_35.setPath("idControlCurso");
                __jsp_taghandler_35.setStyle("width:200px;");
                __jsp_taghandler_35.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_35, pageContext);
              }
              out.write(__oracle_jsp_text[41]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_36=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setPath("muestraRegistros");
                __jsp_taghandler_36.setAction((java.lang.String) ("seguimientoCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_36.setValue("submit.search");
                __jsp_taghandler_36.setProgressBar("true");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[42]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_37=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setJspContext(pageContext);
                __jsp_taghandler_37.setPath("cancel");
                __jsp_taghandler_37.setAction((java.lang.String) ("seguimientoCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_37.setValue("submit.clean");
                __jsp_taghandler_37.setProgressBar("true");
                __jsp_taghandler_37.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
              }
              out.write(__oracle_jsp_text[43]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_38=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[44]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_39=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_39.setParent(__jsp_taghandler_38);
                      __jsp_taghandler_39.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_39.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[45]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_40=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_40.setParent(__jsp_taghandler_39);
                            __jsp_taghandler_40.setJspContext(pageContext);
                            __jsp_taghandler_40.setProperty("C.ID_COORDINACION");
                            __jsp_taghandler_40.setCondition("=");
                            __jsp_taghandler_40.setPath("idCoordinacion");
                            __jsp_taghandler_40.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
                          }
                          out.write(__oracle_jsp_text[46]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_41=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_41.setParent(__jsp_taghandler_39);
                            __jsp_taghandler_41.setJspContext(pageContext);
                            __jsp_taghandler_41.setProperty("C.ID_EJE_TEMATICO");
                            __jsp_taghandler_41.setCondition("=");
                            __jsp_taghandler_41.setPath("idEjeTematico");
                            __jsp_taghandler_41.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
                          }
                          out.write(__oracle_jsp_text[47]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_42=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_42.setParent(__jsp_taghandler_39);
                            __jsp_taghandler_42.setJspContext(pageContext);
                            __jsp_taghandler_42.setProperty("C.ID_SUBPROGRAMA");
                            __jsp_taghandler_42.setCondition("=");
                            __jsp_taghandler_42.setPath("idSubprograma");
                            __jsp_taghandler_42.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_42, pageContext);
                          }
                          out.write(__oracle_jsp_text[48]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_43=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_43.setParent(__jsp_taghandler_39);
                            __jsp_taghandler_43.setJspContext(pageContext);
                            __jsp_taghandler_43.setProperty("C.CURSO_CLAVE");
                            __jsp_taghandler_43.setCondition("contains");
                            __jsp_taghandler_43.setPath("claveCurso");
                            __jsp_taghandler_43.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
                          }
                          out.write(__oracle_jsp_text[49]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_44=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_44.setParent(__jsp_taghandler_39);
                            __jsp_taghandler_44.setJspContext(pageContext);
                            __jsp_taghandler_44.setProperty("C.ID_CONTROL_CURSO");
                            __jsp_taghandler_44.setCondition("=");
                            __jsp_taghandler_44.setPath("idControlCurso");
                            __jsp_taghandler_44.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
                          }
                          out.write(__oracle_jsp_text[50]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_45=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_45.setParent(__jsp_taghandler_39);
                            __jsp_taghandler_45.setJspContext(pageContext);
                            __jsp_taghandler_45.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_45.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_45.setAppendFilters("false");
                            __jsp_taghandler_45.setCheckbox("true");
                            __jsp_taghandler_45.setChkProperty("idCursos");
                            __jsp_taghandler_45.setJspBody(new _consultaCurso_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_45, __ojsp_varRes));
                            __jsp_taghandler_45.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
                          }
                          out.write(__oracle_jsp_text[51]);
                        } while (__jsp_taghandler_39.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_39.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_39,3);
                    }
                    out.write(__oracle_jsp_text[52]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_67=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_67.setParent(__jsp_taghandler_38);
                      __jsp_tag_starteval=__jsp_taghandler_67.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[53]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_68=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_68.setParent(__jsp_taghandler_67);
                            __jsp_taghandler_68.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                              if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_68.doCatch(th);
                            } finally {
                              __jsp_taghandler_68.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,4);
                          }
                          out.write(__oracle_jsp_text[54]);
                        } while (__jsp_taghandler_67.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_67.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_67,3);
                    }
                    out.write(__oracle_jsp_text[55]);
                  } while (__jsp_taghandler_38.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
              }
              out.write(__oracle_jsp_text[56]);
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

  private class _consultaCurso_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _consultaCurso_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_45       = parent;
      out.write("\r\n                            <div id=\"displayTagDiv\" style=\"width:1000px; min-height:200px;overflow:auto;text-align:center;\"> \r\n                                ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_46=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_46.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_45));
        __jsp_taghandler_46.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_46.setPagesize(20);
        __jsp_taghandler_46.setDecorator("checkboxTableDecorator");
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
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_47=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_47.setParent(__jsp_taghandler_46);
                __jsp_taghandler_47.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolOperadorCapacitacion) && row.idControlCurso == 'REG' && consultaCursoDTO.control ne 'EVALUAR_PARTICIPANTE' && consultaCursoDTO.control ne 'CARGAR_CONSTANCIAS'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_47.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_48=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey media style");
                      __jsp_taghandler_48.setParent(__jsp_taghandler_47);
                      __jsp_taghandler_48.setProperty("checkbox");
                      __jsp_taghandler_48.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.idCursos");
                      __jsp_taghandler_48.setMedia("html");
                      __jsp_taghandler_48.setStyle("text-align: center");
                      __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                      if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_47.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_47.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_47,6);
              }
              out.write("\r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_49=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_49.setParent(__jsp_taghandler_46);
                __jsp_taghandler_49.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolOperadorCapacitacion) && row.idControlCurso != 'REG' && consultaCursoDTO.control ne 'EVALUAR_PARTICIPANTE' && consultaCursoDTO.control ne 'CARGAR_CONSTANCIAS'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_50=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                      __jsp_taghandler_50.setParent(__jsp_taghandler_49);
                      __jsp_taghandler_50.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.idCursos");
                      __jsp_taghandler_50.setStyle("text-align: center");
                      __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        try {
                          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_50,__jsp_tag_starteval,out);
                          do {
                            out.write(" - \r\n                                        ");
                          } while (__jsp_taghandler_50.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        finally {
                          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                        }
                      }
                      if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_49.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_51=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_51.setParent(__jsp_taghandler_46);
                __jsp_taghandler_51.setProperty("coordinacion");
                __jsp_taghandler_51.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.coordinacion");
                __jsp_taghandler_51.setSortable(true);
                __jsp_taghandler_51.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,6);
              }
              out.write("\r\n                                    ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_52=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_52.setParent(__jsp_taghandler_46);
                __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_53.setParent(__jsp_taghandler_52);
                      __jsp_taghandler_53.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty consultaCursoDTO.linkDestino}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                                ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_54=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable href paramId paramProperty style");
                            __jsp_taghandler_54.setParent(__jsp_taghandler_53);
                            __jsp_taghandler_54.setProperty("curso");
                            __jsp_taghandler_54.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.curso");
                            __jsp_taghandler_54.setSortable(true);
                            __jsp_taghandler_54.setHref((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.linkDestino}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_54.setParamId((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.paramIdDestino}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_54.setParamProperty((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.propertyDestino}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_54.setStyle("text-align: left");
                            __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                            if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_53.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,7);
                    }
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_55=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_55.setParent(__jsp_taghandler_52);
                      __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_56=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                            __jsp_taghandler_56.setParent(__jsp_taghandler_55);
                            __jsp_taghandler_56.setProperty("curso");
                            __jsp_taghandler_56.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.curso");
                            __jsp_taghandler_56.setSortable(true);
                            __jsp_taghandler_56.setStyle("text-align: left");
                            __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                            if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_55.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_52.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_57=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_57.setParent(__jsp_taghandler_46);
                __jsp_taghandler_57.setProperty("ejeTematico");
                __jsp_taghandler_57.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.ejeTematico");
                __jsp_taghandler_57.setSortable(true);
                __jsp_taghandler_57.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_58=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_58.setParent(__jsp_taghandler_46);
                __jsp_taghandler_58.setProperty("subprograma");
                __jsp_taghandler_58.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.subprograma");
                __jsp_taghandler_58.setSortable(true);
                __jsp_taghandler_58.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_59=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_59.setParent(__jsp_taghandler_46);
                __jsp_taghandler_59.setProperty("duracion");
                __jsp_taghandler_59.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.duracion");
                __jsp_taghandler_59.setSortable(true);
                __jsp_taghandler_59.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_60=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_60.setParent(__jsp_taghandler_46);
                __jsp_taghandler_60.setProperty("modalidad");
                __jsp_taghandler_60.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.modalidad");
                __jsp_taghandler_60.setSortable(true);
                __jsp_taghandler_60.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_61=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_61.setParent(__jsp_taghandler_46);
                __jsp_taghandler_61.setProperty("finalidad");
                __jsp_taghandler_61.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.finalidad");
                __jsp_taghandler_61.setSortable(true);
                __jsp_taghandler_61.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_62=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_62.setParent(__jsp_taghandler_46);
                __jsp_taghandler_62.setProperty("estatus");
                __jsp_taghandler_62.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.estatus");
                __jsp_taghandler_62.setSortable(true);
                __jsp_taghandler_62.setStyle("text-align: left");
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,6);
              }
              out.write("\r\n                                                    \r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_63=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_63.setParent(__jsp_taghandler_46);
                __jsp_taghandler_63.setName("paging.banner.placement");
                __jsp_taghandler_63.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_64=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_64.setParent(__jsp_taghandler_46);
                __jsp_taghandler_64.setName("export.pdf");
                __jsp_taghandler_64.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_64.doStartTag();
                if (__jsp_taghandler_64.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_64,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_65=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_65.setParent(__jsp_taghandler_46);
                __jsp_taghandler_65.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_65,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_66=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_66.setParent(__jsp_taghandler_65);
                        __jsp_taghandler_66.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_66.doStartTag();
                          if (__jsp_taghandler_66.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_66.doCatch(th);
                        } finally {
                          __jsp_taghandler_66.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_66,7);
                      }
                      out.write("<br/><br/></span>\r\n                                    ");
                    } while (__jsp_taghandler_65.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,6);
              }
              out.write("\r\n                                ");
            } while (__jsp_taghandler_46.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,5);
      }
      out.write("\r\n                            </div>\r\n                        ");
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

  private static final char __oracle_jsp_text[][]=new char[57][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
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
    "</h1>\r\n    <p>&nbsp;</p>\r\n                                \r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\">\r\n                        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                            <tr align=\"left\">\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[17] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                        \r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[21] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[24] = 
    ":</td>\r\n                            <td>                                \r\n                                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                            </td>  \r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[27] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            <tr align=\"left\">\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[31] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                </td>\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[33] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                        \r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[36] = 
    ":</td>\r\n                            <td>                                \r\n                                ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[38] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[39] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td colspan=\"4\">\r\n                                <table width=\"90%\" border=\"0\" align=\"center\">\r\n                                    <tr>\r\n                                        <td align=\"center\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[42] = 
    "&nbsp;\r\n                                            ".toCharArray();
    __oracle_jsp_text[43] = 
    "\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n    </table>\r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                            \r\n                        ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                        <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[54] = 
    "<br/><br/></span>\r\n                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){            \r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.claveCurso').alphanumeric({allow:\"-\"});\r\n            $j('.numeric').numeric();\r\n        });\r\n        \r\n        // PagedList asincrono\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
