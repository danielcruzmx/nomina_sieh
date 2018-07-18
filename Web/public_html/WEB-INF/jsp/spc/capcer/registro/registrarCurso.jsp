<%--@Descripcion: Vista encargada de registrar y editar datos del curso.--%>
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

<html:form modelAttribute="registrarCursoDTO">
    
    <html:hidden path="rolAdministradorCapacitacion"/>
    <html:hidden path="rolOperadorCapacitacion"/>
    
    <html:hidden path="noParticipantes"/>
    <html:hidden path="anioOperacion"/>
    <html:hidden path="viewName"/>
    <html:hidden path="idCursoEditar"/>
    <html:hidden path="path"/>
    <html:hidden path="descControlCurso"/>
    
    <c:if test="${registrarCursoDTO.editar}">
        <html:hidden path="tipoCurso"/>
        <html:hidden path="cursoFecIni"/>
        <html:hidden path="cursoFecFin"/>
        <html:hidden path="descSede"/>
        <html:hidden path="descAula"/>
        <html:hidden path="descHorario"/>
    </c:if>
    
    <h1><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del curso</strong></legend>
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.tipoCurso"/>:</td>
                                <td align="left">
                                    <table align="center" width="100%">
                                        <tr>                        
                                            <td align="center">
                                                <html:radiobutton value="CAP" path="tipoCurso" label=" Capacitacion"/>
                                            </td>
                                            <td align="center">
                                                <html:radiobutton value="CER" path="tipoCurso" label=" Certificacion"/>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.coordinacion"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapCoordinacion-registrarCurso" 
                                                    path="idCoordinacion"
                                                    disabled="${registrarCursoDTO.editar}"
                                                    style="width:200px;"/>
                                </td>
                                <%--<td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.ramo"/>:</td>
                                <td>06</td>--%>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.ejeTematico"/>:</td>
                                <td>
                                    <select name='idEjeTematico' id='idEjeTematico' style="width:200px;" onchange="generaClaveCurso();getCursoPrincipalCallback(false)">
                                        <option value=''>SELECCIONE...</option>
                                    </select>
                                </td>
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.subprograma"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapSubprograma-registrarCurso" 
                                                    path="idSubprograma"
                                                    onchange="generaClaveCurso()"
                                                    disabled="${registrarCursoDTO.editar}"
                                                    style="width:200px;"/>
                                </td>  
                            </tr>
                            
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.curso"/>:</td>
                                <td>
                                    <select name='idCursoPrincipal' 
                                            id='idCursoPrincipal' 
                                            style="width:200px;" 
                                            onchange="generaClaveCurso();getModalidadCallback(false);getFinalidadCallback(false);getCapacidadCertCallback(false);getCaracterCallback(false)">
                                        <option value=''>SELECCIONE...</option>
                                    </select>
                                </td>
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.claveCurso"/>:</td>
                                <td>
                                    <fsn:input path="claveCurso"
                                               uppercase="true" 
                                               maxlength="12"
                                               size="60"
                                               readonly="true"
                                               css="anchoInputSmall claveCurso"/>
                                </td>
                            </tr>
                            
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.modalidad"/>:</td>
                                <td>
                                    <select name='idModalidad' id='idModalidad' style="width:200px;" onchange="generaClaveCurso()" disabled="">
                                        <option value='0'>SELECCIONE...</option>
                                    </select>
                                </td>
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.finalidad"/>:</td>
                                <td>
                                    <select name='idFinalidad' id='idFinalidad' style="width:200px;" onchange="generaClaveCurso()" disabled="">
                                        <option value='0'>SELECCIONE...</option>
                                    </select>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.idCapacidadCert"/>:</td>
                                <td>
                                    <select name='idCapacidadCert' id='idCapacidadCert' style="width:200px;" onchange="generaClaveCurso()" disabled="">
                                        <option value='0'>SELECCIONE...</option>
                                    </select>
                                </td>
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.caracter"/>:</td>
                                <td>
                                    <select name='idCaracter' id='idCaracter' style="width:200px;" onchange="generaClaveCurso()" disabled="">
                                        <option value='0'>SELECCIONE...</option>
                                    </select>
                                </td>
                            </tr>
                            
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.duracion"/>:</td>
                                <td>                                    
                                    <fsn:input path="duracion"
                                               uppercase="true" 
                                               maxlength="14"
                                               size="60"
                                               css="anchoInput decimal"/>
                                </td>
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.presupuesto"/>:</td>
                                <td>
                                    <fsn:input path="presupuesto"
                                               uppercase="true" 
                                               maxlength="15"
                                               size="60"
                                               css="anchoInputSmall"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.rfcOperDgrh"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapOperDgrh-registrarCurso" 
                                                    path="rfcOperDgrh"
                                                    style="width:200px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.descControlCurso"/>:</td>
                                <td>
                                    <c:out value="${registrarCursoDTO.descControlCurso}" />
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset><br/><br/>
                
                <fieldset id="fieldsetCertificacion">
                    <legend style="font-size:1.3em"><strong>Certificaci&oacute;n</strong></legend>
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.claveCertificacion"/>:</td>
                                <td>
                                    <fsn:input path="claveCertificacion"
                                               uppercase="true" 
                                               maxlength="60"
                                               size="60"
                                               css="anchoInput alphanumericEspacios"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.nivelCurso"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapNivelCurso-registrarCurso" 
                                                    path="nivelCurso"
                                                    style="width:200px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.supervisorInstEducat"/>:</td>
                                <td>                                    
                                    <fsn:input path="supervisorInstEducat"
                                               uppercase="true" 
                                               maxlength="20"
                                               size="60"
                                               css="anchoInput alphaEspacios"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset><br/><br/>
                
                <c:if test="${registrarCursoDTO.idControlCurso ne 'REG'}">
                    <fieldset id="fieldsetCalendarizacion">
                        <legend style="font-size:1.3em"><strong>Calendarizaci&oacute;n</strong></legend>
                        <table width="100%">
                            <tbody>
                                <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.cursoFecIni"/>:</td>
                                    <td>
                                        <c:out value="${registrarCursoDTO.cursoFecIni}" />
                                    </td>
                                    <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.cursoFecFin"/>:</td>
                                    <td>
                                        <c:out value="${registrarCursoDTO.cursoFecFin}" />
                                    </td>
                                </tr>
                                <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.descSede"/>:</td>
                                    <td>
                                        <c:out value="${registrarCursoDTO.descSede}" />
                                    </td>
                                    <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.descAula"/>:</td>
                                    <td>
                                        <c:out value="${registrarCursoDTO.descAula}" />
                                    </td>
                                </tr>
                                <tr align="left">
                                    <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.descHorario"/>:</td>
                                    <td>
                                        <c:out value="${registrarCursoDTO.descHorario}" />
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </fieldset><br/><br/>
                </c:if>
                
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Proveedor</strong></legend>
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.tipoInstEducat"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapTipoInstEducat-registrarCurso" 
                                                    path="tipoInstEducat"
                                                    style="width:200px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.proveedor"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapProveedor-registrarCurso" 
                                                    path="proveedor"
                                                    parentPath="tipoInstEducat" 
                                                    progress="true"
                                                    style="width:200px;"/>
                                </td>
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.situacionProveedor"/>:</td>
                                <td>
                                    <fsn:filter property="ID_SITUACION_PROVEEDOR" condition="IN" path="situaciones"/>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapSituacionProveedor-registrarCurso" 
                                                    path="situacionProveedor"
                                                    style="width:200px;"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>
            <td valign="middle" height="20px" align="left">
                <b>* Campos requeridos</b>
            </td>
        </tr>
        <tr align="center">
            <td>
                <table width="90%" border="0" align="center">
                    <tr>
                        <td align="center">
                            <c:if test="${registrarCursoDTO.rolAdministradorCapacitacion || registrarCursoDTO.rolOperadorCapacitacion}">
                                <fsn:submit value="submit.save" 
                                            path="${registrarCursoDTO.path}"
                                            action="registroCursoSPC/${registrarCursoDTO.viewName}.do"
                                            progressBar="true"
                                            alertCode="confirm.spc.capcer.registro.registrarCurso"/> &nbsp;
                            </c:if>
                            <fsn:submit value="submit.cancel" 
                                        action="registroCursoSPC/consultaCurso.do"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        function getEjeTematicoCallback(verify) {
            var idTipoCurso1 = $j('#tipoCurso1:checked').val();
            var idTipoCurso2 = $j('#tipoCurso2:checked').val();
            var idTipoCurso = "";
            if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {
                idTipoCurso = "CER";
            } else {
                idTipoCurso = "CAP";
            }
            $j.ajax({
                url: 'getEjeTematicoCallback.do',
                type: 'GET',
                data: 'idTipoCurso=' + idTipoCurso,
                success: function(data) {
                    $j('select[id="idEjeTematico"]').find('option').remove().end();
                    $j('select[id="idEjeTematico"]').append(data);
                    if (verify) {
                        verifyEjeTematico();
                        getCursoPrincipalCallback(true);
                    }
                }
            });
        }
        
        function getCursoPrincipalCallback(verify) {
            var idEjeTematico = $j('select[id="idEjeTematico"]').val();
            if (idEjeTematico != null && idEjeTematico != "") {
                $j.ajax({
                    url: 'getCursoPrincipalCallback.do',
                    type: 'GET',
                    data: 'idEjeTematico=' + idEjeTematico,
                    success: function(data) {
                        $j('select[id="idCursoPrincipal"]').find('option').remove().end();
                        $j('select[id="idCursoPrincipal"]').append(data);
                        if (verify) {
                            verifyCursoPrincipal();
                            getModalidadCallback(true);
                        }
                    }
                });
            }
        }
        
        function getModalidadCallback(verify) {
            var idEjeTematico = $j('select[id="idEjeTematico"]').val();
            var idCursoPrincipal = $j('select[id="idCursoPrincipal"]').val();
            $j.ajax({
                url: 'getModalidadCallback.do',
                type: 'GET',
                data: 'idEjeTematico=' + idEjeTematico + "&idCursoPrincipal=" + idCursoPrincipal,
                success: function(data) {
                    $j('select[id="idModalidad"]').find('option').remove().end();
                    $j('select[id="idModalidad"]').append(data);
                    if (verify) {
                        verifyModalidad();
                        getFinalidadCallback(true);
                    }
                }
            });
        }
        
        function getFinalidadCallback(verify) {
            var idEjeTematico = $j('select[id="idEjeTematico"]').val();
            var idCursoPrincipal = $j('select[id="idCursoPrincipal"]').val();
            $j.ajax({
                url: 'getFinalidadCallback.do',
                type: 'GET',
                data: 'idEjeTematico=' + idEjeTematico + '&idCursoPrincipal=' + idCursoPrincipal,
                success: function(data) {
                    $j('select[id="idFinalidad"]').find('option').remove().end();
                    $j('select[id="idFinalidad"]').append(data);
                    if (verify) {
                        verifyFinalidad();
                        getCapacidadCertCallback(true);
                    }
                }
            });
        }
        
        function getCapacidadCertCallback(verify) {
            var idEjeTematico = $j('select[id="idEjeTematico"]').val();
            var idCursoPrincipal = $j('select[id="idCursoPrincipal"]').val();
            $j.ajax({
                url: 'getCapacidadCertCallback.do',
                type: 'GET',
                data: 'idEjeTematico=' + idEjeTematico + '&idCursoPrincipal=' + idCursoPrincipal,
                success: function(data) {
                    $j('select[id="idCapacidadCert"]').find('option').remove().end();
                    $j('select[id="idCapacidadCert"]').append(data);
                    if (verify) {
                        verifyCapacidadCert();
                        getCaracterCallback(true);
                    }
                }
            });
        }
        
        function getCaracterCallback(verify) {
            var idEjeTematico = $j('select[id="idEjeTematico"]').val();
            var idCursoPrincipal = $j('select[id="idCursoPrincipal"]').val();
            $j.ajax({
                url: 'getCaracterCallback.do',
                type: 'GET',
                data: 'idEjeTematico=' + idEjeTematico + '&idCursoPrincipal=' + idCursoPrincipal,
                success: function(data) {
                    $j('select[id="idCaracter"]').find('option').remove().end();
                    $j('select[id="idCaracter"]').append(data);
                    if (verify) {
                        verifyCaracter();
                    }
                }
            });
        }
        
        function verifyEjeTematico() {
            var idEjeTematico = '<c:out value="${registrarCursoDTO.idEjeTematico}"/>';
            if (idEjeTematico != null && idEjeTematico != "") {
                $j("#idEjeTematico option[value=" + idEjeTematico +"]").attr("selected","selected");
            }
        }
        function verifyModalidad() {
            var idModalidad = '<c:out value="${registrarCursoDTO.idModalidad}"/>';
            if (idModalidad != null && idModalidad != "") {
                $j("#idModalidad option[value=" + idModalidad +"]").attr("selected","selected");
            }
        }
        function verifyFinalidad() {
            var idFinalidad = '<c:out value="${registrarCursoDTO.idFinalidad}"/>';
            if (idFinalidad != null && idFinalidad != "") {
                $j("#idFinalidad option[value=" + idFinalidad +"]").attr("selected","selected");
            }
        }
        function verifyCapacidadCert() {
            var idCapacidadCert = '<c:out value="${registrarCursoDTO.idCapacidadCert}"/>';
            if (idCapacidadCert != null && idCapacidadCert != "") {
                $j("#idCapacidadCert option[value=" + idFinalidad +"]").attr("selected","selected");
            }
        }
        function verifyCaracter() {
            var idCaracter = '<c:out value="${registrarCursoDTO.idCaracter}"/>';
            if (idCaracter != null && idCaracter != "") {
                $j("#idCaracter option[value=" + idCaracter +"]").attr("selected","selected");
            }
        }
        function verifyCursoPrincipal() {
            var idCursoPrincipal = '<c:out value="${registrarCursoDTO.idCursoPrincipal}"/>';
            if (idCursoPrincipal != null && idCursoPrincipal != "") {
                $j("#idCursoPrincipal option[value=" + idCursoPrincipal +"]").attr("selected","selected");
            }
        }
    </script>
    
    <c:if test="${registrarCursoDTO.registrar}">
        <script type="text/javascript">
            // Genera clave de curso
            function generaClaveCurso() {
                var idTipoCurso1 = $j('#tipoCurso1:checked').val();
                var idTipoCurso2 = $j('#tipoCurso2:checked').val();
                var idTipoCurso = "";
                if (idTipoCurso2 != null && idTipoCurso2 != 'CER') {
                    idTipoCurso = "CER";
                } else {
                    idTipoCurso = "CAP";
                }
                var consecutivo = "";
                var codigoCurso = $j("#idCursoPrincipal").val();
                var idSubprograma = $j("#idSubprograma").val();
                var idEjeTematico = $j("#idEjeTematico").val();
                var anioOperacion = "<c:out value='${registrarCursoDTO.anioOperacion}'/>";
                $j.ajax({
                    url: 'getConsecutivoClaveCursoCallback.do',
                    type: 'GET',
                    data: 'idTipoCurso=' + idTipoCurso + '&idCursoPrincicpal=' + codigoCurso + '&idEjeTematico=' + idEjeTematico + '&cicloEjeTematico=' + anioOperacion + '&idSubprograma=' + idSubprograma,
                    success: function(data) {
                        var claveCursoGenerada = codigoCurso + data + anioOperacion.substring(2, 4) + "-" + idSubprograma;
                        $j("#claveCurso").val(claveCursoGenerada);
                    }
                });
            }
        </script>
    </c:if>
    
    <c:if test="${registrarCursoDTO.editar}">
        <!--editar-->
        <script type="text/javascript">
            // Genera clave de curso
            function generaClaveCurso() {
            }
        </script>
    </c:if>
    
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){            
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.alphanumericEspacios').alphanumeric({allow:" "});
            $j('.decimal').decimal();
            $j('.claveCurso').alphanumeric({allow:"-"});
            $j('.numeric').numeric();
            $j("#presupuesto").mask("9999999999.99");
        });
        
        function disableFieldsCurso(clear) {
            if (clear) {
                $j("#idCoordinacion").val("");
                $j("#idEjeTematico").val("");
                $j("#idSubprograma").val("");
                $j("#idCursoPrincipal").val("");
                //$j("#duracion").val("");
            }
            $j("#idCoordinacion").attr("disabled","true");
            $j("#idEjeTematico").attr("disabled","true");
            $j("#idSubprograma").attr("disabled","true");
            $j("#idCursoPrincipal").attr("disabled","true");
            $j("#duracion").attr("disabled","true");
            $j("#presupuesto").attr("disabled","true");
        }
        function disableFieldsCursoEdicion(clear) {
            if (clear) {
                $j("#idCoordinacion").val("");
                $j("#idEjeTematico").val("");
                $j("#idSubprograma").val("");
                $j("#idCursoPrincipal").val("");
                $j("#duracion").val("");
            }
            $j("#idCoordinacion").attr("disabled","true");
            $j("#idEjeTematico").attr("disabled","true");
            $j("#idSubprograma").attr("disabled","true");
            $j("#idCursoPrincipal").attr("disabled","true");
        }
        function enableFieldsCurso(clear) {
            if (clear) {
                $j("#idCoordinacion").val("");
                $j("#idEjeTematico").val("");
                $j("#idSubprograma").val("");
                $j("#idCursoPrincipal").val("");
                //$j("#duracion").val("");
            }
            $j("#idCoordinacion").removeAttr("disabled");
            $j("#idEjeTematico").removeAttr("disabled");
            $j("#idSubprograma").removeAttr("disabled");
            $j("#idCursoPrincipal").removeAttr("disabled");
            $j("#duracion").removeAttr("disabled");
            $j("#presupuesto").removeAttr("disabled");
        }
        
        function disableClearFieldsCertificacion(clear) {
            if (clear) {
                $j("#claveCertificacion").val("");
                $j("#nivelCurso").val("");
                $j("#supervisorInstEducat").val("");
            }
            $j("#claveCertificacion").attr("disabled","true");
            $j("#nivelCurso").attr("disabled","true");
            $j("#supervisorInstEducat").attr("disabled","true");
        }
        function enableFieldsCertificacion(clear) {
            if (clear) {
                $j("#claveCertificacion").val("");
                $j("#nivelCurso").val("");
                $j("#supervisorInstEducat").val("");
            }
            $j("#claveCertificacion").removeAttr("disabled");
            $j("#nivelCurso").removeAttr("disabled");
            $j("#supervisorInstEducat").removeAttr("disabled");
        }
        
        function disableFieldsProveedor(clear) {
            if (clear) {
                $j("#tipoInstEducat").val("");
                $j("#proveedor").val("");
                $j("#situacionProveedor").val("");
            }
            $j("#tipoInstEducat").attr("disabled","true");
            $j("#proveedor").attr("disabled","true");
            $j("#situacionProveedor").attr("disabled","true");
        }
        function enableFieldsProveedor(clear) {
            if (clear) {
                $j("#tipoInstEducat").val("");
                $j("#proveedor").val("");
                $j("#situacionProveedor").val("");
            }
            $j("#tipoInstEducat").removeAttr("disabled");
            $j("#proveedor").removeAttr("disabled");
            $j("#situacionProveedor").removeAttr("disabled");
        }
    </script>
    
    <c:if test="${registrarCursoDTO.registrar}">
        <!--registrar-->
        <script type="text/javascript">
            // Curso de capacitacion
            $j("#tipoCurso1").click(function(){
                enableFieldsCurso(true);
                $j("#fieldsetCertificacion").hide();
                $j("#fieldsetCalendarizacion").hide();
                disableClearFieldsCertificacion(true);
                enableFieldsProveedor(true);
                getEjeTematicoCallback(false);
            });
            
            // Curso de certificacion
            $j("#tipoCurso2").click(function(){
                enableFieldsCurso(true);
                $j("#fieldsetCertificacion").show();
                $j("#fieldsetCalendarizacion").hide();
                enableFieldsCertificacion(true);
                enableFieldsProveedor(true);
                getEjeTematicoCallback(false);
            });
        </script>
    </c:if>
    
    <c:if test="${registrarCursoDTO.registrar}">
        <!--registrar-->
        <script type="text/javascript">
            var validacion = "<c:out value='${registrarCursoDTO.validacion}'/>";
            if (validacion == "true") {
                // Inicializar forma
                getEjeTematicoCallback(true);
                
                var idTipoCurso2 = $j('#tipoCurso2:checked').val();
                if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {
                    $j("#fieldsetCertificacion").show();
                    $j("#fieldsetCalendarizacion").hide();
                } else {
                    $j("#fieldsetCertificacion").hide();
                    $j("#fieldsetCalendarizacion").hide();
                }
            } else {
                // Inicializar forma
                disableFieldsCurso(true);
                disableClearFieldsCertificacion(true);
                disableFieldsProveedor(true);
                $j("#fieldsetCertificacion").hide();
                $j("#fieldsetCalendarizacion").hide();
                $j("#camposCertificacion").hide();
            }
        </script>
    </c:if>
    
    <c:if test="${registrarCursoDTO.editar}">
        <!--editar-->
        <script type="text/javascript">
            var validacion = "<c:out value='${registrarCursoDTO.validacion}'/>";
            if (validacion == "true") {
                // Inicializar forma
                $j("#tipoCurso1").attr("readonly","true");
                $j("#tipoCurso2").attr("readonly","true");
                disableFieldsCursoEdicion(false);
                getEjeTematicoCallback(true);
                
                var idTipoCurso2 = $j('#tipoCurso2:checked').val();
                if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {
                    $j("#fieldsetCertificacion").show();
                    $j("#fieldsetCalendarizacion").show();
                } else {
                    $j("#fieldsetCertificacion").hide();
                    $j("#fieldsetCalendarizacion").show();
                }
            } else {
                // Inicializar forma
                $j("#tipoCurso1").attr("disabled","true");
                $j("#tipoCurso2").attr("disabled","true");
                disableFieldsCursoEdicion(false);
                getEjeTematicoCallback(true);
                
                var idTipoCurso2 = $j('#tipoCurso2:checked').val();
                if (idTipoCurso2 != null && idTipoCurso2 == 'CER') {
                    $j("#fieldsetCertificacion").show();
                    $j("#fieldsetCalendarizacion").show();
                } else {
                    $j("#fieldsetCertificacion").hide();
                    $j("#fieldsetCalendarizacion").show();
                }
            }
        </script>
    </c:if>
    
    <c:forEach items="${registrarCursoDTO.situaciones}" var="situacion" varStatus="status">
        <input type="hidden" name="situaciones[<c:out value='${status.index}'/>]" value="<c:out value='${situacion}'/>" />
    </c:forEach>
    <c:if test="${registrarCursoDTO.editar}">
        <html:hidden path="idEjeTematico"/>
        <html:hidden path="idCursoPrincipal"/>
        <html:hidden path="idModalidad"/>
        <html:hidden path="idFinalidad"/>
        <html:hidden path="idCapacidadCert"/>
        <html:hidden path="idCaracter"/>
    </c:if>
</html:form>
