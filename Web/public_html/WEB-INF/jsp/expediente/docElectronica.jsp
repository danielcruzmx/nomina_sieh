<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text=" Documentaci&oacute;n"/>
                        <img class="fotografia" width="80" src="<spring:theme code="doctoselectronicos.jpg"/>" align="middle"/>       
                        <spring:message text="Electr&oacute;nica "/>
                    </strong>
                </legend>
                
                <fsn:docElectronica rfc="${expedienteDTO.rfcEmpleado}" tipo="EXPEDIENTE"/>
                
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
</table>
<br/>