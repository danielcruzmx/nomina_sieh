<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="actualizaErarioFedDTO">
    <h1><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.path.header"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.datosEmpleado.header"/></strong></legend>
                    <table align="center" width="70%">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.rfcEmpleado"/></td>
                            <td align="left"><fsn:label path="rfcEmpleado"/><fsn:detalleCalculoNomina rfc="${actualizaErarioFedDTO.rfcEmpleado}" image="detail.gif" /></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.primerApellido"/></td>
                            <td align="left"><fsn:label path="primerApellido"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.segundoApellido"/></td>
                            <td align="left"><fsn:label path="segundoApellido"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.nombreEmpleado"/></td>
                            <td align="left"><fsn:label path="nombreEmpleado"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.idPlaza"/></td>
                            <td align="left"><fsn:label path="idPlaza"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.idPuestoNom"/></td>
                            <td align="left"><fsn:label path="idPuestoNom"/></td>
                        </tr>
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.idNivelPto"/></td>
                            <td align="left"><fsn:label path="idNivelPto"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.datosErario.header"/></strong></legend>
                    <table align="center">
                        <tr>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.hasErario"/></td>
                            <td align="left"><html:checkbox path="hasErario" /> </td>
                            <td align="right" class="label"><spring:message code="sireh.label.nomina.movimiento.actualizaErarioFed.mcpRefCaptura"/></td>
                            <td align="left"><fsn:input path="movtoConceptoPagoDTO.mcpRefCaptura" size="30"/> </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <p>&nbsp;</p>
    <table align="center">
        <tr>
            <td align="center">
                <fsn:submit value="submit.accept" action="actualizacionNomina/updateErarioFed.do"/>
            </td>
            <td align="center">
                <fsn:submit value="submit.cancel" path="cancel" action="actualizacionNomina/gestionErarioFed.do"/>
            </td>
        </tr>
    </table>
    
    <html:hidden path="movtoConceptoPagoDTO.idMovtoConceptoPago" />
    <html:hidden path="movtoConceptoPagoDTO.idSitCaptura" />
</html:form>