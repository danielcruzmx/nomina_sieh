<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="context" value="<%=request.getContextPath()%>"/>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                    <spring:message text="Antecedentes"/>
                    <img class="fotografia" width="45" src="<spring:theme code="titulado.jpg"/>" align="middle"/>      
                    <spring:message text="Acad&eacute;micos "/></strong>
                </legend>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <br>
                            <div style="width:950px;overflow:auto;">
                                <table id="listAnAcademicos"></table>
                                <div id="pagerAnAcademicos"/>
                            </div>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;"><h1>
                            <c:out value='Registros localizados: '/>
                            <c:out value="${expedienteDTO.locAnAc}"/></h1>
                        </td>
                    </tr>
                </table>
                
                <script type="text/javascript">
                    var jsonStr = '<c:out value="${expedienteDTO.jsonAntAcademicos}"/>';
                    
                    jsonStr = jsonStr.replace(/&#034;/g,'"');
                    $j("#listAnAcademicos").jqGrid({
                        datatype: 'jsonstring',
                        rowNum: "${expedienteDTO.descAnAc}",
                        datastr: jsonStr,
                        colNames:[
                            '#',
                            'Docto soporte',
                            'Nivel escolar',
                            'Escolaridad / Carrera',
                            'Est. Concluidos',
                            'Inst. Educativa',
                            'Promedio',
                            'Cedula profesional',
                            'Fecha registro'
                        ],
                        colModel:[
                            { name:'num',           index:'nume',          width:30,  align:"center", sortable: false},
                            { name:'doctoSop',      index:'doctoSop',      width:95,  align:"center", sortable: false, formatter:currencyFmatter },
                            { name:'nEscolar',      index:'nEscolar',      width:210, align:"left",   sortable: false},
                            { name:'escdad',        index:'escdad',        width:180, align:"left",   sortable: false},
                            { name:'estudios',      index:'estudios',      width:105, align:"center", sortable: false},
                            { name:'instit',        index:'instit',        width:120, align:"center", sortable: false},
                            { name:'promedio',      index:'promedio',      width:70,  align:"center", sortable: false},
                            { name:'cedula',        index:'cedula',        width:130, align:"center", sortable: false},
                            { name:'fecModifico',   index:'fecModifico',   width:105, align:"center", sortable: false}
                        ],
                        rowNum: "${expedienteDTO.locAnAc}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    
                    function currencyFmatter(cellvalue, options, rowObject){
                        return "<a href='<c:out value='${context}'/>/expediente/downloadFile.do?uuid=" + cellvalue + 
                        "' class='requestlink' title='Descargar documento' target='_blank'><img align='middle' width='20' src='<spring:theme code='pdf-download.jpg'/>'\/><\/a>";
                     }
                    
                    $j(window).resize(function(){
                        $j('#listDependientes').jqGrid('setGridHeight', "${expedienteDTO.venAnAc}");
                    });
                    
                    $j("#listAnAcademicos").jqGrid('navGrid','#pagerAnAcademicos',{add:false,edit:false,del:false,search:false,refresh:false});
                   
                </script>
                
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<br/>