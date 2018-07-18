<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="context" value="<%=request.getContextPath()%>"/>

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
                            'Docto soporte',
                            'Sector',
                            'Pais',
                            'Periodo',
                            'Organizaci&oacute;n',
                            'Puesto ocupado',
                            'Actividad principal',
                            'Fecha registro'
                        ],
                        colModel:[
                            { name:'num',           index:'num',        width:30,   align:"center", sortable: false},
                            { name:'doctoSop',      index:'doctoSop',   width:85,  align:"center", sortable: true, formatter:currencyFmatter },
                            { name:'sector',        index:'sector',     width:70,  align:"left",   sortable: true},
                            { name:'pais',          index:'pais',       width:95,  align:"left",   sortable: false},
                            { name:'periodo',       index:'periodo',    width:170,   align:"center", sortable: false},
                            { name:'org',           index:'org',        width:100,   align:"center", sortable: false},
                            { name:'puesto',        index:'puesto',     width:150,   align:"center", sortable: false},
                            { name:'actividad',     index:'actividad',  width:150,   align:"center", sortable: false},
                            { name:'fecModifico',   index:'fecfin',     width:95,   align:"center", sortable: false}
                        ],
                        rowNum: "${expedienteDTO.locel}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    
                    function currencyFmatter(cellvalue, options, rowObject){
                        return "<a href='<c:out value='${context}'/>/expediente/downloadFile.do?uuid=" + cellvalue + 
                        "' class='requestlink' title='Descargar documento' target='_blank'><img align='middle' width='20' src='<spring:theme code='pdf-download.jpg'/>'\/><\/a>";
                     }
                    
                    $j(window).resize(function(){
                        $j('#listEL').jqGrid('setGridHeight', "${expedienteDTO.venel}");
                    });
                    
                    $j("#listEL").jqGrid('navGrid','#pagerEL',{add:false,edit:false,del:false,search:false,refresh:false});
                    
                </script>
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
</table>
<br/>
