<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html:form modelAttribute="consultaPlazaSpcDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="filter"/>
    
    <h1 align="left"><spring:message code="sireh.label.plaza.gestion.consultaPlazaSpc.titulo"></spring:message></h1>
    <table align="center" width="50%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em">
                        <strong><spring:message code="sireh.label.plaza.gestion.consultaPlazaSpc.titulo.busqueda"/></strong>
                    </legend>
                        <table align="center" width="100%">
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaPlazaSpc.plazaRfc"></spring:message></td>
                                <td align="left" ><fsn:input path="plazaRfc" maxlength="13" size="20"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaPlazaSpc.nombreEmpleado"></spring:message></td>
                                <td align="left" ><fsn:input path="nombreEmpleado" size="80"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaPlazaSpc.primerApellido"></spring:message></td>
                                <td align="left" ><fsn:input path="primerApellido" size="80"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaPlazaSpc.segundoApellido"></spring:message></td>
                                <td align="left" ><fsn:input path="segundoApellido" size="80"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaPlazaSpc.idPlaza"></spring:message></td>
                                <td align="left" ><fsn:input path="idPlaza" size="10"/></td>
                            </tr>
                            <tr>
                                <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaPlazaSpc.nombrePuesto"></spring:message></td>
                                <td align="left" ><fsn:input path="nombrePuesto" size="60"/></td>
                            </tr>
                         </table>
                    </legend>
                </fieldset>
            </td>
        </tr>
    </table>
   
    <table width="100%">
        <tr>
            <td align="right">
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="plazaGestion/${consultaPlazaSpcDTO.urlOrigen}"/>
            </td>
            <td align="left">
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="plazaGestion/${consultaPlazaSpcDTO.urlOrigen}"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${consultaPlazaSpcDTO.muestraRegistros}">
            <div id="dataTable" style="width: 1025px; overflow: auto;">
                
                <fsn:filter property="p.plaza_rfc" condition="contains" path="plazaRfc"/>
                <fsn:filter property="e.nombre_empleado" condition="contains" path="nombreEmpleado"/>
                <fsn:filter property="e.primer_apellido" condition="contains" path="primerApellido"/>
                <fsn:filter property="e.segundo_apellido" condition="contains" path="segundoApellido"/>
                <fsn:filter property="p.id_plaza" condition="=" path="idPlaza"/>
                <fsn:filter property="${consultaPlazaSpcDTO.filter}" condition="contains" path="nombrePuesto"/>
                <fsn:pagedList beanName="${consultaPlazaSpcDTO.beanName}" 
                               baseUrl="${consultaPlazaSpcDTO.urlOrigen}" 
                               checkbox="true" 
                               appendFilters="true">
                    <div id="displayTagDiv">
                        <display:table name="${consultaPlazaSpcDTO.beanName}" 
                                       class="displaytag" 
                                       pagesize="20" 
                                       decorator="checkboxTableDecorator" 
                                       export="true" 
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list">
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSpc.plazaRfc" 
                                            sortable="true">
                                <a href="consultaPlazaSpcByRfcPlaza.do?rfcEmpleado=<c:out value='${row.plazaRfc}'/>&idPlaza=">
                                    <c:out value='${row.plazaRfc}'/>
                                </a>
                            </display:column>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSpc.nombreEmpleado" 
                                            property="nombreEmpleado" 
                                            sortable="true"/>                                                                      
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSpc.primerApellido" 
                                            property="primerApellido" 
                                            sortable="true"/>             
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSpc.segundoApellido" 
                                            property="segundoApellido" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSpc.idPlaza" 
                                            sortable="true">
                                <a href="consultaPlazaSpcByRfcPlaza.do?rfcEmpleado=&idPlaza=<c:out value='${row.idPlaza}'/>">
                                    <c:out value='${row.idPlaza}'/>
                                </a>
                            </display:column>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaSpc.nombrePuesto" 
                                            property="nombrePuesto" 
                                            sortable="true"/>
                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                            <display:setProperty name="export.pdf" value="true"/>
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
    <c:if test="${consultaPlazaSpcDTO.muestraReporte}">
        <table>
                <tr>
                    <th align="left"></th>
                </tr>
                <tr>
                    <td align="left">
                        <fsn:reportParam name="P_RFC" value="${consultaPlazaSpcDTO.parPlazaRfc}"/>
                        <fsn:reportParam name="P_PLAZA" value="${consultaPlazaSpcDTO.parIdPlaza}"/>
                        <fsn:report provider="jasper" 
                                    viewUri="/plaza/consultaPlaza" 
                                    imagesUri="/images/reports" 
                                    format="pdf" 
                                    fileName="consultaPlaza" 
                                    export="pdf" 
                                    width="1060" 
                                    height="350"/>
                    </td>
                </tr>
            </table>
        </c:if>
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>