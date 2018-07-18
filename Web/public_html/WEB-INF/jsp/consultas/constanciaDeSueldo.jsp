<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%-- Inicializar la forma --%> 
<html:form modelAttribute="reportesConstanciasDTO">
    
    <h1>
        <strong>
            <spring:message code="sireh.label.servicio"/> &#45;&nbsp;
            <spring:message code="sireh.label.constanciaSueldo"/>:&nbsp;&nbsp;&nbsp;
            <fsn:label path="nombreEmpleado"/>
        </strong>
    </h1>
    
    
        
    <fsn:filter property="RC_RFC" condition="=" path="rfcEmpleado" />
    
    <fsn:pagedList beanName="listadoConstanciaDeSueldo" 
                           baseUrl="constanciaSueldos" 
                           appendFilters="false">
                <div id="displayTagDiv">
                    <display:table name="listadoConstanciaDeSueldo"
                                   class="displaytag"
                                   pagesize="10" 
                                   export="true" 
                                   id="row"
                                   requestURI="${requestURI}"
                                   sort="list">
                                   
                        <%-- Columnas --%>
                        <display:column style="text-align: center;"
                                            titleKey="sireh.label.servicios.ciclo"
                                            sortable="true">
                                <a href="constanciaSueldosReporte.do?ciclo=<c:out value='${row.ciclo}'/>&rfcEmpleado=<c:out value='${reportesConstanciasDTO.rfcEmpleado}'/>&nombreEmpleado=<c:out value='${reportesConstanciasDTO.nombreEmpleado}'/>">
                                    <c:out value='${row.ciclo}'/>
                                </a>
                            </display:column>
                        
                        <display:column titleKey="sireh.label.servicios.nivel" 
                                        property="nivel" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.servicios.unidad" 
                                        property="unidad" 
                                        sortable="true"/> 
                        <display:column titleKey="sireh.label.servicios.rfc" 
                                        property="rfcEmpleado" 
                                        sortable="true"/>
                        <display:column titleKey="sireh.label.servicios.nombre" 
                                        property="nombreEmpleado" 
                                        sortable="true"/>
                        <%-- Paginador --%> 
                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                        <display:setProperty name="export.pdf" value="true"/>
                        <display:setProperty name="basic.msg.empty_list">
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </display:setProperty>
                    </display:table>
                </div>
            </fsn:pagedList>
            
            <c:if test="${reportesConstanciasDTO.muestraReporte}">
                        
                        <fsn:reportParam name="P_CICLO" value="${reportesConstanciasDTO.ciclo}"/>
                        <fsn:reportParam name="P_RFC" value="${reportesConstanciasDTO.rfcEmpleado}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/constanciaSueldos/constanciaSueldoCFirmaCicloRFC" 
                                    imagesUri="/images/reports"
                                    format="pdf" 
                                    fileName="constanciaSueldoCFirmaCicloRFC" 
                                    export="pdf"
                                    width="1060" 
                                    height="350"/>
            </c:if>                    
                                            
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>
