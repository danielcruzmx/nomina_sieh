<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                   <spring:message text="Experiencia"/>
                    <img class="fotografia" width="80" src="<spring:theme code="edificios.jpg"/>"  align="middle"/> 
                    <spring:message text="Laboral "/></strong>
                </legend>

                <%-- jsonExperienciaLaboral --%>
                <table width="100%">
                    <tr>
                        <td align="center" style="padding: 5px;">
                            <br>
                            <table id="listEL"></table>
                            <div id="pagerEL"></div>   
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;">
                            <h1><c:out value='Registros localizados: '/> <c:out value="${expedienteDTO.locel}"/></h1> 
                        </td>
                    </tr>
                </table>
                <script type="text/javascript">
                    var jsonStrel = '<c:out value="${expedienteDTO.jsonEL}"/>';
                    jsonStrel = jsonStrel.replace(/&#034;/g,'"');
                    $j("#listEL").jqGrid({
                        datatype: 'jsonstring',
                        datastr: jsonStrel,

                        colNames:[
                            '#',
                            'Empresa/Instituci&oacute;n',
                            'Cargo',
                            'Actividad principal',
                            'Fecha inicio',
                            'Fecha fin'
                        ],

                        colModel:[
                            { name:'num',      index:'num',    width:30,    align:"center", sortable: false},
                            { name:'empresa',  index:'empresa', width:250,  align:"left",   sortable: true},
                            { name:'cargo',    index:'cargo',   width:250,  align:"left",   sortable: true},
                            { name:'actpri',   index:'actpri',  width:250,  align:"left",   sortable: false},
                            { name:'fecini',   index:'fecini',  width:75,   align:"center", sortable: false},
                            { name:'fecfin',   index:'fecfin',  width:75,   align:"center", sortable: false}
                        ],
                        rowNum: "${expedienteDTO.locel}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    $j(window).resize(function(){
                        $j('#listEL').jqGrid('setGridHeight', "${expedienteDTO.venel}");
                    });
                </script>
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
</table>
<br/>
