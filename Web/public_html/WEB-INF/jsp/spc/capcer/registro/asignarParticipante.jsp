<%--@Descripcion: Vista encargada de asignar, desasignar y noificar participantes.--%>
<%--@Autor: Oscar S. / Gualbero G.--%>

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
                                
<html:form modelAttribute="asignarParticipanteDTO">
    
    <html:hidden path="idCurso"/>
    
    <html:hidden path="rolAdministradorCapacitacion"/>
    <html:hidden path="rolAdministradorCertificacion"/>
    <html:hidden path="rolCoordinacionAdministrativa"/>
    
    <html:hidden path="anioOperacion"/>
    <html:hidden path="cupoMaximoAula"/>
    
    <html:hidden path="postDataInscribirParticipante" id="postDataInscribirParticipante"/>
    <html:hidden path="postDataCancelarParticipante" id="postDataCancelarParticipante"/>
    
    <html:hidden path="urlInscribirParticipante"/>
    <html:hidden path="urlCancelarParticipante"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del curso</strong></legend>
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.tipoCurso"/>:</td>
                                <td><b><fsn:input path="tipoCursoDescripcion" readonly="true" size="40"/></b></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.claveCurso"/>:</td>
                                <td><fsn:input path="cursoClave" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.nombreCurso"/>:</td>
                                <td><fsn:input path="descCursoPrincipal" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.subPrograma"/>:</td>
                                <td><fsn:input path="descSubprograma" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.ejeTematico"/>:</td>
                                <td><fsn:input path="descEjeTematico" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.modalidad"/>:</td>
                                <td><fsn:input path="descModalidad" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.finalidad"/>:</td>
                                <td><fsn:input path="descFinalidad" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.duracion"/>:</td>
                                <td><fsn:input path="cursoDuracion" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.noParticipantes"/>:</td>
                                <td><fsn:input path="cursoMinimoParticipantes" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.fechaInicio"/>:</td>
                                <td><fsn:input path="cursoFecIniFormat" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.fechaTermino"/>:</td>
                                <td><fsn:input path="cursoFecFinFormat" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.sede"/>:</td>
                                <td><fsn:input path="descSede" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.aula"/>:</td>
                                <td><fsn:input path="descAula" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.horario"/>:</td>
                                <td><c:out value="${asignarParticipanteDTO.descHorarioCurso}"/></td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset><br/><br/>
                
                <!--TABS-->
                <div class="tabs">
                    <ul class="tab-links">
                        <li class="active"><a href="#tab1">Asignar participante</a></li>
                        <li><a href="#tab2">Participantes inscritos</a></li>
                        <li><a href="#tab3">Env&iacute;o de notificaciones</a></li>
                    </ul>

                    <div class="tab-content">
                        <div id="tab1" class="tab active">
                            <fieldset>
                                <legend style="font-size:1.3em"><strong>Asignar Participante</strong></legend>
                                <!-- json -->
                                <table width="100%">
                                    <tr>
                                        <td align="center" style="padding: 5px;">
                                            <br />
                                            <div style="width:1000px;overflow:auto;">
                                                <table id="listParticipantesCandidatos"></table>
                                                <div id="pagerParticipantesCandidatos"></div>
                                            </div>
                                            <br />
                                        </td>
                                    </tr>
                                </table>

                                <script type="text/javascript">                                    
                                    var idCurso = '<c:out value="${asignarParticipanteDTO.idCurso}"/>';
                                    var tipoCurso = '<c:out value="${asignarParticipanteDTO.tipoCurso}"/>';
                                    var grid = $j('#listParticipantesCandidatos'), idsOfSelectedRows = [],
                                    updateIdsOfSelectedRows = function (id, isSelected) {
                                        var index = $j.inArray(id, idsOfSelectedRows);
                                        if (!isSelected && index >= 0) {
                                            idsOfSelectedRows.splice(index, 1); // remove id from the list
                                        } else if (index < 0) {
                                            idsOfSelectedRows.push(id);
                                        }
                                    };
                                    var getColumnIndexByName = function(grid, columnName) {
                                        var cm = grid.jqGrid('getGridParam', 'colModel'), i, l;
                                        for (i = 0, l = cm.length; i < l; i += 1) {
                                            if (cm[i].name === columnName) {
                                                return i; // return the index
                                            }
                                        }
                                        return -1;
                                    }
                                    
                                    $j("#listParticipantesCandidatos").jqGrid({
                                        url: 'jsonCallbackParticipantesCandidatos.do?idCurso=' + idCurso + '&tipoCurso=' + tipoCurso, 
                                        datatype: 'json',
                                        colNames: [
                                            'Selecci&oacute;n',
                                            'Unidad',
                                            'Nivel',
                                            'RFC',
                                            'Nombre',
                                            'Primer apellido',
                                            'Segundo apellido',
                                            'Email',
                                            'Email alterno',
                                            'Fecha de ingreso',
                                            'Fecha de reingreso',
                                            'Fecha de vigencia'
                                        ],
                                        colModel: [
                                            {name: 'seleccion', index: 'seleccion', width: 60, align: "center", editable: true, edittype: 'checkbox', editoptions: {value: "True:False"}, formatter: "checkbox", formatoptions: {disabled: false}, search: false},
                                            {name: 'unidad', index: 'unidad', width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'nivel', index: 'nivel', width: 110, align: "center", sortable: true, sorttype: "text", search: true},
                                            {name: 'rfcEmpleado', index: 'rfcEmpleado', width: 110, align: "center", sortable: true, sorttype: "text", search: true},
                                            {name: 'nombre', index: 'nombre', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'primerApellido', index: 'primerApellido', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'segundoApellido', index: 'segundoApellido', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            
                                            {name: 'email', index: 'email', width: 200, align: "left", sortable: false, sorttype: "text", search: true},
                                            {name: 'emailAlterno', index: 'emailAlterno', width: 200, align: "left", sortable: false, search: false, editable: true},
                                            
                                            {name: 'fechaIngreso', index: 'fechaIngreso', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'fechaReingreso', index: 'fechaReingreso', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            
                                            {name: 'fechaVigencia', index: 'fechaVigencia', width: 110, align: "left", sortable: true, sorttype: "text", search: true}
                                        ],
                                        rowNum: "50",
                                        pager: '#pagerParticipantesCandidatos',
                                        viewrecords: true,
                                        loadonce: true,
                                        loadComplete: function() {
                                            var jthis = $j(this), ids = jthis.jqGrid('getDataIDs'), i, l = ids.length;
                                            for (i = 0; i < l; i++) {
                                                jthis.jqGrid('editRow', ids[i], true);
                                                var fechaVigencia = $j("#listParticipantesCandidatos").jqGrid('getCell',ids[i],'fechaVigencia');
                                                if(fechaVigencia){
                                                    $j("#"+ids[i]+"_seleccion").attr("disabled", true);
                                                    }
                                                }
                                            var jthis = $j(this), i, count;
                                            for (i = 0, count = idsOfSelectedRows.length; i < count; i++) {
                                                //jthis.jqGrid('setSelection', idsOfSelectedRows[i], false);
                                                $j("#"+idsOfSelectedRows[i]+"_seleccion").prop('checked', true);
                                            }
                                            var iCol = getColumnIndexByName ($j(this), 'seleccion'), rows = this.rows, i, c = rows.length;
                                            for (i = 0; i < c; i += 1) {
                                                $j(rows[i].cells[iCol]).click(function (e) {
                                                    var id = $j(e.target).closest('tr')[0].id,
                                                        isChecked = $j(e.target).is(':checked');
                                                        updateIdsOfSelectedRows(id, isChecked);
                                                });
                                            }
                                        },
                                        height: 200,
                                        gridComplete: function() {
                                            $j("#listParticipantesCandidatos").setGridParam({datatype: 'local'});
                                        }
                                    });

                                    
                                    grid.jqGrid('inlineNav', '#pagerParticipantesCandidatos');
                                    grid.jqGrid('filterToolbar', {searchOnEnter: true, enableClear: false});

                                    $j(window).resize(function() {
                                        $j('#listParticipantesCandidatos').jqGrid('setGridHeight', "200.0");
                                    });
                                </script>
                                <!-- json -->

                                <!--BOTONES-->
                                <table width="100%">
                                    <tbody>
                                        <tr>
                                            <td align="center">
                                                <c:if test="${asignarParticipanteDTO.rolAdministradorCapacitacion || asignarParticipanteDTO.rolCoordinacionAdministrativa}">
                                                    <fsn:submit value="submit.save" 
                                                                action="registroCursoSPC/${asignarParticipanteDTO.urlInscribirParticipante}.do"
                                                                progressBar="true"
                                                                path="inscribirParticipantes"
                                                                onclick="setJsonInscribirParticipante()"
                                                                alertCode="confirm.spc.capcer.registro.registrarCurso"/> &nbsp;
                                                </c:if>
                                                <fsn:submit value="submit.cancel" 
                                                            action="registroCursoSPC/consultaAsignarParticipante.do"
                                                            progressBar="true"/>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                <!--BOTONES-->
                            </fieldset>
                        </div>

                        <div id="tab2" class="tab">
                            <fieldset>
                                <legend style="font-size:1.3em"><strong>Participantes Inscritos</strong></legend>
                                
                                <!-- json -->
                                <table width="100%">
                                    <tr>
                                        <td align="center" style="padding: 5px;">
                                            <br />
                                            <div style="width:1000px;overflow:auto;">
                                                <table id="listParticipantesInscritos"></table>
                                                <div id="pagerParticipantesInscritos"></div>
                                            </div>
                                            <br />
                                        </td>
                                    </tr>
                                </table>

                                <script type="text/javascript">                                    
                                    var idCurso = '<c:out value="${asignarParticipanteDTO.idCurso}"/>';
                                    var tipoCurso = '<c:out value="${asignarParticipanteDTO.tipoCurso}"/>';
                                    
                                    $j("#listParticipantesInscritos").jqGrid({
                                        url: 'jsonCallbackParticipantesInscritos.do?idCurso=' + idCurso + '&tipoCurso=' + tipoCurso, 
                                        datatype: 'json',
                                        colNames: [
                                            'Selecci&oacute;n',
                                            'Unidad',
                                            'Nivel',
                                            'RFC',
                                            'Nombre',
                                            'Primer apellido',
                                            'Segundo apellido',
                                            'Email',
                                            'Notificado',
                                            'Observaciones'
                                        ],
                                        colModel: [
                                            {name: 'seleccion', index: 'seleccion', width: 60, align: "center", editable: true, edittype: 'checkbox', editoptions: {value: "True:False"}, formatter: "checkbox", formatoptions: {disabled: false}, search: false},
                                            {name: 'unidad', index: 'unidad', width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'nivel', index: 'nivel', width: 110, align: "center", sortable: true, sorttype: "text", search: true},
                                            {name: 'rfcEmpleado', index: 'rfcEmpleado', width: 110, align: "center", sortable: true, sorttype: "text", search: true},
                                            {name: 'nombre', index: 'nombre', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'primerApellido', index: 'primerApellido', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'segundoApellido', index: 'segundoApellido', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'email', index: 'email', width: 200, align: "left", sortable: false, sorttype: "text", search: true},
                                            {name: 'fechaNotificacion', index: 'fechaNotificacion', width: 110, align: "left", sortable: true, sorttype: "text", search: true},
                                            {name: 'participanteObservaciones', index: 'participanteObservaciones', width: 110, align: "left", sortable: true, sorttype: "text", search: false}
                                        ],
                                        rowNum: "50",
                                        pager: '#pagerParticipantesInscritos',
                                        viewrecords: true,
                                        loadonce: true,
                                        loadComplete: function() {
                                            var $jthis = $j(this), ids = $j(this).jqGrid('getDataIDs'), i, l = ids.length;
                                            for (i = 0; i < l; i++) {
                                                $jthis.jqGrid('editRow', ids[i], true);
                                            }
                                        },
                                        height: 200,
                                        gridComplete: function() {
                                            $j("#listParticipantesInscritos").setGridParam({datatype: 'local'});
                                        }
                                    });

                                    var grid = $j('#listParticipantesInscritos');
                                    grid.jqGrid('inlineNav', '#pagerParticipantesInscritos');
                                    grid.jqGrid('filterToolbar', {searchOnEnter: true, enableClear: false});

                                    $j(window).resize(function() {
                                        $j('#listParticipantesInscritos').jqGrid('setGridHeight', "200.0");
                                    });
                                </script>
                                <!-- json -->
                                
                                <!--MENSAJE-->
                                <table width="100%">
                                    <tbody>
                                        <tr align="left">
                                            <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.idMotivoDesasigna"/>:</td>
                                            <td>
                                                <fsn:option key="" value="selectList.nonValue"/>
                                                <fsn:selectList beanName="tcCapMotivoDesasigna-asignarParticipante" 
                                                                path="idMotivoDesasigna"
                                                                style="width:300px;"/>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                <!--MENSAJE-->
                                
                                <!--BOTONES-->
                                <table width="100%">
                                    <tbody>
                                        <tr align="center">
                                            <td>
                                                <c:if test="${asignarParticipanteDTO.rolAdministradorCapacitacion || asignarParticipanteDTO.rolCoordinacionAdministrativa}">
                                                    <fsn:submit value="submit.cancelar.asignacion" 
                                                                action="registroCursoSPC/${asignarParticipanteDTO.urlCancelarParticipante}.do"
                                                                progressBar="true"
                                                                path="cancelarInscripcion"
                                                                onclick="setJsonCancelarParticipante()"
                                                                alertCode="confirm.spc.capcer.registro.registrarCurso"/> &nbsp;
                                                </c:if>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table><br/><br/>
                                <!--BOTONES-->
                                
                            </fieldset>
                        </div>

                        <div id="tab3" class="tab">
                            <fieldset>
                                <legend style="font-size:1.3em"><strong>Env&iacute;o de notificaciones</strong></legend>
                                <table width="100%">
                                    <tbody>
                                        <tr align="left">
                                            <td class="label">Modalidad:</td>
                                            <td>
                                                <fsn:option key="" value="selectList.nonValue"/>
                                                <fsn:selectList beanName="tcCapNotifCurso-asignarParticipante" 
                                                                path="idModalidad"
                                                                onchange="cargarMensaje()"
                                                                style="width:200px;"/>
                                            </td>
                                        </tr>
                                        <tr align="left">
                                            <td class="label">Asunto:</td>
                                            <td>
                                                <div id="asuntoCorreo">
                                                    N/A
                                                </div>
                                            </td>
                                        </tr>
                                        <tr align="left">
                                            <td class="label" style="vertical-align: top">Cuerpo del mensaje:</td>
                                            <td>
                                                <div id="mensajeCorreo">
                                                    N/A
                                                </div>
                                            </td>
                                        </tr>
                                        <tr align="left">
                                            <td class="label" style="vertical-align: top">Archivo adjunto:</td>
                                            <td>
                                                <a id="linkNotificacion" href='downloadNotificacion.do?idCurso=<c:out value="${asignarParticipanteDTO.idCurso}"/>' class='requestlink' title='Ver Notificacion' target='_blank'><img id="imgNotificacion" width='20' align='middle' src='../images/pdf-download.jpg'/></a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>

                                <!--BOTONES-->
                                <table width="100%">
                                    <tbody>
                                        <tr align="center">
                                            <td>
                                                <fsn:submit value="submit.enviar.notificacion" 
                                                            action="registroCursoSPC/enviarNotificaciones.do"
                                                            progressBar="true" 
                                                            path="enviarNotificacion"
                                                            onclick="setJsonCancelarParticipante()"
                                                            alertCode="confirm.spc.capcer.registro.enviarNotificaciones"/>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                                <!--BOTONES-->
                            </fieldset>
                        </div>
                    </div>
                </div>
                <!--TABS-->
            </td>
        </tr>
    </table>
    
    <script type='text/javascript'>        
        var idCurso = <c:out value="${asignarParticipanteDTO.idCurso}"/>
        $j(document).ready(function(){            
            $j('#linkNotificacion').hide();
        });
        
        // Asignar json
        function setJsonInscribirParticipante() {
            var gridData = $j('#listParticipantesCandidatos').getRowData();
            var postData = JSON.stringify(gridData);
            $j('#postDataInscribirParticipante').val(postData);
        }
        
        function setJsonCancelarParticipante() {
            var gridData = $j('#listParticipantesInscritos').getRowData();
            var postData = JSON.stringify(gridData);
            $j('#postDataCancelarParticipante').val(postData);
        }
        
        function cargarMensaje(){
            var idModalidad = $j('select[id="idModalidad"]').val();
            if(idModalidad){
                var originalhref = "downloadNotificacion.do?idCurso="+idCurso;
                $j('#linkNotificacion').show();
                $j('#linkNotificacion').attr('href', originalhref + '&idModalidad=' + idModalidad);    
            }else{
                $j('#linkNotificacion').hide();
            }
            $j.ajax({
                url: 'getTcCapNotifCursoCallBack.do',
                type: 'GET',
                data: 'idModalidad=' + idModalidad,
                success: function(data) {
                    var tokens = data.split("|");
                    $j('#asuntoCorreo').text(tokens[0]);
                    $j('#mensajeCorreo').text(tokens[1]);
                }
            });
        }
    </script>
</html:form>