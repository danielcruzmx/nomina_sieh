<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:message code="selectList.nonValue" var="nonValue"/>
<html:form modelAttribute="pagoMeritoDTO">
<h1><spring:message code="sireh.label.merito.generacion.archivo.pago.titulo"/></h1>
    <p>&nbsp;</p>
    
    <c:choose>
        <c:when test="${pagoMeritoDTO.tdNmhCveCausal == 3}">
            <table align="center" width="70%" border="0">
                <tr>
                    <td align="center">
                        <fieldset>
                            <legend>
                                <strong><spring:message text=" Notas de Merito"/></strong>
                                <img class="fotografia" width="60" src="<spring:theme code="acierto.jpg"/>" align="middle"/>       
                                <strong><spring:message text=" Puntualidad "/></strong>
                            </legend>
                            <table width="80%">
                                 <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.merito.archivo.archivo"></spring:message></td>
                                    <td align="left"><fsn:link action="notaDeMerito/downloadFile" parameters="nombreArchivoErrores=${pagoMeritoDTO.nombreArchivoErrores}" progressIcon="false" >
                                          <c:out value="${pagoMeritoDTO.nombreArchivoErrores}" />
                                        </fsn:link>
                                    </td>
                                </tr>
                                <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.merito.archivo.archivo.rechazos"></spring:message></td>
                                    <td align="left"><fsn:link action="notaDeMerito/downloadFileRechazos" parameters="nombreArchivoRechazos=${pagoMeritoDTO.nombreArchivoRechazos}" progressIcon="false" >
                                          <c:out value="${pagoMeritoDTO.nombreArchivoRechazos}" />
                                        </fsn:link>
                                    </td>
                                </tr>
                                <tr>
                                    <td rowspan="2"><fsn:label path="mensaje"/></td>
                                </tr>
                            </table>
                        </fieldset>
                    </td>
                </tr>
            </table>
        </c:when>
        <c:otherwise>
            <table align="center" width="70%" border="0">
                <tr>
                    <td align="center">
                        <fieldset>
                            <legend>
                                <strong><spring:message text=" Notas de Merito"/></strong>
                                <img class="fotografia" width="60" src="<spring:theme code="capacitacion.jpg"/>" align="middle"/>       
                                <strong><spring:message text=" Capacitaci&oacute;n "/></strong>
                            </legend>
                            <table width="80%">
                                 <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.merito.archivo.archivo"></spring:message></td>
                                    <td align="left"><fsn:link action="notaDeMerito/downloadFile" parameters="nombreArchivoErrores=${pagoMeritoDTO.nombreArchivoErrores}" progressIcon="false" >
                                          <c:out value="${pagoMeritoDTO.nombreArchivoErrores}" />
                                        </fsn:link>
                                    </td>
                                </tr>
                                <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.merito.archivo.archivo.rechazos"></spring:message></td>
                                    <td align="left"><fsn:link action="notaDeMerito/downloadFileRechazos" parameters="nombreArchivoRechazos=${pagoMeritoDTO.nombreArchivoRechazos}" progressIcon="false" >
                                          <c:out value="${pagoMeritoDTO.nombreArchivoRechazos}" />
                                        </fsn:link>
                                    </td>
                                </tr>
                                <tr>
                                    <td rowspan="2"><fsn:label path="mensaje"/></td>
                                </tr>
                            </table>
                        </fieldset>
                    </td>
                </tr>
            </table>
        </c:otherwise>
    </c:choose>
            
            
            
                            
            
            
    
</html:form>