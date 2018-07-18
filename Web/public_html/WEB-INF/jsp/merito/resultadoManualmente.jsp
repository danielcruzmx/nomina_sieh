<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form modelAttribute="meritoManualDTO">
<h1><spring:message code="sireh.label.merito.archivoManual.resultado.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="70%" border="0">
        <tr>
            <td align="center">
                <fieldset>
                    <legend style="font-size:1.2em">
                        <strong><spring:message text="Notas de Merito"/></strong>
                        <img class="fotografia" width="60" src="<spring:theme code="pluma.jpg"/>" align="middle"/>       
                        <strong><spring:message text="Manualmente"/></strong>
                    </legend>
                    <table width="80%">
                        <tr><td>&nbsp;</td></tr>
                        <tr>
                            <td rowspan="2" align="left" style="font-size:1.6em"><strong><fsn:label path="mensaje"/></strong></td>
                        </tr>
                        <tr><td>&nbsp;</td></tr>
                        <tr><td>&nbsp;</td></tr>
                    </table>
                    </fieldset>
                </td>
            </tr>
        </table>
</html:form>