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
            <h1><spring:message code="sireh.label.plaza.masivas.honorarios.creacion.titulo"/></h1>  
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
            <td class="label"><spring:message code="sireh.label.plaza.masivas.creacion.mensaje.update"></spring:message></td>
            <td><fsn:label path="mensaje"/></td>           
        </tr>
    </table>
</html:form>