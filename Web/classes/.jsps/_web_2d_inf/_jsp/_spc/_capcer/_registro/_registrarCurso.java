package _web_2d_inf._jsp._spc._capcer._registro;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _registrarCurso extends com.orionserver.http.OrionHttpJspPage {


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
    _registrarCurso page = this;
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
        __jsp_taghandler_1.setModelAttribute("registrarCursoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("rolAdministradorCapacitacion");
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
                __jsp_taghandler_3.setPath("rolOperadorCapacitacion");
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
                __jsp_taghandler_4.setPath("noParticipantes");
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
                __jsp_taghandler_5.setPath("anioOperacion");
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
                __jsp_taghandler_6.setPath("viewName");
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
                __jsp_taghandler_7.setPath("idCursoEditar");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setPath("path");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setPath("descControlCurso");
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
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[16]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_11.setPath("tipoCurso");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_11.doCatch(th);
                      } finally {
                        __jsp_taghandler_11.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_12.setPath("cursoFecIni");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                        if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_12.doCatch(th);
                      } finally {
                        __jsp_taghandler_12.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                    }
                    out.write(__oracle_jsp_text[18]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_13.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_13.setPath("cursoFecFin");
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
                    out.write(__oracle_jsp_text[19]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_14.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_14.setPath("descSede");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_14.doCatch(th);
                      } finally {
                        __jsp_taghandler_14.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,3);
                    }
                    out.write(__oracle_jsp_text[20]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_15.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_15.setPath("descAula");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_15.doCatch(th);
                      } finally {
                        __jsp_taghandler_15.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,3);
                    }
                    out.write(__oracle_jsp_text[21]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_16.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_16.setPath("descHorario");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                        if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_16.doCatch(th);
                      } finally {
                        __jsp_taghandler_16.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,3);
                    }
                    out.write(__oracle_jsp_text[22]);
                  } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_17=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_17.setParent(__jsp_taghandler_1);
                __jsp_taghandler_17.setCode("sireh.label.spc.capcer.registro.registrarCurso.title");
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
              out.write(__oracle_jsp_text[24]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_18.setParent(__jsp_taghandler_1);
                __jsp_taghandler_18.setCode("sireh.label.spc.capcer.registro.registrarCurso.tipoCurso");
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
              out.write(__oracle_jsp_text[25]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setPath("tipoCurso");
                __jsp_taghandler_19.setValue("CAP");
                __jsp_taghandler_19.setLabel(" Capacitacion");
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
              out.write(__oracle_jsp_text[26]);
              {
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_20.setParent(__jsp_taghandler_1);
                __jsp_taghandler_20.setPath("tipoCurso");
                __jsp_taghandler_20.setValue("CER");
                __jsp_taghandler_20.setLabel(" Certificacion");
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
              out.write(__oracle_jsp_text[27]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_21=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setCode("sireh.label.spc.capcer.registro.registrarCurso.coordinacion");
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
              out.write(__oracle_jsp_text[28]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_22=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setJspContext(pageContext);
                __jsp_taghandler_22.setKey("");
                __jsp_taghandler_22.setValue("selectList.nonValue");
                __jsp_taghandler_22.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_22, pageContext);
              }
              out.write(__oracle_jsp_text[29]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_23=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_23.setParent(__jsp_taghandler_1);
                __jsp_taghandler_23.setJspContext(pageContext);
                __jsp_taghandler_23.setBeanName("tcCapCoordinacion-registrarCurso");
                __jsp_taghandler_23.setPath("idCoordinacion");
                __jsp_taghandler_23.setDisabled((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_23.setStyle("width:200px;");
                __jsp_taghandler_23.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
              }
              out.write(__oracle_jsp_text[30]);
              out.write(__oracle_jsp_text[31]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_24=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_24.setParent(__jsp_taghandler_1);
                __jsp_taghandler_24.setCode("sireh.label.spc.capcer.registro.registrarCurso.ejeTematico");
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
              out.write(__oracle_jsp_text[32]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_25=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setCode("sireh.label.spc.capcer.registro.registrarCurso.subprograma");
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
              out.write(__oracle_jsp_text[33]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_26=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_26.setParent(__jsp_taghandler_1);
                __jsp_taghandler_26.setJspContext(pageContext);
                __jsp_taghandler_26.setKey("");
                __jsp_taghandler_26.setValue("selectList.nonValue");
                __jsp_taghandler_26.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_26, pageContext);
              }
              out.write(__oracle_jsp_text[34]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_27=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_27.setParent(__jsp_taghandler_1);
                __jsp_taghandler_27.setJspContext(pageContext);
                __jsp_taghandler_27.setBeanName("tcCapSubprograma-registrarCurso");
                __jsp_taghandler_27.setPath("idSubprograma");
                __jsp_taghandler_27.setDisabled((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_27.setOnchange("generaClaveCurso()");
                __jsp_taghandler_27.setStyle("width:200px;");
                __jsp_taghandler_27.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
              }
              out.write(__oracle_jsp_text[35]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_28=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_28.setParent(__jsp_taghandler_1);
                __jsp_taghandler_28.setCode("sireh.label.spc.capcer.registro.registrarCurso.curso");
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
              out.write(__oracle_jsp_text[36]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_29.setParent(__jsp_taghandler_1);
                __jsp_taghandler_29.setCode("sireh.label.spc.capcer.registro.registrarCurso.claveCurso");
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
              out.write(__oracle_jsp_text[37]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_30=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_30.setParent(__jsp_taghandler_1);
                __jsp_taghandler_30.setJspContext(pageContext);
                __jsp_taghandler_30.setPath("claveCurso");
                __jsp_taghandler_30.setMaxlength("12");
                __jsp_taghandler_30.setReadonly("true");
                __jsp_taghandler_30.setSize("60");
                __jsp_taghandler_30.setCss("anchoInputSmall claveCurso");
                __jsp_taghandler_30.setUppercase("true");
                __jsp_taghandler_30.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
              }
              out.write(__oracle_jsp_text[38]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_31=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_31.setParent(__jsp_taghandler_1);
                __jsp_taghandler_31.setCode("sireh.label.spc.capcer.registro.registrarCurso.modalidad");
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
              out.write(__oracle_jsp_text[39]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setCode("sireh.label.spc.capcer.registro.registrarCurso.finalidad");
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
              out.write(__oracle_jsp_text[40]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_33=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setCode("sireh.label.spc.capcer.registro.registrarCurso.idCapacidadCert");
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
              out.write(__oracle_jsp_text[41]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_34=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setCode("sireh.label.spc.capcer.registro.registrarCurso.caracter");
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
              out.write(__oracle_jsp_text[42]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setCode("sireh.label.spc.capcer.registro.registrarCurso.duracion");
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
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_36=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setPath("duracion");
                __jsp_taghandler_36.setMaxlength("14");
                __jsp_taghandler_36.setSize("60");
                __jsp_taghandler_36.setCss("anchoInput decimal");
                __jsp_taghandler_36.setUppercase("true");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_37=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setCode("sireh.label.spc.capcer.registro.registrarCurso.presupuesto");
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
              out.write(__oracle_jsp_text[45]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_38=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setJspContext(pageContext);
                __jsp_taghandler_38.setPath("presupuesto");
                __jsp_taghandler_38.setMaxlength("15");
                __jsp_taghandler_38.setSize("60");
                __jsp_taghandler_38.setCss("anchoInputSmall");
                __jsp_taghandler_38.setUppercase("true");
                __jsp_taghandler_38.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_38, pageContext);
              }
              out.write(__oracle_jsp_text[46]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_39=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setCode("sireh.label.spc.capcer.registro.registrarCurso.rfcOperDgrh");
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
              out.write(__oracle_jsp_text[47]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_40=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setKey("");
                __jsp_taghandler_40.setValue("selectList.nonValue");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[48]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_41=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setJspContext(pageContext);
                __jsp_taghandler_41.setBeanName("tcCapOperDgrh-registrarCurso");
                __jsp_taghandler_41.setPath("rfcOperDgrh");
                __jsp_taghandler_41.setStyle("width:200px;");
                __jsp_taghandler_41.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_41, pageContext);
              }
              out.write(__oracle_jsp_text[49]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_42.setParent(__jsp_taghandler_1);
                __jsp_taghandler_42.setCode("sireh.label.spc.capcer.registro.registrarCurso.descControlCurso");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                  if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_42.doCatch(th);
                } finally {
                  __jsp_taghandler_42.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,2);
              }
              out.write(__oracle_jsp_text[50]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_43=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_43.setParent(__jsp_taghandler_1);
                __jsp_taghandler_43.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.descControlCurso}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_43.doStartTag();
                if (__jsp_taghandler_43.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_43,2);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_44=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_44.setParent(__jsp_taghandler_1);
                __jsp_taghandler_44.setCode("sireh.label.spc.capcer.registro.registrarCurso.claveCertificacion");
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
              out.write(__oracle_jsp_text[52]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_45=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setJspContext(pageContext);
                __jsp_taghandler_45.setPath("claveCertificacion");
                __jsp_taghandler_45.setMaxlength("60");
                __jsp_taghandler_45.setSize("60");
                __jsp_taghandler_45.setCss("anchoInput alphanumericEspacios");
                __jsp_taghandler_45.setUppercase("true");
                __jsp_taghandler_45.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_45, pageContext);
              }
              out.write(__oracle_jsp_text[53]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_46.setParent(__jsp_taghandler_1);
                __jsp_taghandler_46.setCode("sireh.label.spc.capcer.registro.registrarCurso.nivelCurso");
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
              out.write(__oracle_jsp_text[54]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_47=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_47.setParent(__jsp_taghandler_1);
                __jsp_taghandler_47.setJspContext(pageContext);
                __jsp_taghandler_47.setKey("");
                __jsp_taghandler_47.setValue("selectList.nonValue");
                __jsp_taghandler_47.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
              }
              out.write(__oracle_jsp_text[55]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_48=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_48.setParent(__jsp_taghandler_1);
                __jsp_taghandler_48.setJspContext(pageContext);
                __jsp_taghandler_48.setBeanName("tcCapNivelCurso-registrarCurso");
                __jsp_taghandler_48.setPath("nivelCurso");
                __jsp_taghandler_48.setStyle("width:200px;");
                __jsp_taghandler_48.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_48, pageContext);
              }
              out.write(__oracle_jsp_text[56]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_49=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_49.setParent(__jsp_taghandler_1);
                __jsp_taghandler_49.setCode("sireh.label.spc.capcer.registro.registrarCurso.supervisorInstEducat");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_49.doStartTag();
                  if (__jsp_taghandler_49.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_49.doCatch(th);
                } finally {
                  __jsp_taghandler_49.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_49,2);
              }
              out.write(__oracle_jsp_text[57]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_50=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setJspContext(pageContext);
                __jsp_taghandler_50.setPath("supervisorInstEducat");
                __jsp_taghandler_50.setMaxlength("20");
                __jsp_taghandler_50.setSize("60");
                __jsp_taghandler_50.setCss("anchoInput alphaEspacios");
                __jsp_taghandler_50.setUppercase("true");
                __jsp_taghandler_50.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_50, pageContext);
              }
              out.write(__oracle_jsp_text[58]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_51=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idControlCurso ne 'REG'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_51.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[59]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_52.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_52.setCode("sireh.label.spc.capcer.registro.registrarCurso.cursoFecIni");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                        if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_52.doCatch(th);
                      } finally {
                        __jsp_taghandler_52.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,3);
                    }
                    out.write(__oracle_jsp_text[60]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_53=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_53.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_53.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.cursoFecIni}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_53.doStartTag();
                      if (__jsp_taghandler_53.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_53,3);
                    }
                    out.write(__oracle_jsp_text[61]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_54=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_54.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_54.setCode("sireh.label.spc.capcer.registro.registrarCurso.cursoFecFin");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_54.doStartTag();
                        if (__jsp_taghandler_54.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_54.doCatch(th);
                      } finally {
                        __jsp_taghandler_54.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_54,3);
                    }
                    out.write(__oracle_jsp_text[62]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_55=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_55.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_55.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.cursoFecFin}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_55.doStartTag();
                      if (__jsp_taghandler_55.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_55,3);
                    }
                    out.write(__oracle_jsp_text[63]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_56=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_56.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_56.setCode("sireh.label.spc.capcer.registro.registrarCurso.descSede");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                        if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_56.doCatch(th);
                      } finally {
                        __jsp_taghandler_56.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,3);
                    }
                    out.write(__oracle_jsp_text[64]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_57=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_57.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_57.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.descSede}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                      if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,3);
                    }
                    out.write(__oracle_jsp_text[65]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_58=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_58.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_58.setCode("sireh.label.spc.capcer.registro.registrarCurso.descAula");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_58.doStartTag();
                        if (__jsp_taghandler_58.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_58.doCatch(th);
                      } finally {
                        __jsp_taghandler_58.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_58,3);
                    }
                    out.write(__oracle_jsp_text[66]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_59.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_59.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.descAula}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                      if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,3);
                    }
                    out.write(__oracle_jsp_text[67]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_60=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_60.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_60.setCode("sireh.label.spc.capcer.registro.registrarCurso.descHorario");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_60.doStartTag();
                        if (__jsp_taghandler_60.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_60.doCatch(th);
                      } finally {
                        __jsp_taghandler_60.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_60,3);
                    }
                    out.write(__oracle_jsp_text[68]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_61=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_61.setParent(__jsp_taghandler_51);
                      __jsp_taghandler_61.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.descHorario}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_61.doStartTag();
                      if (__jsp_taghandler_61.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_61,3);
                    }
                    out.write(__oracle_jsp_text[69]);
                  } while (__jsp_taghandler_51.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_51.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_51,2);
              }
              out.write(__oracle_jsp_text[70]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_62=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_taghandler_62.setCode("sireh.label.spc.capcer.registro.registrarCurso.tipoInstEducat");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                  if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_62.doCatch(th);
                } finally {
                  __jsp_taghandler_62.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,2);
              }
              out.write(__oracle_jsp_text[71]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_63=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_63.setParent(__jsp_taghandler_1);
                __jsp_taghandler_63.setJspContext(pageContext);
                __jsp_taghandler_63.setKey("");
                __jsp_taghandler_63.setValue("selectList.nonValue");
                __jsp_taghandler_63.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_63, pageContext);
              }
              out.write(__oracle_jsp_text[72]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_64=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_64.setParent(__jsp_taghandler_1);
                __jsp_taghandler_64.setJspContext(pageContext);
                __jsp_taghandler_64.setBeanName("tcCapTipoInstEducat-registrarCurso");
                __jsp_taghandler_64.setPath("tipoInstEducat");
                __jsp_taghandler_64.setStyle("width:200px;");
                __jsp_taghandler_64.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_64, pageContext);
              }
              out.write(__oracle_jsp_text[73]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_65=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_65.setParent(__jsp_taghandler_1);
                __jsp_taghandler_65.setCode("sireh.label.spc.capcer.registro.registrarCurso.proveedor");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_65.doStartTag();
                  if (__jsp_taghandler_65.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_65.doCatch(th);
                } finally {
                  __jsp_taghandler_65.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_65,2);
              }
              out.write(__oracle_jsp_text[74]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_66=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_66.setParent(__jsp_taghandler_1);
                __jsp_taghandler_66.setJspContext(pageContext);
                __jsp_taghandler_66.setKey("");
                __jsp_taghandler_66.setValue("selectList.nonValue");
                __jsp_taghandler_66.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
              }
              out.write(__oracle_jsp_text[75]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_67=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_67.setParent(__jsp_taghandler_1);
                __jsp_taghandler_67.setJspContext(pageContext);
                __jsp_taghandler_67.setBeanName("tcCapProveedor-registrarCurso");
                __jsp_taghandler_67.setPath("proveedor");
                __jsp_taghandler_67.setParentPath("tipoInstEducat");
                __jsp_taghandler_67.setProgress("true");
                __jsp_taghandler_67.setStyle("width:200px;");
                __jsp_taghandler_67.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_67, pageContext);
              }
              out.write(__oracle_jsp_text[76]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_68=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_68.setParent(__jsp_taghandler_1);
                __jsp_taghandler_68.setCode("sireh.label.spc.capcer.registro.registrarCurso.situacionProveedor");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_68.doStartTag();
                  if (__jsp_taghandler_68.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_68.doCatch(th);
                } finally {
                  __jsp_taghandler_68.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_68,2);
              }
              out.write(__oracle_jsp_text[77]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_69=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_69.setParent(__jsp_taghandler_1);
                __jsp_taghandler_69.setJspContext(pageContext);
                __jsp_taghandler_69.setProperty("ID_SITUACION_PROVEEDOR");
                __jsp_taghandler_69.setCondition("IN");
                __jsp_taghandler_69.setPath("situaciones");
                __jsp_taghandler_69.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_69, pageContext);
              }
              out.write(__oracle_jsp_text[78]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_70=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_70.setParent(__jsp_taghandler_1);
                __jsp_taghandler_70.setJspContext(pageContext);
                __jsp_taghandler_70.setKey("");
                __jsp_taghandler_70.setValue("selectList.nonValue");
                __jsp_taghandler_70.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_70, pageContext);
              }
              out.write(__oracle_jsp_text[79]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_71=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_71.setParent(__jsp_taghandler_1);
                __jsp_taghandler_71.setJspContext(pageContext);
                __jsp_taghandler_71.setBeanName("tcCapSituacionProveedor-registrarCurso");
                __jsp_taghandler_71.setPath("situacionProveedor");
                __jsp_taghandler_71.setStyle("width:200px;");
                __jsp_taghandler_71.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_71, pageContext);
              }
              out.write(__oracle_jsp_text[80]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_72=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_72.setParent(__jsp_taghandler_1);
                __jsp_taghandler_72.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.rolAdministradorCapacitacion || registrarCursoDTO.rolOperadorCapacitacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[81]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_73=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_73.setParent(__jsp_taghandler_72);
                      __jsp_taghandler_73.setJspContext(pageContext);
                      __jsp_taghandler_73.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.path}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_73.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.viewName}",java.lang.String.class, __ojsp_varRes, null)+".do"));
                      __jsp_taghandler_73.setValue("submit.save");
                      __jsp_taghandler_73.setProgressBar("true");
                      __jsp_taghandler_73.setAlertCode("confirm.spc.capcer.registro.registrarCurso");
                      __jsp_taghandler_73.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_73, pageContext);
                    }
                    out.write(__oracle_jsp_text[82]);
                  } while (__jsp_taghandler_72.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,2);
              }
              out.write(__oracle_jsp_text[83]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_74=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_74.setParent(__jsp_taghandler_1);
                __jsp_taghandler_74.setJspContext(pageContext);
                __jsp_taghandler_74.setAction("registroCursoSPC/consultaCurso.do");
                __jsp_taghandler_74.setValue("submit.cancel");
                __jsp_taghandler_74.setProgressBar("true");
                __jsp_taghandler_74.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_74, pageContext);
              }
              out.write(__oracle_jsp_text[84]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_75=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_75.setParent(__jsp_taghandler_1);
                __jsp_taghandler_75.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idEjeTematico}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_75.doStartTag();
                if (__jsp_taghandler_75.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_75,2);
              }
              out.write(__oracle_jsp_text[85]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_76=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_76.setParent(__jsp_taghandler_1);
                __jsp_taghandler_76.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idModalidad}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
                if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,2);
              }
              out.write(__oracle_jsp_text[86]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_77=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_77.setParent(__jsp_taghandler_1);
                __jsp_taghandler_77.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idFinalidad}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,2);
              }
              out.write(__oracle_jsp_text[87]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_78=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_78.setParent(__jsp_taghandler_1);
                __jsp_taghandler_78.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idCapacidadCert}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,2);
              }
              out.write(__oracle_jsp_text[88]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_79=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_79.setParent(__jsp_taghandler_1);
                __jsp_taghandler_79.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idCaracter}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,2);
              }
              out.write(__oracle_jsp_text[89]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_80=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_80.setParent(__jsp_taghandler_1);
                __jsp_taghandler_80.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.idCursoPrincipal}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,2);
              }
              out.write(__oracle_jsp_text[90]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_81=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_81.setParent(__jsp_taghandler_1);
                __jsp_taghandler_81.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.registrar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[91]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_82=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_82.setParent(__jsp_taghandler_81);
                      __jsp_taghandler_82.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.anioOperacion}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                      if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82,3);
                    }
                    out.write(__oracle_jsp_text[92]);
                  } while (__jsp_taghandler_81.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81,2);
              }
              out.write(__oracle_jsp_text[93]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_83=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_83.setParent(__jsp_taghandler_1);
                __jsp_taghandler_83.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[94]);
                  } while (__jsp_taghandler_83.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83,2);
              }
              out.write(__oracle_jsp_text[95]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_84=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_84.setParent(__jsp_taghandler_1);
                __jsp_taghandler_84.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.registrar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[96]);
                  } while (__jsp_taghandler_84.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,2);
              }
              out.write(__oracle_jsp_text[97]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_85=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_85.setParent(__jsp_taghandler_1);
                __jsp_taghandler_85.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.registrar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[98]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_86=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_86.setParent(__jsp_taghandler_85);
                      __jsp_taghandler_86.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.validacion}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                      if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,3);
                    }
                    out.write(__oracle_jsp_text[99]);
                  } while (__jsp_taghandler_85.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,2);
              }
              out.write(__oracle_jsp_text[100]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_87=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_87.setParent(__jsp_taghandler_1);
                __jsp_taghandler_87.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[101]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_88=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_88.setParent(__jsp_taghandler_87);
                      __jsp_taghandler_88.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.validacion}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                      if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88,3);
                    }
                    out.write(__oracle_jsp_text[102]);
                  } while (__jsp_taghandler_87.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87,2);
              }
              out.write(__oracle_jsp_text[103]);
              {
                org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_89=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var varStatus");
                __jsp_taghandler_89.setParent(__jsp_taghandler_1);
                __jsp_taghandler_89.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.situaciones}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_taghandler_89.setVar("situacion");
                __jsp_taghandler_89.setVarStatus("status");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[104]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_90=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_90.setParent(__jsp_taghandler_89);
                        __jsp_taghandler_90.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.index}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                        if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90,3);
                      }
                      out.write(__oracle_jsp_text[105]);
                      {
                        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_91=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                        __jsp_taghandler_91.setParent(__jsp_taghandler_89);
                        __jsp_taghandler_91.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${situacion}",java.lang.Object.class, __ojsp_varRes,null));
                        __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                        if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91,3);
                      }
                      out.write(__oracle_jsp_text[106]);
                    } while (__jsp_taghandler_89.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_89.doCatch(th);
                } finally {
                  __jsp_taghandler_89.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89,2);
              }
              out.write(__oracle_jsp_text[107]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_92=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_92.setParent(__jsp_taghandler_1);
                __jsp_taghandler_92.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${registrarCursoDTO.editar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[108]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_93=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_93.setParent(__jsp_taghandler_92);
                      __jsp_taghandler_93.setPath("idEjeTematico");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                        if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_93.doCatch(th);
                      } finally {
                        __jsp_taghandler_93.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93,3);
                    }
                    out.write(__oracle_jsp_text[109]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_94=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_94.setParent(__jsp_taghandler_92);
                      __jsp_taghandler_94.setPath("idCursoPrincipal");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
                        if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_94.doCatch(th);
                      } finally {
                        __jsp_taghandler_94.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94,3);
                    }
                    out.write(__oracle_jsp_text[110]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_95=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_95.setParent(__jsp_taghandler_92);
                      __jsp_taghandler_95.setPath("idModalidad");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                        if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_95.doCatch(th);
                      } finally {
                        __jsp_taghandler_95.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95,3);
                    }
                    out.write(__oracle_jsp_text[111]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_96=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_96.setParent(__jsp_taghandler_92);
                      __jsp_taghandler_96.setPath("idFinalidad");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_96.doStartTag();
                        if (__jsp_taghandler_96.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_96.doCatch(th);
                      } finally {
                        __jsp_taghandler_96.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_96,3);
                    }
                    out.write(__oracle_jsp_text[112]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_97=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_97.setParent(__jsp_taghandler_92);
                      __jsp_taghandler_97.setPath("idCapacidadCert");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_97.doStartTag();
                        if (__jsp_taghandler_97.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_97.doCatch(th);
                      } finally {
                        __jsp_taghandler_97.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_97,3);
                    }
                    out.write(__oracle_jsp_text[113]);
                    {
                      org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_98=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                      __jsp_taghandler_98.setParent(__jsp_taghandler_92);
                      __jsp_taghandler_98.setPath("idCaracter");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_98.doStartTag();
                        if (__jsp_taghandler_98.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_98.doCatch(th);
                      } finally {
                        __jsp_taghandler_98.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_98,3);
                    }
                    out.write(__oracle_jsp_text[114]);
                  } while (__jsp_taghandler_92.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92,2);
              }
              out.write(__oracle_jsp_text[115]);
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
      out.write(__oracle_jsp_text[116]);

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
  private static final char __oracle_jsp_text[][]=new char[117][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n    .anchoInputSmall {\r\n        width: 100px;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[24] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Datos del curso</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tbody>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[25] = 
    ":</td>\r\n                                <td align=\"left\">\r\n                                    <table align=\"center\" width=\"100%\">\r\n                                        <tr>                        \r\n                                            <td align=\"center\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                                            </td>\r\n                                            <td align=\"center\">\r\n                                                ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[28] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                                </td>\r\n                                ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[32] = 
    ":</td>\r\n                                <td>\r\n                                    <select name='idEjeTematico' id='idEjeTematico' style=\"width:200px;\" onchange=\"generaClaveCurso();getCursoPrincipalCallback(false)\">\r\n                                        <option value=''>SELECCIONE...</option>\r\n                                    </select>\r\n                                </td>\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[33] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                                </td>  \r\n                            </tr>\r\n                            \r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[36] = 
    ":</td>\r\n                                <td>\r\n                                    <select name='idCursoPrincipal' \r\n                                            id='idCursoPrincipal' \r\n                                            style=\"width:200px;\" \r\n                                            onchange=\"generaClaveCurso();getModalidadCallback(false);getFinalidadCallback(false);getCapacidadCertCallback(false);getCaracterCallback(false)\">\r\n                                        <option value=''>SELECCIONE...</option>\r\n                                    </select>\r\n                                </td>\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[37] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            \r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[39] = 
    ":</td>\r\n                                <td>\r\n                                    <select name='idModalidad' id='idModalidad' style=\"width:200px;\" onchange=\"generaClaveCurso()\" disabled=\"\">\r\n                                        <option value='0'>SELECCIONE...</option>\r\n                                    </select>\r\n                                </td>\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[40] = 
    ":</td>\r\n                                <td>\r\n                                    <select name='idFinalidad' id='idFinalidad' style=\"width:200px;\" onchange=\"generaClaveCurso()\" disabled=\"\">\r\n                                        <option value='0'>SELECCIONE...</option>\r\n                                    </select>\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[41] = 
    ":</td>\r\n                                <td>\r\n                                    <select name='idCapacidadCert' id='idCapacidadCert' style=\"width:200px;\" onchange=\"generaClaveCurso()\" disabled=\"\">\r\n                                        <option value='0'>SELECCIONE...</option>\r\n                                    </select>\r\n                                </td>\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[42] = 
    ":</td>\r\n                                <td>\r\n                                    <select name='idCaracter' id='idCaracter' style=\"width:200px;\" onchange=\"generaClaveCurso()\" disabled=\"\">\r\n                                        <option value='0'>SELECCIONE...</option>\r\n                                    </select>\r\n                                </td>\r\n                            </tr>\r\n                            \r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[43] = 
    ":</td>\r\n                                <td>                                    \r\n                                    ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                                </td>\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[45] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[46] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[47] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[49] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[50] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </fieldset><br/><br/>\r\n                \r\n                <fieldset id=\"fieldsetCertificacion\">\r\n                    <legend style=\"font-size:1.3em\"><strong>Certificaci&oacute;n</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tbody>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[52] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[53] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[54] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">".toCharArray();
    __oracle_jsp_text[57] = 
    ":</td>\r\n                                <td>                                    \r\n                                    ".toCharArray();
    __oracle_jsp_text[58] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </fieldset><br/><br/>\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                    <fieldset id=\"fieldsetCalendarizacion\">\r\n                        <legend style=\"font-size:1.3em\"><strong>Calendarizaci&oacute;n</strong></legend>\r\n                        <table width=\"100%\">\r\n                            <tbody>\r\n                                <tr align=\"left\">\r\n                                    <td class=\"label\">".toCharArray();
    __oracle_jsp_text[60] = 
    ":</td>\r\n                                    <td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                    </td>\r\n                                    <td class=\"label\">".toCharArray();
    __oracle_jsp_text[62] = 
    ":</td>\r\n                                    <td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[63] = 
    "\r\n                                    </td>\r\n                                </tr>\r\n                                <tr align=\"left\">\r\n                                    <td class=\"label\">".toCharArray();
    __oracle_jsp_text[64] = 
    ":</td>\r\n                                    <td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[65] = 
    "\r\n                                    </td>\r\n                                    <td class=\"label\">".toCharArray();
    __oracle_jsp_text[66] = 
    ":</td>\r\n                                    <td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                                    </td>\r\n                                </tr>\r\n                                <tr align=\"left\">\r\n                                    <td class=\"label\">".toCharArray();
    __oracle_jsp_text[68] = 
    ":</td>\r\n                                    <td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                                    </td>\r\n                                </tr>\r\n                            </tbody>\r\n                        </table>\r\n                    </fieldset><br/><br/>\r\n                ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n                \r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Proveedor</strong></legend>\r\n                    <table width=\"100%\">\r\n                        <tbody>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[71] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[72] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr align=\"left\">\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[74] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n                                </td>\r\n                                <td class=\"label\">* ".toCharArray();
    __oracle_jsp_text[77] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[78] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[79] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[80] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </tbody>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td valign=\"middle\" height=\"20px\" align=\"left\">\r\n                <b>* Campos requeridos</b>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>\r\n                <table width=\"90%\" border=\"0\" align=\"center\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[81] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[82] = 
    " &nbsp;\r\n                            ".toCharArray();
    __oracle_jsp_text[83] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[84] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        function getEjeTematicoCallback(verify) {\r\n            var idTipoCurso1 = $j('#tipoCurso1:checked').val();\r\n            var idTipoCurso2 = $j('#tipoCurso2:checked').val();\r\n            var idTipoCurso = \"\";\r\n            if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {\r\n                idTipoCurso = \"CER\";\r\n            } else {\r\n                idTipoCurso = \"CAP\";\r\n            }\r\n            $j.ajax({\r\n                url: 'getEjeTematicoCallback.do',\r\n                type: 'GET',\r\n                data: 'idTipoCurso=' + idTipoCurso,\r\n                success: function(data) {\r\n                    $j('select[id=\"idEjeTematico\"]').find('option').remove().end();\r\n                    $j('select[id=\"idEjeTematico\"]').append(data);\r\n                    if (verify) {\r\n                        verifyEjeTematico();\r\n                        getCursoPrincipalCallback(true);\r\n                    }\r\n                }\r\n            });\r\n        }\r\n        \r\n        function getCursoPrincipalCallback(verify) {\r\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\r\n            if (idEjeTematico != null && idEjeTematico != \"\") {\r\n                $j.ajax({\r\n                    url: 'getCursoPrincipalCallback.do',\r\n                    type: 'GET',\r\n                    data: 'idEjeTematico=' + idEjeTematico,\r\n                    success: function(data) {\r\n                        $j('select[id=\"idCursoPrincipal\"]').find('option').remove().end();\r\n                        $j('select[id=\"idCursoPrincipal\"]').append(data);\r\n                        if (verify) {\r\n                            verifyCursoPrincipal();\r\n                            getModalidadCallback(true);\r\n                        }\r\n                    }\r\n                });\r\n            }\r\n        }\r\n        \r\n        function getModalidadCallback(verify) {\r\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\r\n            var idCursoPrincipal = $j('select[id=\"idCursoPrincipal\"]').val();\r\n            $j.ajax({\r\n                url: 'getModalidadCallback.do',\r\n                type: 'GET',\r\n                data: 'idEjeTematico=' + idEjeTematico + \"&idCursoPrincipal=\" + idCursoPrincipal,\r\n                success: function(data) {\r\n                    $j('select[id=\"idModalidad\"]').find('option').remove().end();\r\n                    $j('select[id=\"idModalidad\"]').append(data);\r\n                    if (verify) {\r\n                        verifyModalidad();\r\n                        getFinalidadCallback(true);\r\n                    }\r\n                }\r\n            });\r\n        }\r\n        \r\n        function getFinalidadCallback(verify) {\r\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\r\n            var idCursoPrincipal = $j('select[id=\"idCursoPrincipal\"]').val();\r\n            $j.ajax({\r\n                url: 'getFinalidadCallback.do',\r\n                type: 'GET',\r\n                data: 'idEjeTematico=' + idEjeTematico + '&idCursoPrincipal=' + idCursoPrincipal,\r\n                success: function(data) {\r\n                    $j('select[id=\"idFinalidad\"]').find('option').remove().end();\r\n                    $j('select[id=\"idFinalidad\"]').append(data);\r\n                    if (verify) {\r\n                        verifyFinalidad();\r\n                        getCapacidadCertCallback(true);\r\n                    }\r\n                }\r\n            });\r\n        }\r\n        \r\n        function getCapacidadCertCallback(verify) {\r\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\r\n            var idCursoPrincipal = $j('select[id=\"idCursoPrincipal\"]').val();\r\n            $j.ajax({\r\n                url: 'getCapacidadCertCallback.do',\r\n                type: 'GET',\r\n                data: 'idEjeTematico=' + idEjeTematico + '&idCursoPrincipal=' + idCursoPrincipal,\r\n                success: function(data) {\r\n                    $j('select[id=\"idCapacidadCert\"]').find('option').remove().end();\r\n                    $j('select[id=\"idCapacidadCert\"]').append(data);\r\n                    if (verify) {\r\n                        verifyCapacidadCert();\r\n                        getCaracterCallback(true);\r\n                    }\r\n                }\r\n            });\r\n        }\r\n        \r\n        function getCaracterCallback(verify) {\r\n            var idEjeTematico = $j('select[id=\"idEjeTematico\"]').val();\r\n            var idCursoPrincipal = $j('select[id=\"idCursoPrincipal\"]').val();\r\n            $j.ajax({\r\n                url: 'getCaracterCallback.do',\r\n                type: 'GET',\r\n                data: 'idEjeTematico=' + idEjeTematico + '&idCursoPrincipal=' + idCursoPrincipal,\r\n                success: function(data) {\r\n                    $j('select[id=\"idCaracter\"]').find('option').remove().end();\r\n                    $j('select[id=\"idCaracter\"]').append(data);\r\n                    if (verify) {\r\n                        verifyCaracter();\r\n                    }\r\n                }\r\n            });\r\n        }\r\n        \r\n        function verifyEjeTematico() {\r\n            var idEjeTematico = '".toCharArray();
    __oracle_jsp_text[85] = 
    "';\r\n            if (idEjeTematico != null && idEjeTematico != \"\") {\r\n                $j(\"#idEjeTematico option[value=\" + idEjeTematico +\"]\").attr(\"selected\",\"selected\");\r\n            }\r\n        }\r\n        function verifyModalidad() {\r\n            var idModalidad = '".toCharArray();
    __oracle_jsp_text[86] = 
    "';\r\n            if (idModalidad != null && idModalidad != \"\") {\r\n                $j(\"#idModalidad option[value=\" + idModalidad +\"]\").attr(\"selected\",\"selected\");\r\n            }\r\n        }\r\n        function verifyFinalidad() {\r\n            var idFinalidad = '".toCharArray();
    __oracle_jsp_text[87] = 
    "';\r\n            if (idFinalidad != null && idFinalidad != \"\") {\r\n                $j(\"#idFinalidad option[value=\" + idFinalidad +\"]\").attr(\"selected\",\"selected\");\r\n            }\r\n        }\r\n        function verifyCapacidadCert() {\r\n            var idCapacidadCert = '".toCharArray();
    __oracle_jsp_text[88] = 
    "';\r\n            if (idCapacidadCert != null && idCapacidadCert != \"\") {\r\n                $j(\"#idCapacidadCert option[value=\" + idFinalidad +\"]\").attr(\"selected\",\"selected\");\r\n            }\r\n        }\r\n        function verifyCaracter() {\r\n            var idCaracter = '".toCharArray();
    __oracle_jsp_text[89] = 
    "';\r\n            if (idCaracter != null && idCaracter != \"\") {\r\n                $j(\"#idCaracter option[value=\" + idCaracter +\"]\").attr(\"selected\",\"selected\");\r\n            }\r\n        }\r\n        function verifyCursoPrincipal() {\r\n            var idCursoPrincipal = '".toCharArray();
    __oracle_jsp_text[90] = 
    "';\r\n            if (idCursoPrincipal != null && idCursoPrincipal != \"\") {\r\n                $j(\"#idCursoPrincipal option[value=\" + idCursoPrincipal +\"]\").attr(\"selected\",\"selected\");\r\n            }\r\n        }\r\n    </script>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[91] = 
    "\r\n        <script type=\"text/javascript\">\r\n            // Genera clave de curso\r\n            function generaClaveCurso() {\r\n                var idTipoCurso1 = $j('#tipoCurso1:checked').val();\r\n                var idTipoCurso2 = $j('#tipoCurso2:checked').val();\r\n                var idTipoCurso = \"\";\r\n                if (idTipoCurso2 != null && idTipoCurso2 != 'CER') {\r\n                    idTipoCurso = \"CER\";\r\n                } else {\r\n                    idTipoCurso = \"CAP\";\r\n                }\r\n                var consecutivo = \"\";\r\n                var codigoCurso = $j(\"#idCursoPrincipal\").val();\r\n                var idSubprograma = $j(\"#idSubprograma\").val();\r\n                var idEjeTematico = $j(\"#idEjeTematico\").val();\r\n                var anioOperacion = \"".toCharArray();
    __oracle_jsp_text[92] = 
    "\";\r\n                $j.ajax({\r\n                    url: 'getConsecutivoClaveCursoCallback.do',\r\n                    type: 'GET',\r\n                    data: 'idTipoCurso=' + idTipoCurso + '&idCursoPrincicpal=' + codigoCurso + '&idEjeTematico=' + idEjeTematico + '&cicloEjeTematico=' + anioOperacion + '&idSubprograma=' + idSubprograma,\r\n                    success: function(data) {\r\n                        var claveCursoGenerada = codigoCurso + data + anioOperacion.substring(2, 4) + \"-\" + idSubprograma;\r\n                        $j(\"#claveCurso\").val(claveCursoGenerada);\r\n                    }\r\n                });\r\n            }\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[93] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[94] = 
    "\r\n        <!--editar-->\r\n        <script type=\"text/javascript\">\r\n            // Genera clave de curso\r\n            function generaClaveCurso() {\r\n            }\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[95] = 
    "\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){            \r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.alphanumericEspacios').alphanumeric({allow:\" \"});\r\n            $j('.decimal').decimal();\r\n            $j('.claveCurso').alphanumeric({allow:\"-\"});\r\n            $j('.numeric').numeric();\r\n            $j(\"#presupuesto\").mask(\"9999999999.99\");\r\n        });\r\n        \r\n        function disableFieldsCurso(clear) {\r\n            if (clear) {\r\n                $j(\"#idCoordinacion\").val(\"\");\r\n                $j(\"#idEjeTematico\").val(\"\");\r\n                $j(\"#idSubprograma\").val(\"\");\r\n                $j(\"#idCursoPrincipal\").val(\"\");\r\n                //$j(\"#duracion\").val(\"\");\r\n            }\r\n            $j(\"#idCoordinacion\").attr(\"disabled\",\"true\");\r\n            $j(\"#idEjeTematico\").attr(\"disabled\",\"true\");\r\n            $j(\"#idSubprograma\").attr(\"disabled\",\"true\");\r\n            $j(\"#idCursoPrincipal\").attr(\"disabled\",\"true\");\r\n            $j(\"#duracion\").attr(\"disabled\",\"true\");\r\n            $j(\"#presupuesto\").attr(\"disabled\",\"true\");\r\n        }\r\n        function disableFieldsCursoEdicion(clear) {\r\n            if (clear) {\r\n                $j(\"#idCoordinacion\").val(\"\");\r\n                $j(\"#idEjeTematico\").val(\"\");\r\n                $j(\"#idSubprograma\").val(\"\");\r\n                $j(\"#idCursoPrincipal\").val(\"\");\r\n                $j(\"#duracion\").val(\"\");\r\n            }\r\n            $j(\"#idCoordinacion\").attr(\"disabled\",\"true\");\r\n            $j(\"#idEjeTematico\").attr(\"disabled\",\"true\");\r\n            $j(\"#idSubprograma\").attr(\"disabled\",\"true\");\r\n            $j(\"#idCursoPrincipal\").attr(\"disabled\",\"true\");\r\n        }\r\n        function enableFieldsCurso(clear) {\r\n            if (clear) {\r\n                $j(\"#idCoordinacion\").val(\"\");\r\n                $j(\"#idEjeTematico\").val(\"\");\r\n                $j(\"#idSubprograma\").val(\"\");\r\n                $j(\"#idCursoPrincipal\").val(\"\");\r\n                //$j(\"#duracion\").val(\"\");\r\n            }\r\n            $j(\"#idCoordinacion\").removeAttr(\"disabled\");\r\n            $j(\"#idEjeTematico\").removeAttr(\"disabled\");\r\n            $j(\"#idSubprograma\").removeAttr(\"disabled\");\r\n            $j(\"#idCursoPrincipal\").removeAttr(\"disabled\");\r\n            $j(\"#duracion\").removeAttr(\"disabled\");\r\n            $j(\"#presupuesto\").removeAttr(\"disabled\");\r\n        }\r\n        \r\n        function disableClearFieldsCertificacion(clear) {\r\n            if (clear) {\r\n                $j(\"#claveCertificacion\").val(\"\");\r\n                $j(\"#nivelCurso\").val(\"\");\r\n                $j(\"#supervisorInstEducat\").val(\"\");\r\n            }\r\n            $j(\"#claveCertificacion\").attr(\"disabled\",\"true\");\r\n            $j(\"#nivelCurso\").attr(\"disabled\",\"true\");\r\n            $j(\"#supervisorInstEducat\").attr(\"disabled\",\"true\");\r\n        }\r\n        function enableFieldsCertificacion(clear) {\r\n            if (clear) {\r\n                $j(\"#claveCertificacion\").val(\"\");\r\n                $j(\"#nivelCurso\").val(\"\");\r\n                $j(\"#supervisorInstEducat\").val(\"\");\r\n            }\r\n            $j(\"#claveCertificacion\").removeAttr(\"disabled\");\r\n            $j(\"#nivelCurso\").removeAttr(\"disabled\");\r\n            $j(\"#supervisorInstEducat\").removeAttr(\"disabled\");\r\n        }\r\n        \r\n        function disableFieldsProveedor(clear) {\r\n            if (clear) {\r\n                $j(\"#tipoInstEducat\").val(\"\");\r\n                $j(\"#proveedor\").val(\"\");\r\n                $j(\"#situacionProveedor\").val(\"\");\r\n            }\r\n            $j(\"#tipoInstEducat\").attr(\"disabled\",\"true\");\r\n            $j(\"#proveedor\").attr(\"disabled\",\"true\");\r\n            $j(\"#situacionProveedor\").attr(\"disabled\",\"true\");\r\n        }\r\n        function enableFieldsProveedor(clear) {\r\n            if (clear) {\r\n                $j(\"#tipoInstEducat\").val(\"\");\r\n                $j(\"#proveedor\").val(\"\");\r\n                $j(\"#situacionProveedor\").val(\"\");\r\n            }\r\n            $j(\"#tipoInstEducat\").removeAttr(\"disabled\");\r\n            $j(\"#proveedor\").removeAttr(\"disabled\");\r\n            $j(\"#situacionProveedor\").removeAttr(\"disabled\");\r\n        }\r\n    </script>\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[96] = 
    "\r\n        <!--registrar-->\r\n        <script type=\"text/javascript\">\r\n            // Curso de capacitacion\r\n            $j(\"#tipoCurso1\").click(function(){\r\n                enableFieldsCurso(true);\r\n                $j(\"#fieldsetCertificacion\").hide();\r\n                $j(\"#fieldsetCalendarizacion\").hide();\r\n                disableClearFieldsCertificacion(true);\r\n                enableFieldsProveedor(true);\r\n                getEjeTematicoCallback(false);\r\n            });\r\n            \r\n            // Curso de certificacion\r\n            $j(\"#tipoCurso2\").click(function(){\r\n                enableFieldsCurso(true);\r\n                $j(\"#fieldsetCertificacion\").show();\r\n                $j(\"#fieldsetCalendarizacion\").hide();\r\n                enableFieldsCertificacion(true);\r\n                enableFieldsProveedor(true);\r\n                getEjeTematicoCallback(false);\r\n            });\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[97] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[98] = 
    "\r\n        <!--registrar-->\r\n        <script type=\"text/javascript\">\r\n            var validacion = \"".toCharArray();
    __oracle_jsp_text[99] = 
    "\";\r\n            if (validacion == \"true\") {\r\n                // Inicializar forma\r\n                getEjeTematicoCallback(true);\r\n                \r\n                var idTipoCurso2 = $j('#tipoCurso2:checked').val();\r\n                if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {\r\n                    $j(\"#fieldsetCertificacion\").show();\r\n                    $j(\"#fieldsetCalendarizacion\").hide();\r\n                } else {\r\n                    $j(\"#fieldsetCertificacion\").hide();\r\n                    $j(\"#fieldsetCalendarizacion\").hide();\r\n                }\r\n            } else {\r\n                // Inicializar forma\r\n                disableFieldsCurso(true);\r\n                disableClearFieldsCertificacion(true);\r\n                disableFieldsProveedor(true);\r\n                $j(\"#fieldsetCertificacion\").hide();\r\n                $j(\"#fieldsetCalendarizacion\").hide();\r\n                $j(\"#camposCertificacion\").hide();\r\n            }\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[100] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[101] = 
    "\r\n        <!--editar-->\r\n        <script type=\"text/javascript\">\r\n            var validacion = \"".toCharArray();
    __oracle_jsp_text[102] = 
    "\";\r\n            if (validacion == \"true\") {\r\n                // Inicializar forma\r\n                $j(\"#tipoCurso1\").attr(\"readonly\",\"true\");\r\n                $j(\"#tipoCurso2\").attr(\"readonly\",\"true\");\r\n                disableFieldsCursoEdicion(false);\r\n                getEjeTematicoCallback(true);\r\n                \r\n                var idTipoCurso2 = $j('#tipoCurso2:checked').val();\r\n                if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {\r\n                    $j(\"#fieldsetCertificacion\").show();\r\n                    $j(\"#fieldsetCalendarizacion\").show();\r\n                } else {\r\n                    $j(\"#fieldsetCertificacion\").hide();\r\n                    $j(\"#fieldsetCalendarizacion\").show();\r\n                }\r\n            } else {\r\n                // Inicializar forma\r\n                $j(\"#tipoCurso1\").attr(\"disabled\",\"true\");\r\n                $j(\"#tipoCurso2\").attr(\"disabled\",\"true\");\r\n                disableFieldsCursoEdicion(false);\r\n                getEjeTematicoCallback(true);\r\n                \r\n                var idTipoCurso2 = $j('#tipoCurso2:checked').val();\r\n                if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {\r\n                    $j(\"#fieldsetCertificacion\").show();\r\n                    $j(\"#fieldsetCalendarizacion\").show();\r\n                } else {\r\n                    $j(\"#fieldsetCertificacion\").hide();\r\n                    $j(\"#fieldsetCalendarizacion\").show();\r\n                }\r\n            }\r\n        </script>\r\n    ".toCharArray();
    __oracle_jsp_text[103] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[104] = 
    "\r\n        <input type=\"hidden\" name=\"situaciones[".toCharArray();
    __oracle_jsp_text[105] = 
    "]\" value=\"".toCharArray();
    __oracle_jsp_text[106] = 
    "\" />\r\n    ".toCharArray();
    __oracle_jsp_text[107] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[108] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[109] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[110] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[111] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[112] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[113] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[114] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[115] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[116] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
