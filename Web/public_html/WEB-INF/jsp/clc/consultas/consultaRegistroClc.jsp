<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form  modelAttribute="consultaRegistroClcDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.consulta.generica.Consulta"/>
    <c:out value="${consultaRegistroClcDTO.seccion}"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="50%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td align="right" class="label"> * <spring:message code="sireh.label.clc.consulta.generica.cxlcCiclo"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcCicloBusqueda" 
                                                path="cxlcCiclo"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.clc.consulta.generica.cxlcQnaPago"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcQnaPagoBusqueda" 
                                                path="cxlcQnaPago"
                                                progress="true"
                                                parentPath="cxlcCiclo"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.clc.consulta.generica.cxlcTipoNomina"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcTipoNominaBusqueda" 
                                                path="cxlcTipoNomina"
                                                progress="true"
                                                parentPath="cxlcQnaPago"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.clc.consulta.generica.cxlcComplemento"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdCxlcComplementoBusqueda" 
                                                path="cxlcComplemento"
                                                progress="true"
                                                parentPath="cxlcTipoNomina"
                                                filterPaths="cxlcQnaPago"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.clc.consulta.generica.cxlc"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="consultaRegistroCLCBusqueda" 
                                                path="cxlcNum"
                                                progress="true"
                                                parentPath="cxlcComplemento"                                    
                                                filterPaths="cxlcCiclo,cxlcQnaPago,cxlcTipoNomina"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="clcConsultas/consultaRegistroClc"
                            progressBar="true"/> &nbsp; 
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="clcConsultas/consultaRegistroClc"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <table width="100%">
        <tr>
            <td align="center">
                <br/>
                <div style="width:1000px;overflow:auto;">
                    <table id="list10"></table>
                    <div id="pager10"></div>
                </div>
                <br/><br/>
                <div style="width:1000px;overflow:auto;">
                    <table id="list10_d"></table> 
                    <div id="pager10_d"></div>
                </div>
                <br/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${consultaRegistroClcDTO.muestraRegistros}">
            <script type="text/javascript">    
                $j("#list10").jqGrid({ 
                    height:180,
                    url:'jsonCallbackCxlc.do?cxlcCiclo=<c:out value="${consultaRegistroClcDTO.cxlcCiclo}"/>&cxlcQnaPago=<c:out value="${consultaRegistroClcDTO.cxlcQnaPago}"/>&idTipoNomina=<c:out value="${consultaRegistroClcDTO.cxlcTipoNomina}"/>&cxlcComplemento=<c:out value="${consultaRegistroClcDTO.cxlcComplemento}"/>&cxlc=<c:out value="${consultaRegistroClcDTO.cxlcNum}"/>', 
                    datatype:"json", 
                    colNames:['Cxlc','Ciclo', 'Qna Pago', 'Tipo N&oacute;mina','Complemento','Monto','Situaci&oacute;n','Rectifica',
                              'Proceso','Mto pto','Concilia SICOP','Nota','Compromiso','Devengado','IVA','Par&aacute;metros',
                              'CXLC Origen','N&oacute;mina Origen','Usuario','Fecha modificaci&oacute;n'], 
                    colModel:[ 
                        {name:'cxlc',index:'cxlc', width:55, sorttype:'int'}, 
                        {name:'cxlcCiclo',index:'cxlcCiclo', width:50}, 
                        {name:'cxlcQnaPago',index:'cxlcQnaPago', width:70}, 
                        {name:'idTipoNomina',index:'idTipoNomina', width:80}, 
                        {name:'cxlcComplemento',index:'cxlcComplemento', width:90}, 
                        {name:'cxlcMonto',index:'cxlcMonto', width:95, align:"right", sorttype:'int', formatter:'currency', formatoptions:{ prefix:'', suffix:'', thousandsSeparator:','}}, 
                        {name:'cxlcSituacion',index:'cxlcSituacion', width:150},
                        {name:'cxlcRectifica',index:'cxlcRectifica', width:80}, 
                        {name:'cxlcTipoProceso',index:'cxlcTipoProceso', width:80}, 
                        {name:'cxlcMaestroPto',index:'cxlcMaestroPto', width:80},
                        {name:'cxlcConciliaSicop',index:'cxlcConciliaSicop', width:90},
                        {name:'cxlcNota',index:'cxlcNota', width:80},
                        {name:'cxlcCompromiso',index:'cxlcCompromiso', width:80},
                        {name:'cxlcDevengado',index:'cxlcDevengado', width:80},
                        {name:'cxlcIva',index:'cxlcIva', width:55},
                        {name:'cxlcParametros',index:'cxlcParametros', width:150},
                        {name:'cxlcOrigen',index:'cxlcOrigen', width:80},
                        {name:'nominaOrigen',index:'nominaOrigen', width:90},
                        {name:'usuario',index:'usuario', width:80},
                        {name:'fecModifico',index:'fecModifico', width:100}
                    ], 
                    autoencode:true,
                    rowNum:10, 
                    rowList:[10,20,30], 
                    pager:'#pager10', 
                    sortname:'cxlc', 
                    viewrecords:true, 
                    loadonce:true,
                    sortorder:"asc", 
                    caption:"CXLC", 
                    onSelectRow:function(ids) { 
                        if (ids == null) { 
                            ids = 0; 
                            if ($j("#list10_d").jqGrid('getGridParam','records') > 0) { 
                                $j("#list10_d").jqGrid('setGridParam',{url:"jsonCallbackSecCxlc.do?secCxlcCiclo=<c:out value='${consultaRegistroClcDTO.cxlcCiclo}'/>&cxlc="+data.cxlc,page:1}); 
                                $j("#list10_d").jqGrid('setCaption',"Secuencias CXLC ") .trigger('reloadGrid'); 
                            } 
                        } else { 
                            var data = $j("#list10").getRowData(ids);
                            $j("#list10_d").jqGrid('setGridParam',{url:"jsonCallbackSecCxlc.do?secCxlcCiclo=<c:out value='${consultaRegistroClcDTO.cxlcCiclo}'/>&cxlc="+data.cxlc,page:1}); 
                            $j("#list10_d").jqGrid('setCaption',"Secuencias CXLC "+data.cxlc).trigger('reloadGrid'); 
                        } 
                    } 
                });
                
                $j("#list10_d").jqGrid({ 
                    height:180, 
                    url:'jsonCallbackSecCxlc.do?secCxlcCiclo=<c:out value="${consultaRegistroClcDTO.cxlcCiclo}"/>&cxlc=0', 
                    datatype:"json", 
                    colNames:['Secuencia','Cxlc','Ciclo','Unidad','Unidad ejecutora','Estado','Funci&oacute;n','Programa',
                              'Act Inst','Act priorita','Act Inst Esp','Partida','Gasto','Financiamiento','Gu&iacute;a',
                              'Monto','Clave','Sindicato','Fec extra SICOP','Cxlc terceros','Terceros','Gpo pago',
                              'Cta CLABE','Compromiso','Devengado','Cxlc SIAFF','SIAFF','Qna Apli','Tipo Cpto',
                              'Movimiento','Usuario','Fecha modificaci&oacute;n'], 
                    colModel:[ 
                        {name:'secCxlc',index:'secCxlc', width:60, sorttype:'int'},
                        {name:'cxlc',index:'cxlc', width:50}, 
                        {name:'secCxlcCiclo',index:'secCxlcCiclo', width:50},
                        {name:'idUnidad',index:'idUnidad', width:60}, 
                        {name:'idUnidadEjecuto',index:'idUnidadEjecuto', width:100},
                        {name:'idEdo',index:'idEdo', width:55},
                        {name:'idFuncion',index:'idFuncion', width:55},
                        {name:'idPrograma',index:'idPrograma', width:55},
                        {name:'idActInsti',index:'idActInsti', width:80},
                        {name:'idActPriorita',index:'idActPriorita', width:80},
                        {name:'idActInstiEsp',index:'idActInstiEsp', width:80},
                        {name:'idPartida',index:'idPartida', width:55},
                        {name:'idTipoGasto',index:'idTipoGasto', width:80},
                        {name:'idFuenteFinan',index:'idFuenteFinan', width:90},
                        {name:'secGuiaContableEjer',index:'secGuiaContableEjer', width:55},
                        {name:'secMonto',index:'secMonto', width:95, align:"right", sorttype:'int', formatter:'currency', formatoptions:{ prefix:'', suffix:'', thousandsSeparator:','}},
                        {name:'secClaveMov',index:'secClaveMov', width:55},
                        {name:'idSindicato',index:'idSindicato', width:55},
                        {name:'secFecExtraSicop',index:'secFecExtraSicop', width:95},
                        {name:'secCxlcTerceros',index:'secCxlcTerceros', width:80},
                        {name:'secTerceros',index:'secTerceros', width:80},
                        {name:'idGrupopago',index:'idGrupopago', width:80},
                        {name:'secCtaClabe',index:'secCtaClabe', width:80},
                        {name:'secCompromiso',index:'secCompromiso', width:80},
                        {name:'secDevengado',index:'secDevengado', width:80},
                        {name:'secCxlcSiaff',index:'secCxlcSiaff', width:80},
                        {name:'secSiaff',index:'secSiaff', width:55},
                        {name:'secQnaApli',index:'secQnaApli', width:80},
                        {name:'secTipoCpto',index:'secTipoCpto', width:55},
                        {name:'secCptoMovto',index:'secCptoMovto', width:80},
                        {name:'usuario',index:'usuario', width:80},
                        {name:'fecModifico',index:'fecModifico', width:95}
                    ],
                    autoencode:true,
                    rowNum:1000, 
                    rowList:[10,20,30], 
                    pager:'#pager10_d', 
                    sortname:'secCxlc', 
                    viewrecords:true,
                    sortorder:"asc", 
                    multiselect:false, 
                    caption:"Secuencias" 
                });
            </script>
        </c:when>
        <c:otherwise>
            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
        </c:otherwise>
    </c:choose>
</html:form>
