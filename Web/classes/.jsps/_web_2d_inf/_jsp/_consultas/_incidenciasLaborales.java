package _web_2d_inf._jsp._consultas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _incidenciasLaborales extends com.orionserver.http.OrionHttpJspPage {


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
    _incidenciasLaborales page = this;
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
                __jsp_taghandler_2.setCode("sireh.label.expediente.titulo10");
                try {
                  __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
                  if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                  {
                    do {
                      out.write(__oracle_jsp_text[5]);
                    } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                  }
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
                _oracle._jsp._tag._label_tag __jsp_taghandler_3=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setJspContext(pageContext);
                __jsp_taghandler_3.setPath("nombreEmp");
                __jsp_taghandler_3.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
              }
              out.write(__oracle_jsp_text[7]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesolinea}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.colormarco}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesoletra}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setText("Incidencias");
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
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("letreroissste.jpg");
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
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setText("Laborales ");
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
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setValue("Registros localizados: ");
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_11.setParent(__jsp_taghandler_1);
                __jsp_taghandler_11.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.locip}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,2);
              }
              out.write(__oracle_jsp_text[14]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_12.setParent(__jsp_taghandler_1);
                __jsp_taghandler_12.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.jsonIP}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,2);
              }
              out.write(__oracle_jsp_text[15]);
              out.write(__oracle_jsp_text[16]);
              out.write(__oracle_jsp_text[17]);
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
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    <table width=\"100%\">\r\n        <tr align=\"left\">\r\n            <td> <h1> ".toCharArray();
    __oracle_jsp_text[5] = 
    ":&nbsp;&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[6] = 
    " ".toCharArray();
    __oracle_jsp_text[7] = 
    "</h1> </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            <fieldset style='border-style:outset; border-width: ".toCharArray();
    __oracle_jsp_text[8] = 
    "; border-color: ".toCharArray();
    __oracle_jsp_text[9] = 
    ";'>\r\n                                <legend style='font-size:".toCharArray();
    __oracle_jsp_text[10] = 
    "; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                                    <strong>\r\n                                     ".toCharArray();
    __oracle_jsp_text[11] = 
    "\r\n                                     <img class=\"fotografia\" width=\"65\" src=\"".toCharArray();
    __oracle_jsp_text[12] = 
    "\" align=\"middle\"/>                                   \r\n                                    ".toCharArray();
    __oracle_jsp_text[13] = 
    "</strong>\r\n                                </legend>\r\n                \r\n                                <!-- json incidencias de personal -->\r\n                                <table width=\"100%\">\r\n                                    <tr>\r\n                                        <td align=\"center\" style=\"padding: 5px;\">\r\n                                            <br>\r\n                                            <div style=\"width:900px;overflow:auto;\">\r\n                                                <table id=\"listIP\"></table>\r\n                                                <div id=\"pagerIP\"></div>\r\n                                            </div>\r\n                                            <br>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td align=\"center\" style=\"padding: 9px;\">\r\n                                            <h1>".toCharArray();
    __oracle_jsp_text[14] = 
    "</h1>\r\n                                        </td>\r\n                                    </tr>\r\n                                </table>\r\n                \r\n                                <script type=\"text/javascript\">\r\n                                    var jsonStrip = '".toCharArray();
    __oracle_jsp_text[15] = 
    "';\r\n                                    jsonStrip = jsonStrip.replace(/&#034;/g,'\"');\r\n                                    $j(\"#listIP\").jqGrid({\r\n                                        datatype: 'jsonstring',\r\n                                        datastr: jsonStrip,\r\n                                        colNames:[\r\n                                            '#',\r\n                                            'Status',\r\n                                            'Tipo',\r\n                                            'Concepto',\r\n                                            'Descripci&oacute;n',\r\n                                            'Qna. captura',\r\n                                            'Monto',\r\n                                            'Fecha incidencia',\r\n                                            'Usuario',\r\n                                            'Fecha modificaci&oacute;n'\r\n                                         ],\r\n                                        colModel:[\r\n                                            { name:'num',         index:'num',         width:30,  align:\"center\",  sortable: false},\r\n                                            { name:'estado',      index:'estado',      width:75, align:\"left\",     sortable: true},\r\n                                            { name:'tipo',        index:'tipo',        width:150, align:\"left\",    sortable: true},\r\n                                            { name:'concepto',    index:'concepto',    width:60,  align:\"center\",  sortable: true},\r\n                                            { name:'descripcion', index:'descripcion', width:250, align:\"left\",    sortable: false},\r\n                                            { name:'qnacap',      index:'qnacap',      width:75,  align:\"center\",  sortable: true},\r\n                                            { name:'monto',       index:'monto',       width:75,  align:\"right\",   sortable: false},\r\n                                            { name:'fecha',       index:'fecha',       width:100,  align:\"center\", sortable: false},\r\n                                            { name:'usuario',     index:'usuario',     width:80, align:\"center\",  sortable: true},\r\n                                            { name:'fecModifico', index:'fecModifico', width:125, align:\"center\",  sortable: true}\r\n                                        ],\r\n                                        rowNum: \"".toCharArray();
    __oracle_jsp_text[16] = 
    "\",\r\n                                        viewrecords: true,\r\n                                        loadonce: true,\r\n                                    });\r\n                                    $j(window).resize(function(){\r\n                                        $j('#listIP').jqGrid('setGridHeight', \"".toCharArray();
    __oracle_jsp_text[17] = 
    "\");\r\n                                    });\r\n                                </script>\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr> <td>&nbsp;</td> </tr>\r\n                </table>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\">        \r\n        function currentTab(currentDiv) { }\r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
