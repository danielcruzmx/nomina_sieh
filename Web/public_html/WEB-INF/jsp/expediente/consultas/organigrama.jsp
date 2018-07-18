<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                        <spring:message text="Estructura"/>
                        <img class="fotografia" width="65" src="<spring:theme code="organigrama.jpg"/>" align="middle"/>
                        <spring:message text="B&aacute;sica "/>
                    </strong>
                </legend>
                <table>
                     <tr>
                        <td>
                            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                                    <strong><spring:message text=" Puesto y Ubicaci&oacute;n "/></strong>
                                </legend>
                                <table width="100%">
                                    <tr> <td>&nbsp;</td> </tr>
                                    <tr align="left">
                                        <td class="label"> <spring:message code="sireh.label.expediente.escTipoPlaza"></spring:message> </td>
                                        <td align="left">  <fsn:label path="descTipoPlaza"/> </td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label"> <spring:message code="sireh.label.expediente.descTipoServPub"></spring:message> </td>
                                        <td align="left">  <fsn:label path="descTipoServPub"/> </td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label"> <spring:message code="sireh.label.expediente.nombrePuesto"></spring:message> </td>
                                        <td align="left">  <fsn:label path="codigoPuesto"/> - <fsn:label path="nombrePuesto"/> </td>
                                    </tr> 
                                    <tr align="left">
                                        <td class="label"> <spring:message code="sireh.label.expediente.idInmueble"></spring:message> </td>
                                        <td align="left">  <fsn:label path="idInmueble"/> - <fsn:label path="descInmueble"/> </td>
                                    </tr>
                                    <tr> <td>&nbsp;</td> </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
                    <tr>
                        <td>
                            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                                    <strong><spring:message text=" Superior Jer&aacute;rquico "/></strong>
                                </legend>
                                <table width="100%">
                                    <tr> <td>&nbsp;</td> </tr>
                                    <tr align="left">
                                        <td class="label"> <spring:message code="sireh.label.expediente.nombreJefe"></spring:message> </td>
                                        <td align="left">  <fsn:label path="nombreJefe"/> - <fsn:label path="nombrePuestoJefe"/> </td>
                                    </tr>
                                    <tr align="left">
                                        <td class="label"> <spring:message code="sireh.label.expediente.idInmueble"></spring:message> </td>
                                        <td align="left">  <fsn:label path="idInmuebleJefe"/> - <fsn:label path="descInmuebleJefe"/> </td>
                                    </tr>
                                    <tr> <td>&nbsp;</td> </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
                </table>
            </fieldset>
        </td>
    </tr>
</table>
<br/>