<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                    <spring:message text="Antecedentes"/>
                    <img class="fotografia" width="45" src="<spring:theme code="titulado.jpg"/>" align="middle"/>      
                    <spring:message text="Acad&eacute;micos "/></strong>
                </legend>
                <table width="100%">
                    <tr> <td>&nbsp;</td> </tr>
                    <tr align="left"> 
                        <td class="label"> <spring:message code="sireh.label.expediente.nivelEscolar"></spring:message> </td>
                        <td align="left"> <fsn:label path="nivelEscolar"/> </td>
                        <td class="label"> <spring:message code="sireh.label.expediente.carrera"></spring:message> </td>
                        <td align="left">  <fsn:label path="carrera"/> </td>
                    </tr>
                    <tr align="left">
                        <td class="label"> <spring:message code="sireh.label.expediente.institucionEducativa"></spring:message> </td>
                        <td align="left">  <fsn:label path="institucionEducativa"/> </td>
                        <td class="label"> <spring:message code="sireh.label.expediente.estudiaSiNo"></spring:message> </td>
                        <td align="left">  <fsn:label path="estudiaSiNo"/>  </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
                </table>
            </fieldset>
        </td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<br/>