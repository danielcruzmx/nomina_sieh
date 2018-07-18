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
<html:form modelAttribute="busquedaExpedientesDTO">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.expedientesPrestamo"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>B&uacute;squeda de expedientes</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.idUnidadNom"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadSinCiclo" 
                                                path="idUnidadNom"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.rfcEmpleado"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:input path="rfcEmpleado"
                                           uppercase="true" 
                                           maxlength="13"
                                           size="60" 
                                           css="anchoInput alphanumeric"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.nombreEmpleado"></spring:message></td>
                            <td>
                                <fsn:input path="nombreEmpleado"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.primerApellido"></spring:message></td>
                            <td>
                                <fsn:input path="primerApellido"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.segundoApellido"></spring:message></td>
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
                                            action="gestionExpediente/${busquedaExpedientesDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="gestionExpediente/${busquedaExpedientesDTO.urlOrigen}"
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
                    <legend style="font-size:1.3em"><strong>Expedientes en prestamo</strong></legend>
                    <c:choose>
                        <c:when test="${busquedaExpedientesDTO.muestraRegistros}">
                            <fsn:filter property="E.RFC_EMPLEADO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="E.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="E.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="E.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="U.ID_UNIDAD" condition="=" path="idUnidadNom" />
                            
                            <fsn:pagedList beanName="${busquedaExpedientesDTO.beanName}" 
                                           baseUrl="${busquedaExpedientesDTO.urlOrigen}" 
                                           maxRows="200" 
                                           appendFilters="false">
                                <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;"> 
                                    <display:table name="${busquedaExpedientesDTO.beanName}" 
                                                   class="displaytag" 
                                                   pagesize="10" 
                                                   export="true" 
                                                   id="row" 
                                                   requestURI="${requestURI}" 
                                                   sort="list">
                                        
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.empleado" 
                                                        property="empleado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.usuarioExpediente" 
                                                        property="usuarioExpediente" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.exePrestado" 
                                                        property="exePrestado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.telefonoUsuario" 
                                                        property="telefonoUsuario" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.fechaPrestamo" 
                                                        property="fechaPrestamo" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaExpedientes.consulta.unidadUsuario" 
                                                        property="unidadUsuario" 
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
        
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>