package _web_2d_inf._jsp._merito;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _procesarNmResultado extends com.orionserver.http.OrionHttpJspPage {


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
    _procesarNmResultado page = this;
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
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute method enctype");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setModelAttribute("procesoNmDTO");
        __jsp_taghandler_2.setMethod("post");
        __jsp_taghandler_2.setEnctype("multipart/form-data");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setCode("sireh.proceso.nm.titulo");
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
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[8]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${procesoNmDTO.tdNmrCveCausal == 3}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[9]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                            __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_6.setText("Notas de M&eacute;rito");
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
                          {
                            org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                            __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_7.setCode("acierto.jpg");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_7.doCatch(th);
                            } finally {
                              __jsp_taghandler_7.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,4);
                          }
                          out.write(__oracle_jsp_text[11]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                            __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_8.setText(" Puntualidad");
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
                          out.write(__oracle_jsp_text[12]);
                          {
                            _oracle._jsp._tag._label_tag __jsp_taghandler_9=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                            __jsp_taghandler_9.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_9.setJspContext(pageContext);
                            __jsp_taghandler_9.setPath("regreso");
                            __jsp_taghandler_9.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
                          }
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_10.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_10.setCode("sireh.proceso.nm.resultado");
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
                          out.write(__oracle_jsp_text[13]);
                        } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,3);
                    }
                    out.write(__oracle_jsp_text[14]);
                    {
                      org.apache.taglibs.standard.tag.common.core.OtherwiseTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.common.core.OtherwiseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class,"org.apache.taglibs.standard.tag.common.core.OtherwiseTag");
                      __jsp_taghandler_11.setParent(__jsp_taghandler_4);
                      __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[15]);
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                            __jsp_taghandler_12.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_12.setText("Notas de M&eacute;rito");
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
                          out.write(__oracle_jsp_text[16]);
                          {
                            org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_13=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                            __jsp_taghandler_13.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_13.setCode("capacitacion.jpg");
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
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                            __jsp_taghandler_14.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_14.setText("Capacitaci&oacute;n");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                              if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                return;
                            } catch (Throwable th) {
                              __jsp_taghandler_14.doCatch(th);
                            } finally {
                              __jsp_taghandler_14.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,4);
                          }
                          out.write(__oracle_jsp_text[18]);
                          {
                            _oracle._jsp._tag._label_tag __jsp_taghandler_15=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                            __jsp_taghandler_15.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_15.setJspContext(pageContext);
                            __jsp_taghandler_15.setPath("regreso");
                            __jsp_taghandler_15.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                          }
                          {
                            org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                            __jsp_taghandler_16.setParent(__jsp_taghandler_11);
                            __jsp_taghandler_16.setCode("sireh.proceso.nm.resultado");
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
                        } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                    }
                    out.write(__oracle_jsp_text[20]);
                  } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[21]);
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
  private static final char __oracle_jsp_text[][]=new char[22][];
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
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n<h1>".toCharArray();
    __oracle_jsp_text[7] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    <table align=\"center\" width=\"70%\" border=\"0\">\r\n        <tr>\r\n            <td align=\"center\">\r\n                <fieldset>\r\n                    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                            <legend>\r\n                                <strong>".toCharArray();
    __oracle_jsp_text[10] = 
    "</strong>\r\n                                <img class=\"fotografia\" width=\"55\" src=\"".toCharArray();
    __oracle_jsp_text[11] = 
    "\" align=\"middle\"/>       \r\n                                <strong>".toCharArray();
    __oracle_jsp_text[12] = 
    "</strong>\r\n                            </legend> \r\n                            <table width=\"80%\">\r\n                                <tr><td align=\"center\">".toCharArray();
    __oracle_jsp_text[13] = 
    "</td></tr>\r\n                             </table>\r\n                        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                            <legend>\r\n                                <strong>".toCharArray();
    __oracle_jsp_text[16] = 
    "</strong>\r\n                                <img class=\"fotografia\" width=\"60\" src=\"".toCharArray();
    __oracle_jsp_text[17] = 
    "\" align=\"middle\"/>       \r\n                                <strong>".toCharArray();
    __oracle_jsp_text[18] = 
    "</strong>\r\n                            </legend>\r\n                            <table width=\"80%\">\r\n                                <tr><td align=\"center\">".toCharArray();
    __oracle_jsp_text[19] = 
    "</td></tr>\r\n                             </table>\r\n                        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n            </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
