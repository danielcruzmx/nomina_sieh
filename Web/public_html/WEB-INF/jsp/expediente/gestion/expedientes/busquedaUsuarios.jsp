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
<html:form modelAttribute="usuariosAutorizadosDTO">
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.idUnidadNom"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadSinCiclo" path="idUnidadNom"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.rfcEmpleado"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:input path="rfcEmpleado"
                                           uppercase="true" 
                                           maxlength="13"
                                           size="60" 
                                           css="anchoInput alphanumeric"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.nombreEmpleado"></spring:message></td>
                            <td>
                                <fsn:input path="nombreEmpleado"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.primerApellido"></spring:message></td>
                            <td>
                                <fsn:input path="primerApellido"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.segundoApellido"></spring:message></td>
                            <td>
                                <fsn:input path="segundoApellido"
                                           uppercase="true" 
                                           maxlength="40"
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
                                            action="gestionExpediente/${usuariosAutorizadosDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="gestionExpediente/${usuariosAutorizadosDTO.urlOrigen}"
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
                        <c:when test="${usuariosAutorizadosDTO.muestraRegistros}">
                            <fsn:filter property="e.RFC_EMPLEADO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="e.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="e.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="e.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="p.ID_UNIDAD_NOM" condition="=" path="idUnidadNom" />
                            
                            <fsn:pagedList beanName="${usuariosAutorizadosDTO.beanName}" 
                                           baseUrl="${usuariosAutorizadosDTO.urlOrigen}" 
                                           maxRows="200" 
                                           appendFilters="false">
                                <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;"> 
                                    <display:table name="${usuariosAutorizadosDTO.beanName}" 
                                                   class="displaytag" 
                                                   pagesize="10" 
                                                   export="true" 
                                                   id="row" 
                                                   requestURI="${requestURI}" 
                                                   sort="list">
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.idUnidadNom" 
                                                        property="descUnidad" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.rfcEmpleado" 
                                                        property="rfcEmpleado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.nombreEmpleado" 
                                                        property="nombreEmpleado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.primerApellido" 
                                                        property="primerApellido" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.segundoApellido" 
                                                        property="segundoApellido" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.usuStatusAutorizacion" 
                                                        property="idStatus" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaUsuarios.usuDoctoAutorizacion" 
                                                        property="usuDoctoAutorizacion" 
                                                        sortable="true"/>
                                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                                            <display:setProperty name="export.pdf" value="true"/>
                                            <display:setProperty name="basic.msg.empty_list">
                                                <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                                            </display:setProperty>
                                     </display:table>
                                </div>
                            </fsn:pagedList>
                        </c:when>
                        <c:otherwise>
                            <br><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br><br></span>
                        </c:otherwise>
                    </c:choose>
                </fieldset>
            </td>
        </tr>
    </table>
    
        <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');
            $j('.alphanumeric').alphanumeric();
            $j('.alphaEspacios').alpha({allow:" "});
        });
        </script>


    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
</html:form>