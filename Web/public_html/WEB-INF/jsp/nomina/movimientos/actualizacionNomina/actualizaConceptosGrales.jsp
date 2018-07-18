<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="conceptosGeneralesDTO">
    <p><h2><strong><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.titulo"></spring:message></strong></h2></p>
    <p>&nbsp;</p>
    <table align="center" width="50%">
        <tr>
            <td>
                <fieldset>
                    <legend><strong> <spring:message code="sireh.empleado"/> </strong></legend>
                    <table align="center" width= "100%">
                        <tr>
                            <td align="right" class="label" width="10%" ><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.rfc"/></td>
                            <td align="left" width="20%"><fsn:label path="rfcEmpleado"/></td>
                            <td align="center" width="70%"><fsn:label path="primerApellido"/><fsn:label path="segundoApellido"/><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="50%">
        <tr>    
            <td>
                <fieldset>
                    <legend><strong> <spring:message code="sireh.datos.plaza.puesto"/> </strong></legend>
                    <table align="center" width= "100%">
                        <tr>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.numeroPlaza"/></td>
                            <td ><fsn:label path="idPlaza"/></td>
                            <td colspan="1">&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.unidad"/></td>
                            <td align="left" ><fsn:label path="idUnidadNom"/></td>
                            <td align="center" ><fsn:label path="descUnidad"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.puesto"/></td>
                            <td align="left" ><fsn:label path="idPuestoNom"/></td>
                            <td align="center" ><fsn:label path="descPuesto"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel"/></td>
                            <td align="left" ><fsn:label path="idNivelPto"/></td>
                            <td>&nbsp;</td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend><strong><spring:message code="sireh.conceptos.pago"/></strong></legend>
                    <table align="center" width="80%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label">
                            <fsn:filter property="tc_concepto_pago_captura.SUBTIPO" condition="=" path="cpcSubTipo"/>
                            
                            <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.conceptos"/></td>
                            <td align="left"><fsn:option key="0" value="selectList.nonValue" /><fsn:selectList beanName="listaConceptosGenerales" path="codigo" progress="true"/></td>
                            <td align="left"><fsn:submit value="submit.add" action="actualizacionNomina/agregarConcepto.do"/></td>
                            <td align="right"><fsn:submit value="submit.cancel" path="cancel" action="actualizacionNomina/listarEmpleadosParaConceptosGenerales.do"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                            <td><html:input path="mcpRefCancela" size="60" maxlength="60" /></td>
                            <td colspan="3">&nbsp;</td>
                        </tr>
                    </table>
                    <fsn:action url="actualizacionNomina/eliminarConceptoGeneral" var="eliminaConcepto"/>
                        
                        <fsn:filter property="TN_MOVTO_CONCEPTO_PAGO.MCP_RFC" condition="=" path="rfcEmpleado"/>
                        <c:set var="paramsDetalle" value="primerApellido=${conceptosGeneralesDTO.primerApellido}&segundoApellido=${conceptosGeneralesDTO.segundoApellido}&nombreEmpleado=${conceptosGeneralesDTO.nombreEmpleado}&idPlaza=${conceptosGeneralesDTO.idPlaza}&idUnidadNom=${conceptosGeneralesDTO.idUnidadNom}&descUnidad=${conceptosGeneralesDTO.descUnidad}&idPuestoNom=${conceptosGeneralesDTO.idPuestoNom}&descPuesto=${conceptosGeneralesDTO.descPuesto}&idNivelPto=${conceptosGeneralesDTO.idNivelPto}&rfcEmpleado=${conceptosGeneralesDTO.rfcEmpleado}&idTipoConcepto"/>
                        <fsn:pagedList beanName="listaConceptosGeneraleDelEmpleado" baseUrl="buscarConceptosGenerales.do" appendFilters="true">
                        
                            <display:table name="listaConceptosGeneraleDelEmpleado" class="displaytag" pagesize="10" id="row" requestURI="buscarConceptosGenerales.do">
                                
                                <display:column href="eliminarConceptoGeneral.do" media="html" paramId="${paramsDetalle}" paramProperty="idTipoConcepto" titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.eliminar">
                                    <img align="middle" src="<spring:theme code="delete.gif"/>" alt="Delete" width="18" height="18"  alertCode="confirm.multiple.delete"/>
                                </display:column>
                            
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.codigo" property="idTipoConcepto"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.descripcion" property="descConPag"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.monto" property="mcpMonto"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.porcentaje" property="mcpPorcentaje"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.actualizo" property="usuario"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.adeudo" property="montoAdeuco"/>
                            
                                <display:setProperty name="paging.banner.placement" value="bottom"/>
                                <display:setProperty name="export.pdf" value="true"/>
                                <display:setProperty name="basic.msg.empty_list">
                                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                                </display:setProperty>
                            </display:table>
                        </fsn:pagedList>   
                </fieldset>
            </td>
        </tr>
    </table>
    
</html:form>