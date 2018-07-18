<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="creacionPlazaMasivaDTO">
    <h1><spring:message code="sireh.label.plaza.masivas.creacion.titulo"/></h1>  
    <p>&nbsp;</p>
    <table width="80%">
         <tr>   
            <td class="label"><spring:message code="sireh.label.plaza.masivas.creacion.mensaje.update"></spring:message></td>
            <td><fsn:label path="mensaje"/></td>           
        </tr>
    </table>
</html:form>