<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="context" value="<%=request.getContextPath()%>"/>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message  text="Familiares y/o"/>
                            <img class="fotografia" width="50" src="<spring:theme code="familia.jpg"/>" alt="" align="middle"/>
                        <spring:message  text="Dependientes "/>
                    </strong>
                </legend>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <br>
                            <div style="width:950px;overflow:auto;">
                                <table id="listDependientes"></table>
                                <div id="pagerDependientes"/>
                            </div>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;"><h1>
                            <c:out value='Registros localizados: '/>
                            <c:out value="${expedienteDTO.locdep}"/></h1>
                        </td>
                    </tr>
                </table>
                <script type="text/javascript">
                    var jsonStr = '<c:out value="${expedienteDTO.jsonDependientes}"/>';
                    
                    jsonStr = jsonStr.replace(/&#034;/g,'"');
                    $j("#listDependientes").jqGrid({
                        datatype: 'jsonstring',
                        rowNum: "${expedienteDTO.desdep}",
                        datastr: jsonStr,
                        colNames:[
                            '#',
                            'Docto soporte',
                            'Nombre',
                            'Primer apellido',
                            'Segundo apellido',
                            'Fecha nacimiento',
                            'G&eacute;nero',
                            'Parentesco',
                            'Nivel escolar',
                            'Promedio escolar',
                            'Fecha registro'
                        ],
                        colModel:[
                            { name:'num',        index:'nume',       width:30,  align:"center", sortable: false},
                            { name:'doctoSop',   index:'doctoSop',   width:95,  align:"center", sortable: false, formatter:currencyFmatter },
                            { name:'nombre',     index:'nombre',     width:110, align:"left",   sortable: false},
                            { name:'pApellido',  index:'pApellido',  width:95,  align:"left",   sortable: false},
                            { name:'sApellido',  index:'sApellido',  width:105, align:"left",   sortable: false},
                            { name:'fecha',      index:'fecha',      width:120, align:"center", sortable: false},
                            { name:'genero',     index:'genero',     width:70,  align:"center", sortable: false},
                            { name:'parentesco', index:'parentesco', width:110, align:"center", sortable: false},
                            { name:'nivel',      index:'nivel',      width:110, align:"center", sortable: false},
                            { name:'promedio',   index:'promedio',   width:105, align:"center", sortable: false},
                            { name:'fecModifico',index:'fecModifico',width:105, align:"center", sortable: false}
                        ],
                        rowNum: "${expedienteDTO.locdep}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    
                    function currencyFmatter(cellvalue, options, rowObject){
                        return "<a href='<c:out value='${context}'/>/expediente/downloadFile.do?uuid=" + cellvalue + 
                        "' class='requestlink' title='Descargar documento' target='_blank'><img align='middle' width='20' src='<spring:theme code='pdf-download.jpg'/>'\/><\/a>";
                     }
                    
                    $j(window).resize(function(){
                        $j('#listDependientes').jqGrid('setGridHeight', "${expedienteDTO.vendep}");
                    });                    
                    
                    $j("#listDependientes").jqGrid('navGrid','#pagerDependientes',{add:false,edit:false,del:false,search:false,refresh:false});
                    
                </script>
            </fieldset>
        </td>
    </tr>
</table>
<br/>