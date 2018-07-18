<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>

<table width="100%">
    <tr>
        <td align="center">
            <fieldset style='border-style:outset; border-width: <c:out value="${expedienteDTO.gruesolinea}"/>; border-color: <c:out value="${expedienteDTO.colormarco}"/>;'>
                <legend style='font-size:<c:out value="${expedienteDTO.gruesoletra}"/>; border-style:solid; border-color:white;  background-color:white; color:black;'>
                    <strong>
                    <spring:message text=" Datos"/>
                    <img class="fotografia" width="50" src="<spring:theme code="usopc.jpg"/>" align="middle"/>
                    <spring:message text="Laborales "/></strong>
                </legend>
                <table width="100%">
                    <tr> <td>&nbsp;</td> </tr>
                    <tr align="left">
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.idPlaza"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="idPlaza"/> - <fsn:label path="descSitPlaza"/> - <fsn:label path="descNombramientoNom"/> </td>
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.uniDescNom"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="uniDescNom"/> </td>
                    </tr>
                    <tr align="left">
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.descPuestoNom"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="descPuestoNom"/> </td>
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.idNivelPtoNom"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="idNivelPtoNom"/> - <fsn:label path="idRangoNom"/> </td>
                    </tr>
                    <tr align="left">
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.descGrupoPago"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="descGrupoPago"/> - <fsn:label path="descJeraquiaNom"/> </td>
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.descEstadoNom"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="descEstadoNom"/> - <fsn:label path="descMunicipioNom"/> - <fsn:label path="idZonaEcoNom"/> </td>
                    </tr>
                    <tr align="left">
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.sueldoNomLabel"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="sueldoNomLabel"/> </td>
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.sueldoHonLabel"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="sueldoHonLabel"/> </td>
                    </tr>
                    <tr align="left">
                        <td class="label" width="250"> <spring:message code="sireh.label.expediente.compensacionNomLabel"></spring:message> </td>
                        <td align="left" width="250">  <fsn:label path="compensacionNomLabel"/> </td>
                    </tr>
                    <tr> <td>&nbsp;</td> </tr>
                </table>
            </fieldset>
        </td>
    </tr>
    <tr> <td>&nbsp;</td> </tr>
</table>
<br/>