package _web_2d_inf._jsp._consultas;

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import oracle.jsp.el.*;
import javax.servlet.jsp.el.*;


public class _comprobantesPago extends com.orionserver.http.OrionHttpJspPage {


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
    _comprobantesPago page = this;
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
                __jsp_taghandler_2.setCode("sireh.label.expediente.titulo13");
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
              out.write(__oracle_jsp_text[5]);
              {
                _oracle._jsp._tag._label_tag __jsp_taghandler_3=(_oracle._jsp._tag._label_tag)OracleJspRuntime.getSimpleTagHandler(_oracle._jsp._tag._label_tag.class, pageContext);
                __jsp_taghandler_3.setParent(__jsp_taghandler_1);
                __jsp_taghandler_3.setJspContext(pageContext);
                __jsp_taghandler_3.setPath("nombreEmp");
                __jsp_taghandler_3.doTag();
                OracleJspRuntime.simpleReleaseTagHandler(__jsp_taghandler_3, pageContext);
              }
              out.write(__oracle_jsp_text[6]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_4=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_4.setParent(__jsp_taghandler_1);
                __jsp_taghandler_4.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesolinea}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4,2);
              }
              out.write(__oracle_jsp_text[7]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_5=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_5.setParent(__jsp_taghandler_1);
                __jsp_taghandler_5.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.colormarco}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5,2);
              }
              out.write(__oracle_jsp_text[8]);
              {
                org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_6=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                __jsp_taghandler_6.setParent(__jsp_taghandler_1);
                __jsp_taghandler_6.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.gruesoletra}",java.lang.Object.class, __ojsp_varRes,null));
                __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6,2);
              }
              out.write(__oracle_jsp_text[9]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_7=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_7.setParent(__jsp_taghandler_1);
                __jsp_taghandler_7.setText("Comprobantes");
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
              out.write(__oracle_jsp_text[10]);
              {
                org.springframework.web.servlet.tags.ThemeTag __jsp_taghandler_8=(org.springframework.web.servlet.tags.ThemeTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.ThemeTag.class,"org.springframework.web.servlet.tags.ThemeTag code");
                __jsp_taghandler_8.setParent(__jsp_taghandler_1);
                __jsp_taghandler_8.setCode("pagonomina.jpg");
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
              out.write(__oracle_jsp_text[11]);
              {
                org.springframework.web.servlet.tags.MessageTag __jsp_taghandler_9=(org.springframework.web.servlet.tags.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.springframework.web.servlet.tags.MessageTag.class,"org.springframework.web.servlet.tags.MessageTag text");
                __jsp_taghandler_9.setParent(__jsp_taghandler_1);
                __jsp_taghandler_9.setText("de Pago");
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
              out.write(__oracle_jsp_text[12]);
              {
                org.apache.taglibs.standard.tag.rt.core.IfTag __jsp_taghandler_10=(org.apache.taglibs.standard.tag.rt.core.IfTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.IfTag.class,"org.apache.taglibs.standard.tag.rt.core.IfTag test");
                __jsp_taghandler_10.setParent(__jsp_taghandler_1);
                __jsp_taghandler_10.setTest(OracleJspRuntime.toBoolean( (java.lang.Boolean)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.userComprobante}",java.lang.Boolean.class, __ojsp_varRes,null)));
                __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                {
                  do {
                    out.write(__oracle_jsp_text[13]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_11=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_11.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_11.setValue("Registros localizados: ");
                      __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                      if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11,3);
                    }
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_12=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_12.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_12.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.locTimbrado}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
                      if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12,3);
                    }
                    out.write(__oracle_jsp_text[14]);
                    {
                      org.apache.taglibs.standard.tag.rt.core.OutTag __jsp_taghandler_13=(org.apache.taglibs.standard.tag.rt.core.OutTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.taglibs.standard.tag.rt.core.OutTag.class,"org.apache.taglibs.standard.tag.rt.core.OutTag value");
                      __jsp_taghandler_13.setParent(__jsp_taghandler_10);
                      __jsp_taghandler_13.setValue((java.lang.Object)oracle.jsp.runtime.OracleJspRuntime.evaluate("${expedienteDTO.jsonTimbrado}",java.lang.Object.class, __ojsp_varRes,null));
                      __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
                      if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                        return;
                      OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13,3);
                    }
                    out.write(__oracle_jsp_text[15]);
                    out.write(__oracle_jsp_text[16]);
                    out.write(__oracle_jsp_text[17]);
                  } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                }
                if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                  return;
                OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10,2);
              }
              out.write(__oracle_jsp_text[18]);
              out.write(__oracle_jsp_text[19]);
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
  private static final char __oracle_jsp_text[][]=new char[20][];
  static {
    try {
    __oracle_jsp_text[0] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[1] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[2] = 
    "\r\n".toCharArray();
    __oracle_jsp_text[3] = 
    "\r\n\r\n    <style type=\"text/css\">\r\n        #divFirma{\r\n            position: absolute;\r\n            top: 50%;\r\n            left: 50%;\r\n            margin-top: -50px;\r\n            margin-left: -50px;\r\n            width: 100px;\r\n            height: 100px;\r\n        }​\r\n    </style>\r\n\r\n".toCharArray();
    __oracle_jsp_text[4] = 
    "\r\n    <table width=\"100%\">\r\n        <tr align=\"left\">\r\n            <td> <h1> ".toCharArray();
    __oracle_jsp_text[5] = 
    ":&nbsp;&nbsp;&nbsp;".toCharArray();
    __oracle_jsp_text[6] = 
    "</h1> </td>\r\n        </tr>\r\n        <tr align=\"center\">\r\n            <td>\r\n                <table width=\"100%\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            <fieldset style='border-style:outset; border-width: ".toCharArray();
    __oracle_jsp_text[7] = 
    "; border-color: ".toCharArray();
    __oracle_jsp_text[8] = 
    ";'>\r\n                                <legend style='font-size:".toCharArray();
    __oracle_jsp_text[9] = 
    "; border-style:solid; border-color:white;  background-color:white; color:black;'>\r\n                                    <strong>\r\n                                        ".toCharArray();
    __oracle_jsp_text[10] = 
    "\r\n                                        <img class=\"fotografia\" width=\"60\" src=\"".toCharArray();
    __oracle_jsp_text[11] = 
    "\" align=\"middle\"/>    \r\n                                        ".toCharArray();
    __oracle_jsp_text[12] = 
    "\r\n                                    </strong>\r\n                                </legend>\r\n                                \r\n                                ".toCharArray();
    __oracle_jsp_text[13] = 
    "\r\n                                    <!-- json Timbrado -->\r\n                                    <table width=\"100%\">\r\n                                        <tr>\r\n                                            <td align=\"center\" style=\"padding: 5px;\">\r\n                                                <br>\r\n                                                <div style=\"width:900px;overflow:auto;\">\r\n                                                    <table id=\"listTimbrado\"></table>\r\n                                                    <div id=\"pagerTimbrado\"></div>   \r\n                                                </div>\r\n                                                <br>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td align=\"center\" style=\"padding: 9px;\">\r\n                                                <h1>".toCharArray();
    __oracle_jsp_text[14] = 
    "</h1>\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                \r\n                                    <script type=\"text/javascript\">\r\n                                        var jsonStrTimbrado = '".toCharArray();
    __oracle_jsp_text[15] = 
    "';\r\n                                        jsonStrTimbrado = jsonStrTimbrado.replace(/&#034;/g,'\"').replace(/\\u00e1/g,'a').replace(/\\u00e9/g,'e').replace(/\\u00ed/g,'i').replace(/\\u00F3/g,'o').replace(/\\u00fa/g,'u');\r\n                                        \r\n                                        $j(\"#listTimbrado\").jqGrid({\r\n                                            datatype: 'jsonstring',\r\n                                            datastr: jsonStrTimbrado,\r\n                                            colNames:[\r\n                                                '#',\r\n                                                '',\r\n                                                'Folio Recibido',\r\n                                                \r\n                                                'Cve. Dif.',\r\n                                                'Folio Pago',\r\n                                                'Tipo Nomina',\r\n                                                'Ciclo',\r\n                                                'Ejercicio Fiscal',\r\n                                                'Plaza',\r\n                                                'Unidad',\r\n                                                'Puesto',\r\n                                                'Grupo Pago',\r\n                                                'Pago Neto',\r\n                                                \r\n                                                'Qna pago',\r\n                                                'Folio Fiscal',\r\n                                                'Fecha Emisi&oacute;n',\r\n                                                //'Nombre(s)',\r\n                                                //'Primer Apellido',\r\n                                                //'Segundo Apellido',\r\n                                                'RFC Empleado',\r\n                                                'Comprobante',\r\n                                                'Paquete',\r\n                                                'Estatus'\r\n                                             ],\r\n                                            colModel:[\r\n                                                { name:'num',               index:'num',                width:35,   align:\"center\", sortable: false},\r\n                                                { name:'acciones',          index:'acciones',           width:63,   align:\"left\",   sortable: false, formatter:actionLinkFormat},\r\n                                                { name:'folioRecibido',     index:'folioRecibido',      width:80,   align:\"center\", sortable: true},\r\n                                                \r\n                                                { name:'hpdiffolio',        index:'hpdiffolio',         width:70,   align:\"center\", sortable: true},\r\n                                                { name:'hpFolio',           index:'hpFolio',            width:80,   align:\"center\", sortable: true},\r\n                                                { name:'hpDescTipoNomina',  index:'hpDescTipoNomina',   width:80,   align:\"center\", sortable: true},\r\n                                                { name:'hpCicloUnidad',     index:'hpCicloUnidad',      width:80,   align:\"center\", sortable: true},\r\n                                                { name:'hpEjercicioFiscal', index:'hpEjercicioFiscal',  width:80,   align:\"center\", sortable: true},\r\n                                                { name:'hpIdPlaza',         index:'hpIdPlaza',          width:80,   align:\"center\", sortable: true},\r\n                                                { name:'hpIdUnidadNom',     index:'hpIdUnidadNom',      width:80,   align:\"center\", sortable: true},\r\n                                                { name:'hpIdPuestoNom',     index:'hpIdPuestoNom',      width:80,   align:\"center\", sortable: true},\r\n                                                { name:'hpDescGrupoPago',   index:'hpDescGrupoPago',    width:80,   align:\"center\", sortable: true},\r\n                                                { name:'hpNeto',            index:'hpNeto',             width:80,   align:\"center\", sortable: true},\r\n                                                \r\n                                                { name:'hpIniPago',         index:'hpIniPago',          width:65,   align:\"center\", sortable: true},\r\n                                                { name:'folioFiscal',       index:'folioFiscal',        width:140,  align:\"center\", sortable: true},\r\n                                                { name:'fechaEmision',      index:'fechaEmision',       width:140,  align:\"center\", sortable: true},\r\n                                                //{ name:'nombreEmpleado',    index:'nombreEmpleado',     width:100,  align:\"center\", sortable: true},\r\n                                                //{ name:'primerApellido',    index:'primerApellido',     width:100,  align:\"center\", sortable: false},\r\n                                                //{ name:'segundoApellido',   index:'segundoApellido',    width:100,  align:\"center\", sortable: true},\r\n                                                { name:'rfcEmpleado',       index:'rfcEmpleado',        width:95,   align:\"center\", sortable: true},\r\n                                                { name:'idComprobante',     index:'idComprobante',      width:80,   align:\"center\", sortable: true},\r\n                                                { name:'idPaquete',         index:'idPaquete',          width:80,   align:\"center\", sortable: true},\r\n                                                { name:'estadoComprobante', index:'estadoComprobante',  width:60,   align:\"center\", sortable: true}\r\n                                            ],\r\n                                            rowNum: \"".toCharArray();
    __oracle_jsp_text[16] = 
    "\",\r\n                                            viewrecords: true\r\n                                        });\r\n                                        \r\n                                        $j(window).resize(function(){\r\n                                            $j('#listTimbrado').jqGrid('setGridHeight', \"".toCharArray();
    __oracle_jsp_text[17] = 
    "\");\r\n                                        });\r\n                                        \r\n                                        function actionLinkFormat(cellvalue, options, rowObject) {\r\n                                            if (rowObject[\"estadoComprobante\"] == \"FIRMADO\") {\r\n                                                return \"<a href='getComprobanteXMLCallback.do?idComprobante=\" + rowObject[\"idComprobante\"] + \"&rfcEmpleado=\" + rowObject[\"rfcEmpleado\"] + \"&idPaquete=\" + rowObject[\"idPaquete\"] + \r\n                                                \"' class='requestlink' title='Descarga comprobante XML'><img width='20' align='middle' src='/sireh/images/expediente/download.png'\\/><\\/a>\" +\r\n                                                \r\n                                                //\"<a href='javascript:showDivFirma(\" + rowObject[\"idComprobante\"] + \",\\\"\" + rowObject[\"rfcEmpleado\"] + \"\\\",\" + rowObject[\"idPaquete\"] + \r\n                                                \"<a href='getComprobantePDFFirmadoCallback.do?StringIdComprobante=\" + rowObject[\"idComprobante\"] + \"&rfcEmpleado=\" + rowObject[\"rfcEmpleado\"] + \"&StringIdPaquete=\" + rowObject[\"idPaquete\"] +  \r\n                                                \");' class='requestlink' title='Descarga representaci&oacute;n impresa'><img width='20' align='middle' src='/sireh/images/expediente/ri.png'\\/><\\/a>\" +\r\n                                                \r\n                                                \"<img width='20' align='middle' src='/sireh/images/expediente/ok.png' title='Comprobante firmado'\\/>\";\r\n                                            } else {\r\n                                                return \"<a href='getComprobanteXMLCallback.do?idComprobante=\" + rowObject[\"idComprobante\"] + \"&rfcEmpleado=\" + rowObject[\"rfcEmpleado\"] + \"&idPaquete=\" + rowObject[\"idPaquete\"] + \r\n                                                \"' class='requestlink' title='Descarga comprobante XML'><img width='20' align='middle' src='/sireh/images/expediente/download.png'\\/><\\/a>\" +\r\n                                                \r\n                                                \"<a href='javascript:showDivFirma(\" + rowObject[\"idComprobante\"] + \",\\\"\" + rowObject[\"rfcEmpleado\"] + \"\\\",\" + rowObject[\"idPaquete\"] + \r\n                                                \");' class='requestlink' title='Firmar comprobante de pago'><img width='20' align='middle' src='/sireh/images/expediente/ri.png'\\/><\\/a>\";\r\n                                            }\r\n                                        }\r\n                                        \r\n                                        // Deshabilitar boton editar\r\n                                        $j(\".ui-icon-pencil\").hide();\r\n                                        \r\n                                        // Deshabilitar boton editar\r\n                                        $j(\".ui-icon-trash\").hide();\r\n                                    </script>\r\n                                ".toCharArray();
    __oracle_jsp_text[18] = 
    "\r\n                            </fieldset>\r\n                        </td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td>&nbsp;</td>\r\n                    </tr>\r\n                </table>\r\n                \r\n                <div id=\"divFirma\" class=\"popup\" style=\"z-index:1;\">\r\n                    <table border=\"0\" width=\"250\" bgcolor=\"#3C3C3C\" cellspacing=\"0\" cellpadding=\"5\">\r\n                        <tr>\r\n                            <td width=\"100%\">\r\n                                <table border=\"0\" width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" height=\"36\">\r\n                                    <tr>\r\n                                        <td style=\"cursor:move\" width=\"100%\" onmousedown=\"javascript:comienzoMovimiento(event, 'divFirma');\">\r\n                                            <font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">Firma Electr&oacute;nica</font>\r\n                                        </td>\r\n                                        <td style=\"cursor:hand\" valign=\"top\" align=\"right\">\r\n                                            <a href=\"#\" onClick=\"closeDivFirma();return false\"><font color=#ffffff size=2 face=arial  style=\"text-decoration:none\">X</font></a>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td width=\"100%\" bgcolor=\"#FFFFFF\" style=\"padding:4px\" colspan=\"2\">\r\n                                            <iframe style=\"height:450px;width:700px;border-style:none;\" src=\"\" name=\"frameFirma\" id=\"frameFirma\"></iframe>\r\n                                            ".toCharArray();
    __oracle_jsp_text[19] = 
    "\r\n                                        </td>\r\n                                    </tr>\r\n                                </table> \r\n                            </td>\r\n                        </tr>\r\n                    </table>\r\n                </div>\r\n            </td>\r\n        </tr>\r\n    </table>\r\n    \r\n    <script type=\"text/javascript\" src=\"\">\r\n        function showDivFirma(idComprobante, rfcEmpleado, idPaquete) {\r\n            if (document.getElementById(\"divFirma\").style.visibility == \"visible\") {\r\n                document.getElementById('divFirma').style.visibility = \"hidden\";\r\n            } else {\r\n                centerInScreen(document.getElementById(\"divFirma\"), '25', '25');\r\n                var frame = document.getElementById(\"frameFirma\");\r\n                frame.src = \"/sireh/consultas/muestraFirmaElectronica.do?inputViewName=iframe:/layout/empty&idComprobante=\" + idComprobante + \"&rfcEmpleado=\" + rfcEmpleado + \"&idPaquete=\" + idPaquete;\r\n                document.getElementById('divFirma').style.visibility = \"visible\";\r\n                \r\n            }\r\n        }\r\n        \r\n        function closeDivFirma() {\r\n            var onCloseFunction = \"\";\r\n            if (onCloseFunction.length > 0) {\r\n                window.parent.eval(onCloseFunction);\r\n            }\r\n            document.getElementById('divFirma').style.visibility = \"hidden\";\r\n            document.getElementById('frameFirma').src = \"\";\r\n        }\r\n        \r\n        function reloadListTimbrado() {\r\n          $j(\"#listTimbrado\").trigger(\"reloadGrid\"); \r\n        }\r\n        \r\n        function centerInScreen(elementoid, leftPosition, topPosition) {\r\n            divTop = parseInt(topPosition);\r\n            divLeft = parseInt(leftPosition);\r\n            divLeft = parseInt((screen.availWidth * divLeft)/100);\r\n            divTop = parseInt((screen.availHeight * divTop)/100);\r\n            if (navegador==0 && isIE6()){\r\n                theLeft = window.document.body.scrollLeft;\r\n                theTop = window.document.body.scrollTop;\r\n            }\r\n            else{\r\n                theLeft = document.documentElement.scrollLeft;\r\n                theTop = document.documentElement.scrollTop;\r\n            }\r\n            theLeft += divLeft;\r\n            theTop += divTop;\r\n            elementoid.style.top = theTop + 'px';\r\n            elementoid.style.left = theLeft + 'px';\r\n        }\r\n        \r\n        $j(document).ready(function(){\r\n            // IE\r\n            if(navigator.userAgent.indexOf(\"MSIE\")>=0) navegador=0;\r\n            // Otros\r\n            else navegador=1;\r\n        });\r\n        \r\n    \r\n    \r\n    </script>\r\n".toCharArray();
    }
    catch (Throwable th) {
      System.err.println(th);
    }
}
}
