<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="consultaPlazaAdecuacionDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1 align="left"><spring:message code="sireh.label.plaza.gestion.consultaPlazaAdecuacion.titulo"></spring:message></h1>
    
    <table width="85%">
         <tr> 
            <td align="left" colspan="2"><h3><spring:message code="sireh.label.plaza.gestion.consultaPlazaAdecuacion.tituloFiltros"></spring:message></h3></td>
         </tr>
         <tr>
            <td align="right"><spring:message code="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idPlazaf"></spring:message></td>
            <td align="left"><fsn:input path="idPlazaf" maxlength="6" size="20"/></td>
            <td align="right"><spring:message code="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idOficioAfectaf"></spring:message></td>
            <td align="left"><fsn:input path="idOficioAfectaf"/></td>
     </table>
   
    <table width="100%">
        <tr>
            <td align="right">
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="plazaGestion/${consultaPlazaAdecuacionDTO.urlOrigen}"/>
            </td>
            <td align="left">
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="plazaGestion/${consultaPlazaAdecuacionDTO.urlOrigen}"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${consultaPlazaAdecuacionDTO.muestraRegistros}">
            <div id="dataTable" style="width: 1025px; overflow: auto;">
                <fsn:filter property="p.id_plaza" condition="=" path="idPlazaf"/>
                <fsn:filter property="p.id_oficio_afecta" condition="=" path="idOficioAfectaf"/>
                
                <fsn:pagedList beanName="${consultaPlazaAdecuacionDTO.beanName}" 
                               baseUrl="${consultaPlazaAdecuacionDTO.urlOrigen}" 
                               checkbox="true" 
                               appendFilters="false">
                    <div id="displayTagDiv">
                        <display:table name="${consultaPlazaAdecuacionDTO.beanName}" 
                                       class="displaytag" 
                                       pagesize="10" 
                                       decorator="checkboxTableDecorator" 
                                       export="true" 
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list">
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idOficioAfecta" 
                                            property="idOficioAfecta" 
                                            sortable="true"/>             
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idPlaza" 
                                            property="idPlaza" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.operacion" 
                                            property="operacion" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idUnidad" 
                                            property="idUnidad" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idPuesto" 
                                            property="idPuesto" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idNivelPto" 
                                            property="idNivelPto" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idEdo" 
                                            property="idEdo" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idGrupoPago" 
                                            property="idGrupoPago" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.proyAmplia" 
                                            maxWords="2" 
                                            property="proyAmplia" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.proyReduce" 
                                            maxWords="2" 
                                            property="proyReduce" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.plafInicio" 
                                            property="plafInicio" 
                                            format="{0,date,dd-MM-yyyy}" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.plafFinal" 
                                            property="plafFinal" 
                                            format="{0,date,dd-MM-yyyy}" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.idSitAfectaci" 
                                            property="idSitAfectaci" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaPlazaAdecuacion.leyendaJustificac" 
                                            maxWords="2" 
                                            property="leyendaJustificac" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.usuario" 
                                            property="usuario" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.fecModifico" 
                                            property="fecModifico" 
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
    
    <script type="text/javascript">
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        $j(document).ready(function() {
            $j("#idPlazaf").keypress(function(event) { 
                return isNumber(event); 
            });
            $j("#idOficioAfectaf").keypress(function(event) { 
                return isNumber(event); 
            });
        });
        
        // THE SCRIPT THAT CHECKS IF THE KEY PRESSED IS A NUMERIC OR DECIMAL VALUE.
        function isNumber(evt) {
            var charCode = (evt.which) ? evt.which : event.keyCode
            if (charCode != 45 && (charCode != 46 || $(this).val().indexOf('.') != -1) && (charCode < 48 || charCode > 57)) {
                return false;
            }
            return true;
        }
    </script>
</html:form>