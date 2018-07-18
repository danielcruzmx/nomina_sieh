<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    #divFirma{
        position: absolute;
        top: 50%;
        left: 50%;
        margin-top: -50px;
        margin-left: -50px;
        width: 100px;
        height: 100px;
    }​
</style>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text="Comprobantes"/>
                        <img class="fotografia" width="60" src="<spring:theme code="pagonomina.jpg"/>" align="middle"/>    
                        <spring:message text="de Pago"/>
                    </strong>
                </legend>
                
                <c:if test="${expedienteDTO.userComprobante}">
                    <!-- json Timbrado -->
                    <table width="100%">
                        <tr>
                            <td align="center" style="padding: 5px;">
                                <br>
                                <div style="width:900px;overflow:auto;">
                                    <table id="listTimbrado"></table>
                                    <div id="pagerTimbrado"></div>   
                                </div>
                                <br>
                            </td>
                        </tr>
                        <tr>
                            <td align="center" style="padding: 9px;">
                                <h1><c:out value='Registros localizados: '/><c:out value="${expedienteDTO.locTimbrado}"/></h1>
                            </td>
                        </tr>
                    </table>

                    <script type="text/javascript">
                        var jsonStrTimbrado = '<c:out value="${expedienteDTO.jsonTimbrado}"/>';
                        jsonStrTimbrado = jsonStrTimbrado.replace(/&#034;/g,'"').replace(/\u00e1/g,'a').replace(/\u00e9/g,'e').replace(/\u00ed/g,'i').replace(/\u00F3/g,'o').replace(/\u00fa/g,'u');
                        
                        $j("#listTimbrado").jqGrid({
                            datatype: 'jsonstring',
                            datastr: jsonStrTimbrado,
                            colNames:[
                                '#',
                                '',
                                'Folio Recibido',
                                'Cve. Dif.',
                                'Folio Pago',
                                'Tipo Nomina',
                                'Ciclo',
                                'Ejercicio Fiscal',
                                'Plaza',
                                'Unidad',
                                'Puesto',
                                'Grupo Pago',
                                'Pago Neto',
                                
                                'Qna pago',
                                'Folio Fiscal',
                                'Fecha Emisi&oacute;n',
                                //'Nombre(s)',
                                //'Primer Apellido',
                                //'Segundo Apellido',
                                'RFC Empleado',
                                'Comprobante',
                                'Paquete',
                                'Estatus'
                             ],
                            colModel:[
                                { name:'num',               index:'num',                width:35,   align:"center", sortable: false},
                                { name:'acciones',          index:'acciones',           width:68,   align:"left",   sortable: false, formatter:actionLinkFormat},
                                { name:'folioRecibido',     index:'folioRecibido',      width:85,   align:"center", sortable: true},
                                { name:'hpdiffolio',        index:'hpdiffolio',         width:70,   align:"center", sortable: true},
                                { name:'hpFolio',           index:'hpFolio',            width:80,   align:"center", sortable: true},
                                { name:'hpDescTipoNomina',  index:'hpDescTipoNomina',   width:80,   align:"center", sortable: true},
                                { name:'hpCicloUnidad',     index:'hpCicloUnidad',      width:80,   align:"center", sortable: true},
                                { name:'hpEjercicioFiscal', index:'hpEjercicioFiscal',  width:80,   align:"center", sortable: true},
                                { name:'hpIdPlaza',         index:'hpIdPlaza',          width:80,   align:"center", sortable: true},
                                { name:'hpIdUnidadNom',     index:'hpIdUnidadNom',      width:80,   align:"center", sortable: true},
                                { name:'hpIdPuestoNom',     index:'hpIdPuestoNom',      width:80,   align:"center", sortable: true},
                                { name:'hpDescGrupoPago',   index:'hpDescGrupoPago',    width:80,   align:"center", sortable: true},
                                { name:'hpNeto',            index:'hpNeto',             width:80,   align:"center", sortable: true},
                                
                                { name:'hpIniPago',         index:'hpIniPago',          width:65,   align:"center", sortable: true},
                                { name:'folioFiscal',       index:'folioFiscal',        width:140,  align:"center", sortable: true},
                                { name:'fechaEmision',      index:'fechaEmision',       width:140,  align:"center", sortable: true},
                                //{ name:'nombreEmpleado',    index:'nombreEmpleado',     width:100,  align:"center", sortable: true},
                                //{ name:'primerApellido',    index:'primerApellido',     width:100,  align:"center", sortable: false},
                                //{ name:'segundoApellido',   index:'segundoApellido',    width:100,  align:"center", sortable: true},
                                { name:'rfcEmpleado',       index:'rfcEmpleado',        width:95,   align:"center", sortable: true},
                                { name:'idComprobante',     index:'idComprobante',      width:80,   align:"center", sortable: true},
                                { name:'idPaquete',         index:'idPaquete',          width:80,   align:"center", sortable: true},
                                { name:'estadoComprobante', index:'estadoComprobante',  width:60,   align:"center", sortable: true}
                            ],
                            rowNum: "${expedienteDTO.locTimbrado}",
                            viewrecords: true
                        });
                        
                        $j(window).resize(function(){
                            $j('#listTimbrado').jqGrid('setGridHeight', "${expedienteDTO.venTimbrado}");
                        });
                        
                        function actionLinkFormat(cellvalue, options, rowObject) {
                            if (rowObject["estadoComprobante"] == "FIRMADO") {
                                return "<a href='getComprobanteXMLCallback.do?idComprobante=" + rowObject["idComprobante"] + "&rfcEmpleado=" + rowObject["rfcEmpleado"] + "&idPaquete=" + rowObject["idPaquete"] + 
                                "' class='requestlink' title='Descarga comprobante XML'><img width='20' align='middle' src='/sireh/images/expediente/download.png'\/><\/a>" +
                                
                                //"<a href='javascript:showDivFirma(" + rowObject["idComprobante"] + ",\"" + rowObject["rfcEmpleado"] + "\"," + rowObject["idPaquete"] + 
                                "<a href='getComprobantePDFFirmadoCallback.do?StringIdComprobante=" + rowObject["idComprobante"] + "&rfcEmpleado=" + rowObject["rfcEmpleado"] + "&StringIdPaquete=" + rowObject["idPaquete"] +  
                                ");' class='requestlink' title='Descarga representaci&oacute;n impresa'><img width='20' align='middle' src='/sireh/images/expediente/ri.png'\/><\/a>" +
                                
                                "<img width='20' align='middle' src='/sireh/images/expediente/ok.png' title='El comprobante ya ha sido firmado'\/>";
                            } else {
                                return "<a href='getComprobanteXMLCallback.do?idComprobante=" + rowObject["idComprobante"] + "&rfcEmpleado=" + rowObject["rfcEmpleado"] + "&idPaquete=" + rowObject["idPaquete"] + 
                                "' class='requestlink' title='Descarga comprobante XML'><img width='20' align='middle' src='/sireh/images/expediente/download.png'\/><\/a>" +
                                
                                "<a href='javascript:showDivFirma(" + rowObject["idComprobante"] + ",\"" + rowObject["rfcEmpleado"] + "\"," + rowObject["idPaquete"] + 
                                ");' class='requestlink' title='Descarga representaci&oacute;n impresa'><img width='20' align='middle' src='/sireh/images/expediente/ri.png'\/><\/a>";
                            }
                        }
                        
                        // Deshabilitar boton editar
                        $j(".ui-icon-pencil").hide();
                        
                        // Deshabilitar boton editar
                        $j(".ui-icon-trash").hide();
                    </script>
                </c:if>
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>

<div id="divFirma" class="popup" style="z-index:1;">
    <table border="0" width="250" bgcolor="#3C3C3C" cellspacing="0" cellpadding="5">
        <tr>
            <td width="100%">
                <table border="0" width="100%" cellspacing="0" cellpadding="0" height="36">
                    <tr>
                        <td style="cursor:move" width="100%" onmousedown="javascript:comienzoMovimiento(event, 'divFirma');">
                            <font color=#ffffff size=2 face=arial  style="text-decoration:none">Firma Electr&oacute;nica</font>
                        </td>
                        <td style="cursor:hand" valign="top" align="right">
                            <a href="#" onClick="closeDivFirma();return false"><font color=#ffffff size=2 face=arial  style="text-decoration:none">X</font></a>
                        </td>
                    </tr>
                    <tr>
                        <td width="100%" bgcolor="#FFFFFF" style="padding:4px" colspan="2">
                            <iframe style="height:450px;width:700px;border-style:none;" src="" name="frameFirma" id="frameFirma"></iframe>
                            <%--iframe style="height:600px;width:1000px;border-style:none;" src="" name="frameFirma" id="frameFirma"></iframe--%>
                        </td>
                    </tr>
                </table> 
            </td>
        </tr>
    </table>
</div>

<script type="text/javascript">
    function showDivFirma(idComprobante, rfcEmpleado, idPaquete) {        
        if (document.getElementById("divFirma").style.visibility == "visible") {
            document.getElementById('divFirma').style.visibility = "hidden";
        } else {
            centerInScreen(document.getElementById("divFirma"), '25', '25');
            var frame = document.getElementById("frameFirma");
            frame.src = "/sireh/expediente/muestraFirmaElectronica.do?inputViewName=iframe:/layout/empty&idComprobante=" + idComprobante + "&rfcEmpleado=" + rfcEmpleado + "&idPaquete=" + idPaquete;
            document.getElementById('divFirma').style.visibility = "visible";
        }
    }
    
    function closeDivFirma() {
        var onCloseFunction = "";
        if (onCloseFunction.length > 0) {
            window.parent.eval(onCloseFunction);
        }
        document.getElementById('divFirma').style.visibility = "hidden";
        document.getElementById('frameFirma').src = "";
    }
    
    function reloadListTimbrado() {
      $j("#listTimbrado").trigger("reloadGrid"); 
    }
</script>
<br/>