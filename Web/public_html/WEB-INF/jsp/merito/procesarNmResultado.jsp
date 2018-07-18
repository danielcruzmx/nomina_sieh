<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:message code="selectList.nonValue" var="nonValue"/>
<html:form modelAttribute="procesoNmDTO" method="post" enctype="multipart/form-data">
<h1><spring:message code="sireh.proceso.nm.titulo"/></h1>
    <p>&nbsp;</p>
    <table align="center" width="70%" border="0">
        <tr>
            <td align="center">
                <fieldset>
                    <c:choose>
                        <c:when test="${procesoNmDTO.tdNmrCveCausal == 3}">
                            <legend>
                                <strong><spring:message text="Notas de M&eacute;rito"/></strong>
                                <img class="fotografia" width="55" src="<spring:theme code="acierto.jpg"/>" align="middle"/>       
                                <strong><spring:message text=" Puntualidad"/></strong>
                            </legend> 
                            <table width="80%">
                                <tr><td align="center"><fsn:label path="regreso"/><spring:message code="sireh.proceso.nm.resultado"></spring:message></td></tr>
                             </table>
                        </c:when>
                        <c:otherwise>
                            <legend>
                                <strong><spring:message text="Notas de M&eacute;rito"/></strong>
                                <img class="fotografia" width="60" src="<spring:theme code="capacitacion.jpg"/>" align="middle"/>       
                                <strong><spring:message text="Capacitaci&oacute;n"/></strong>
                            </legend>
                            <table width="80%">
                                <tr><td align="center"><fsn:label path="regreso"/><spring:message code="sireh.proceso.nm.resultado"></spring:message></td></tr>
                             </table>
                        </c:otherwise>
                    </c:choose>
            </fieldset>
            </td>
        </tr>
    </table>
</html:form>