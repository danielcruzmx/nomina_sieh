package _web_2d_inf._jsp._expediente._consultas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _consultaGeneral extends com.orionserver.http.OrionHttpJspPage {


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
    _consultaGeneral page = this;
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
        __jsp_taghandler_1.setModelAttribute("expedienteDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[4]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.expediente.consultaGeneral.titulo");
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
              out.write(__oracle_jsp_text[5]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_3=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setJspContext(pageContext);
                __jsp_taghandler_3.setPath("nombreEmp");
                __jsp_taghandler_3.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
              }
              out.write(__oracle_jsp_text[6]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setVar("content0");
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[7]);
                      {
                        String __url=OracleJspRuntime.toStr("../consultas/aviso.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[8]);
                    } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setVar("content1");
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[10]);
                      {
                        String __url=OracleJspRuntime.toStr("../consultas/datosGenerales.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[11]);
                    } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setVar("content2");
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[13]);
                      {
                        String __url=OracleJspRuntime.toStr("../consultas/datosLaboral.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[14]);
                    } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setVar("content3");
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                {
                  try {
                    out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                    do {
                      out.write(__oracle_jsp_text[16]);
                      {
                        String __url=OracleJspRuntime.toStr("../consultas/organigrama.jsp");
                        // Include 
                        pageContext.include( __url,false);
                        if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) return;
                      }

                      out.write(__oracle_jsp_text[17]);
                    } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  finally {
                    out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                  }
                }
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[18]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_8=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setSection("init");
                __jsp_taghandler_8.setType("tab");
                __jsp_taghandler_8.setTabHeight("32");
                __jsp_taghandler_8.setDisplayTime("10");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[19]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_9=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setTitle("Leyenda de Confidencialidad");
                __jsp_taghandler_9.setName("divContent0");
                __jsp_taghandler_9.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content0}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_9.setSelected("true");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[20]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_10=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setTitle("Datos Generales");
                __jsp_taghandler_10.setName("divContent1");
                __jsp_taghandler_10.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content1}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[21]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_11=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setTitle("Datos Laborales");
                __jsp_taghandler_11.setName("divContent2");
                __jsp_taghandler_11.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content2}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[22]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_12=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setTitle("Estructura B&aacute;sica");
                __jsp_taghandler_12.setName("divContent3");
                __jsp_taghandler_12.setContent((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${content3}",java.lang.String.class, __ojsp_varRes,null));
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[23]);
              {
                _oracle._jsp._tag._container_tag __jsp_taghandler_13=(_oracle._jsp._tag._container_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._container_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setSection("final");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[24]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_14=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setJspContext(pageContext);
                __jsp_taghandler_14.setPath("cancel");
                __jsp_taghandler_14.setAction((java.lang.String) ("expediente/"+ (java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.urlOrigen}",java.lang.String.class, __ojsp_varRes, null)));
                __jsp_taghandler_14.setValue("submit.cancel");
                __jsp_taghandler_14.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
              }
              out.write(__oracle_jsp_text[25]);
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
  private static final char __oracle_jsp_text[][]=new char[26][];
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
    "\r\n    <table width=\"100%\">\r\n        <tr align=\"left\">\r\n            <td> <h1> ".toCharArray();
    __oracle_jsp_text[5] = 
    " ".toCharArray();
    __oracle_jsp_text[6] = 
    "</h1> </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[9] = 
    "    \r\n                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "    \r\n               ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[20] = 
    "    \r\n                    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[22] = 
    "\r\n                    ".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n                ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n            </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td align=\"center\">\r\n                ".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">        \r\n        function currentTab(currentDiv) { }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
