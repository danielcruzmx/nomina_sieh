<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<table cellspacing="0" cellpadding="0" border="0" width="100%">
    <!--colgroup>
        <col width="65%"/>
        <col width="35%"/>
    <colgroup>-->
    <tr>
        <td valign="middle" align="center" height="320px">
            <spring:message code="welcome.message"/>

            <!-- anuncios -->
            <fsn:anuncio/>
            <!-- anuncios -->
        </td>
        <!--<td valign="top" align="center" height="320px">
            <table width="100%">
                <tr>
                    <td align="center">
                        <br />
                        <div style="width:500px;overflow:auto;">
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
                    url: '/sireh/notificacion/jsonCallbackNotificaciones.do', 
                    datatype: 'json',
                    colNames: [
                        'No',
                        'Titulo',
                        'Fecha',
                        'Estatus',
                    ],
                    colModel: [
                        {name: 'idNotificacion',            index: 'idNotificacion', width: 100, align: "center", sortable: true, sorttype: "text", search: false, formatter:actionLinkFormat},
                        {name: 'tituloNotificacion',        index: 'tituloNotificacion', width: 170, align: "center", sortable: true, sorttype: "text", search: false},
                        {name: 'fecModifico',               index: 'fecModifico', width: 120, align: "center", sortable: true, sorttype: "text", search: false},
                        {name: 'descSituacionNotificacion', index: 'descSituacionNotificacion', width: 100, align: "center", sortable: true, sorttype: "text", search: false}
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
                    var a = "<a href='/sireh/notificacion/detalleNotificacion.do?interior=home&idNotificacion=" + rowObject["idNotificacion"] + 
                    "' class='requestlink' title='Detalle notificaci&oacute;n' target='_blank'>" + rowObject["idNotificacion"] + "<\/a>";
                    return a;
                }
            </script>
        </td>-->
    </tr>
</table>