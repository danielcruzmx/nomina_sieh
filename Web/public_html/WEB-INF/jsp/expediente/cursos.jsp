<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="context" value="<%=request.getContextPath()%>"/>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text="Capacitaci&oacute;n"/>
                            <img class="fotografia" width="55" src="<spring:theme code="capacitacion.jpg"/>" align="middle"/>       
                        <spring:message text="y Cursos"/>
                    </strong>
                </legend>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <br>
                            <div style="width:950px;overflow:auto;">
                                <table id="listaCursos"></table>
                                <div id="pagerCursos"/>
                            </div>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;"><h1>
                            <c:out value='Registros localizados: '/>
                            <c:out value="${expedienteDTO.locCursos}"/></h1>
                        </td>
                    </tr>
                </table>
                <script type="text/javascript">
                    var jsonStr = '<c:out value="${expedienteDTO.jsonCursos}"/>';
                    
                    jsonStr = jsonStr.replace(/&#034;/g,'"');
                    $j("#listaCursos").jqGrid({
                        datatype: 'jsonstring',
                        rowNum: "${expedienteDTO.desCursos}",
                        datastr: jsonStr,
                        colNames:[
                            '#',
                            'Docto soporte',
                            //'ID Capacitaci&oacute;n',
                            'Nivel Capacitaci&oacute;n',
                            'Desc. Capacitaci&oacute;n',
                            'Instituci&oacute;n Educativa',
                            'Cap. Promedio',
                            'Cap. Concluida',
                            'Fecha registro'
                        ],
                        colModel:[
                            { name:'num',        index:'nume',       width:30,  align:"center", sortable: false},
                            { name:'doctoSop',   index:'doctoSop',   width:95,  align:"center", sortable: false, formatter:currencyFmatter },
                            //{ name:'idCap',    index:'idCap',      width:110, align:"left",   sortable: false},
                            { name:'nivCap',     index:'nivCap',     width:110,  align:"left",   sortable: false},
                            { name:'descCap',    index:'descCap',    width:350, align:"left",   sortable: false},
                            { name:'instEduc',   index:'instEduc',   width:150, align:"center", sortable: false},
                            { name:'capProm',    index:'capProm',    width:70,  align:"center", sortable: false},
                            { name:'capConcl',   index:'capConcl',   width:110, align:"center", sortable: false},
                            { name:'fecModifico',index:'fecModifico',width:105, align:"center", sortable: false}
                        ],
                        rowNum: "${expedienteDTO.locCursos}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    
                    function currencyFmatter(cellvalue, options, rowObject){
                        return "<a href='<c:out value='${context}'/>/expediente/downloadFile.do?uuid=" + cellvalue + 
                        "' class='requestlink' title='Descargar documento' target='_blank'><img align='middle' width='20' src='<spring:theme code='pdf-download.jpg'/>'\/><\/a>";
                     }
                    
                    $j(window).resize(function(){
                        $j('#listaCursos').jqGrid('setGridHeight', "${expedienteDTO.venCursos}");
                    });
                    
                    $j("#listaCursos").jqGrid('navGrid','#pagerCursos',{add:false,edit:false,del:false,search:false,refresh:false});
                    
                </script>
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<br/>