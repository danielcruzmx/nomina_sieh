<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn"%>
<style type="text/css">
    #listaNominasQnaPorQna .pagelinks {
        display:none;
    }
    .columnHeader {
        background-color: rgb(109, 109, 109);
        color: rgb(255, 255, 255);
        font-weight: bold;
        text-align: center;
    }
</style>

<html:form modelAttribute="conceptosPagNomExtraDTO" onkeypress="return anularEnter(event)">

    <html:hidden path="descGrupoPago"/>
    <html:hidden path="idQna"/>
    <html:hidden path="idNomina"/>
    <html:hidden path="postData" id="postData" />
    <html:hidden path="cnqIniPago" id="cnqIniPago" />
    <html:hidden path="cnqFinPago" id="cnqFinPago" />
    <html:hidden path="status" id="status" />
    <html:hidden path="idGrupoPago" id="idGrupoPago" />
    <html:hidden path="nomQnaCaptura" id="nomQnaCaptura" />
    <html:hidden path="nomNumComplem" id="nomNumComplem" />
    <html:hidden path="descNomina" id="descNomina" />
    <html:hidden path="nomDescTipoNomina" id="nomDescTipoNomina" />
    <html:hidden path="nomDescGrupoPago" id="nomDescGrupoPago" />
    <html:hidden path="periodoPago" id="periodoPago" />
    <html:hidden path="idEdoNom" id="idEdoNom" />
    <html:hidden path="conceptos" id="conceptos" />
    <html:hidden path="idTipoNomina" />
    
    <%--Titulo--%>
    <c:choose>
        <c:when test="${conceptosPagNomExtraDTO.idTipoNomina eq 'SA'}">
            <h1><spring:message code="sireh.label.nomina.tercero.aportacion.conceptosPagados.titulo"/></h1>
        </c:when>
        
        <c:when test="${conceptosPagNomExtraDTO.idTipoNomina eq 'AG'}">
            <h1><spring:message code="sireh.label.calculo.nomina.extraOrdinaria.aguinaldo.conceptosPagados.titulo"/></h1>
        </c:when>
        
        <c:when test="${conceptosPagNomExtraDTO.idTipoNomina eq 'EX'}">
            <c:if test="${conceptosPagNomExtraDTO.tipoExtraordinaria eq 'S'}">
                <h1><spring:message code="sireh.label.calculo.nomina.extraOrdinaria.sueldos.conceptosPagados.titulo"/></h1>
            </c:if>
            <c:if test="${conceptosPagNomExtraDTO.tipoExtraordinaria eq 'P'}">
                <h1><spring:message code="sireh.label.calculo.nomina.extraOrdinaria.perseverancia.conceptosPagados.titulo"/></h1>
            </c:if>
        </c:when>
        <c:when test="${conceptosPagNomExtraDTO.idTipoNomina eq 'FO'}">
            <h1><spring:message code="sireh.label.calculo.nomina.fonac.finciclo.conceptosPagados.titulo"/></h1>
        </c:when>
        <c:when test="${conceptosPagNomExtraDTO.idTipoNomina eq 'FE'}">
            <h1><spring:message code="sireh.label.calculo.nomina.fonac.anticipada.conceptosPagados.titulo"/></h1>
        </c:when>
        <c:otherwise>
            <h1>
                <spring:message code="sireh.label.calculo.nomina" /><spring:message code="sireh.label.guion" />
                <spring:message code="sireh.label.extraOrdinaria" /><spring:message code="sireh.label.guion" />
                <spring:message code="sireh.label.personal" /><spring:message code="sireh.label.guion" />
                <spring:message code="sireh.label.conceptos.pagados" />
            </h1>
        </c:otherwise>
    </c:choose>
    <br>
    
    <table align="center" width="100%" border="0">
        <tr>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.qnaCaptura"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.numComplem"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.desc"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.tipoNomina"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.grupoPago"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.periodoPago"/></td>
            <td class="columnHeader"><spring:message code="sireh.label.nomina.gestion.consulta.parametros.status"/></td>
        </tr>
        <tr>
            <td class="label" style="text-align: center;"><c:out value="${conceptosPagNomExtraDTO.nomQnaCaptura}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${conceptosPagNomExtraDTO.nomNumComplem}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${conceptosPagNomExtraDTO.descNomina}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${conceptosPagNomExtraDTO.nomDescTipoNomina}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${conceptosPagNomExtraDTO.nomDescGrupoPago}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${conceptosPagNomExtraDTO.periodoPago}"/></td>
            <td class="label" style="text-align: center;"><c:out value="${conceptosPagNomExtraDTO.idEdoNom}"/></td>
        </tr>
    </table>
    
    <table align="center" width="100%" border="0">
        <tr>    
            <td>
                <fieldset>
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.datosDelEmpleado"/></strong></legend>
                    <table align="center" width= "100%" border="0">
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombreEmpleado"/></td>
                            <td style="width:200px;"><fsn:label path="nombreEmpleado"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.primerApellido"/></td>
                            <td style="width:200px;"><fsn:label path="primerApellido"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.segundoApellido"/></td>
                            <td style="width:200px;"><fsn:label path="segundoApellido"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.rfc"/></td>
                            <td style="width:200px;"><fsn:label path="rfcEmpleado"/></td>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.descTipoPago"/></td>
                            <td style="width:200px;"><fsn:label path="descTipoPago"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.ordinaria.conceptosPagados.grupoInfo.datosDeLaPlaza"/></strong></legend>
                    <table align="center" width= "100%" border="0">
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPlaza"/></td>
                            <td style="width:200px;"><fsn:label path="idPlaza"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idPuestoNom"/></td>
                            <td style="width:200px;"><fsn:label path="idPuestoNom"/></td>
                            <td style="width:150px;"align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.idZonaDistNom"/></td>
                            <td style="width:200px;"><fsn:label path="idZonaDistNom"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label" style="width:150px;"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.grupoPago"/></td>
                            <td style="width:200px;"><fsn:label path="descGrupoPago"/></td>
                            <td style="width:150px;" align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nivelPto"/></td>
                            <td style="width:200px;"><fsn:label path="idNivelPto"/></td>
                        </tr>
                        <tr>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.nombramiento"/></td>
                            <td style="width:200px;"><fsn:label path="descNombramiento"/></td>
                            <td align="left" class="label"><spring:message code="sireh.label.nomina.calculo.ordinaria.consultaPorRFC.jerarquia"/></td>
                            <td style="width:200px;"><fsn:label path="descJerarquia"/></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <table align="center" width="100%" border="0">
        <tr>    
            <td>
                <fieldset>
                    <legend><strong><spring:message code="sireh.label.nomina.calculo.extraordinaria.titulo.conceptos"/></strong></legend>
                    <table width="100%">
                        <tr>
                            <td align="center">
                                <br/>
                                <div style="width:1000px;overflow:auto;">
                                    <table id="jqGridTable"></table>
                                    <div id="jqGridPagger"></div>
                                </div>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table align="center" width="100%">
        <tr>
            <td align="right" width="45%"><fsn:submit value="submit.accept" onclick="setJson()" action="calculoNominaExt/jsonRequestConceptos.do"/></td>
            <td width="10%">&nbsp;</td>
            <td align="left" width="45%"><fsn:submit value="submit.cancel" action="calculoNominaExt/regresarPantallaAnterior.do"/></td>
        </tr>
    </table>
    
    <script type="text/javascript">
        var idTipoNomina = '<c:out value="${conceptosPagNomExtraDTO.idTipoNomina}"/>';
        var idNombramiento = '<c:out value="${conceptosPagNomExtraDTO.idNombramiento}"/>';
        
        if(idTipoNomina == 'FO' || idTipoNomina == 'FE' ){
            idTipoNomina = idTipoNomina + idNombramiento;
        }
        
        // Anular enter
        function anularEnter(e) {
          tecla = (document.all) ? e.keyCode : e.which;
          return (tecla != 13);
        }
        
        // Objeto json
        var jsonDataString = '<c:out value="${conceptosPagNomExtraDTO.jsonDataString}"/>';
        jsonDataString = jsonDataString.replace(/&#034;/g,'"');
        
        // Opciones para eliminar
        var lastSel, grid = $j('#jqGridTable'), delSettings = {
            onclickSubmit: function(options) { //, rowid) {
                var grid_id = grid[0].id,
                    grid_p = grid[0].p,
                    newPage = grid_p.page,
                    rowids = grid_p.multiselect? grid_p.selarrrow: [grid_p.selrow];
                options.processing = true;
                
                $j.each(rowids, function () {
                    grid.delRowData(this);
                });
                
                $j.jgrid.hideModal('#delmod' + grid_id,{gb:'#gbox_' + grid_id,jqm:options.jqModal, onClose:options.onClose});
    
                if (grid_p.lastpage > 1) {
                    if (grid_p.reccount === 0 && newPage === grid_p.lastpage) {
                        newPage--;
                    }
                    grid.trigger('reloadGrid', [{page:newPage}]);
                }
                return true;
            },
            processing:true
        };
                
        // Inicializar componente
        if (idTipoNomina == 'SA') {
            grid.jqGrid({
                height: '100%',
                datatype: 'jsonstring',
                datastr: jsonDataString,
                colNames: ['Tipo', 'Concepto', 'Monto'],
                colModel:[
                    {
                        name:'idTipoCpto', index:'idTipoCpto', width:150, editable:true, align:'center', edittype:'select', 
                        editoptions:{
                            dataUrl: 'jsonCallbackTipoConcepto.do?idTipoNomina=' + idTipoNomina,
                            dataEvents: [
                                {
                                    type: 'change', fn: function(e) {
                                        $j.ajax({               
                                            type : 'GET',
                                            url : 'jsonCallbackConceptosByTipoConcepto.do',
                                            traditional : true,
                                            data: 'tipoConcepto=' + this.value + '&idTipoNomina=' + idTipoNomina,
                                            success : function(data){
                                                if (getBrowser() == 'MSIE') {
                                                    $j('#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').find('option').remove().end();
                                                    $j('#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').append(data);
                                                } else {
                                                    $j('select#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').find('option').remove().end();
                                                    $j('select#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').append(data);
                                                }
                                            }
                                        });
                                    }
                                }
                            ]
                        }
                    },
                    {
                        name:'concepto', index:'concepto', width:370, editable:true, align:'center', edittype: 'select',
                        editoptions:{
                            dataUrl: 'jsonCallbackConceptosByTipoConcepto.do?tipoConcepto=' + '&idTipoNomina=' + idTipoNomina
                        }
                    },
                    {name:'control', index:'control', width:150, editable:true, align:'right', summaryType:'sum', sorttype:'int', formatter:'currency', formatoptions:{ prefix:'', suffix:'', thousandsSeparator:','}}
                ],
                rowNum: 30,
                pager: '#jqGridPagger',
                gridview: true,
                rownumbers: false,
                autoencode: true,
                ignoreCase: true,
                sortname: 'tipo',
                viewrecords: true,
                sortorder: 'desc',
                caption: 'Conceptos',
                editurl: 'jsonRequestConceptos.do',
                onSelectRow: function(id) {
                    if (id && id !== lastSel) {
                        if (typeof lastSel !== 'undefined') {
                            grid.jqGrid('restoreRow', lastSel);
                        }
                        lastSel = id;
                    }
                },
                footerrow: true,
                userDataOnFooter: true,
                gridComplete: function() {
                    var colSumP = grid.jqGrid('getCol', 'control', true, 'sum');
                    grid.jqGrid('footerData', 'set', {'control': colSumP});
                }
            });
        } else {
            // Construir combo
            var buildSelect = function () {
                var html = '';
                for (var i = 0; i < 100; i++) {
                    if (i == 99) {
                        html += i + ':' + i;
                    } else {
                        html += i + ':' + i + ';';
                    }
                }
                html += '';
                return html;
            };
        
            grid.jqGrid({
                height: '100%',
                datatype: 'jsonstring',
                datastr: jsonDataString,
                colNames: ['Tipo', 'Concepto', 'Beneficiario', 'Percepciones', 'Deducciones'],
                colModel:[
                    {
                        name:'idTipoCpto', index:'idTipoCpto', width:150, editable:true, align:'center', edittype:'select', 
                        editoptions:{
                            dataUrl: 'jsonCallbackTipoConcepto.do?idTipoNomina=' + idTipoNomina,
                            dataEvents: [
                                {
                                    type: 'change', fn: function(e) {
                                        $j.ajax({               
                                            type : 'GET',
                                            url : 'jsonCallbackConceptosByTipoConcepto.do',
                                            traditional : true,
                                            data: 'tipoConcepto=' + this.value + '&idTipoNomina=' + idTipoNomina,
                                            success : function(data){
                                                if (getBrowser() == 'MSIE') {
                                                    $j('#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').find('option').remove().end();
                                                    $j('#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').append(data);
                                                } else {
                                                    $j('select#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').find('option').remove().end();
                                                    $j('select#' + grid.jqGrid('getGridParam', 'selrow') + '_concepto').append(data);
                                                }
                                            }
                                        });
                                    }
                                }
                            ]
                        }
                    },
                    {
                        name:'concepto', index:'concepto', width:370, editable:true, align:'center', edittype: 'select',
                        editoptions:{
                            dataUrl: 'jsonCallbackConceptosByTipoConcepto.do?tipoConcepto=' + '&idTipoNomina=' + idTipoNomina
                        }
                    },
                    {name:'beneficiario', index:'beneficiario', width:150, editable:true, align:'center', edittype: 'select', editoptions: {value:buildSelect} },
                    {name:'percepciones', index:'percepciones', width:150, editable:true, align:'right', summaryType:'sum', sorttype:'int', formatter:'currency', formatoptions:{ prefix:'', suffix:'', thousandsSeparator:','}},
                    {name:'deducciones', index:'deducciones', width:150, editable:true, align:'right', summaryType:'sum', sorttype:'int', formatter:'currency', formatoptions:{ prefix:'', suffix:'', thousandsSeparator:','}}
                ],
                rowNum: 30,
                pager: '#jqGridPagger',
                gridview: true,
                rownumbers: false,
                autoencode: true,
                ignoreCase: true,
                sortname: 'tipo',
                viewrecords: true,
                sortorder: 'desc',
                caption: 'Conceptos',
                editurl: 'jsonRequestConceptos.do',
                onSelectRow: function(id) {
                    if (id && id !== lastSel) {
                        if (typeof lastSel !== 'undefined') {
                            grid.jqGrid('restoreRow', lastSel);
                        }
                        lastSel = id;
                    }
                },
                footerrow: true,
                userDataOnFooter: true,
                gridComplete: function() {
                    var colSumP = grid.jqGrid('getCol', 'percepciones', true, 'sum');
                    var colSumD = grid.jqGrid('getCol', 'deducciones', true, 'sum');
                    var resta = colSumP - colSumD;
                    grid.jqGrid('footerData', 'set', {'deducciones': resta});
                }
            });
        }
        grid.jqGrid('navGrid', '#jqGridPagger', {edit:false,add:false,del:true}, delSettings);
        grid.jqGrid('inlineNav', '#jqGridPagger');
        
        // Deshabilitar boton Aceptar
        $j("#10001").prop("disabled",true);
        
        // Habilitar boton aceptar
        $j('.ui-icon-disk').click(function(){
            $j("#10001").prop("disabled",false);
        });
        
        $j('.ui-icon-trash').click(function(){
            $j("#10001").prop("disabled",false);
        });
        
        // Deshabilitar boton editar
        $j("#jqGridTable_iledit").hide();
        
        // Obtener fila seleccionada
        function getSeleccionado(id) {
            var seleccionado;
            if (getBrowser() == 'MSIE') {
                seleccionado = $j('select[id="' + id + '_idTipoCpto"]').val();
            } else {
                seleccionado = $j('select[id="' + id + '_idTipoCpto"]').val();
            }
            //console.log(seleccionado);
            return seleccionado;
        }
        
        // Verificar browser
        function getBrowser(){
            var N=navigator.appName, ua=navigator.userAgent, tem;
            var M=ua.match(/(opera|chrome|safari|firefox|msie)\/?\s*(\.?\d+(\.\d+)*)/i);
            if(M && (tem= ua.match(/version\/([\.\d]+)/i))!= null) M[2]= tem[1];
            M=M? [M[1], M[2]]: [N, navigator.appVersion, '-?'];
            return M[0];
        }
        
        // Asignar json
        function setJson() {
            var gridData = $j('#jqGridTable').getRowData();
            var postData = JSON.stringify(gridData);
            $j('#postData').val(postData);
        }
        
        // Boton enviar
        $j("#sendButton").click(function(){
            var gridData = $j('#jqGridTable').getRowData();
            var postData = JSON.stringify(gridData);
            //console.log("JSON serialized jqGrid data:\n" + postData);
            
            $j.ajax({
                url: 'jsonRequestConceptos.do',
                type: 'GET',
                data: 'postData=' + postData,
                dataType:'local',
                contentType: 'application/json; charset=utf-8',
                success: function(response, textStatus, xhr) {
                    //console.log("success");
                },
                error: function(xhr, textStatus, errorThrown) {
                    //console.log("error");
                }
            });
        });
        
        // Construir combo apartir de objeto json
        var buildSelectFromJson = function (data) {
            var html = '<select>', d = data.d, length = d.length, i = 0, item;
            for (var i = 0; i < length; i++) {
                item = d[i];
                html += '<option value="' + item.id + '">' + item.value + '</option>';
            }
            html += '</select>';
            return html;
        };
    </script>
</html:form>