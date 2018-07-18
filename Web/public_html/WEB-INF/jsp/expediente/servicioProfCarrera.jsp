<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="context" value="<%=request.getContextPath()%>"/>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text="Servicio Profesional"/>
                            <img class="fotografia" width="45" src="<spring:theme code="persona.jpg"/>" align="middle"/>       
                        <spring:message text="de Carrera"/>
                    </strong>
                </legend>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <br>
                            <div style="width:950px;overflow:auto;">
                                <table id="listaSPC"></table>
                                <div id="pagerSPC"/>
                            </div>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;"><h1>
                            <c:out value='Registros localizados: '/>
                            <c:out value="${expedienteDTO.locSPC}"/></h1>
                        </td>
                    </tr>
                </table>
                <script type="text/javascript">
                    var jsonStr = '<c:out value="${expedienteDTO.jsonSPC}"/>';
                    
                    jsonStr = jsonStr.replace(/&#034;/g,'"');
                    $j("#listaSPC").jqGrid({
                        datatype: 'jsonstring',
                        rowNum: "${expedienteDTO.desSPC}",
                        datastr: jsonStr,
                        colNames:[
                            '#',
                            'Docto soporte',
                            //'Tipo documento',
                            'Descripcion documento',
                            'A&ntilde;o documento',
                            'Fecha registro'
                        ],
                        colModel:[
                            { name:'num',               index:'',           width:50,  align:"center", sortable: false},
                            { name:'dsdDoctoRef',       index:'',           width:150,  align:"center", sortable: false, formatter:currencyFmatter },
                            //{ name:'descDocto',       index:'',           width:200, align:"left",   sortable: false},
                            { name:'dsdDescripDocto',   index:'',           width:450, align:"left",   sortable: false},
                            { name:'dsdAxoDocto',       index:'',           width:150, align:"center", sortable: false},
                            { name:'fecModifico',       index:'fecModifico',width:150, align:"center", sortable: false}
                        ],
                        rowNum: "${expedienteDTO.locSPC}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    
                    function currencyFmatter(cellvalue, options, rowObject){
                        return "<a href='<c:out value='${context}'/>/expediente/downloadFile.do?uuid=" + cellvalue + 
                        "' class='requestlink' title='Descargar documento' target='_blank'><img align='middle' width='20' src='<spring:theme code='pdf-download.jpg'/>'\/><\/a>";
                     }
                    
                    $j(window).resize(function(){
                        $j('#listaSPC').jqGrid('setGridHeight', "${expedienteDTO.venSPC}");
                    });
                    
                    
                    $j("#listDependientes").jqGrid('navGrid','#pagerDependientes',{add:false,edit:false,del:false,search:false,refresh:false});
                </script>
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<br/>