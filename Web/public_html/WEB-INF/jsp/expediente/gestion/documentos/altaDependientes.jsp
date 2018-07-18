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
<html:form modelAttribute="expedienteDependientesDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>    
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.title"/></h1>
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
                                                <legend style="font-size:1.3em"><strong>Alta y/o modificaci&oacute;n de familiares, dependientes o beneficiarios</strong></legend><br/>
                                                <table width="100%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.nombreEmpleado"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="nombreEmpleado"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInput alphaNumericEspacios"/>
                                                        </td>
                                                        <td class="label"> <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.primerApellido"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="primerApellido"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInput alphaNumericEspacios"/>
                                                        </td>
                                                        <td class="label"> <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.segundoApellido"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="segundoApellido"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInput alphaNumericEspacios"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="center">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.fecNacimiento"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:calendar path="fecNacimiento" readonly="true" size="10"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.parentesco"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="0" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcParentesco-altaDependientes"
                                                                            path="parentesco"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.nivelEscolar"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:selectList beanName="tcNivelEscolar-altaDependientes"
                                                                            path="nivelEscolar"
                                                                            style="width:200px;"
                                                                            onchange="getNivelEscolar();"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="center">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.promedioEscolar"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="promedioEscolar"
                                                                       uppercase="true" 
                                                                       maxlength="6"
                                                                       size="60" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.genero"></spring:message></td>
                                                        <td align="left">
                                                            <table align="left" width="80%">
                                                                <tr>                        
                                                                    <td align="left">
                                                                        <html:radiobutton value="M" path="genero" label=" Masculino"/>
                                                                    </td>
                                                                    <td align="left">
                                                                        <html:radiobutton value="F" path="genero" label=" Femenino"/>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteDependientesDTO.rolAutorizar || expedienteDependientesDTO.rolRechazar) && (expedienteDependientesDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.rechazo"></spring:message></td>
                                                            <td align="left" colspan="3">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaDependientes"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    <tr align="center">
                                                        <td colspan="6">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.documentoSoporte"></spring:message></td>
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
                                                                        action="gestionDocumentos/${expedienteDependientesDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaDependientes.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp;
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaDependientes.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarDependientes.do"
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de familiares, dependientes o beneficiarios</strong></legend>
                                                
                                                <fsn:filter property="EF.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                    
                                                <fsn:pagedList beanName="${expedienteDependientesDTO.beanName}" 
                                                               baseUrl="${expedienteDependientesDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteDependientesDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            <c:choose>
                                                                <c:when test="${ (row.idStatus == 'REG' && (expedienteDependientesDTO.rolAutorizar || expedienteDependientesDTO.rolRechazar || expedienteDependientesDTO.rolRegistrar)) || (row.idStatus == 'REC' && expedienteDependientesDTO.rolRegistrar)}">
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                        <input name="docGrupo" 
                                                                               class="box"
                                                                               type="checkbox" 
                                                                               value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.fdbSecuencia}|${row.fdbDoctoRef}"/>"/>
                                                                    </display:column>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.docGrupo" 
                                                                                    style="text-align: center;"> - </display:column>
                                                                </c:otherwise>
                                                            </c:choose>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.documento" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.fdbDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.id" 
                                                                            property="fdbSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.nombreEmpleado" 
                                                                            property="nombreEmpleado" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.primerApellido" 
                                                                            property="primerApellido" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.segundoApellido" 
                                                                            property="segundoApellido" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.fecNacimiento" 
                                                                            property="fdbFechaNacimiento" 
                                                                            sortable="false"
                                                                            style="text-align: left"
                                                                            format="{0,date,dd/MM/yyyy}"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.genero" 
                                                                            property="descGenero" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.parentesco" 
                                                                            property="descParentesco" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.nivelEscolar" 
                                                                            property="descNivelEscolar" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.promedioEscolar" 
                                                                            property="fdbPromedio" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.estado" 
                                                                            property="desStatus" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.rechazo" 
                                                                            property="descRechazo" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDependientes.consulta.fecModifico" 
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
        function enableEliminarButtons(){
            $j("#10004").removeAttr('disabled','true');
        }
        function disableEliminarButtons(){
            $j("#10004").attr('disabled','true');
        }        
        function disableFormButtons(){
            $j("#nombreEmpleado").prop("disabled", true);
            $j("#primerApellido").prop("disabled", true);
            $j("#segundoApellido").prop("disabled", true);
            $j("#fecNacimiento").prop("disabled", true);
            $j("#text_fecNacimiento").prop("disabled", true);
            $j("#button_fecNacimiento").prop("disabled", true);
            $j("#parentesco").prop("disabled", true);
            $j("#nivelEscolar").prop("disabled", true);
            $j("#promedioEscolar").prop("disabled", true);
            $j("input[type=radio]").attr('disabled', true);
            $j("#documentoSoporte").prop("disabled", true);
        }
        function enableFormButtons(){
            $j("#nombreEmpleado").removeAttr('disabled');
            $j("#primerApellido").removeAttr('disabled');
            $j("#segundoApellido").removeAttr('disabled');
            $j("#fecNacimiento").removeAttr('disabled');
            $j("#text_fecNacimiento").removeAttr('disabled');
            $j("#button_fecNacimiento").removeAttr('disabled');
            $j("#parentesco").removeAttr('disabled');
            $j("#nivelEscolar").removeAttr('disabled');
            $j("#promedioEscolar").removeAttr('disabled');
            $j("input[type=radio]").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        
        function cleanForm(){
            $j("#nombreEmpleado").val('');
            $j("#primerApellido").val('');
            $j("#segundoApellido").val('');
            $j("#fecNacimiento").val('');
            $j("#text_fecNacimiento").val('');
            $j("#button_fecNacimiento").val('');
            $j("#parentesco").val('');
            $j("#nivelEscolar").val('');
            $j("#promedioEscolar").val('');
            $j("input[type=radio]").val('');
            $j("#documentoSoporte").val('');
            $j("#genero").val('');
            $j("#genero1").attr('checked', false);
            $j("#genero2").attr('checked', false);
        }
        disableRegistrarButtons();
        disableAutorizarButtons();
        disableEliminarButtons();
    </script>
    
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.numeric').numeric();
            $j("#promedioEscolar").mask("999.99");
        });
        
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
    
    <script type="text/javascript">
        // Recuperar fila selecccionada
        var rolRegistrar = <c:out value="${expedienteDependientesDTO.rolRegistrar}"/>; 
        var rolAutorizar = <c:out value="${expedienteDependientesDTO.rolAutorizar}"/>; 
        $j('.box').change(function(){
            disableRegistrarButtons();
            disableAutorizarButtons();
            disableEliminarButtons();
            $j('.box:checked').each(function(){
                var auxNombreEmpleado   = $j(this).parent().next('td').next('td').next('td').text();
                var auxPrimerApellido   = $j(this).parent().next('td').next('td').next('td').next('td').text();
                var auxSegundoApellido  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxFecNacimiento    = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxGenero           = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                
                var auxParentesco       = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxParentesco2      = auxParentesco.split(" - "); 
                
                var auxNivelEscolar     = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxNivelEscolar2    = auxNivelEscolar.split(" - ");
                
                var auxPromedioEscolar  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                
                $j("#nombreEmpleado").val(auxNombreEmpleado);
                $j("#primerApellido").val(auxPrimerApellido);
                $j("#segundoApellido").val(auxSegundoApellido);
                $j("#fecNacimiento").val(auxFecNacimiento);
                $j("#text_fecNacimiento").val(auxFecNacimiento);
                
                //auxGenero == 'Masculino' ? 'M' : 'F';
                if (auxGenero == 'Masculino') {
                    $j("#genero1").attr('checked', 'checked');
                } else {
                    $j("#genero2").attr('checked', 'checked');
                }
                
                $j("#parentesco").val(auxParentesco2[0]);
                $j("#nivelEscolar").val(auxNivelEscolar2[0]);
                $j("#promedioEscolar").val(auxPromedioEscolar);
                
                // Rechazo
                var auxRechazo  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxRechazo2 = auxRechazo.split(" - ");
                $j("#rechazo").val(auxRechazo2);
                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                if (auxEstatus == 'RECHAZADO') {
                    if(rolRegistrar){
                        enableRegistrarButtons();
                    }
                    disableAutorizarButtons();
                }
                if (auxEstatus == 'REGISTRO') {
                    if(rolAutorizar){
                        enableAutorizarButtons();
                    } else {
                        enableEliminarButtons();
                    }
                    disableFormButtons();
                    disableRegistrarButtons();
                }
            });
        });
        
        // Checkbox unico
        $j(':checkbox').on('change',function(){
            var th = $j(this), name = th.prop('name'); 
            if(th.is(':checked')){
                $j(':checkbox[name="'  + name + '"]').not($(this)).prop('checked',false);   
            } else {
                cleanForm();
                enableFormButtons();
                if(rolRegistrar){
                    enableRegistrarButtons();
                }
            }
        });
        
    </script>
    <%--Validacion boton registrar--%>
    <%--<c:if test="${expedienteDependientesDTO.rolRegistrar && expedienteDependientesDTO.totalRegistrados == 0 && expedienteDependientesDTO.totalRechazados == 0}">--%>
    <c:if test="${expedienteDependientesDTO.rolRegistrar}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
</html:form>