package _web_2d_inf._jsp._servicios;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _curriculumVitae extends com.orionserver.http.OrionHttpJspPage {


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
    _curriculumVitae page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("expLabCVDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("expediente.servicios");
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
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.servico.experienciaLaboral");
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
              out.write(__oracle_jsp_text[8]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_4=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setPath("nombreEmpleado");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expLabCVDTO.muestraReporte}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[10]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_6=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_6.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_6.setJspContext(pageContext);
                      __jsp_taghandler_6.setName("PR_CICLO");
                      __jsp_taghandler_6.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expLabCVDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_6.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
                    }
                    out.write(__oracle_jsp_text[11]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_7=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_7.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_7.setJspContext(pageContext);
                      __jsp_taghandler_7.setName("PR_RFC");
                      __jsp_taghandler_7.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expLabCVDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_7.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
                    }
                    out.write(__oracle_jsp_text[12]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_8=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_8.setParent(__jsp_taghandler_5);
                      __jsp_taghandler_8.setJspContext(pageContext);
                      __jsp_taghandler_8.setProvider("jasper");
                      __jsp_taghandler_8.setViewUri("/constanciaSueldos/Trayectoria_Laboral");
                      __jsp_taghandler_8.setImagesUri("/images/reports");
                      __jsp_taghandler_8.setFormat("pdf");
                      __jsp_taghandler_8.setFileName("Trayectoria_Laboral");
                      __jsp_taghandler_8.setExport("pdf");
                      __jsp_taghandler_8.setWidth("1060");
                      __jsp_taghandler_8.setHeight("350");
                      __jsp_taghandler_8.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
                    }
                    out.write(__oracle_jsp_text[13]);
                  } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[14]);
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
      out.write(__oracle_jsp_text[15]);

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
  private static final char __oracle_jsp_text[][]=new char[16][];
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
    " \r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n    \r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[7] = 
    " &#45;&nbsp;\r\n            ".toCharArray();
    __oracle_jsp_text[8] = 
    " de\r\n            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n        </strong>\r\n    </h1>\r\n    \r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr>\r\n            <td>\r\n                <fieldset>\r\n                    <legend style='font-size:1.2em';>\r\n                        Curriculum vitae\r\n                    </legend>\r\n                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                        <table width=\"90%\" align=\"center\" border=\"0\">\r\n                            <tr>\r\n                                <td align=\"center\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
