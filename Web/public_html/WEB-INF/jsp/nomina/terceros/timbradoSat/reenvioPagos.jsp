<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="reenvioPagosDTO">

    <h1> <strong> <spring:message code="sireh.label.terceros.timbradosat.reenvioPagos.header"/> </strong> </h1> 
    <p>&nbsp;</p>
    
    <table width="100%"  align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.terceros.timbradosat.reenvioPagos.quincenaInical"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="quincenaInicialReenvio"
                                                path="quincenaInicial"
                                                progress="true"
                                                style="width: 105px;"/>
                            </td>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.terceros.timbradosat.reenvioPagos.quincenaFinal"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="quincenaFinalReenvio"
                                                path="quincenaFinal"
                                                progress="true"
                                                parentPath="quincenaInicial"
                                                style="width: 105px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="4">
                                <table align="center" width="100%" border="0">
                                    <tr>
                                        <td align="left" colspan="2"><strong><spring:message code="sireh.form.required.fields"/></strong></td>
                                    </tr>
                                    <tr>
                                        <td align="right">
                                            <fsn:submit value="submit.search" 
                                                        path="buscar" 
                                                        action="timbradoSat/reenviarPago.do"/>
                                        </td>
                                        <td align="left">
                                            <fsn:submit value="submit.clean" 
                                                        path="limpiar" 
                                                        action="timbradoSat/reenviarPago.do"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${reenvioPagosDTO.muestraRegistros}">
            <fsn:filter property="N.NOM_QNA_CAPTURA" condition=">=" path="quincenaInicial" />
            <fsn:filter property="N.NOM_QNA_CAPTURA" condition="<=" path="quincenaFinal" />
            
            <fsn:pagedList beanName="${reenvioPagosDTO.beanName}"
                           checkbox="true"
                           chkProperty="idGrupo"
                           baseUrl="${reenvioPagosDTO.urlOrigen}"
                           appendFilters="false">
                <div id="displayTagDiv" style="text-align:center;width:1000px;height:500px;overflow:auto;">
                    <display:table name="${reenvioPagosDTO.beanName}" 
                                   class="displaytag"
                                   requestURI="${requestURI}" 
                                   pagesize="500"
                                   decorator="checkboxTableDecorator" 
                                   export="true" 
                                   id="row"
                                   sort="list">
                        <display:column style="text-align: center;"
                                                    titleKey="sireh.label.terceros.timbradosat.porNomina.acciones"
                                                    sortable="true">
                            <c:if test="${empty row.cnRefTimbrado}">                                                    
                                <a href="generarCadenaByFolio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>" title="Cadena original">
                                        <img src="<spring:theme code="cadena.png"/>" border="0" width="20"/>
                                </a>
                             </c:if>
                             <c:if test="${row.cnRefTimbrado eq 'E'}">
                                 <a href="firmarCadenaByFolio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>" title="Firmar" onClick="hideElement(this);">
                                        <img src="<spring:theme code="firma.png"/>" border="0" width="20"/>
                                 </a>
                             </c:if>
                             <c:if test="${row.cnRefTimbrado eq 'F'}">
                                <a href="integrarXmlFirmaFolio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>" title="Procesar" onClick="hideElement(this);">
                                    <img src="<spring:theme code="procesar.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>
                            <c:if test="${row.cnRefTimbrado eq 'V'}">
                                <a href="enviarSatByFolio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>" title="Sat" onClick="hideElement(this);">
                                    <img src="<spring:theme code="sat.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>
                            <c:if test="${row.cnRefTimbrado eq 'R'}">
                                <a href="consultarEnviadoSatByfolio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>" title="Consultar">
                                    <img src="<spring:theme code="refresh.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>
                            <c:if test="${row.cnRefTimbrado eq 'P'}">
                                <a href="descargarInformeByFolio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>" title="Informe" onClick="hideElement(this);">
                                    <img src="<spring:theme code="informe.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>                                    
                        </display:column>
                        <display:column property="descEstatus"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.cnSituacion" 
                                        sortable="true"/>
                        <display:column property="cnIncidencia"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.cnIncidencia" 
                                        sortable="true"/>
                        <display:column property="nomQnaCaptura"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.nomQnaCaptura" 
                                        sortable="true"/>
                        <display:column property="idNomina"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.idNomina" 
                                        sortable="true"/>
                        <display:column property="cnFolio"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.folio" 
                                        sortable="true"/>
                        <display:column property="nomNumComplem"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.nomNumComplem" 
                                        sortable="true"/>                                        
                        <display:column property="cnRfc"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.rfc"
                                        sortable="true"/>
                        <display:column property="nombreEmpleado" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.nombreEmpleado"
                                        sortable="true"/>
                        <display:column property="primerApellido" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.primerApellido"
                                        sortable="true"/>
                        <display:column property="segundoApellido" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.segundoApellido"
                                        sortable="true"/>
                        <display:column property="descTipoNomina" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.descTipoNomina"
                                        sortable="true"/>
                        <display:column property="idGrupoPago" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.idGrupoPago"
                                        sortable="true"/>
                        <display:column property="descRefTimbrado" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.cnRefTimbrado"
                                        sortable="true"/>
                        <display:column style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.cnArchCreacion"
                                        sortable="true">
                                        <c:if test="${not empty row.cnArchCreacion}">
                                            <a href="downloadFileReenvio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>&file=cnArchCreacion">
                                                <img src="<spring:theme code="rar-download.png"/>" border="0" width="20"/>
                                            </a>
                                        </c:if>
                        </display:column>
                        <display:column style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.cnArchAnexo20"
                                        sortable="true">
                                        <c:if test="${not empty row.cnArchAnexo20}">
                                            <a href="downloadFileReenvio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>&file=cnArchAnexo20">
                                                <img src="<spring:theme code="rar-download.png"/>" border="0" width="20"/>
                                            </a>
                                        </c:if>
                        </display:column>
                        <display:column style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.cnArchTimbrado"
                                        sortable="true">
                                        <c:if test="${not empty row.cnArchTimbrado}">
                                            <a href="downloadFileReenvio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>&file=cnArchTimbrado">
                                                <img src="<spring:theme code="rar-download.png"/>" border="0" width="20"/>
                                            </a>
                                        </c:if>
                        </display:column>
                        <display:column style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.reenvioPagos.cnArchACancelar"
                                        sortable="true">
                                        <c:if test="${not empty row.cnArchACancelar}">
                                            <a href="downloadFileReenvio.do?idNomina=<c:out value='${row.cnConsecNomina}'/>&cnFolio=<c:out value='${row.cnFolio}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>&file=cnArchACancelar">
                                                <img src="<spring:theme code="rar-download.png"/>" border="0" width="20"/>
                                            </a>
                                        </c:if>
                        </display:column>
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
            <table width="100%">
                <tr align="center">
                    <td><fsn:submit value="submit.update" path="update" action="timbradoSat/reenviarPago" /></td>
                </tr>
            </table>
        </c:when>
        <c:otherwise>
            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>
    </c:choose>
    
    
</html:form>
