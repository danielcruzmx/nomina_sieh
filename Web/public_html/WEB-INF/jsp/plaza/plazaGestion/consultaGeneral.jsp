<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="consultaGeneralDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1 align="left"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.titulo"></spring:message></h1>
    
    <table width="100%">
         <tr> 
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.gestion.consultaGeneral.tituloPlaza"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="left" border="0" width= "100%">
                        <tr>
                            <td align="right" width="150px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idPlaza"></spring:message></td>
                            <td align="left" ><fsn:input path="idPlaza" maxlength="6" size="20" /></td>           
                         </tr>
                         <tr>   
                            <td align="right" width="150px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idTipoPlaza"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcTipoPlaza" 
                                                path="idTipoPlaza" 
                                                style="width: 491px;"/>
                            </td>                                    
                        </tr>
                        <tr>
                            <td align="right" width="150px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idSitPlaza"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcSitPlaza" 
                                                path="idSitPlaza" 
                                                style="width: 256px;"/>
                            </td> 
                        </tr>                        
                        <tr>
                            <td align="right" width="150px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idVacancia"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcVacancia" 
                                                path="idVacancia" 
                                                style="width: 256px;"/>
                            </td> 
                        </tr>                        
                        <tr>
                            <td align="right" width="150px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idGrupoPago"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcGrupoPago" 
                                                path="idGrupoPago" 
                                                style="width: 256px;"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        
         <tr> 
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.gestion.consultaGeneral.tituloPresupuesto"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="left" border="0" width= "100%">
                        <tr>
                            <td align="right" width="120px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idUnidad"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadTruncaPre" 
                                                path="idUnidadPre" 
                                                style="width: 491px;"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idNivelPto"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcAtributoPuestoNivelPre" 
                                                path="idNivelPtoPreFil"/>
                            </td>
                         </tr>
                         <tr>
                            <td align="right" width="120px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idPuesto"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcPuestoPre" 
                                                path="idPuestoPre" 
                                                style="width: 491px;"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idNomb"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcNombramientoPre" 
                                                path="idNombPre"/>
                             </td>            
                         </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        
         <tr> 
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.gestion.consultaGeneral.tituloNomina"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="left" border="0" width= "100%">
                         <tr>
                            <td align="right" width="120px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idUnidad"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadTruncaNom" 
                                                path="idUnidadNom" 
                                                style="width: 491px;"/>
                            </td>
                            <td  align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idNivelPto"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcAtributoPuestoNivelNom" 
                                                path="idNivelPtoNomFil"/>
                            </td>            
                         </tr>
                         <tr>
                            <td align="right" width="120px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idPuesto"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcPuestoNom" 
                                                path="idPuestoNom" 
                                                style="width: 491px;"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idNomb"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcNombramientoNom" 
                                                path="idNombNom"/>
                            </td>            
                         </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        
         <tr> 
            <td>
                <fieldset>
                    <legend>
                        <strong>&nbsp;&nbsp;<spring:message code="sireh.label.plaza.gestion.consultaGeneral.tituloEmpleado"/>&nbsp;&nbsp;</strong>
                    </legend>
                    <table align="left" border="0" width= "100%">
                         <tr>
                            <td align="right" width="120px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.idMovtoPersona"/></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcMovsPersonal" 
                                                path="idMovtoPersona" 
                                                style="width: 491px;"/>
                            </td>                        
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.plazaRfc"/></td>
                            <td align="left"><fsn:input path="plazaRfc" uppercase="true"/></td>
                        </tr>
                        
                        <tr>
                            <td align="right" width="120px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.nombreEmpleado"/></td>
                            <td align="left"><fsn:input path="nombreEmpleado" uppercase="true"/></td>
                            <td align="right" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.primerApellido"/></td>
                            <td align="left"><fsn:input path="primerApellido" uppercase="true"/></td>
                        </tr>
                        <tr>
                            <td align="right" width="120px" class="label"><spring:message code="sireh.label.plaza.gestion.consultaGeneral.segundoApellido"/></td>
                            <td align="left"><fsn:input path="segundoApellido" uppercase="true"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
        
    <table width="100%">
        <tr>
            <td align="right">
                <fsn:submit value="submit.search" 
                            path="muestraRegistros" 
                            action="plazaGestion/${consultaGeneralDTO.urlOrigen}"/>
            </td>
            <td align="left">
                <fsn:submit value="submit.clean" 
                            path="cancel" 
                            action="plazaGestion/${consultaGeneralDTO.urlOrigen}"/>
            </td>
        </tr>
    </table>
    
    <c:choose>
        <c:when test="${consultaGeneralDTO.muestraRegistros}">
            <div id="dataTable" style="width: 1025px; overflow: auto;">
                <fsn:filter property="P.ID_PLAZA" condition="=" path="idPlaza"/>
                
                <fsn:filter property="P.PLAZA_RFC" condition="contains" path="plazaRfc"/>
                <fsn:filter property="E.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado"/>
                <fsn:filter property="E.PRIMER_APELLIDO" condition="contains" path="primerApellido"/>
                <fsn:filter property="E.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido"/>
                
                <fsn:filter property="TRIM(P.ID_SIT_PLAZA)" condition="=" path="idSitPlaza"/>    
                <fsn:filter property="P.ID_GRUPO_PAGO" condition="=" path="idGrupoPago"/>
                <fsn:filter property="P.ID_UNIDAD_PRE" condition="=" path="idUnidadPre"/> 
                
                <!--fsn:filter property="P.ID_PUESTO_PRE" condition="=" path="idPuestoPre"-->    
                <fsn:filter property="TRIM(AP.ID_ATRIBUTO_PUESTO)" condition="=" path="idPuestoPre"/>    
                
                <fsn:filter property="AP.ID_NIVEL_PTO" condition="contains" path="idNivelPtoPreFil"/> 
                <fsn:filter property="AP.ID_NOMBRAMIENTO" condition="contains" path="idNombPre"/>    
                <fsn:filter property="P.ID_UNIDAD_NOM" condition="=" path="idUnidadNom"/>
                
                <!--fsn:filter property="P.ID_PUESTO_NOM" condition="=" path="idPuestoNom"-->
                <fsn:filter property="TRIM(APNOM.ID_ATRIBUTO_PUESTO)" condition="=" path="idPuestoNom"/> 
                
                <fsn:filter property="APN.ID_NIVEL_PTO" condition="contains" path="idNivelPtoNomFil"/>    
                <fsn:filter property="APN.ID_NOMBRAMIENTO" condition="contains" path="idNombNom"/>    
                <fsn:filter property="P.ID_MOVTO_PERSONA" condition="=" path="idMovtoPersona"/>    
                <fsn:filter property="P.ID_TIPO_PLAZA" condition="=" path="idTipoPlaza"/>    
                <fsn:filter property="ES.CODIGO_PUESTO" condition="=" path="codigoPuesto"/>    
                <fsn:filter property="P.ID_VACANCIA" condition="=" path="idVacancia"/>    
                
                <fsn:pagedList beanName="${consultaGeneralDTO.beanName}" 
                               baseUrl="${consultaGeneralDTO.urlOrigen}" 
                               appendFilters="false">
                    <div id="displayTagDiv">
                        <display:table name="${consultaGeneralDTO.beanName}" 
                                       class="displaytag" 
                                       pagesize="20" 
                                       export="true"
                                       id="row" 
                                       requestURI="${requestURI}" 
                                       sort="list">
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.idPlaza" 
                                            property="idPlaza" 
                                            href="${consultaGeneralDTO.urlDestino}.do" 
                                            paramId="idPlaza" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.descSitPlaza" 
                                            sortable="true" 
                                            property="descSitPlaza"/>
                            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.plazaRespaldo" 
                                            sortable="true">
                                <c:if test="${row.respaldo > '0'}">
                                    <a href="consultaLinea.do?idPlaza=<c:out value='${row.respaldo}'/>" title="Plaza Respaldo"><c:out value="${row.respaldo}"/></a>
                                </c:if>
                                <c:if test="${row.respaldo == '0'}">
                                    <c:out value="${row.respaldo}"/>
                                </c:if>
                            </display:column>
                                            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.plazaRfc" 
                                            property="plazaRfc" 
                                            sortable="true"/>
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.nombreEmp" 
                                            property="nombreEmp" 
                                            sortable="true"/> 
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.descGrupoPago" 
                                            property="descGrupoPago" 
                                            sortable="true"/>            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.idUnidadP" 
                                            property="idUnidadPre" 
                                            sortable="true"/>            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.idPuestoP" 
                                            property="idPuestoPre" 
                                            sortable="true"/>            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.idNivelPtoP" 
                                            property="idNivelPtoPre" 
                                            sortable="true"/>            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.idUnidadN" 
                                            property="idUnidadNom" 
                                            sortable="true"/>            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.idPuestoN" 
                                            property="idPuestoNom" 
                                            sortable="true"/>            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.idNivelPtoN" 
                                            property="idNivelPtoNom" 
                                            sortable="true"/>            
                            <display:column titleKey="sireh.label.plaza.gestion.consultaGeneral.descTipoPlaza" 
                                            property="descTipoPlaza" 
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