<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="consultaEmpleadoFonacDTO">
    <h1><spring:message code="consultaEmpleadoFonacDTO.consultaEmpleado.title"></spring:message></h1>
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
            <td><fsn:submit value="submit.search" action="${consultaEmpleadoFonacDTO.urlController}/${consultaEmpleadoFonacDTO.urlOrigen}"/></td>
        </tr>
    </table>
    
    <fsn:filter property="rfcEmpleado" condition="contains" path="rfcEmpleado" />
    <fsn:filter property="e.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
    <fsn:filter property="e.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
    <fsn:filter property="e.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
    <fsn:filter property="p.ID_SIT_PLAZA" condition="starts" path="idSitPlazaFilter" />
    <fsn:filter property="ap.ID_JERARQUIA" condition="in" path="listaIdJerarquiasFilter" />
    
    <fsn:pagedList beanName="empleadoPlazaEmpleadoAtributoPuesto" baseUrl="${consultaEmpleadoFonacDTO.urlOrigen}" maxRows="200">
        <display:table name="empleadoPlazaEmpleadoAtributoPuesto" class="displaytag" pagesize="10" export="true" id="row" requestURI="${requestURI}" sort="list">
            <display:column titleKey="tdEmpleadoDTO.consultarRfc.rfcUnico" property="rfcEmpleado" href="${consultaEmpleadoFonacDTO.urlDestino}.do" paramId="rfcEmpleado" sortable="true"/>
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