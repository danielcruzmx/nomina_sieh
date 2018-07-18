package _web_2d_inf._jsp._reportes._plaza;

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
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("expLabCVDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.plaza.reportes.pnt.experienciLaboral.titulo.dif");
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
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expLabCVDTO.muestraReporte}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[6]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_4.setParent(__jsp_taghandler_3);
                      __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expLabCVDTO.nombreEmpleado}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                      if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,3);
                    }
                    out.write(__oracle_jsp_text[7]);
                  } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.merito.label.rfc");
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
                _oracle._jsp._tag._helpRoutine_tag __jsp_taghandler_6=(_oracle._jsp._tag._helpRoutine_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._helpRoutine_tag.class, pageContext);
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setJspContext(pageContext);
                __jsp_taghandler_6.setBeanName("empleadosConstanciaNombramiento");
                __jsp_taghandler_6.setPath("rfcEmpleado");
                __jsp_taghandler_6.setFieldMapping("rfcEmpleado, idPlaza, curpEmpleado, primerApellido, segundoApellido, nombreEmpleado");
                __jsp_taghandler_6.setWidth("1000");
                __jsp_taghandler_6.setLeftPosition("17");
                __jsp_taghandler_6.setHeight("400");
                __jsp_taghandler_6.setTopPosition("20");
                __jsp_taghandler_6.setMaxlength("16");
                __jsp_taghandler_6.setDisabled("true");
                __jsp_taghandler_6.setSize("16");
                __jsp_taghandler_6.setTitle("Seleccione el RFC");
                __jsp_taghandler_6.setOnClose("habilitar();");
                __jsp_taghandler_6.setMaxRows("100");
                __jsp_taghandler_6.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_6, pageContext);
              }
              out.write(__oracle_jsp_text[10]);
              {
                _oracle._jsp._tag._option_tag __jsp_taghandler_7=(_oracle._jsp._tag._option_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._option_tag.class, pageContext);
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setJspContext(pageContext);
                __jsp_taghandler_7.setKey("0");
                __jsp_taghandler_7.setValue("selectList.nonValue");
                __jsp_taghandler_7.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_7, pageContext);
              }
              out.write(__oracle_jsp_text[11]);
              {
                _oracle._jsp._tag._selectList_tag __jsp_taghandler_8=(_oracle._jsp._tag._selectList_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._selectList_tag.class, pageContext);
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setJspContext(pageContext);
                __jsp_taghandler_8.setBeanName("tcUnidadCicloReportes");
                __jsp_taghandler_8.setPath("ciclo");
                __jsp_taghandler_8.setOnchange("habilitar();");
                __jsp_taghandler_8.setStyle("width: 150px;");
                __jsp_taghandler_8.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_8, pageContext);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[13]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_10=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setJspContext(pageContext);
                __jsp_taghandler_10.setPath("muestraReporte");
                __jsp_taghandler_10.setAction("reportePlaza/expLabCV.do");
                __jsp_taghandler_10.setValue("submit.consult");
                __jsp_taghandler_10.setProgressBar("false");
                __jsp_taghandler_10.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_10, pageContext);
              }
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_11=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("limpiar");
                __jsp_taghandler_11.setAction("reportePlaza/expLabCV.do");
                __jsp_taghandler_11.setValue("submit.clean");
                __jsp_taghandler_11.setProgressBar("false");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expLabCVDTO.muestraReporte}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[16]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_13=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_13.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_13.setJspContext(pageContext);
                      __jsp_taghandler_13.setName("PR_CICLO");
                      __jsp_taghandler_13.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expLabCVDTO.ciclo}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_13.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
                    }
                    out.write(__oracle_jsp_text[17]);
                    {
                      _oracle._jsp._tag._reportParam_tag __jsp_taghandler_14=(_oracle._jsp._tag._reportParam_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._reportParam_tag.class, pageContext);
                      __jsp_taghandler_14.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_14.setJspContext(pageContext);
                      __jsp_taghandler_14.setName("PR_RFC");
                      __jsp_taghandler_14.setValue((java.lang.String)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expLabCVDTO.rfcEmpleado}",java.lang.String.class, __ojsp_varRes,null));
                      __jsp_taghandler_14.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_14, pageContext);
                    }
                    out.write(__oracle_jsp_text[18]);
                    {
                      _oracle._jsp._tag._report_tag __jsp_taghandler_15=(_oracle._jsp._tag._report_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._report_tag.class, pageContext);
                      __jsp_taghandler_15.setParent(__jsp_taghandler_12);
                      __jsp_taghandler_15.setJspContext(pageContext);
                      __jsp_taghandler_15.setProvider("jasper");
                      __jsp_taghandler_15.setViewUri("/constanciaSueldos/Trayectoria_Laboral");
                      __jsp_taghandler_15.setImagesUri("/images/reports");
                      __jsp_taghandler_15.setFormat("pdf");
                      __jsp_taghandler_15.setFileName("Trayectoria_Laboral");
                      __jsp_taghandler_15.setExport("pdf");
                      __jsp_taghandler_15.setWidth("1060");
                      __jsp_taghandler_15.setHeight("350");
                      __jsp_taghandler_15.doTag();
                      OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_15, pageContext);
                    }
                    out.write(__oracle_jsp_text[19]);
                  } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[20]);
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
  private static final char __oracle_jsp_text[][]=new char[21][];
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
    "\r\n    \r\n    <h1>\r\n        <strong>\r\n            ".toCharArray();
    __oracle_jsp_text[6] = 
    " de <strong>".toCharArray();
    __oracle_jsp_text[7] = 
    "</strong>".toCharArray();
    __oracle_jsp_text[8] = 
    "\r\n        </strong>\r\n    </h1>\r\n    \r\n    <p>&nbsp;</p>\r\n    <div align=\"center\">\r\n        <table width=\"40%\" border=\"0\">\r\n            <tr>\r\n                <td>\r\n                    <fieldset>\r\n                    <legend style=\"font-size:1.1em\"><strong>&nbsp;&nbsp;Parametros de consulta&nbsp;&nbsp; </strong></legend>\r\n                        <table align=\"center\" width=\"90%\" border=\"0\">\r\n                            <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n                            <tr>\r\n                                <td  align=\"right\" class=\"label\"> * ".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td align=\"right\" class=\"label\" width=\"20%\">* Ciclo</td>\r\n                                <td align=\"left\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td align=\"left\" height=\"20px\" valign=\"middle\" colspan=\"2\">\r\n                                    <strong>\r\n                                        ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                    </strong>\r\n                                </td>\r\n                            </tr>\r\n                            <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n                            <tr align=\"center\">\r\n                                <td align=\"center\" colspan=\"2\">\r\n                                    ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n                                    ".toCharArray();
    __oracle_jsp_text[15] = 
    "\r\n                                </td>\r\n                            </tr>\r\n                            <tr><td colspan=\"2\">&nbsp;</td></tr>\r\n                        </table>\r\n                    </fieldset>\r\n                </td>\r\n            </tr>\r\n        </table>\r\n        \r\n        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n        ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n    </div>\r\n    \r\n    <p>&nbsp;</p>\r\n    <div align=\"center\"></div>\r\n    \r\n    <script type=\"text/javascript\">\r\n        $j(document).ready(function(){\r\n            $j(\"#10001\").prop(\"disabled\", true);\r\n        });\r\n        function habilitar(){\r\n            if(($j('#rfcEmpleado').val() != '') & ($j('#ciclo') != '0')){\r\n                $j(\"#10001\").removeAttr('disabled');\r\n            }\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
