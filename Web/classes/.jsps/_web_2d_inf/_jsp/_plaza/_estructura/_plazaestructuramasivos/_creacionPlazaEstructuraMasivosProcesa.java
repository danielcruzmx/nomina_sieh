package _web_2d_inf._jsp._plaza._estructura._plazaestructuramasivos;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _creacionPlazaEstructuraMasivosProcesa extends com.orionserver.http.OrionHttpJspPage {


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
    _creacionPlazaEstructuraMasivosProcesa page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("creacionPlazaMasivaDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[5]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_3.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.tipoProceso eq 'C'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[6]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                            __jsp_taghandler_4.setCode("sireh.label.plaza.masivas.conversion.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_4.doCatch(th);
                            } finally {
                              __jsp_taghandler_4.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,4);
                          }
                          out.write(__oracle_jsp_text[7]);
                        } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,3);
                    }
                    out.write(__oracle_jsp_text[8]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.tipoProceso eq 'R'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[9]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_6.setCode("sireh.label.plaza.masivas.reubicacion.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_6.doCatch(th);
                            } finally {
                              __jsp_taghandler_6.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,4);
                          }
                          out.write(__oracle_jsp_text[10]);
                        } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                    }
                    out.write(__oracle_jsp_text[11]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_7.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.tipoProceso eq 'CR'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[12]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                            __jsp_taghandler_8.setCode("sireh.label.plaza.masivas.creacion.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_8.doCatch(th);
                            } finally {
                              __jsp_taghandler_8.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,4);
                          }
                          out.write(__oracle_jsp_text[13]);
                        } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,3);
                    }
                    out.write(__oracle_jsp_text[14]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_9.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.tipoProceso eq 'CA'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[15]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                            __jsp_taghandler_10.setCode("sireh.label.plaza.masivas.cancelacion.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_10.doCatch(th);
                            } finally {
                              __jsp_taghandler_10.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,4);
                          }
                          out.write(__oracle_jsp_text[16]);
                        } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_11.setParent(__jsp_taghandler_2);
                      __jsp_taghandler_11.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.tipoProceso eq 'TR'}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[18]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_12.setCode("sireh.label.plaza.masivas.transferencia.titulo");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_12.doCatch(th);
                            } finally {
                              __jsp_taghandler_12.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,4);
                          }
                          out.write(__oracle_jsp_text[19]);
                        } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                    }
                    out.write(__oracle_jsp_text[20]);
                  } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,2);
              }
              out.write(__oracle_jsp_text[21]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setCode("sireh.label.plaza.masivas.creacion.mensaje.validacion");
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
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_14=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("mensaje");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!creacionPlazaMasivaDTO.archivoValido && !creacionPlazaMasivaDTO.plantillaErronea}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[24]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                      __jsp_taghandler_16.setCode("sireh.label.plaza.masivas.creacion.archivo");
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
                    out.write(__oracle_jsp_text[25]);
                    {
                      _oracle._jsp._tag._link_tag __jsp_taghandler_17=(_oracle._jsp._tag._link_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._link_tag.class, pageContext);
                      __jsp_taghandler_17.setParent(__jsp_taghandler_15);
                      __jsp_taghandler_17.setJspContext(pageContext);
                      __jsp_taghandler_17.setAction("plazaEstructuraMasiva/downloadFile");
                      __jsp_taghandler_17.setParameters((java.lang.String) ("nombreArchivoErrores="+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.nombreArchivoErrores}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_17.setProgressIcon("false");
                      __jsp_taghandler_17.setJspBody(new _creacionPlazaEstructuraMasivosProcesa_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_17, __ojsp_varRes));
                      __jsp_taghandler_17.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
                    }
                    out.write(__oracle_jsp_text[26]);
                  } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[27]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_19=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_19.setParent(__jsp_taghandler_1);
                __jsp_taghandler_19.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.archivoValido}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[28]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_20=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_20.setJspContext(pageContext);
                      __jsp_taghandler_20.setAction((java.lang.String) ("plazaEstructuraMasiva/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_20.setValue("submit.cancel");
                      __jsp_taghandler_20.setProgressBar("true");
                      __jsp_taghandler_20.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_20, pageContext);
                    }
                    out.write(__oracle_jsp_text[29]);
                    {
                      _oracle._jsp._tag._submit_tag __jsp_taghandler_21=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                      __jsp_taghandler_21.setParent(__jsp_taghandler_19);
                      __jsp_taghandler_21.setJspContext(pageContext);
                      __jsp_taghandler_21.setAction((java.lang.String) ("plazaEstructuraMasiva/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.urlDestino}",java.lang.String.class, __ojsp_varRes, null)));
                      __jsp_taghandler_21.setValue("submit.accept");
                      __jsp_taghandler_21.setProgressBar("true");
                      __jsp_taghandler_21.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_21, pageContext);
                    }
                    out.write(__oracle_jsp_text[30]);
                  } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,2);
              }
              out.write(__oracle_jsp_text[31]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_22=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path");
                __jsp_taghandler_22.setParent(__jsp_taghandler_1);
                __jsp_taghandler_22.setPath("nombreArchivoErrores");
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
              out.write(__oracle_jsp_text[32]);
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

  private class _creacionPlazaEstructuraMasivosProcesa_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _creacionPlazaEstructuraMasivosProcesa_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_17       = parent;
      out.write("\r\n                  ");
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_18.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_17));
        __jsp_taghandler_18.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${creacionPlazaMasivaDTO.nombreArchivoErrores}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
        if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,4);
      }
      out.write("\r\n                ");
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

  private static final char __oracle_jsp_text[][]=new char[33][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[7] = 
    "</h1>  \r\n        ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[10] = 
    "</h1>  \r\n        ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[13] = 
    "</h1>  \r\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[16] = 
    "</h1>  \r\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n            <h1>".toCharArray();
    __oracle_jsp_text[19] = 
    "</h1>  \r\n        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n    <p>&nbsp;</p>\r\n    <table width=\"80%\">\r\n         <tr>   \r\n            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[22] = 
    "</td>\r\n            <td>".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>            \r\n        </tr>\r\n        ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n         <tr>   \r\n            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[25] = 
    "</td>\r\n            <td>".toCharArray();
    __oracle_jsp_text[26] = 
    "</td>            \r\n        </tr>        \r\n        ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n    </table>\r\n    ".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n    <table width=\"80%\">\r\n        <tr>\r\n                <td  align=\"center\">\r\n                    ".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n                </td>\r\n        </tr>\r\n    </table>\r\n    ".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
