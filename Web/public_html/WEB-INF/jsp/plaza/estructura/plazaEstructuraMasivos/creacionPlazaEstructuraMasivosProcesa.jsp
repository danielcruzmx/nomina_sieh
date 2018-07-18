<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="creacionPlazaMasivaDTO">
    <c:choose>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'C'}">
            <h1><spring:message code="sireh.label.plaza.masivas.conversion.titulo"/></h1>  
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'R'}">
            <h1><spring:message code="sireh.label.plaza.masivas.reubicacion.titulo"/></h1>  
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'CR'}">
            <h1><spring:message code="sireh.label.plaza.masivas.creacion.titulo"/></h1>  
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'CA'}">
            <h1><spring:message code="sireh.label.plaza.masivas.cancelacion.titulo"/></h1>  
        </c:when>
        <c:when test="${creacionPlazaMasivaDTO.tipoProceso eq 'TR'}">
            <h1><spring:message code="sireh.label.plaza.masivas.transferencia.titulo"/></h1>  
        </c:when>
    </c:choose>
    <p>&nbsp;</p>
    <table width="80%">
         <tr>   
            <td class="label"><spring:message code="sireh.label.plaza.masivas.creacion.mensaje.validacion"></spring:message></td>
            <td><fsn:label path="mensaje" /></td>            
        </tr>
        <c:if test="${!creacionPlazaMasivaDTO.archivoValido && !creacionPlazaMasivaDTO.plantillaErronea}">
         <tr>   
            <td class="label"><spring:message code="sireh.label.plaza.masivas.creacion.archivo"></spring:message></td>
            <td><fsn:link action="plazaEstructuraMasiva/downloadFile" parameters="nombreArchivoErrores=${creacionPlazaMasivaDTO.nombreArchivoErrores}" progressIcon="false" >
                  <c:out value="${creacionPlazaMasivaDTO.nombreArchivoErrores}" />
                </fsn:link></td>            
        </tr>        
        </c:if>
    </table>
    <c:if test="${creacionPlazaMasivaDTO.archivoValido}">
    <table width="80%">
        <tr>
                <td  align="center">
                    <fsn:submit value="submit.cancel" action="plazaEstructuraMasiva/${creacionPlazaMasivaDTO.urlOrigen}" progressBar="true" />
                    <fsn:submit value="submit.accept" action="plazaEstructuraMasiva/${creacionPlazaMasivaDTO.urlDestino}" progressBar="true"/>
                </td>
        </tr>
    </table>
    </c:if>
    <html:hidden path="nombreArchivoErrores" />
</html:form>