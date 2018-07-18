<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form modelAttribute="notaDeMeritoDTO">
<h1><spring:message code="sireh.label.merito.archivoCapacitacion.titulo.resultado"/></h1>
    <p>&nbsp;</p>
        
        <table align="center" width="70%" border="0">
            <tr>
                <td align="center">
                    <fieldset>
                        <legend>
                            <strong><spring:message text="Notas de Merito"/></strong>
                            <img class="fotografia" width="60" src="<spring:theme code="capacitacion.jpg"/>" align="middle"/>       
                            <strong><spring:message text="Capacitaci&oacute;n"/></strong>
                        </legend>
                        
                        <table width="90%">
                            <c:if test="${!notaDeMeritoDTO.plantillaErronea}">
                                <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.merito.archivo.notas.correctas"></spring:message></td>
                                    <td align="left"><fsn:label path="numeroNotasMeritoCorrectas"/></td>
                                </tr>
                                <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.merito.archivo.notas.incorrectas"></spring:message></td>
                                    <td align="left"><fsn:label path="numeroNotasMeritoIncorrectas"/></td>
                                </tr>
                                <c:if test="${notaDeMeritoDTO.numeroNotasMeritoIncorrectas > 0}">
                                    <tr align="left">
                                        <td class="label"><spring:message code="sireh.label.merito.archivo.notas.incorrectas"></spring:message></td>
                                        <td align="left"><fsn:link action="notaDeMerito/downloadFile" parameters="nombreArchivoErrores=${notaDeMeritoDTO.nombreArchivoErrores}" progressIcon="false" >
                                              <c:out value="${notaDeMeritoDTO.nombreArchivoErrores}" />
                                            </fsn:link></td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label"><spring:message code="sireh.label.merito.archivo.concentrado"></spring:message></td>
                                        <td align="left"><fsn:link action="notaDeMerito/downloadFileCon" parameters="nombreArchivoConcent=${notaDeMeritoDTO.nombreArchivoConcent}" progressIcon="false" >
                                              <c:out value="${notaDeMeritoDTO.nombreArchivoConcent}" />
                                            </fsn:link></td>
                                    </tr>
                                </c:if>
                                <tr><td>&nbsp;</td></tr>
                            </c:if>
                            <tr>
                                <td rowspan="2"><fsn:label path="mensaje"/></td>
                            </tr>
                        </table>
                        
                    </fieldset>
                </td>
            </tr>
        </table>
        
 
</html:form>