package _web_2d_inf._jsp._layout;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _message extends com.orionserver.http.OrionHttpJspPage {


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
    _message page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.rt.core.UrlTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.UrlTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.UrlTag.class,"org.apache.taglibs.standard.tag.rt.core.UrlTag var value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("contextPath");
        __jsp_taghandler_1.setValue("/");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        _oracle._jsp._tag._bindErrors_tag __jsp_taghandler_2=(_oracle._jsp._tag._bindErrors_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._bindErrors_tag.class, pageContext);
        __jsp_taghandler_2.setJspContext(pageContext);
        __jsp_taghandler_2.setPath("*.*");
        __jsp_taghandler_2.setJspBody(new _message_OjspFragmentSupport( 0, pageContext, __jsp_taghandler_2, __ojsp_varRes));
        __jsp_taghandler_2.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_2, pageContext);
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!empty errors}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[5]);
            {
              org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_11=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
              __jsp_taghandler_11.setParent(__jsp_taghandler_10);
              __jsp_taghandler_11.setCode("error.gif");
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
            out.write(__oracle_jsp_text[6]);
            {
              org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
              __jsp_taghandler_12.setParent(__jsp_taghandler_10);
              __jsp_taghandler_12.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${errors}",java.lang.Object.class, __ojsp_varRes,null));
              __jsp_taghandler_12.setVar("errorItem");
              try {
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[7]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_13.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${errorItem}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                      if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                    }
                    out.write(__oracle_jsp_text[8]);
                  } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
              } catch (Throwable th) {
                __jsp_taghandler_12.doCatch(th);
              } finally {
                __jsp_taghandler_12.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
            }
            out.write(__oracle_jsp_text[9]);
          } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_14=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_14.setParent(null);
        __jsp_taghandler_14.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${empty errors && empty bindErrors}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write(__oracle_jsp_text[11]);
            {
              org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
              __jsp_taghandler_15.setParent(__jsp_taghandler_14);
              __jsp_taghandler_15.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!empty requestScope['javax.servlet.error.exception']}",java.lang.Boolean.class, __ojsp_varRes,null)));
              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[12]);
                  {
                    org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_16=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                    __jsp_taghandler_16.setParent(__jsp_taghandler_15);
                    __jsp_taghandler_16.setCode("error.gif");
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
                  out.write(__oracle_jsp_text[13]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_17=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                    __jsp_taghandler_17.setParent(__jsp_taghandler_15);
                    __jsp_taghandler_17.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${requestScope['javax.servlet.error.exception']}",java.lang.Object.class, __ojsp_varRes,null));
                    __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                    if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17,3);
                  }
                  out.write(__oracle_jsp_text[14]);
                } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
            }
            out.write(__oracle_jsp_text[15]);
            {
              org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_18=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
              __jsp_taghandler_18.setParent(__jsp_taghandler_14);
              __jsp_taghandler_18.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!empty warnings}",java.lang.Boolean.class, __ojsp_varRes,null)));
              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[16]);
                  {
                    org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_19=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                    __jsp_taghandler_19.setParent(__jsp_taghandler_18);
                    __jsp_taghandler_19.setCode("warn.gif");
                    try {
                      __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
                      if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                    } catch (Throwable th) {
                      __jsp_taghandler_19.doCatch(th);
                    } finally {
                      __jsp_taghandler_19.doFinally();
                    }
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19,3);
                  }
                  out.write(__oracle_jsp_text[17]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_20=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
                    __jsp_taghandler_20.setParent(__jsp_taghandler_18);
                    __jsp_taghandler_20.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${warnings}",java.lang.Object.class, __ojsp_varRes,null));
                    __jsp_taghandler_20.setVar("warningItem");
                    try {
                      __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[18]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_21=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_21.setParent(__jsp_taghandler_20);
                            __jsp_taghandler_21.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${warningItem}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
                            if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21,4);
                          }
                          out.write(__oracle_jsp_text[19]);
                        } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                    } catch (Throwable th) {
                      __jsp_taghandler_20.doCatch(th);
                    } finally {
                      __jsp_taghandler_20.doFinally();
                    }
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20,3);
                  }
                  out.write(__oracle_jsp_text[20]);
                } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18,2);
            }
            out.write(__oracle_jsp_text[21]);
            {
              org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_22=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
              __jsp_taghandler_22.setParent(__jsp_taghandler_14);
              __jsp_taghandler_22.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!empty messages}",java.lang.Boolean.class, __ojsp_varRes,null)));
              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                  out.write(__oracle_jsp_text[22]);
                  {
                    org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_23=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                    __jsp_taghandler_23.setParent(__jsp_taghandler_22);
                    __jsp_taghandler_23.setCode("info.gif");
                    try {
                      __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
                      if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                    } catch (Throwable th) {
                      __jsp_taghandler_23.doCatch(th);
                    } finally {
                      __jsp_taghandler_23.doFinally();
                    }
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23,3);
                  }
                  out.write(__oracle_jsp_text[23]);
                  {
                    org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_24=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
                    __jsp_taghandler_24.setParent(__jsp_taghandler_22);
                    __jsp_taghandler_24.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${messages}",java.lang.Object.class, __ojsp_varRes,null));
                    __jsp_taghandler_24.setVar("messageItem");
                    try {
                      __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[24]);
                          {
                            org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_25=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                            __jsp_taghandler_25.setParent(__jsp_taghandler_24);
                            __jsp_taghandler_25.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${messageItem}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
                            if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                              return;
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25,4);
                          }
                          out.write(__oracle_jsp_text[25]);
                        } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                    } catch (Throwable th) {
                      __jsp_taghandler_24.doCatch(th);
                    } finally {
                      __jsp_taghandler_24.doFinally();
                    }
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24,3);
                  }
                  out.write(__oracle_jsp_text[26]);
                } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22,2);
            }
            out.write(__oracle_jsp_text[27]);
          } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14,1);
      }
      out.write(__oracle_jsp_text[28]);
      {
        org.apache.taglibs.standard.tag.common.core.RemoveTag __jsp_taghandler_26=(org.apache.taglibs.standard.tag.common.core.RemoveTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.RemoveTag.class,"org.apache.taglibs.standard.tag.common.core.RemoveTag var");
        __jsp_taghandler_26.setParent(null);
        __jsp_taghandler_26.setVar("errors");
        __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
        if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26,1);
      }
      out.write(__oracle_jsp_text[29]);
      {
        org.apache.taglibs.standard.tag.common.core.RemoveTag __jsp_taghandler_27=(org.apache.taglibs.standard.tag.common.core.RemoveTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.RemoveTag.class,"org.apache.taglibs.standard.tag.common.core.RemoveTag var");
        __jsp_taghandler_27.setParent(null);
        __jsp_taghandler_27.setVar("javax.servlet.error.exception");
        __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
        if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27,1);
      }
      out.write(__oracle_jsp_text[30]);
      {
        org.apache.taglibs.standard.tag.common.core.RemoveTag __jsp_taghandler_28=(org.apache.taglibs.standard.tag.common.core.RemoveTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.RemoveTag.class,"org.apache.taglibs.standard.tag.common.core.RemoveTag var");
        __jsp_taghandler_28.setParent(null);
        __jsp_taghandler_28.setVar("warnings");
        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28,1);
      }
      out.write(__oracle_jsp_text[31]);
      {
        org.apache.taglibs.standard.tag.common.core.RemoveTag __jsp_taghandler_29=(org.apache.taglibs.standard.tag.common.core.RemoveTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.RemoveTag.class,"org.apache.taglibs.standard.tag.common.core.RemoveTag var");
        __jsp_taghandler_29.setParent(null);
        __jsp_taghandler_29.setVar("messages");
        __jsp_tag_starteval=__jsp_taghandler_29.doStartTag();
        if (__jsp_taghandler_29.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_29,1);
      }
      out.write(__oracle_jsp_text[32]);

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

  private class _message_OjspFragmentSupport
      extends oracle.jsp.runtime.OracleJspFragmentBase
  {
    private javax.servlet.jsp.tagext.JspTag parent;
    int __jsp_tag_starteval;
    public _message_OjspFragmentSupport(int fragId, JspContext jspContext, javax.servlet.jsp.tagext.JspTag parent, VariableResolver ojsp_varRes) {
      super(fragId, jspContext, parent, ojsp_varRes);
      this.parent = parent;
    }
      
    public void invoke0(JspWriter out )
      throws Throwable
    {
      javax.servlet.jsp.tagext.JspTag       __jsp_taghandler_2       = parent;
      out.write("<!-- Todos los objetos, todas sus propiedades -->\r\n");
      {
        org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
        __jsp_taghandler_3.setParent( new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) __jsp_taghandler_2));
        __jsp_taghandler_3.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${!empty resolvedPath}",java.lang.Boolean.class, __ojsp_varRes,null)));
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            out.write("\r\n  ");
            {
              org.springframework.web.servlet.tags.BindTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.BindTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.BindTag.class,"org.springframework.web.servlet.tags.BindTag path");
              __jsp_taghandler_4.setParent(__jsp_taghandler_3);
              __jsp_taghandler_4.setPath((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${resolvedPath}",java.lang.String.class, __ojsp_varRes,null));
              org.springframework.web.servlet.support.BindStatus status = null;
              try {
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
                    out.write("\r\n    ");
                    {
                      org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                      __jsp_taghandler_5.setParent(__jsp_taghandler_4);
                      __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.error}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write("\r\n      <table width=\"100%\">\r\n        <tr align=\"center\">\r\n          <td>\r\n            <table class=\"message\">\r\n              <tr>\r\n                <td class=\"error\"><img src=\"");
                          {
                            org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                            __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_6.setCode("error.gif");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                            } catch (Throwable th) {
                              __jsp_taghandler_6.doCatch(th);
                            } finally {
                              __jsp_taghandler_6.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,5);
                          }
                          out.write("\" alt=\"error\" width=\"30\" height=\"30\"></td>\r\n                <td>\r\n                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                    ");
                          {
                            org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
                            __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_7.setVar("bindErrors");
                            __jsp_taghandler_7.setValue("true");
                            __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                            if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                               throw new javax.servlet.jsp.SkipPageException();
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,5);
                          }
                          out.write("\r\n                    ");
                          {
                            org.apache.taglibs.standard.tag.rt.core.ForEachTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.ForEachTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.ForEachTag.class,"org.apache.taglibs.standard.tag.rt.core.ForEachTag items var");
                            __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                            __jsp_taghandler_8.setItems((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${status.errorMessages}",java.lang.Object.class, __ojsp_varRes,null));
                            __jsp_taghandler_8.setVar("error");
                            try {
                              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                              {
                                do {
                                  out.write("\r\n                      <tr><td>\r\n                        ");
                                  {
                                    org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                                    __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                                    __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${error}",java.lang.Object.class, __ojsp_varRes,null));
                                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                       throw new javax.servlet.jsp.SkipPageException();
                                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,6);
                                  }
                                  out.write("<br/>\r\n                      </td></tr>\r\n                    ");
                                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                              }
                              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                                 throw new javax.servlet.jsp.SkipPageException();
                            } catch (Throwable th) {
                              __jsp_taghandler_8.doCatch(th);
                            } finally {
                              __jsp_taghandler_8.doFinally();
                            }
                            OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,5);
                          }
                          out.write("\r\n                  </table>\r\n                </td>\r\n              </tr>\r\n            </table>\r\n          </td>\r\n        </tr>\r\n      </table>    \r\n    ");
                        } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                         throw new javax.servlet.jsp.SkipPageException();
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,4);
                    }
                    out.write("\r\n  ");
                  } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                   throw new javax.servlet.jsp.SkipPageException();
              } catch (Throwable th) {
                __jsp_taghandler_4.doCatch(th);
              } finally {
                __jsp_taghandler_4.doFinally();
              }
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
            }
            out.write("\r\n");
          } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
           throw new javax.servlet.jsp.SkipPageException();
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
      }
      out.write("\r\n");
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
    "\r\n\r\n<div id=\"messages\">\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n  <table width=\"100%\">\r\n    <tr align=\"center\">\r\n      <td>\r\n        <table class=\"message\">\r\n          <tr>\r\n            <td class=\"error\"><img src=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "\" alt=\"error\" width=\"30\" height=\"30\"></td>\r\n            <td>\r\n             <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n              ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n                <tr><td>\r\n                  ".toCharArray();
    __oracle_jsp_text[8] = 
    "</br>\r\n                </td></tr>\r\n              ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n             </table>\r\n            </td>\r\n          </tr>\r\n        </table>\r\n      </td>\r\n    </tr>\r\n  </table>    \r\n".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n  ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n    <table width=\"100%\">\r\n      <tr align=\"center\">\r\n        <td>\r\n          <table class=\"message\">\r\n            <tr>\r\n              <td class=\"error\"><img src=\"".toCharArray();
    __oracle_jsp_text[13] = 
    "\" alt=\"error\" width=\"30\" height=\"30\"></td>\r\n              <td>\r\n               <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                  <tr><td>\r\n                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                  </td></tr>\r\n               </table>\r\n              </td>\r\n            </tr>\r\n          </table>\r\n        </td>\r\n      </tr>\r\n    </table>\r\n  ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n  ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n    <table width=\"100%\">\r\n       <tr align=\"center\">\r\n         <td>\r\n           <table class=\"message\">\r\n             <tr>\r\n               <td class=\"warn\"><img src=\"".toCharArray();
    __oracle_jsp_text[17] = 
    "\" alt=\"warn\" width=\"30\" height=\"30\"></td>\r\n               <td>\r\n                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                 ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                  <tr><td>\r\n                    ".toCharArray();
    __oracle_jsp_text[19] = 
    "</br>\r\n                  </td></tr>\r\n                 ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n                </table>\r\n               </td>\r\n             </tr>\r\n           </table>\r\n         </td>\r\n       </tr>\r\n    </table>\r\n  ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n  ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n    <table width=\"100%\">\r\n       <tr align=\"center\">\r\n         <td>\r\n           <table class=\"message\">\r\n             <tr>\r\n               <td class=\"info\"><img src=\"".toCharArray();
    __oracle_jsp_text[23] = 
    "\" alt=\"info\" width=\"30\" height=\"30\"></td>\r\n               <td>\r\n                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                 ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n                  <tr><td>\r\n                    ".toCharArray();
    __oracle_jsp_text[25] = 
    "</br>\r\n                  </td></tr>\r\n                 ".toCharArray();
    __oracle_jsp_text[26] = 
    "\r\n                </table>\r\n               </td>\r\n             </tr>\r\n           </table>\r\n         </td>\r\n       </tr>\r\n    </table>\r\n  ".toCharArray();
    __oracle_jsp_text[27] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[28] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[29] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[30] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[31] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[32] = 
    "\r\n</div>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
