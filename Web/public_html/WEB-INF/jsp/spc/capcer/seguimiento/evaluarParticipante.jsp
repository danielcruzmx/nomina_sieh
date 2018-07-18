<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html:form modelAttribute="evaluarParticipanteDTO">
    <html:hidden path="postData" id="postData" />
    <html:hidden path="urlOrigen" id="urlOrigen" />
    <html:hidden path="urlDestino" id="urlDestino" />
    <html:hidden path="urlValidar" id="urlValidar" />
    <html:hidden path="idCurso" id="idCurso" />
    <html:hidden path="rolEjecutivoContratacion"/>
    <html:hidden path="rolAdministradorCapacitacion"/>
    
    
    <h1><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del curso</strong></legend>
                    <table width="99%" align="center">
                        <tbody>
                            <tr><td>&nbsp;</td></tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.cursoClave"/>:</td>
                                <td align="left"><fsn:label path="cursoClave"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.descCursoPrincipal"/>:</td>
                                <td align="left"><fsn:label path="cursoPrincipal"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.descSubprograma"/>:</td>
                                <td align="left"><fsn:label path="subPrograma"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.ejeTematico"/>:</td>
                                <td align="left"><fsn:label path="ejeTematico"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.modalidad"/>:</td>
                                <td align="left"><fsn:label path="modalidad"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.finalidad"/>:</td>
                                <td align="left"><fsn:label path="finalidad"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.cursoDuracion"/>:</td>
                                <td align="left"><fsn:label path="duracion"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.cursoMinimoParticipantes"/>:</td>
                                <td align="left"><fsn:label path="minimoParticipantes"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.fechaInicio"/>:</td>
                                <td align="left"><fsn:label path="fechaInicio"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.cursoFecFin"/>:</td>
                                <td align="left"><fsn:label path="fechaFin"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.descSede"/>:</td>
                                <td align="left"><fsn:label path="sede"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.descAula"/>:</td>
                                <td align="left"><fsn:label path="aula"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.seguimientoControl.evaluarParticipante.descHorarioCurso"/>:</td>
                                <td align="left"><fsn:label path="horario"/></td>
                           </tr>                           
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/>
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Registro de calificaciones</strong></legend>
                    <table width="100%" align="center">
                        <tr>
                            <td align="center"><br/>
                                <div style="width:100%;overflow:auto;">
                                    <table id="frmac"></table>
                                    <div id="pfrmac"></div>
                                </div>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <c:out value="${evaluarParticipanteDTO.idJerarquia}"/>
    <table align="center" width="100%">
        <tr>
            <td align="right" width="45%">
                <c:if test="${evaluarParticipanteDTO.rolAdministradorCapacitacion || evaluarParticipanteDTO.rolOperadorCapacitacion}">
                    <fsn:submit value="submit.salvar.cambios" 
                                onclick="setJson()" 
                                action="seguimientoCursoSPC/${evaluarParticipanteDTO.urlDestino}"/>
                </c:if>
            </td>
            <td width="10%">&nbsp;</td>
            <td align="left" width="45%">
                <fsn:submit value="submit.cancelar.cambios.regrsar" 
                            action="seguimientoCursoSPC/${evaluarParticipanteDTO.urlOrigen}"/>
            </td>
        </tr>
    </table>
    <script type="text/javascript">
        $j("#10001").attr('disabled','true');
        
        // Objeto json
        var jsonDataString = '<c:out value="${evaluarParticipanteDTO.jsonDataString}"/>';
        jsonDataString = jsonDataString.replace(/&#034;/g,'"');
        
        $j("#frmac").jqGrid({
            datatype: "jsonstring",
            datastr: jsonDataString,
            colNames:[' Operacion ', 'Nivel', 'RFC', 'Nombre', 'Primer apellido', 'Segundo apellido','Asistencia','Calificacion inicial','Calificacion final', 'Estatus'],
            colModel:[{name: 'myac', width:60, sortable:false, formatter:'actions', align:"center", 
                        formatoptions:{
                                keys:true,
                                delbutton: false,
                                afterSave: function(e){
                                    $j("#10001").removeAttr('disabled');
                                   var rowId = $j("#frmac").jqGrid('getGridParam','selrow');  
                                   var rowData = $j("#frmac").getRowData(rowId);
                                   var auxJerarquia  = rowData['jerarquia'];
                                   var auxJerarquia2 = auxJerarquia.split(" - ");
                                   var auxAsistencia = rowData['asistencia'];
                                   var auxCalInicial = rowData['calificacionInicial'];
                                   var auxCalFinal = rowData['calificacionFinal'];
                                   //console.log("|"+auxJerarquia2[0]+"|");
                                   
                                   if(auxJerarquia2[0] == 7){//operativo
                                      if(auxAsistencia >= 90){
                                        if(auxCalFinal == 0){
                                            $j("#frmac").jqGrid('setCell',rowId,'estatus', 'CAPACITADO');
                                        }
                                        else if(auxCalFinal >= 1 && auxCalFinal < 70){
                                            $j("#frmac").jqGrid('setCell',rowId,'estatus', 'REPROBADO');
                                        }
                                        else if(auxCalFinal >= 70 && auxCalFinal <= 100){
                                            $j("#frmac").jqGrid('setCell',rowId,'estatus', 'APROBADO');       
                                        }
                                      }
                                      else { // Aviso ?
                                      }
                                    } // mandos
                                    else if((auxJerarquia2[0] >= 1 && auxJerarquia2[0] < 7) || (auxJerarquia2[0] > 7 && auxJerarquia2[0] <= 9)){
                                      if(auxAsistencia >= 80){
                                      
                                        if(auxCalFinal == 0){
                                            $j("#frmac").jqGrid('setCell',rowId,'estatus', 'CAPACITADO');
                                        }
                                        else if(auxCalFinal >= 1 && auxCalFinal < 70){
                                            $j("#frmac").jqGrid('setCell',rowId,'estatus', 'REPROBADO');
                                        }
                                        else if(auxCalFinal >= 70 && auxCalFinal <= 100){
                                            $j("#frmac").jqGrid('setCell',rowId,'estatus', 'APROBADO');       
                                        }
                                      }
                                      else {//AVISO ?
                                      }
                                    }
                                
                                    
                                },
                                onEdit: function(e){
                                    $j("#10001").attr('disabled','true');
                                }
                            } 
                        },
                    {name:'jerarquia', index:'jerarquia', width:90, align:"left" },
                    {name:'rfc', index:'rfc', width:90, fixed:true},
                    {name:'nombre',index:'nombre', width:90},
                    {name:'primerApellido', index:'primerApellido', width:90},
                    {name:'segundoApellido',index:'segundoApellido', width:90, align:"left"},
                    {name:'asistencia', index:'asistencia', width:50, align:"center", editable:true, formattype:'integer',
                        editoptions:{
                            dataEvents:[{
                                type: 'keypress', fn: function(e){
                                    var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
                                    return ((tecla > 47 && tecla < 58) || tecla == 46);
                                }
                            }]
                        }
                    },
                    {name:'calificacionInicial',index:'calificacionInicial', width:80,align:"center", editable:true, formattype:'integer',
                        editoptions:{
                            dataEvents:[{
                                type: 'keypress', fn: function(e){
                                    var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
                                    return ((tecla > 47 && tecla < 58) || tecla == 46);
                                }
                            }]
                        }
                    },
                    {name:'calificacionFinal',index:'calificacionFinal', width:80, align:"center", editable:true, formattype:'integer',
                        editoptions:{
                            dataEvents:[{
                                type: 'keypress', fn: function(e){
                                    var tecla= document.all ? tecla = e.keyCode : tecla = e.which;
                                    return ((tecla > 47 && tecla < 58) || tecla == 46);
                                }
                            }]
                        }
                    },
                    {name:'estatus',index:'estatus', width:80, editable:true, align:"left", edittype:'select',
                        editoptions:{ 
                            dataUrl: 'jsonCallbackEstatusEvaluacionParticipante.do'
                        }
                    }
            ],
            rowNum:10,
            width:1000,
            rowList:[10,20,30],
            pager: '#pfrmac',
            sortname: 'nombre',
            viewrecords: true,
            sortorder: "desc",
            jsonReader: { repeatitems : true },
            editurl: 'jsonRequestCalificaciones.do',
            caption: "Calificaciones",
            height: '100%'
        });
        $j("#kfrmac").jqGrid('navGrid','#pfrmac',{edit:false,add:false,del:false});
        grid.jqGrid('inlineNav', '#pfrmac');
        
        // Asignar json
        function setJson() {
            var gridData = $j('#frmac').getRowData();
            var postData = JSON.stringify(gridData);
            $j('#postData').val(postData);
        }
        
    </script>
</html:form>