<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="datosEmpleadoCptoDTO">
    <p><h2><strong><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.titulo"></spring:message><fsn:label path="cpcSubTipoDesc"/></strong></h2></p>
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
                            <td align="left" width="20%"><fsn:label path="rfcEmpleado"/></td>
                            <td align="right" class="label" width="10%" ><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nombre"/></td>
                            <td align="center" width="70%"><fsn:label path="primerApellido"/><fsn:label path="segundoApellido"/><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Datos de la plaza y el puesto&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "90%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.nivel"/></td>
                            <td align="left" ><fsn:label path="idNivelPto"/></td>
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.numeroPlaza"/></td>
                            <td ><fsn:label path="idPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.unidad"/></td>
                            <td align="left" ><fsn:label path="idUnidadNom"/>&nbsp;&nbsp;&nbsp;<fsn:label path="descUnidad"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.puesto"/></td>
                            <td align="left" ><fsn:label path="idPuestoNom"/></td>
                            <td align="center" ><fsn:label path="descPuesto"/></td>
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
                    <legend style="font-size:1.3em"><strong>&nbsp;&nbsp;Detalle del Concepto&nbsp;&nbsp;</strong></legend>
                    <table align="center" width= "90%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.tipo"/></td>
                            <td align="left"><fsn:label path="idTipoCpto"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.conceptoPago"/></td>
                            <td align="left"><fsn:label path="idConcepto"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.descripcion"/></td>
                            <td align="left" ><fsn:label path="descConPag"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.monto"/></td>
                            <td align="left" ><fsn:label path="mcpMonto"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.porcentaje"/></td>
                            <td align="left" ><fsn:label path="mcpPorcentaje"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.actualizo"/></td>
                            <td align="left" ><fsn:label path="usuario"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.adeudo"/></td>
                            <td align="left"><fsn:label path="mcpMontoAdeudo"/></td>
                            <td align="right" class="label">*&nbsp;<spring:message code="sireh.label.nomina.movimientos.actualizacionNomina.actualizacionConceptos.generales.referencia"/></td>
                            <td align="left"><html:input path="mcpRefCancela" size="60" maxlength="60" tabindex="0" /></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        
                        <tr><td>&nbsp;</td></tr>
                    </table>
                    <html:hidden path="cpcSubTipo"/>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr><td colspan="4" align="left"><strong><spring:message code="sireh.form.required.fields"/></strong></td></tr>
        <tr>
            <td width="35%" align="right">
                <fsn:submit value="submit.delete" action="actualizacionNomina/eliminaConceptoEmpleado.do" path="delete" alertCode="confirm.concepto.delete"/>
            </td>
            <td width="30%">&nbsp;</td>
            <td width="35%" align="left">
                <c:set var="opMenu" value="${datosEmpleadoCptoDTO.cpcSubTipo}"/>
                    <c:choose>
                        <c:when test="${opMenu == 'G'}">
                            <c:set var="uri" value="actualizacionNomina/datosEmpleadoCptoG.do"/>
                        </c:when>
                        <c:when test="${opMenu == 'T'}">
                            <c:set var="uri" value="actualizacionNomina/datosEmpleadoCptoT.do"/>
                        </c:when>
                        <c:when test="${opMenu == 'D'}">
                            <c:set var="uri" value="actualizacionNomina/datosEmpleadoCptoD.do"/>
                        </c:when>
                        <c:when test="${opMenu == 'R'}">
                            <c:set var="uri" value="actualizacionNomina/datosEmpleadoCptoR.do"/>
                        </c:when>
                    </c:choose>
                <fsn:submit value="submit.cancel" action="${uri}"/>
            </td>
        </tr>
    </table>
    <script type="text/javascript">
        window.document.forms[0].mcpRefCancela.focus();
    </script>
</html:form>