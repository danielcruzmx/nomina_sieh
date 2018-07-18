<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:message code="selectList.nonValue" var="nonValue"/>
<html:form modelAttribute="notaDeMeritoDTO">
<h1><spring:message code="sireh.label.merito.archivoEvaluacion.titulo.resultado"/></h1>
    <p>&nbsp;</p>
 <table width="80%">
        <c:if test="${!notaDeMeritoDTO.plantillaErronea}">
        <tr align="left">
            <td class="label"><spring:message code="sireh.label.merito.archivo.notas.correctas"></spring:message></td>
            <td align="left"><fsn:label path="numeroNotasMeritoCorrectas"/></td>
        </tr>
        <tr align="left">
            <td class="label"><spring:message code="sireh.label.merito.archivo.notas.incorrectas"></spring:message></td>
            <td align="left"><fsn:label path="numeroNotasMeritoIncorrectas"/></td>
        </tr>
         <tr align="left">
            <td class="label"><spring:message code="sireh.label.merito.archivo.archivo"></spring:message></td>
            <td align="left"><fsn:link action="notaDeMerito/downloadFile" parameters="nombreArchivoErrores=${notaDeMeritoDTO.nombreArchivoErrores}" progressIcon="false" >
                  <c:out value="${notaDeMeritoDTO.nombreArchivoErrores}" />
                </fsn:link></td>
        </tr>
         </c:if>
         <tr>
            <td rowspan="2"><fsn:label path="mensaje"/></td>
        </tr>
    </table>
</html:form>