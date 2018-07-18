<%--@Descripcion: Vista encargada de consultar el detalle de la notificacion.--%>
<%--@Autor: Oscar S.--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>

<html:form modelAttribute="detalleNotificacionDTO">
    
    <h1><spring:message code="sireh.label.oficinaVirtual.notificaciones.detalle.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Notificaci&oacute;n</strong></legend>
                    <table width="100%" align="left">
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.oficinaVirtual.notificaciones.detalle.idNotificacion"/>:</td>
                                <td>
                                    <c:out value="${detalleNotificacionDTO.idNotificacion}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.oficinaVirtual.notificaciones.detalle.tipoNotificacion"/>:</td>
                                <td>
                                    <c:out value="${detalleNotificacionDTO.descTipoNotificacion}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.oficinaVirtual.notificaciones.detalle.fromNotificacion"/>:</td>
                                <td>
                                    <c:out value="${detalleNotificacionDTO.fromRfcNotificacion}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.oficinaVirtual.notificaciones.detalle.tituloNotificacion"/>:</td>
                                <td>
                                    <c:out value="${detalleNotificacionDTO.tituloNotificacion}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.oficinaVirtual.notificaciones.detalle.adjuntoNotificacion"/>:</td>
                                <td>
                                    <c:choose>
                                        <c:when test="${detalleNotificacionDTO.adjuntoNotificacion ne '-'}">
                                            <a href='downloadFile.do?uuid=<c:out value="${detalleNotificacionDTO.adjuntoNotificacion}"/>' class='requestlink' title='Descargar archivo adjunto'>
                                                <img width='20' align='middle' src='<spring:theme code="pdf-download.jpg"/>'/>
                                            </a>
                                        </c:when>
                                        <c:otherwise>
                                            <c:out value="${detalleNotificacionDTO.adjuntoNotificacion}"/>
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.oficinaVirtual.notificaciones.detalle.fechaNotificacion"/>:</td>
                                <td>
                                    <c:out value="${detalleNotificacionDTO.fecModifico}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.oficinaVirtual.notificaciones.detalle.estatusNotificacion"/>:</td>
                                <td>
                                    <c:out value="${detalleNotificacionDTO.descSituacionNotificacion}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td colspan="2"> &nbsp; </td>
                            </tr>
                            <tr align="left">
                                <td colspan="2">
                                    <c:out value="${detalleNotificacionDTO.msgNotificacion}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td colspan="2"> &nbsp; </td>
                            </tr>
                            <tr align="center">
                                <td colspan="2">
                                    <table width="100%" border="0" align="center">
                                        <tr>
                                            <td align="center">
                                                <fsn:submit value="submit.back" 
                                                            action="notificacion/${detalleNotificacionDTO.urlRegresar}.do"
                                                            progressBar="true"/>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
</html:form>