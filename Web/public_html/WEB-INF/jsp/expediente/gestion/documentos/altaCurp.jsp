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
<html:form modelAttribute="expedienteCurpDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>    
    <html:hidden path="totalRechazados"/>
    <html:hidden path="rolRegistrar"/>
    <html:hidden path="rolAutorizar"/>
    <html:hidden path="rolRechazar"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.title"/></h1>
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
                                                <legend style="font-size:1.3em"><strong>Alta de clave &uacute;nica de registro de poblaci&oacute;n</strong></legend><br/>
                                                <table width="70%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.curp"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="curp"
                                                                       uppercase="true" 
                                                                       maxlength="18"
                                                                       size="18" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.folio"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="folio"
                                                                       uppercase="true" 
                                                                       maxlength="20"
                                                                       size="20" 
                                                                       css="anchoInput"/>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteCurpDTO.rolAutorizar || expedienteCurpDTO.rolRechazar) && (expedienteCurpDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.rechazo"></spring:message></td>
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
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.documentoSoporte"></spring:message></td>
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
                                                                        action="gestionDocumentos/${expedienteCurpDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaCurp.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 
                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaCurp.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.rechazar"/> &nbsp;
                                                            <fsn:submit value="submit.delete" 
                                                                        path="eliminar"
                                                                        action="gestionDocumentos/eliminarCurp.do"
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de clave &uacute;nica de registro de poblaci&oacute;n</strong></legend>
                                                
                                                <fsn:filter property="EC.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                
                                                <fsn:pagedList beanName="${expedienteCurpDTO.beanName}" 
                                                               baseUrl="${expedienteCurpDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteCurpDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row"
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">                                                                     
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                <c:choose>
                                                                    <c:when test="${ (row.idStatus == 'REG' && (expedienteCurpDTO.rolRegistrar || expedienteCurpDTO.rolAutorizar || expedienteCurpDTO.rolRechazar)) || (row.idStatus == 'REC' && expedienteCurpDTO.rolRegistrar) }">
                                                                            <input name="docGrupo" 
                                                                                   class="box"
                                                                                   type="checkbox" 
                                                                                   value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.curpSecuencia}|${row.curpDoctoRef}"/>"/>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                        - 
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.documento" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href='downloadFile.do?uuid=<c:out value="${row.curpDoctoRef}"/>' title="Descargar documento" target="_blank">
                                                                    <img src='<spring:theme code="pdf-download.jpg"/>' border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.id" 
                                                                            property="curpSecuencia"
                                                                            sortable="false" 
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.curpClave" 
                                                                            property="curpCve"
                                                                            sortable="false" 
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.curpFolio" 
                                                                            property="curpFolio"
                                                                            sortable="false" 
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.estado" 
                                                                            property="desStatus"
                                                                            sortable="false" 
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.rechazo" 
                                                                            property="descRechazo"
                                                                            sortable="false" 
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaCurp.consulta.fecModifico"
                                                                            property="fecModifico" 
                                                                            sortable="false" 
                                                                            style="text-align: center"
                                                                            format="{0,date,dd/MM/yyyy}"/>
                                                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                                                            <display:setProperty name="export.pdf" value="true"/>
                                                            <display:setProperty name="basic.msg.empty_list">
                                                                <br/><span class="pagebanner">&nbsp;</span>
                                                                <span class="norecords">
                                                                    <spring:message code="pagedList.empty.content"/>
                                                                    <br/>
                                                                    <br/>
                                                                </span>
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
            $j("#curp").prop('disabled', 'true');
            $j("#folio").prop('disabled', 'true');
            $j("#documentoSoporte").prop('disabled', 'true');
        }
        function enableFormButtons(){
            $j("#curp").removeAttr('disabled');
            $j("#folio").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        function cleanForm(){
            $j("#curp").val('');
            $j("#folio").val('');
            $j("#documentoSoporte").val('');
        }
        disableRegistrarButtons();
        disableAutorizarButtons();
        disableEliminarButtons();
    </script>
    
    
    <script type="text/javascript">
        $j(document).ready(function(){
            $j('#curp').mask('AAAAAAAAAAAAAAAAAA');
            $j('#folio').mask('AAAAAAAAAAAAAAAAAAAA');
        });

        var rolRegistrar = <c:out value="${expedienteCurpDTO.rolRegistrar}"/>;
        var rolAutorizar = <c:out value="${expedienteCurpDTO.rolAutorizar}"/>;
        $j('.box').change(function(){
            disableRegistrarButtons();
            disableAutorizarButtons();
            disableEliminarButtons();
            $j('.box:checked').each(function(){
                var auxCurpClave = $j(this).parent().next('td').next('td').next('td').text();
                var auxRcfFolio = $j(this).parent().next('td').next('td').next('td').next('td').text();
                
                $j("#curp").val(auxCurpClave);
                $j("#folio").val(auxRcfFolio);
                
                 // Rechazo
                var auxRechazo  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxRechazo2 = auxRechazo.split(" - ");
                $j("#rechazo").val(auxRechazo2);
                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
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
    <c:if test="${expedienteCurpDTO.rolRegistrar && expedienteCurpDTO.totalRegistrados == 0 && expedienteCurpDTO.totalRechazados == 0}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>

</html:form>