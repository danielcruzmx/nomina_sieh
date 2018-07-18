package _web_2d_inf._jsp._expediente;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _historicoPagos extends com.orionserver.http.OrionHttpJspPage {


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
    _historicoPagos page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesolinea}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.colormarco}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesoletra}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_4=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setText("Hist&oacute;rico");
        try {
          __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
          if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_4.doCatch(th);
        } finally {
          __jsp_taghandler_4.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setCode("pagonomina.jpg");
        try {
          __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
          if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_5.doCatch(th);
        } finally {
          __jsp_taghandler_5.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,1);
      }
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setText("de Pagos ");
        try {
          __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
          if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_6.doCatch(th);
        } finally {
          __jsp_taghandler_6.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,1);
      }
      out.write(__oracle_jsp_text[7]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_7=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setValue("Registros localizados: ");
        __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
        if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.locpn}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.jsonPN}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
      }
      out.write(__oracle_jsp_text[9]);
      out.write(__oracle_jsp_text[10]);
      out.write(__oracle_jsp_text[11]);

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
  private static final char __oracle_jsp_text[][]=new char[12][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n<table width=\"100%\">\r\n    <tr>\r\n        <td align=\"center\">\r\n            <fieldset style='border-style:outset; border-width: ".toCharArray();
    __oracle_jsp_text[2] = 
    "; border-color: ".toCharArray();
    __oracle_jsp_text[3] = 
    ";'>\r\n                <legend style='font-size:".toCharArray();
    __oracle_jsp_text[4] = 
    "; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                    <strong>\r\n                        ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n                        <img class=\"fotografia\" width=\"60\" src=\"".toCharArray();
    __oracle_jsp_text[6] = 
    "\" align=\"middle\"/>    \r\n                        ".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n                    </strong>\r\n                </legend>\r\n                \r\n                <!-- jsonHistorico de pagos -->\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\" style=\"padding: 5px;\">\r\n                            <br>\r\n                            <table id=\"listPN\"></table>\r\n                            <div id=\"pagerPN\"></div>   \r\n                            <br>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\" style=\"padding: 9px;\">\r\n                            <h1>".toCharArray();
    __oracle_jsp_text[8] = 
    "</h1>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n\r\n                <script type=\"text/javascript\">\r\n                    var jsonStrpn = '".toCharArray();
    __oracle_jsp_text[9] = 
    "';\r\n                    //var jsonStrpn = '{\"total\":1,\"rows\":[{\"cell\":{\"plaza\":\"78059\",\"periodo\":\"01-07-2014 - 31-07-2014\",\"num\":1,\"grupo\":\"Personal Eventual\",  \"nomina\":\"Nómina Ordinaria\", \"ejercicio\":\"2014\",\"folio\":\"57912496\",\"clabe\":\"012180029684893357\",\"unidad\":\"210\",\"neto\":\"  $31,496.61\",\"qna\":\"201414\",\"puesto\":\"CFNC003\"},\"id\":\"1\"}],\"records\":\"1\",\"page\":\"1\"}';\r\n                    jsonStrpn = jsonStrpn.replace(/&#034;/g,'\"').replace(/\\u00e1/g,'a').replace(/\\u00e9/g,'e').replace(/\\u00ed/g,'i').replace(/\\u00F3/g,'o').replace(/\\u00fa/g,'u');\r\n                    $j(\"#listPN\").jqGrid({\r\n                        datatype: 'jsonstring',\r\n                        datastr: jsonStrpn,\r\n                        colNames:[\r\n                            '#',\r\n                            'Descarga',\r\n                            'Folio',\r\n                            'Cve. Dif.',\r\n                            'N&oacute;mina',\r\n                            'A&ntilde;o',\r\n                            'Qna/pago',\r\n                            'Periodo de pago',\r\n                            'Grupo/pago',\r\n                            'Unidad',\r\n                            'Puesto',\r\n                            'Plaza',\r\n                            'Pago neto'\r\n                         ],\r\n                        colModel:[\r\n                            { name:'num',       index:'num',       width:35,   align:\"center\", sortable: false},\r\n                            { name:'descarga',  index:'descarga',  width:70,   align:\"center\", sortable: false,  formatter:actionLinkDownload},\r\n                            { name:'folio',     index:'folio',     width:70,   align:\"left\", sortable: false},\r\n                            { name:'diffolio',  index:'diffolio',  width:70,   align:\"left\", sortable: false},\r\n                            { name:'nomina',    index:'nomina',    width:110,  align:\"left\",   sortable: false},\r\n                            { name:'ejercicio', index:'ejercicio', width:40,   align:\"left\", sortable: false},\r\n                            { name:'qna',       index:'qna',       width:65,   align:\"left\", sortable: false},\r\n                            { name:'periodo',   index:'periodo',   width:150,  align:\"left\", sortable: false},\r\n                            { name:'grupo',     index:'grupo',     width:125,  align:\"left\",   sortable: false},\r\n                            { name:'unidad',    index:'unidad',    width:50,   align:\"center\", sortable: false},\r\n                            { name:'puesto',    index:'puesto',    width:60,   align:\"left\", sortable: false},\r\n                            { name:'plaza',     index:'plaza',     width:50,   align:\"center\", sortable: false},\r\n                            { name:'neto',      index:'neto',      width:85,   align:\"right\",  sortable: false}\r\n                        ],\r\n                        rowNum: \"".toCharArray();
    __oracle_jsp_text[10] = 
    "\",\r\n                        viewrecords: true,\r\n                        loadonce: true,\r\n                    });\r\n                    $j(window).resize(function(){\r\n                        $j('#listPN').jqGrid('setGridHeight', \"".toCharArray();
    __oracle_jsp_text[11] = 
    "\");\r\n                    });\r\n                    \r\n                    function actionLinkDownload(cellvalue, options, rowObject){\r\n                        return \"<a href='getComprobantePagoPDFCallback.do?folio=\" + rowObject[\"folio\"] + \"&diffolio=\" + rowObject[\"diffolio\"] + \" ' class='requestlink' title='Descarga representaci&oacute;n impresa'> <img width='20' align='middle' src='/sireh/images/expediente/ri.png'\\/><\\/a>\"\r\n                    }\r\n                    \r\n                </script>\r\n            </fieldset>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n</table>\r\n<br/>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
