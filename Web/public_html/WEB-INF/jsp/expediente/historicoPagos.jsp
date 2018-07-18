<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text="Hist&oacute;rico"/>
                        <img class="fotografia" width="60" src="<spring:theme code="pagonomina.jpg"/>" align="middle"/>    
                        <spring:message text="de Pagos "/>
                    </strong>
                </legend>
                
                <!-- jsonHistorico de pagos -->
                <table width="100%">
                    <tr>
                        <td align="center" style="padding: 5px;">
                            <br>
                            <table id="listPN"></table>
                            <div id="pagerPN"></div>   
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="center" style="padding: 9px;">
                            <h1><c:out value='Registros localizados: '/><c:out value="${expedienteDTO.locpn}"/></h1>
                        </td>
                    </tr>
                </table>

                <script type="text/javascript">
                    var jsonStrpn = '<c:out value="${expedienteDTO.jsonPN}"/>';
                    //var jsonStrpn = '{"total":1,"rows":[{"cell":{"plaza":"78059","periodo":"01-07-2014 - 31-07-2014","num":1,"grupo":"Personal Eventual",  "nomina":"Nómina Ordinaria", "ejercicio":"2014","folio":"57912496","clabe":"012180029684893357","unidad":"210","neto":"  $31,496.61","qna":"201414","puesto":"CFNC003"},"id":"1"}],"records":"1","page":"1"}';
                    jsonStrpn = jsonStrpn.replace(/&#034;/g,'"').replace(/\u00e1/g,'a').replace(/\u00e9/g,'e').replace(/\u00ed/g,'i').replace(/\u00F3/g,'o').replace(/\u00fa/g,'u');
                    $j("#listPN").jqGrid({
                        datatype: 'jsonstring',
                        datastr: jsonStrpn,
                        colNames:[
                            '#',
                            'Descarga',
                            'Folio',
                            'Cve. Dif.',
                            'N&oacute;mina',
                            'A&ntilde;o',
                            'Qna/pago',
                            'Periodo de pago',
                            'Grupo/pago',
                            'Unidad',
                            'Puesto',
                            'Plaza',
                            'Pago neto'
                         ],
                        colModel:[
                            { name:'num',       index:'num',       width:35,   align:"center", sortable: false},
                            { name:'descarga',  index:'descarga',  width:70,   align:"center", sortable: false,  formatter:actionLinkDownload},
                            { name:'folio',     index:'folio',     width:70,   align:"left", sortable: false},
                            { name:'diffolio',  index:'diffolio',  width:70,   align:"left", sortable: false},
                            { name:'nomina',    index:'nomina',    width:110,  align:"left",   sortable: false},
                            { name:'ejercicio', index:'ejercicio', width:40,   align:"left", sortable: false},
                            { name:'qna',       index:'qna',       width:65,   align:"left", sortable: false},
                            { name:'periodo',   index:'periodo',   width:150,  align:"left", sortable: false},
                            { name:'grupo',     index:'grupo',     width:125,  align:"left",   sortable: false},
                            { name:'unidad',    index:'unidad',    width:50,   align:"center", sortable: false},
                            { name:'puesto',    index:'puesto',    width:60,   align:"left", sortable: false},
                            { name:'plaza',     index:'plaza',     width:50,   align:"center", sortable: false},
                            { name:'neto',      index:'neto',      width:85,   align:"right",  sortable: false}
                        ],
                        rowNum: "${expedienteDTO.locpn}",
                        viewrecords: true,
                        loadonce: true,
                    });
                    $j(window).resize(function(){
                        $j('#listPN').jqGrid('setGridHeight', "${expedienteDTO.venpn}");
                    });
                    
                    function actionLinkDownload(cellvalue, options, rowObject){
                        return "<a href='getComprobantePagoPDFCallback.do?folio=" + rowObject["folio"] + "&diffolio=" + rowObject["diffolio"] + " ' class='requestlink' title='Descarga representaci&oacute;n impresa'> <img width='20' align='middle' src='/sireh/images/expediente/ri.png'\/><\/a>"
                    }
                    
                </script>
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<br/>