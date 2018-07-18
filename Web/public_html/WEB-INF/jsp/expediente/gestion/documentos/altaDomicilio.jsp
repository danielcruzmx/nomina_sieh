<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://ajaxtags.org/tags/ajax" prefix="ajax" %>

<style type="text/css">
    .anchoInput {
        width: 100px;
    }
    .anchoInputLarge {
        width: 200px;
    }
</style>
<c:url var="contextPath" value="/"/>
<fsn:action url="gestionDocumentos/altaDomicilio"/>
<html:form modelAttribute="expedienteDomicilioDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>    
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.title"/></h1>
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
                                                <legend style="font-size:1.3em"><strong>Alta de domicilio particular</strong></legend><br/>
                                                <table width="100%">
                                                    <tr align="left">
                                                        <td class="label">(**) *<spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.calle"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="calle"
                                                                       uppercase="true" 
                                                                       maxlength="80"
                                                                       size="250" 
                                                                       css="anchoInputLarge alphaNumericEspecialesEspacios"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.numExt"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="numExt"
                                                                       uppercase="true" 
                                                                       maxlength="20"
                                                                       size="20" 
                                                                       css="anchoInput alphaNumericEspacios"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.numInt"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="numInt"
                                                                       uppercase="true" 
                                                                       maxlength="20"
                                                                       size="20" 
                                                                       css="anchoInput alphaNumericEspacios"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">(**) *<spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.pais"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcPais-altaDomicilio"
                                                                            path="pais"
                                                                            style="width:200px;"
                                                                            onchange="getPais();"/>
                                                        </td>
                                                        <td class="label">*<spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.entidadFederativa"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcEstado-altaDomicilio"
                                                                            path="entidadFederativa"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.municipio"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcMunicipio-altaDomicilio"
                                                                            path="municipio"
                                                                            parentPath="entidadFederativa"
                                                                            progress="true"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.cp"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcCodigoPostal-altaDomicilio"
                                                                            path="cp"
                                                                            parentPath="municipio"
                                                                            filterPaths="entidadFederativa"
                                                                            progress="true"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.colonia"></spring:message></td>
                                                        <td align="left" colspan="3">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcCodigoPostal-colonia-altaDomicilio"
                                                                            path="colonia"
                                                                            parentPath="cp"
                                                                            progress="true"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteDomicilioDTO.rolAutorizar || expedienteDomicilioDTO.rolRechazar) && (expedienteDomicilioDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.rechazo"></spring:message></td>
                                                            <td align="left" colspan="3">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaDomicilio"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    <tr align="center">
                                                        <td colspan="6">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.documentoSoporte"></spring:message></td>
                                                        <td align="left" colspan="5">
                                                            <input type="file" name="documentoSoporte" id="documentoSoporte" value="*.*" size="50" class="anchoInputLarge"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                                <table width="100%">
                                                    <tr align="center">
                                                        <td>
                                                            <fsn:submit value="submit.save" 
                                                                        path="registrar"
                                                                        action="gestionDocumentos/${expedienteDomicilioDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaDomicilio.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaDomicilio.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarDomicilio.do"
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
                                                <spring:message code="sireh.form.required.fields"/><br/>** Nota: Si radica en el extranjero, capturar el domicilio completo en "Calle" y seleccionar el Pa&iacute;s.
                                            </strong>
                                        </td>
                                    </tr>
                                    <tr align="center">
                                        <td>&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>Antecedentes de domicilio particular</strong></legend>
                                                
                                                <fsn:filter property="ED.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                
                                                <fsn:pagedList beanName="${expedienteDomicilioDTO.beanName}" 
                                                               baseUrl="${expedienteDomicilioDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteDomicilioDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            
                                                            <c:choose>
                                                                <c:when test="${ (row.idStatus == 'REG' && (expedienteDomicilioDTO.rolRegistrar || expedienteDomicilioDTO.rolAutorizar || expedienteDomicilioDTO.rolRechazar)) || (row.idStatus == 'REC' && expedienteDomicilioDTO.rolRegistrar) }">
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                        <input name="docGrupo" 
                                                                               class="box"
                                                                               type="checkbox" 
                                                                               value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.domSecuencia}|${row.domDoctoRef}"/>"/>
                                                                    </display:column>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.docGrupo" 
                                                                                    style="text-align: center;"> - </display:column>
                                                                </c:otherwise>
                                                            </c:choose>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.documento" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.domDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.id" 
                                                                            property="domSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.calle" 
                                                                            property="domCalle" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.numExt" 
                                                                            property="domNumExt" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.numInt" 
                                                                            property="domNumInt" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.cp" 
                                                                            property="idCodPost" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.colonia" 
                                                                            property="domColonia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.pais" 
                                                                            property="descPais" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.entidadFederativa" 
                                                                            property="descEstado" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.municipio" 
                                                                            property="descMunicipio" 
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
            $j("#calle").prop("disabled", true);
            $j("#numExt").prop("disabled", true);
            $j("#numInt").prop("disabled", true);
            $j("#pais").prop("disabled", true);
            $j("#entidadFederativa").prop("disabled", true);
            $j("#municipio").prop("disabled", true);
            $j("#cp").prop("disabled", true);
            $j("#colonia").prop("disabled", true);
            $j("#documentoSoporte").prop("disabled", true);
        }
        function enableFormButtons(){
            $j("#calle").removeAttr('disabled');
            $j("#numExt").removeAttr('disabled');
            $j("#numInt").removeAttr('disabled');
            $j("#pais").removeAttr('disabled');
            $j("#entidadFederativa").removeAttr('disabled');
            $j("#municipio").removeAttr('disabled');
            $j("#cp").removeAttr('disabled');
            $j("#colonia").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        
        function cleanForm(){
            $j("#calle").val('');
            $j("#numExt").val('');
            $j("#numInt").val('');
            $j("#pais").val('');
            $j("#entidadFederativa").val('');
            $j("#municipio").val('');
            $j("#cp").val('');
            $j("#colonia").val('');
            $j("#documentoSoporte").val('');
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
    </script>
    
    <%--Recuperar fila selecccionada--%>
    <script type="text/javascript">
        var rolRegistrar = <c:out value="${expedienteDomicilioDTO.rolRegistrar}"/>;
        var rolAutorizar = <c:out value="${expedienteDomicilioDTO.rolAutorizar}"/>;
        $j('.box').change(function(){
            disableRegistrarButtons();
            disableAutorizarButtons();
            disableEliminarButtons();
            $j('.box:checked').each(function(){
                var auxDomCalle     = $j(this).parent().next('td').next('td').next('td').text();
                var auxDomNumExt    = $j(this).parent().next('td').next('td').next('td').next('td').text();
                var auxDomNumInt    = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxDomCp        = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxColonia      = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxPais         = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxEntidadFed   = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxDelegMuni    = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxEstatus      = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                
                var auxPais2        = auxPais.split(" - ");
                var auxEntidadFed2  = auxEntidadFed.split(" - ");
                var auxDelegMuni2   = auxDelegMuni.split(" - ");
                var auxColonia2     = auxColonia.split(" - ");
                
                $j("#calle").val(auxDomCalle);
                $j("#numExt").val(auxDomNumExt);
                $j("#numInt").val(auxDomNumInt);
                $j("#pais").val(auxPais2[0]);
                $j("#entidadFederativa").val(auxEntidadFed2[0]);
                $j("#municipio").val(auxDelegMuni2[0]);
                $j("#cp").val(auxDomCp);
                $j("#colonia").val(auxColonia2[1]);
                
                var emcc = auxEntidadFed2[0] + '-' + auxDelegMuni2[0] + '-' + auxDomCp + '-' + auxColonia2[1];
                // console.log("emcc: " + emcc);
                getMunicipio(emcc);
                //getMunicipio(auxDelegMuni2[0]);
                //getCp(auxDomCp);
                //getColonias(auxColonia2[0]);
                
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
        
        // Checkbox unico
        $j(':checkbox').on('change',function(){
            var th = $j(this), name = th.prop('name'); 
            if(th.is(':checked')){
                $j(':checkbox[name="'  + name + '"]').not($(this)).prop('checked',false);   
            } else {
                cleanForm();
            }
        });
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
    
    <%--Validacion boton registrar--%>
    <c:if test="${expedienteDomicilioDTO.rolRegistrar && expedienteDomicilioDTO.totalRegistrados == 0 && expedienteDomicilioDTO.totalRechazados == 0}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
    
    <script type="text/javascript">
        function getMunicipio(emcc){
            var entidadFederativa = $j('select[id="entidadFederativa"]').val();
            $j.ajax({
                url: 'getMunicipiosCallback.do',
                type: 'GET',
                data: 'entidadFederativa=' + entidadFederativa,
                success: function(data) {
                    $j('select[id="municipio"]').find('option').remove().end();
                    $j('select[id="municipio"]').append(data);
                    $j("#municipio option[value=" + emcc.split('-')[1] +"]").attr("selected","selected") ;
                }
            }); getCp(emcc);
        }
        
        function getCp(emcc){
            var vEntidadFederativa   = $j('select[id="entidadFederativa"]').val();
            var entidadMunicipio     =  vEntidadFederativa + '-' + emcc.split('-')[1];
            $j.ajax({
                url: 'getCpsCallback.do',
                type: 'GET',
                data: 'entidadMunicipio=' + entidadMunicipio,
                success: function(data) {
                    $j('select[id="cp"]').find('option').remove().end();
                    $j('select[id="cp"]').append(data);
                    $j("#cp option[value=" + emcc.split('-')[2] +"]").attr("selected","selected");
                }
            }); getColonias(emcc);
        }
        
        function getColonias(emcc){
            var codigoPostal = emcc.split('-')[2];
            $j.ajax({
                url: 'getColoniasCallback.do',
                type: 'GET',
                data: 'codigoPostal=' + codigoPostal,
                success: function(data) {
                    $j('select[id="colonia"]').find('option').remove().end();
                    $j('select[id="colonia"]').append(data);
                    $j("#colonia option[value='" + emcc.split('-')[3] + "']").attr("selected","selected");
                }
            });
        }
    </script>
</html:form>