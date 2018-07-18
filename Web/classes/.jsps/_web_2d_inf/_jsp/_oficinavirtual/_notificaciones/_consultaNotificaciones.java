package _web_2d_inf._jsp._oficinavirtual._notificaciones;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _consultaNotificaciones extends com.orionserver.http.OrionHttpJspPage {


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
    _consultaNotificaciones page = this;
    ServletConfig config = pageContext.getServletConfig();
    javax.servlet.jsp.el.VariableResolver __ojsp_varRes = (VariableResolver)new OracleVariableResolverImpl(pageContext);

    try {


      out.write(__oracle_jsp_text[0]);
      out.write(__oracle_jsp_text[1]);
      out.write(__oracle_jsp_text[2]);
      out.write(__oracle_jsp_text[3]);
      out.write(__oracle_jsp_text[4]);
      out.write(__oracle_jsp_text[5]);
      out.write(__oracle_jsp_text[6]);
      {
        org.springframework.web.servlet.tags.form.FormTag __jsp_taghandler_1=(org.springframework.web.servlet.tags.form.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.form.FormTag.class,"org.springframework.web.servlet.tags.form.FormTag name modelAttribute");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setName("checkBoxTest");
        __jsp_taghandler_1.setModelAttribute("consultaNotificacionesDTO");
        try {
          __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
          if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
          {
            do {
              out.write(__oracle_jsp_text[7]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_2=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag code");
                __jsp_taghandler_2.setParent(__jsp_taghandler_1);
                __jsp_taghandler_2.setCode("sireh.label.oficinaVirtual.notificaciones.consulta.title");
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
              out.write(__oracle_jsp_text[8]);
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
  private static final char __oracle_jsp_text[][]=new char[9][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[5] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[6] = 
    "\r\n\r\n<style type=\"text/css\">\r\n    .anchoInput {\r\n        width: 200px;\r\n    }\r\n</style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[7] = 
    "\r\n    \r\n    <h1>".toCharArray();
    __oracle_jsp_text[8] = 
    "</h1>\r\n    <p>&nbsp;</p>\r\n    \r\n    <table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"center\">\r\n        <tr>    \r\n            <td>\r\n                <fieldset>\r\n                    <legend style=\"font-size:1.3em\"><strong>Notificaciones</strong></legend>\r\n                    \r\n                    <!-- notificaciones -->\r\n                    <table width=\"100%\">\r\n                        <tr>\r\n                            <td align=\"center\" style=\"padding: 5px;\">\r\n                                <br />\r\n                                <div style=\"width:1000px;overflow:auto;\">\r\n                                    <table id=\"listNotificaciones\"></table>\r\n                                    <div id=\"pagerNotificaciones\"></div>\r\n                                </div>\r\n                                <br />\r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                    \r\n                    <script type=\"text/javascript\">\r\n                        // Grid principal\r\n                        var grid = $j('#listNotificaciones');\r\n                        \r\n                        grid.jqGrid({\r\n                            url: 'jsonCallbackNotificaciones.do', \r\n                            datatype: 'json',\r\n                            colNames: [\r\n                                'No',\r\n                                'Tipo',\r\n                                'From',\r\n                                'To',\r\n                                'CC',\r\n                                'Titulo',\r\n                                'Usuario',\r\n                                'Fecha',\r\n                                'Estatus'\r\n                            ],\r\n                            colModel: [\r\n                                {name: 'idNotificacion',            index: 'idNotificacion', width: 100, align: \"center\", sortable: true, sorttype: \"text\", search: false, formatter:actionLinkFormat},\r\n                                {name: 'descTipoNotificacion',      index: 'descTipoNotificacion', width: 200, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                {name: 'fromRfcNotificacion',       index: 'fromRfcNotificacion', width: 120, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                {name: 'toRfcNotificacion',         index: 'toRfcNotificacion', width: 120, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                {name: 'ccRfcNotificacion',         index: 'ccRfcNotificacion', width: 120, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                {name: 'tituloNotificacion',        index: 'tituloNotificacion', width: 170, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                {name: 'usuario',                   index: 'usuario', width: 100, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                {name: 'fecModifico',               index: 'fecModifico', width: 120, align: \"center\", sortable: true, sorttype: \"text\", search: true},\r\n                                {name: 'descSituacionNotificacion', index: 'descSituacionNotificacion', width: 100, align: \"center\", sortable: true, sorttype: \"text\", search: true}\r\n                            ],\r\n                            rowNum: \"10\",\r\n                            multiselect: false,\r\n                            caption: \"Notificaciones\",\r\n                            pager: '#pagerNotificaciones',\r\n                            viewrecords: true,\r\n                            loadonce: true,\r\n                            height: 200,\r\n                            gridComplete: function() {\r\n                                grid.setGridParam({datatype: 'local'});\r\n                            }\r\n                        });\r\n                        \r\n                        function actionLinkFormat(cellvalue, options, rowObject) {\r\n                            var a = \"<a href='detalleNotificacion.do?interior=consulta&idNotificacion=\" + rowObject[\"idNotificacion\"] + \r\n                            \"' class='requestlink' title='Detalle notificacion' target='_blank'>\" + rowObject[\"idNotificacion\"] + \"<\\/a>\";\r\n                            return a;\r\n                        }\r\n                    </script>\r\n                    <!-- notificaciones -->\r\n                </fieldset>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
