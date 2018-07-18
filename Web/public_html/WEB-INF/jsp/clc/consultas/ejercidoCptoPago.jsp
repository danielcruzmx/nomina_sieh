<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form modelAttribute="ejercidoCptoPagoDTO">

    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <%-- Titulo --%> 
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.consulta.generica.Consulta"/>
    <c:out value="${ejercidoCptoPagoDTO.seccion}"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="50%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <%-- Filtros --%>
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.ciclo"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="cxlcCicloEjercidoCptoPago" 
                                                    path="Ciclo"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcQnaPago"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="cxlcQnaPagoEjercidoCptoPago" 
                                                    path="QnaPago"
                                                    progress="true"
                                                    parentPath="Ciclo"                                                    
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcTipoNomina"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tipoNominaEjercidoCptoPago" 
                                                    path="TipoNomina"
                                                    progress="true"
                                                    parentPath="QnaPago"
                                                    filterPaths="Ciclo"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcComplemento"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="complementoEjercidoCptoPago" 
                                                    path="Complementos"
                                                    progress="true"
                                                    parentPath="TipoNomina"
                                                    filterPaths="Ciclo,QnaPago"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.consulta.generica.Folio"/> </td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="folioEjercidoCptoPago" 
                                                    path="chequeComprobante"
                                                    progress="true"
                                                    parentPath="Complementos"                                    
                                                    filterPaths="Ciclo,QnaPago,TipoNomina" 
                                                    multiple="true"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                        
                    </table>
                </fieldset>
            </td>
        </tr>
        <%-- Botones --%> 
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="clcConsultas/${ejercidoCptoPagoDTO.urlOrigen}"  
                            progressBar="true"/> &nbsp; 
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="clcConsultas/${ejercidoCptoPagoDTO.urlOrigen}"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <%-- Condicion Existen registros --%> 
    <c:choose>
        <c:when test="${ejercidoCptoPagoDTO.muestraRegistros}">
            
            <%-- Filtros --%> 
            <fsn:filter property="c.cxlc_ciclo" condition="=" path="Ciclo"/>
            <fsn:filter property="c.CXLC_QNA_PAGO" condition="=" path="QnaPago"/>
            <fsn:filter property="c.ID_TIPO_NOMINA" condition="=" path="TipoNomina"/>                
            <fsn:filter property="c.CXLC_COMPLEMENTO" condition="=" path="Complementos"/>
            <fsn:filter property="s.SCC_FOLIO" condition="IN" path="chequeComprobante"/>
            
            <%-- Grid --%> 
            <fsn:pagedList beanName="${ejercidoCptoPagoDTO.beanName}" 
                           baseUrl="${ejercidoCptoPagoDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="${ejercidoCptoPagoDTO.beanName}" 
                                   class="displaytag"
                                   pagesize="200" 
                                   export="true" 
                                   id="row"
                                   requestURI="${requestURI}" 
                                   sort="list">
                        <%-- Columnas --%>
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcQnaPago" 
                                        property="cxlcQnaPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.Folio" 
                                        property="scc_folio" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcComplemento" 
                                        property="cxlcComplemento" 
                                        sortable="true"/> 
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.idTipoNomina" 
                                        property="idTipoNomina" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.plaza.masivas.honorarios.bajas.unidad.filtro" 
                                        property="idUnidad" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlcEdo" 
                                        property="idEdo" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.Partida" 
                                        property="idPartida" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.guiaContable" 
                                        property="sccGuiaContEjer" 
                                        sortable="true"/>                            
                        <display:column titleKey="sireh.label.clc.consulta.generica.tipoConcepto" 
                                        property="idTipoCpto" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.conceptoPago" 
                                        property="idCptoPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlcMonto" 
                                        property="sccMonto" 
                                        sortable="true"                                        
                                        format="$ {0,number,#,##0.00}"
                                        style="text-align:right"/>
                        <%-- Paginador --%> 
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="export.excel" value="true"/>
                        <display:setProperty name="export.excel.filename" value="EjercidoConceptoPago.xls"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>
