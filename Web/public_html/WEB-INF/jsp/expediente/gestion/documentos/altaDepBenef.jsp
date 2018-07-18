<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    .anchoInputSmall {
        width: 100px;
    }
</style>
<html:form modelAttribute="expedienteDepBenefDTO" enctype="multipart/form-data">
    
    <html:hidden path="beanName1"/>
    <html:hidden path="beanName2"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="totalRegistrados"/>
    <html:hidden path="totalRechazados"/>
    <html:hidden path="estado"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.title"/></h1>
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
                                    <strong><spring:message text="Familiares y/o"/></strong>
                                    <img class="fotografia" width="55" src="<spring:theme code="familia.jpg"/>" align="middle"/>       
                                    <strong><spring:message text="Dependientes"/></strong>
                                </legend>
                                <table width="100%">
                                    <tr>
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>B&uacute;squeda de familiares, dependientes o beneficiarios</strong></legend><br/>
                                                
                                                <fsn:filter property="EF.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                
                                                <fsn:pagedList beanName="${expedienteDepBenefDTO.beanName1}" 
                                                               baseUrl="${expedienteDepBenefDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;overflow:auto;">
                                                        <display:table name="${expedienteDepBenefDTO.beanName1}" 
                                                                       class="displaytag" 
                                                                       pagesize="10" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            <c:choose>
                                                                <c:when test="${(row.idStatus == 'ACT' || row.idStatus == 'REG') && expedienteDepBenefDTO.registrar}">
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta1.docGrupo" 
                                                                                    style="text-align: center;">
                                                                        <input name="docGrupo1" 
                                                                               class="box2"
                                                                               type="checkbox" 
                                                                               value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.fdbSecuencia}|${row.fdbDoctoRef}"/>"/>
                                                                    </display:column>
                                                                </c:when>
                                                                <c:otherwise>
                                                                    <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta1.docGrupo" 
                                                                                    style="text-align: center;">
                                                                        - 
                                                                    </display:column>
                                                                </c:otherwise>
                                                            </c:choose>
                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta1.id" 
                                                                            property="fdbSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta1.nombreEmpleado" 
                                                                            property="nombreEmpleado" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta1.primerApellido" 
                                                                            property="primerApellido" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta1.segundoApellido" 
                                                                            property="segundoApellido" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta1.parentesco" 
                                                                            property="descParentesco" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                        </display:table>
                                                    </div>
                                                </fsn:pagedList>
                                            </fieldset>
                                        </td>
                                    </tr>
                                    <tr align="center">
                                        <td>&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>Alta y/o modificaci&oacute;n de designaci&oacute;n de beneficiarios</strong></legend><br/>
                                                <table width="100%">
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.tipoBeneficiario"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcTipoBeneficio-altaDepBenef"
                                                                            path="tipoBeneficiario"
                                                                            style="width:200px;"/>
                                                        </td>
                                                        <td class="label">  <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.porcentaje"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="porcentaje"
                                                                       uppercase="true" 
                                                                       maxlength="6"
                                                                       size="60" 
                                                                       css="anchoInputSmall"
                                                                       onblur="getPorcentaje();"/>
                                                        </td>
                                                        <td class="label">  <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.importe"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="importe"
                                                                       uppercase="true" 
                                                                       maxlength="12"
                                                                       size="60" 
                                                                       css="anchoInputSmall numeric"
                                                                       onblur="getImporte();"/>
                                                        </td>
                                                    </tr>
                                                    <c:if test="${(expedienteDepBenefDTO.autorizar || expedienteDepBenefDTO.rechazar) && (expedienteDepBenefDTO.totalRegistrados > 0)}">
                                                        <tr align="left">
                                                            <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.rechazo"></spring:message></td>
                                                            <td align="left">
                                                                <fsn:option key="" value="selectList.nonValue"/>
                                                                <fsn:selectList beanName="tcExpRechazo-altaDepBenef"
                                                                                path="rechazo"
                                                                                style="width:200px;"/>
                                                            </td>
                                                            
                                                        </tr>
                                                    </c:if>
                                                    <tr align="center">
                                                        <td colspan="6">&nbsp;</td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.documentoSoporte"></spring:message></td>
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
                                                                        action="gestionDocumentos/${expedienteDepBenefDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 

                                                            <fsn:submit value="submit.autorizar" 
                                                                        path="autorizar"
                                                                        action="gestionDocumentos/autorizaAltaDepBenef.do"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.autorizar"/> &nbsp; 

                                                            <fsn:submit value="submit.rechazar" 
                                                                        path="rechazar"
                                                                        action="gestionDocumentos/rechazaAltaDepBenef.do"
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
                                                <legend style="font-size:1.3em"><strong>Antecedentes de designaci&oacute;n de beneficiarios</strong></legend>                            
                                                        
                                                <fsn:filter property="EB.RFC_EMPLEADO" condition="=" path="rfcEmpleadoBusqueda" />
                                                <fsn:pagedList beanName="${expedienteDepBenefDTO.beanName2}" 
                                                               baseUrl="${expedienteDepBenefDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv2" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteDepBenefDTO.beanName2}" 
                                                                       class="displaytag" 
                                                                       pagesize="200" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.docGrupo" 
                                                                                    style="text-align: center;">
                                                                <c:choose>
                                                                    <c:when test="${ ((row.idStatus == 'REG') && (expedienteDepBenefDTO.autorizar || expedienteDepBenefDTO.rechazar)) ||
                                                                                      (row.idStatus == 'REC' && expedienteDepBenefDTO.registrar) }">
                                                                            <input name="docGrupo2" 
                                                                                   class="box"
                                                                                   type="checkbox" 
                                                                                   value="<c:out value="${row.rfcEmpleado}|${row.idDocto}|${row.benSecuencia}|${row.benDoctoRef}|${row.benNombreEmpleado}|${row.benPrimerApellido}|${row.benSegundoApellido}|${row.idParentesco}"/>"/>
                                                                    </c:when>
                                                                    <c:otherwise>
                                                                            - 
                                                                    </c:otherwise>
                                                                </c:choose>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.documento" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.benDoctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.id" 
                                                                            property="benSecuencia" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.nombreBeneficiario" 
                                                                            property="nombreBeneficiario" 
                                                                            sortable="false"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.parentesco" 
                                                                            property="descParentesco" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.tipoBeneficiario" 
                                                                            property="descBeneficio" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.porcentaje" 
                                                                            property="benPorcentaje" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.importe" 
                                                                            property="benImporte" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.estado" 
                                                                            property="desStatus" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.rechazo" 
                                                                            property="descRechazo" 
                                                                            sortable="false"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.altaDepBenef.consulta.fecModifico" 
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
        
        function disableFormButtons(){
            $j("#tipoBeneficiario").prop('disabled', 'true');
            $j("#porcentaje").prop('disabled', 'true');
            $j("#importe").prop('disabled', 'true');
            $j("#documentoSoporte").prop('disabled', 'true');
        }
        function enableFormButtons(){
            $j("#tipoBeneficiario").removeAttr('disabled');
            $j("#porcentaje").removeAttr('disabled');
            $j("#importe").removeAttr('disabled');
            $j("#documentoSoporte").removeAttr('disabled');
        }
        
        function cleanForm(){
            $j("#tipoBeneficiario").val('');
            $j("#porcentaje").val('');
            $j("#importe").val('');
            $j("#documentoSoporte").val('');
            $j("#rechazo").val('');
        }
        
        disableRegistrarButtons();
        disableAutorizarButtons();    
    </script>

    
    <script type="text/javascript">
        var registrar = <c:out value="${expedienteDepBenefDTO.registrar}"/>;
        var autorizar = <c:out value="${expedienteDepBenefDTO.autorizar}"/>;
        // Validaciones
        $j(document).ready(function(){
            //$j('.numeric').numeric({allow:"."});
            $j('#importe').mask("99999999.99");
            $j("#porcentaje").mask("999.99");
            //$j("#porcentaje").mask("/^((0|[1-9]\d?)(\.\d{1,2})?|100(\.00?)?)$/");
        });
        
        // Valida porcentaje
        function validate(x) {
            var parts = x.split(".");
            if (typeof parts[1] == "string" && (parts[1].length == 0 || parts[1].length > 2))
                return false;
            var n = parseFloat(x);
            if (isNaN(n))
                return false;
            if (n < 0 || n > 100)
                return false;
        
            return true;
        }
        
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
        
        // Recuperar fila selecccionada
        $j('.box').change(function(){
            disableAutorizarButtons();  
            $j('.box:checked').each(function(){
                var auxTipoBeneficiario = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxTipoBeneficiario2 = auxTipoBeneficiario.split(" - "); 
                
                
                var auxPorcentaje       = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxImporte          = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var estado              = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text(); 
                  
                  // Rechazo
                var auxRechazo  = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxRechazo2 = auxRechazo.split(" - ");
                $j("#rechazo").val(auxRechazo2);
                
                
                $j("#tipoBeneficiario").val(auxTipoBeneficiario2[0]);
                $j("#porcentaje").val(auxPorcentaje);
                $j("#importe").val(auxImporte);
                $j("#estado").val(estado);
                
                var auxEstatus = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                if (auxEstatus == 'RECHAZADO') {
                    if(registrar){
                        enableRegistrarButtons();
                    }
                    disableAutorizarButtons();
                }
                if (auxEstatus == 'REGISTRO') {
                    if(autorizar){
                        enableAutorizarButtons();
                    }
                    disableFormButtons();
                    disableRegistrarButtons();
                }
            });
        });
        
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
            $j("#displayTagDiv2").displayTagAjax();
        });
        
        function getPorcentaje() {
            var porcentaje = $j('#porcentaje').val();
            //console.log(porcentaje);
            if (!validate(porcentaje)) {
                alert("Ingrese un porcentaje valido");
                $j('#porcentaje').val('0');
            } else {
                if (porcentaje > 0) {
                    $j('#importe').val('0');
                }
            }
        }
        
        function getImporte() {
            var importe = $j('#importe').val();
            //console.log(importe);
            if (importe > 0) {
                $j('#porcentaje').val('0');
            }
        }
    </script>
    
       <%--Validacion boton registrar--%>
    <c:if test="${expedienteDepBenefDTO.registrar}">
        <script type="text/javascript">
            $j(document).ready(function(){
                enableRegistrarButtons();
            });
        </script>
    </c:if>
</html:form>