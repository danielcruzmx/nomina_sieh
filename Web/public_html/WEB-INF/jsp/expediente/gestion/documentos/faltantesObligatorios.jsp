<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
</style>
<html:form modelAttribute="controlExpedientesDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.faltantesObligatorios.title"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>B&uacute;squeda de empleados</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.idUnidadNom"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadSinCiclo" 
                                                path="idUnidadNom"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.rfcEmpleado"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:input path="rfcEmpleado"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.nombreEmpleado"></spring:message></td>
                            <td>
                                <fsn:input path="nombreEmpleado"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.primerApellido"></spring:message></td>
                            <td>
                                <fsn:input path="primerApellido"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.segundoApellido"></spring:message></td>
                            <td>
                                <fsn:input path="segundoApellido"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                        </tr>
                    </table>
                    <table width="100%">
                        <tr align="center">
                            <td>&nbsp;</td>
                        </tr>
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.search" 
                                            path="muestraRegistros"
                                            action="gestionDocumentos/${controlExpedientesDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="gestionDocumentos/${controlExpedientesDTO.urlOrigen}"
                                            progressBar="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Empleados localizados</strong></legend>
                    <c:choose>
                        <c:when test="${controlExpedientesDTO.muestraRegistros}">
                            <fsn:filter property="E.RFC_UNICO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="E.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="E.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="E.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="U.ID_UNIDAD" condition="=" path="idUnidadNom" />
                            
                            <fsn:pagedList beanName="${controlExpedientesDTO.beanName}" 
                                           baseUrl="${controlExpedientesDTO.urlOrigen}" 
                                           maxRows="200"
                                           appendFilters="false">
                                <div id="displayTagDiv" style="width:1000px;overflow:auto;"> 
                                    <display:table name="${controlExpedientesDTO.beanName}" 
                                                   class="displaytag" 
                                                   pagesize="200" 
                                                   export="true" 
                                                   id="row" 
                                                   requestURI="${requestURI}" 
                                                   sort="list">                                        
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaFaltantesObligatorios.consulta.unidad" 
                                                        property="descUnidad" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaFaltantesObligatorios.consulta.rfcEmpleado" 
                                                        property="rfcEmpleado" 
                                                        sortable="true"
                                                        href="faltantesObligatoriosBusqueda.do" 
                                                        paramId="rfcEmpleado"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaFaltantesObligatorios.consulta.nombreEmpleado" 
                                                        property="nombreEmpleado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaFaltantesObligatorios.consulta.primerApellido" 
                                                        property="primerApellido" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaFaltantesObligatorios.consulta.segundoApellido" 
                                                        property="segundoApellido" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaFaltantesObligatorios.consulta.descPuesto" 
                                                        property="descPuesto" 
                                                        sortable="true"/>
                                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                                            <display:setProperty name="export.pdf" value="true"/>
                                            <display:setProperty name="basic.msg.empty_list">
                                                <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                            </display:setProperty>
                                     </display:table>
                                </div>
                            </fsn:pagedList>
                            
                            <table align="center" width="50%" border="0">
                                <tr>
                                    <td align="center">
                                        <fsn:submit value="submit.export.informeFaltantes" 
                                                    action="gestionDocumentos/informeFaltantesObligatorios.do" 
                                                    progressIcon="false" />
                                    </td>
                                </tr>
                            </table>
                        </c:when>
                        <c:otherwise>
                            <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                        </c:otherwise>
                    </c:choose>
                </fieldset>
            </td>
        </tr>
        <tr align="center">
            <td>
                <c:if test="${not empty controlExpedientesDTO.rfcEmpleadoBusqueda}">
                    <fsn:docElectronica rfc="${controlExpedientesDTO.rfcEmpleadoBusqueda}" tipo="FALTANTES_OBLIGATORIOS"/>
                </c:if>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        // Validaciones FALTANTES_OBLIGATORIOS
        $j(document).ready(function(){
            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
        });
        
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>