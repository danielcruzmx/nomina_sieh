<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<html:form modelAttribute="datosBasicos1DTO">
    <html:hidden path="rfcEmpleado"/>
    <html:hidden path="rfcUnico"/>
    <h1><spring:message code="sireh.label.rusp.movimiento.curp.titulo"></spring:message></h1>
    <p>&nbsp;</p>
    <table align="center" width="75%">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong><spring:message code="sireh.label.rusp.movimiento.cambioCurpHijos.datosHijo.header"/></strong></legend>
                    <table align="center" width="100%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td align="right" class="label">* <spring:message code="sireh.label.rusp.movimiento.datosBasicosDTO.nombre"/></td>
                            <td align="left"><fsn:input maxlength="40" path="nombreEmpleado" size="40" uppercase="true"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.rusp.movimiento.datosBasicosDTO.primerApellido"/></td>
                            <td align="left"><fsn:input maxlength="40" path="primerApellido" size="40" uppercase="true"/></td>
                             <td align="right" class="label"> <spring:message code="sireh.label.rusp.movimiento.datosBasicosDTO.segundoApellido"/></td>
                            <td align="left"><fsn:input maxlength="40" path="segundoApellido" size="40" uppercase="true"/></td>
                            <td align="right" class="label">* <spring:message code="sireh.label.rusp.movimiento.datosBasicosDTO.curp"/></td>
                            <td align="left"><fsn:input maxlength="18" path="curpEmpleado" size="18" uppercase="true"/></td>
                       </tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>

    <table align="center" width="50%">    
        <tr>
            <td align="center">
                <fsn:submit value="submit.accept" path="grabacurp1" action="gestionRusp/updateCurpHijos.do"/>
            </td>
            <td align="center">
                <fsn:submit value="submit.cancel" path="cancurp1" action="gestionRusp/cancelar.do"/>
            </td>
        </tr>
    </table>
</html:form>
