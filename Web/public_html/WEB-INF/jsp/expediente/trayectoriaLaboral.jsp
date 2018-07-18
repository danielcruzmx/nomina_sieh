<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text=" Trayectoria"/>
                            <img class="fotografia" width="55" src="<spring:theme code="flecha.jpg"/>" align="middle"/>
                        <spring:message text="Laboral "/>
                    </strong>
                </legend>

                <!-- jsonExperienciaLaboral -->
                <table width="100%">
                    <tr>
                        <td align="center" style="padding: 5px;">
                            <br>
                            <div style="width:900px;overflow:auto;">
                                <table id="listTL"></table>
                                <div id="pagerTL"></div>
                            </div>
                            </br>
                        </td>
                    </tr>
                     <tr>
                        <td align="center" style="padding: 9px;"><h1>
                            <c:out value='Registros localizados: '/>
                            <c:out value="${expedienteDTO.loctl}"/>  
                        </td>
                    </tr>
                </table>
                
                <script type="text/javascript">
                    var jsonStrtl = '<c:out value="${expedienteDTO.jsonTL}"/>';
                    jsonStrtl = jsonStrtl.replace(/&#034;/g,'"');
                    $j("#listTL").jqGrid({
                        datatype: 'jsonstring',
                        datastr: jsonStrtl,
                        colNames:[
                            '#',
                             'Descripci&oacute;n',
                             'Vigencia',
                             'Unidad',
                             'Puesto',
                             'Plaza',
                             'Nombramiento',
                             'Grupo de pago',
                             'Movimiento',
                             'Qna. Captura',
                             'Usuario',
                             'Fecha modificaci&oacute;n'
                         ],
                        colModel:[
                            { name:'num',          index:'num',          width:30,  align:"center", sortable: false},
                            { name:'descripcion',  index:'descripcion',  width:250, align:"left",   sortable: true},
                            { name:'vigencia',     index:'vigencia',     width:150, align:"center", sortable: false},
                            { name:'ur',           index:'ur',           width:50,  align:"center", sortable: false},                                    
                            { name:'pto',          index:'pto',          width:60,  align:"center", sortable: false},                                    
                            { name:'plaza',        index:'plaza',        width:60,  align:"center", sortable: false},                                    
                            { name:'nombramiento', index:'nombramiento', width:100, align:"left",   sortable: false},                                    
                            { name:'grupopago',    index:'grupopago',    width:125, align:"center", sortable: true},                                    
                            { name:'sitmov',       index:'sitmov',       width:80, align:"center",  sortable: true},
                            { name:'qnacap',       index:'qnacap',       width:80, align:"center",  sortable: true},                            
                            { name:'usuario',      index:'usuario',      width:80, align:"center",  sortable: true},
                            { name:'fecModifico',  index:'fecModifico',  width:125, align:"center",  sortable: true}
                        ],
                        rowNum: "${expedienteDTO.loctl}",
                   <%--     pager: '#pagerTL',   --%>
                        viewrecords: true,
                        loadonce: true,
                    });
                    $j(window).resize(function(){
                        $j('#listTL').jqGrid('setGridHeight', "${expedienteDTO.ventl}");
                    });
                </script>
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
</table>
<br/>