<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="consultaPlazaSoporteDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1 align="left">
        <spring:message code="sireh.label.plaza.gestion.consultaPlazaSoporte.titulo"></spring:message>
    </h1>
    <table width="100%">
        <tr>
            <td align="left" colspan="3">
                <h2><spring:message code="sireh.label.plaza.gestion.consultaPlazaSoporte.tituloFiltros"></spring:message></h2>
            </td>
        </tr>
        <tr>
            <td align="right">
                <spring:message code="sireh.label.plaza.gestion.consultaPlazaSoporte.idPlazaf"></spring:message>
            </td>
            <td align="left">
                <fsn:input path="idPlazaf" maxlength="6" size="20"/>
            </td>
            <td align="right">
                <spring:message code="sireh.label.plaza.gestion.consultaPlazaSoporte.tipo"></spring:message>
            </td>
            <td align="left">
                <html:select path="tipof">
                    <option value="consultaECS" <c:out value="${consultaPlazaSoporteDTO.tipof == 'consultaECS'? 'selected': ''}"/>>Eventuales con soporte</option>
                    <option value="consultaESS" <c:out value="${consultaPlazaSoporteDTO.tipof == 'consultaESS'? 'selected': ''}"/>>Eventuales sin soporte</option>
                    <option value="consultaEST" <c:out value="${consultaPlazaSoporteDTO.tipof == 'consultaEST'? 'selected': ''}"/>>Estructura con soporte</option>
                </html:select>
            </td>
            <td align="right">
                <spring:message code="sireh.label.plaza.gestion.consultaPlazaSoporte.idUnidadf" ></spring:message>
            </td>
            <td align="left">
                <fsn:option key="" value="selectList.nonValue"/>
                <fsn:selectList beanName="tcUnidadTruncaPre" 
                                path="idUnidadf" 
                                style="width: 491px;"/>
            </td>
        </tr>
    </table>
    <table width="100%">
        <tr>
            <td align="right">
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="plazaGestion/${consultaPlazaSoporteDTO.urlOrigen}"/>
            </td>
            <td align="left">
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="plazaGestion/${consultaPlazaSoporteDTO.urlOrigen}"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${consultaPlazaSoporteDTO.muestraRegistros}">
            <div id="dataTable" style="width: 1025px; overflow: auto;">
            
                <fsn:filter property="pe.ID_PLAZA" condition="=" path="idPlazaf"/>
                <fsn:filter property="pe.ID_UNIDAD_NOM" condition="=" path="idUnidadf"/>          
                
                <fsn:pagedList beanName="${consultaPlazaSoporteDTO.tipof}" 
                               baseUrl="${consultaPlazaSoporteDTO.urlOrigen}" 
                               checkbox="true" 
                               appendFilters="false">
                    <div id="displayTagDiv">
                        <display:table name="${consultaPlazaSoporteDTO.tipof}" 
                                       class="displaytag" 
                                       pagesize="10" 
                                       decorator="checkboxTableDecorator" 
                                       export="true" 
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list">
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.tipo" 
                                            property="tipo" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.idPlazaEve" 
                                            property="idPlazaEve" 
                                            href="${consultaPlazaSoporteDTO.urlDestino}.do" 
                                            paramId="idPlaza" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.plazaRfcEve" 
                                            property="plazaRfcEve" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.nombreEmpEve" 
                                            property="nombreEmpEve" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.uniDescEve" 
                                            property="uniDescEve" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.descPuestoEve" 
                                            property="descPuestoEve" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.idNivelPtoEve" 
                                            property="idNivelPtoEve" 
                                            sortable="true"/>    
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.idPlazaEst" 
                                            property="idPlazaEst" 
                                            href="${consultaPlazaSoporteDTO.urlDestino}.do" 
                                            paramId="idPlaza" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.descSitPlazaEst" 
                                            property="descSitPlazaEst" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.grupoPagoEst" 
                                            property="grupoPagoEst" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.uniDescEst" 
                                            property="uniDescEst" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.descPuestoEst" 
                                            property="descPuestoEst" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSoporte.idNivelPtoEst" 
                                            property="idNivelPtoEst" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.usuario" 
                                            property="usuario" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.fecModifico" 
                                            property="fecModifico" 
                                            sortable="true"/>
                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                            <display:setProperty name="export.excel" value="true"/>
                            <display:setProperty name="basic.msg.empty_list">
                                <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                            </display:setProperty>
                        </display:table>
                    </div>
                </fsn:pagedList>
            </div>
        </c:when>
        <c:otherwise>
            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
        </c:otherwise>
    </c:choose>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>