<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html:form modelAttribute="promocionMasivaDTO">
    <h1>
        <spring:message code="sireh.label.plaza.masivas.eventuales.promociones.titulo"/>
    </h1>
    <p>&nbsp;</p>
    <table width="80%">
        <tr>
            <td class="label">
                <spring:message code="sireh.label.plaza.masivas.creacion.mensaje.validacion"></spring:message>
            </td>
            <td>
                <fsn:label path="mensaje"/>
            </td>
        </tr>
        <c:if test="${!promocionMasivaDTO.archivoValido && !promocionMasivaDTO.plantillaErronea}">
            <tr>
                <td class="label">
                    <spring:message code="sireh.label.plaza.masivas.creacion.archivo"></spring:message>
                </td>
                <td>
                    <fsn:link action="notaDeMerito/downloadFile"
                              parameters="nombreArchivoErrores=${promocionMasivaDTO.nombreArchivoErrores}"
                              progressIcon="false">
                        <c:out value="${promocionMasivaDTO.nombreArchivoErrores}"/>
                    </fsn:link>
                </td>
            </tr>
        </c:if>
    </table>
    <c:if test="${promocionMasivaDTO.archivoValido}">
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
                                action="plazaEventualMasiva/${promocionMasivaDTO.urlOrigen}"
                                progressBar="true"/>
                </td>
                <td align="left">
                    <fsn:submit value="submit.accept" path="promocion"
                                action="plazaEventualMasiva/${promocionMasivaDTO.urlDestino}"
                                progressBar="true"/>
                </td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
            </tr>
        </table>
    </c:if>
    <html:hidden path="nombreArchivoErrores"/>
</html:form>