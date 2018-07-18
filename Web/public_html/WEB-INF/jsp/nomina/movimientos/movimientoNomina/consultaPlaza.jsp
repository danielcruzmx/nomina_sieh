<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>

<html:form modelAttribute="consultaPlazaDTO">
    <h1><c:out value="${consultaPlazaDTO.header}" /></h1>
    <p>&nbsp;</p>
    <table width="80%">
        <tr align="left">
            <td><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idMovsPersonal"></spring:message></td>
            <td>
                <fsn:filter property="mp.mp_tipo_mov_menu" condition="=" path="mpTipoMovMenu"/>
                <fsn:option key="0" value="selectList.nonValue" />
                <fsn:selectList beanName="tcMovsPersonalMp" path="idMovsPersonal" style="width:400px;"/>
            </td>
            <td><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idPlaza"></spring:message></td>
            <td><fsn:input path="idPlaza" uppercase="true" maxlength="6" size="20"/></td>
            <td><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.idPuestoNom"></spring:message></td>
            <td><fsn:input path="idPuestoNom" uppercase="true"/></td>
            <td><spring:message code="sireh.label.nomina.movimiento.movimientosPersonal.rfcEmpleado"></spring:message></td>
            <td><fsn:input path="rfcEmpleado" uppercase="true"/></td>
        </tr>
    </table>   

    <table width="100%">
        <tr align="right">
            <td><fsn:submit value="submit.search" action="movimientoNomina/consultarPlazas.do"/></td>
        </tr>
    </table>

    <fsn:filter property="td_plaza.id_plaza" condition="=" path="idPlaza"/>
    <fsn:filter property="td_plaza.id_puesto_nom" condition="contains" path="idPuestoNom" />
    <fsn:filter property="td_empleado.rfc_empleado" condition="contains" path="rfcEmpleado" />
    <fsn:filter property="td_plaza.id_sit_plaza" condition="in" path="idSitPlaza"/>
    <fsn:filter property="td_plaza.id_grupo_pago" condition="in" path="idGrupoPago"/>
    <fsn:filter property="tc_atributo_puesto.id_jerarquia" condition="in" path="idJerarquia"/>
    <fsn:filter property="tc_atributo_puesto.id_nombramiento" condition="in" path="idNombramiento"/>

    <c:if test="${consultaPlazaDTO.idMovsPersonal ne 0}">
        <c:set var="paramsDetalle" value="idMovsPersonal=${consultaPlazaDTO.idMovsPersonal}&idPlaza"/>
        <fsn:pagedList beanName="plazaMovtosPersonal" baseUrl="consultarPlazas" maxRows="200">
            <display:table name="plazaMovtosPersonal" class="displaytag" pagesize="10" export="true" id="row" requestURI="${requestURI}" sort="list">
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.descSitPlaza" property="descSitPlaza" sortable="true"/>
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.idPlaza" href="getPlazaEmpleado.do" paramId="${paramsDetalle}" paramProperty="idPlaza" property="idPlaza" sortable="true"/>
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.idPuestoNom" property="idPuestoNom" sortable="true"/>
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.idNivelPto" property="idNivelPto" sortable="true"/>
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.descGrupoPago" property="descGrupoPago" sortable="true"/>
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.rfcEmpleado" property="rfcEmpleado" sortable="true"/>
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.nombreEmpleado" property="nombreEmpleado" sortable="true"/>
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.primerApellido" property="primerApellido" sortable="true"/>
                <display:column titleKey="sireh.label.nomina.movimiento.movimientosPersonal.segundoApellido" property="segundoApellido" sortable="true"/>
                <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="true"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                    </display:setProperty>
             </display:table>
        </fsn:pagedList>
     </c:if>

    <html:hidden path="mpTipoMovMenu" />
    <html:hidden path="idSitPlaNva" />
    <html:hidden path="idSitPlaAnt" />
    <html:hidden path="header" />
    <c:forEach items="${consultaPlazaDTO.idSitPlaza}" var="listaIdSitPlaza" varStatus="status">
        <input type="hidden" name="listaIdSitPlaza[<c:out value='${status.index}'/>].idSitPlaza" value="<c:out value='${consultaPlazaDTO.idSitPlaza}'/>" />
    </c:forEach>
    <c:forEach items="${consultaPlazaDTO.idGrupoPago}" var="listaIdGrupoPago" varStatus="status">
        <input type="hidden" name="listaIdGrupoPago[<c:out value='${status.index}'/>].idGrupoPago" value="<c:out value='${consultaPlazaDTO.idGrupoPago}'/>" />
    </c:forEach>
    <c:forEach items="${consultaPlazaDTO.idJerarquia}" var="listaIdJerarquia" varStatus="status">
        <input type="hidden" name="listaIdJerarquia[<c:out value='${status.index}'/>].idJerarquia" value="<c:out value='${consultaPlazaDTO.idJerarquia}'/>" />
    </c:forEach>
    <c:forEach items="${consultaPlazaDTO.idNombramiento}" var="listaIdNombramiento" varStatus="status">
        <input type="hidden" name="listaIdNombramiento[<c:out value='${status.index}'/>].idNombramiento" value="<c:out value='${consultaPlazaDTO.idNombramiento}'/>" />
    </c:forEach>
</html:form>