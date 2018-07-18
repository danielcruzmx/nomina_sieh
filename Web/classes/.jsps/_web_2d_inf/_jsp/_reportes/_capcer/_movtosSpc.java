package _web_2d_inf._jsp._reportes._capcer;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _movtosSpc extends com.orionserver.http.OrionHttpJspPage {


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
    _movtosSpc page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("reportesCapcerDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.spc.capcer.reportes.general.movtosSpc.title");
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
                _oracle._jsp._tag._option_tag __jsp_taghandler_3=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setJspContext(pageContext);
                __jsp_taghandler_3.setKey("0");
                __jsp_taghandler_3.setValue("selectList.nonValue");
                __jsp_taghandler_3.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
              }
              out.write(__oracle_jsp_text[7]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_4=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setJspContext(pageContext);
                __jsp_taghandler_4.setBeanName("listaQuincenasAnteriores");
                __jsp_taghandler_4.setPath("quincena");
                __jsp_taghandler_4.setProgress("true");
                __jsp_taghandler_4.setStyle("width: 100px;");
                __jsp_taghandler_4.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_4, pageContext);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.spc.capcer.reportes.movtospc");
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
                org.springframework.web.servlet.tags.form.SelectTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.SelectTag.class,"org.springframework.web.servlet.tags.form.SelectTag path");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("tipo");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[10]);
                    } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
                  if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                    return;
                } catch (Throwable th) {
                  __jsp_taghandler_6.doCatch(th);
                } finally {
                  __jsp_taghandler_6.doFinally();
                }
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_7=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setPath("muestraReporte");
                __jsp_taghandler_7.setAction("reportesCursoSPC/movtosSpc.do");
                __jsp_taghandler_7.setValue("submit.accept");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_8=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setPath("cancel");
                __jsp_taghandler_8.setAction("reportesCursoSPC/movtosSpc.do");
                __jsp_taghandler_8.setValue("submit.cancel");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesCapcerDTO.quincena != null && reportesCapcerDTO.tipo == 'B')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[14]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_10=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                      __jsp_taghandler_10.setJspContext(pageContext);
                      __jsp_taghandler_10.setName("P_QNA_CAPTURA");
                      __jsp_taghandler_10.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesCapcerDTO.quincena}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_10.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
                    }
                    out.write(__oracle_jsp_text[15]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_11=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_11.setParent(__jsp_taghandler_9);
                      __jsp_taghandler_11.setJspContext(pageContext);
                      __jsp_taghandler_11.setProvider("jasper");
                      __jsp_taghandler_11.setViewUri("/capcer/bajasSpc");
                      __jsp_taghandler_11.setImagesUri("/images/reports");
                      __jsp_taghandler_11.setFormat("pdf");
                      __jsp_taghandler_11.setFileName("bajasSpc");
                      __jsp_taghandler_11.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_11.setWidth("1060");
                      __jsp_taghandler_11.setHeight("350");
                      __jsp_taghandler_11.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
                    }
                    out.write(__oracle_jsp_text[16]);
                  } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${(reportesCapcerDTO.quincena != null && reportesCapcerDTO.tipo == 'P')}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[18]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_13=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_13.setJspContext(pageContext);
                      __jsp_taghandler_13.setName("P_QNA_CAPTURA");
                      __jsp_taghandler_13.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${reportesCapcerDTO.quincena}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_13.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                    }
                    out.write(__oracle_jsp_text[19]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_14=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_14.setJspContext(pageContext);
                      __jsp_taghandler_14.setProvider("jasper");
                      __jsp_taghandler_14.setViewUri("/capcer/promocionesSpc");
                      __jsp_taghandler_14.setImagesUri("/images/reports");
                      __jsp_taghandler_14.setFormat("pdf");
                      __jsp_taghandler_14.setFileName("promocionesSpc");
                      __jsp_taghandler_14.setExport("xls,pdf,csv,rtf,xml,docx,pptx,txt");
                      __jsp_taghandler_14.setWidth("1060");
                      __jsp_taghandler_14.setHeight("350");
                      __jsp_taghandler_14.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                    }
                    out.write(__oracle_jsp_text[20]);
                  } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[21]);
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
      out.write(__oracle_jsp_text[22]);

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
  private static final char __oracle_jsp_text[][]=new char[23][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\n\n\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\n    \n    <h1>".toCharArray();
    __oracle_jsp_text[6] = 
    "</h1>\n    <p>&nbsp;</p>\n    \n    <table width=\"100%\" align=\"center\" border=\"0\">\n        <tr>\n            <td>\n                <fieldset>\n                    <legend style=\"font-size:1.3em\"><strong>Filtros de busqueda</strong></legend>\n                    <table width=\"100%\" align=\"center\" border=\"0\">\n                        <tr> <td colspan=\"2\">&nbsp;</td> </tr>\n                        <tr> \n                            <td align=\"right\" class=\"label\" width=\"20%\">* Quincena</td>\n                            <td align=\"left\" colspan=\"2\">\n                                ".toCharArray();
    __oracle_jsp_text[7] = 
    "\n                                ".toCharArray();
    __oracle_jsp_text[8] = 
    "\n                            </td>\n                            <td class=\"label\">".toCharArray();
    __oracle_jsp_text[9] = 
    ":</td>\n                            <td colspan=\"3\">\n                                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\n                                       <option value=\"\">Seleccione...</option>\n                                       <option value=\"B\">Bajas</option>\n                                       <option value=\"P\">Promociones</option>\n                                      ".toCharArray();
    __oracle_jsp_text[11] = 
    "\n                            </td>\n                        <tr>\n                            <td colspan=\"2\" valign=\"middle\" height=\"20px\" align=\"left\">\n                            <b>* Campos requeridos</b>\n                            </td>\n                        </tr>\n                    </table>\n                </fieldset>\n            </td>\n        </tr>\n    </table>\n\n    <table width=\"100%\">\n          <tr align=\"center\">\n              <td>\n                  ".toCharArray();
    __oracle_jsp_text[12] = 
    "\n                  ".toCharArray();
    __oracle_jsp_text[13] = 
    "\n              </td>\n          </tr>\n    </table>\n\n    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\n        <table>\n            <tr>\n                <th align=\"left\"></th>\n            </tr>\n            <tr>\n                <td align=\"left\">\n                ".toCharArray();
    __oracle_jsp_text[15] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[16] = 
    "\n                </td>\n            </tr>\n        </table>\n    ".toCharArray();
    __oracle_jsp_text[17] = 
    "\n    ".toCharArray();
    __oracle_jsp_text[18] = 
    "\n        <table>\n            <tr>\n                <th align=\"left\"></th>\n            </tr>\n            <tr>\n                <td align=\"left\">\n                ".toCharArray();
    __oracle_jsp_text[19] = 
    "\n                ".toCharArray();
    __oracle_jsp_text[20] = 
    "\n                </td>\n            </tr>\n        </table>\n    ".toCharArray();
    __oracle_jsp_text[21] = 
    "\n   \n ".toCharArray();
    __oracle_jsp_text[22] = 
    "\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
