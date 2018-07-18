package _web_2d_inf._jsp._nomina._terceros._tercerosnomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _isssterep extends com.orionserver.http.OrionHttpJspPage {


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
    _isssterep page = this;
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
        __jsp_taghandler_1.setModelAttribute("isssterepDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[6]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.nomina.terceros.isssterep.header");
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
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.nomina.terceros.isssterep.qnaIni");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_4=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setKey("");
                __jsp_taghandler_4.setValue("selectList.nonValue");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_5=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setJspContext(pageContext);
                __jsp_taghandler_5.setBeanName("sacaQnasIssste");
                __jsp_taghandler_5.setPath("qnaIni");
                __jsp_taghandler_5.setStyle("width: 200px;");
                __jsp_taghandler_5.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_5, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_6=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setJspContext(pageContext);
                __jsp_taghandler_6.setPath("aceptar");
                __jsp_taghandler_6.setAction("/tercerosNomina/isssterep.do");
                __jsp_taghandler_6.setValue("submit.search");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_7=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setPath("limpiar");
                __jsp_taghandler_7.setAction("/tercerosNomina/isssterep.do");
                __jsp_taghandler_7.setValue("submit.clean");
                __jsp_taghandler_7.setProgressBar("true");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.apache.taglibs.standard.tag.common.core.ChooseTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.common.core.ChooseTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.common.core.ChooseTag.class,"org.apache.taglibs.standard.tag.common.core.ChooseTag");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[16]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.WhenTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.WhenTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.WhenTag.class,"org.apache.taglibs.standard.tag.rt.core.WhenTag test");
                      __jsp_taghandler_9.setParent(__jsp_taghandler_8);
                      __jsp_taghandler_9.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${isssterepDTO.aceptar}",java.lang.Boolean.class, __ojsp_varRes,null)));
                      __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                      if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                      {
                        do {
                          out.write(__oracle_jsp_text[17]);
                          {
                            _oracle._jsp._tag._reportParam_tag __jsp_taghandler_10=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                            __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                            __jsp_taghandler_10.setJspContext(pageContext);
                            __jsp_taghandler_10.setName("P_QNA_PAR");
                            __jsp_taghandler_10.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${isssterepDTO.qnaIni}",java.lang.String.class, __ojsp_varRes,null));
                            __jsp_taghandler_10.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
                          }
                          out.write(__oracle_jsp_text[18]);
                          {
                            _oracle._jsp._tag._report_tag __jsp_taghandler_11=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                            __jsp_taghandler_11.setParent(__jsp_taghandler_9);
                            __jsp_taghandler_11.setJspContext(pageContext);
                            __jsp_taghandler_11.setProvider("jasper");
                            __jsp_taghandler_11.setViewUri("/terceros/cotizaissste");
                            __jsp_taghandler_11.setImagesUri("/images/reports");
                            __jsp_taghandler_11.setFormat("pdf");
                            __jsp_taghandler_11.setFileName("cotizaissste");
                            __jsp_taghandler_11.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                            __jsp_taghandler_11.setWidth("1060");
                            __jsp_taghandler_11.setHeight("350");
                            __jsp_taghandler_11.doTag();
                            OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
                          }
                          out.write(__oracle_jsp_text[19]);
                        } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      }
                      if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,3);
                    }
                    out.write(__oracle_jsp_text[20]);
                    out.write(__oracle_jsp_text[21]);
                    out.write(__oracle_jsp_text[22]);
                    out.write(__oracle_jsp_text[23]);
                  } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,2);
              }
              out.write(__oracle_jsp_text[24]);
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
      out.write(__oracle_jsp_text[25]);

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
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    " \r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n\r\n    <h1>".toCharArray();
    __oracle_jsp_text[7] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table align=\"center\" width=\"100%\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Criterios de B&uacute;squeda</strong></legend>\r\n                    <table width=\"100%\">\r\n                        ".toCharArray();
    __oracle_jsp_text[8] = 
    " \r\n                        <tr align=\"left\">\r\n                            <td align=\"right\" class=\"label\">".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                            <td align=\"left\">\r\n                                ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                            </td>\r\n                        </tr>\r\n\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n        ".toCharArray();
    __oracle_jsp_text[12] = 
    " \r\n        <tr align=\"center\">\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[13] = 
    " &nbsp; ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n            <table>\r\n                <tr>\r\n                    <th align=\"left\"></th>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"left\">\r\n                        ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                        ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n\r\n        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[22] = 
    " \r\n".toCharArray();
    __oracle_jsp_text[23] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[24] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[25] = 
    "\r\n\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
