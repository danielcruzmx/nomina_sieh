package _web_2d_inf._jsp._comun;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _home extends com.orionserver.http.OrionHttpJspPage {


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
    _home page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      {
        org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setCode("welcome.message");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
            return;
        } catch (Throwable th) {
          __jsp_taghandler_1.doCatch(th);
        } finally {
          __jsp_taghandler_1.doFinally();
        }
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1,1);
      }
      out.write(__oracle_jsp_text[4]);
      {
        _oracle._jsp._tag._browserCtrl_tag __jsp_taghandler_2=(_oracle._jsp._tag._browserCtrl_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._browserCtrl_tag.class, pageContext);
        __jsp_taghandler_2.setJspContext(pageContext);
        __jsp_taghandler_2.doTag();
        OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_2, pageContext);
      }
      out.write(__oracle_jsp_text[5]);

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
  private static final char __oracle_jsp_text[][]=new char[6][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" width=\"100%\">\r\n    <!--colgroup>\r\n        <col width=\"65%\"/>\r\n        <col width=\"35%\"/>\r\n    <colgroup>-->\r\n    <tr>\r\n        <td valign=\"middle\" align=\"center\" height=\"320px\">\r\n            ".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n\r\n            <!-- anuncios -->\r\n            ".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n            <!-- anuncios -->\r\n        </td>\r\n        <!--<td valign=\"top\" align=\"center\" height=\"320px\">\r\n            <table width=\"100%\">\r\n                <tr>\r\n                    <td align=\"center\">\r\n                        <br />\r\n                        <div style=\"width:500px;overflow:auto;\">\r\n                            <table id=\"listNotificaciones\"></table>\r\n                            <div id=\"pagerNotificaciones\"></div>\r\n                        </div>\r\n                        <br />\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n            <script type=\"text/javascript\">\r\n                // Grid principal\r\n                var grid = $j('#listNotificaciones');\r\n                \r\n                grid.jqGrid({\r\n                    url: '/sireh/notificacion/jsonCallbackNotificaciones.do', \r\n                    datatype: 'json',\r\n                    colNames: [\r\n                        'No',\r\n                        'Titulo',\r\n                        'Fecha',\r\n                        'Estatus',\r\n                    ],\r\n                    colModel: [\r\n                        {name: 'idNotificacion',            index: 'idNotificacion', width: 100, align: \"center\", sortable: true, sorttype: \"text\", search: false, formatter:actionLinkFormat},\r\n                        {name: 'tituloNotificacion',        index: 'tituloNotificacion', width: 170, align: \"center\", sortable: true, sorttype: \"text\", search: false},\r\n                        {name: 'fecModifico',               index: 'fecModifico', width: 120, align: \"center\", sortable: true, sorttype: \"text\", search: false},\r\n                        {name: 'descSituacionNotificacion', index: 'descSituacionNotificacion', width: 100, align: \"center\", sortable: true, sorttype: \"text\", search: false}\r\n                    ],\r\n                    rowNum: \"10\",\r\n                    multiselect: false,\r\n                    caption: \"Notificaciones\",\r\n                    pager: '#pagerNotificaciones',\r\n                    viewrecords: true,\r\n                    loadonce: true,\r\n                    height: 200,\r\n                    gridComplete: function() {\r\n                        grid.setGridParam({datatype: 'local'});\r\n                    }\r\n                });\r\n                \r\n                function actionLinkFormat(cellvalue, options, rowObject) {\r\n                    var a = \"<a href='/sireh/notificacion/detalleNotificacion.do?interior=home&idNotificacion=\" + rowObject[\"idNotificacion\"] + \r\n                    \"' class='requestlink' title='Detalle notificaci&oacute;n' target='_blank'>\" + rowObject[\"idNotificacion\"] + \"<\\/a>\";\r\n                    return a;\r\n                }\r\n            </script>\r\n        </td>-->\r\n    </tr>\r\n</table>".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
