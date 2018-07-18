<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    .anchoInputLarge {
        width: 330px;
    }
</style>
<html:form modelAttribute="expedienteExperienciaLaboralDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>    
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.title"/></h1>
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
                                    <strong><spring:message text="Experiencia"/></strong>
                                    <img class="fotografia" width="55" src="<spring:theme code="edificios.jpg"/>" align="middle"/>       
                                    <strong><spring:message text="Laboral"/></strong>
                                </legend>
                                <table width="100%">
                                    <tr>
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>Alta experiencia laboral</strong></legend><br/>
                                                <table width="100%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.sector"></spring:message></td>
                                                        <td align="left">
                                                            <table align="left" width="50%">
                                                                <tr>                        
                                                                    <td align="left">
                                                                        <html:radiobutton value="PUB" path="sector" label=" Publico"/>
                                                                    </td>
                                                                    <td align="left">
                                                                        <html:radiobutton value="PRV" path="sector" label=" Privado"/>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.pais"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcPais-altaExperienciaLaboral"
                                                                            path="pais"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.fecInicial"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:calendar path="fecInicial" readonly="true" size="10"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.fecFinal"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:calendar path="fecFinal" readonly="true" size="10"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.organizacion"></spring:message></td>
                                                        <td align="left" colspan="3">
                                                            <fsn:input path="organizacion"
                                                                       uppercase="true" 
                                                                       maxlength="40"
                                                                       size="60" 
                                                                       css="anchoInputLarge"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.puestoOcupado"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcNivelCargo-altaExperienciaLaboral"
                                                                            path="puestoOcupado"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.actividadPrincipal"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcActPrincipal-altaExperienciaLaboral"
                                                                            path="actividadPrincipal"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteExperienciaLaboralDTO.rolAutorizar) || (expedienteExperienciaLaboralDTO.rolRechazar) && (expedienteExperienciaLaboralDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.rechazo"></spring:message></td>
                                                            <td align="left" colspan="3">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaCurp"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    <tr align="center">
                                                        <td colspan="4">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.documentoSoporte"></spring:message></td>
                                                        <td align="left" colspan="3">
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
                                                                        action="gestionDocumentos/${expedienteExperienciaLaboralDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaExperienciaLaboral.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaExperienciaLaboral.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarExperienciaLaboral.do"
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de experiencia laboral</strong></legend>
                                                <fsn:filter property="el.rfc_empleado" condition="=" path="rfcEmpleadoBusqueda" />
                                                
                                                <fsn:pagedList beanName="${expedienteExperienciaLaboralDTO.beanName}" 
                                                               baseUrl="${expedienteExperienciaLaboralDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteExperienciaLaboralDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            <c:choose>
                                                                <c:when test="${ (row.idStatus == 'REG' && (expedienteExperienciaLaboralDTO.rolAutorizar || expedienteExperienciaLaboralDTO.rolRechazar || expedienteExperienciaLaboralDTO.rolRegistrar)) || (row.idStatus == 'REC' && expedienteExperienciaLaboralDTO.rolRegistrar)}">
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                        <input name="docGrupo" 
                                                                               class="box"
                                                                               type="checkbox" 
                                                                               value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.expSecuencia}|${row.expDoctoRef}"/>"/>
                                                                    </display:column>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.docGrupo" 
                                                                                    style="text-align: center;"> - </display:column>
                                                                </c:otherwise>
                                                            </c:choose>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.documento" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.expDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.id" 
                                                                            property="expSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.sector" 
                                                                            property="expSector" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.pais" 
                                                                            property="descPais" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.fecInicial" 
                                                                            property="expFecInicial" 
                                                                            sortable="false"
                                                                            style="text-align: center"
                                                                            format="{0,date,dd/MM/yyyy}"/>                                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.fecFinal" 
                                                                            property="expFecFinal" 
                                                                            sortable="false"
                                                                            style="text-align: center"
                                                                            format="{0,date,dd/MM/yyyy}"/>                                                                                                                                                        
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.organizacion" 
                                                                            property="expOrganizacion" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>                                                                                                                                                                                                                                    
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.puestoOcupado" 
                                                                            property="descNivelCargo" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaExperienciaLaboral.actividadPrincipal" 
                                                                            property="descActPrin" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>                                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.estado" 
                                                                            property="desStatus" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.rechazo" 
                                                                            property="descRechazo" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.fecModifico" 
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
            $j("#sector1").prop("disabled", true);
            $j("#sector2").prop("disabled", true);
            $j("#pais").prop("disabled", true);
            $j("#fecInicial").prop("disabled", true);
            $j("#fecFinal").prop("disabled", true);
            $j("#organizacion").prop("disabled", true);
            $j("#puestoOcupado").prop("disabled", true);
            $j("#actividadPrincipal").prop("disabled", true);
            $j("#documentoSoporte").prop("disabled", true);
        }
        function enableFormButtons(){
            $j("#sector1").removeAttr('disabled');
            $j("#sector2").removeAttr('disabled');
            $j("#pais").removeAttr('disabled');
            $j("#fecInicial").removeAttr('disabled');
            $j("#fecFinal").removeAttr('disabled');
            $j("#organizacion").removeAttr('disabled');
            $j("#puestoOcupado").removeAttr('disabled');
            $j("#actividadPrincipal").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        function cleanForm(){
            $j("#sector1").val('');
            $j("#sector2").val('');
            $j("#pais").val('');
            $j("#fecInicial").val('');
            $j("#text_fecInicial").val('');
            $j("#fecFinal").val('');
            $j("#text_fecFinal").val('');
            $j("#organizacion").val('');
            $j("#puestoOcupado").val('');
            $j("#actividadPrincipal").val('');
            $j("#documentoSoporte").val('');
        }
        disableRegistrarButtons();
        disableAutorizarButtons();
        disableEliminarButtons();
    </script>
    <script type="text/javascript">
        var rolRegistrar = <c:out value="${expedienteExperienciaLaboralDTO.rolRegistrar}"/>;
        var rolAutorizar = <c:out value="${expedienteExperienciaLaboralDTO.rolAutorizar}"/>;
        // Validaciones
        $j(document).ready(function(){
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.numeric').numeric();
            $j("#promedioEscolar").mask("99.99");
        });
        
        // Recuperar fila selecccionada
        $j('.box').change(function(){
        disableAutorizarButtons();
        disableEliminarButtons();
        $j('.box:checked').each(function(){
            var sector              = $j(this).parent().next('td').next('td').next('td').text();
            
            var pais                = $j(this).parent().next('td').next('td').next('td').next('td').text();
            var pais2               = pais.split(" - ");
            
            var fecInicial          = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
            var fecFinal            = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
            
            var organizacion        = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
            
            var puestoOcupado       = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
            var puestoOcupado2      = puestoOcupado.split(" - ");
            
            var actividadPrincipal  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
            var actividadPrincipal2 = actividadPrincipal.split(" - ");
            
            if (sector == 'PUB') {
                $j("#sector1").prop("checked", true);
                $j("#sector2").prop("checked", false);
            } else if(sector == 'PRV'){
                $j("#sector2").prop("checked", true);
                $j("#sector1").prop("checked", false);
            }    
            
            $j("#pais").val(pais2);
            $j("#fecInicial").val(fecInicial);
            $j("#text_fecInicial").val(fecInicial);
            $j("#text_fecFinal").val(fecFinal);
            $j("#fecFinal").val(fecFinal);
            $j("#organizacion").val(organizacion);
            $j("#puestoOcupado").val(puestoOcupado2);
            $j("#actividadPrincipal").val(actividadPrincipal2);
            
            // Rechazo
            var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
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

    // Pagedlist asincrono
    $j(function(){
        $j("#displayTagDiv").displayTagAjax();
    });
    </script>
    
    <%--Validacion boton registrar--%>
    <c:if test="${expedienteExperienciaLaboralDTO.rolRegistrar}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
</html:form>