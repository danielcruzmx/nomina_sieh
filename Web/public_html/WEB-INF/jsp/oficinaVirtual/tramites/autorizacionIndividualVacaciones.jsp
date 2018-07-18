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
<html:form modelAttribute="periodoVacacionalDTO" enctype="multipart/form-data">
    <html:hidden path="urlOrigen"/>
    
    <h1><spring:message code="sireh.label.oficinaVirtual.tramites.autorizacion.vacaciones"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" align="center" border="0">
        <tr>
            <td align="left">
                <fieldset>
                    <legend style="font-size:1.1em"><strong>B&uacute;squeda</strong></legend><br/>
                    <table width="100%" align="center" border="0">
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.unidad"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidad-busquedaDocEmpleado"
                                                path="idUnidad"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.rfc"></spring:message></td>
                            <td align="left">
                                <fsn:input path="rfcEmpleado"
                                           uppercase="true" 
                                           maxlength="20"
                                           size="60" 
                                           css="anchoInput alphaNumericEspacios"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.status"></spring:message></td>
                            <td align="left" colspan="5">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcVacacionesEstatus"
                                                path="idEstatus"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.nombre"></spring:message></td>
                            <td align="left">
                                <fsn:input path="nombre"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.primerApellido"></spring:message></td>
                            <td align="left">
                                <fsn:input path="primerApellido"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.segundoApellido"></spring:message></td>
                            <td align="left">
                                <fsn:input path="segundoApellido"
                                           uppercase="true" 
                                           maxlength="60"
                                           size="60" 
                                           css="anchoInput alphaEspacios"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.ciclo"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcUnidadCicloReportes"
                                                path="ciclo"
                                                style="width:100px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.periodoV2"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcVacacionesPeriodos"
                                                path="idPeriodo"
                                                style="width:100px;"/>
                            </td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.periodoInicial"/>:</td>
                            <td><fsn:calendar path="fechaInicial" readonly="true" /></td>
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.periodoFinal"/>:</td>
                            <td><fsn:calendar path="fechaFinal" readonly="true" /></td>
                        </tr>
                        <tr align="left">
                            <td class="label"><spring:message code="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.tipoVacaciones"></spring:message></td>
                            <td align="left">
                                <fsn:option key="" value="selectList.nonValue"/>
                                <fsn:selectList beanName="tcVacacionesTipos"
                                                path="idTipo"
                                                style="width:200px;"/>
                            </td>
                        </tr>
                        <tr>
                            <td align="right" colspan="3">
                                <fsn:submit value="submit.search" 
                                            path="muestraRegistros" 
                                            action="tramites/${periodoVacacionalDTO.urlOrigen}" />&nbsp;
                            </td>
                            <td align="left" colspan="3">
                                <fsn:submit value="submit.clean" 
                                            path="cancel" 
                                            action="tramites/${periodoVacacionalDTO.urlOrigen}"/>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <c:if test="${periodoVacacionalDTO.muestraRegistros}">
        <table align="center" width="100%" border="0">
            <tr>
                <td>
                    <fsn:pagedList  beanName="${periodoVacacionalDTO.beanName}" 
                                    checkbox="true" 
                                    chkProperty="idVacaciones" 
                                    baseUrl="${consultaCursoDTO.urlOrigen}" 
                                    appendFilters="false">
                        <div id="displayTagDiv" style="width:1000px;overflow:auto;">
                            <display:table name="${periodoVacacionalDTO.beanName}"
                                           class="displaytag"
                                           pagesize="20"
                                           export="true"
                                           id="row"
                                           requestURI="${requestURI}"
                                           sort="list">
                                           
                                           
                                <c:choose>
                                    <c:when test="${row.idEstatus == 'S'}">
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.docGrupo" 
                                                        style="text-align: center">
                                            <input name="docGrupo"
                                                   class="box"
                                                   type="checkbox" 
                                                   value="<c:out value="${row.rfcEmpleado}|${row.idEstatus}|${row.idUnidad}|${row.idPeriodo}|${row.idTipoVacs}"/>"/>
                                        </display:column>
                                    </c:when>
                                    <c:otherwise>
                                        <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.docGrupo" 
                                                        style="text-align: center"> - </display:column>
                                    </c:otherwise>
                                </c:choose>
                                
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.autorizarRechazar">
                                    <c:choose>
                                        <c:when test="${row.idEstatus == 'S'}">
                                            <html:select path="idEstatus" cssStyle="width: 106px;">
                                                <html:option value="" label="Seleccione..."/>
                                                <html:options   items="${periodoVacacionalDTO.listStatus}"
                                                                itemValue="clave"
                                                                itemLabel="valor"/>
                                            </html:select>
                                        </c:when>
                                        <c:otherwise>
                                            <c:out value="${row.descEstatus}"/>
                                        </c:otherwise>
                                    </c:choose>
                                </display:column>
                                
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.unidad" 
                                                property="descUnidad"/>
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.rfc" 
                                                property="rfcEmpleado"/>
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.puesto" 
                                                property="descPuesto"/> 
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.nombre" 
                                                property="nombre"/>
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.tipoVacaciones" 
                                                property="descTipo"/>
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.ciclo" 
                                                property="ciclo"/>
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.periodoV2" 
                                                property="descPeriodo"/>
                                
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.diasSolicitadosV2" 
                                                property="diasSolicitados"/>
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.diasRestantesV2" 
                                                property="diasRestantes"/>    
                                                
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.fechaInicio" 
                                                property="fechaInicial"
                                                format="{0,date,dd/MM/yyyy}"/>
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.fechaFin"
                                                property="fechaFinal"
                                                format="{0,date,dd/MM/yyyy}"/>
                                <display:column titleKey="sireh.label.oficinaVirtual.tramites.solicitud.vacaciones.fechaCaptura"
                                                property="fechaCaptura"
                                                format="{0,date,dd/MM/yyyy}"/> 
                                                
                                <display:setProperty name="paging.banner.placement" value="bottom"/>
                                <display:setProperty name="export.pdf" value="true"/>
                                <display:setProperty name="basic.msg.empty_list">
                                    <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/></span>
                                </display:setProperty>
                            </display:table>
                        </div>
                    </fsn:pagedList>
                </td>
            </tr>
        </table>
    </c:if>

    <script type="text/javascript">
        function cleanForm(){
            $j("#idUnidad").val('');
            $j("#rfcEmpleado").val('');             
            $j("#nombre").val('');
            $j("#primerApellido").val('');
            $j("#segundoApellido").val('');
            $j("#ciclo").val('');
            $j("#idTipo").val('');
            $j("#idPeriodo").val('');
            $j("#fechaInicio").val('');
            $j("#fechaFin").val('');
        }
    
        // Validaciones
        $j(document).ready(function(){
            $j('#rfc').mask('AAAAAAAAAAAAA');
            $j('.alphaNumericEspacios').alphanumeric({allow:"-/ *_"});
        });
        
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        $j(':checkbox').on('change',function(){
            var th = $j(this), name = th.prop('name'); 
            if(th.is(':checked')){
                //$j(':checkbox[name="'  + name + '"]').not($(this)).prop('checked',false);   
            } else {
                cleanForm();
            }
        });
        
        
        $j('.box').change(function(){
            //disableAutorizarButtons();
            $j('.box:checked').each(function(){
                var auxIdUnidad         = $j(this).parent().next('td').next('td').text();
                var auxRfcEmpleado      = $j(this).parent().next('td').next('td').next('td').text();
                var auxNombre           = $j(this).parent().next('td').next('td').next('td').next('td').next('td').text();
                var auxidTipoVacs       = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxCiclo            = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                var auxIdPeriodo        = $j(this).parent().next('td').next('td').next('td').next('td').next('td').next('td').next('td').next('td').text();
                
                var auxidTipoVacs2      = auxidTipoVacs.split(" - ");
                var auxIdUnidad2        = auxIdUnidad.split(" - ");
                var auxNombre2          = auxNombre.split(" ");
                var auxNombre           = auxNombre2[0];
                var auxPA               = auxNombre2[1];
                var auxSA               = auxNombre2[2];
                var auxIdPeriodo2       = auxIdPeriodo[0];
                
                $j("#idTipo").val(auxidTipoVacs2[0]);
                $j("#idUnidad").val(auxIdUnidad2[0]);
                $j("#rfcEmpleado").val(auxRfcEmpleado);
                $j("#nombre").val(auxNombre);
                $j("#primerApellido").val(auxPA);
                $j("#segundoApellido").val(auxSA);
                $j("#ciclo").val(auxCiclo);
                $j("#idPeriodo").val(auxIdPeriodo2);
            });
        });
        
    </script>

</html:form>