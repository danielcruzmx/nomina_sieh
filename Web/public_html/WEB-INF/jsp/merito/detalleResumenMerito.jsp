<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<spring:message code="selectList.nonValue" var="nonValue"/>

<html:form modelAttribute="resumenMeritoDTO">
    
    <h1><spring:message code="sireh.label.merito.resumen.detalle.titulo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" width="90%" border="0">
        <tr>
            <td align="center">
                <fieldset>
                    <legend>
                        <strong><spring:message text="Notas de Merito"/></strong>
                        <img class="fotografia" width="55" src="<spring:theme code="acierto.jpg"/>" align="middle"/>
                        <strong><spring:message text="Resumen"/></strong>
                    </legend>
                    <table width="95%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.rfc"></spring:message></td>
                            <td align="left"><fsn:label path="plazaRfc"/><fsn:detalleCalculoNomina rfc="${resumenMeritoDTO.plazaRfc}" image="detail.gif" /></td>
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.situacion.plaza"></spring:message></td>
                            <td align="left"><fsn:label path="descripcionSitua"/></td>
                         </tr>
                          <tr align="left">
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.nombre"></spring:message></td>
                            <td align="left"><fsn:label path="nombre"/></td>
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.nombramiento"></spring:message></td>
                            <td align="left"><fsn:label path="descripcionNombramiento"/></td>
                         </tr>
                          <tr align="left">
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.unidad"></spring:message></td>
                            <td align="left"><fsn:label path="idUnidadNom"/></td>
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.sueldo.mensual.tabular"></spring:message></td>
                            <td align="left"><fmt:formatNumber value="${resumenMeritoDTO.tabSueldo}" pattern="$ #,###,##0.00"/></td>
                         </tr>
                          <tr align="left">
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.puesto"></spring:message></td>
                            <td align="left"><fsn:label path="idPuestoNom"/></td>
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.ultimo.pago.puntualidad"></spring:message></td>
                            <td align="left"><fmt:formatNumber value="${resumenMeritoDTO.ultimoPagoPuntualidad}" pattern="$ #,###,##0.00"/></td>
                         </tr>
                          <tr align="left">
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.nivel"></spring:message></td>
                            <td align="left"><fsn:label path="idNivelPto"/></td>
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.ultimo.pago.consecutividad"></spring:message></td>
                            <td align="left"><fmt:formatNumber value="${resumenMeritoDTO.ultimoPagoConsecutividad}" pattern="$ #,###,##0.00"/></td>
                         </tr>
                           <tr align="left">
                            <td class="label"><spring:message code="sireh.label.merito.resumen.detalle.plaza"></spring:message></td>
                            <td align="left"><fsn:label path="idPlaza"/></td>
                            <td class="label">&nbsp;</td>
                            <td align="left">&nbsp;</td>
                         </tr>
                         <tr><td>&nbsp;</td></tr>
                    </table>
            </fieldset>
            </td>
        </tr>
    </table>
     
     <table width="100%">
        <tr>
            <td width="100%">
                <fsn:graficaMerito rfc="${resumenMeritoDTO.tdNmrRfc}" />
            </td>
        </tr>
        <tr align="center">
            <td><fsn:submit value="submit.back" action="notaDeMerito/${resumenMeritoDTO.urlOrigen}"/></td>
        </tr>
    </table>
</html:form>