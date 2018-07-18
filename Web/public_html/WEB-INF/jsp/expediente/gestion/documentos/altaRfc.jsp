<%--@Descripcion: Vista encargada de registrar, editar, autorizar y/o recharzar documentos relacionados con el RFC.--%>
<%--@Autor: Oscar S.--%>

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
<html:form modelAttribute="expedienteRfcDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>    
    <html:hidden path="totalRechazados"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.title"/></h1>
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
                                                <legend style="font-size:1.3em"><strong>Alta de registro federal de contribuyentes</strong></legend><br/>
                                                <table width="80%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.rfc"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="rfc"
                                                                       uppercase="true" 
                                                                       maxlength="13"
                                                                       size="60" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.folio"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="folio"
                                                                       uppercase="true" 
                                                                       maxlength="20"
                                                                       size="60" 
                                                                       css="anchoInput alphaNumericEspacios"/>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteRfcDTO.autorizar || expedienteRfcDTO.rechazar) && (expedienteRfcDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.rechazo"></spring:message></td>
                                                            <td align="left" colspan="3">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaRFC"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    <tr align="center">
                                                        <td colspan="4">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.documentoSoporte"></spring:message></td>
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
                                                                        action="gestionDocumentos/${expedienteRfcDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaRfc.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaRfc.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de registro federal de contribuyentes</strong></legend>
                                                
                                                <fsn:filter property="ER.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                
                                                <fsn:pagedList beanName="${expedienteRfcDTO.beanName}" 
                                                               baseUrl="${expedienteRfcDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteRfcDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            <c:choose>
                                                                <c:when test="${ ((row.idStatus == 'REG') && (expedienteRfcDTO.autorizar || expedienteRfcDTO.rechazar)) ||
                                                                                  (row.idStatus == 'REC' && expedienteRfcDTO.registrar) }">
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                        <input name="docGrupo" 
                                                                               class="box"
                                                                               type="checkbox" 
                                                                               value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.rfcSecuencia}|${row.rfcDoctoRef}"/>"/>
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
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.rfcDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.id" 
                                                                            property="rfcSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.rfcClave" 
                                                                            property="rfcClave" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaRFC.consulta.rfcFolio" 
                                                                            property="rfcFolio" 
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
        
        function disableFormButtons(){
            $j("#rfc").prop("disabled", true);
            $j("#folio").prop("disabled", true);
            $j("#documentoSoporte").prop("disabled", true);
        }
        function enableFormButtons(){
            $j("#rfc").removeAttr('disabled');
            $j("#folio").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        function cleanForm(){
            $j("#rfc").val('');
            $j("#folio").val('');
            $j("#documentoSoporte").val('');
        }
        disableRegistrarButtons();
        disableAutorizarButtons();
    </script>
    
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('#rfc').mask('AAAAAAAAAAAAA');
            $j('.alphaNumericEspacios').alphanumeric({allow:"-/ *_"});
        });
        
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
    </script>
    
    <%--Recuperar fila selecccionada--%>
    <script type="text/javascript">
        var registrar = <c:out value="${expedienteRfcDTO.registrar}"/>;        
        $j('.box').change(function(){
                disableRegistrarButtons();
                disableAutorizarButtons();
            $j('.box:checked').each(function(){
                var auxRcfClave = $j(this).parent().next('td').next('td').next('td').text();
                var auxRcfFolio = $j(this).parent().next('td').next('td').next('td').next('td').text();
                
                $j("#rfc").val(auxRcfClave);
                $j("#folio").val(auxRcfFolio);
                
                // Rechazo
                var auxRechazo  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxRechazo2 = auxRechazo.split(" - ");
                $j("#rechazo").val(auxRechazo2);
                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                if (auxEstatus == 'RECHAZADO') {
                    if(registrar){
                        enableRegistrarButtons();
                    }
                    disableAutorizarButtons();
                    enableFormButtons();
                }
                if (auxEstatus == 'REGISTRO') {
                    enableAutorizarButtons();
                    disableRegistrarButtons();
                    disableFormButtons();
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
            if(registrar){
                enableRegistrarButtons();
            }
        }
    });
    </script>
    
    <%--Validacion boton registrar--%>
    <c:if test="${expedienteRfcDTO.registrar && expedienteRfcDTO.totalRegistrados == 0 && expedienteRfcDTO.totalRechazados == 0}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>

</html:form>