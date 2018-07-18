<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<spring:message code="selectList.nonValue" var="nonValue"/>
<html:form modelAttribute="movimientoPersonalDTO">
<h1><spring:message code="sireh.label.configuracion.movimientos.personal.titulo"/></h1>
    <p>&nbsp;</p>
 <table width="80%">
        <tr align="left">
            <td><spring:message code="sireh.label.configuracion.movimientos.consulta.parametros.id"></spring:message></td>
            <td><fsn:input path="idMovsPersonal"/></td>
            <td><spring:message code="sireh.label.configuracion.movimientos.consulta.parametros.desc"></spring:message></td>
            <td><fsn:input path="descMovsPersonal" uppercase="false"/></td>
            <td><spring:message code="sireh.label.configuracion.movimientos.consulta.parametros.constancia"></spring:message></td>
            <td><html:select path="constancia">
                    <html:option value="" label="${nonValue}"  />
                    <html:options items="${movimientoPersonalDTO.constanciaValores}" itemValue="clave" itemLabel="valor"/>
                </html:select>
            </td>
            <td><spring:message code="sireh.label.configuracion.movimientos.consulta.parametros.tipoMovimientoMenu"></spring:message></td>
            <td><html:select path="mpTipoMovMenu">
                    <html:option value="" label="${nonValue}"/>
                    <html:options items="${movimientoPersonalDTO.tipoMovimientoMenuValores}" itemValue="clave" itemLabel="valor"/>
                </html:select>
            </td>
        </tr>
    </table>
    
     <table width="100%">
        <tr align="right">
            <td><fsn:submit value="submit.search" action="movimientoPersonal/${movimientoPersonalDTO.urlOrigen}"/></td>
        </tr>
    </table>
    
  
    <fsn:filter property="MP.ID_MOVS_PERSONAL" condition="equal" path="idMovsPersonal" />
    <fsn:filter property="MP.DESC_MOVS_PERSONAL" condition="contains" path="descMovsPersonal" />
    <fsn:filter property="CONSTANCIA" condition="equal" path="constancia" />
    <fsn:filter property="MP.MP_TIPO_MOV_MENU" condition="equal" path="mpTipoMovMenu" />
    
     <table width="100%">
        <tr align="left">
            <td><fsn:submit value="submit.add" action="movimientoPersonal/${movimientoPersonalDTO.urlNuevo}"/></td>
        </tr>
    </table>
    
    <fsn:pagedList beanName="tcMovimientosPersonal" baseUrl="${movimientoPersonalDTO.urlOrigen}" maxRows="200">
        <display:table name="tcMovimientosPersonal" class="displaytag" pagesize="10" export="true" id="row" requestURI="${requestURI}" sort="list">
            <display:column titleKey="sireh.label.configuracion.movimientos.consulta.parametros.id" property="idMovsPersonal" href="${movimientoPersonalDTO.urlDestino}.do" paramId="idMovsPersonal" sortable="true"/>
            <display:column titleKey="sireh.label.configuracion.movimientos.consulta.parametros.desc" property="descMovsPersonal" sortable="true"/>
            <display:column titleKey="sireh.label.configuracion.movimientos.consulta.parametros.constancia" property="constancia" sortable="true"/>
            <display:column titleKey="sireh.label.configuracion.movimientos.consulta.parametros.tipoMovimientoMenu" property="mpTipoMovMenu" sortable="true"/>
            <display:setProperty name="paging.banner.placement" value="bottom"/>
                <display:setProperty name="export.pdf" value="true"/>
                <display:setProperty name="basic.msg.empty_list">
                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                </display:setProperty>
         </display:table>
    </fsn:pagedList>
</html:form>