<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="evaluacionReaccionDTO">
    <html:hidden path="postDataEvaluacionCurso" id="postDataEvaluacionCurso"/>
    <html:hidden path="idCurso"/>
    <html:hidden path="showValidar"/>
    <html:hidden path="showEditarCampos"/>
    <html:hidden path="showTerminarCaptura"/>
    <html:hidden path="showGuardar"/>
    <h1><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del curso</strong></legend>
                    <table width="100%" align="center">
                        <tbody>
                            <tr><td>&nbsp;</td></tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.cursoClave"/>:</td>
                                <td align="left"><fsn:label path="cursoClave"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.asignarInstructor.descCursoPrincipal"/>:</td>
                                <td align="left"><fsn:label path="descCursoPrincipal"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.descSubprograma"/>:</td>
                                <td align="left"><fsn:label path="descSubprograma"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.descEjeTematico"/>:</td>
                                <td align="left"><fsn:label path="descEjeTematico"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.descModalidad"/>:</td>
                                <td align="left"><fsn:label path="descModalidad"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.descFinalidad"/>:</td>
                                <td align="left"><fsn:label path="descFinalidad"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.cursoDuracion"/>:</td>
                                <td align="left"><fsn:label path="cursoDuracion"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.cursoMinimoParticipantes"/>:</td>
                                <td align="left"><fsn:label path="cursoMinimoParticipantes"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.cursoFecIni"/>:</td>
                                <td align="left"><fsn:label path="cursoFecIni"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.cursoFecFin"/>:</td>
                                <td align="left"><fsn:label path="cursoFecFin"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.descSede"/>:</td>
                                <td align="left"><fsn:label path="descSede"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.descAula"/>:</td>
                                <td align="left"><fsn:label path="descAula"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.descHorarioCurso"/>:</td>
                                <td align="left"><fsn:label path="descHorarioCurso"/></td>
                           </tr>                           
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td>
                <!-- json -->
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Asignar Participante</strong></legend>
                    <table width="100%">
                        <tr>
                            <td align="center" style="padding: 5px;">
                                <br/>
                                <div style="width:1000px;overflow:auto;">
                                     <table id="jqGrid"></table>
                                    <div id="pagerCurso"></div>
                                </div>
                                <br/>
                            </td>
                        </tr>
                    </table>
                    <table align="center">
                        <tr align="center">
                            <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluacionReaccion.cursoParticipantes"/>:</td>
                            <td align="left"><fsn:input path="cursoParticipantes" readonly="true"/></td>
                        </tr>
                    </table>
                </fieldset>
            <!-- json -->
            </td>
        </tr>
        <tr><td>&nbsp;</td></tr>
        <tr align="center">
            <td>
                <table width="90%" border="0" align="center">
                    <tr>
                        <td align="center">
                            <c:if test="${evaluacionReaccionDTO.showTerminarCaptura}">
                                <input id="10004" type="button" onclick="saveRows()" value="TERMINAR CAPTURA">
                            </c:if>
                            <c:if test="${evaluacionReaccionDTO.showEditarCampos}">
                                <input id="10005" type="button" onclick="startEdit()" value="EDITAR CAMPOS">
                            </c:if>
                            <img id="progressIcon10001" style="visibility:hidden;" src="/resources/images/progress/loader.gif">
                                <fsn:submit value="submit.save"
                                    onclick="setJsonEvaluacionReaccion()"
                                    action="seguimientoCursoSPC/${evaluacionReaccionDTO.urlSaveEvaluacionCurso}"/>
                                <fsn:submit value="submit.validar" 
                                action="seguimientoCursoSPC/${evaluacionReaccionDTO.urlValidateEvaluacionCurso}"
                                alertCode="confirm.spc.capcer.evaluacionReaccion.validarCurso"/>
                            <fsn:submit value="submit.cancel" 
                                action="seguimientoCursoSPC/${evaluacionReaccionDTO.urlCancelEvaluacionCurso}"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>

    <script type="text/javascript"> 
        var idCurso = '<c:out value="${evaluacionReaccionDTO.idCurso}"/>';
        var noParticipantes = '<c:out value="${evaluacionReaccionDTO.cursoParticipantes}"/>';
        var showGuardar = '<c:out value="${evaluacionReaccionDTO.showGuardar}"/>';
        var showValidar = '<c:out value="${evaluacionReaccionDTO.showValidar}"/>';
        var showTerminarCaptura = '<c:out value="${evaluacionReaccionDTO.showTerminarCaptura}"/>';
        var showEditarCampos = '<c:out value="${evaluacionReaccionDTO.showEditarCampos}"/>';
        var grid = $j('#jqGrid');
            $j("#jqGrid").jqGrid({
                url: 'jsonCallbackEvaluacionesReaccion.do?idCurso=' + idCurso,
                datatype: "json",
                editurl: 'clientArray',
                colNames: [
                    'Participante',
                    '1',
                    '2',
                    '3',
                    '4',
                    '5',
                    '6',
                    '7',
                    '8',
                    '9',
                    '10'
                ],
                colModel: [
                    {name: 'participante', index: 'participante', width: 110, align: "center", sortable: true, sorttype: "text"},
                    {name: 'pregunta1', index: 'pregunta1', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta2', index: 'pregunta2', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta3', index: 'pregunta3', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta4', index: 'pregunta4', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta5', index: 'pregunta5', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta6', index: 'pregunta6', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta7', index: 'pregunta7', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta8', index: 'pregunta8', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta9', index: 'pregunta9', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    },
                    {name: 'pregunta10', index: 'pregunta10', width: 70, align: "right", sortable: true, sorttype: "float",
                        editable: true,
                        formatoptions: {decimalSeparator: ".", thousandsSeparator: " ", decimalPlaces: 2, defaultValue: '0.00'}
                    }
                ],
                rowNum: noParticipantes + 2,
                pager: '#pagerCurso',
                viewrecords: true,
                loadonce: true
            });

        function startEdit() {
            var grid = $j("#jqGrid");
            var ids = grid.jqGrid('getDataIDs');
            $j("#10001").attr('disabled','true');

            $j("#10004").show();
            $j("#10005").hide();
            for (var i = 0; i < ids.length; i++) {
                grid.jqGrid('editRow',ids[i]);
            }
            $j.maskV2.definitions['d'] = '[0-5]{1}';
            $j(".editable").maskV2("d");
            deshabilitarInputs();
            for(var i = 1; i <= 10; i++){
                calculaPromedio(i);    
            }
        };
        
        function saveRows() {
            var grid = $j("#jqGrid");
            var ids = grid.jqGrid('getDataIDs');
            $j("#10005").show();
            $j("#10004").hide();
            if(showEditarCampos){
                $j("#10001").removeAttr('disabled');
            }
            for(var i = 1; i <= 10; i++){
                calculaPromedio(i);    
            }
            for (var i = 0; i < ids.length; i++) {
                grid.jqGrid('saveRow', ids[i]);
            }
        }

        $j(document).ready(function(){
            $j("#10004").hide();
            $j("#10001").attr('disabled','disabled');
            if(showValidar == 'false'){
                $j("#10002").attr('disabled','disabled');
            }

        });
        $j('[name=pregunta1]').change(function() {
            calculaPromedio(1);
        });
        $j('[name=pregunta2]').change(function() {
            calculaPromedio(2);
        });
        $j('[name=pregunta3]').change(function() {
            calculaPromedio(3);
        });
        $j('[name=pregunta4]').change(function() {
            calculaPromedio(4);
        });
        $j('[name=pregunta5]').change(function() {
            calculaPromedio(5);
        });
        $j('[name=pregunta6]').change(function() {
            calculaPromedio(6);
        });
        $j('[name=pregunta7]').change(function() {
            calculaPromedio(7);
        });
        $j('[name=pregunta8]').change(function() {
            calculaPromedio(8);
        });
        $j('[name=pregunta9]').change(function() {
            calculaPromedio(9);
        });
        $j('[name=pregunta10]').change(function() {
            calculaPromedio(10);
        });
        
        $j.maskV2.definitions['d'] = '[0-5]{1}';
        $j(".editable").maskV2("d");

        $j("#jqGrid").jqGrid('setGroupHeaders', {
            useColSpanStyle: false,
            groupHeaders: [
                {startColumnName: 'pregunta1', numberOfColumns: 10, titleText: 'Reactivos'}
            ]
        });

        $j(window).resize(function() {
            $j('#listCurso').jqGrid('setGridHeight', "200.0");
        });
                                                
                                                
        // Calcular promedio 
        function calculaPromedio(pregunta) {
            //console.log($j(this).val());
            var totalSuma = 0;
            var totalPreguntas = 0;
            var totalPromedio = 0;
            var totalSumaCol = 0;

            for (var i = 1; i <= noParticipantes; i++) {
                var campo = $j("#" + i + "_pregunta" + pregunta);

                if (campo.val() != null && campo.val() != "" && campo.val() != "NaN" && campo.val() != "0") {
                    //console.log(i + " "+ campo.val());
                    totalSuma += parseFloat(campo.val());
                    totalPreguntas++;
                } else {
                    //console.log(i + "- Sin valor");
                    totalSuma += parseFloat(0);
                }
            }
            totalPromedio = parseFloat(Math.round((totalSuma / totalPreguntas) * 100) / 100).toFixed(2);
            totalSumaCol = parseFloat(Math.round(totalSuma * 100) / 100).toFixed(2);
            if(totalSumaCol == "NaN"){
                totalSumaCol = 0;
                }
            if(totalPromedio == "NaN"){
                totalPromedio = 0;
                }    
            $j("#" + (parseInt(noParticipantes) + parseInt(1)) + "_pregunta" + pregunta).val(totalSumaCol);
            $j("#" + (parseInt(noParticipantes) + parseInt(2)) + "_pregunta" + pregunta).val(totalPromedio);
        }


        function deshabilitarInputs() {
            for (var i = 1; i <= 10; i++) {
                $j("#" + (parseInt(noParticipantes) + parseInt(1)) + "_pregunta" + i).prop("disabled", true);
                $j("#" + (parseInt(noParticipantes) + parseInt(2)) + "_pregunta" + i).prop("disabled", true);
            }
        }

        function setJsonEvaluacionReaccion() {
            var gridData = $j('#jqGrid').getRowData();
            var postData = JSON.stringify(gridData);
            $j('#postDataEvaluacionCurso').val(postData);
        }
    </script>
</html:form>