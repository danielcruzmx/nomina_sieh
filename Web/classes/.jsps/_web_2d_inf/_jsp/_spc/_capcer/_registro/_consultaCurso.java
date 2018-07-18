package _web_2d_inf._jsp._spc._capcer._registro;

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
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
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
              out.write(__oracle_jsp_text[7]);
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
              out.write(__oracle_jsp_text[8]);
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
              out.write(__oracle_jsp_text[9]);
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
              out.write(__oracle_jsp_text[10]);
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
              out.write(__oracle_jsp_text[11]);
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
              out.write(__oracle_jsp_text[12]);
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
              out.write(__oracle_jsp_text[13]);
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
              out.write(__oracle_jsp_text[14]);
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
              out.write(__oracle_jsp_text[15]);
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
              out.write(__oracle_jsp_text[16]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setPath("control");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setPath("rolAdministradorCapacitacion");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setPath("rolOperadorCapacitacion");
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
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setPath("cursoFecIniTxt");
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
              out.write(__oracle_jsp_text[20]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_15=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setPath("cursoFecFinTxt");
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
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[22]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                      __jsp_taghandler_17.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[23]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_18=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments");
                            __jsp_taghandler_18.setParent(__jsp_taghandler_17);
                            __jsp_taghandler_18.setCode("sireh.label.spc.capcer.registro.general.consultaCursos.title");
                            __jsp_taghandler_18.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.interior}",java.lang.Object.class, __ojsp_varRes,null));
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
                              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_18.doCatch(th);
                            } finally {
                              __jsp_taghandler_18.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
                          }
                          out.write(__oracle_jsp_text[24]);
                        } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,3);
                    }
                    out.write(__oracle_jsp_text[25]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_19.setParent(__jsp_taghandler_16);
                      __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[26]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_20=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code arguments");
                            __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                            __jsp_taghandler_20.setCode("sireh.label.spc.capcer.registro.general.consultaCursos.title");
                            __jsp_taghandler_20.setArguments((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.interior}",java.lang.Object.class, __ojsp_varRes,null));
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_20.doCatch(th);
                            } finally {
                              __jsp_taghandler_20.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,4);
                          }
                          out.write(__oracle_jsp_text[27]);
                        } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                    }
                    out.write(__oracle_jsp_text[28]);
                  } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
              }
              out.write(__oracle_jsp_text[29]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_21.setParent(__jsp_taghandler_1);
                __jsp_taghandler_21.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolAdministradorCertificacion}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[30]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_22.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_22.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.coordinacion");
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
                    out.write(__oracle_jsp_text[31]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_23=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_23.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_23.setJspContext(pageContext);
                      __jsp_taghandler_23.setKey("");
                      __jsp_taghandler_23.setValue("selectList.nonValue");
                      __jsp_taghandler_23.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_23, pageContext);
                    }
                    out.write(__oracle_jsp_text[32]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_24=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_24.setParent(__jsp_taghandler_21);
                      __jsp_taghandler_24.setJspContext(pageContext);
                      __jsp_taghandler_24.setBeanName("tcCapCoordinacion-consultaCurso");
                      __jsp_taghandler_24.setPath("idCoordinacion");
                      __jsp_taghandler_24.setStyle("width:200px;");
                      __jsp_taghandler_24.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_24, pageContext);
                    }
                    out.write(__oracle_jsp_text[33]);
                  } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,2);
              }
              out.write(__oracle_jsp_text[34]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_25.setParent(__jsp_taghandler_1);
                __jsp_taghandler_25.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolOperadorCapacitacion) and (consultaCursoDTO.control eq 'REG_CURSO' || consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR') }",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[35]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_26=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_26.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_26.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.proveedor");
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
                    out.write(__oracle_jsp_text[36]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_27=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_27.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_27.setJspContext(pageContext);
                      __jsp_taghandler_27.setKey("");
                      __jsp_taghandler_27.setValue("selectList.nonValue");
                      __jsp_taghandler_27.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_27, pageContext);
                    }
                    out.write(__oracle_jsp_text[37]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_28=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_28.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_28.setJspContext(pageContext);
                      __jsp_taghandler_28.setBeanName("tcCapProveedor-consultaCurso");
                      __jsp_taghandler_28.setPath("idProveedor");
                      __jsp_taghandler_28.setStyle("width:200px;");
                      __jsp_taghandler_28.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_28, pageContext);
                    }
                    out.write(__oracle_jsp_text[38]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_29=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_29.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_29.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.operadorDGRH");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
                        if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_29.doCatch(th);
                      } finally {
                        __jsp_taghandler_29.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,3);
                    }
                    out.write(__oracle_jsp_text[39]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_30=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_30.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_30.setJspContext(pageContext);
                      __jsp_taghandler_30.setKey("");
                      __jsp_taghandler_30.setValue("selectList.nonValue");
                      __jsp_taghandler_30.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_30, pageContext);
                    }
                    out.write(__oracle_jsp_text[40]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_31=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_31.setParent(__jsp_taghandler_25);
                      __jsp_taghandler_31.setJspContext(pageContext);
                      __jsp_taghandler_31.setBeanName("tcCapOperDgrh-consultaCurso");
                      __jsp_taghandler_31.setPath("rfcOperDgrh");
                      __jsp_taghandler_31.setStyle("width:200px;");
                      __jsp_taghandler_31.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_31, pageContext);
                    }
                    out.write(__oracle_jsp_text[41]);
                  } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,2);
              }
              out.write(__oracle_jsp_text[42]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_32=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_32.setParent(__jsp_taghandler_1);
                __jsp_taghandler_32.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.subprograma");
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
              out.write(__oracle_jsp_text[43]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_33=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_33.setParent(__jsp_taghandler_1);
                __jsp_taghandler_33.setJspContext(pageContext);
                __jsp_taghandler_33.setKey("");
                __jsp_taghandler_33.setValue("selectList.nonValue");
                __jsp_taghandler_33.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_33, pageContext);
              }
              out.write(__oracle_jsp_text[44]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_34=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_34.setParent(__jsp_taghandler_1);
                __jsp_taghandler_34.setJspContext(pageContext);
                __jsp_taghandler_34.setBeanName("tcCapSubprograma-consultaCurso");
                __jsp_taghandler_34.setPath("idSubprograma");
                __jsp_taghandler_34.setStyle("width:200px;");
                __jsp_taghandler_34.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_34, pageContext);
              }
              out.write(__oracle_jsp_text[45]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_35=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_35.setParent(__jsp_taghandler_1);
                __jsp_taghandler_35.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.ejeTematico");
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
              out.write(__oracle_jsp_text[46]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_36=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_36.setParent(__jsp_taghandler_1);
                __jsp_taghandler_36.setJspContext(pageContext);
                __jsp_taghandler_36.setKey("");
                __jsp_taghandler_36.setValue("selectList.nonValue");
                __jsp_taghandler_36.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_36, pageContext);
              }
              out.write(__oracle_jsp_text[47]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_37=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_37.setParent(__jsp_taghandler_1);
                __jsp_taghandler_37.setJspContext(pageContext);
                __jsp_taghandler_37.setBeanName("tcCapEjeTematico-consultaCurso");
                __jsp_taghandler_37.setPath("idEjeTematico");
                __jsp_taghandler_37.setStyle("width:200px;");
                __jsp_taghandler_37.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_37, pageContext);
              }
              out.write(__oracle_jsp_text[48]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_38=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_38.setParent(__jsp_taghandler_1);
                __jsp_taghandler_38.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.modalidad");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_38.doStartTag();
                  if (__jsp_taghandler_38.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_38.doCatch(th);
                } finally {
                  __jsp_taghandler_38.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_38,2);
              }
              out.write(__oracle_jsp_text[49]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_39=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_39.setParent(__jsp_taghandler_1);
                __jsp_taghandler_39.setJspContext(pageContext);
                __jsp_taghandler_39.setKey("");
                __jsp_taghandler_39.setValue("selectList.nonValue");
                __jsp_taghandler_39.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_39, pageContext);
              }
              out.write(__oracle_jsp_text[50]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_40=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_40.setParent(__jsp_taghandler_1);
                __jsp_taghandler_40.setJspContext(pageContext);
                __jsp_taghandler_40.setBeanName("tcCapModalidad-consultaCurso");
                __jsp_taghandler_40.setPath("idModalidad");
                __jsp_taghandler_40.setStyle("width:200px;");
                __jsp_taghandler_40.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_40, pageContext);
              }
              out.write(__oracle_jsp_text[51]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_41=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_41.setParent(__jsp_taghandler_1);
                __jsp_taghandler_41.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolEjecutivoContratacion) and consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_41.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[52]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_42=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_42.setParent(__jsp_taghandler_41);
                      __jsp_taghandler_42.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.finalidad");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_42.doStartTag();
                        if (__jsp_taghandler_42.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_42.doCatch(th);
                      } finally {
                        __jsp_taghandler_42.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_42,3);
                    }
                    out.write(__oracle_jsp_text[53]);
                    {
                      _oracle._jsp._tag._option_tag __jsp_taghandler_43=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                      __jsp_taghandler_43.setParent(__jsp_taghandler_41);
                      __jsp_taghandler_43.setJspContext(pageContext);
                      __jsp_taghandler_43.setKey("");
                      __jsp_taghandler_43.setValue("selectList.nonValue");
                      __jsp_taghandler_43.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_43, pageContext);
                    }
                    out.write(__oracle_jsp_text[54]);
                    {
                      _oracle._jsp._tag._selectList_tag __jsp_taghandler_44=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                      __jsp_taghandler_44.setParent(__jsp_taghandler_41);
                      __jsp_taghandler_44.setJspContext(pageContext);
                      __jsp_taghandler_44.setBeanName("tcCapFinalidad-consultaCurso");
                      __jsp_taghandler_44.setPath("idFinalidad");
                      __jsp_taghandler_44.setStyle("width:200px;");
                      __jsp_taghandler_44.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_44, pageContext);
                    }
                    out.write(__oracle_jsp_text[55]);
                  } while (__jsp_taghandler_41.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_41.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_41,2);
              }
              out.write(__oracle_jsp_text[56]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_45=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_45.setParent(__jsp_taghandler_1);
                __jsp_taghandler_45.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa || consultaCursoDTO.rolOperadorCapacitacion) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' or consultaCursoDTO.control == 'ASIGNAR_INSTRUCTOR')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_45.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[57]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_46=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_46.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_46.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.fechaInicio");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_46.doStartTag();
                        if (__jsp_taghandler_46.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_46.doCatch(th);
                      } finally {
                        __jsp_taghandler_46.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_46,3);
                    }
                    out.write(__oracle_jsp_text[58]);
                    {
                      _oracle._jsp._tag._calendar_tag __jsp_taghandler_47=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                      __jsp_taghandler_47.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_47.setJspContext(pageContext);
                      __jsp_taghandler_47.setPath("cursoFecIni");
                      __jsp_taghandler_47.setReadonly("true");
                      __jsp_taghandler_47.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_47, pageContext);
                    }
                    out.write(__oracle_jsp_text[59]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_48=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_48.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_48.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.fechaFin");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_48.doStartTag();
                        if (__jsp_taghandler_48.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_48.doCatch(th);
                      } finally {
                        __jsp_taghandler_48.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_48,3);
                    }
                    out.write(__oracle_jsp_text[60]);
                    {
                      _oracle._jsp._tag._calendar_tag __jsp_taghandler_49=(_oracle._jsp._tag._calendar_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._calendar_tag.class, pageContext);
                      __jsp_taghandler_49.setParent(__jsp_taghandler_45);
                      __jsp_taghandler_49.setJspContext(pageContext);
                      __jsp_taghandler_49.setPath("cursoFecFin");
                      __jsp_taghandler_49.setReadonly("true");
                      __jsp_taghandler_49.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_49, pageContext);
                    }
                    out.write(__oracle_jsp_text[61]);
                  } while (__jsp_taghandler_45.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_45.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_45,2);
              }
              out.write(__oracle_jsp_text[62]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_50=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_50.setParent(__jsp_taghandler_1);
                __jsp_taghandler_50.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.claveCurso");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_50.doStartTag();
                  if (__jsp_taghandler_50.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_50.doCatch(th);
                } finally {
                  __jsp_taghandler_50.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_50,2);
              }
              out.write(__oracle_jsp_text[63]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_51=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_51.setParent(__jsp_taghandler_1);
                __jsp_taghandler_51.setJspContext(pageContext);
                __jsp_taghandler_51.setPath("claveCurso");
                __jsp_taghandler_51.setMaxlength("60");
                __jsp_taghandler_51.setSize("60");
                __jsp_taghandler_51.setCss("anchoInput claveCurso");
                __jsp_taghandler_51.setUppercase("true");
                __jsp_taghandler_51.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_51, pageContext);
              }
              out.write(__oracle_jsp_text[64]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_52=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_52.setParent(__jsp_taghandler_1);
                __jsp_taghandler_52.setCode("sireh.label.spc.capcer.registro.registrarCurso.filtro.estatus");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_52.doStartTag();
                  if (__jsp_taghandler_52.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_52.doCatch(th);
                } finally {
                  __jsp_taghandler_52.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_52,2);
              }
              out.write(__oracle_jsp_text[65]);
              {
                _oracle._jsp._tag._filter_tag __jsp_taghandler_53=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                __jsp_taghandler_53.setParent(__jsp_taghandler_1);
                __jsp_taghandler_53.setJspContext(pageContext);
                __jsp_taghandler_53.setProperty("ID_CONTROL_CURSO");
                __jsp_taghandler_53.setCondition("IN");
                __jsp_taghandler_53.setPath("estatusCursos");
                __jsp_taghandler_53.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_53, pageContext);
              }
              out.write(__oracle_jsp_text[66]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_54=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_54.setParent(__jsp_taghandler_1);
                __jsp_taghandler_54.setJspContext(pageContext);
                __jsp_taghandler_54.setKey("");
                __jsp_taghandler_54.setValue("selectList.nonValue");
                __jsp_taghandler_54.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_54, pageContext);
              }
              out.write(__oracle_jsp_text[67]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_55=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_55.setParent(__jsp_taghandler_1);
                __jsp_taghandler_55.setJspContext(pageContext);
                __jsp_taghandler_55.setBeanName("tcCapControlCurso-consultaCurso");
                __jsp_taghandler_55.setPath("idControlCurso");
                __jsp_taghandler_55.setStyle("width:200px;");
                __jsp_taghandler_55.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_55, pageContext);
              }
              out.write(__oracle_jsp_text[68]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_56=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_56.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_56.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[69]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_57=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_57.setParent(__jsp_taghandler_56);
                      __jsp_taghandler_57.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' || consultaCursoDTO.control eq 'ASIGNAR_PARTICIPANTE' || consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_57.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[70]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_58=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_58.setParent(__jsp_taghandler_57);
                            __jsp_taghandler_58.setJspContext(pageContext);
                            __jsp_taghandler_58.setPath("muestraRegistros");
                            __jsp_taghandler_58.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_taghandler_58.setValue("submit.search");
                            __jsp_taghandler_58.setOnclick("cambioFechas()");
                            __jsp_taghandler_58.setProgressBar("true");
                            __jsp_taghandler_58.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_58, pageContext);
                          }
                          out.write(__oracle_jsp_text[71]);
                        } while (__jsp_taghandler_57.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_57.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_57,3);
                    }
                    out.write(__oracle_jsp_text[72]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_59=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_59.setParent(__jsp_taghandler_56);
                      __jsp_tag_starteval=__jsp_taghandler_59.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[73]);
                          {
                            _oracle._jsp._tag._submit_tag __jsp_taghandler_60=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                            __jsp_taghandler_60.setParent(__jsp_taghandler_59);
                            __jsp_taghandler_60.setJspContext(pageContext);
                            __jsp_taghandler_60.setPath("muestraRegistros");
                            __jsp_taghandler_60.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_taghandler_60.setValue("submit.search");
                            __jsp_taghandler_60.setProgressBar("true");
                            __jsp_taghandler_60.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_60, pageContext);
                          }
                          out.write(__oracle_jsp_text[74]);
                        } while (__jsp_taghandler_59.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_59.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_59,3);
                    }
                    out.write(__oracle_jsp_text[75]);
                  } while (__jsp_taghandler_56.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_56.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_56,2);
              }
              out.write(__oracle_jsp_text[76]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_61=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_61.setParent(__jsp_taghandler_1);
                __jsp_taghandler_61.setJspContext(pageContext);
                __jsp_taghandler_61.setPath("cancel");
                __jsp_taghandler_61.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_61.setValue("submit.clean");
                __jsp_taghandler_61.setProgressBar("true");
                __jsp_taghandler_61.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_61, pageContext);
              }
              out.write(__oracle_jsp_text[77]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_62=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_62.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_62.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[78]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_63=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_63.setParent(__jsp_taghandler_62);
                      __jsp_taghandler_63.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.muestraRegistros}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_63.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[79]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_64=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_64.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_64.setJspContext(pageContext);
                            __jsp_taghandler_64.setProperty("C.ID_COORDINACION");
                            __jsp_taghandler_64.setCondition("=");
                            __jsp_taghandler_64.setPath("idCoordinacion");
                            __jsp_taghandler_64.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_64, pageContext);
                          }
                          out.write(__oracle_jsp_text[80]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_65=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_65.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_65.setJspContext(pageContext);
                            __jsp_taghandler_65.setProperty("C.ID_PROVEEDOR");
                            __jsp_taghandler_65.setCondition("=");
                            __jsp_taghandler_65.setPath("idProveedor");
                            __jsp_taghandler_65.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_65, pageContext);
                          }
                          out.write(__oracle_jsp_text[81]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_66=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_66.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_66.setJspContext(pageContext);
                            __jsp_taghandler_66.setProperty("C.RFC_OPER_DGRH");
                            __jsp_taghandler_66.setCondition("=");
                            __jsp_taghandler_66.setPath("rfcOperDgrh");
                            __jsp_taghandler_66.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_66, pageContext);
                          }
                          out.write(__oracle_jsp_text[82]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_67=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_67.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_67.setJspContext(pageContext);
                            __jsp_taghandler_67.setProperty("C.ID_SUBPROGRAMA");
                            __jsp_taghandler_67.setCondition("=");
                            __jsp_taghandler_67.setPath("idSubprograma");
                            __jsp_taghandler_67.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_67, pageContext);
                          }
                          out.write(__oracle_jsp_text[83]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_68=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_68.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_68.setJspContext(pageContext);
                            __jsp_taghandler_68.setProperty("C.ID_EJE_TEMATICO");
                            __jsp_taghandler_68.setCondition("=");
                            __jsp_taghandler_68.setPath("idEjeTematico");
                            __jsp_taghandler_68.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_68, pageContext);
                          }
                          out.write(__oracle_jsp_text[84]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_69=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_69.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_69.setJspContext(pageContext);
                            __jsp_taghandler_69.setProperty("CP.ID_MODALIDAD");
                            __jsp_taghandler_69.setCondition("=");
                            __jsp_taghandler_69.setPath("idModalidad");
                            __jsp_taghandler_69.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_69, pageContext);
                          }
                          out.write(__oracle_jsp_text[85]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_70=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_70.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_70.setJspContext(pageContext);
                            __jsp_taghandler_70.setProperty("C.CURSO_CLAVE");
                            __jsp_taghandler_70.setCondition("contains");
                            __jsp_taghandler_70.setPath("claveCurso");
                            __jsp_taghandler_70.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_70, pageContext);
                          }
                          out.write(__oracle_jsp_text[86]);
                          {
                            _oracle._jsp._tag._filter_tag __jsp_taghandler_71=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                            __jsp_taghandler_71.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_71.setJspContext(pageContext);
                            __jsp_taghandler_71.setProperty("C.ID_CONTROL_CURSO");
                            __jsp_taghandler_71.setCondition("=");
                            __jsp_taghandler_71.setPath("idControlCurso");
                            __jsp_taghandler_71.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_71, pageContext);
                          }
                          out.write(__oracle_jsp_text[87]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_72=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                            __jsp_taghandler_72.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_72.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' || consultaCursoDTO.control eq 'ASIGNAR_PARTICIPANTE' || consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_72.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write(__oracle_jsp_text[88]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_73=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_73.setParent(__jsp_taghandler_72);
                                  __jsp_taghandler_73.setJspContext(pageContext);
                                  __jsp_taghandler_73.setProperty("to_char(C.CURSO_FEC_INI, 'yyyy/mm/dd') >");
                                  __jsp_taghandler_73.setCondition("=");
                                  __jsp_taghandler_73.setPath("cursoFecIniTxt");
                                  __jsp_taghandler_73.setType("string");
                                  __jsp_taghandler_73.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_73, pageContext);
                                }
                                out.write(__oracle_jsp_text[89]);
                                {
                                  _oracle._jsp._tag._filter_tag __jsp_taghandler_74=(_oracle._jsp._tag._filter_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._filter_tag.class, pageContext);
                                  __jsp_taghandler_74.setParent(__jsp_taghandler_72);
                                  __jsp_taghandler_74.setJspContext(pageContext);
                                  __jsp_taghandler_74.setProperty("to_char(C.CURSO_FEC_FIN, 'yyyy/mm/dd') <");
                                  __jsp_taghandler_74.setCondition("=");
                                  __jsp_taghandler_74.setPath("cursoFecFinTxt");
                                  __jsp_taghandler_74.setType("string");
                                  __jsp_taghandler_74.doTag();
                                  OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_74, pageContext);
                                }
                                out.write(__oracle_jsp_text[90]);
                              } while (__jsp_taghandler_72.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_72.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_72,4);
                          }
                          out.write(__oracle_jsp_text[91]);
                          {
                            _oracle._jsp._tag._pagedList_tag __jsp_taghandler_75=(_oracle._jsp._tag._pagedList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._pagedList_tag.class, pageContext);
                            __jsp_taghandler_75.setParent(__jsp_taghandler_63);
                            __jsp_taghandler_75.setJspContext(pageContext);
                            __jsp_taghandler_75.setBeanName((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.beanName}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_75.setBaseUrl((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_75.setAppendFilters("false");
                            __jsp_taghandler_75.setCheckbox("true");
                            __jsp_taghandler_75.setChkProperty("idCursos");
                            __jsp_taghandler_75.setJspBody(new _consultaCurso_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_75, __ojsp_varRes));
                            __jsp_taghandler_75.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_75, pageContext);
                          }
                          out.write(__oracle_jsp_text[92]);
                        } while (__jsp_taghandler_63.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_63.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_63,3);
                    }
                    out.write(__oracle_jsp_text[93]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_131=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_131.setParent(__jsp_taghandler_62);
                      __jsp_tag_starteval=__jsp_taghandler_131.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[94]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_132=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_132.setParent(__jsp_taghandler_131);
                            __jsp_taghandler_132.setCode("pagedList.empty.content");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_132.doStartTag();
                              if (__jsp_taghandler_132.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_132.doCatch(th);
                            } finally {
                              __jsp_taghandler_132.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_132,4);
                          }
                          out.write(__oracle_jsp_text[95]);
                        } while (__jsp_taghandler_131.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_131.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_131,3);
                    }
                    out.write(__oracle_jsp_text[96]);
                  } while (__jsp_taghandler_62.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_62.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_62,2);
              }
              out.write(__oracle_jsp_text[97]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_133=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_133.setParent(__jsp_taghandler_1);
                __jsp_taghandler_133.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolOperadorCapacitacion) && consultaCursoDTO.control eq 'REG_CURSO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_133.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[98]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_134=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_134.setParent(__jsp_taghandler_133);
                      __jsp_taghandler_134.setJspContext(pageContext);
                      __jsp_taghandler_134.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlRegistroCurso}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_134.setValue("submit.registrar");
                      __jsp_taghandler_134.setProgressBar("true");
                      __jsp_taghandler_134.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_134, pageContext);
                    }
                    out.write(__oracle_jsp_text[99]);
                  } while (__jsp_taghandler_133.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_133.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_133,2);
              }
              out.write(__oracle_jsp_text[100]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_135=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_135.setParent(__jsp_taghandler_1);
                __jsp_taghandler_135.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.rolAdministradorCapacitacion && consultaCursoDTO.control eq 'REG_CURSO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_135.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[101]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_136=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_136.setParent(__jsp_taghandler_135);
                      __jsp_taghandler_136.setJspContext(pageContext);
                      __jsp_taghandler_136.setPath("eliminarCursos");
                      __jsp_taghandler_136.setAction((java.lang.String) ("registroCursoSPC/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.urlDeleteRegistroCurso}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_136.setValue("submit.delete");
                      __jsp_taghandler_136.setAlertCode("confirm.spc.capcer.registro.eliminarCurso");
                      __jsp_taghandler_136.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_136, pageContext);
                    }
                    out.write(__oracle_jsp_text[102]);
                  } while (__jsp_taghandler_135.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_135.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_135,2);
              }
              out.write(__oracle_jsp_text[103]);
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
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_75       = parent;
      out.write("\r\n                            <div id=\"displayTagDiv\" style=\"width:1000px; min-height:200px;overflow:auto;text-align:center;\"> \r\n                                ");
      {
        org.displaytag.tags.TableTag __jsp_taghandler_76=(org.displaytag.tags.TableTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.TableTag.class,"org.displaytag.tags.TableTag name pagesize decorator requestURI class export id sort");
        __jsp_taghandler_76.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_75));
        __jsp_taghandler_76.setName((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.beanName}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_taghandler_76.setPagesize(20);
        __jsp_taghandler_76.setDecorator("checkboxTableDecorator");
        __jsp_taghandler_76.setRequestURI((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestURI}",java.lang.String.class, __ojsp_varRes,null));
        __jsp_taghandler_76.setClass("displaytag");
        __jsp_taghandler_76.setExport(true);
        __jsp_taghandler_76.setUid("row");
        __jsp_taghandler_76.setSort("list");
        java.lang.Object row = null;
        java.lang.Integer row_rowNum = null;
        __jsp_tag_starteval=__jsp_taghandler_76.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          try {
            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_76,__jsp_tag_starteval,out);
            do {
              row = (java.lang.Object) pageContext.findAttribute("row");
              row_rowNum = (java.lang.Integer) pageContext.findAttribute("row_rowNum");
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_77=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                __jsp_taghandler_77.setParent(__jsp_taghandler_76);
                __jsp_taghandler_77.setVar("rojo");
                __jsp_taghandler_77.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idControlCurso == 'CAN' ? 'color: red;font-weight: bold;' : ''}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_77.doStartTag();
                if (__jsp_taghandler_77.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_77,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_78=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_78.setParent(__jsp_taghandler_76);
                __jsp_taghandler_78.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.control eq 'REG_CURSO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_78.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_79=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                      __jsp_taghandler_79.setParent(__jsp_taghandler_78);
                      __jsp_tag_starteval=__jsp_taghandler_79.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                            ");
                          {
                            org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_80=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                            __jsp_taghandler_80.setParent(__jsp_taghandler_79);
                            __jsp_taghandler_80.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.rolAdministradorCapacitacion and (row.idControlCurso == 'REG' || row.idControlCurso == 'PRO' || row.idControlCurso == 'CON')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                            __jsp_tag_starteval=__jsp_taghandler_80.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write("\r\n                                                ");
                                {
                                  org.displaytag.tags.ColumnTag __jsp_taghandler_81=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                                  __jsp_taghandler_81.setParent(__jsp_taghandler_80);
                                  __jsp_taghandler_81.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.idCursos");
                                  __jsp_taghandler_81.setStyle("text-align: center");
                                  __jsp_tag_starteval=__jsp_taghandler_81.doStartTag();
                                  if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                  {
                                    try {
                                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_81,__jsp_tag_starteval,out);
                                      do {
                                        out.write("\r\n                                                    <input name=\"idCursos\" \r\n                                                           class=\"checkbox\"\r\n                                                           type=\"checkbox\" \r\n                                                           value=\"");
                                        {
                                          org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_82=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                          __jsp_taghandler_82.setParent(__jsp_taghandler_81);
                                          __jsp_taghandler_82.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idCursos}",java.lang.Object.class, __ojsp_varRes,null));
                                          __jsp_tag_starteval=__jsp_taghandler_82.doStartTag();
                                          if (__jsp_taghandler_82.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                             throw new javax.servlet.jsp.SkipPageException();
                                          OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_82,10);
                                        }
                                        out.write("\"/>\r\n                                                ");
                                      } while (__jsp_taghandler_81.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                    }
                                    finally {
                                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                    }
                                  }
                                  if (__jsp_taghandler_81.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                     throw new javax.servlet.jsp.SkipPageException();
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_81,9);
                                }
                                out.write("\r\n                                            ");
                              } while (__jsp_taghandler_80.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_80.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_80,8);
                          }
                          out.write("\r\n                                            ");
                          {
                            org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_83=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                            __jsp_taghandler_83.setParent(__jsp_taghandler_79);
                            __jsp_tag_starteval=__jsp_taghandler_83.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write("\r\n                                                ");
                                {
                                  org.displaytag.tags.ColumnTag __jsp_taghandler_84=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey style");
                                  __jsp_taghandler_84.setParent(__jsp_taghandler_83);
                                  __jsp_taghandler_84.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.idCursos");
                                  __jsp_taghandler_84.setStyle((java.lang.String) ("text-align: center;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                                  __jsp_tag_starteval=__jsp_taghandler_84.doStartTag();
                                  if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                  {
                                    try {
                                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_84,__jsp_tag_starteval,out);
                                      do {
                                        out.write(" - ");
                                      } while (__jsp_taghandler_84.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                    }
                                    finally {
                                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                    }
                                  }
                                  if (__jsp_taghandler_84.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                     throw new javax.servlet.jsp.SkipPageException();
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_84,9);
                                }
                                out.write("\r\n                                            ");
                              } while (__jsp_taghandler_83.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_83.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_83,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_79.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_79.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_79,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_78.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_78.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_78,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_85=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_85.setParent(__jsp_taghandler_76);
                __jsp_taghandler_85.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_85.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_86=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_86.setParent(__jsp_taghandler_85);
                      __jsp_taghandler_86.setProperty("coordinacion");
                      __jsp_taghandler_86.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.coordinacion");
                      __jsp_taghandler_86.setSortable(true);
                      __jsp_taghandler_86.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_86.doStartTag();
                      if (__jsp_taghandler_86.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_86,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_85.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_85.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_85,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_87=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_87.setParent(__jsp_taghandler_76);
                __jsp_tag_starteval=__jsp_taghandler_87.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_88=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_88.setParent(__jsp_taghandler_87);
                      __jsp_taghandler_88.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${not empty consultaCursoDTO.linkDestino}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_88.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                            ");
                          {
                            org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_89=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                            __jsp_taghandler_89.setParent(__jsp_taghandler_88);
                            __jsp_tag_starteval=__jsp_taghandler_89.doStartTag();
                            if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                            {
                              do {
                                out.write("\r\n                                                ");
                                {
                                  org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_90=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                                  __jsp_taghandler_90.setParent(__jsp_taghandler_89);
                                  __jsp_taghandler_90.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(row.idControlCurso != 'CAN' && row.idControlCurso != 'CON') || consultaCursoDTO.control ne 'ASIGNAR_PANTICIPANTE'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                                  __jsp_tag_starteval=__jsp_taghandler_90.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    do {
                                      out.write("\r\n                                                    ");
                                      {
                                        org.displaytag.tags.ColumnTag __jsp_taghandler_91=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                                        __jsp_taghandler_91.setParent(__jsp_taghandler_90);
                                        __jsp_taghandler_91.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.curso");
                                        __jsp_taghandler_91.setSortable(true);
                                        __jsp_taghandler_91.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                                        __jsp_tag_starteval=__jsp_taghandler_91.doStartTag();
                                        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                        {
                                          try {
                                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_91,__jsp_tag_starteval,out);
                                            do {
                                              out.write("\r\n                                                        <a href=\"");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_92=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_92.setParent(__jsp_taghandler_91);
                                                __jsp_taghandler_92.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.linkDestino}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_92.doStartTag();
                                                if (__jsp_taghandler_92.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_92,11);
                                              }
                                              out.write("?");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_93=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_93.setParent(__jsp_taghandler_91);
                                                __jsp_taghandler_93.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.paramIdDestino}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_93.doStartTag();
                                                if (__jsp_taghandler_93.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_93,11);
                                              }
                                              out.write("=");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_94=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_94.setParent(__jsp_taghandler_91);
                                                __jsp_taghandler_94.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idCursos}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_94.doStartTag();
                                                if (__jsp_taghandler_94.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_94,11);
                                              }
                                              out.write("\"\r\n                                                           class=\"");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_95=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_95.setParent(__jsp_taghandler_91);
                                                __jsp_taghandler_95.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.idControlCurso == 'CAN' ? 'cancelado' : ''}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_95.doStartTag();
                                                if (__jsp_taghandler_95.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_95,11);
                                              }
                                              out.write("\"\r\n                                                           style=\"");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_96=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_96.setParent(__jsp_taghandler_91);
                                                __jsp_taghandler_96.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_96.doStartTag();
                                                if (__jsp_taghandler_96.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_96,11);
                                              }
                                              out.write("\" title=\"");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_97=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_97.setParent(__jsp_taghandler_91);
                                                __jsp_taghandler_97.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.curso}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_97.doStartTag();
                                                if (__jsp_taghandler_97.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_97,11);
                                              }
                                              out.write("\"><span id=\"descCorta\">");
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_98=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_98.setParent(__jsp_taghandler_91);
                                                __jsp_taghandler_98.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.curso}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_98.doStartTag();
                                                if (__jsp_taghandler_98.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_98,11);
                                              }
                                              out.write("</span></a>\r\n                                                    ");
                                            } while (__jsp_taghandler_91.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                          }
                                          finally {
                                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                          }
                                        }
                                        if (__jsp_taghandler_91.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                           throw new javax.servlet.jsp.SkipPageException();
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_91,10);
                                      }
                                      out.write("\r\n                                                ");
                                    } while (__jsp_taghandler_90.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  }
                                  if (__jsp_taghandler_90.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                     throw new javax.servlet.jsp.SkipPageException();
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_90,9);
                                }
                                out.write("\r\n                                                ");
                                {
                                  org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_99=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                                  __jsp_taghandler_99.setParent(__jsp_taghandler_89);
                                  __jsp_tag_starteval=__jsp_taghandler_99.doStartTag();
                                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                                  {
                                    do {
                                      out.write("\r\n                                                    ");
                                      {
                                        org.displaytag.tags.ColumnTag __jsp_taghandler_100=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable maxLength style");
                                        __jsp_taghandler_100.setParent(__jsp_taghandler_99);
                                        __jsp_taghandler_100.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.curso");
                                        __jsp_taghandler_100.setSortable(true);
                                        __jsp_taghandler_100.setMaxLength(35);
                                        __jsp_taghandler_100.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                                        __jsp_tag_starteval=__jsp_taghandler_100.doStartTag();
                                        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                                        {
                                          try {
                                            out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_100,__jsp_tag_starteval,out);
                                            do {
                                              {
                                                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_101=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                                __jsp_taghandler_101.setParent(__jsp_taghandler_100);
                                                __jsp_taghandler_101.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.curso}",java.lang.Object.class, __ojsp_varRes,null));
                                                __jsp_tag_starteval=__jsp_taghandler_101.doStartTag();
                                                if (__jsp_taghandler_101.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                                   throw new javax.servlet.jsp.SkipPageException();
                                                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_101,11);
                                              }
                                            } while (__jsp_taghandler_100.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                          }
                                          finally {
                                            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                                          }
                                        }
                                        if (__jsp_taghandler_100.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                           throw new javax.servlet.jsp.SkipPageException();
                                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_100,10);
                                      }
                                      out.write("\r\n                                                ");
                                    } while (__jsp_taghandler_99.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                                  }
                                  if (__jsp_taghandler_99.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                     throw new javax.servlet.jsp.SkipPageException();
                                  OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_99,9);
                                }
                                out.write("\r\n                                            ");
                              } while (__jsp_taghandler_89.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                            }
                            if (__jsp_taghandler_89.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_89,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_88.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_88.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_88,7);
                    }
                    out.write("\r\n                                        ");
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_102=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_102.setParent(__jsp_taghandler_87);
                      __jsp_tag_starteval=__jsp_taghandler_102.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n                                            ");
                          {
                            org.displaytag.tags.ColumnTag __jsp_taghandler_103=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable maxLength style");
                            __jsp_taghandler_103.setParent(__jsp_taghandler_102);
                            __jsp_taghandler_103.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.curso");
                            __jsp_taghandler_103.setSortable(true);
                            __jsp_taghandler_103.setMaxLength(35);
                            __jsp_taghandler_103.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_tag_starteval=__jsp_taghandler_103.doStartTag();
                            if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                            {
                              try {
                                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_103,__jsp_tag_starteval,out);
                                do {
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_104=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_104.setParent(__jsp_taghandler_103);
                                    __jsp_taghandler_104.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.curso}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_104.doStartTag();
                                    if (__jsp_taghandler_104.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_104,9);
                                  }
                                } while (__jsp_taghandler_103.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              finally {
                                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                              }
                            }
                            if (__jsp_taghandler_103.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_103,8);
                          }
                          out.write("\r\n                                        ");
                        } while (__jsp_taghandler_102.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_102.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_102,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_87.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_87.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_87,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_105=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_105.setParent(__jsp_taghandler_76);
                __jsp_taghandler_105.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO' && consultaCursoDTO.control ne 'REG_CURSO' && consultaCursoDTO.control ne 'ASIGNAR_PARTICIPANTE' && consultaCursoDTO.control ne 'ASIGNAR_INSTRUCTOR'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_105.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_106=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_106.setParent(__jsp_taghandler_105);
                      __jsp_taghandler_106.setProperty("ejeTematico");
                      __jsp_taghandler_106.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.ejeTematico");
                      __jsp_taghandler_106.setSortable(true);
                      __jsp_taghandler_106.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_106.doStartTag();
                      if (__jsp_taghandler_106.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_106,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_105.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_105.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_105,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_107=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_107.setParent(__jsp_taghandler_76);
                __jsp_taghandler_107.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.control eq 'REG_CURSO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_107.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_108=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable maxLength style");
                      __jsp_taghandler_108.setParent(__jsp_taghandler_107);
                      __jsp_taghandler_108.setProperty("instEducat");
                      __jsp_taghandler_108.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.instEducat");
                      __jsp_taghandler_108.setSortable(true);
                      __jsp_taghandler_108.setMaxLength(35);
                      __jsp_taghandler_108.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_108.doStartTag();
                      if (__jsp_taghandler_108.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_108,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_107.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_107.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_107,6);
              }
              out.write("\r\n                                                    \r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_109=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_109.setParent(__jsp_taghandler_76);
                __jsp_taghandler_109.setProperty("subprograma");
                __jsp_taghandler_109.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.subprograma");
                __jsp_taghandler_109.setSortable(true);
                __jsp_taghandler_109.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_109.doStartTag();
                if (__jsp_taghandler_109.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_109,6);
              }
              out.write("\r\n                                                    \r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_110=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_110.setParent(__jsp_taghandler_76);
                __jsp_taghandler_110.setProperty("duracion");
                __jsp_taghandler_110.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.duracion");
                __jsp_taghandler_110.setSortable(true);
                __jsp_taghandler_110.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_110.doStartTag();
                if (__jsp_taghandler_110.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_110,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_111=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_111.setParent(__jsp_taghandler_76);
                __jsp_taghandler_111.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' or consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_111.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_112=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                      __jsp_taghandler_112.setParent(__jsp_taghandler_111);
                      __jsp_taghandler_112.setProperty("fechaInicio");
                      __jsp_taghandler_112.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.fechaInicio");
                      __jsp_taghandler_112.setSortable(true);
                      __jsp_taghandler_112.setFormat("{0,date,dd/MM/yyyy}");
                      __jsp_taghandler_112.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_112.doStartTag();
                      if (__jsp_taghandler_112.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_112,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_111.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_111.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_111,6);
              }
              out.write("\r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_113=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_113.setParent(__jsp_taghandler_76);
                __jsp_taghandler_113.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' or consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_113.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_114=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable format style");
                      __jsp_taghandler_114.setParent(__jsp_taghandler_113);
                      __jsp_taghandler_114.setProperty("fechaTermino");
                      __jsp_taghandler_114.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.fechaTermino");
                      __jsp_taghandler_114.setSortable(true);
                      __jsp_taghandler_114.setFormat("{0,date,dd/MM/yyyy}");
                      __jsp_taghandler_114.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_114.doStartTag();
                      if (__jsp_taghandler_114.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_114,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_113.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_113.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_113,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_115=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_115.setParent(__jsp_taghandler_76);
                __jsp_taghandler_115.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO' && consultaCursoDTO.control ne 'REG_CURSO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_115.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n\t                                    ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_116=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_116.setParent(__jsp_taghandler_115);
                      __jsp_taghandler_116.setProperty("modalidad");
                      __jsp_taghandler_116.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.modalidad");
                      __jsp_taghandler_116.setSortable(true);
                      __jsp_taghandler_116.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_116.doStartTag();
                      if (__jsp_taghandler_116.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_116,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_115.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_115.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_115,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_117=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_117.setParent(__jsp_taghandler_76);
                __jsp_taghandler_117.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${consultaCursoDTO.control ne 'ASIGNAR_CALENDARIO' && consultaCursoDTO.control ne 'REG_CURSO' && consultaCursoDTO.control ne 'ASIGNAR_PARTICIPANTE' && consultaCursoDTO.control ne 'ASIGNAR_INSTRUCTOR'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_117.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_118=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_118.setParent(__jsp_taghandler_117);
                      __jsp_taghandler_118.setProperty("finalidad");
                      __jsp_taghandler_118.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.finalidad");
                      __jsp_taghandler_118.setSortable(true);
                      __jsp_taghandler_118.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_118.doStartTag();
                      if (__jsp_taghandler_118.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_118,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_117.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_117.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_117,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_119=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_119.setParent(__jsp_taghandler_76);
                __jsp_taghandler_119.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_119.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_120=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag titleKey sortable style");
                      __jsp_taghandler_120.setParent(__jsp_taghandler_119);
                      __jsp_taghandler_120.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.aula");
                      __jsp_taghandler_120.setSortable(true);
                      __jsp_taghandler_120.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_120.doStartTag();
                      if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                      {
                        try {
                          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_120,__jsp_tag_starteval,out);
                          do {
                            out.write("\r\n                                                        <span id=\"descCorta\">");
                            {
                              org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_121=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                              __jsp_taghandler_121.setParent(__jsp_taghandler_120);
                              __jsp_taghandler_121.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${row.aula}",java.lang.Object.class, __ojsp_varRes,null));
                              __jsp_tag_starteval=__jsp_taghandler_121.doStartTag();
                              if (__jsp_taghandler_121.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_121,8);
                            }
                            out.write("</span>\r\n                                        ");
                          } while (__jsp_taghandler_120.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                        }
                        finally {
                          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                        }
                      }
                      if (__jsp_taghandler_120.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_120,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_119.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_119.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_119,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_122=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_122.setParent(__jsp_taghandler_76);
                __jsp_taghandler_122.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_CALENDARIO' or consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_122.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_123=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_123.setParent(__jsp_taghandler_122);
                      __jsp_taghandler_123.setProperty("horario");
                      __jsp_taghandler_123.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.horario");
                      __jsp_taghandler_123.setSortable(true);
                      __jsp_taghandler_123.setStyle("text-align: left");
                      __jsp_tag_starteval=__jsp_taghandler_123.doStartTag();
                      if (__jsp_taghandler_123.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_123,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_122.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_122.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_122,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_124=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_124.setParent(__jsp_taghandler_76);
                __jsp_taghandler_124.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(consultaCursoDTO.rolAdministradorCapacitacion || consultaCursoDTO.rolCoordinacionAdministrativa) && (consultaCursoDTO.control == 'ASIGNAR_PARTICIPANTE' or consultaCursoDTO.control eq 'ASIGNAR_INSTRUCTOR')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_124.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write("\r\n                                        ");
                    {
                      org.displaytag.tags.ColumnTag __jsp_taghandler_125=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                      __jsp_taghandler_125.setParent(__jsp_taghandler_124);
                      __jsp_taghandler_125.setProperty("participantes");
                      __jsp_taghandler_125.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.participantes");
                      __jsp_taghandler_125.setSortable(true);
                      __jsp_taghandler_125.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_tag_starteval=__jsp_taghandler_125.doStartTag();
                      if (__jsp_taghandler_125.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_125,7);
                    }
                    out.write("\r\n                                    ");
                  } while (__jsp_taghandler_124.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_124.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_124,6);
              }
              out.write("\r\n                                    \r\n                                    ");
              {
                org.displaytag.tags.ColumnTag __jsp_taghandler_126=(org.displaytag.tags.ColumnTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.ColumnTag.class,"org.displaytag.tags.ColumnTag property titleKey sortable style");
                __jsp_taghandler_126.setParent(__jsp_taghandler_76);
                __jsp_taghandler_126.setProperty("estatus");
                __jsp_taghandler_126.setTitleKey("sireh.label.spc.capcer.registro.registrarCurso.grid.estatus");
                __jsp_taghandler_126.setSortable(true);
                __jsp_taghandler_126.setStyle((java.lang.String) ("text-align: left;"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${rojo}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_tag_starteval=__jsp_taghandler_126.doStartTag();
                if (__jsp_taghandler_126.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_126,6);
              }
              out.write("\r\n                                                    \r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_127=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_127.setParent(__jsp_taghandler_76);
                __jsp_taghandler_127.setName("paging.banner.placement");
                __jsp_taghandler_127.setValue("bottom");
                __jsp_tag_starteval=__jsp_taghandler_127.doStartTag();
                if (__jsp_taghandler_127.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_127,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_128=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name value");
                __jsp_taghandler_128.setParent(__jsp_taghandler_76);
                __jsp_taghandler_128.setName("export.pdf");
                __jsp_taghandler_128.setValue("true");
                __jsp_tag_starteval=__jsp_taghandler_128.doStartTag();
                if (__jsp_taghandler_128.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_128,6);
              }
              out.write("\r\n                                    ");
              {
                org.displaytag.tags.SetPropertyTag __jsp_taghandler_129=(org.displaytag.tags.SetPropertyTag)OracleJspRuntime.getTagHandler(pageContext,org.displaytag.tags.SetPropertyTag.class,"org.displaytag.tags.SetPropertyTag name");
                __jsp_taghandler_129.setParent(__jsp_taghandler_76);
                __jsp_taghandler_129.setName("basic.msg.empty_list");
                __jsp_tag_starteval=__jsp_taghandler_129.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_129,__jsp_tag_starteval,out);
                    do {
                      out.write("\r\n                                        <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">");
                      {
                        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_130=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                        __jsp_taghandler_130.setParent(__jsp_taghandler_129);
                        __jsp_taghandler_130.setCode("pagedList.empty.content");
                        try {
                          __jsp_tag_starteval=__jsp_taghandler_130.doStartTag();
                          if (__jsp_taghandler_130.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                             throw new javax.servlet.jsp.SkipPageException();
                        } catch (Throwable th) {
                          __jsp_taghandler_130.doCatch(th);
                        } finally {
                          __jsp_taghandler_130.doFinally();
                        }
                        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_130,7);
                      }
                      out.write("<br/><br/></span>\r\n                                    ");
                    } while (__jsp_taghandler_129.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_129.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_129,6);
              }
              out.write("\r\n                                ");
            } while (__jsp_taghandler_76.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          finally {
            out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
          }
        }
        if (__jsp_taghandler_76.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_76,5);
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

  private static final char __oracle_jsp_text[][]=new char[104][];
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
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n    a.cancelado:link {\r\n        background-color: transparent;\r\n        color: red;\r\n        text-decoration: none;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n    \r\n    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[24] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[27] = 
    "</h1>\r\n        ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n    \r\n    <p>&nbsp;</p>\r\n                                \r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\">\r\n                        ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                            <tr align=\"left\">\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[31] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[33] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[34] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[35] = 
    "\r\n                            <tr align=\"left\">\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[36] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[37] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[38] = 
    "\r\n                                </td>\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[39] = 
    ":</td>\r\n                                <td>                                \r\n                                    ".toCharArray();
    __oracle_jsp_text[40] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[41] = 
    "\r\n                                </td>  \r\n                            </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[42] = 
    "\r\n                        \r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[43] = 
    ":</td>\r\n                            <td>                                \r\n                                ".toCharArray();
    __oracle_jsp_text[44] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[45] = 
    "\r\n                            </td>\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[46] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[47] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[48] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        \r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[49] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[50] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[51] = 
    "\r\n                            </td>\r\n                            ".toCharArray();
    __oracle_jsp_text[52] = 
    "\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[53] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[54] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[55] = 
    "\r\n                                </td>\r\n                            ".toCharArray();
    __oracle_jsp_text[56] = 
    "\r\n                        </tr>\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[57] = 
    "\r\n                            <tr align=\"left\">\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[58] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[59] = 
    "\r\n                                </td>\r\n                                <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[60] = 
    ":</td>\r\n                                <td>\r\n                                    ".toCharArray();
    __oracle_jsp_text[61] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        ".toCharArray();
    __oracle_jsp_text[62] = 
    "\r\n                        \r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[63] = 
    ":</td>\r\n                            <td>                                \r\n                                ".toCharArray();
    __oracle_jsp_text[64] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[65] = 
    ":</td>\r\n                            <td>\r\n                                ".toCharArray();
    __oracle_jsp_text[66] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[67] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[68] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                        <tr align=\"center\">\r\n                            <td colspan=\"4\">\r\n                                <table width=\"90%\" border=\"0\" align=\"center\">\r\n                                    <tr>\r\n                                        <td align=\"center\">\r\n                                            ".toCharArray();
    __oracle_jsp_text[69] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[70] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[71] = 
    "&nbsp;\r\n                                                ".toCharArray();
    __oracle_jsp_text[72] = 
    "\r\n                                                ".toCharArray();
    __oracle_jsp_text[73] = 
    "\r\n                                                    ".toCharArray();
    __oracle_jsp_text[74] = 
    "&nbsp;\r\n                                                ".toCharArray();
    __oracle_jsp_text[75] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[76] = 
    "\r\n                                            ".toCharArray();
    __oracle_jsp_text[77] = 
    "\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n    </table>\r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[78] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[79] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[80] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[81] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[82] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[83] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[84] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[85] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[86] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[87] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[88] = 
    "                            \r\n                            ".toCharArray();
    __oracle_jsp_text[89] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[90] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[91] = 
    "\r\n                        \r\n                        ".toCharArray();
    __oracle_jsp_text[92] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[93] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[94] = 
    "\r\n                        <br/><span class=\"pagebanner\">&nbsp;</span><span class=\"norecords\">".toCharArray();
    __oracle_jsp_text[95] = 
    "<br/><br/></span>\r\n                    ".toCharArray();
    __oracle_jsp_text[96] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[97] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>&nbsp;</td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>\r\n                <table width=\"100%\" border=\"0\" align=\"center\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            ".toCharArray();
    __oracle_jsp_text[98] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[99] = 
    "&nbsp;\r\n                            ".toCharArray();
    __oracle_jsp_text[100] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[101] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[102] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[103] = 
    "\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        // Validaciones\r\n        $j(document).ready(function(){            \r\n            $j('.alpha').alpha();\r\n            $j('.alphaEspacios').alpha({allow:\" \"});\r\n            $j('.alphanumeric').alphanumeric();\r\n            $j('.claveCurso').alphanumeric({allow:\"-\"});\r\n            $j('.numeric').numeric();\r\n        });\r\n        \r\n        // PagedList asincrono\r\n        $j(function(){\r\n            $j(\"#displayTagDiv\").displayTagAjax();\r\n        });\r\n        \r\n        // Descripciones cortas\r\n        var span = document.getElementsByTagName('span');\r\n        for (i = 0; i < span.length; i++) {\r\n            if (span[i].id == 'descCorta') {\r\n                var text = span[i].innerHTML;\r\n                if (text != null && text != \"\" && text != \"undefined\") {\r\n                    span[i].innerHTML = text.substring(0, 35) + \"...\";\r\n                }\r\n            }\r\n        }\r\n        \r\n        // Fechas\r\n        function cambioFechas() {\r\n            var onewayIni = $j('#text_cursoFecIni').val();\r\n            var piecesIni = onewayIni.split('/');\r\n            var reversedIni = piecesIni.reverse().join('/');\r\n            $j('#cursoFecIniTxt').val(reversedIni);\r\n            \r\n            var onewayFin = $j('#text_cursoFecFin').val();\r\n            var piecesFin = onewayFin.split('/');\r\n            var reversedFin = piecesFin.reverse().join('/');\r\n            $j('#cursoFecFinTxt').val(reversedFin);\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
