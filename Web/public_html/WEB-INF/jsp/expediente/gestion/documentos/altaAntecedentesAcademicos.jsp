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
<html:form modelAttribute="expedienteDatosAcademicosDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.title"/></h1>
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
                                    <strong><spring:message text="Antecedentes"/></strong>
                                    <img class="fotografia" width="55" src="<spring:theme code="titulado.jpg"/>" align="middle"/>       
                                    <strong><spring:message text="acedemicos"/></strong>
                                </legend>
                                <table width="100%">
                                    <tr>
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>Alta y/o modificaci&oacute;n de datos acad&eacute;micos</strong></legend><br/>
                                                <table width="100%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.nivelEscolar"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcNivelEscolar-busquedaDocEmpleado"
                                                                            path="nivelEscolar"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.carrera"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcProfnCarrera-busquedaDocEmpleado"
                                                                            path="carrera"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.instEducat"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcInstEducat-busquedaDocEmpleado"
                                                                            path="instEducat"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.estudiosConcluidos"></spring:message></td>
                                                        <td align="left">
                                                            <table align="left" width="50%">
                                                                <tr>                        
                                                                    <td align="center">
                                                                        <html:radiobutton value="S" path="estudiosConcluidos" label=" SI"/>
                                                                    </td>
                                                                    <td align="center">
                                                                        <html:radiobutton value="N" path="estudiosConcluidos" label=" NO"/>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.promedioEscolar"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="promedioEscolar"
                                                                       uppercase="true" 
                                                                       maxlength="8"
                                                                       size="60" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.cedulaProfesional"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="cedulaProfesional"
                                                                       uppercase="true" 
                                                                       maxlength="9"
                                                                       size="60" 
                                                                       css="anchoInput numeric"/>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteDatosAcademicosDTO.rolAutorizar || expedienteDatosAcademicosDTO.rolRechazar) && (expedienteDatosAcademicosDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.rechazo"></spring:message></td>
                                                            <td align="left" colspan="3">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaCurp"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    <tr align="center">
                                                        <td colspan="6">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.documentoSoporte"></spring:message></td>
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
                                                                        action="gestionDocumentos/${expedienteDatosAcademicosDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaAntecedentesAcademicos.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaAntecedentesAcademicos.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarAntecedentesAcademicos.do"
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de datos acad&eacute;micos</strong></legend>
                                                <fsn:filter property="aa.rfc_empleado" condition="=" path="rfcEmpleadoBusqueda" />
                                                <fsn:pagedList beanName="${expedienteDatosAcademicosDTO.beanName}" 
                                                               baseUrl="${expedienteDatosAcademicosDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteDatosAcademicosDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                <c:choose>
                                                                    <c:when test="${ (row.idStatus == 'REG' && (expedienteDatosAcademicosDTO.rolAutorizar || expedienteDatosAcademicosDTO.rolRechazar || expedienteDatosAcademicosDTO.rolRegistrar)) || 
                                                                    (row.idStatus == 'REC' && expedienteDatosAcademicosDTO.rolRegistrar)}">
                                                                            <input name="docGrupo" 
                                                                                   class="box"
                                                                                   type="checkbox" 
                                                                                   value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.aacSecuencia}|${row.aacDoctoRef}"/>"/>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                         - 
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.documentoSoporte" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.aacDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.id" 
                                                                            property="aacSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.nivelEscolar" 
                                                                            property="descNivelEscolar" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.carrera" 
                                                                            property="descProfnCarrera" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.estudiosConcluidos" 
                                                                            property="aacEstConcluidos" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.instEducat" 
                                                                            property="descInstEducat" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.promedioEscolar" 
                                                                            property="aacPromedio" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>                                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.cedulaProfesional" 
                                                                            property="aacCedProfesional" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>                                                                           
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDatosAcademicos.idStatus" 
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
            $j("#nivelEscolar").prop('disabled', 'true');
            $j("#carrera").prop('disabled', 'true');
            $j("#instEducat").prop('disabled', 'true');
            $j("#estudiosConcluidos1").prop('disabled', 'true');
            $j("#estudiosConcluidos2").prop('disabled', 'true');
            $j("#promedioEscolar").prop('disabled', 'true');
            $j("#cedulaProfesional").prop('disabled', 'true');
            $j("#documentoSoporte").prop('disabled', 'true');
            
        }
        function enableFormButtons(){
            $j("#nivelEscolar").removeAttr('disabled');
            $j("#carrera").removeAttr('disabled');
            $j("#instEducat").removeAttr('disabled');
            $j("#estudiosConcluidos1").removeAttr('disabled');
            $j("#estudiosConcluidos2").removeAttr('disabled');
            $j("#promedioEscolar").removeAttr('disabled');
            $j("#cedulaProfesional").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        
        function cleanForm(){
            $j("#nivelEscolar").val('');
            $j("#carrera").val('');
            $j("#instEducat").val('');
            $j("#estudiosConcluidos").val('');
            $j("input[type=radio]").val('');
            
            $j("#text_estudiosConcluidos1").val('');
            $j("#estudiosConcluidos").val('');
            $j("#estudiosConcluidos1").attr('checked', false);
            $j("#estudiosConcluidos2").attr('checked', false);
            
            $j("#promedioEscolar").val('');
            $j("#cedulaProfesional").val('');
            $j("#documentoSoporte").val('');
        }
        
        disableRegistrarButtons();
        disableAutorizarButtons();    
        disableEliminarButtons();
    </script>

    
    <script type="text/javascript">
        var rolRegistrar = <c:out value="${expedienteDatosAcademicosDTO.rolRegistrar}"/>;
        var rolAutorizar = <c:out value="${expedienteDatosAcademicosDTO.rolAutorizar}"/>;
        // Validaciones
        $j(document).ready(function(){
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.numeric').numeric();
            $j("#promedioEscolar").mask("999.99");
        });
        
        
        
        
        // Recuperar fila selecccionada
        $j('.box').change(function(){
            disableRegistrarButtons();
            disableAutorizarButtons();
            disableEliminarButtons();
            $j('.box:checked').each(function(){
                var auxNivelEscolar         =   $j(this).parent().next('td').next('td').next('td').text();
                var auxNivelEscolar2        =   auxNivelEscolar.split(" - ");
                
                var auxCarrera              =   $j(this).parent().next('td').next('td').next('td').next('td').text();
                var auxCarrera2             =   auxCarrera.split(" - ");
                
                var auxEstudiosConcluidos   =   $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                
                var auxInstEducat           =   $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxInstEducat2          =   auxInstEducat.split(" - ");
                
                var auxPromedioEscolar      =   $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxCedulaProfesional    =   $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                
                if (auxEstudiosConcluidos == 'S') {
                    $j("#estudiosConcluidos1").attr('checked', 'checked');  
                } else if(auxEstudiosConcluidos == 'N') {   
                    $j("#estudiosConcluidos2").attr('checked', 'checked');
                }
                
                $j("#nivelEscolar").val(auxNivelEscolar2);
                $j("#carrera").val(auxCarrera2);
                $j("#instEducat").val(auxInstEducat2);
                $j("#promedioEscolar").val(auxPromedioEscolar);
                $j("#cedulaProfesional").val(auxCedulaProfesional);
                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
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
    <c:if test="${expedienteDatosAcademicosDTO.rolRegistrar}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
    

</html:form>