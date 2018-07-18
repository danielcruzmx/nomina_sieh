<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text="Conceptos de"/>
                        <img class="fotografia" width="90" src="<spring:theme code="interes.jpg"/>" align="middle"/>       
                        <spring:message text="N&oacute;mina Adicionales"/>
                    </strong>
                </legend>

                <!-- jsonExperienciaLaboral -->
                <table width="100%">
                    <tr>
                        <td align="center" style="padding: 5px;">
                            <br>
                            <div style="width:900px;overflow:auto;">
                                <table id="listCA"></table>
                                <div id="pagerCA"></div>
                            </div>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;">
                            <h1><c:out value='Registros localizados: '/><span id="recordsVigentes"></span></h1> 
                        </td>
                    </tr>
                </table>
                <script type="text/javascript">
                    var jsonStrca = '<c:out value="${expedienteDTO.jsonCA}"/>';
                    jsonStrca = jsonStrca.replace(/&#034;/g,'"');
                    
                    var jsonObjSi = $j.parseJSON(jsonStrca);
                    $j('#recordsVigentes').text(jsonObjSi['records']);
                    
                    $j("#listCA").jqGrid({
                        datatype: 'jsonstring',
                        datastr: jsonStrca,
                        colNames:[
                            '#',
                            'Tipo',
                            'Clave',
                            'Descripci&oacute;n',
                            'Instituci&oacute;n',
                            'Importe',
                            'Porcentaje',
                            'Qna. Inicial',
                            'Qna. Final',
                            'Aplicadas',
                            'Usuario',
                            'Fecha modificaci&oacute;n'
                        ],
                        colModel:[
                            { name:'num',             index:'num',           width:30,  align:"center", sortable: false},
                            { name:'tipo',            index:'tipo',          width:60,  align:"left",   sortable: true},
                            { name:'clave',           index:'clave',         width:40,  align:"center", sortable: true},
                            { name:'descripcion',     index:'descripcion',   width:230, align:"left",   sortable: false},
                            { name:'institucion',     index:'institucion',   width:230, align:"left",   sortable: true},
                            { name:'importe',         index:'importe',       width:60,  align:"right",  sortable: false},
                            { name:'porcentaje',      index:'porcentaje',    width:60,  align:"right",  sortable: false},
                            { name:'qnainicial',      index:'qnainicial',    width:65,  align:"center", sortable: true},
                            { name:'qnafinal',        index:'qnafinal',      width:65,  align:"center", sortable: true},
                            { name:'qnasaplicadas',   index:'qnasaplicadas', width:65,  align:"center", sortable: false},
                            { name:'usuario',         index:'usuario',       width:80,  align:"center", sortable: true},
                            { name:'fecModifico',     index:'fecModifico',   width:125, align:"center", sortable: true}
                        ],
                        rowNum: "${expedienteDTO.locca}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    $j(window).resize(function(){
                        $j('#listCA').jqGrid('setGridHeight', "${expedienteDTO.venca}");
                    });
                </script>
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
</table>
<br/>
