<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="datosEmpleadoCptoDTO">
    <p><h2><strong>
        <spring:message code="nomina.calculo"/>
        <spring:message code="conceptos.control.nomina"/>
    </strong></h2></p>
    <p>&nbsp;</p>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Empleado&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "100%" border="0">
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.rfc"/>
                            </td>
                            <td align="left">
                                <fsn:label path="rfcEmpleado"/>
                            </td>
                            <td align="left" width="3%">
                                <fsn:detalleCalculoNomina rfc="${datosEmpleadoCptoDTO.rfcEmpleado}" image="detail.gif" />
                            </td>
                            <td>
                                <fsn:label path="primerApellido"/>
                                <fsn:label path="segundoApellido"/>
                                <fsn:label path="nombreEmpleado"/>
                            </td>
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
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Datos de la plaza y el puesto&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "100%" border="0">
                        <tr>
                            <td align="left" class="label">
                                <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.numeroPlaza"/>
                            </td>
                            <td colspan="2"><fsn:label path="idPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.unidad"/>
                            </td>
                            <td align="center" colspan="2"><fsn:label path="idUnidadNom"/><fsn:label path="descUnidad"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.puesto"/></td>
                            <td align="left" width="25%"><fsn:label path="idPuestoNom"/></td>
                            <td><fsn:label path="descPuesto"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel"/></td>
                            <td align="left" colspan="2"><fsn:label path="idNivelPto"/></td>
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
                    <legend style="font-size:1.1em"><strong>&nbsp;&nbsp;Conceptos de pago y descuentos&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="100%" border="0">
                        <fsn:filter property="tn_movto_concepto_pago.MCP_RFC" condition="="   path="rfcEmpleado" id="listCptsGrals"/>
                        <fsn:filter property="tc_concepto_pago_captura.CPC_NIVELES_PTO"  condition="like" path="fistCharOnIdNivelPto" id="listCptsGrals"/>
                        <fsn:filter property="tc_concepto_pago_captura.CPC_NOMBRAMIENTO" condition="like" path="fistCharOnIdNombramiento" id="listCptsGrals"/>
                        <fsn:filter property="TN_MOVTO_CONCEPTO_PAGO.MCP_RFC" condition="=" path="rfcEmpleado" id="listCptsEmpl"/>
                        <tr><td colspan="4">&nbsp;</td></tr>
                        <tr>
                            <td width="25%" align="right" class="label">
                                <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.conceptos"/>
                            </td>
                            <td width="25%" align="left">
                                <fsn:option key="0" value="selectList.nonValue"  />
                                <fsn:selectList appendFilters="false" beanName="allConceptosControl" path="SelectedConceptoComboBox" progress="true" filterId="listCptsGrals"/>
                            </td>
                            <td width="25%" align="center">
                                <fsn:submit value="submit.add" action="calculoNomina/addConceptoControl.do" />
                            </td>
                            <td width="25%" align="center">
                                <fsn:submit value="submit.cancel" path="cancel" action="calculoNomina/listEmplConceptosControl.do"/>
                            </td>
                        </tr>
                    </table>
                        <fsn:action url="calculoNomina/deleteConceptoControl.do" var="actionEliminaConcepto"/>
                        
                        <c:set var="paramsElimina"   value="cpcSubTipoDesc=${datosEmpleadoCptoDTO.cpcSubTipoDesc}&cpcSubTipo=${datosEmpleadoCptoDTO.cpcSubTipo}&delete=false&primerApellido=${datosEmpleadoCptoDTO.primerApellido}&segundoApellido=${datosEmpleadoCptoDTO.segundoApellido}&nombreEmpleado=${datosEmpleadoCptoDTO.nombreEmpleado}&idPlaza=${datosEmpleadoCptoDTO.idPlaza}&idUnidadNom=${datosEmpleadoCptoDTO.idUnidadNom}&descUnidad=${datosEmpleadoCptoDTO.descUnidad}&idPuestoNom=${datosEmpleadoCptoDTO.idPuestoNom}&descPuesto=${datosEmpleadoCptoDTO.descPuesto}&idNivelPto=${datosEmpleadoCptoDTO.idNivelPto}&rfcEmpleado=${datosEmpleadoCptoDTO.rfcEmpleado}&conceptoYtipoConcepto"/>
                        
                        <fsn:pagedList beanName="conceptosControlAsignados"  filterId="listCptsEmpl" baseUrl="datosEmpleadoCpto${datosEmpleadoCptoDTO.cpcSubTipo}" appendFilters="true"/>
                            <display:table name="conceptosControlAsignados" class="displaytag" pagesize="10" id="row" requestURI="${requestURI}">
                                
                                <display:column href="${actionEliminaConcepto}" media="html" paramId="${paramsElimina}" paramProperty="conceptoYtipoConcepto" titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.eliminar">
                                    <img align="middle" src="<spring:theme code="delete.gif"/>" alt="Delete" width="18" height="18"/>
                                </display:column><%-- elimina --%>
                                
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.codigo" property="conceptoYtipoConcepto" sortable="true"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.descripcion" property="descConPag" sortable="true"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.monto" property="mcpMonto" format="{0,number,#,##0.00}"/>
                                
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.actualizo" property="usuario"/>
                                
                                <display:setProperty name="paging.banner.placement" value="bottom"/>
                                <display:setProperty name="export.pdf" value="true"/>
                                <display:setProperty name="basic.msg.empty_list">
                                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                                </display:setProperty>
                            </display:table>
                        
                </fieldset>
            </td>
        </tr>
    </table>
    
    <html:hidden path="cpcSubTipo" id="cpcSubTipo"/>
    <html:hidden path="fistCharOnIdNivelPto"/>
    <html:hidden path="fistCharOnIdNombramiento"/>
    <html:hidden path="tabSueldo"/>
    <html:hidden path="tabCompensacion"/>
    
</html:form>