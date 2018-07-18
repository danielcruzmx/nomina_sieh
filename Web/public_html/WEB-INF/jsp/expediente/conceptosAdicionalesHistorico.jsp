<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text="Conceptos de N&oacute;mina"/>
                        <img class="fotografia" width="70" src="<spring:theme code="tache.jpg"/>" align="middle"/>       
                        <spring:message text=" Adicionales Hist&oacute;ricos"/>
                    </strong>
                </legend>

                <!-- jsonConceptosAdicionalesHistóricos-->
                <table width="100%">
                    <tr>
                        <td align="center" style="padding: 5px;">
                            <br>
                            <div style="width:900px;overflow:auto;">
                                <table id="listCAH"></table>
                                <div id="pagerCAH"></div>
                            </div>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;">
                            <h1><c:out value='Registros localizados: '/><span id="recordsNoVigentes"></span></h1> 
                        </td>
                    </tr>
                </table>
                <script type="text/javascript">
                    var jsonStrcah = '<c:out value="${expedienteDTO.jsonCAH}"/>';
                    jsonStrcah = jsonStrcah.replace(/&#034;/g,'"');

                    var jsonObjNo = $j.parseJSON(jsonStrcah);
                    $j('#recordsNoVigentes').text(jsonObjNo['records']);

                    $j("#listCAH").jqGrid({
                        datatype: 'jsonstring',
                        datastr: jsonStrcah,
                        colNames:[
                            '#',
                            'Tipo',
                            'Clave',
                            'Descripci&oacute;n',
                            'Instituci&oacute;n',
                            'Importe',
                            'Porcentaje',
                            'Qna. Inicio',
                            'Qna. Final',
                            'Aplicadas',
                            'Estado',
                            'Usuario',
                            'Fecha modificaci&oacute;n'
                        ],
                        colModel:[
                            { name:'num',             index:'num',            width:28,  align:"center", sortable: false},
                            { name:'tipo',            index:'tipo',           width:58,  align:"left",   sortable: true},
                            { name:'clave',           index:'clave',          width:32,  align:"center", sortable: true},
                            { name:'descripcion',     index:'descripcion',    width:220, align:"left",   sortable: false},
                            { name:'institucion',     index:'institucion',    width:160, align:"left",   sortable: true},
                            { name:'importe',         index:'importe',        width:65,  align:"right",  sortable: false},
                            { name:'porcentaje',      index:'porcentaje',     width:58,  align:"right",  sortable: false},
                            { name:'qnainicial',      index:'qnainicial',     width:60,  align:"center", sortable: true},
                            { name:'qnafinal',        index:'qnafinal',       width:60,  align:"center", sortable: true},
                            { name:'qnasaplicadas',   index:'qnasaplicadas',  width:58,  align:"center", sortable: false},
                            { name:'descSitCaptura',  index:'descSitCaptura', width:135, align:"left",   sortable: false},
                            { name:'usuario',         index:'usuario',        width:80,  align:"center", sortable: true},
                            { name:'fecModifico',     index:'fecModifico',    width:125, align:"center", sortable: true}
                        ],
                        rowNum: "${expedienteDTO.loccah}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    $j(window).resize(function(){
                        $j('#listCAH').jqGrid('setGridHeight', "${expedienteDTO.vencah}");
                    });
                </script>
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
</table>
<br/>
