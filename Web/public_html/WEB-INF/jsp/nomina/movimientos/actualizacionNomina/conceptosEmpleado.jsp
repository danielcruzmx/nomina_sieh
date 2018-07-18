<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="datosEmpleadoCptoDTO">
    <p><h2><strong><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.titulo"></spring:message><fsn:label path="cpcSubTipoDesc"/> </strong></h2></p>
    <p>&nbsp;</p>
    <table align="center" width="50%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Empleado&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "90%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label" width="10%" ><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.rfc"/></td>
                            <td align="left" width="100%"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${datosEmpleadoCptoDTO.rfcEmpleado}" image="detail.gif" />
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fsn:label path="primerApellido"/><fsn:label path="segundoApellido"/><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="80%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos de la plaza y el puesto&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "90%">
                        <tr><td colspan="2">&nbsp;</td></tr>
                        <tr>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.numeroPlaza"/></td>
                            <td ><fsn:label path="idPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.unidad"/></td>
                            <td align="left" ><fsn:label path="idUnidadNom"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<fsn:label path="descUnidad"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.puesto"/></td>
                            <td align="left" ><fsn:label path="idPuestoNom"/>&nbsp;&nbsp;&nbsp;<fsn:label path="descPuesto"/></td>
                            
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel"/></td>
                            <td align="left" ><fsn:label path="idNivelPto"/></td>
                        </tr>
                        <tr><td colspan="2">&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Conceptos de pago y descuentos&nbsp;&nbsp;</strong></legend>
                    <table align="center" width="90%">
                        <tr><td colspan="4">&nbsp;</td></tr>
                        <tr>
                            <td width="25%" align="right" class="label">
                            
                            <fsn:filter property="tc_concepto_pago_captura.CPC_SUBTIPO" condition="=" path="cpcSubTipo"  id="listCptsGrals"/>
                            <fsn:filter property="tc_concepto_pago_captura.CPC_SUBTIPO" condition="=" path="cpcSubTipo"  id="listCptsGrals"/>
                            <fsn:filter property="tc_concepto_pago_captura.CPC_SUBTIPO" condition="=" path="cpcSubTipo"  id="listCptsGrals"/>
                            
                            <fsn:filter property="tn_movto_concepto_pago.MCP_RFC" condition="="   path="rfcEmpleado" id="listCptsGrals"/>
                            <fsn:filter property="tn_movto_concepto_pago.MCP_RFC" condition="="   path="rfcEmpleado" id="listCptsGrals"/>
                            <fsn:filter property="tn_movto_concepto_pago.MCP_RFC" condition="="   path="rfcEmpleado" id="listCptsGrals"/>
                            
                            <fsn:filter property="tc_concepto_pago_captura.CPC_NIVELES_PTO"  condition="like" path="fistCharOnIdNivelPto" id="listCptsGrals"/>
                            <fsn:filter property="tc_concepto_pago_captura.CPC_NIVELES_PTO"  condition="like" path="fistCharOnIdNivelPto" id="listCptsGrals"/>
                            <fsn:filter property="tc_concepto_pago_captura.CPC_NIVELES_PTO"  condition="like" path="fistCharOnIdNivelPto" id="listCptsGrals"/>
                            
                            <fsn:filter property="tc_concepto_pago_captura.CPC_NOMBRAMIENTO" condition="like" path="fistCharOnIdNombramiento" id="listCptsGrals"/>
                            <fsn:filter property="tc_concepto_pago_captura.CPC_NOMBRAMIENTO" condition="like" path="fistCharOnIdNombramiento" id="listCptsGrals"/>
                            <fsn:filter property="tc_concepto_pago_captura.CPC_NOMBRAMIENTO" condition="like" path="fistCharOnIdNombramiento" id="listCptsGrals"/>
                            
                            <fsn:filter property="TN_MOVTO_CONCEPTO_PAGO.MCP_RFC" condition="=" path="rfcEmpleado" id="listCptsEmpl"/>
                            
                            <spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.conceptos"/></td>
                            <td width="25%" align="left">
                                <fsn:option key="0" value="selectList.nonValue"  />
                                <fsn:selectList appendFilters="false" beanName="Q3_listaConceptosGenerales" path="SelectedConceptoComboBox" progress="true" filterId="listCptsGrals"/>
                            </td>
                            <td width="25%" align="left">
                                <fsn:submit value="submit.add" action="actualizacionNomina/agregaConceptoEmpleado.do" />
                            </td>
                            <td width="25%" align="right">
                            
                                <%-- cuando cancela se debe seeccionar el metodo a ejecura en el controlador segun el origen del menu--%>
                                <c:set var="opMenu" value="${datosEmpleadoCptoDTO.cpcSubTipo}"/>
                                <c:choose>
                                    <c:when test="${opMenu == 'G'}">
                                        <c:set var="destino" value="actualizacionNomina/listarEmpleadosConConceGen.do"/>
                                    </c:when>
                                    <c:when test="${opMenu == 'T'}">
                                        <c:set var="destino" value="actualizacionNomina/listarEmpleadosConConTercer.do"/>
                                    </c:when>
                                    <c:when test="${opMenu == 'D'}">
                                        <c:set var="destino" value="actualizacionNomina/listarEmpleadosConConDeDevo.do"/>
                                    </c:when>
                                    <c:when test="${opMenu == 'R'}">
                                        <c:set var="destino" value="actualizacionNomina/listarEmpleadosConConDeRein.do"/>
                                    </c:when>
                                </c:choose>
                                <fsn:submit value="submit.cancel" path="cancel" action="${destino}"/>
                            </td>
                        </tr>
                    </table>
                        <fsn:action url="actualizacionNomina/validaEliminarConceptoDelEmpleado.do" var="actionEliminaConcepto"/>
                        <fsn:action url="actualizacionNomina/modificaConceptoDelEmpleado.do" var="actionModificaConcepto"/>
                        <fsn:action url="actualizacionNomina/detalleConceptoDelEmpleado.do" var="actionDetalleConcepto"/>
                        <fsn:action url="actualizacionNomina/adeudoConceptoDelEmpleado.do" var="actionAdeudoConcepto"/>
                        
                        <c:set var="paramsElimina"   value="cpcSubTipoDesc=${datosEmpleadoCptoDTO.cpcSubTipoDesc}&cpcSubTipo=${datosEmpleadoCptoDTO.cpcSubTipo}&delete=false&primerApellido=${datosEmpleadoCptoDTO.primerApellido}&segundoApellido=${datosEmpleadoCptoDTO.segundoApellido}&nombreEmpleado=${datosEmpleadoCptoDTO.nombreEmpleado}&idPlaza=${datosEmpleadoCptoDTO.idPlaza}&idUnidadNom=${datosEmpleadoCptoDTO.idUnidadNom}&descUnidad=${datosEmpleadoCptoDTO.descUnidad}&idPuestoNom=${datosEmpleadoCptoDTO.idPuestoNom}&descPuesto=${datosEmpleadoCptoDTO.descPuesto}&idNivelPto=${datosEmpleadoCptoDTO.idNivelPto}&rfcEmpleado=${datosEmpleadoCptoDTO.rfcEmpleado}&conceptoYtipoConcepto"/>
                        <c:set var="paramsActualiza" value="tabCompensacion=${datosEmpleadoCptoDTO.tabCompensacion}&tabSueldo=${datosEmpleadoCptoDTO.tabSueldo}&cpcSubTipoDesc=${datosEmpleadoCptoDTO.cpcSubTipoDesc}&cpcSubTipo=${datosEmpleadoCptoDTO.cpcSubTipo}&delete=false&primerApellido=${datosEmpleadoCptoDTO.primerApellido}&segundoApellido=${datosEmpleadoCptoDTO.segundoApellido}&nombreEmpleado=${datosEmpleadoCptoDTO.nombreEmpleado}&idPlaza=${datosEmpleadoCptoDTO.idPlaza}&idUnidadNom=${datosEmpleadoCptoDTO.idUnidadNom}&descUnidad=${datosEmpleadoCptoDTO.descUnidad}&idPuestoNom=${datosEmpleadoCptoDTO.idPuestoNom}&descPuesto=${datosEmpleadoCptoDTO.descPuesto}&idNivelPto=${datosEmpleadoCptoDTO.idNivelPto}&rfcEmpleado=${datosEmpleadoCptoDTO.rfcEmpleado}&conceptoYtipoConcepto"/>
                        <c:set var="paramsDetalle"   value="descConPag=${datosEmpleadoCptoDTO.descConPag}&tabCompensacion=${datosEmpleadoCptoDTO.tabCompensacion}&tabSueldo=${datosEmpleadoCptoDTO.tabSueldo}&cpcSubTipoDesc=${datosEmpleadoCptoDTO.cpcSubTipoDesc}&cpcSubTipo=${datosEmpleadoCptoDTO.cpcSubTipo}&delete=false&primerApellido=${datosEmpleadoCptoDTO.primerApellido}&segundoApellido=${datosEmpleadoCptoDTO.segundoApellido}&nombreEmpleado=${datosEmpleadoCptoDTO.nombreEmpleado}&idPlaza=${datosEmpleadoCptoDTO.idPlaza}&idUnidadNom=${datosEmpleadoCptoDTO.idUnidadNom}&descUnidad=${datosEmpleadoCptoDTO.descUnidad}&idPuestoNom=${datosEmpleadoCptoDTO.idPuestoNom}&descPuesto=${datosEmpleadoCptoDTO.descPuesto}&idNivelPto=${datosEmpleadoCptoDTO.idNivelPto}&rfcEmpleado=${datosEmpleadoCptoDTO.rfcEmpleado}&conceptoYtipoConcepto"/>
                        <c:set var="paramsAdeudo"    value="descConPag=${datosEmpleadoCptoDTO.descConPag}&tabCompensacion=${datosEmpleadoCptoDTO.tabCompensacion}&tabSueldo=${datosEmpleadoCptoDTO.tabSueldo}&cpcSubTipoDesc=${datosEmpleadoCptoDTO.cpcSubTipoDesc}&cpcSubTipo=${datosEmpleadoCptoDTO.cpcSubTipo}&delete=false&primerApellido=${datosEmpleadoCptoDTO.primerApellido}&segundoApellido=${datosEmpleadoCptoDTO.segundoApellido}&nombreEmpleado=${datosEmpleadoCptoDTO.nombreEmpleado}&idPlaza=${datosEmpleadoCptoDTO.idPlaza}&idUnidadNom=${datosEmpleadoCptoDTO.idUnidadNom}&descUnidad=${datosEmpleadoCptoDTO.descUnidad}&idPuestoNom=${datosEmpleadoCptoDTO.idPuestoNom}&descPuesto=${datosEmpleadoCptoDTO.descPuesto}&idNivelPto=${datosEmpleadoCptoDTO.idNivelPto}&rfcEmpleado=${datosEmpleadoCptoDTO.rfcEmpleado}&conceptoYtipoConcepto"/>
                        
                        <fsn:pagedList beanName="Q2_conceptosEmpleado_Grid"  filterId="listCptsEmpl" baseUrl="datosEmpleadoCpto${datosEmpleadoCptoDTO.cpcSubTipo}" appendFilters="true"/>
                            <display:table name="Q2_conceptosEmpleado_Grid" class="displaytag" pagesize="10" id="row" requestURI="${requestURI}">
                                
                                <display:column href="${actionEliminaConcepto}" media="html" paramId="${paramsElimina}" paramProperty="conceptoYtipoConcepto" titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.eliminar">
                                    <img align="middle" src="<spring:theme code="delete.gif"/>" alt="Delete" width="18" height="18"/>
                                </display:column><%-- elimina --%>
                                
                                <display:column href="${actionModificaConcepto}" media="html" paramId="${paramsActualiza}" paramProperty="conceptoYtipoConcepto" titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.actualizar" >
                                    <img align="middle" src="<spring:theme code="edit.gif"/>" alt="Editar" width="18" height="18"/>
                                </display:column><%-- actualiza --%>
                                
                                <display:column href="${actionDetalleConcepto}" media="html" paramId="${paramsDetalle}" paramProperty="conceptoYtipoConcepto" titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.detalle" >
                                    <img align="middle" src="<spring:theme code="detail.gif"/>" alt="Detalle" width="18" height="18"/>
                                </display:column><%-- detalle --%>
                                
                                <display:column href="${actionAdeudoConcepto}" media="html" paramId="${paramsAdeudo}" paramProperty="conceptoYtipoConcepto" titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.adeudo" >
                                    <img align="middle" src="<spring:theme code="detail.gif"/>" alt="Adeudo" width="18" height="18"/>
                                </display:column><%-- adeudo --%>
                                
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.codigo" property="conceptoYtipoConcepto" sortable="true"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.descripcion" property="descConPag" sortable="true"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.monto" property="mcpMonto" format="{0,number,#,##0.00}"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.porcentaje" property="mcpPorcentaje"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.actualizo" property="usuario"/>
                                <display:column titleKey="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.adeudo" property="mcpMontoAdeudo" format="{0,number,#,##0.00}"/>
                            
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
    <html:hidden path="valida"          id="valida"/>
    
    <script type="text/javascript">
        window.document.forms[0].mcpMontoLabel.focus();
        window.document.forms[0].valida.value = true;
    </script>
    
</html:form>