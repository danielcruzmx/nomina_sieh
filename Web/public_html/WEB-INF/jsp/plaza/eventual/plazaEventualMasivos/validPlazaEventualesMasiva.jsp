<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html:form modelAttribute="creacionPlazaMasivaDTO">
    <c:choose>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq \'C\'}">
            <h1>
                <spring:message code="sireh.label.plaza.masivas.conversion.titulo"/>
            </h1>
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq \'R\'}">
            <h1>
                <spring:message code="sireh.label.plaza.masivas.reubicacion.titulo"/>
            </h1>
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq \'CR\'}">
            <h1>
                <spring:message code="sireh.label.plaza.masivas.eventuales.creacion.titulo"/>
            </h1>
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq \'CA\'}">
            <h1>
                <spring:message code="sireh.label.plaza.masivas.cancelacion.titulo"/>
            </h1>
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq \'TR\'}">
            <h1>
                <spring:message code="sireh.label.plaza.masivas.transferencia.titulo"/>
            </h1>
        </c:when>
    </c:choose>
    <p>&nbsp;</p>
    <table width="80%">
        <tr>
            <td class="label">
                <spring:message code="sireh.label.plaza.masivas.creacion.mensaje.validacion"></spring:message>
            </td>
            <td>
                <fsn:label path="mensaje"/>
            </td>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
        </tr>
        <c:if test="${!creacionPlazaMasivaDTO.archivoValido && !creacionPlazaMasivaDTO.plantillaErronea}">
            <tr>
                <td class="label">
                    <spring:message code="sireh.label.plaza.masivas.creacion.archivo"></spring:message>
                </td>
                <td>
                    <fsn:link action="plazaEventualMasiva/downloadFile"
                              parameters="nombreArchivoErrores=${creacionPlazaMasivaDTO.nombreArchivoErrores}"
                              progressIcon="false">
                        <c:out value="${creacionPlazaMasivaDTO.nombreArchivoErrores}"/>
                    </fsn:link>
                </td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </c:if>
    </table>
    <c:if test="${creacionPlazaMasivaDTO.archivoValido}">
        <table width="80%">
            <tr>
                <td class="label">
                    <spring:message code="sireh.label.plaza.masivas.eventuales.creacion.observaciones"></spring:message>
                </td>
                <td>
                    <fsn:textarea rows="5" cols="100" uppercase="false" path="mepObserva"/>
                </td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </table>
        <p>&nbsp;</p>
        <table width="80%" align="center">
            <tr>
                <td align="rigth">
                    <fsn:submit value="submit.cancel"
                                action="plazaEventualMasiva/${creacionPlazaMasivaDTO.urlOrigen}"
                                progressBar="true"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.accept"
                                action="plazaEventualMasiva/${creacionPlazaMasivaDTO.urlDestino}"
                                progressBar="true"/>
                </td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </table>
    </c:if>
    <html:hidden path="nombreArchivoErrores"/>
</html:form>