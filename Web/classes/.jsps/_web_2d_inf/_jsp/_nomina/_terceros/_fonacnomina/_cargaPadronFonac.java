package _web_2d_inf._jsp._nomina._terceros._fonacnomina;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _cargaPadronFonac extends com.orionserver.http.OrionHttpJspPage {


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
    _cargaPadronFonac page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute enctype");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setModelAttribute("padronFonacDTO");
        __jsp_taghandler_1.setEnctype("multipart/form-data");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[5]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setPath("numRegistros");
                __jsp_taghandler_2.setId("numRegistros");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_3=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setCode("sireh.label.nomina.fonac.cargaPadronParticipante.titulo");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setCode("sireh.label.nomina.fonac.cargaPadronParticipante.fieldSet");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setCode("sireh.label.nomina.fonac.cargaPadronParticipante.periodo");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setPath("periodo");
                __jsp_taghandler_6.setValue("O");
                __jsp_taghandler_6.setLabel(" Ordinario");
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
                org.springframework.web.servlet.tags.form.RadioButtonTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.form.RadioButtonTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.RadioButtonTag.class,"org.springframework.web.servlet.tags.form.RadioButtonTag path value label");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setPath("periodo");
                __jsp_taghandler_7.setValue("E");
                __jsp_taghandler_7.setLabel(" Extraordinario");
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
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("sireh.label.nomina.fonac.cargaPadronParticipante.importe");
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
              out.write(__oracle_jsp_text[12]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_9=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setJspContext(pageContext);
                __jsp_taghandler_9.setPath("importe");
                __jsp_taghandler_9.setMaxlength("15");
                __jsp_taghandler_9.setSize("30");
                __jsp_taghandler_9.setUppercase("true");
                __jsp_taghandler_9.setOnkeypress("return IsNumber(event);");
                __jsp_taghandler_9.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_9, pageContext);
              }
              out.write(__oracle_jsp_text[13]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_10=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setCode("sireh.label.nomina.fonac.cargaPadronParticipante.referencia");
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
              out.write(__oracle_jsp_text[14]);
              {
                _oracle._jsp._tag._input_tag __jsp_taghandler_11=(_oracle._jsp._tag._input_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._input_tag.class, pageContext);
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setJspContext(pageContext);
                __jsp_taghandler_11.setPath("referencia");
                __jsp_taghandler_11.setMaxlength("60");
                __jsp_taghandler_11.setSize("30");
                __jsp_taghandler_11.setUppercase("true");
                __jsp_taghandler_11.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_11, pageContext);
              }
              out.write(__oracle_jsp_text[15]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_12=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setJspContext(pageContext);
                __jsp_taghandler_12.setPath("procesar");
                __jsp_taghandler_12.setAction("fonacNomina/cargaPadronFonac.do");
                __jsp_taghandler_12.setValue("submit.procesar");
                __jsp_taghandler_12.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_12, pageContext);
              }
              out.write(__oracle_jsp_text[16]);
              {
                _oracle._jsp._tag._submit_tag __jsp_taghandler_13=(_oracle._jsp._tag._submit_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._submit_tag.class, pageContext);
                __jsp_taghandler_13.setParent(__jsp_taghandler_1);
                __jsp_taghandler_13.setJspContext(pageContext);
                __jsp_taghandler_13.setPath("cancel");
                __jsp_taghandler_13.setAction("fonacNomina/cargaPadronFonac.do");
                __jsp_taghandler_13.setValue("submit.clean");
                __jsp_taghandler_13.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_13, pageContext);
              }
              out.write(__oracle_jsp_text[17]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_14=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_14.setParent(__jsp_taghandler_1);
                __jsp_taghandler_14.setCode("sireh.form.required.fields");
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
              out.write(__oracle_jsp_text[18]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_15=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_15.setParent(__jsp_taghandler_1);
                __jsp_taghandler_15.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${padronFonacDTO.numRegistros}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
                if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15,2);
              }
              out.write(__oracle_jsp_text[19]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_16=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_16.setParent(__jsp_taghandler_1);
                __jsp_taghandler_16.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${padronFonacDTO.numRegistros}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
                if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16,2);
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
      out.write(__oracle_jsp_text[21]);

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
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n    <table width=\"100%\" align=\"center\" border=\"0\">\r\n        <tr><td><h1> <strong> ".toCharArray();
    __oracle_jsp_text[7] = 
    "</strong></h1></td></tr>\r\n        <tr>\r\n            <td>\r\n                <fieldset id=\"quincenasFieldSet\">\r\n                    <legend style='font-size:1.2em'><strong>".toCharArray();
    __oracle_jsp_text[8] = 
    "</strong></legend>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr><td colspan=\"7\">&nbsp;</td></tr>\r\n                        <tr>\r\n                            <td align=\"right\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[9] = 
    "</td>\r\n                            <td align=\"right\">".toCharArray();
    __oracle_jsp_text[10] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[11] = 
    "</td>\r\n                            <td align=\"left\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[12] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[13] = 
    "</td>\r\n                            <td align=\"left\" class=\"label\">* ".toCharArray();
    __oracle_jsp_text[14] = 
    "</td>\r\n                            <td align=\"left\">".toCharArray();
    __oracle_jsp_text[15] = 
    "</td>\r\n                        </tr>\r\n                        <tr><td colspan=\"7\">&nbsp;</td></tr>\r\n                    </table>\r\n                    <table width=\"100%\" align=\"center\" border=\"0\">\r\n                        <tr align=\"center\">\r\n                            <td>\r\n                                        ".toCharArray();
    __oracle_jsp_text[16] = 
    "\r\n                                    \r\n                                            &nbsp;\r\n                                ".toCharArray();
    __oracle_jsp_text[17] = 
    "\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    <table align=\"center\" width=\"100%\">\r\n        <tr><td colspan=\"3\" align=\"left\"><strong>".toCharArray();
    __oracle_jsp_text[18] = 
    "</strong></td></tr>\r\n    </table>\r\n    <script  type=\"text/javascript\">\r\n        var nav4 = window.Event ? true : false;\r\n        \r\n        function IsNumber(e){\r\n            var tecla= document.all ? tecla = e.keyCode : tecla = e.which;\r\n           return ((tecla > 47 && tecla < 58) || tecla == 46);\r\n        }\r\n        \r\n        $j(document).ready(function(){\r\n            var numRegistros = ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n            var mesaje = 'Hay registros cargados se daran de baja, Desea continuar ?';\r\n            var captura = ".toCharArray();
    __oracle_jsp_text[20] = 
    "\r\n            var rb = 'X';\r\n            \r\n            $j('#10001').click(function(){\r\n                rb = $j('input:radio[name=periodo]:checked').val();\r\n                if($j('#importe').val() != '' && $j('#referencia').val() != '' && $j('input[name=\"periodo\"]').is(':checked') && rb.toUpperCase() == 'O' && captura != 0){\r\n                    var r = window.confirm(mesaje);\r\n                    $j('#procesar').val(r);\r\n                }\r\n            });\r\n        });\r\n        \r\n    </script>\r\n".toCharArray();
    __oracle_jsp_text[21] = 
    "\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
