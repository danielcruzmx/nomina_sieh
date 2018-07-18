<%--@Descripcion: Vista encargada de registrar y editar contratos y facturas.--%>
<%--@Autor: Oscar S.--%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    .anchoInputSmall {
        width: 150px;
    }
    .anchoTextarea {
        width: 300px;
    }
</style>

<html:form modelAttribute="altaContratoDTO" onkeypress="return anularEnter(event)">
    
    <c:if test="${altaContratoDTO.editar}">
        <html:hidden path="idContratoCurso"/>
        <html:hidden path="contratoCursoCiclo"/>
    </c:if>
    
    <html:hidden path="viewName"/>
    
    <html:hidden path="rolAdministradorCapacitacion"/>
    <html:hidden path="rolEjecutivoContratacion"/>
    
    <html:hidden path="postDataCursosContrato" id="postDataCursosContrato"/>
    <html:hidden path="postDataFacturasContrato" id="postDataFacturasContrato"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.registro.altaContrato.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="750" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del contrato</strong></legend>
                    <table align="center" width="70%" border="0">
                        <colgroup>
                            <col width="50%"/>
                            <col width="50%"/>
                        </colgroup>
                        <tbody>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoNumero"/>:</td>
                                <td align="left">
                                    <fsn:input path="contratoCursoNumero"
                                               uppercase="true" 
                                               maxlength="20"
                                               size="60"
                                               css="anchoInputSmall claveContrato"
                                               onkeyup="getValidaContratoDuplicado()"
                                               readonly="${altaContratoDTO.bloquearEdicionContrato}"/>
                                    <span id="contratoDuplicado" style="color: red;"><b>Este n&uacute;mero de contrato ya ha sido registrado.</b></span>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoDesc"/>:</td>
                                <td align="left">
                                    <fsn:textarea path="contratoCursoDesc" 
                                                  rows="5" 
                                                  cols="50" 
                                                  css="anchoTextarea, alphanumericEspacios" 
                                                  readonly="${altaContratoDTO.bloquearEdicionContrato}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.idTipoContratacion"/>:</td>
                                <td align="left">
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapTipoContratacion-altaContrato" 
                                                    path="idTipoContratacion"
                                                    style="width:200px;"
                                                    disabled="${altaContratoDTO.bloquearEdicionContrato}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoRep1"/>:</td>
                                <td align="left">
                                    <fsn:input path="contratoCursoRep1"
                                               uppercase="true" 
                                               maxlength="60"
                                               size="60"
                                               css="anchoInputSmall alphanumericEspacios"
                                               readonly="${altaContratoDTO.bloquearEdicionContrato}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoRep2"/>:</td>
                                <td align="left">
                                    <fsn:input path="contratoCursoRep2"
                                               uppercase="true" 
                                               maxlength="60"
                                               size="60"
                                               css="anchoInputSmall alphanumericEspacios"
                                               readonly="${altaContratoDTO.bloquearEdicionContrato}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoRep3"/>:</td>
                                <td align="left">
                                    <fsn:input path="contratoCursoRep3"
                                               uppercase="true" 
                                               maxlength="60"
                                               size="60"
                                               css="anchoInputSmall alphanumericEspacios"
                                               readonly="${altaContratoDTO.bloquearEdicionContrato}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoAdministrador"/>:</td>
                                <td align="left">
                                    <fsn:input path="contratoCursoAdministrador"
                                               uppercase="true" 
                                               maxlength="60"
                                               size="60"
                                               css="anchoInputSmall alphanumericEspacios"
                                               readonly="${altaContratoDTO.bloquearEdicionContrato}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoMonto"/>:</td>
                                <td align="left">
                                    <fsn:input path="contratoCursoMonto"
                                               uppercase="true" 
                                               maxlength="11"
                                               size="60"
                                               css="anchoInputSmall"
                                               readonly="${altaContratoDTO.bloquearEdicionContrato}"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoFechaAdjud"/>:</td>
                                <td align="left">
                                    <fsn:calendar path="contratoCursoFechaAdjud" readonly="true"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.contratoCursoFechaContr"/>:</td>
                                <td align="left">
                                    <fsn:calendar path="contratoCursoFechaContr" readonly="true"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.altaContrato.idSituacionContrato"/>:</td>
                                <td align="left">
                                    <fsn:filter property="ID_SITUACION_CONTRATO" condition="IN" path="estatusContratos"/>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapSituacionContrato-altaContrato" 
                                                    path="idSituacionContrato"
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
                            <c:if test="${altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion}">
                                <fsn:submit value="submit.save" 
                                            path="registrar"
                                            action="registroCursoSPC/${altaContratoDTO.viewName}.do"
                                            progressBar="true"
                                            alertCode="confirm.spc.capcer.registro.registrarCurso"/> &nbsp;
                            </c:if>
                            <fsn:submit value="submit.cancel" 
                                        action="registroCursoSPC/consultaContrato.do"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        
        <c:if test="${altaContratoDTO.mostrarCursosFacturas}">
            <tr>
                <td valign="middle" height="20px" align="left"> &nbsp; </td>
            </tr>
            <tr align="left">
                <td>
                    <fieldset>
                        <legend style="font-size:1.3em"><strong><c:out value="${altaContratoDTO.seccion}"/></strong></legend>
                        
                        <!-- json -->
                        <table width="100%">
                            <tr>
                                <td align="center" style="padding: 5px;">
                                    <br />
                                    <div style="width:1000px;overflow:auto;">
                                        <table id="listCursosFacturas"></table>
                                        <div id="pagerCursosFacturas"></div>
                                    </div>
                                    <br />
                                </td>
                            </tr>
                        </table>
                        
                        <script type="text/javascript">
                            // Reversa Fechas
                            function reverseContratoCursoFecha() {
                                var onewayIni = $j('#text_contratoCursoFechaAdjud').val();
                                var piecesIni = onewayIni.split('/');
                                var reversedIni = piecesIni.reverse().join('/');
                                return reversedIni;
                            }
                            
                            // Grid principal
                            var grid = $j('#listCursosFacturas');
                            
                            // Parametros
                            var contrato = '<c:out value="${altaContratoDTO.idContratoCurso}"/>';
                            var situacionContrato = <c:out value="${altaContratoDTO.idSituacionContrato}"/>;
                            var rolAdministradorCapacitacion = '<c:out value="${altaContratoDTO.rolAdministradorCapacitacion}"/>';
                            var fechaContrato = reverseContratoCursoFecha();
                            
                            // Validacion - Deshabilitar campo de fecha
                            if (situacionContrato > 5) {
                                $j("#text_contratoCursoFechaAdjud").prop("disabled", 'true');
                                $j("#button_contratoCursoFechaAdjud").prop("disabled", 'true');
                            }
                            
                            // Cursos
                            if (situacionContrato == 2 || situacionContrato == 3 || situacionContrato == 4 || situacionContrato == 5) {
                                grid.jqGrid({
                                    url: 'jsonCallbackCursosFacturas.do?contrato=' + contrato + '&situacionContrato=' + situacionContrato + '&fechaContrato=' + fechaContrato, 
                                    datatype: 'json',
                                    colNames: [
                                        'Selecci&oacute;n',
                                        'No.',
                                        'ID Curso',
                                        'Coordinaci&oacute;n',
                                        'Curso',
                                        'Contrato',
                                        'Periodo',
                                        'Eje Tem&aacute;tico',
                                        'Subprograma',
                                        'Duraci&oacute;n',
                                        'Modalidad',
                                        'Finalidad',
                                        'Estatus Curso'
                                    ],
                                    colModel: [
                                        {name: 'seleccion',     index: 'seleccion',     width: 60, align: "center", editable: true, edittype: 'checkbox', 
                                            editoptions: {value: "True:False"}, 
                                            formatter: "checkbox", 
                                            formatoptions: {disabled: false}, 
                                            search: false},
                                            
                                        {name: 'no',                index: 'no',                width: 70, align: "right", sortable: true, sorttype: "text", search: true},
                                        {name: 'idCurso',           index: 'idCurso',           width: 70, align: "right", sortable: true, sorttype: "text", search: true},
                                        
                                        {name: 'coordinacion',  index: 'coordinacion',  width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'curso',         index: 'curso',         width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'contrato',      index: 'contrato',      width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'periodo',       index: 'periodo',       width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'ejeTematico',   index: 'ejeTematico',   width: 170, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'subprograma',   index: 'subprograma',   width: 130, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'duracion',      index: 'duracion',      width: 150, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'modalidad',     index: 'modalidad',     width: 100, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'finalidad',     index: 'finalidad',     width: 150, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'estatusCurso',  index: 'estatusCurso',  width: 150, align: "left", sortable: true, sorttype: "text", search: true}
                                    ],
                                    rowNum: "10",
                                    multiselect: false,
                                    pager: '#pagerCursosFacturas',
                                    viewrecords: true,
                                    loadonce: true,
                                    loadComplete: function() {
                                        var $jthis = $j(this), ids = $jthis.jqGrid('getDataIDs'), i, l = ids.length;
                                        for (i = 0; i < l; i++) {
                                            $jthis.jqGrid('editRow', ids[i], true);
                                            
                                            var numeroContrato = grid.jqGrid('getCell',ids[i],'contrato');
                                            var numeroContrato2 = numeroContrato.split(" - ");
                                            
                                            // Validacion tipo de rol
                                            if (rolAdministradorCapacitacion == "true") {
                                                if (numeroContrato2[0] == contrato) {
                                                    $j("#" + ids[i] + "_seleccion").attr("disabled", false);
                                                }
                                            } else {
                                                if (numeroContrato2[0] == contrato) {
                                                    $j("#" + ids[i] + "_seleccion").attr("disabled", true);
                                                }
                                            }
                                        }
                                    },
                                    rowattr: function (item) {
                                        if (rolAdministradorCapacitacion == "false") {
                                            var numeroContrato = item.contrato.split(" - ");
                                            if (numeroContrato[0] == contrato) {
                                                return {"class": "ui-state-disabled ui-jqgrid-disablePointerEvents"};
                                            }
                                        }
                                    },
                                    beforeSelectRow: function (rowid, e) {
                                        if ($j(e.target).closest("tr.jqgrow").hasClass("ui-state-disabled")) {
                                            return false;   // not allow select the row
                                        }
                                        return true;    // allow select the row
                                    },
                                    height: 200,
                                    gridComplete: function() {
                                        grid.setGridParam({datatype: 'local'});
                                    }
                                });
                            
                            } else {
                                
                                // Facturas
                                grid.jqGrid({
                                    url: 'jsonCallbackCursosFacturas.do?contrato=' + contrato + '&situacionContrato=' + situacionContrato + '&fechaContrato=' + fechaContrato, 
                                    datatype: 'json',
                                    colNames: [
                                        'Selecci&oacute;n',
                                        'No.',
                                        'ID Curso',
                                        'Coordinaci&oacute;n',
                                        'Curso',
                                        'Contrato',
                                        'Periodo',
                                        'Eje Tem&aacute;tico',
                                        'Subprograma',
                                        'Duraci&oacute;n',
                                        'Modalidad',
                                        'Finalidad',
                                        'Estatus Curso',
                                        'Folio',
                                        'Monto',
                                        'Fecha',
                                        'Atenta Nota N&uacute;mero',
                                        'Atenta Nota Fecha',
                                        'Estatus Factura actual',
                                        'Estatus Factura'
                                    ],
                                    colModel: [
                                        {name: 'seleccion',         index: 'seleccion',         width: 60, align: "center", editable: true, edittype: 'checkbox', 
                                            editoptions: {value: "True:False"}, 
                                            formatter: "checkbox", 
                                            formatoptions: {disabled: true}, 
                                            search: false
                                        },
                                        {name: 'no',                index: 'no',                width: 70, align: "right", sortable: true, sorttype: "text", search: true},
                                        {name: 'idCurso',           index: 'idCurso',           width: 70, align: "right", sortable: true, sorttype: "text", search: true},
                                        
                                        {name: 'coordinacion',      index: 'coordinacion',      width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'curso',             index: 'curso',             width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'contrato',          index: 'contrato',          width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'periodo',           index: 'periodo',           width: 200, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'ejeTematico',       index: 'ejeTematico',       width: 170, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'subprograma',       index: 'subprograma',       width: 130, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'duracion',          index: 'duracion',          width: 150, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'modalidad',         index: 'modalidad',         width: 100, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'finalidad',         index: 'finalidad',         width: 150, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'estatusCurso',      index: 'estatusCurso',      width: 150, align: "left", sortable: true, sorttype: "text", search: true},
                                        
                                        {name: 'facturaFolio',      index: 'facturaFolio',      width: 110, align: "left", sortable: true, sorttype: "text", search: true, 
                                            editable: true,
                                            editoptions: { 
                                                dataInit: function (elem) {
                                                    $j(elem).alphanumeric({allow:"-/ "});
                                                }
                                            }
                                        },
                                        {name: 'facturaMonto', index: 'facturaMonto', width: 110, align: "right", search: true, summaryType:'sum', sorttype:'int', 
                                            editable: true,
                                            editoptions: { 
                                                dataInit: function (elem) {
                                                    $j(elem).mask("999999999.99");
                                                }
                                            },
                                            formatter:'currency',   
                                            formatoptions: {decimalSeparator:".", thousandsSeparator: "", decimalPlaces: 2, prefix: "", suffix:"", defaultValue: '0.00'}
                                        },
                                        {name: 'facturaFecha', index: 'facturaFecha', width: 90, align: "left", sortable: true, sorttype: "date", search: true, 
                                            editable: true, 
                                            editoptions: { 
                                                dataInit: function(el) { 
                                                    setTimeout(function() { 
                                                        $j(el).datepicker({dateFormat:"dd/mm/yy"}); 
                                                    }, 200);
                                                }
                                             }
                                        },
                                        {name: 'facturaAtentaNotaNumero', index: 'facturaAtentaNotaNumero', width: 150, align: "left", sortable: true, sorttype: "text", search: true, 
                                            editable: true,
                                            editoptions: { 
                                                dataInit: function (elem) {
                                                    $j(elem).alphanumeric({allow:"-/ "});
                                                }
                                            }
                                        },
                                        {name: 'facturaAtentaNotaFecha', index: 'facturaAtentaNotaFecha', width: 150, align: "left", sortable: true, sorttype: "date", search: true, 
                                            editable: true, 
                                            editoptions: { 
                                                dataInit: function(el) { 
                                                    setTimeout(function() { 
                                                        $j(el).datepicker({dateFormat:"dd/mm/yy"}); 
                                                    }, 200);
                                                }
                                             }
                                        },
                                        {name: 'facturaEstatus', index: 'facturaEstatus', width: 150, align: "left", sortable: true, sorttype: "text", search: true},
                                        {name: 'facturaEstatusDinamica', index: 'facturaEstatusDinamica', width: 200, align: "left", 
                                            editable: true,
                                            edittype: 'select'
                                        }
                                    ],
                                    rowNum: "10",
                                    pager: '#pagerCursosFacturas',
                                    sortname: 'no',
                                    viewrecords: true,
                                    sortorder: "desc",
                                    loadonce: false,
                                    onSelectRow: function (id) {
                                        var idCursoSelected = grid.getRowData(id)['idCurso'];
                                        var facturaFolioSelected = grid.getRowData(id)['facturaFolio'];
                                        
                                        grid.setColProp('facturaEstatusDinamica', { 
                                            editoptions: { 
                                                dataUrl:'jsonCallbackDynamicEstatusFacturas.do?idCurso=' + idCursoSelected + '&idContratoCurso=' + contrato + '&facturaFolio=' + facturaFolioSelected,
                                                buildSelect: function (response) {
                                                    //console.log("response -> " + response);
                                                    
                                                    //var postData = JSON.stringify(response);
                                                    //console.log("postData -> " + postData);
                                                    //var data = typeof response === "string" ? $j.parseJSON(response.responseText) : response, s = "<select>";
                                                    //var data = typeof response === "string" ? response.responseText : response, s = "<select>";
                                                    //var data = response.responseText;
                                                    //var data = JSON.stringify(response.responseText);
                                                    //var data = $j.parseJSON(response.responseText);
                                                    var data = $j.parseJSON(response);
                                                    //console.log("data -> " + data);
                                                    var s = "<select>";
                                                    s += '<option value="0">-- SELECCIONE --<\/option>';
                                                    
                                                    $j.each(data, function () {
                                                        s += '<option value=\"' + this.idSituacionFactura + '\">' + this.idSituacionFactura + ' - ' + this.descSituacionFactura + '<\/option>';
                                                    })
                                                    return s + "<\/select>";
                                                }
                                            }
                                        });
                                    }
                                });
                            }
                            
                            // Configuracion adicional del grid
                            grid.jqGrid('navGrid', '#pagerCursosFacturas', {edit:false,add:false,del:false});
                            grid.jqGrid('inlineNav', '#pagerCursosFacturas');
                            grid.jqGrid('filterToolbar', {searchOnEnter: true, enableClear: false});
                            
                            // Deshabilitar boton aceptar
                            $j("#listCursosFacturas_iladd").hide();
                            
                            // Deshabilitar boton buscar
                            $j("#search_listCursosFacturas").hide();
                            
                            // Deshabilitar boton editar
                            $j("#edit_listCursosFacturas").hide();
                            
                            // Resize
                            $j(window).resize(function() {
                                grid.jqGrid('setGridHeight', "200.0");
                            });
                            
                            // Headers
                            grid.jqGrid('setGroupHeaders', {
                                useColSpanStyle: false,
                                groupHeaders: [
                                    {startColumnName: 'facturaFolio', numberOfColumns: 4, titleText: 'Facturas'}
                                ]
                            });
                            
                            // Funcion para montos
                            $j.fn.digits = function(){ 
                                return this.each(function(){ 
                                    $j(this).text($j(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,")); 
                                });
                            }
                            
                            // Funcion para suma de facturas
                            function sumaFacturas() {
                                //console.log("sumaFacturas");
                                var montoNuevo = 0;
                                var stringFacturas = [];
                                var montoTotalContrato = $j("#contratoCursoMonto").val();
                                
                                var rowData = grid.getRowData();
                                var stringFacturasWithCommas = $j.map(rowData, function (item) { return item.facturaMonto; });
                                //console.log("stringFacturasWithCommas -> " + String(stringFacturasWithCommas));
                                
                                stringFacturas = String(stringFacturasWithCommas).split(',');
                                //console.log("stringFacturas -> " + stringFacturas);
                                
                                $j.each(stringFacturas, function(index, auxMonto) {
                                    //console.log("auxMonto -> " + auxMonto);
                                    montoNuevo = parseFloat(montoNuevo) + parseFloat(auxMonto);
                                });
                                
                                montoNuevo = (isNaN(montoNuevo) ? 0 : montoNuevo);
                                
                                if (montoNuevo >  montoTotalContrato) {
                                    $j("#asignarFacturasButton").prop("disabled",true);
                                    $j("#montoTotalFacturas").text("Total facturas: $ " + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();
                                    alert("El monto total de Facturas ingresadas ha superado el monto del Contrato.");
                                    return false;
                                } else {
                                    $j("#asignarFacturasButton").prop("disabled",false);
                                    $j("#montoTotalFacturas").text("Total facturas: $ " + parseFloat(Math.round(montoNuevo * 100) / 100).toFixed(2)).digits();
                                    return verifyMonto();
                                }
                                return false;
                            }
                            
                            // Funcion para verificar si el monto calculado es correcto
                            function verifyMonto() {
                                var txt;
                                var r = confirm("Es correcta la informaci\u00f3n propocionada?");
                                if (r == true) {
                                    document.forms[0].action = '/sireh/registroCursoSPC/saveFacturasContratos.do';
                                    return true;
                                }
                                return false;
                            }
                        </script>
                        <!-- json -->
                        
                        <c:if test="${altaContratoDTO.rolEjecutivoContratacion}">
                            <script type="text/javascript">
                                // Deshabilitar boton Asignar facturas
                                $j("#asignarFacturasButton").prop("disabled",true);
                                
                                // Deshabilitar boton Eliminar facturas
                                $j("#10003").prop("disabled",true);
                                
                                // Deshabilitar boton Cancelar
                                $j(".ui-icon-cancel").hide();
                            </script>
                        </c:if>
                        <c:if test="${altaContratoDTO.rolAdministradorCapacitacion}">
                            <script type="text/javascript">
                                // Deshabilitar boton Asignar facturas
                                $j("#asignarFacturasButton").prop("disabled",true);
                                
                                // Deshabilitar boton Eliminar facturas
                                $j("#10003").prop("disabled",true);
                                
                                // Deshabilitar boton Cancelar
                                $j(".ui-icon-cancel").hide();
                            </script>
                        </c:if>
                    </fieldset>
                </td>
            </tr>
            
            <c:if test="${altaContratoDTO.idSituacionContrato > 5}">
                <tr>
                    <td valign="middle" height="20px" align="left">
                        <b>&nbsp;</b>
                    </td>
                </tr>
                <tr>
                    <td valign="middle" align="right">
                        <span id="montoTotalFacturas" style="font-size:2em">Total facturas: $ 0.00</span>
                    </td>
                </tr>
            </c:if>
            
            <tr>
                <td valign="middle" height="20px" align="left">
                    <b>&nbsp;</b>
                </td>
            </tr>
            <tr align="center">
                <td>
                    <table width="90%" border="0" align="center">
                        <tr>
                            <td align="center">
                                <c:if test="${(altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion) && altaContratoDTO.registrarCursos}">
                                    <fsn:submit value="submit.contrato.saveCurso" 
                                                action="registroCursoSPC/saveCursosContratos.do"
                                                progressBar="true"
                                                onclick="setJsonCursosContrato()"
                                                alertCode="confirm.spc.capcer.registro.saveCursoFactura"/> &nbsp;
                                </c:if>
                                <c:if test="${(altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion) && altaContratoDTO.registrarCursos}">
                                    <fsn:submit value="submit.contrato.deleteCurso" 
                                                action="registroCursoSPC/deleteCursosContratos.do"
                                                progressBar="true"
                                                onclick="setJsonCursosContrato()"
                                                alertCode="confirm.spc.capcer.registro.deleteCurso"/> &nbsp;
                                </c:if>
                                <c:if test="${(altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion) && altaContratoDTO.registrarFacturas}">
                                    <input id="asignarFacturasButton" 
                                           class="uppercase"
                                           onclick="setJsonFacturasContrato();return sumaFacturas();" 
                                           type="submit" 
                                           alertCode="" 
                                           path="" 
                                           action="/sireh/registroCursoSPC/saveFacturasContratos.do" 
                                           progressType="" 
                                           value="Asignar Facturas"/>&nbsp;
                                </c:if>
                                <c:if test="${(altaContratoDTO.rolAdministradorCapacitacion || altaContratoDTO.rolEjecutivoContratacion) && altaContratoDTO.registrarFacturas}">
                                    <fsn:submit value="submit.contrato.deleteFactura" 
                                                action="registroCursoSPC/deleteFacturasContratos.do"
                                                progressBar="true"
                                                onclick="setJsonFacturasContrato()"
                                                alertCode="confirm.spc.capcer.registro.deleteFactura"/> &nbsp;
                                </c:if>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </c:if>
    </table>
    
    <c:forEach items="${altaContratoDTO.estatusContratos}" var="estatusContratos" varStatus="status">
        <input type="hidden"  name="estatusContratos[<c:out value='${status.index}'/>]" value="<c:out value='${estatusContratos}'/>" />
    </c:forEach>
    
    <script type="text/javascript">
        // Anular enter
        function anularEnter(e) {
          tecla = (document.all) ? e.keyCode : e.which;
          return (tecla != 13);
        }
        
        // Validaciones de campos
        $j(document).ready(function(){            
            $j('.alpha').alpha();
            $j('.alphaEspacios').alpha({allow:" "});
            $j('.alphanumeric').alphanumeric();
            $j('.alphanumericEspacios').alphanumeric({allow:" "});
            $j('.claveContrato').alphanumeric({allow:"-/"});
            $j('.numeric').numeric();
            $j("#contratoCursoMonto").mask("999999999.99");
        });
        
        // Ocultar mensaje de contrato duplicado
        $j("#contratoDuplicado").hide();
        
        // Funcion para validar contrato duplicado
        function getValidaContratoDuplicado() {
            var idContrato = $j("#idContratoCurso").length > 0 ? $j("#idContratoCurso").val() : 0;
            var numeroContrato = $j("#contratoCursoNumero").val();
            
            $j.ajax({
                url: 'getValidaContratoDuplicadoCallback.do',
                type: 'GET',
                data: 'numeroContrato=' + numeroContrato + '&idContrato=' + idContrato,
                success: function(data) {
                    var duplicado = data;
                    if (duplicado == "true") {
                        $j("#contratoDuplicado").show();
                        $j("#10001").attr("disabled","true");
                    } else {
                        $j("#contratoDuplicado").hide();
                        $j("#10001").removeAttr("disabled");
                    }
                }
            });
        }
        
        // Funcion para setear el string json
        function setJsonCursosContrato() {
            var gridData = $j('#listCursosFacturas').getRowData();
            var postData = JSON.stringify(gridData);
            $j('#postDataCursosContrato').val(postData);
        }
        
        // Funcion para setear el string json
        function setJsonFacturasContrato() {
            var gridData = $j('#listCursosFacturas').getRowData();
            var postData = JSON.stringify(gridData);
            $j('#postDataFacturasContrato').val(postData);
        }
        
        // Funcion para validar total de caracteres en textarea
        var characters = 150;
        $j("#contratoCursoDesc").keyup(function(){
            if ($j(this).val().length > characters) {
                $j(this).val($j(this).val().substr(0, characters));
            }
        });
        
    </script>
</html:form>