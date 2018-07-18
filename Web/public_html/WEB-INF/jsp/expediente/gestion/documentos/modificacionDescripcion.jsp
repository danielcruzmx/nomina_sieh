<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 400px;
    }
</style>
<html:form modelAttribute="expedienteModificacionDescripcionDTO">
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rfcEmpleadoBusqueda"/>
    <html:hidden path="idTipoDoctoBusqueda"/>
    <html:hidden path="hiddenIdDocto"/>

    <h1><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.title"/></h1>
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
                                                <legend style="font-size:1.3em"><strong>Documento a modificar</strong></legend><br/>
                                                <table width="100%">
                                                    <colgroup>
                                                        <col width="20%"/>
                                                        <col width="80%"/>
                                                    </colgroup>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.documento"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcTipoDoctosExpediente-altaDocumentosSinCaptura"
                                                                            path="auxDocto"
                                                                            style="width:500px;"
                                                                            disabled="true"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left" id="tr_auxDescripcionDocto">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.auxDescripcionDocto"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcDescripcionAux-documentosSinDatos"
                                                                            path="auxDescripcionDocto"
                                                                            parentPath="auxDocto"
                                                                            progress="true"
                                                                            style="width:500px;"/>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td class="label">  <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.auxdsdDescripDocto"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="auxdsdDescripDocto"
                                                                       maxlength="100"
                                                                       uppercase="true"
                                                                       size="120"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label"><spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.auxAnioDocto"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:input path="auxAnioDocto"
                                                                       maxlength="4"
                                                                       size="5"
                                                                       css="numeric"/>
                                                        </td>
                                                    </tr>
                                                    <tr align="left">
                                                        <td class="label">* <spring:message code="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.auxEstadoDocto"></spring:message></td>
                                                        <td align="left">
                                                            <fsn:option key="" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tcEstadoRegistro-modificacionDescripcion"
                                                                            path="auxEstadoDocto"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                                <table width="100%">
                                                    <tr align="center">
                                                        <td>
                                                            <fsn:submit value="submit.save" 
                                                                        path="registrar"
                                                                        action="gestionDocumentos/${expedienteModificacionDescripcionDTO.urlDestino}"
                                                                        progressBar="true"
                                                                        alertCode="confirm.expediente.alta.guardar"/> &nbsp; 
                                                            <fsn:submit value="submit.cancel" 
                                                                        path="cancel" 
                                                                        action="gestionDocumentos/${expedienteModificacionDescripcionDTO.urlOrigen}"
                                                                        progressBar="true"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </fieldset>
                                        </td>
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
                                        <td align="left">
                                            <fieldset>
                                                <legend style="font-size:1.3em"><strong>Documentos localizados</strong></legend><br/>
                                                
                                                <%--DATOS SIN CAPTURA--%>
                                                <fsn:filter property="ED.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPD.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%--CAPACITACION Y CURSOS--%>
                                                <fsn:filter property="CAP.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPCAP.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%--DATOS DE NACIMIENTO--%>
                                                <fsn:filter property="DANA.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPDN.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- CARTILLA LIBERADA DEL SMN --%>
                                                <fsn:filter property="CM.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPCM.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- ANTECEDENTES ACADEMICOS --%>
                                                <fsn:filter property="AA.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPAC.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- CURP --%>
                                                <fsn:filter property="EC.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPC.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- CUENTAS BANCARIAS --%>
                                                <fsn:filter property="CTA.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPCTA.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- DOMICILIO PARTICULAR --%>
                                                <fsn:filter property="EDOM.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPDOM.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- EXPERIENCIA LABORAL --%>
                                                <fsn:filter property="EL.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPL.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- DEPENDIENTES Y BENEFICIARIOS --%>
                                                <fsn:filter property="EB.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPB.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- FECHAS LABORALES --%>
                                                <fsn:filter property="ELAB.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPLAB.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- RFC SAT --%>
                                                <fsn:filter property="ER.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPR.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                <%-- DESIGNACION DE BENEFICIARIOS --%>
                                                <fsn:filter property="EF.ID_DOCTO" condition="=" path="idTipoDoctoBusqueda" />
                                                <fsn:filter property="EMPF.RFC_UNICO" condition="contains" path="rfcEmpleadoBusqueda" />
                                                
                                                
                                                <fsn:pagedList beanName="${expedienteModificacionDescripcionDTO.beanName}" 
                                                               baseUrl="${expedienteModificacionDescripcionDTO.urlOrigen}" 
                                                               maxRows="200" 
                                                               appendFilters="false">
                                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                                        <display:table name="${expedienteModificacionDescripcionDTO.beanName}" 
                                                                       class="displaytag" 
                                                                       pagesize="400" 
                                                                       export="true" 
                                                                       id="row" 
                                                                       requestURI="${requestURI}" 
                                                                       sort="list">
                                                            
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.docGrupo" 
                                                                            style="text-align: center;">
                                                                <input name="docGrupo" 
                                                                       class="box"
                                                                       type="checkbox" 
                                                                       value="<c:out value="${row.rfcEmpleado}|${row.idDocumento}|${row.idDocto}|${row.ID_DOCUMENTO}"/>"/>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.documento" 
                                                                            sortable="false"
                                                                            style="text-align: center">
                                                                <a href="downloadFile.do?uuid=<c:out value="${row.doctoRef}"/>" title="Descargar documento" target="_blank">
                                                                    <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                                </a>
                                                            </display:column>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.id" 
                                                                            property="idDocumento" 
                                                                            sortable="true"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.descTipoDocumento" 
                                                                            property="documento" 
                                                                            sortable="true"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.descDocumento" 
                                                                            property="descDocto" 
                                                                            sortable="true"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.anio" 
                                                                            property="anioDocto" 
                                                                            sortable="true"
                                                                            style="text-align: center"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.estado" 
                                                                            property="desStatus" 
                                                                            sortable="true"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.rechazo" 
                                                                            property="descRechazo" 
                                                                            sortable="true"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.usuario" 
                                                                            property="usuario" 
                                                                            sortable="true"
                                                                            style="text-align: left"/>
                                                            <display:column titleKey="sireh.label.oficinaVirtual.gestionDocumentos.modificacionDescripcion.consulta.fecModifico" 
                                                                            property="fecModifico" 
                                                                            sortable="true"
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
        // Validaciones
        $j(document).ready(function(){
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.alphaNumericEspacios').alphanumeric({allow:"-/ *_"});
            $j('.numeric').numeric();
        });
        
        // Checkbox unico
        $j(':checkbox').on('change',function(){
            var th = $j(this), name = th.prop('name'); 
            if(th.is(':checked')){
                $j(':checkbox[name="'  + name + '"]').not($(this)).prop('checked',false);   
            }
        });
        
        // Recuperar fila selecccionada
        $j('.box').change(function(){
            $j('.box:checked').each(function(){
                var auxDocto            = $j(this).parent().next('td').next('td').next('td').text();
                var auxDocto2           = auxDocto.split(" - ");
                var auxDescripcionDocto = $j(this).parent().next('td').next('td').next('td').next('td').text();
                var aux1                = auxDescripcionDocto.split("-");
                var auxDescripcionDocumento = aux1[0];                           
                var auxDescripcionDocumento1 = aux1[1];                                           
                var auxAnioDocto        = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxEstadoDocto      = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxEstadoDocto2     = auxEstadoDocto.split(" - ");
                //console.log(auxDocto + " - " + auxDescripcionDocto + " - " + auxAnioDocto + " - " + auxEstadoDocto);
                
                $j("#auxDocto").val(auxDocto2);
                $j("#hiddenIdDocto").val(auxDocto2);
                $j("#auxEstadoDocto").val(auxEstadoDocto2[0]);
                $j("#auxDescripcionDocto").val(auxDescripcionDocto);
                $j("#auxAnioDocto").val(auxAnioDocto);
                $j("#auxEstadoDocto option[value='" + auxEstadoDocto2[0] + "']").attr("selected","selected");
                var pardoc = $j('select[id="auxDocto"]').val() + '-' + aux1[0];
                
                getDescripDocto(pardoc);
                $j("#auxdsdDescripDocto").val(auxDescripcionDocumento1);        
                
                var DOCUMENTOS_SIN_CAPTURA = new Array("SOEMP", "CURRV", "CERME", "IDOFI", "DCLFD", "MBPDV", "CNISF", "CILAB", "SOCEM", "ABMIS", 
                                                        "CIFON", "INSAR", "AHOSO", "CSGMM", "SEGUR", "OFIDO", "CONNO", "ACSPF", "PSPAS", "DOSPF", 
                                                        "COSER", "HUSER", "CONES", "ACTAD", "RNOIC", "AEOIC", "ACTAT", "MEDDI", "CONHE", "CAISS", 
                                                        "DEMAN", "LAUEJ", "BECAS", "ACDEF", "OFIRE", "OFISU", "ACUBA", "DMINC", "DESBE", "LICIS");
                                                                
                if(DOCUMENTOS_SIN_CAPTURA.indexOf(auxDocto2[0]) >= 0){
                    $j("#tr_auxDescripcionDocto").show();
                    
                }
                else{
                    $j("#auxdsdDescripDocto").val(auxDescripcionDocto);
                    $j("#tr_auxDescripcionDocto").hide();
                    
                    //$j("#auxDescripcionDocto").prop("disabled",true);
                    //$j("#auxdsdDescripDocto").prop("disabled",true);
                }
            });
        });

        function getDescripDocto(pardoc){
        var idDocto = pardoc.split('-')[0];            
        $j.ajax({
            url: 'getDescripAuxDocto.do',
            type: 'GET',
            data: 'idDocto=' + idDocto,
            success: function(data) {
                $j('select[id="auxDescripcionDocto"]').find('option').remove().end();
                $j('select[id="auxDescripcionDocto"]').append(data);
                $j("#auxDescripcionDocto option[value='" + pardoc.split('-')[1] + "']").attr("selected","selected");
            }
        });
    }
    </script>
    
</html:form>