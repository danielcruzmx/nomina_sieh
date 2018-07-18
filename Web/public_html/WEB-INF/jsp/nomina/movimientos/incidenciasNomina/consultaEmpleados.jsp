<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="consultaEmpleadoDTO">
    <h1><spring:message code="tdEmpleadoDTO.consultaEmpleado.title"></spring:message></h1>
    <p>&nbsp;</p>
    <table width="80%">
        <tr align="left">
            <td><spring:message code="tdEmpleadoDTO.consultarRfc.rfcUnico"></spring:message></td>
            <td><fsn:input path="rfcEmpleado" uppercase="true"/></td>
            <td><spring:message code="tdEmpleadoDTO.consultarRfc.nombreEmpleado"></spring:message></td>
            <td><fsn:input path="nombreEmpleado" uppercase="true"/></td>
            <td><spring:message code="tdEmpleadoDTO.consultarRfc.primerApellido"></spring:message></td>
            <td><fsn:input path="primerApellido" uppercase="true"/></td>
            <td><spring:message code="tdEmpleadoDTO.consultarRfc.segundoApellido"></spring:message></td>
            <td><fsn:input path="segundoApellido" uppercase="true"/></td>
        </tr>
    </table>
    <table width="100%">
        <tr align="right">
            <td><fsn:submit value="submit.search" action="${consultaEmpleadoDTO.urlController}/${consultaEmpleadoDTO.urlOrigen}"/></td>
        </tr>
    </table>
    
    <fsn:filter property="rfcEmpleado" condition="contains" path="rfcEmpleado" />
    <fsn:filter property="e.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
    <fsn:filter property="e.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
    <fsn:filter property="e.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
    
    <fsn:pagedList beanName="Empleados" baseUrl="${consultaEmpleadoDTO.urlOrigen}" maxRows="200">
        <display:table name="Empleados" class="displaytag" pagesize="10" export="true" id="row" requestURI="${requestURI}" sort="list">
            <display:column titleKey="tdEmpleadoDTO.consultarRfc.rfcUnico" property="rfcEmpleado" href="${consultaEmpleadoDTO.urlDestino}.do" paramId="rfcEmpleado" sortable="true"/>
            <c:if test="${consultaEmpleadoDTO.urlOrigen == 'consultarCurp'}">
                <display:column titleKey="tdEmpleadoDTO.consultarRfc.curpEmpleado" property="curpEmpleado" sortable="true"/>
            </c:if>
            <display:column titleKey="tdEmpleadoDTO.consultarRfc.nombreEmpleado" property="nombreEmpleado" sortable="true"/>
            <display:column titleKey="tdEmpleadoDTO.consultarRfc.primerApellido" property="primerApellido" sortable="true"/>
            <display:column titleKey="tdEmpleadoDTO.consultarRfc.segundoApellido" property="segundoApellido" sortable="true"/>
            <display:setProperty name="paging.banner.placement" value="bottom"/>
                <display:setProperty name="export.pdf" value="true"/>
                <display:setProperty name="basic.msg.empty_list">
                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                </display:setProperty>
         </display:table>
    </fsn:pagedList>
</html:form>