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
<html:form modelAttribute="expedienteCuentasBancariasDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>    
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.title"/></h1>
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
                                                <legend style="font-size:1.3em"><strong>Alta de cuentas bancarias</strong></legend><br/>
                                                <table width="85%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.tipoCta"></spring:message></td>
                                                        <td align="left">
                                                            <table align="left" width="50%">
                                                                <tr>                        
                                                                    <td align="center">
                                                                        <html:radiobutton value="NOM" path="tipoCta" label=" Nomina"/>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.banco"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcBanco-altaCuentasBancarias"
                                                                            path="banco"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.numCta"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="numCta"
                                                                       uppercase="true" 
                                                                       maxlength="20"
                                                                       size="60" 
                                                                       css="anchoInput numeric"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.clabe"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="clabe"
                                                                       uppercase="true" 
                                                                       maxlength="18"
                                                                       size="60" 
                                                                       css="anchoInput numeric"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="center">
                                                        <td colspan="4">&nbsp;</td>
                                                    </tr>
                                                    <c:if test="${(expedienteCuentasBancariasDTO.rolAutorizar || expedienteCuentasBancariasDTO.rolRechazar) && (expedienteCuentasBancariasDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.rechazo"></spring:message></td>
                                                            <td align="left" colspan="3">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaCuentasBancarias"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.documentoSoporte"></spring:message></td>
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
                                                                        action="gestionDocumentos/${expedienteCuentasBancariasDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp;
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaCuentasBancarias.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaCuentasBancarias.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarCuentasBancarias.do"
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de cuentas bancarias</strong></legend>                                            
                                                    <fsn:filter property="ER.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                    
                                                    <fsn:pagedList beanName="${expedienteCuentasBancariasDTO.beanName}" 
                                                                   baseUrl="${expedienteCuentasBancariasDTO.urlOrigen}" 
                                                                   maxRows="200" 
                                                                   appendFilters="false">
                                                        <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                            <display:table name="${expedienteCuentasBancariasDTO.beanName}" 
                                                                           class="displaytag" 
                                                                           pagesize="200" 
                                                                           export="true" 
                                                                           id="row" 
                                                                           requestURI="${requestURI}" 
                                                                           sort="list">
                                                                <c:choose>
																	<c:when test="${ (row.idStatus == 'REG' && (expedienteCuentasBancariasDTO.rolRegistrar || expedienteCuentasBancariasDTO.rolAutorizar || expedienteCuentasBancariasDTO.rolRechazar)) || (row.idStatus == 'REC' && expedienteCuentasBancariasDTO.rolRegistrar) }">
                                                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.docGrupo" 
                                                                                        style="text-align: center;">
                                                                            <input name="docGrupo" 
                                                                                   class="box"
                                                                                   type="checkbox" 
                                                                                   value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.ctaSecuencia}|${row.ctaDoctoRef}"/>"/>
                                                                        </display:column>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.docGrupo" 
                                                                                        style="text-align: center;"> - </display:column>
                                                                    </c:otherwise>
                                                                </c:choose>

                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.documento" 
                                                                                sortable="false"
                                                                                style="text-align: center">
                                                                    <a href="downloadFile.do?uuid=<c:out value="${row.ctaDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                        <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                    </a>
                                                                </display:column>



                                                                
                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.ctaSecuencia" 
                                                                                property="cta_secuencia" 
                                                                                sortable="false"
                                                                                style="text-align: center"/>
                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.rfc" 
                                                                                property="rfc_empleado" 
                                                                                sortable="false"
                                                                                style="text-align: center"/>
                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.tipCuenta" 
                                                                                property="CTA_TIPO" 
                                                                                sortable="false"
                                                                                style="text-align: center"/>
                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.idBancaria" 
                                                                                property="DESC_BANCO" 
                                                                                sortable="false"
                                                                                style="text-align: center"/>
                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.numCuenta" 
                                                                                property="CTA_NUMERO" 
                                                                                sortable="false"
                                                                                style="text-align: center"/>
                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.numClabe" 
                                                                                property="CTA_CLABE" 
                                                                                sortable="false"
                                                                                style="text-align: center"/>
                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.descRechazo" 
                                                                                property="DESC_RECHAZO" 
                                                                                sortable="false"
                                                                                style="text-align: center"/>                                                                           
                                                                 <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.descEstatus" 
                                                                                property="DES_STATUS" 
                                                                                sortable="false"
                                                                                style="text-align: center"/>                                                                                
                                                                <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCuentasBancarias.consulta.fecModifico" 
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
                                                <div style="width:900px;height:350px;overflow:auto;"></div>
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
            $j("#tipoCta1").prop("disabled", true);
            $j("#banco").prop("disabled", true);
            $j("#numCta").prop("disabled", true);
            $j("#clabe").prop("disabled", true);
            $j("#tipoCta").prop("disabled", true);
            $j("#documentoSoporte").prop("disabled", true);
        }
        function enableFormButtons(){
            $j("#tipoCta1").removeAttr('disabled');
            $j("#banco").removeAttr('disabled');
            $j("#numCta").removeAttr('disabled');
            $j("#clabe").removeAttr('disabled');
            $j("#tipoCta").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        function cleanForm(){
            $j("#banco").val('');
            $j("#tipoCta").val(false);
            $j("#tipoCta1").attr('checked', false);
            $j("#numCta").val('');
            $j("#clabe").val('');
            $j("#tipoCta").val('');
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
        
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
    <script type="text/javascript">
        // Recuperar fila selecccionada
        $j('.box').change(function(){
            var rolRegistrar = <c:out value="${expedienteCuentasBancariasDTO.rolRegistrar}"/>;
            var rolAutorizar = <c:out value="${expedienteCuentasBancariasDTO.rolAutorizar}"/>;
                disableRegistrarButtons();
                disableAutorizarButtons();
                disableEliminarButtons();
            $j('.box:checked').each(function(){
                var auxBanco    = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxBanco2   = auxBanco.split(" - ");
                
                var auxNumCta   = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxClabe    = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxTipoCta  = $j(this).parent().next('td').next('td').next('td').next('td').text();
                
                if (auxTipoCta == 'NOM') {
                    $j("#tipoCta1").prop("checked", true);    
                } else {
                    $j("#tipoCta1").prop("checked", false);
                }
                
                $j("#banco").val(auxBanco2);
                $j("#numCta").val(auxNumCta);
                $j("#clabe").val(auxClabe);
                
                var auxRechazo  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxRechazo2 = auxRechazo.split(" - ");
                $j("#rechazo").val(auxRechazo2);
                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                if (auxEstatus == 'RECHAZADO' || auxEstatus == 'ACTIVO') {
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
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
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
        
    </script> 
    <%--Validacion boton registrar--%>
    <c:if test="${expedienteCuentasBancariasDTO.rolRegistrar && expedienteCuentasBancariasDTO.totalRegistrados == 0 && expedienteCuentasBancariasDTO.totalRechazados == 0}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
</html:form>