<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="cancelPagosNoCanDTO">

    <h1> <strong> <spring:message code="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.header"/> </strong> </h1> 
    <p>&nbsp;</p>
    
    <table width="100%"  align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%" align="center" border="0">
                        
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.folio"/></td>
                            <td>
                                <fsn:input path="hpFolio" uppercase="true" maxlength="10" size="20" />
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
                                                        action="timbradoSat/cancelPagosNo.do"/>
                                        </td>
                                        <td align="left">
                                            <fsn:submit value="submit.clean" 
                                                        path="limpiar" 
                                                        action="timbradoSat/cancelPagosNo.do"/>
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
        <c:when test="${cancelPagosNoCanDTO.muestraRegistros}">
            <fsn:filter property="T.CN_FOLIO" condition="=" path="hpFolio" />
            
            <fsn:pagedList beanName="${cancelPagosNoCanDTO.beanName}"
                           checkbox="true"
                           chkProperty="idGrupo"
                           baseUrl="${cancelPagosNoCanDTO.urlOrigen}"
                           appendFilters="false">
                <div id="displayTagDiv" style="text-align:center;width:1000px;height:500px;overflow:auto;">
                    <display:table name="${cancelPagosNoCanDTO.beanName}" 
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
                                <a href="integrarXmlFirma.do?idNomina=<c:out value='${row.cnFolio}'/>" title="Procesar" onClick="hideElement(this);">
                                    <img src="<spring:theme code="procesar.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>
                            <c:if test="${row.nomRefTimbrado eq 'V'}">
                                <a href="enviarSat.do?idNomina=<c:out value='${row.cnFolio}'/>" title="Sat" onClick="hideElement(this);">
                                    <img src="<spring:theme code="sat.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>
                            <c:if test="${row.cnRefTimbrado eq 'R'}">
                                <a href="consultarEnviadoSat.do?idNomina=<c:out value='${row.cnFolio}'/>" title="Consultar">
                                    <img src="<spring:theme code="refresh.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>
                            <c:if test="${row.cnRefTimbrado eq 'P'}">
                                <a href="descargarInforme.do?idNomina=<c:out value='${row.cnFolio}'/>" title="Informe" onClick="hideElement(this);">
                                    <img src="<spring:theme code="informe.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>                                    
                            <c:if test="${row.cnRefTimbrado eq 'T'}">
                                <a href="enviarComprobantes.do?idNomina=<c:out value='${row.cnFolio}'/>" title="Enviar">
                                    <img src="<spring:theme code="correo.png"/>" border="0" width="20"/>
                                </a>
                            </c:if>
                        </display:column>
                        <display:column property="descEstatus"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnSituacion" 
                                        sortable="true"/>
                        <display:column property="cnFolio"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.folio" 
                                        sortable="true"/>
                        <display:column property="cnRfc"
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.rfc"
                                        sortable="true"/>
                        <display:column property="nombreEmpleado" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.nombreEmpleado"
                                        sortable="true"/>
                        <display:column property="primerApellido" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.primerApellido"
                                        sortable="true"/>
                        <display:column property="segundoApellido" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.segundoApellido"
                                        sortable="true"/>
                        <display:column property="hpIniPago" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.hpIniPago"
                                        sortable="true"/>
                        <display:column property="hpFinPago" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.hpFinPago"
                                        sortable="true"/>
                        <display:column property="idPuestoNom" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.idPuestoNom"
                                        sortable="true"/>
                        <display:column property="idGrupoPago" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.idGrupoPago"
                                        sortable="true"/>
                        <display:column property="idUnidadNom" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.idUnidadNom"
                                        sortable="true"/>
                        <display:column property="idPlaza" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.idPlaza"
                                        sortable="true"/>
                        <display:column property="hpNetoPago" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.hpNetoPago"
                                        sortable="true"/>
                        <display:column property="cnArchCreacion" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnArchCreacion"
                                        sortable="true"/>
                        <display:column property="cnArchAnexo20" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnArchAnexo20"
                                        sortable="true"/>
                        <display:column property="cnArchTimbrado" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnArchTimbrado"
                                        sortable="true"/>
                        <display:column property="cnArchACancelar" 
                                        style="text-align: center;"
                                        titleKey="sireh.label.terceros.timbradosat.cancelacionPagosNoCan.cnArchACancelar"
                                        sortable="true"/>
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
        </c:when>
        <c:otherwise>
            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j("#10003").prop("disabled",true);
        
        function checkAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('idGrupo');
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].setAttribute('checked', true);
                    $j("#10003").prop("disabled",false);
                }
            }
            $j("#10003").prop("disabled",false);
        }
        
        function uncheckAll() {
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('idGrupo');
            for (var i = 0; i < checkboxes.length; i++) {
                if (checkboxes[i].type == 'checkbox' && checkboxes[i].disabled == false) {
                    checkboxes[i].removeAttribute('checked');
                }
            }
            $j("#10003").prop("disabled",true);
        }
        
        function searCheckeds(){
            var cont = 0; 
            var checkboxes = new Array();
            checkboxes = document.getElementsByName('idGrupo');
            
            for (var x=0; x < checkboxes.length; x++) {
                if (checkboxes[x].checked) {
                    cont = cont + 1;
                }
            }
            if(cont > 0){
                $j("#10003").prop("disabled",false);
            } else { $j("#10003").prop("disabled",true); }
        }
        
    </script>
    
</html:form>
