package _web_2d_inf._jsp._consultas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _firmaElectronica extends com.orionserver.http.OrionHttpJspPage {


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
    _firmaElectronica page = this;
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
        _oracle._jsp._tag._configuration_tag __jsp_taghandler_1=(_oracle._jsp._tag._configuration_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._configuration_tag.class, pageContext);
        __jsp_taghandler_1.setJspContext(pageContext);
        __jsp_taghandler_1.setVar("PKI_WEB_RESOURCES_URL");
        __jsp_taghandler_1.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_1, pageContext);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag modelAttribute");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setModelAttribute("muestraFirmaElectronicaDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${PKI_WEB_RESOURCES_URL}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,2);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                __jsp_taghandler_4.setPath("signatureData");
                __jsp_taghandler_4.setId("signatureData");
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
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                __jsp_taghandler_5.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${muestraFirmaElectronicaDTO.contentSignatureData[0]}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                __jsp_taghandler_6.setPath("certificateData");
                __jsp_taghandler_6.setId("certificateData");
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
              out.write(__oracle_jsp_text[11]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                __jsp_taghandler_7.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${muestraFirmaElectronicaDTO.certificateData}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,2);
              }
              out.write(__oracle_jsp_text[12]);
              {
                org.springframework.web.servlet.tags.form.HiddenInputTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.form.HiddenInputTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.HiddenInputTag.class,"org.springframework.web.servlet.tags.form.HiddenInputTag path id");
                __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                __jsp_taghandler_8.setPath("outData");
                __jsp_taghandler_8.setId("outData");
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
              out.write(__oracle_jsp_text[13]);
              out.write(__oracle_jsp_text[14]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${muestraFirmaElectronicaDTO.idComprobante}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,2);
              }
              out.write(__oracle_jsp_text[15]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_10.setParent(__jsp_taghandler_2);
                __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${muestraFirmaElectronicaDTO.rfcEmpleado}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[16]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_11.setParent(__jsp_taghandler_2);
                __jsp_taghandler_11.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${muestraFirmaElectronicaDTO.idPaquete}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[17]);
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
  private static final char __oracle_jsp_text[][]=new char[18][];
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
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    <p style=\"text-align: left; font-weight: bold;\">Ingrese los siguientes datos: </p>\r\n    &nbsp;\r\n    \r\n    <table align=\"center\">        \r\n        <tr>\r\n            <td>               \r\n                <script type=\"text/javascript\">\r\n                    var params = new Array(1);\r\n                    params[0] = \"opcType\";\r\n                    params[1] = \"showRfc\";\r\n                    params[2] = \"showCurp\";\r\n                    \r\n                    var values = new Array(1); \r\n                    values[0] = \"0\";\r\n                    values[1] = \"true\";\r\n                    values[2] = \"false\";\r\n                    \r\n                    var appletTags = getDefaultAppletTag(\"PKI\", \"".toCharArray();
    __oracle_jsp_text[8] = 
    "\", 620, 350, params, values);\r\n                    document.writeln(\"<br/>\" + appletTags);\r\n                </script>\r\n            </td>\r\n        </tr>\r\n        <tr>\r\n            <td>\r\n                ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                <textarea id=\"areaSignatureData\" cols=\"45\" rows=\"20\" disabled=\"true\" style=\"display:none;\">".toCharArray();
    __oracle_jsp_text[10] = 
    "</textarea>\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                <textarea id=\"areaCertificateData\" cols=\"45\" rows=\"20\" disabled=\"true\" style=\"display:none;\">".toCharArray();
    __oracle_jsp_text[12] = 
    "</textarea>\r\n                \r\n                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                <textarea id=\"signers\" cols=\"45\" rows=\"20\" disabled=\"true\" style=\"display:none;\"></textarea>\r\n            </td>\r\n        </tr>\r\n        ".toCharArray();
    __oracle_jsp_text[14] = 
    "\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">\r\n        function getResult() {\r\n            var certificateCURP = document.getElementById(\"PKI\").getCertificateCURP(0);\r\n            var certificateRFC = document.getElementById(\"PKI\").getCertificateRFC(0);\r\n            var certificateSN = document.getElementById(\"PKI\").getCertificateSerialNumber(0);\r\n            var certificateExpireDate = document.getElementById(\"PKI\").getCertificateExpireDate(0);\r\n            var sizeCertificates = certificateCURP.length;\r\n            \r\n            if (certificateCURP!=null && certificateCURP!=\"\" && certificateRFC!=null && certificateRFC!=\"\" && certificateSN!=null && certificateSN!=\"\" && certificateExpireDate!=null && certificateExpireDate!=\"\") {\r\n                document.getElementById(\"signatureData\").value = document.getElementById(\"PKI\").getContent()[0];\r\n                document.getElementById(\"areaSignatureData\").value = document.getElementById(\"signatureData\").value;\r\n                \r\n                var certData = document.getElementById(\"certificateData\");\r\n                certData.value = document.getElementById(\"PKI\").getCertificate();\r\n                document.getElementById(\"areaCertificateData\").value = certData.value;\r\n                document.getElementById(\"signers\").value = certificateCURP[0] + \"-\" + certificateRFC[0] + \"-\" + certificateSN[0] + \"-\" + certificateExpireDate[0] + \"\\n\";\r\n                \r\n                var idComprobante = '".toCharArray();
    __oracle_jsp_text[15] = 
    "';\r\n                var rfcEmpleado = '".toCharArray();
    __oracle_jsp_text[16] = 
    "';\r\n                var idPaquete = '".toCharArray();
    __oracle_jsp_text[17] = 
    "';\r\n                window.location.href = 'getComprobantePDFCallback.do?idComprobante=' + idComprobante + '&rfcEmpleado=' + rfcEmpleado + '&idPaquete=' + idPaquete;\r\n                \r\n                closeDivFirma();\r\n            }\r\n        }\r\n        \r\n        function clearForm() {\r\n            var certTxt = document.getElementById(\"areaCertificateData\");\r\n            var signTxt = document.getElementById(\"areaSignatureData\");\r\n            var signHid = document.getElementById(\"signatureData\");\r\n            var certHid = document.getElementById(\"certificateData\");\r\n            \r\n            document.getElementById(\"areaSignatureData\").value = \"\";\r\n            document.forms[0].signatureData.value = \"\";\r\n            document.getElementById(\"areaCertificateData\").value = \"\";\r\n            document.getElementById(\"outData0\").value = \"\";\r\n            document.forms[0].outData.value = \"\";\r\n            document.getElementById(\"signers\").value = \"\";\r\n            \r\n            document.forms[0].certificateData.value = \"\";\r\n        }\r\n        \r\n        function closeDivFirma() {\r\n            var onCloseFunction = \"\";\r\n            if (onCloseFunction.length > 0) {\r\n                window.parent.eval(onCloseFunction);\r\n            }\r\n            \r\n            $j(\"#frameFirma\").load(function() {\r\n                $j(this).contents().find(\"#listTimbrado\").trigger(\"reloadGrid\");\r\n            });\r\n\r\n            window.parent.document.getElementById('divFirma').style.visibility = \"hidden\";\r\n        }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
