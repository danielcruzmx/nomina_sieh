package _web_2d_inf._jsp._merito;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _resultadoArchivoCapacitacion extends com.orionserver.http.OrionHttpJspPage {


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
    _resultadoArchivoCapacitacion page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code var");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setCode("selectList.nonValue");
        __jsp_taghandler_1.setVar("nonValue");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setModelAttribute("notaDeMeritoDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setCode("sireh.label.merito.archivoCapacitacion.titulo.resultado");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setText("Notas de Merito");
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
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_taghandler_5.setCode("capacitacion.jpg");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                __jsp_taghandler_6.setText("Capacitaci&oacute;n");
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
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                __jsp_taghandler_7.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!notaDeMeritoDTO.plantillaErronea}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[11]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_8.setParent(__jsp_taghandler_7);
                      __jsp_taghandler_8.setCode("sireh.label.merito.archivo.notas.correctas");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_8.doCatch(th);
                      } finally {
                        __jsp_taghandler_8.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,3);
                    }
                    out.write(__oracle_jsp_text[12]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_9=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_9.setParent(__jsp_taghandler_7);
                      __jsp_taghandler_9.setJspContext(pageContext);
                      __jsp_taghandler_9.setPath("numeroNotasMeritoCorrectas");
                      __jsp_taghandler_9.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
                    }
                    out.write(__oracle_jsp_text[13]);
                    {
                      org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                      __jsp_taghandler_10.setParent(__jsp_taghandler_7);
                      __jsp_taghandler_10.setCode("sireh.label.merito.archivo.notas.incorrectas");
                      try {
                        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                          return;
                      } catch (Throwable th) {
                        __jsp_taghandler_10.doCatch(th);
                      } finally {
                        __jsp_taghandler_10.doFinally();
                      }
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,3);
                    }
                    out.write(__oracle_jsp_text[14]);
                    {
                      _oracle._jsp._tag._label_tag __jsp_taghandler_11=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                      __jsp_taghandler_11.setParent(__jsp_taghandler_7);
                      __jsp_taghandler_11.setJspContext(pageContext);
                      __jsp_taghandler_11.setPath("numeroNotasMeritoIncorrectas");
                      __jsp_taghandler_11.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
                    }
                    out.write(__oracle_jsp_text[15]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_12.setParent(__jsp_taghandler_7);
                      __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${notaDeMeritoDTO.numeroNotasMeritoIncorrectas > 0}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[16]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_13.setCode("sireh.label.merito.archivo.notas.incorrectas");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_13.doCatch(th);
                            } finally {
                              __jsp_taghandler_13.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,4);
                          }
                          out.write(__oracle_jsp_text[17]);
                          {
                            _oracle._jsp._tag._link_tag __jsp_taghandler_14=(_oracle._jsp._tag._link_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._link_tag.class, pageContext);
                            __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_14.setJspContext(pageContext);
                            __jsp_taghandler_14.setAction("notaDeMerito/downloadFile");
                            __jsp_taghandler_14.setParameters((java.lang.String) ("nombreArchivoErrores="+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${notaDeMeritoDTO.nombreArchivoErrores}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_taghandler_14.setProgressIcon("false");
                            __jsp_taghandler_14.setJspBody(new _resultadoArchivoCapacitacion_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_14, __ojsp_varRes));
                            __jsp_taghandler_14.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                          }
                          out.write(__oracle_jsp_text[18]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_16.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_16.setCode("sireh.label.merito.archivo.concentrado");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_16.doCatch(th);
                            } finally {
                              __jsp_taghandler_16.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,4);
                          }
                          out.write(__oracle_jsp_text[19]);
                          {
                            _oracle._jsp._tag._link_tag __jsp_taghandler_17=(_oracle._jsp._tag._link_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._link_tag.class, pageContext);
                            __jsp_taghandler_17.setParent(__jsp_taghandler_12);
                            __jsp_taghandler_17.setJspContext(pageContext);
                            __jsp_taghandler_17.setAction("notaDeMerito/downloadFileCon");
                            __jsp_taghandler_17.setParameters((java.lang.String) ("nombreArchivoConcent="+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${notaDeMeritoDTO.nombreArchivoConcent}",java.lang.String.class, __ojsp_varRes, null)));
                            __jsp_taghandler_17.setProgressIcon("false");
                            __jsp_taghandler_17.setJspBody(new _resultadoArchivoCapacitacion_OjspFragmentSupport( 1, pageContext, __jsp_taghandler_17, __ojsp_varRes));
                            __jsp_taghandler_17.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_17, pageContext);
                          }
                          out.write(__oracle_jsp_text[20]);
                        } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                    }
                    out.write(__oracle_jsp_text[21]);
                  } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_19=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_19.setParent(__jsp_taghandler_2);
                __jsp_taghandler_19.setJspContext(pageContext);
                __jsp_taghandler_19.setPath("mensaje");
                __jsp_taghandler_19.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_19, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
            } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          }
          if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_2.doCatch(th);
        } finally {
          __jsp_taghandler_2.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
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

  private class _resultadoArchivoCapacitacion_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _resultadoArchivoCapacitacion_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_14       = parent;
      out.write("\r\n                                              ");
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_15.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_14));
        __jsp_taghandler_15.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${notaDeMeritoDTO.nombreArchivoErrores}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,5);
      }
      out.write("\r\n                                            ");
      return;
    }

      
    public void invoke1(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_17       = parent;
      out.write("\r\n                                              ");
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_18.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_17));
        __jsp_taghandler_18.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${notaDeMeritoDTO.nombreArchivoConcent}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
        if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,5);
      }
      out.write("\r\n                                            ");
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
          case 1:
            invoke1( out );
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

  private static final char __oracle_jsp_text[][]=new char[24][];
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
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n<h1>".toCharArray();
    __oracle_jsp_text[7] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n        \r\n        <table align=\"center\" width=\"70%\" border=\"0\">\r\n            <tr>\r\n                <td align=\"center\">\r\n                    <fieldset>\r\n                        <legend>\r\n                            <strong>".toCharArray();
    __oracle_jsp_text[8] = 
    "</strong>\r\n                            <img class=\"fotografia\" width=\"60\" src=\"".toCharArray();
    __oracle_jsp_text[9] = 
    "\" align=\"middle\"/>       \r\n                            <strong>".toCharArray();
    __oracle_jsp_text[10] = 
    "</strong>\r\n                        </legend>\r\n                        \r\n                        <table width=\"90%\">\r\n                            ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                <tr align=\"left\">\r\n                                    <td class=\"label\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                                    <td align=\"left\">".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                                </tr>\r\n                                <tr align=\"left\">\r\n                                    <td class=\"label\">".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                                    <td align=\"left\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                                </tr>\r\n                                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                    <tr align=\"left\">\r\n                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[17] = 
    "</td>\r\n                                        <td align=\"left\">".toCharArray();
    __oracle_jsp_text[18] = 
    "</td>\r\n                                    </tr>\r\n                                    <tr align=\"left\">\r\n                                        <td class=\"label\">".toCharArray();
    __oracle_jsp_text[19] = 
    "</td>\r\n                                        <td align=\"left\">".toCharArray();
    __oracle_jsp_text[20] = 
    "</td>\r\n                                    </tr>\r\n                                ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                                <tr><td>&nbsp;</td></tr>\r\n                            ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                            <tr>\r\n                                <td rowspan=\"2\">".toCharArray();
    __oracle_jsp_text[23] = 
    "</td>\r\n                            </tr>\r\n                        </table>\r\n                        \r\n                    </fieldset>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n        \r\n \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
