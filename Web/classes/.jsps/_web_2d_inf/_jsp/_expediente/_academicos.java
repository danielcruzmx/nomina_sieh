package _web_2d_inf._jsp._expediente;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _academicos extends com.orionserver.http.OrionHttpJspPage {


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
    _academicos page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      {
        org.apache.taglibs.standard.tag.rt.core.SetTag __jsp_taghandler_1=(org.apache.taglibs.standard.tag.rt.core.SetTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.SetTag.class,"org.apache.taglibs.standard.tag.rt.core.SetTag var value");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setVar("context");
        __jsp_taghandler_1.setValue(request.getContextPath());
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[2]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_2=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_2.setParent(null);
        __jsp_taghandler_2.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesolinea}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
        if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2,1);
      }
      out.write(__oracle_jsp_text[3]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_3=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_3.setParent(null);
        __jsp_taghandler_3.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.colormarco}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
        if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3,1);
      }
      out.write(__oracle_jsp_text[4]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_4.setParent(null);
        __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesoletra}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
        if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,1);
      }
      out.write(__oracle_jsp_text[5]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_5=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_5.setParent(null);
        __jsp_taghandler_5.setText("Antecedentes");
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
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_6=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_6.setParent(null);
        __jsp_taghandler_6.setCode("titulado.jpg");
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
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
        __jsp_taghandler_7.setParent(null);
        __jsp_taghandler_7.setText("Acad&eacute;micos ");
        try {
          __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
          if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_7.doCatch(th);
        } finally {
          __jsp_taghandler_7.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7,1);
      }
      out.write(__oracle_jsp_text[8]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_8=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_8.setParent(null);
        __jsp_taghandler_8.setValue("Registros localizados: ");
        __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
        if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8,1);
      }
      out.write(__oracle_jsp_text[9]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_9=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_9.setParent(null);
        __jsp_taghandler_9.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.locAnAc}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
        if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9,1);
      }
      out.write(__oracle_jsp_text[10]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_10.setParent(null);
        __jsp_taghandler_10.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.jsonAntAcademicos}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
        if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,1);
      }
      out.write(__oracle_jsp_text[11]);
      out.write(__oracle_jsp_text[12]);
      out.write(__oracle_jsp_text[13]);
      {
        org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
        __jsp_taghandler_11.setParent(null);
        __jsp_taghandler_11.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${context}",java.lang.Object.class, __ojsp_varRes,null));
        __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
        if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,1);
      }
      out.write(__oracle_jsp_text[14]);
      {
        org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_12=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
        __jsp_taghandler_12.setParent(null);
        __jsp_taghandler_12.setCode("pdf-download.jpg");
        try {
          __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
          if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_12.doCatch(th);
        } finally {
          __jsp_taghandler_12.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,1);
      }
      out.write(__oracle_jsp_text[15]);
      out.write(__oracle_jsp_text[16]);

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
  private static final char __oracle_jsp_text[][]=new char[17][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n\r\n<table width=\"100%\">\r\n    <tr>\r\n        <td align=\"center\">\r\n            <fieldset style='border-style:outset; border-width: ".toCharArray();
    __oracle_jsp_text[3] = 
    "; border-color: ".toCharArray();
    __oracle_jsp_text[4] = 
    ";'>\r\n                <legend style='font-size:".toCharArray();
    __oracle_jsp_text[5] = 
    "; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                    <strong>\r\n                    ".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n                    <img class=\"fotografia\" width=\"45\" src=\"".toCharArray();
    __oracle_jsp_text[7] = 
    "\" align=\"middle\"/>      \r\n                    ".toCharArray();
    __oracle_jsp_text[8] = 
    "</strong>\r\n                </legend>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            <br>\r\n                            <div style=\"width:950px;overflow:auto;\">\r\n                                <table id=\"listAnAcademicos\"></table>\r\n                                <div id=\"pagerAnAcademicos\"/>\r\n                            </div>\r\n                            <br>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td align=\"center\" style=\"padding: 9px;\"><h1>\r\n                            ".toCharArray();
    __oracle_jsp_text[9] = 
    "\r\n                            ".toCharArray();
    __oracle_jsp_text[10] = 
    "</h1>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n                \r\n                <script type=\"text/javascript\">\r\n                    var jsonStr = '".toCharArray();
    __oracle_jsp_text[11] = 
    "';\r\n                    \r\n                    jsonStr = jsonStr.replace(/&#034;/g,'\"');\r\n                    $j(\"#listAnAcademicos\").jqGrid({\r\n                        datatype: 'jsonstring',\r\n                        rowNum: \"".toCharArray();
    __oracle_jsp_text[12] = 
    "\",\r\n                        datastr: jsonStr,\r\n                        colNames:[\r\n                            '#',\r\n                            'Docto soporte',\r\n                            'Nivel escolar',\r\n                            'Escolaridad / Carrera',\r\n                            'Est. Concluidos',\r\n                            'Inst. Educativa',\r\n                            'Promedio',\r\n                            'Cedula profesional',\r\n                            'Fecha registro'\r\n                        ],\r\n                        colModel:[\r\n                            { name:'num',           index:'nume',          width:30,  align:\"center\", sortable: false},\r\n                            { name:'doctoSop',      index:'doctoSop',      width:95,  align:\"center\", sortable: false, formatter:currencyFmatter },\r\n                            { name:'nEscolar',      index:'nEscolar',      width:210, align:\"left\",   sortable: false},\r\n                            { name:'escdad',        index:'escdad',        width:180, align:\"left\",   sortable: false},\r\n                            { name:'estudios',      index:'estudios',      width:105, align:\"center\", sortable: false},\r\n                            { name:'instit',        index:'instit',        width:120, align:\"center\", sortable: false},\r\n                            { name:'promedio',      index:'promedio',      width:70,  align:\"center\", sortable: false},\r\n                            { name:'cedula',        index:'cedula',        width:130, align:\"center\", sortable: false},\r\n                            { name:'fecModifico',   index:'fecModifico',   width:105, align:\"center\", sortable: false}\r\n                        ],\r\n                        rowNum: \"".toCharArray();
    __oracle_jsp_text[13] = 
    "\",\r\n                        viewrecords: true,\r\n                        loadonce: true,\r\n                    });\r\n                    \r\n                    function currencyFmatter(cellvalue, options, rowObject){\r\n                        return \"<a href='".toCharArray();
    __oracle_jsp_text[14] = 
    "/expediente/downloadFile.do?uuid=\" + cellvalue + \r\n                        \"' class='requestlink' title='Descargar documento' target='_blank'><img align='middle' width='20' src='".toCharArray();
    __oracle_jsp_text[15] = 
    "'\\/><\\/a>\";\r\n                     }\r\n                    \r\n                    $j(window).resize(function(){\r\n                        $j('#listDependientes').jqGrid('setGridHeight', \"".toCharArray();
    __oracle_jsp_text[16] = 
    "\");\r\n                    });\r\n                    \r\n                    $j(\"#listAnAcademicos\").jqGrid('navGrid','#pagerAnAcademicos',{add:false,edit:false,del:false,search:false,refresh:false});\r\n                   \r\n                </script>\r\n                \r\n            </fieldset>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td>&nbsp;</td>\r\n    </tr>\r\n</table>\r\n<br/>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
