<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form modelAttribute="consultaRegistroClcDTO">

    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <%-- Titulo --%> 
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
                        <%-- Filtros --%> 
                        <c:if test="${consultaRegistroClcDTO.registroCLC || consultaRegistroClcDTO.casosImpuestos}">
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.ciclo"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcCicloBusqueda" 
                                                    path="cxlcCiclo"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                        </c:if>
                        <c:if test="${consultaRegistroClcDTO.registroCLC || consultaRegistroClcDTO.casosImpuestos}">
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcQnaPago"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcQnaPagoBusqueda" 
                                                    path="cxlcQnaPago"
                                                    progress="true"
                                                    parentPath="cxlcCiclo"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                        </c:if>
                        <c:if test="${consultaRegistroClcDTO.registroCLC || consultaRegistroClcDTO.casosImpuestos}">
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcTipoNomina"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcTipoNominaBusqueda" 
                                                    path="idTipoNomina"
                                                    progress="true"
                                                    parentPath="cxlcQnaPago"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                        </c:if>
                        <c:if test="${consultaRegistroClcDTO.registroCLC || consultaRegistroClcDTO.casosImpuestos}">
                            <tr align="left">
                                <td align="right" class="label"><spring:message code="sireh.label.clc.herramientas.busqueda.cxlcComplemento"/></td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tdCxlcComplementoBusqueda" 
                                                    path="cxlcComplemento"
                                                    progress="true"
                                                    parentPath="idTipoNomina"
                                                    filterPaths="cxlcQnaPago"
                                                    style="width: 200px;"/>
                                </td>
                            </tr>
                        </c:if>
                    
                    <c:if test="${consultaRegistroClcDTO.registroCLC || consultaRegistroClcDTO.casosImpuestos}">
                            <tr align="left">
                                <td align="right" class="label">Cxlc</td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="clcProce" 
                                                    path="cxlc"
                                                    progress="true"
                                                    parentPath="cxlcComplemento"                                    
                                                    filterPaths="cxlcCiclo,cxlcQnaPago,idTipoNomina"/>
                                </td>
                            </tr>
                        </c:if>
                    </table>
                </fieldset>
            </td>
        </tr>
        <%-- Botones --%> 
        <tr align="center">
            <td>
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="clcConsultas/${consultaRegistroClcDTO.urlOrigen}"  
                            progressBar="true"/> &nbsp; <%--aqui poner el metodo del controller --%>
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="clcConsultas/${consultaRegistroClcDTO.urlOrigen}"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <%-- Condicion Existen registros --%> 
    <c:choose>
        <c:when test="${consultaRegistroClcDTO.muestraRegistros}">
            <%-- Filtros --%> 
            <fsn:filter property="CXLC_QNA_PAGO" condition="=" path="cxlcQnaPago"/>
            <fsn:filter property="CXLC" condition="=" path="cxlc"/>
            <fsn:filter property="CXLC_COMPLEMENTO" condition="=" path="cxlcComplemento"/>
            <fsn:filter property="ID_TIPO_NOMINA" condition="=" path="idTipoNomina"/>                
            <fsn:filter property="CXLC_CICLO" condition="=" path="cxlcCiclo"/>
            
            <%-- Grid --%> 
            <fsn:pagedList beanName="${consultaRegistroClcDTO.beanName}" 
                           baseUrl="${consultaRegistroClcDTO.urlOrigen}" 
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="${consultaRegistroClcDTO.beanName}" 
                                   class="displaytag"
                                   pagesize="10" 
                                   export="true" 
                                   id="row"
                                   requestURI="${requestURI}"
                                   sort="list">
                        <%-- Columnas --%>
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcQnaPago" 
                                        property="cxlcQnaPago" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlc" 
                                        property="cxlc" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.cxlcComplemento" 
                                        property="cxlcComplemento" 
                                        sortable="true"/> 
                        <display:column titleKey="sireh.label.clc.herramientas.compromiso.consulta.idTipoNomina" 
                                        property="idTipoNomina" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.clc.consulta.generica.cxlcMonto" 
                                        property="cxlcMonto" 
                                        sortable="true"
                                        format="$ {0,number,#,##0.00}"
                                        style="text-align:right"/>
                        <%-- Paginador --%> 
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <%-- No existen registros --%> 
            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>
