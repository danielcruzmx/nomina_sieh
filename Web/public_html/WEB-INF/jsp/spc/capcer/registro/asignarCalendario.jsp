<%--@Descripcion: Vista encargada de registrar y editar calendario y horarios--%>
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
    
    #calendar {
        max-width: 1000px;
        margin: 0 auto;
    }
</style>

<html:form modelAttribute="registroCalendarioDTO">
    
    <h1><spring:message code="sireh.label.spc.capcer.registro.asignarCalendario.title"/></h1>
    <p>&nbsp;</p>
    
    <table cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del curso</strong></legend><br/>
                    
                    <table width="100%">
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.cursoClave"/>:</td>
                                <td>
                                    <fsn:label path="cursoClave"/>
                                </td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.descCursoPrincipal"/>:</td>
                                <td>
                                    <fsn:label path="descCursoPrincipal"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.ejeTematico"/>:</td>
                                <td>
                                    <fsn:label path="descEjeTematico"/>
                                </td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.subprograma"/>:</td>
                                <td>
                                    <fsn:label path="descSubprograma"/>
                                </td>  
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.modalidad"/>:</td>
                                <td>
                                    <fsn:label path="descModalidad"/>
                                </td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.finalidad"/>:</td>
                                <td>
                                    <fsn:label path="descFinalidad"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.duracion"/>:</td>
                                <td>
                                    <fsn:label path="cursoDuracion"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.cursoFecIni"/>:</td>
                                <td>
                                    <fsn:calendar path="cursoFecIni" 
                                                  readonly="true"/>
                                </td>
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.cursoFecFin"/>:</td>
                                <td>
                                    <fsn:calendar path="cursoFecFin" 
                                                  readonly="true"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.descSede"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapSede-asignarCalendario" 
                                                    path="idSede"
                                                    style="width:300px;"/>
                                </td>
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.registrarCurso.descAula"/>:</td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapAula-asignarCalendario" 
                                                    path="idAula" 
                                                    style="width:300px;"
                                                    parentPath="idSede" 
                                                    progress="true" 
                                                    onchange="getMaximoCallback();getCalendarCallback()"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td class="label">* <spring:message code="sireh.label.spc.capcer.registro.asignarCalendario.cursoMinimoParticipantes"/>:</td>
                                <td>
                                    <fsn:input path="cursoMinimoParticipantes" 
                                               uppercase="true" 
                                               css="numeric" 
                                               maxlength="3"/>
                                </td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarCalendario.cursoMaximoParticipantes"/>:</td>
                                <td>
                                    <fsn:input path="cursoMaximoParticipantes" 
                                               readonly="true" 
                                               uppercase="true" 
                                               css="numeric" 
                                               maxlength="3"/>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset><br/><br/>
            </td>
        </tr>
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Horarios</strong></legend><br/>
                    
                    <table width="55%">
                        <tbody>
                            <tr align="left">
                                <td><html:checkbox path="dia1" cssClass="box" /></td>
                                <td class="label">* Lun</td>
                                <td class="label">Horario inicial: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioInicialCurso1"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                                <td class="label">Horario final: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioFinalCurso1"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td><html:checkbox path="dia2" cssClass="box"/></td>
                                <td class="label">* Mar</td>
                                <td class="label">Horario inicial: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioInicialCurso2"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                                <td class="label">Horario final: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioFinalCurso2"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td><html:checkbox path="dia3" cssClass="box"/></td>
                                <td class="label">* Mie</td>
                                <td class="label">Horario inicial: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioInicialCurso3"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                                <td class="label">Horario final: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioFinalCurso3"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td><html:checkbox path="dia4" cssClass="box"/></td>
                                <td class="label">* Jue</td>
                                <td class="label">Horario inicial: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioInicialCurso4"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                                <td class="label">Horario final: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioFinalCurso4"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td><html:checkbox path="dia5" cssClass="box"/></td>
                                <td class="label">* Vie</td>
                                <td class="label">Horario inicial: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioInicialCurso5"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                                <td class="label">Horario final: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioFinalCurso5"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td><html:checkbox path="dia6" cssClass="box"/></td>
                                <td class="label">* Sab</td>
                                <td class="label">Horario inicial: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioInicialCurso6"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                                <td class="label">Horario final: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioFinalCurso6"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                            </tr>
                            <tr align="left">
                                <td><html:checkbox path="dia7" cssClass="box"/></td>
                                <td class="label">* Dom</td>
                                <td class="label">Horario inicial: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioInicialCurso7"
                                                    progress="true"
                                                    style="width:120px;"/>
                                </td>
                                <td class="label">Horario final: </td>
                                <td>
                                    <fsn:option key="" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tcCapHorarioCurso-asignarCalendarioPorDia" 
                                                    path="idHorarioFinalCurso7"
                                                    progress="true"
                                                    style="width:120px;"/>
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
                            <fsn:submit value="submit.save" 
                                        action="registroCursoSPC/saveAsignarCalendario.do"
                                        progressBar="true"
                                        alertCode="confirm.spc.capcer.registro.registrarCurso"/> &nbsp;
                            <fsn:submit value="submit.cancel" 
                                        path="cancel"
                                        action="registroCursoSPC/consultaAsignarCalendario.do"
                                        progressBar="true"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td valign="middle" height="20px">&nbsp;</td>
        </tr>
        <tr>
            <td valign="middle" height="20px" align="left">
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Disponibilidad del aula</strong></legend><br/>
                    
                    <!--horarios disponibles-->
                    <div id="calendar"></div>
                    <!--horarios disponibles-->
                    
                </fieldset>
            </td>
        </tr>
    </table>
    <html:hidden path="idCurso" />
    <html:hidden path="idModalidad" />
    <html:hidden path="idFinalidad" />
    <html:hidden path="idSubprograma" />
    <html:hidden path="idControlCurso" />
    <html:hidden path="showHorario" />
    
    <script type="text/javascript">
        // Validaciones
        $j(document).ready(function(){
            $j('.numeric').numeric();
            
            var dia1 = '<c:out value="${registroCalendarioDTO.dia1}"/>';
            var dia2 = '<c:out value="${registroCalendarioDTO.dia2}"/>';
            var dia3 = '<c:out value="${registroCalendarioDTO.dia3}"/>';
            var dia4 = '<c:out value="${registroCalendarioDTO.dia4}"/>';
            var dia5 = '<c:out value="${registroCalendarioDTO.dia5}"/>';
            var dia6 = '<c:out value="${registroCalendarioDTO.dia6}"/>';
            var dia7 = '<c:out value="${registroCalendarioDTO.dia7}"/>';
            
            if(dia1 == 'false'){
                disableCheck(1);
            }
            if(dia2 == 'false'){
                disableCheck(2);
            }
            if(dia3 == 'false'){
                disableCheck(3);
            }
            if(dia4 == 'false'){
                disableCheck(4);
            }
            if(dia5 == 'false'){
                disableCheck(5);
            }
            if(dia6 == 'false'){
                disableCheck(6);
            }
            if(dia7 == 'false'){
                disableCheck(7);
            }
            
            var disableHorario = '<c:out value="${not registroCalendarioDTO.showHorario}"/>';
            if(disableHorario == 'true'){
                $j('#dia11').attr('disabled', disableHorario);
                $j('#dia21').attr('disabled', disableHorario);
                $j('#dia31').attr('disabled', disableHorario);
                $j('#dia41').attr('disabled', disableHorario);
                $j('#dia51').attr('disabled', disableHorario);
                $j('#dia61').attr('disabled', disableHorario);
                $j('#dia71').attr('disabled', disableHorario);
            }            
        });
        
        
        
        // Obtiene el calendario de horarios disponibles
        function getCalendarCallback(){
            var idAula = $j('select[id="idAula"]').val();
            
            $j.ajax({
                url: 'getCalendarCallback.do',
                type: 'GET',
                data: 'idAula=' + idAula,
                success: function(data) {
                    var data2 = $j.parseJSON(data);
                    //console.log("data2 -> " + data2);
                    $j('#calendar').fullCalendar('destroy');
                    renderCalendar(data2);
                }
            });
        }
        
        function renderCalendar(jsonString) {
            $j('#calendar').fullCalendar({
                contentHeight: 430,
                allDaySlot: false,
                header: {
                    left: 'prev,next today',
                    center: 'title',
                    right: 'month,agendaWeek,agendaDay',
                },
                minTime: '08:00:00',
                maxTime: '22:00:00',
                lang: 'es',
                buttonIcons: false, // show the prev/next text
                weekNumbers: false,
                editable: false,
                eventLimit: true, // allow "more" link when too many events
                events: jsonString
            });
        }
        
        // Obtiene el maximo de participantes
        function getMaximoCallback() {
            var idAula = $j('select[id="idAula"]').val();
            $j.ajax({
                url: 'getMaximoCallback.do',
                type: 'GET',
                data: 'idAula=' + idAula,
                success: function(data) {
                    $j('#cursoMaximoParticipantes').val(data);
                }
            });
        }
        
        function getAulasCallback(verify) {
            var idSede = $j('select[id="idSede"]').val();
            if (idSede != null && idSede != "") {
                $j.ajax({
                    url: 'getAulasCallback.do',
                    type: 'GET',
                    data: 'idSede=' + idSede,
                    success: function(data) {
                        $j('select[id="idAula"]').find('option').remove().end();
                        $j('select[id="idAula"]').append(data);
                        if (verify) {
                            verifyAula();
                        }
                    }
                });
            }
        }
        
        function verifyAula() {
            var idAula = '<c:out value="${registrarCursoDTO.idAula}"/>';
            if (idAula != null && idAula != "") {
                $j("#idAula option[value=" + idAula +"]").attr("selected","selected");
            }
        }
        
        $j('.box').change(function(){ 
            var idCheckBox = (this.id);
            var index = idCheckBox.charAt(idCheckBox.length - 2);
            if(this.checked){
                $j("#idHorarioInicialCurso" + index).removeAttr('disabled');
                $j("#idHorarioFinalCurso" + index).removeAttr('disabled');
            } else {
                $j("#idHorarioInicialCurso" + index).attr('disabled','true');
                $j("#idHorarioFinalCurso" + index).attr('disabled','true');
                $j("#idHorarioInicialCurso" + index).val('');
                $j("#idHorarioFinalCurso" + index).val('');
            }
        });
        
        function disableCheck(index){
            $j("#idHorarioInicialCurso" + index).attr('disabled','true');
            $j("#idHorarioFinalCurso" + index).attr('disabled','true');
        }
    </script>

</html:form>