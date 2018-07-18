<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<table width="100%" align="center">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong><spring:message text="Notas de"/>
                    <img class="fotografia" width="65" src="<spring:theme code="acierto.jpg"/>" align="middle"/>                                   
                    <strong><spring:message text="M&eacute;rito "/></strong>
                </legend>
                <table width="100%">
                    <tr> <td align="center">  <fsn:graficaMerito rfc="${expedienteDTO.rfcEmpleado}" /> </td> </tr>
                </table>
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<br/>