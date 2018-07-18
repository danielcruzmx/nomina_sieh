<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                     <spring:message text="Incidencias"/>
                     <img class="fotografia" width="65" src="<spring:theme code="letreroissste.jpg"/>" align="middle"/>                                   
                    <spring:message text="Laborales "/></strong>
                </legend>

                <!-- json incidencias de personal -->
                <table width="100%">
                    <tr>
                        <td align="center" style="padding: 5px;">
                            <br>
                            <div style="width:900px;overflow:auto;">
                                <table id="listIP"></table>
                                <div id="pagerIP"></div>
                            </div>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;">
                            <h1><c:out value='Registros localizados: '/><c:out value="${expedienteDTO.locip}"/></h1>
                        </td>
                    </tr>
                </table>

                <script type="text/javascript">
                    var jsonStrip = '<c:out value="${expedienteDTO.jsonIP}"/>';
                    jsonStrip = jsonStrip.replace(/&#034;/g,'"');
                    $j("#listIP").jqGrid({
                        datatype: 'jsonstring',
                        datastr: jsonStrip,
                        colNames:[
                            '#',
                            'Status',
                            'Tipo',
                            'Concepto',
                            'Descripci&oacute;n',
                            'Qna. captura',
                            'Monto',
                            'Fecha incidencia',
                            'Usuario',
                            'Fecha modificaci&oacute;n'
                         ],
                        colModel:[
                            { name:'num',         index:'num',         width:30,  align:"center",  sortable: false},
                            { name:'estado',      index:'estado',      width:75, align:"left",     sortable: true},
                            { name:'tipo',        index:'tipo',        width:150, align:"left",    sortable: true},
                            { name:'concepto',    index:'concepto',    width:60,  align:"center",  sortable: true},
                            { name:'descripcion', index:'descripcion', width:250, align:"left",    sortable: false},
                            { name:'qnacap',      index:'qnacap',      width:75,  align:"center",  sortable: true},
                            { name:'monto',       index:'monto',       width:75,  align:"right",   sortable: false},
                            { name:'fecha',       index:'fecha',       width:100,  align:"center", sortable: false},
                            { name:'usuario',     index:'usuario',     width:80, align:"center",  sortable: true},
                            { name:'fecModifico', index:'fecModifico', width:125, align:"center",  sortable: true}
                        ],
                        rowNum: "${expedienteDTO.locip}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    $j(window).resize(function(){
                        $j('#listIP').jqGrid('setGridHeight', "${expedienteDTO.venip}");
                    });
                </script>
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
</table>
<br/>