<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="consultaMovtosPersonalDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1 align="left"><spring:message code="sireh.label.plaza.gestion.consultaMovtosPersonal.titulo"></spring:message></h1>
    
    <table width="85%">
         <tr> 
            <td align="left" colspan="2"><h3><spring:message code="sireh.label.plaza.gestion.consultaMovtosPersonal.tituloFiltros"></spring:message></h3></td>
         </tr>
         <tr>
            <td align="right"><spring:message code="sireh.label.plaza.gestion.consultaMovtosPersonal.idPlazaf"></spring:message></td>
            <td align="left" ><fsn:input path="idPlazaf" maxlength="6" size="20"/></td>
            <td align="right"><spring:message code="sireh.label.plaza.gestion.consultaMovtosPersonal.rfcf"></spring:message></td>
            <td align="left" ><fsn:input path="rfcf"/></td>
     </table>
   
    <table width="100%">
        <tr>
            <td align="right">
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="plazaGestion/${consultaMovtosPersonalDTO.urlOrigen}"/>
            </td>
            <td align="left">
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="plazaGestion/${consultaMovtosPersonalDTO.urlOrigen}"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${consultaMovtosPersonalDTO.muestraRegistros}">
            <div id="dataTable" style="width: 1025px; overflow: auto;">
                <fsn:filter property="C.ID_PLAZA" condition="=" path="idPlazaf"/>
                <fsn:filter property="C.MEP_RFC" condition="contains" path="rfcf"/>
                
                <fsn:pagedList beanName="${consultaMovtosPersonalDTO.beanName}" 
                               baseUrl="${consultaMovtosPersonalDTO.urlOrigen}" 
                               checkbox="true" 
                               appendFilters="false">
                    <div id="displayTagDiv">
                        <display:table name="${consultaMovtosPersonalDTO.beanName}" 
                                       class="displaytag" 
                                       pagesize="20" 
                                       decorator="checkboxTableDecorator" 
                                       export="true" 
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list">
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.movPersonal" 
                                            maxLength="35" 
                                            property="movPersonal" 
                                            sortable="true"/>             
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.idPlaza" 
                                            property="idPlaza" 
                                            sortable="true"/>             
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepRfc" 
                                            property="mepRfc" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.nombreEmp" 
                                            maxLength="30" 
                                            property="nombreEmp" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.idUnidadNom" 
                                            property="idUnidadNom" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.idPuestoNom" 
                                            property="idPuestoNom" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.idZonaEcoNom" 
                                            property="idZonaEcoNom" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.nombramiento" 
                                            property="nombramiento" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepIniCont" 
                                            property="mepIniCont" 
                                            format="{0,date,dd-MM-yyyy}" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepFinCont" 
                                            property="mepFinCont" 
                                            format="{0,date,dd-MM-yyyy}" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepImporteHonorario" 
                                            property="mepImporteHonorario" 
                                            format="{0,number,#,###.##}" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepQnaCaptura" 
                                            property="mepQnaCaptura" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepObserva" 
                                            maxLength="10" 
                                            property="mepObserva" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepObservaInternas" 
                                            maxLength="10" 
                                            property="mepObservaInternas" 
                                            sortable="true"/>
                                            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepQnaCancela" 
                                            property="mepQnaCancela" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepUsrCancela" 
                                            property="mepUsrCancela" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaMovtosPersonal.mepFechaCancela" 
                                            property="mepFechaCancela" 
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
    </script>
</html:form>