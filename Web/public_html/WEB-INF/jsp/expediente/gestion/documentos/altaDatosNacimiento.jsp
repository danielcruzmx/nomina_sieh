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
<html:form modelAttribute="expedienteDatosNacimientoDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>    
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr align="left">
            <td>
                <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.expedientePersonal.title"></spring:message> <fsn:label path="nombreEmpleadoCompleto"/></h1>
            </td>
        </tr>
        <tr>
            <td>
                <table width="100%">
                    <tr>
                        <td align="center">
                            <fieldset>
                                <legend>
                                    <strong><spring:message text="Datos"/></strong>
                                    <img class="fotografia" width="55" src="<spring:theme code="casa.jpg"/>" align="middle"/>       
                                    <strong><spring:message text="personales"/></strong>
                                </legend>
                                <table width="100%">
                                    <tr>
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>Alta de datos de nacimiento</strong></legend><br/>
                                                <table width="100%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.nombreEmpleado"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="nombreEmpleado"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInput alphaEspacios"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.primerApellido"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="primerApellido"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInput alphaEspacios"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.segundoApellido"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="segundoApellido"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInput alphaEspacios"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.pais"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcPais-altaDatosNacimiento"
                                                                            path="pais"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.nacionalidad"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcNacionalidad-altaDatosNacimiento"
                                                                            path="nacionalidad"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.entidadFederativa"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcEstado-altaDatosNacimiento"
                                                                            path="entidadFederativa"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.fecNacimiento"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:calendar path="fecNacimiento" size="10"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.formaFM3"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="formaFM3"
                                                                       uppercase="true" 
                                                                       maxlength="30"
                                                                       size="60" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteDatosNacimientoDTO.rolAutorizar || expedienteDatosNacimientoDTO.rolRechazar) && (expedienteDatosNacimientoDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.rechazo"></spring:message></td>
                                                            <td align="left" colspan="3">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaDatosNacimiento"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>                                                   
                                                    <tr align="center">
                                                        <td colspan="6">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.documentoSoporte"></spring:message></td>
                                                        <td align="left" colspan="5">
                                                            <input type="file" name="documentoSoporte" id="documentoSoporte" value="*.*" size="50" class="anchoInput"/>
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
                                                                        path="registrar"
                                                                        action="gestionDocumentos/${expedienteDatosNacimientoDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaDatosNacimiento.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaDatosNacimiento.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarDatosNacimiento.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.eliminar"/> &nbsp;            
                                                            <fsn:submit value="submit.cancel" 
                                                                        path="cancel" 
                                                                        action="gestionDocumentos/busquedaDocEmpleado.do"
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
                                        <td align="left" height="20px" valign="middle">
                                            <strong>
                                                <spring:message code="sireh.form.required.fields"/>
                                            </strong>
                                        </td>
                                    </tr>
                                    <tr align="center">
                                        <td>&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>Antecedentes de datos de nacimiento</strong></legend>
                                                
                                                 <fsn:filter property="ED.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                
                                                <fsn:pagedList beanName="${expedienteDatosNacimientoDTO.beanName}" 
                                                               baseUrl="${expedienteDatosNacimientoDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteDatosNacimientoDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                <c:choose>
                                                                    <c:when test="${ (row.idStatus == 'REG' && (expedienteDatosNacimientoDTO.rolRegistrar || expedienteDatosNacimientoDTO.rolAutorizar || expedienteDatosNacimientoDTO.rolRechazar)) || (row.idStatus == 'REC' && expedienteDatosNacimientoDTO.rolRegistrar) }">
                                                                        <input name="docGrupo" 
                                                                               class="box"
                                                                               type="checkbox" 
                                                                               value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.dnaSecuencia}|${row.dnaDoctoRef}"/>"/>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        -
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.documento" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.dnaDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.id" 
                                                                            property="dnaSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.nombreEmpleado" 
                                                                            property="dnaNombreEmpleado" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.primerApellido" 
                                                                            property="dnaPrimerApellido" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.segundoApellido" 
                                                                            property="dnaSegundoApellido" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>                
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.pais" 
                                                                            property="descPais" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>                
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.nacionalidad" 
                                                                            property="descNacionalidad" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.entidadFederativa" 
                                                                            property="descEstado" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.fecNacimiento" 
                                                                            property="dnaFecNacimiento" 
                                                                            sortable="false"
                                                                            style="text-align: center"
                                                                            format="{0,date,dd/MM/yyyy}"/>                                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosNacimiento.formaFM3" 
                                                                            property="dnaExtranjerosFm3" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.estado" 
                                                                            property="desStatus" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.rechazo" 
                                                                            property="descRechazo" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.fecModifico" 
                                                                            property="fecModifico" 
                                                                            sortable="false"
                                                                            style="text-align: center"
                                                                            format="{0,date,dd/MM/yyyy}"/>
                                                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                                                            <display:setProperty name="export.pdf" value="true"/>
                                                            <display:setProperty name="basic.msg.empty_list">
                                                                <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                                            </display:setProperty>
                                                        </display:table>
                                                    </div>
                                                </fsn:pagedList>
                                            </fieldset>
                                        </td>
                                    </tr>
                                </table>
                            </fieldset>
                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    

        <script type="text/javascript">
            function enableEliminarButtons(){
                $j("#10004").removeAttr('disabled','true');
            }
            function disableEliminarButtons(){
                $j("#10004").attr('disabled','true');
            }
            function enableRegistrarButtons(){
                // Boton registrar
                $j("#10001").removeAttr('disabled');
            }
            function disableRegistrarButtons(){
                // Boton registrar
                $j("#10001").attr('disabled','true');
            }
            
            function disableAutorizarButtons(){
                // Boton autorizar
                $j("#10002").attr('disabled','true');
                // Boton rechazar
                $j("#10003").attr('disabled','true');
            }
            function enableAutorizarButtons(){            
                // Boton autorizar
                $j("#10002").removeAttr('disabled');
                // Boton rechazar
                $j("#10003").removeAttr('disabled');
            }
            function disableFormButtons(){
                $j("#nombreEmpleado").prop("disabled", true);
                $j("#primerApellido").prop("disabled", true);
                $j("#segundoApellido").prop("disabled", true);
                $j("#pais").prop("disabled", true);
                $j("#nacionalidad").prop("disabled", true);
                $j("#entidadFederativa").prop("disabled", true);
                $j("#text_fecNacimiento").prop("disabled", true);            
                $j("#formaFM3").prop("disabled", true);
                $j("#documentoSoporte").prop("disabled", true);
            }
            function enableFormButtons(){
                $j("#nombreEmpleado").removeAttr("disabled");
                $j("#primerApellido").removeAttr("disabled");
                $j("#segundoApellido").removeAttr("disabled");
                $j("#pais").removeAttr("disabled");
                $j("#nacionalidad").removeAttr("disabled");
                $j("#entidadFederativa").removeAttr("disabled");
                $j("#text_fecNacimiento").removeAttr("disabled");
                $j("#formaFM3").removeAttr("disabled");
                $j("#documentoSoporte").removeAttr("disabled");
            }
            function cleanForm(){
                $j("#nombreEmpleado").val('');
                $j("#primerApellido").val('');
                $j("#segundoApellido").val('');
                $j("#pais").val('');
                $j("#fecNacimiento").val('');
                $j("#text_fecNacimiento").val('');
                $j("#nacionalidad").val('');
                $j("#entidadFederativa").val('');
                $j("#formaFM3").val('');
                $j("#documentoSoporte").val('');
            }
            disableRegistrarButtons();
            disableAutorizarButtons();
            disableEliminarButtons();
        </script>

    
    <script type="text/javascript">
        $j(document).ready(function(){
            $j("#text_fecNacimiento").prop("disabled", true);            
            
            // Validaciones
            $j('.alphanumeric').alphanumeric();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.numeric').numeric();       
        });
        
         // Checkbox unico
        $j(':checkbox').on('change',function(){
            var th = $j(this), name = th.prop('name'); 
            if(th.is(':checked')){
                $j(':checkbox[name="'  + name + '"]').not($(this)).prop('checked',false);   
            } else {
                cleanForm();
            }
        });
        
        var rolRegistrar = <c:out value="${expedienteDatosNacimientoDTO.rolRegistrar}"/>;
        var rolAutorizar = <c:out value="${expedienteDatosNacimientoDTO.rolAutorizar}"/>;
        $j('.box').change(function(){
            disableRegistrarButtons();
            disableAutorizarButtons();
            disableEliminarButtons();
            $j('.box:checked').each(function(){
                var auxNombreEmpleado = $j(this).parent().next('td').next('td').next('td').text();
                var auxPrimerApellido = $j(this).parent().next('td').next('td').next('td').next('td').text();
                var auxSegundoApellido = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxPais = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxNacionalidad = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxEstado = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxFecNac = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxFm3 = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                
                var auxPais2 = auxPais.split(" - ");
                var auxNacionalidad2 = auxNacionalidad.split(" - ");
                var auxEstado2 = auxEstado.split(" - ");
                var auxFecNac2 = auxFecNac.split(" - ");
                
                $j("#nombreEmpleado").val(auxNombreEmpleado);
                $j("#primerApellido").val(auxPrimerApellido);
                $j("#segundoApellido").val(auxSegundoApellido);
                $j("#pais").val(auxPais2[0]);
                $j("#nacionalidad").val(auxNacionalidad2[0]);
                $j("#entidadFederativa").val(auxEstado2[0]);
                $j("#fecNacimiento").val(auxFecNac2[0]);
                $j("#text_fecNacimiento").val(auxFecNac);
                $j("#formaFM3").val(auxFm3);

                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                if (auxEstatus == 'RECHAZADO') {
                    if(rolRegistrar){
                        enableRegistrarButtons();
                    }
                    disableAutorizarButtons();
                    enableFormButtons();
                }
                if (auxEstatus == 'REGISTRO') {
                    if(rolAutorizar){
                        enableAutorizarButtons();
                        disableRegistrarButtons();
                        disableFormButtons();
                    } else {
                        disableAutorizarButtons();
                        disableFormButtons();
                        enableEliminarButtons();
                    }
                }
            });
            
        });
        
       
        
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
    
    <%--Validacion boton registrar--%>
    <c:if test="${expedienteDatosNacimientoDTO.rolRegistrar && expedienteDatosNacimientoDTO.totalRegistrados == 0 && expedienteDatosNacimientoDTO.totalRechazados == 0}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
    
</html:form>