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
    <html:hidden path="showPagedList"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.controlExpedientes"/></h1>
    <p>&nbsp;</p>
    
    <table align="center" border="0">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>B&uacute;squeda de empleados</strong></legend>
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
                                            action="gestionExpediente/${controlExpedientesDTO.urlOrigen}"
                                            progressBar="true"/>&nbsp; 
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="gestionExpediente/${controlExpedientesDTO.urlOrigen}"
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
                        <c:when test="${controlExpedientesDTO.showPagedList}">
                            <fsn:filter property="E.RFC_EMPLEADO" condition="contains" path="rfcEmpleado" />
                            <fsn:filter property="E.NOMBRE_EMPLEADO" condition="contains" path="nombreEmpleado" />
                            <fsn:filter property="E.PRIMER_APELLIDO" condition="contains" path="primerApellido" />
                            <fsn:filter property="E.SEGUNDO_APELLIDO" condition="contains" path="segundoApellido" />
                            <fsn:filter property="U.ID_UNIDAD" condition="=" path="idUnidadNom" />
                            
                            <fsn:pagedList beanName="${controlExpedientesDTO.beanName}" 
                                           baseUrl="${controlExpedientesDTO.urlOrigen}" 
                                           appendFilters="false">
                                <div id="displayTagDiv" style="width:1000px;overflow:auto;"> 
                                    <display:table name="${controlExpedientesDTO.beanName}" 
                                                   class="displaytag" 
                                                   pagesize="10" 
                                                   export="true" 
                                                   id="row" 
                                                   requestURI="${requestURI}" 
                                                   sort="list">
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.id" 
                                                        style="text-align: center;">
                                            <input name="empleadoGrupo" 
                                                   class="box"
                                                   type="checkbox" 
                                                   value="<c:out value="${row.rfcEmpleado}"/>"/>
                                        </display:column>
                                        
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.unidad" 
                                                        property="descUnidad" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.rfcEmpleado" 
                                                        property="rfcEmpleado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.nombreEmpleado" 
                                                        property="nombreEmpleado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.primerApellido" 
                                                        property="primerApellido" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.segundoApellido" 
                                                        property="segundoApellido" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.descPuesto" 
                                                        property="descPuesto" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exePrestado" 
                                                        property="exePrestado" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exeRfcUsuarioPrestamo" 
                                                        property="exeRfcUsuarioPrestamo" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exeFechaPrestamo" 
                                                        property="exeFechaPrestamo"
                                                        format="{0,date,dd/MM/yyyy}"
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exeDatosClasificacion" 
                                                        property="exeDatosClasificacion" 
                                                        sortable="true"/>
                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionExpedientes.busquedaControlExpedientes.consulta.exeDatosUbicacion" 
                                                        property="exeDatosUbicacion" 
                                                        sortable="true"/>
                                        <display:setProperty name="paging.banner.placement" value="bottom"/>
                                            <display:setProperty name="export.pdf" value="true"/>
                                            <display:setProperty name="basic.msg.empty_list">
                                                <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
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
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del expediente</strong></legend>
                    <table width="100%">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.nombreEmpleado"></spring:message></td>
                            <td>
                                <fsn:input path="usuNombreEmpleado"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.primerApellido"></spring:message></td>
                            <td>
                                <fsn:input path="usuPrimerApellido"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.segundoApellido"></spring:message></td>
                            <td>
                                <fsn:input path="usuSegundoApellido"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.usuRfcEmpleado"></spring:message></td>
                            <td>
                                <fsn:input path="usuRfcEmpleado"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           readonly="true"
                                           css="anchoInput"/>
                            </td>
                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.exePrestado"></spring:message></td>
                            <td>
                                <html:radiobutton value="SI" path="exePrestado" label=" Si"/>
                                <html:radiobutton value="NO" path="exePrestado" label=" No"/>
                            </td>
                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.exeRfcUsuarioPrestamo"></spring:message></td>
                            <td>
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tdExpUsuarios-controlExpediente" 
                                                path="exeRfcUsuarioPrestamo"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.exeFechaPrestamo"></spring:message></td>
                            <td>
                                <fsn:calendar path="exeFechaPrestamo"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.exeDatosClasificacion"></spring:message></td>
                            <td>
                                <fsn:input path="exeDatosClasificacion"
                                           uppercase="true" 
                                           maxlength="50"
                                           size="60" 
                                           readonly="false"
                                           css="anchoInput"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionExpedientes.exeDatosUbicacion"></spring:message></td>
                            <td>
                                <fsn:input path="exeDatosUbicacion"
                                           uppercase="true" 
                                           maxlength="50"
                                           size="60" 
                                           readonly="false"
                                           css="anchoInput"/>
                            </td>
                        </tr>
                    </table>
                    <table width="100%">
                        <tr align="center">
                            <td>&nbsp;</td>
                        </tr>
                        <tr align="center">
                            <td>
                                <fsn:submit value="submit.save" 
                                            path="guardar"
                                            action="gestionExpediente/saveControlExpedientes"
                                            progressBar="true"
                                            alertCode="confirm.expediente.alta.guardar"/>&nbsp; 
                                <fsn:submit value="submit.cancel" 
                                            path="cancelar" 
                                            action="gestionExpediente/${controlExpedientesDTO.urlOrigen}"
                                            progressBar="true"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        $j("#text_exeFechaPrestamo").prop("disabled", true);
    </script>
        
    <script type="text/javascript">
        var globalAuxUsuario;
        var globalAuxExeFechaPrestamo;
        
        // Validaciones
        $j(document).ready(function(){
            $j('#rfcEmpleado').mask('AAAAAAAAAAAAA');
            $j('.alphanumeric').alphanumeric();
            $j('.alphaEspacios').alpha({allow:" "});
        });
        
        // Checkbox unico
        $j(':checkbox').on('change',function(){
            var th = $j(this), name = th.prop('name'); 
            if(th.is(':checked')){
                $j(':checkbox[name="'  + name + '"]').not($(this)).prop('checked',false);   
            }
        });
        
        // Recuperar fila selecccionada
        $j('.box').change(function(){
            $j('.box:checked').each(function(){
                var auxRcf                   = $j(this).parent().next('td').next('td').text();
                var auxNombre                = $j(this).parent().next('td').next('td').next('td').text();
                var auxPrimerApellido        = $j(this).parent().next('td').next('td').next('td').next('td').text();
                var auxSegundoApellido       = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxExePrestado           = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxUsuario               = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxExeFechaPrestamo      = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxExeDatosClasificacion = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxExeDatosUbicacion     = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                
                globalAuxUsuario = auxUsuario;
                globalAuxExeFechaPrestamo = auxExeFechaPrestamo;
                
                if (auxExePrestado == 'SI') {
                   $j("#exePrestado1").prop("checked", true);
                   $j("#exePrestado2").prop("checked", false);
                } else if(auxExePrestado == 'NO') {
                    $j("#exePrestado1").prop("checked", false);
                    $j("#exePrestado2").prop("checked", true);
                }
                
                //$j("#exeRfcUsuarioPrestamo").attr('disabled','disabled');    
                $j("#text_exeFechaPrestamo").attr('readonly','readonly');
                //$j('#button_exeFechaPrestamo').hide();
                
                $j("#usuRfcEmpleado").val(auxRcf);
                $j("#usuNombreEmpleado").val(auxNombre);
                $j("#usuPrimerApellido").val(auxPrimerApellido);
                $j("#usuSegundoApellido").val(auxSegundoApellido);
                $j("#exeRfcUsuarioPrestamo").val(auxUsuario);
                $j("#text_exeFechaPrestamo").val(auxExeFechaPrestamo);
                $j("#exeFechaPrestamo").val(auxExeFechaPrestamo);
                $j("#exeDatosClasificacion").val(auxExeDatosClasificacion);
                $j("#exeDatosUbicacion").val(auxExeDatosUbicacion);
            });
        });
        
        $j('#exePrestado2').click(function() {
            $j("#exeRfcUsuarioPrestamo").attr('disabled','disabled');   
            $j("#exeRfcUsuarioPrestamo").val(globalAuxUsuario);
            $j("#text_exeFechaPrestamo").attr('disabled','disabled');
            $j("#text_exeFechaPrestamo").val(globalAuxExeFechaPrestamo);
            $j('#button_exeFechaPrestamo').hide();
        });
        
        $j('#exePrestado1').click(function() {
            $j("#exeRfcUsuarioPrestamo").removeAttr('disabled');   
            $j("#exeRfcUsuarioPrestamo").val('');
            $j("#text_exeFechaPrestamo").removeAttr('readonly');
            $j("#text_exeFechaPrestamo").val('');
            $j('#button_exeFechaPrestamo').show();
        });
        
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
</html:form>