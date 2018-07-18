<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="cambioRfcDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.cambioRfc.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.cambioBancarios.datosEmpleado"/></strong></legend>
                    <table align="center" width="75%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.rfcEmpleado"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${cambioRfcDTO.rfcEmpleado}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.primerApellido"/></td>
                            <td align="left"><fsn:label path="primerApellido"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.segundoApellido"/></td>
                            <td align="left"><fsn:label path="segundoApellido"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.nombreEmpleado"/></td>
                            <td align="left"><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.curpEmpleado"/></td>
                            <td align="left"><fsn:label path="curpEmpleado"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.imssIssste"/></td>
                            <td align="left"><fsn:label path="imssIssste"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.ingresoGobFed"/></td>
                            <td align="left"><fsn:label path="ingresoGobFed" /></td>
                            <td colspan="2"></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.ingresoDependencia"/></td>
                            <td align="left"><fsn:label path="ingresoDependencia"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.clabeEmpleado"/></td>
                            <td align="left"><fsn:label path="clabeEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.puesto"/></td>
                            <td align="left"><fsn:label path="idPuestoNom"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.cambioRfc.plaza"/></td>
                            <td align="left"><fsn:label path="idPlaza"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.nomina.movimiento.cambioRfc.rfcNuevo"/></td>
                            <td align="left"><html:input maxlength="13" path="rfcNuevo" size="20"/></td>
                            <td colspan="2"></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td colspan="4" align="left" height="20px" valign="middle"><spring:message code="sireh.form.required.fields"/></td>
        </tr>
    </table>
    <table align="center">
        <tr>
            <td colspan="4">&nbsp;</td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <fsn:submit value="submit.accept" action="cambioNomina/updateEmpleadoPlazaRfc.do"/>
            </td>
            <td colspan="2" align="left">
                <fsn:submit value="submit.cancel" path="cancel" action="cambioNomina/consultarRfc.do"/>
            </td>
        </tr>
    </table>
</html:form>