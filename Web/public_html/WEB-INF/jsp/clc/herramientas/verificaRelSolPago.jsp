<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="registraSolicitudPagoDTO">

    <html:hidden path="cxlcCiclo"/>
    
    <h1><spring:message code="sireh.label.clc.titulo.link"/> - 
    <spring:message code="sireh.label.clc.herramientas.titulo.link"/> - 
    <spring:message code="sireh.label.clc.herramientas.solicitudPago.titulo"/> - 
    <spring:message code="sireh.label.clc.herramientas.solicitudPago.verifica.titulo"/></h1>
    <p>&nbsp;</p>
    
    <h1>CLC Seleccionadas</h1>
    <table width="100%">
        <tr>
            <td align="center">
                <display:table name="registraSolicitudPagoDTO.cxlcSeleccionadas"
                               class="displaytag"
                               pagesize="10"
                               export="false" 
                               id="row"
                               requestURI="${requestURI}"
                               sort="list">
                               
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlc" 
                                    property="cxlc" 
                                    sortable="true"/>     
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlcCiclo" 
                                    property="cxlcCiclo" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlcQnaPago" 
                                    property="cxlcQnaPago" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.idTipoNomina" 
                                    property="idTipoNomina" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlcComplemento" 
                                    property="cxlcComplemento" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlcCompromiso" 
                                    property="cxlcCompromiso" 
                                    sortable="true"/>
                                    
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="true"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                    </display:setProperty>
                </display:table>
            </td>
        </tr>
    </table>
    
    <p>&nbsp;</p>
    <h1>CLC Involucradas</h1>
    <table width="100%">
        <tr>
            <td align="center">
                <display:table name="registraSolicitudPagoDTO.cxlcInvolucradas"
                               class="displaytag"
                               pagesize="10"
                               export="false" 
                               id="row_2"
                               requestURI="${requestURI}"
                               sort="list">
                    
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlc" 
                                    property="cxlc" 
                                    sortable="true"/>     
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlcCiclo" 
                                    property="cxlcCiclo" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlcQnaPago" 
                                    property="cxlcQnaPago" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.idTipoNomina" 
                                    property="idTipoNomina" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlcComplemento" 
                                    property="cxlcComplemento" 
                                    sortable="true"/>
                    <display:column titleKey="sireh.label.clc.herramientas.solicitudPago.consulta.cxlcCompromiso" 
                                    property="cxlcCompromiso" 
                                    sortable="true"/>
                    
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="true"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                    </display:setProperty>
                </display:table>
            </td>
        </tr>
    </table>
    
    <h1>Ingrese Compromiso</h1>
    <table align="center" width="40%">
        <tr>
            <td align="right" class="label">* <spring:message code="sireh.label.clc.herramientas.solicitudPago.cxlcDevengado"></spring:message></td>
            <td align="left">
                <fsn:input path="solicitudPago" size="14" maxlength="10"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="left" height="20px" valign="middle">
                <strong>
                    <spring:message code="sireh.form.required.fields"/>
                <strong>
            </td>
        </tr>
        <tr align="center">
            <td align="right">
                <c:choose>
                    <c:when test="${registraSolicitudPagoDTO.sobrescribir}">
                        <fsn:submit value="submit.marcar" 
                                    action="clcHerramientas/registraSolicitudPago.do"
                                    alertCode="confirm.clc.herramientas.sobrescribir"
                                    progressBar="true"/>
                    </c:when>
                    <c:otherwise>
                        <fsn:submit value="submit.marcar" 
                                    action="clcHerramientas/registraSolicitudPago.do"
                                    alertCode="confirm.clc.herramientas.marca"
                                    progressBar="true"/>
                    </c:otherwise>
                </c:choose>
            </td>
            <td align="left">
                <fsn:submit value="submit.cancel" 
                            path="cancel"
                            action="clcHerramientas/consultaClcRegSolPago.do"
                            progressBar="true"/>
            </td>
        </tr>
    </table>
    
    <c:forEach items="${registraSolicitudPagoDTO.cxlcSeleccionadas}" var="cxlcSeleccionadas" varStatus="status">
        <input type="hidden" name="cxlcSeleccionadas[<c:out value='${status.index}'/>].cxlc" value="<c:out value='${cxlcSeleccionadas.cxlc}'/>" />
        <input type="hidden" name="cxlcSeleccionadas[<c:out value='${status.index}'/>].cxlcCiclo" value="<c:out value='${cxlcSeleccionadas.cxlcCiclo}'/>"/>
        <input type="hidden" name="cxlcSeleccionadas[<c:out value='${status.index}'/>].cxlcQnaPago" value="<c:out value='${cxlcSeleccionadas.cxlcQnaPago}'/>"/>
        <input type="hidden" name="cxlcSeleccionadas[<c:out value='${status.index}'/>].idTipoNomina" value="<c:out value='${cxlcSeleccionadas.idTipoNomina}'/>"/>
        <input type="hidden" name="cxlcSeleccionadas[<c:out value='${status.index}'/>].cxlcComplemento" value="<c:out value='${cxlcSeleccionadas.cxlcComplemento}'/>"/>
        <input type="hidden" name="cxlcSeleccionadas[<c:out value='${status.index}'/>].cxlcDevengado" value="<c:out value='${cxlcSeleccionadas.cxlcDevengado}'/>"/>
    </c:forEach>
    <c:forEach items="${registraSolicitudPagoDTO.cxlcInvolucradas}" var="cxlcInvolucradas" varStatus="status">
        <input type="hidden" name="cxlcInvolucradas[<c:out value='${status.index}'/>].cxlc" value="<c:out value='${cxlcInvolucradas.cxlc}'/>" />
        <input type="hidden" name="cxlcInvolucradas[<c:out value='${status.index}'/>].cxlcCiclo" value="<c:out value='${cxlcInvolucradas.cxlcCiclo}'/>"/>
        <input type="hidden" name="cxlcInvolucradas[<c:out value='${status.index}'/>].cxlcQnaPago" value="<c:out value='${cxlcInvolucradas.cxlcQnaPago}'/>"/>
        <input type="hidden" name="cxlcInvolucradas[<c:out value='${status.index}'/>].idTipoNomina" value="<c:out value='${cxlcInvolucradas.idTipoNomina}'/>"/>
        <input type="hidden" name="cxlcInvolucradas[<c:out value='${status.index}'/>].cxlcComplemento" value="<c:out value='${cxlcInvolucradas.cxlcComplemento}'/>"/>
        <input type="hidden" name="cxlcInvolucradas[<c:out value='${status.index}'/>].cxlcDevengado" value="<c:out value='${cxlcInvolucradas.cxlcDevengado}'/>"/>
    </c:forEach>
    
    <script type="text/javascript">
        $j(document).ready(function(){
            $j('#solicitudPago').mask('9999999999');
        });
    </script>
</html:form>