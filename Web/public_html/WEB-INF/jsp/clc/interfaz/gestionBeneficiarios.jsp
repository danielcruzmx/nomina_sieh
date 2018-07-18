<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form  modelAttribute="gestionBeneficiariosDTO">

    <h1><spring:message code="sireh.label.nomina.movimiento.gestionbenef.path.header"></spring:message></h1>
    <p>&nbsp;</p>
    
    <%-- Grid --%> 
    <fsn:pagedList beanName="listaBeneficiariosSICOP" 
                   baseUrl="gestionBeneficiarios" 
                   appendFilters="false">
        <div id="dataTable" style="width: 1025px; overflow: auto;">
            <display:table name="listaBeneficiariosSICOP" 
                           class="displaytag" 
                           pagesize="10" 
                           export="true"
                           id="row" 
                           requestURI="${requestURI}" 
                           sort="list">          
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.llave"
                            sortable="true"> <a href="detalleBeneficiario.do?bsCtaBancaria=<c:out value='${row.bsCtaBancaria}'/>&bsLeyenda=<c:out value='${row.bsLeyenda}'/>&bsTipoPago=<c:out value='${row.bsTipoPago}'/>&idBeneSicop=<c:out value='${row.idBeneSicop}'/>"> <c:out value="${row.idBeneSicop}"/></a>
            </display:column>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.bsCtaBancaria"
                            property="bsCtaBancaria" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.descrip"
                            property="descrip" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.moneda"
                            property="moneda" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.bsTipoPago"
                            property="bsTipoPago" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.bsLeyenda"
                            property="bsLeyenda" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.ref1"
                            property="ref1" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.ref2"
                            property="ref2" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.tiponom"
                            property="tiponom" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.rfc"
                            property="rfc" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.origen"
                            property="origen" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.eroga"
                            property="eroga" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.opera"
                            property="opera" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.usuario"
                            property="usuario" 
                            sortable="true"/>
            <display:column titleKey="sireh.label.nomina.movimiento.gestionbenef.fechamod"
                            property="fechamod" 
                            sortable="true"/>
                <display:setProperty name="paging.banner.placement" value="bottom"/>
                <display:setProperty name="export.pdf" value="true"/>
                <display:setProperty name="export.excel" value="true"/>
                <display:setProperty name="basic.msg.empty_list">
                    <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                </display:setProperty>
            </display:table>
        </div>
    </fsn:pagedList>
    
</html:form>
