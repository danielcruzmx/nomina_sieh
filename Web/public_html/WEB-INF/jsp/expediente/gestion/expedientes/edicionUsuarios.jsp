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
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.edicionUsuarios"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.idUnidadNom"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadSinCiclo" path="idUnidadNom"
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
                                <div id="displayTagDiv" style="width:1000px;overflow:auto;"> 
                                    <display:table name="${usuariosAutorizadosDTO.beanName}" 
                                                   class="displaytag" 
                                                   pagesize="10" 
                                                   export="true" 
                                                   id="row" 
                                                   requestURI="${requestURI}" 
                                                   sort="list">
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.unidad" 
                                                        property="descUnidad" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.rfcEmpleado" 
                                                        property="rfcEmpleado" 
                                                        href="editarUsuariosRfc.do" 
                                                        paramId="rfcEmpleado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.nombreEmpleado" 
                                                        property="nombreEmpleado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.primerApellido" 
                                                        property="primerApellido" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.segundoApellido" 
                                                        property="segundoApellido" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.busquedaDocEmpleado.consulta.descPuesto" 
                                                        property="descPuesto" 
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
        <tr align="center">
            <td>&nbsp;</td>
        </tr>
        <tr>
            <td>
                <c:if test="${usuariosAutorizadosDTO.consultar}" >
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Mantenimiento de usuarios</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.nombreEmpleado"></spring:message></td>
                            <td>
                                <fsn:input path="usuNombreEmpleado"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.primerApellido"></spring:message></td>
                            <td>
                                <fsn:input path="usuPrimerApellido"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.segundoApellido"></spring:message></td>
                            <td>
                                <fsn:input path="usuSegundoApellido"
                                           uppercase="true" 
                                           maxlength="40"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput alphaEspacios"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.usuDoctoAutorizacion"></spring:message></td>
                            <td>
                                <fsn:input path="usuDoctoAutorizacion"
                                           uppercase="true" 
                                           maxlength="100"
                                           size="60" 
                                           css="anchoInput"/>
                            </td>
                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.usuFechaAutorizacion"></spring:message></td>
                            <td>
                                <fsn:calendar path="usuFechaAutorizacion"/>
                            </td>
                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.usuTelefono"></spring:message></td>
                            <td>
                                <fsn:input path="usuTelefono"
                                           uppercase="true" 
                                           maxlength="25"
                                           size="60" 
                                           css="anchoInput"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.usuStatusAutorizacion"></spring:message></td>
                            <td>
                                <html:radiobutton value="ACT" path="idStatus" label=" Activo"/>
                                <html:radiobutton value="INA" path="idStatus" label=" Inactivo"/>
                            </td>
                            <td></td>
                            <td></td>
                        </tr>
                    </table>
                    <table width="100%">
                        <tr align="center">
                            <td>&nbsp;</td>
                        </tr>
                        <tr>
                            <td align="left" height="20px" valign="middle">
                                <strong>
                                    <spring:message code="sireh.form.required.fields"/>
                                </strong>
                            </td>
                        </tr>
                        <tr align="center">
                            <td>&nbsp;</td>
                        </tr>
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.save" 
                                            path="guardar"
                                            action="gestionExpediente/${usuariosAutorizadosDTO.urlDestino}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.cancel" 
                                            path="cancelar" 
                                            action="gestionExpediente/${usuariosAutorizadosDTO.urlOrigen}"
                                            progressBar="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
                </c:if>
            </td>
        </tr>
    </table>
    <script type="text/javascript">
        $j(document).ready(function(){
            $j("#text_usuFechaAutorizacion").prop("disabled", true);
        });
        
        // Validaciones
        $j(document).ready(function(){
            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');
            $j('.alphanumeric').alphanumeric();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.numeric').numeric();
        });
        
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
    <html:hidden path="consultar"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
</html:form>