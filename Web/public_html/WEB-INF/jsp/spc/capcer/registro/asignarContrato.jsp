<%--@Descripcion: Vista encargada de consultar contratos.--%>
<%--@Autor: Oscar S.--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    .anchoInputSmall {
        width: 100px;
    }
</style>
                                
<html:form name="checkBoxTest" modelAttribute="asignarContratoDTO">
    
    <html:hidden path="anioOperacion"/>
    
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    
    <html:hidden path="viewName"/>
    
    <html:hidden path="rolAdministradorCapacitacion"/>
    <html:hidden path="rolAdministradorCertificacion"/>
    <html:hidden path="rolCoordinacionAdministrativa"/>
    
    <html:hidden path="idCurso"/>
    <html:hidden path="idCursoEditar"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="800" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del Curso</strong></legend>
                    <table width="100%">
                        <colgroup>
                            <col width="25%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                            <col width="25%"/>
                        </colgroup>
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.tipoCurso"/>:</td>
                                <td><b><c:out value="${asignarContratoDTO.tipoCursoDescripcion}"/></b></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.claveCurso"/>:</td>
                                <td><c:out value="${asignarContratoDTO.cursoClave}"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.nombreCurso"/>:</td>
                                <td><c:out value="${asignarContratoDTO.descCursoPrincipal}"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.subPrograma"/>:</td>
                                <td><c:out value="${asignarContratoDTO.descSubprograma}"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.ejeTematico"/>:</td>
                                <td><c:out value="${asignarContratoDTO.descEjeTematico}"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.modalidad"/>:</td>
                                <td><c:out value="${asignarContratoDTO.descModalidad}"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.finalidad"/>:</td>
                                <td><c:out value="${asignarContratoDTO.descFinalidad}"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.duracion"/>:</td>
                                <td><c:out value="${asignarContratoDTO.cursoDuracion}"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.proveedor"/>:</td>
                                <td><c:out value="${asignarContratoDTO.descProveedor}"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.fechaInicio"/>:</td>
                                <td><c:out value="${asignarContratoDTO.cursoFecIniFormat}"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.fechaTermino"/>:</td>
                                <td><c:out value="${asignarContratoDTO.cursoFecFinFormat}"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.sede"/>:</td>
                                <td><c:out value="${asignarContratoDTO.descSede}"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.aula"/>:</td>
                                <td><c:out value="${asignarContratoDTO.descAula}"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarContrato.horario"/>:</td>
                                <td colspan="3"><c:out value="${asignarContratoDTO.descHorarioCurso}"/></td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset><br/><br/>

                <fieldset>
                    <legend style="font-size:1.3em"><strong>Contrato</strong></legend>
                    
                    <fsn:filter property="CC.ID_PROVEEDOR" condition="=" path="idProveedor" />
                    <fsn:filter property="CC.ID_SITUACION_CONTRATO" condition="=" path="idSituacionContrato" />
                        
                    <fsn:pagedList beanName="${asignarContratoDTO.beanName}" 
                                   checkbox="true" 
                                   chkProperty="idContratos"
                                   baseUrl="${asignarContratoDTO.urlOrigen}" 
                                   appendFilters="false">
                        <div id="displayTagDiv" style="width:1000px; min-height:200px;overflow:auto;text-align:center;"> 
                            <display:table name="${asignarContratoDTO.beanName}" 
                                           class="displaytag" 
                                           pagesize="100"
                                           decorator="checkboxTableDecorator" 
                                           export="true" 
                                           id="row" 
                                           requestURI="${requestURI}" 
                                           sort="list">
                                           
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.idContratos" 
                                                style="text-align: center">
                                    <input name="idContratos" 
                                           class="checkbox"
                                           type="checkbox" 
                                           value="<c:out value="${row.idContratos}"/>|<c:out value="${row.idProveedor}"/>"/>
                                </display:column>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.idContrato" 
                                                sortable="true"
                                                style="text-align: left;"><c:out value="${row.contratoCursoNumero}"/></display:column>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.idProveedor" 
                                                property="proveedor" 
                                                sortable="true"
                                                maxLength="35"
                                                style="text-align: left;"/>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.ciclo" 
                                                property="contratoCursoCiclo" 
                                                sortable="true"
                                                style="text-align: left;"/>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.representante" 
                                                property="contratoCursoRepresentante" 
                                                sortable="true"
                                                style="text-align: left;"/>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.administrador" 
                                                property="contratoCursoAdministrador" 
                                                sortable="true"
                                                style="text-align: left;"/>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.monto" 
                                                property="contratoCursoMonto" 
                                                sortable="true"
                                                format="$ {0,number,#,##0.00}"
                                                style="text-align: left;"/>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.fechaPago" 
                                                property="fechaPago" 
                                                sortable="true"
                                                style="text-align: left;"/>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.usuario" 
                                                property="usuario" 
                                                sortable="true"
                                                style="text-align: left;"/>
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.fechaModificacion" 
                                                property="fecModifico" 
                                                sortable="true"
                                                style="text-align: left;"/>      
                                <display:column titleKey="sireh.label.spc.capcer.registro.consultaContrato.grid.situacion" 
                                                property="situacion" 
                                                sortable="true"
                                                style="text-align: left;"/>
                                                
                                <display:setProperty name="paging.banner.placement" value="bottom"/>
                                <display:setProperty name="export.pdf" value="true"/>
                                <display:setProperty name="basic.msg.empty_list">
                                    <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                                </display:setProperty>
                            </display:table>
                        </div>
                    </fsn:pagedList>
                </fieldset><br/><br/>
                
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Factura</strong></legend>
                    <table width="50%">
                        <colgroup>
                            <col width="50%"/>
                            <col width="50%"/>
                        </colgroup>
                        <tbody>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.asignarContrato.facturaFolio"/>:</td>
                                <td>
                                    <fsn:input path="facturaFolio"
                                               uppercase="true" 
                                               maxlength="60"
                                               size="60"
                                               css="anchoInputSmall facturaFolio"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.asignarContrato.facturaMonto"/>:</td>
                                <td>
                                    <fsn:input path="facturaMonto"
                                               uppercase="true" 
                                               maxlength="11"
                                               size="60"
                                               css="anchoInputSmall"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.asignarContrato.facturaFechaPago"/>:</td>
                                <td>
                                    <fsn:calendar path="facturaFechaPago" readonly="true"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.asignarContrato.situacionFactura"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapSituacionFactura-asignarContrato" 
                                                    path="idSituacionFactura"
                                                    style="width:200px;"
                                                    disabled="${asignarContratoDTO.editar}"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset><br/><br/>

                <!--BOTONES-->
                <table width="100%">
                    <colgroup>
                        <col width="50%"/>
                        <col width="50%"/>
                    </colgroup>
                    <tbody>
                        <tr>
                            <td valign="middle" height="20px" align="left">
                                <b>* Campos requeridos</b>
                            </td>
                        </tr>
                        <tr>
                            <td align="center">
                                <c:if test="${asignarContratoDTO.rolAdministradorCapacitacion || asignarContratoDTO.rolEjecutivoContratacion}">
                                    <fsn:submit value="submit.save" 
                                                path="${asignarContratoDTO.path}"
                                                action="registroCursoSPC/${asignarContratoDTO.viewName}.do"
                                                progressBar="true"
                                                alertCode="confirm.spc.capcer.registro.registrarCurso"/> &nbsp;
                                </c:if>
                                <fsn:submit value="submit.cancel" 
                                            action="registroCursoSPC/consultaAsignarContrato.do"
                                            progressBar="true"/>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <!--BOTONES-->
                </fieldset><br/><br/>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){            
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.facturaFolio').alphanumeric({allow:" -/\_"});
            $j('.numeric').numeric();
            $j("#facturaMonto").mask("999999999.99");
        });
        
        // PagedList asincrono
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
                enableFormButtons();
                if(registrar){
                    enableRegistrarButtons();
                }
            }
        });
    </script>
</html:form>