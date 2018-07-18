<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html:form modelAttribute="secuenciaInstructorDTO">
    
    <h1><spring:message code="sireh.label.spc.capcer.reportes.general.secuenciaInstructor.detalle"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.2em"><strong>Datos del curso</strong></legend>
                    <table width="100%" border="0">
                        <tbody>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.tipoCurso"/>:</td>
                                <td><b><fsn:input path="descTipoCurso" readonly="true" size="40"/></b></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.claveCurso"/>:</td>
                                <td><fsn:input path="ClaveCurso" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.nombreCurso"/>:</td>
                                <td><fsn:input path="descCursoPrincipal" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.subPrograma"/>:</td>
                                <td><fsn:input path="descSubPrograma" readonly="true" size="40"/></td>
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
                                <td><fsn:input path="cursoParticipantes" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.fechaInicio"/>:</td>
                                <td><fsn:input path="cursoFecIni" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.fechaTermino"/>:</td>
                                <td><fsn:input path="cursoFecFin" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.sede"/>:</td>
                                <td><fsn:input path="descSedeCurso" readonly="true" size="40"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.aula"/>:</td>
                                <td><fsn:input path="descAulaCurso" readonly="true" size="40"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.asignarParticipante.horario"/>:</td>
                                <td colspan="3"><c:out value="${secuenciaInstructorDTO.horarioCurso}"/></td>
                            </tr>
                        </tbody>
                    </table>
                </fieldset><br/>
            </td>
        </tr>
    </table>
    <br/>
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.2em"><strong> Proveedor </strong></legend>
                    <table width="100%" border="0">
                        <tr>
                            <td class="label"><spring:message code="sireh.label.spc.capacitacion.consultas.cursosasociadostrabajador.detalle.proveedor"/></td>
                            <td colspan="3"><fsn:input path="nombreProveedor" size="40" readonly="true" /></td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.instructor.titular"/></td>
                            <td><fsn:input path="nombreInstrTitular" size="40" readonly="true" /></td>
                            <td class="label"><spring:message code="sireh.label.spc.capacitacion.consultas.cursosasociadostrabajador.detalle.instructor.desasignacion"/></td>
                            <td><fsn:input path="causalDesasigTitular" size="40" readonly="true" /></td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.instructor.suplente"/></td>
                            <td><fsn:input path="nombreInstrSuplente" size="40" readonly="true" /></td>
                            <td class="label"><spring:message code="sireh.label.spc.capacitacion.consultas.cursosasociadostrabajador.detalle.instructor.desasignacion"/></td>
                            <td><fsn:input path="causalDesasigSuplente" size="40" readonly="true" /></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <br/><br/>
    
    
    <table width="100%" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.2em"><strong> Participantes </strong></legend>
                    <table align="center" width="90%" border="0">
                        <tr>
                            <td class="label" align="left"><spring:message code="sireh.label.spc.capacitacion.consultas.cursosasociadostrabajador.detalle.asistencia.porciento"/></td>
                            <td class="label" align="left"><spring:message code="sireh.label.spc.capacitacion.consultas.cursosasociadostrabajador.detalle.calificacion.inicial.aprobados"/></td>
                            <td class="label" align="left"><spring:message code="sireh.label.spc.capacitacion.consultas.cursosasociadostrabajador.detalle.calificacion.final.aprobados"/></td>
                            <td class="label" align="left"><spring:message code="sireh.label.spc.capacitacion.consultas.cursosasociadostrabajador.detalle.calificacion.notafinal.porcentaje"/></td>
                        </tr>
                        <tr>
                            <td readonly="true" align="center"><fsn:input path="participanteAsistencia" size="40" readonly="true" /></td>
                            <td readonly="true" align="center"><fsn:input path="participanteEvalInicial" size="40" readonly="true" /></td>
                            <td readonly="true" align="center"><fsn:input path="participanteEvalFinal" size="40" readonly="true" /></td>
                            <td readonly="true" align="center"><fsn:input path="descSituacionParticipante" size="40" readonly="true" /></td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/><br/>
    
    <table align="center" width="50%">
        <tr>
            <td align="center">
                <fsn:submit value="submit.back" 
                            action="consultaCursoSPC/consultaCursoSPCBuscaInstr.do?idInstructor=${secuenciaInstructorDTO.idInstructor}&idProveedor=${secuenciaInstructorDTO.idProveedor}"
                            progressBar="false"/>
            </td>
            <td align="center" colspan="6">
                <fsn:submit value="submit.cancel" 
                            action="consultaCursoSPC/consultaCursoSPCBuscaInstr.do"
                            progressBar="false"/>
            </td>
        </tr>
    </table>
    
</html:form>    