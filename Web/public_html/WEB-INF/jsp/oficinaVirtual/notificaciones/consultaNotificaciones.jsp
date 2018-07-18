<%--@Descripcion: Vista encargada de consultar notificaciones.--%>
<%--@Autor: Oscar S.--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>

<html:form name="checkBoxTest" modelAttribute="consultaNotificacionesDTO">
    
    <h1><spring:message code="sireh.label.oficinaVirtual.notificaciones.consulta.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Notificaciones</strong></legend>
                    
                    <!-- notificaciones -->
                    <table width="100%">
                        <tr>
                            <td align="center" style="padding: 5px;">
                                <br />
                                <div style="width:1000px;overflow:auto;">
                                    <table id="listNotificaciones"></table>
                                    <div id="pagerNotificaciones"></div>
                                </div>
                                <br />
                            </td>
                        </tr>
                    </table>
                    
                    <script type="text/javascript">
                        // Grid principal
                        var grid = $j('#listNotificaciones');
                        
                        grid.jqGrid({
                            url: 'jsonCallbackNotificaciones.do', 
                            datatype: 'json',
                            colNames: [
                                'No',
                                'Tipo',
                                'From',
                                'To',
                                'CC',
                                'Titulo',
                                'Usuario',
                                'Fecha',
                                'Estatus'
                            ],
                            colModel: [
                                {name: 'idNotificacion',            index: 'idNotificacion', width: 100, align: "center", sortable: true, sorttype: "text", search: false, formatter:actionLinkFormat},
                                {name: 'descTipoNotificacion',      index: 'descTipoNotificacion', width: 200, align: "center", sortable: true, sorttype: "text", search: true},
                                {name: 'fromRfcNotificacion',       index: 'fromRfcNotificacion', width: 120, align: "center", sortable: true, sorttype: "text", search: true},
                                {name: 'toRfcNotificacion',         index: 'toRfcNotificacion', width: 120, align: "center", sortable: true, sorttype: "text", search: true},
                                {name: 'ccRfcNotificacion',         index: 'ccRfcNotificacion', width: 120, align: "center", sortable: true, sorttype: "text", search: true},
                                {name: 'tituloNotificacion',        index: 'tituloNotificacion', width: 170, align: "center", sortable: true, sorttype: "text", search: true},
                                {name: 'usuario',                   index: 'usuario', width: 100, align: "center", sortable: true, sorttype: "text", search: true},
                                {name: 'fecModifico',               index: 'fecModifico', width: 120, align: "center", sortable: true, sorttype: "text", search: true},
                                {name: 'descSituacionNotificacion', index: 'descSituacionNotificacion', width: 100, align: "center", sortable: true, sorttype: "text", search: true}
                            ],
                            rowNum: "10",
                            multiselect: false,
                            caption: "Notificaciones",
                            pager: '#pagerNotificaciones',
                            viewrecords: true,
                            loadonce: true,
                            height: 200,
                            gridComplete: function() {
                                grid.setGridParam({datatype: 'local'});
                            }
                        });
                        
                        function actionLinkFormat(cellvalue, options, rowObject) {
                            var a = "<a href='detalleNotificacion.do?interior=consulta&idNotificacion=" + rowObject["idNotificacion"] + 
                            "' class='requestlink' title='Detalle notificacion' target='_blank'>" + rowObject["idNotificacion"] + "<\/a>";
                            return a;
                        }
                    </script>
                    <!-- notificaciones -->
                </fieldset>
            </td>
        </tr>
    </table>
    
</html:form>