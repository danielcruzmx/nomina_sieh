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
        width: 400px;
    }
</style>
<html:form modelAttribute="expedienteCapacitacionCursosDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.title"/></h1>
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
                                    <strong><spring:message text="Capacitaci&oacute;n"/></strong>
                                    <img class="fotografia" width="55" src="<spring:theme code="capacitacion.jpg"/>" align="middle"/>       
                                    <strong><spring:message text="y Cursos"/></strong>
                                </legend>
                                <table width="100%">
                                    <tr>
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>Alta y/o modificaci&oacute;n de capacitaci&oacute;n y cursos</strong></legend><br/>
                                                <table width="100%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.nivelCapacitacion"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcNivelEscolar-altaCapacitacionCursos"
                                                                            path="nivelCapacitacion"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.descCapacitacion"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="descCapacitacion"
                                                                       uppercase="true" 
                                                                       maxlength="100"
                                                                       size="60" 
                                                                       css="anchoInputLarge"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.instEducat"></spring:message></td>
                                                        <td align="left" colspan="3">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcInstEducat-altaCapacitacionCursos"
                                                                            path="instEducat"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.promedioFinal"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="promedioFinal"
                                                                       uppercase="true" 
                                                                       maxlength="8"
                                                                       size="60"
                                                                       css="anchoInput"/>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.estudiosConcluidos"></spring:message></td>
                                                        <td align="left">
                                                            <table align="left" width="30%">
                                                                <tr>                        
                                                                    <td align="left">
                                                                        <html:radiobutton value="S" path="estudiosConcluidos" label=" SI"/>
                                                                    </td>
                                                                    <td align="left">
                                                                        <html:radiobutton value="N" path="estudiosConcluidos" label=" NO"/>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteCapacitacionCursosDTO.rolAutorizar || expedienteCapacitacionCursosDTO.rolRechazar) && (expedienteCapacitacionCursosDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.rechazo"></spring:message></td>
                                                            <td align="left" colspan="3">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaCapacitacionCursos"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    <tr align="center">
                                                        <td colspan="4">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.documentoSoporte"></spring:message></td>
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
                                                                            action="gestionDocumentos/${expedienteCapacitacionCursosDTO.urlDestino}"
                                                                            progressBar="true"
                                                                            alertCode="confirm.expediente.alta.guardar" /> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                            path="autorizar"
                                                                            action="gestionDocumentos/autorizaAltaCapacitacionCursos.do"
                                                                            progressBar="true"
                                                                            alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                            path="rechazar"
                                                                            action="gestionDocumentos/rechazaAltaCapacitacionCursos.do"
                                                                            progressBar="true"
                                                                            alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarCapacitacionCursos.do"
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de capacitaci&oacute;n y cursos</strong></legend>
                                                <fsn:filter property="ED.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                
                                                <fsn:pagedList beanName="${expedienteCapacitacionCursosDTO.beanName}" 
                                                               baseUrl="${expedienteCapacitacionCursosDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteCapacitacionCursosDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            
                                                            <c:choose>
                                                                <c:when test="${ (row.idStatus == 'REG' && (expedienteCapacitacionCursosDTO.rolAutorizar || expedienteCapacitacionCursosDTO.rolRechazar || expedienteCapacitacionCursosDTO.rolRegistrar)) || (row.idStatus == 'REC' && expedienteCapacitacionCursosDTO.rolRegistrar) }">
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDomicilio.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                        <input name="docGrupo" 
                                                                               class="box"
                                                                               type="checkbox" 
                                                                               value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.capSecuencia}|${row.capDoctoRef}"/>"/>
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
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.capDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.id" 
                                                                            property="capSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>                                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.NivCap" 
                                                                            property="nivelCapacitacion" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.DescCap" 
                                                                            property="descCapacitacion" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.IdInstEduc" 
                                                                            property="descInstEducat" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                             <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.CapPromedio" 
                                                                            property="capPromedio" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                             <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCapacitacionCursos.CapEstCon" 
                                                                            property="capEstConcluidos" 
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
            $j("#nivelCapacitacion").prop("disabled", true);
            $j("#descCapacitacion").prop("disabled", true);
            $j("#instEducat").prop("disabled", true);
            $j("#promedioFinal").prop("disabled", true);
            $j("#estudiosConcluidos").prop("disabled", true);
            $j("#documentoSoporte").prop("disabled", true);
        }
        function enableFormButtons(){
            $j("#nivelCapacitacion").removeAttr('disabled');
            $j("#descCapacitacion").removeAttr('disabled');
            $j("#instEducat").removeAttr('disabled');
            $j("#promedioFinal").removeAttr('disabled');
            $j("#estudiosConcluidos").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        
        function cleanForm(){
            $j("#nivelCapacitacion").val('');
            $j("#descCapacitacion").val('');
            $j("#instEducat").val('');
            $j("#promedioFinal").val('');
            $j("#estudiosConcluidos").val('');
            $j("#documentoSoporte").val('');
            $j("#estudiosConcluidos1").prop("checked", false);
            $j("#estudiosConcluidos2").prop("checked", false);
        }
        disableRegistrarButtons();
        disableAutorizarButtons();
        disableEliminarButtons();
    </script>
    <script type="text/javascript">
        var rolRegistrar = <c:out value="${expedienteCapacitacionCursosDTO.rolRegistrar}"/>;
        var rolAutorizar = <c:out value="${expedienteCapacitacionCursosDTO.rolAutorizar}"/>;
        // Validaciones
        $j(document).ready(function(){
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.numeric').numeric();
            $j("#promedioFinal").mask("999.99");
        });
        
        // Recuperar fila selecccionada
        $j('.box').change(function(){
            disableAutorizarButtons();
            disableEliminarButtons();
            $j('.box:checked').each(function(){
                var auxNivelCapacitacion    = $j(this).parent().next('td').next('td').next('td').text();
                var auxNivelCapacitacion2   = auxNivelCapacitacion.split(" - ");                
                
                var auxCarrera              = $j(this).parent().next('td').next('td').next('td').next('td').text();
                
                var auxInstEducat           = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxInstEducat2          = auxInstEducat.split(" - ");
                
                var auxPromedioFinal        = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxEstudiosConcluidos   = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                
                if (auxEstudiosConcluidos == 'S') {
                    $j("#estudiosConcluidos1").prop("checked", true);
                    $j("#estudiosConcluidos2").prop("checked", false);
                } else if (auxEstudiosConcluidos == 'N') {
                    $j("#estudiosConcluidos2").prop("checked", true);
                    $j("#estudiosConcluidos1").prop("checked", false);
                }
                
                $j("#nivelCapacitacion").val(auxNivelCapacitacion2);
                $j("#descCapacitacion").val(auxCarrera);
                $j("#instEducat").val(auxInstEducat2);
                $j("#promedioFinal").val(auxPromedioFinal);
                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
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
    <c:if test="${expedienteCapacitacionCursosDTO.rolRegistrar}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
</html:form>