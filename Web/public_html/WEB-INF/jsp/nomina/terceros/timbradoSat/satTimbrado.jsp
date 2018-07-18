<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form name="checkBoxTest" modelAttribute="timbradoSatDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1> <strong> <spring:message code="sireh.label.nomina.terceros.sattimbrado.header"/> </strong> </h1> 
    <p>&nbsp;</p>
    
    <table width="100%"  align="center" border="0">
        <tr>
            <td>
                <fieldset id="quincenasFieldSet">
                    <legend style='font-size:1.2em'/>
                        <strong><spring:message code="sireh.label.nomina.creaArchivoTerceros.titulo3"/></strong>
                    </legend>
                    <table width="100%" align="center" border="0">
                        <tr><td></td></tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.creaArchivoTerceros.quincena"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tnNominaQuincena" 
                                                path="nomQnaCaptura"
                                                style="width: 200px;"/>
                            </td>      
                            <td></td>
                        </tr>
                    </table>
                    <table width="100%">
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.search" 
                                            path="muestraRegistros" 
                                            action="timbradoSat/${timbradoSatDTO.urlOrigen}"/>
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="timbradoSat/${timbradoSatDTO.urlOrigen}"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
            <td></td>
        </tr>
        <tr>
            <td>
                <c:choose>
                    <c:when test="${timbradoSatDTO.muestraRegistros}">
                        <fsn:filter property="TN_NOMINA.NOM_QNA_CAPTURA" condition="=" path="nomQnaCaptura"/>
            
                        <fsn:pagedList beanName="${timbradoSatDTO.beanName}"
                                       checkbox="true"
                                       chkProperty="idGrupo" 
                                       baseUrl="${timbradoSatDTO.urlOrigen}" 
                                       appendFilters="false"
                                       maxRows="200">
                            <div id="displayTagDiv">
                                <display:table name="${timbradoSatDTO.beanName}"
                                               class="displaytag" 
                                               pagesize="200" 
                                               decorator="checkboxTableDecorator"
                                               export="true"
                                               id="row" 
                                               requestURI="${requestURI}" 
                                               sort="list">
                                    <display:column style="text-align: center;"
                                                    titleKey="sireh.label.terceros.timbradosat.porNomina.acciones"
                                                    sortable="true">
                                    <c:if test="${empty row.nomRefTimbrado}">                                                    
                                        <a href="generarCadenaOriginal.do?idNomina=<c:out value='${row.idQna}'/>" title="Cadena original">
                                                <img src="<spring:theme code="cadena.png"/>" border="0" width="20"/>
                                        </a>
                                     </c:if>
                                     <c:if test="${row.nomRefTimbrado eq 'E'}">
                                         <a href="firmarCadenas.do?idNomina=<c:out value='${row.idQna}'/>" title="Firmar" onClick="hideElement(this);">
                                                <img src="<spring:theme code="firma.png"/>" border="0" width="20"/>
                                         </a>
                                     </c:if>
                                     <c:if test="${row.nomRefTimbrado eq 'F'}">
                                        <a href="integrarXmlFirma.do?idNomina=<c:out value='${row.idQna}'/>" title="Procesar" onClick="hideElement(this);">
                                            <img src="<spring:theme code="procesar.png"/>" border="0" width="20"/>
                                        </a>
                                    </c:if>
                                    <c:if test="${row.nomRefTimbrado eq 'V'}">
                                        <a href="enviarSat.do?idNomina=<c:out value='${row.idQna}'/>" title="Sat" onClick="hideElement(this);">
                                            <img src="<spring:theme code="sat.png"/>" border="0" width="20"/>
                                        </a>
                                    </c:if>
                                    <c:if test="${row.nomRefTimbrado eq 'R'}">
                                        <a href="consultarEnviadoSat.do?idNomina=<c:out value='${row.idQna}'/>" title="Consultar">
                                            <img src="<spring:theme code="refresh.png"/>" border="0" width="20"/>
                                        </a>
                                    </c:if>
                                    <c:if test="${row.nomRefTimbrado eq 'P'}">
                                        <a href="descargarInforme.do?idNomina=<c:out value='${row.idQna}'/>" title="Informe" onClick="hideElement(this);">
                                            <img src="<spring:theme code="informe.png"/>" border="0" width="20"/>
                                        </a>
                                    </c:if>                                    
                                    <!--<c:if test="${row.nomRefTimbrado eq 'T'}">
                                        <a href="generarArchivoCancelacion.do?idNomina=<c:out value='${row.idQna}'/>&cnPaquete=<c:out value='${row.cnPaquete}'/>" title="Cancelar" onClick="return confirm(' Este proceso env\u00EDa a cancelar la n\u00F3mina completa al SAT. \n \u00BFEst\u00E1 completamente seguro de continuar?')">
                                            <img src="<spring:theme code="cancelar.png"/>" border="0" width="20"/>
                                        </a>
                                    </c:if>-->
                                    <c:if test="${row.nomRefTimbrado eq 'T'}">
                                    	<a href="enviarComprobantes.do?idNomina=<c:out value='${row.idQna}'/>" title="Enviar">
                                            <img src="<spring:theme code="correo.png"/>" border="0" width="20"/>
                                        </a>
                                    </c:if>
                                    </display:column>
                                    <display:column style="text-align: center;"
                                                    titleKey="sireh.label.terceros.timbradosat.porNomina.idNomina"
                                                    property="idQna" 
                                                    sortable="true"/>
                                    <display:column style="text-align: center;"
                                                    titleKey="sireh.label.terceros.timbradosat.porNomina.nomNumComplem" 
                                                    property="numComplem" 
                                                    sortable="true"/> 
                                    <display:column property="descripcion" 
                                                    style="text-align: center;"
                                                    titleKey="sireh.label.terceros.timbradosat.porNomina.descNomina"
                                                    sortable="true"/>
                                    <display:column style="text-align: center;"
                                                    titleKey="sireh.label.terceros.timbradosat.porNomina.idtipoNomina" 
                                                    property="tipoNomina" 
                                                    sortable="true"/>
                                    <display:column style="text-align: center;"
                                                    titleKey="sireh.label.terceros.timbradosat.porNomina.descGrupoPago" 
                                                    property="grupoPago" 
                                                    sortable="true"/>            
                                    <display:column titleKey="sireh.label.terceros.timbradosat.porNomina.nomRefTimbrado"
                                                    property="descNomRefTimbrado"
                                                    sortable="false"
                                                    style="text-align: center;"/>
                                    <display:column style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.porNomina.nomArchCreacion"
                                        sortable="true">
                                        <c:if test="${not empty row.nomArchCreacion}">
                                            <a href="downloadFile.do?idNomina=<c:out value='${row.idQna}'/>&file=nomArchCreacion">
                                                <img src="<spring:theme code="rar-download.png"/>" border="0" width="20"/>
                                            </a>
                                        </c:if>
                                    </display:column>
                                    <display:column style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.porNomina.nomArchAnexo20"
                                        sortable="true">
                                        <c:if test="${not empty row.nomArchAnexo20}">
                                            <a href="downloadFile.do?idNomina=<c:out value='${row.idQna}'/>&file=nomArchAnexo20">
                                                <img src="<spring:theme code="rar-download.png"/>" border="0" width="20"/>
                                            </a>
                                        </c:if>
                                    </display:column>
                                    <display:column style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.nomArchTimbrado"
                                        sortable="true">
                                        <c:if test="${not empty row.nomArchTimbrado}">
                                            <a href="downloadFile.do?idNomina=<c:out value='${row.idQna}'/>&file=nomArchTimbrado">
                                                <img src="<spring:theme code="rar-download.png"/>" border="0" width="20"/>
                                            </a>
                                        </c:if>
                                    </display:column>
                                    <display:column style="text-align: center;"
                                        titleKey="sireh.label.nomina.gestion.consulta.parametros.nomArchCanc"
                                        sortable="true">
                                        <c:if test="${not empty row.nomArchCanc}">
                                            <a href="downloadFile.do?idNomina=<c:out value='${row.idQna}'/>&file=nomArchCanc">
                                                <img src="<spring:theme code="rar-download.png"/>" border="0" width="20"/>
                                            </a>
                                        </c:if>
                                    </display:column>

                                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                                    <display:setProperty name="export.pdf" value="true"/>
                                    <display:setProperty name="basic.msg.empty_list">
                                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                    </display:setProperty>
                                </display:table>
                            </div>
                        </fsn:pagedList>
                        <table width="100%">
                            <tr align="center">
                                <td><fsn:submit value="submit.update" path="update" action="timbradoSat/${timbradoSatDTO.urlOrigen}"/></td>
                            </tr>
                        </table>
                    </c:when>
                    <c:otherwise>
                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        function hideElement(element){
            $j(element).hide();
        }
    </script>
</html:form>
