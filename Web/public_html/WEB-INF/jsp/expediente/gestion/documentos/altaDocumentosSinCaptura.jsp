<%--@Descripcion: Vista encargada de registrar, editar, autorizar y/o recharzar documentos sin captura.--%>
<%--@Autor: Oscar S.|Roberto Muñoz--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 300px;
    }
</style>

<html:form modelAttribute="expedienteDocumentosSinCapturaDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>    
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.title"/></h1>
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
                                                <legend style="font-size:1.3em"><strong>Alta de documentos sin captura de datos</strong></legend><br/>
                                                <table width="100%">
                                                    <colgroup>
                                                        <col width="20%"/>
                                                        <col width="80%"/>
                                                    </colgroup>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.documento"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcTipoDoctosExpediente-altaDocumentosSinCaptura"
                                                                            path="documento"
                                                                            style="width:500px;"
                                                                            disabled="true"/>
                                                        </td>
                                                    </tr>
                                                   
                                                    <tr>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.descripcionDocumento"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcDescripcionAux-documentosSinDatos"
                                                                            path="dsdDescripDocto"
                                                                            parentPath="documento"
                                                                            progress="true"
                                                                            onchange="cambio();"
                                                                            style="width:500px;"/>
                                                        </td>
                                                    </tr>
                                                    
                                                    <tr>
                                                        <td class="label">  <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.descripcionDocumentoaux"></spring:message></td>
                                                        <td align="left" id="lista">
                                                            <html:select path="auxdsdDescripDoctoLista">
                                                                <html:option value="0" label="SELECCIONE..."/>
                                                                <option value="INICIAL">INICIAL</option>
                                                                <option value="ANUAL">ANUAL</option>
                                                                <option value="MODIFICACIÓN">MODIFICACION</option>
                                                                <option value="CONCLUSIÓN">CONCLUSION</option>
                                                            </html:select>
                                                        </td>
                                                        
                                                        <td align="left" id="texto" >
                                                            <fsn:input path="auxdsdDescripDoctoTexto"
                                                                       maxlength="30"
                                                                       size="35"/>
                                                        </td>
                                                    </tr>
                                                    
                                                    <tr>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.anioDocumento"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input  path="dsdAxoDocto"
                                                                        onkeypress="return IsNumber(event);"
                                                                        maxlength="4"
                                                                        size="6"/>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteDocumentosSinCapturaDTO.rolAutorizar || expedienteDocumentosSinCapturaDTO.rolRechazar) && (expedienteDocumentosSinCapturaDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.rechazo"></spring:message></td>
                                                            <td align="left">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaDocumentosSinCaptura"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    <tr align="center">
                                                        <td colspan="2">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.documentoSoporte"></spring:message></td>
                                                        <td align="left">
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
                                                                        action="gestionDocumentos/${expedienteDocumentosSinCapturaDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaDocumentosSinCaptura.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaDocumentosSinCaptura.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarDocumentosSinCaptura.do"
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de documentos sin captura de datos</strong></legend>
                                                <fsn:filter property="ED.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                <fsn:filter property="ED.ID_DOCTO" condition="=" path="documento" />
                                                <fsn:pagedList beanName="${expedienteDocumentosSinCapturaDTO.beanName}" 
                                                               baseUrl="${expedienteDocumentosSinCapturaDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteDocumentosSinCapturaDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            
                                                            <c:choose>
                                                                <c:when test="${ (row.idStatus == 'REG' && (expedienteDocumentosSinCapturaDTO.rolRegistrar || expedienteDocumentosSinCapturaDTO.rolAutorizar || expedienteDocumentosSinCapturaDTO.rolRechazar)) || (row.idStatus == 'REC' && expedienteDocumentosSinCapturaDTO.rolRegistrar) }">                                                                                  
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                        <input name="docGrupo" 
                                                                               class="box"
                                                                               type="checkbox" 
                                                                               value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.dsdSecuencia}|${row.dsdDoctoRef}"/>"/>
                                                                    </display:column>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.consulta.docGrupo" 
                                                                                    style="text-align: center;"> - </display:column>
                                                                </c:otherwise>
                                                            </c:choose>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.consulta.documento" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.dsdDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.consulta.id" 
                                                                            property="dsdSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.consulta.tipoDocto" 
                                                                            property="descDocto" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.descripcionDocumento" 
                                                                            property="dsdDescripDocto" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.anioDocumento" 
                                                                            property="dsdAxoDocto" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.consulta.estado" 
                                                                            property="desStatus" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.consulta.rechazo" 
                                                                            property="descRechazo" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDocumentosSinCaptura.consulta.fecModifico" 
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
            $j("#dsdDescripDocto").prop("disabled", true);
            $j("#auxdsdDescripDoctoLista").prop("disabled", true);            
            $j("#auxdsdDescripDoctoTexto").prop("disabled", true);
            $j("#dsdAxoDocto").prop("disabled", true);
            $j("#documentoSoporte").prop("disabled", true);
        }
        function enableFormButtons(){
            $j("#dsdDescripDocto").removeAttr('disabled');
            $j("#auxdsdDescripDoctoLista").removeAttr('disabled'); 
            $j("#auxdsdDescripDoctoTexto").removeAttr('disabled');
            $j("#dsdAxoDocto").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        
        function cleanForm(){
            $j("#dsdDescripDocto").val('');
            $j("#auxdsdDescripDoctoLista").val(''); 
            $j("#auxdsdDescripDoctoTexto").val('');
            $j("#dsdAxoDocto").val('');
            $j("#documentoSoporte").val('');
        }
        
        function IsNumber(e){
            var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
            return ((tecla > 47 && tecla < 58) || tecla == 46);
        }
        
        disableRegistrarButtons();
        disableAutorizarButtons();
        disableEliminarButtons();
    </script>
    
    <script type="text/javascript">
        var rolRegistrar = <c:out value="${expedienteDocumentosSinCapturaDTO.rolRegistrar}"/>;
        var rolAutorizar = <c:out value="${expedienteDocumentosSinCapturaDTO.rolAutorizar}"/>;
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
                var auxDescripcionpaso = $j(this).parent().next('td').next('td').next('td').next('td').text();
                var aux1 = auxDescripcionpaso.split("-");           
                var auxDescripcionDocumento = aux1[0];
                var auxDescripcionDocumento1 = aux1[1];
                
                $j("#auxdsdDescripDoctoTexto").val(auxDescripcionDocumento1);
                
                var auxAxoDocumento = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var pardoc = $j('select[id="documento"]').val() + '-' + aux1[0];
                
                getDescripDocto(pardoc);
                
                $j("#auxdsdDescripDocto").val(auxDescripcionDocumento1);                
                $j("#dsdAxoDocto").val(auxAxoDocumento);
                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
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
    <c:if test="${expedienteDocumentosSinCapturaDTO.rolRegistrar}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
    
    <script type="text/javascript">
        function getDescripDocto(pardoc){
            var idDocto = pardoc.split('-')[0];            
            $j.ajax({
                url: 'getDescripAuxDocto.do',
                type: 'GET',
                data: 'idDocto=' + idDocto,
                success: function(data) {
                    $j('select[id="dsdDescripDocto"]').find('option').remove().end();
                    $j('select[id="dsdDescripDocto"]').append(data);
                    $j("#dsdDescripDocto option[value='" + pardoc.split('-')[1] + "']").attr("selected","selected");
                }
            });
        }
    </script>
    
    <script type="text/javascript">
        function cambio(){
            if( $j("#dsdDescripDocto").val() == 'ACUSE DE DECLARACION DE SITUACION PATRIMONIAL Y DE INTERESES' ){
                $j("#texto").hide();
                $j("#lista").show();
            }
            else{
                $j("#texto").show();
                $j("#lista").hide();
                
            }
        }
    </script>
</html:form>