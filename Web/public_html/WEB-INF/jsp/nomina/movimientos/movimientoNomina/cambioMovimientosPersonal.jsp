<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html:form modelAttribute="cambioMovimientosPersonalDTO">
    <h1><c:out value="${cambioMovimientosPersonalDTO.header}" /></h1>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.datosEmpleado.header"/></strong></legend>
                    <table align="center" width="90%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.fechaInicial"/></td>
                            <td align="left"><fsn:calendar path="fechaInicial" size="10" readonly="true"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.fechaFinal"/></td>
                            <td align="left">
                                <table border="0" >
                                    <tr>
                                        <td width="100px">
                                            <span id="spanFechaTermino" style="width:100px">
                                                <fsn:calendar path="fechaFinal" size="10" readonly="true"/>
                                            </span>
                                            <span id="spanFechaInfinita" style="width:100px">
                                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.checkFechaTermino.seleccionado"/>
                                            </span>
                                        </td>
                                        <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso or cambioMovimientosPersonalDTO.promocion}"> 
                                            <td>
                                                <span style="width:100px">
                                                    <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.checkFechaTermino"/>
                                                    <html:checkbox value="1" path="checkFechaTermino" onclick="renderFechaTermino();"/>
                                                </span>
                                            </td>
                                        </c:if>
                                    </tr>
                                </table>
                            </td>
                        <tr>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.primerApellido"/>
                            </td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="40" path="primerApellido" size="40" uppercase="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="primerApellido"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right" class="label">
                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.segundoApellido"/>
                            </td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="40" path="segundoApellido" size="40"  uppercase="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="segundoApellido"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.nombreEmpleado"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="40" path="nombreEmpleado" size="40" uppercase="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="nombreEmpleado"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right" class="label">
                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.rfcEmpleado"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:helpRoutine onClose="notyfyChanges()" path="rfcEmpleado"  maxlength="20" size="40" disabled="true" beanName="tdEmpleadoMovtosPersonalPopUp"  width="650" height="400" fieldMapping="rfcEmpleado,idTipoPago,imssIssste,clabeEmpleado,curpEmpleado,nombreEmpleado,primerApellido,segundoApellido,ingresoGobFed,ingresoDependencia,calleParticular,coloniaParticular,codigoMunicipio,idEdoParticular,codpostParticular,telParticular" title="Titulo Personalizado" maxRows="15" />
                                    </c:when>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta}">
                                        <fsn:input maxlength="13" path="rfcEmpleado" size="40" uppercase="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="rfcEmpleado"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.curpEmpleado"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="18" path="curpEmpleado" size="40" uppercase="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="curpEmpleado"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right" class="label">
                                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.imssIssste"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="11" path="imssIssste" size="40"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="imssIssste"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.ingresoGobFed"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:calendar path="ingresoGobFed" size="10" readonly="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="ingresoGobFed"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right" class="label">
                                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.ingresoDependencia"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:calendar path="ingresoDependencia" size="10" readonly="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="ingresoDependencia"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>            
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idTipoPago"/>
                            </td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcTipoPago" path="idTipoPago" disabled="${!cambioMovimientosPersonalDTO.alta and !cambioMovimientosPersonalDTO.altaPorReingreso}"  />
                            </td>
                            <td align="right" class="label">
                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.clabeEmpleado"/>
                            </td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <html:hidden path="clabeEmpleado"/>
                                        <fsn:option key="0" value="selectList.nonValue" />
                                        <fsn:selectList name="idBanco" beanName="descBancos" path="idBanco" onchange="changeIbBank();"/>
                                        <fsn:input maxlength="3" readonly="true" path="clabeEmpleado1" size="3"/>
                                        <fsn:input maxlength="15" path="clabeEmpleado2" size="20" css="numeric"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="clabeEmpleado"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <!-- DATOS DE DOMICILIO -->
                        <tr>
                            <td align="right" class="label" width="40%">
                                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                                <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.calle"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="60" path="calleParticular" size="60" uppercase="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="calleParticular"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right" class="label" width="40%">
                                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                                <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.colonia"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="60" path="coloniaParticular" size="60" uppercase="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="coloniaParticular"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                                <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.telefono"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="15" path="telParticular" size="15" uppercase="true"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="telParticular"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                            <td align="right" class="label" width="40%">
                                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                                <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.cp"/></td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">
                                        <fsn:input maxlength="5" path="codpostParticular" size="5"/>
                                    </c:when>
                                    <c:otherwise>
                                        <fsn:label path="codpostParticular"/>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">
                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.entidadFederativa"/>
                            </td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcEstado" path="idEdoParticular" disabled="${!cambioMovimientosPersonalDTO.alta and !cambioMovimientosPersonalDTO.altaPorReingreso}" />
                            </td>
                            <td align="right" class="label">
                                <c:if test="${cambioMovimientosPersonalDTO.alta or cambioMovimientosPersonalDTO.altaPorReingreso}">* </c:if>
                                <spring:message code="sireh.label.nomina.movimiento.cambioDomicilio.delegacion"/>
                            </td>
                            <td align="left">
                                <input type="hidden" id="codigoMunicipio"/>
                                <fsn:option key="-1" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcMunicipio" path="idMuniParticular" parentPath="idEdoParticular" progress="true" disabled="${!cambioMovimientosPersonalDTO.alta and !cambioMovimientosPersonalDTO.altaPorReingreso}"/>
                            </td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>

    <table align="center" width="100%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.datosPlaza.header"/></strong></legend>
                    <table align="center" width="90%">
                        <tr><td>&nbsp;</td></tr>
                        <!-- DATOS DE PLAZA -->
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descPuesto"/></td>
                            <td align="left"><fsn:label path="descPuesto" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idPlaza"/></td>
                            <td align="left"><fsn:label path="idPlaza"/></td>
                        </tr>  
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idRangoNom"/></td>
                            <td align="left"><fsn:label path="idRangoNom" /></td>
                        </tr>    
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idNivelPto"/></td>
                            <td align="left"><fsn:label path="idNivelPto" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idZonaEcoNom"/></td>
                            <td align="left"><fsn:label path="idZonaEcoNom" /></td>
                        </tr>         
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descEstado"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcEstado" path="idEdo" disabled="true"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descMunicipio"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue" />
                                <fsn:selectList beanName="tcMunicipio" path="idMunicipio" parentPath="idEdo" progress="true" disabled="true"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.plazaImpHono"/></td>
                            <td align="left"><fsn:label path="plazaImpHono" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descGrupoPago"/></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcGrupoPago" path="idGrupoPago" disabled="true"/> 
                            </td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idZonaDistNom"/></td> 
                            <fsn:selectList beanName="tcDistUnidadIdUnidad" disabled="true" path="idUnidadNom"  />
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcDistUnidadIdDistUnidad" path="idZonaDistNom" progress="true" parentPath="idUnidadNom" disabled="${!cambioMovimientosPersonalDTO.alta and !cambioMovimientosPersonalDTO.altaPorReingreso and !cambioMovimientosPersonalDTO.promocion}"/> 
                            </td>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.plazaReferencia"/></td>
                            <td align="left"><fsn:input maxlength="19" path="plazaReferencia" size="40" uppercase="true"/></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
                    
        <!-- Datos plaza nueva -->
    <c:if test="${cambioMovimientosPersonalDTO.promocion}">
        <table align="center" width="100%">
            <tr>
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.datosPlazaPromocion.header"/></strong></legend>
                            <table align="center" width="90%">
                            <tr><td>&nbsp;</td></tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descPuesto"/></td>
                                <td align="left"><fsn:input path="descPuestoPromo" readonly="true" size="40" uppercase="true"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idPlaza"/></td>
                                <td align="left">
                                    <fsn:helpRoutine path="idPlazaPromo"  maxlength="20" size="20" disabled="true" beanName="plazaMovtosPersonalPopUp"  width="650" height="400" onClose="notyfyChangesUnidad()" fieldMapping="idPlazaPromo, descPuestoPromo, idRangoNomPromo, idUnidadNomPromo, idPuestoNomPromo, idJerarquiaPromo, idNombramientoPromo, idNivelPtoPromo, idZonaEcoNomPromo, idEdoPromo, descEstadoPromo, idMunicipioPromo, descMunicipioPromo, idGrupoPagoPromo, descGrupoPagoPromo, plazaImpHonoPromo, idZonaDistNomPromo, plazaReferenciaPromo, plazaIniContPromo, plazaFinContPromo" title="Titulo Personalizado" maxRows="15" />
                                </td>
                            </tr>  
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idRangoNom"/></td>
                                <td align="left"><fsn:input path="idRangoNomPromo" readonly="true" size="40" uppercase="true"/></td>
                            </tr>    
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idNivelPto"/></td>
                                <td align="left"><fsn:input path="idNivelPtoPromo" readonly="true" size="40" uppercase="true"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idZonaEcoNom"/></td>
                                <td align="left"><fsn:input path="idZonaEcoNomPromo" readonly="true" size="40" uppercase="true"/></td>
                            </tr>         
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descEstado"/></td>
                                <td align="left"><fsn:input path="descEstadoPromo" readonly="true" size="40" uppercase="true"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descMunicipio"/></td>
                                <td align="left"><fsn:input path="descMunicipioPromo" readonly="true" size="40" uppercase="true"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.plazaImpHono"/></td>
                                <td align="left"><fsn:input path="plazaImpHonoPromo" readonly="true" size="40" uppercase="true"/></td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.descGrupoPago"/></td>
                                <td align="left"><fsn:input path="descGrupoPagoPromo" readonly="true" size="40" uppercase="true"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idZonaDistNom"/></td>
                                <fsn:selectList beanName="tcDistUnidadIdUnidad" disabled="true" path="idUnidadNomPromo"  />
                                <td align="left">
                                    <input type="hidden" id="codigoUnidadNom"/>
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcDistUnidadIdDistUnidad" path="idZonaDistNomPromo" progress="true" parentPath="idUnidadNomPromo" /> 
                                </td>
                                <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.plazaReferencia"/></td>
                                <td align="left"><fsn:input maxlength="40" path="plazaReferenciaPromo" size="40" readonly="true" uppercase="true"/></td>
                            </tr>
                            
                            <tr><td>&nbsp;</td></tr>
                        </table>
                    </fieldset>
                </td>
            </tr>
        </table>                            
    </c:if>
		
    <table align="center" width="100%">
        <tr>
            <td colspan="4" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
        <tr>
            <td align="center" colspan="2">
                <fsn:submit value="submit.accept" action="movimientoNomina/updateMovimientosPersonal.do"/>
            </td>
            <td align="center" colspan="2">
                <fsn:submit value="submit.cancel" path="cancel" action="movimientoNomina/${fn:toLowerCase(cambioMovimientosPersonalDTO.mpTipoMovMenu)}"/>
            </td>
        </tr>
    </table>

    <html:hidden path="idUnidadNomPromo"/>
    <html:hidden path="idPuestoNomPromo"/>
    <html:hidden path="idJerarquiaPromo"/>
    <html:hidden path="idNombramientoPromo"/>
    
    
    <html:hidden path="idJerarquia"/>
    <html:hidden path="idNombramiento"/>
    
    <html:hidden path="alta" />
    <html:hidden path="altaPorReingreso" />
    <html:hidden path="baja" />
    <html:hidden path="promocion" />
    <html:hidden path="licencia"/>
    <html:hidden path="prorroga"/>
    <html:hidden path="preventiva"/>
    <html:hidden path="inicioQuincenaCaptura"/>
    <html:hidden path="finQuincenaCaptura"/>
    
    <html:hidden path="idMovsPersonal"/>
    <html:hidden path="mpTipoMovMenu"/>
    <html:hidden path="idSitPlaNva"/>
    <html:hidden path="idSitPlaAnt"/>
    <html:hidden path="descMovsPersonal"/>
    <html:hidden path="idPuestoNom"/>
    <html:hidden path="plazaIniCont"/>
    <html:hidden path="plazaFinCont"/>
    <html:hidden path="plazaIniLic"/>
    <html:hidden path="plazaFinLic"/>
    <html:hidden path="plazaIniContPromo"/>
    <html:hidden path="plazaFinContPromo"/>

    <script type="text/javascript" >

        $j(document).ready(function(){
            if( $j('#idTipoPago').val() == 'CH'){
                $j('#idBanco').attr('disabled', 'false');
                $j('#clabeEmpleado2').attr('disabled', 'true');
                $j('#clabeEmpleado2').val('000000000000000');
            }
            
            if( $j('#idTipoPago').val() == 'TD'){
                $j('#idBanco').removeAttr('disabled');
                $j('#clabeEmpleado2').removeAttr('disabled');
            }
            $j('.numeric').numeric();
        });


        document.getElementById("idUnidadNom").style.display = 'none';
        document.getElementById("idUnidadNomPromo").style.display = 'none';

        function notyfyChanges(){
            var selectidEdoParticular = document.getElementById('idEdoParticular');
            if(document.all) { // IE Way
                selectidEdoParticular.fireEvent('onchange');
            } else  { // Firefox Way
                var evtidEdoParticular = document.createEvent('HTMLEvents');
                evtidEdoParticular.initEvent('change', true, true);
                selectidEdoParticular.dispatchEvent(evtidEdoParticular);
            }
            setTimeout(selectMuni, 2000);
            var clabeEmpleadoTD = $j('#clabeEmpleado').val();
            var clabeEmpleado1 = clabeEmpleadoTD.substring(0, 3);
            var clabeEmpleado2 = clabeEmpleadoTD.substring(3);
            $j('#clabeEmpleado1').val(clabeEmpleado1);
            $j('#clabeEmpleado2').val(clabeEmpleado2);
            $j('#idBanco').val(clabeEmpleado1);
        }

        function selectMuni(){
            selectIdMuniParticular = document.getElementById('idMuniParticular');
                selectIdMuniParticular.value= document.getElementById('codigoMunicipio').value;
        }

        function notyfyChangesUnidad(){
            var selectidUnidadNomPromo = document.getElementById('idUnidadNomPromo');
            if(document.all) { // IE Way
                selectidUnidadNomPromo.fireEvent('onchange');
            } else  { // Firefox Way
                var evtidUnidadNomPromo = document.createEvent('HTMLEvents');
                evtidUnidadNomPromo.initEvent('change', true, true);
                selectidUnidadNomPromo.dispatchEvent(evtidUnidadNomPromo);
            }
            setTimeout(selectZonaDistNom, 2000);
        }

        function selectZonaDistNom(){
            selectIdZonaDistNom = document.getElementById('idZonaDistNom');
            selectIdZonaDistNom.value= document.getElementById('codigoUnidadNom').value;
        }

        var seleccionInicial = <c:out value="${cambioMovimientosPersonalDTO.checkFechaTermino}"/>;
        if (seleccionInicial) {
            document.getElementById("spanFechaTermino").style.display = 'none';
            document.getElementById("spanFechaInfinita").style.display = 'block';
        } else {
            document.getElementById("spanFechaTermino").style.display = 'block';
            document.getElementById("spanFechaInfinita").style.display = 'none';
        }
        
        function renderFechaTermino() {
            var seleccion = document.getElementById("checkFechaTermino1").checked;
        
            if (seleccion) {
                document.getElementById("spanFechaTermino").style.display = 'none';
                document.getElementById("spanFechaInfinita").style.display = 'block';
            } else {
                document.getElementById("spanFechaTermino").style.display = 'block';
                document.getElementById("spanFechaInfinita").style.display = 'none';
            }
        }
        
        function changeIbBank(){
            var idBanco = document.getElementsByName("idBanco");
            var clabeEmpleado = document.getElementById("clabeEmpleado1");
            clabeEmpleado.value = idBanco[0].value;
        }
        
        $j('#idTipoPago').change(function(){
            if( $j('#idTipoPago').val() == 'CH'){
                $j('#idBanco').val('000');                
                $j('#idBanco').attr('disabled', 'false');
                $j('#clabeEmpleado1').val('000');
                $j('#clabeEmpleado2').val('000000000000000');
                $j('#clabeEmpleado2').attr('disabled', 'true');
            }
            
            if( $j('#idTipoPago').val() == 'TD'){
                $j('#idBanco').val('0');                
                $j('#idBanco').removeAttr('disabled');
                $j('#clabeEmpleado1').val('');
                $j('#clabeEmpleado2').removeAttr('disabled');
            }
            
            if( $j('#idTipoPago').val() == '0'){
                $j('#idBanco').val('0');                
                $j('#idBanco').attr('disabled', 'disabled');
                $j('#clabeEmpleado1').val('');
                $j('#clabeEmpleado2').val('');
                $j('#clabeEmpleado2').attr('disabled', 'disabled');
            }
        });
    </script>    
</html:form>

