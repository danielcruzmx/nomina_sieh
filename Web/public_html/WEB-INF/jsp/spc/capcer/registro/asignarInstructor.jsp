<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput { width: 200px; }
    .tachado{text-decoration:line-through;}
</style>

<html:form modelAttribute="asignarInstructorDTO">
    <html:hidden path="rolEjecutivoContratacion"/>
    <html:hidden path="rolAdministradorCapacitacion"/>
    <html:hidden path="idCurso"/>
    <html:hidden path="enCurso"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.registro.general.consultaCursos.asignarInstructor.title" /></h1>
    <p>&nbsp;</p>
    
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del curso</strong></legend>
                    <table width="100%" align="center">
                        <tbody>
                            <tr align="left">
                                <td class="label" width="15%"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.claveCurso"/>:</td>
                                <td align="left" width="35%"><fsn:label path="claveCurso"/></td>
                                <td class="label" width="15%"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.nombreCurso"/>:</td>
                                <td align="left" width="35%"><fsn:label path="nombreCurso"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.Subprograma"/>:</td>
                                <td align="left"><fsn:label path="subPrograma"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.ejeTematico"/>:</td>
                                <td align="left"><fsn:label path="ejeTematico"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.modalidad"/>:</td>
                                <td align="left"><fsn:label path="modalidad"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.finalidad"/>:</td>
                                <td align="left"><fsn:label path="finalidad"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.duracion"/>:</td>
                                <td align="left"><fsn:label path="duracion"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.proveedor"/>:</td>
                                <td align="left"><fsn:label path="proveedor"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.fechaInicio"/>:</td>
                                <td align="left"><fsn:label path="fechaInicio"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.fechaTermino"/>:</td>
                                <td align="left"><fsn:label path="fechaTermino"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.sede"/>:</td>
                                <td align="left"><fsn:label path="sede"/></td>
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.aula"/>:</td>
                                <td align="left"><fsn:label path="aula"/></td>
                            </tr>
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.horario"/>:</td>
                                <td align="left" colspan="4"><fsn:label path="horario"/></td>
                           </tr>
                        </tbody>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table width="100%" align="center" border="0">
        <tr>
            <td>
                <fieldset>
                        <legend style="font-size:1.3em"><strong>Asignar</strong></legend>
                        <table width="100%" align="center"  border="0">
                            <tr align="left">
                                <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.instructores"/>:</td>
                                <td align="left">
                                    <fsn:filter property="id_proveedor" condition="=" path="idProveedor"  id="lInstructores"/>
                                    <fsn:filter property="cc.id_curso" condition="=" path="idCurso"  id="lInstructores"/>
                                    <fsn:filter property=" cc.id_curso " condition="=" path="idCurso"  id="lInstructores"/>
                                    
                                    <fsn:option key="0" value="selectList.nonValue"/>
                                    <fsn:selectList beanName="tnCapCurso-AsignarInstructor-listaInstructores" 
                                                    appendFilters="false"
                                                    filterId="lInstructores"
                                                    path="idInstructor"
                                                    onchange="botonesAsignar();"
                                                    style="width:200px;"/>&nbsp;
                                </td>
                                <td>           
                                    <c:if test="${asignarInstructorDTO.rolAdministradorCapacitacion || asignarInstructorDTO.rolOperadorCapacitacion}">
                                        <fsn:submit value="submit.asignar.titular" 
                                                    path="asignarTitular"
                                                    action="registroCursoSPC/${asignarInstructorDTO.urlDestino}"
                                                    progressBar="true"/> &nbsp;
                                    </c:if>
                                        <fsn:submit value="submit.cancel"
                                                    path="cancelar"
                                                    action="registroCursoSPC/${asignarInstructorDTO.urlOrigen}"
                                                    progressBar="true"/>&nbsp;
                                                    
                                    <c:if test="${asignarInstructorDTO.rolAdministradorCapacitacion || asignarInstructorDTO.rolOperadorCapacitacion}">
                                        <fsn:submit value="submit.asignar.suplente" 
                                                    path="asignarSuplente"
                                                    action="registroCursoSPC/${asignarInstructorDTO.urlDestino}"
                                                    progressBar="true"/>
                                    </c:if>
                                </td>
                            </tr>
                        </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Des asignar</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.instructor.titular"/>:</td>
                            <td align="left">
                                <c:choose>
                                    <c:when test="${asignarInstructorDTO.desAsignado && asignarInstructorDTO.enCurso && asignarInstructorDTO.motivoDesasigna == 1}">
                                        <table align="center" width="100%">
                                            <tr>
                                                <td align="left" style="color:#ff0000"><fsn:label path="instructorTitular" id="instructorTitular"/></td>
                                            </tr>
                                        </table>
                                    </c:when>
                                    <c:when test="${asignarInstructorDTO.desAsignado && asignarInstructorDTO.enCurso && asignarInstructorDTO.motivoDesasigna != 1}">
                                        <table align="center" width="100%">
                                            <tr>
                                                <td align="left"> - </td>
                                            </tr>
                                        </table>
                                    </c:when>
                                    <c:otherwise>
                                        <table align="center" width="100%">
                                            <tr>
                                                <td align="left"><fsn:label path="instructorTitular" id="instructorTitular"> - </fsn:label></td>
                                            </tr>
                                        </table>
                                    </c:otherwise>
                                </c:choose>
                            </td>
                        </tr>
                        <tr>
                            <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.instructor.suplente"/>:</td>
                            <td align="left"><fsn:label path="instructorSuplente" id="instructorSuplente"/></td>
                        </tr>
                        <tr align="center">
                            <td align="center" colspan="2">
                                <table align="center" border="0" width="100%">
                                    <tr>
                                        <td width="40%">
                                                <table width="100%" align="center" border="0">
                                                    <tr>
                                                        <td class="label"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.cuasa"/>:</td>
                                                        <td align="left">
                                                            <fsn:option key="0" value="selectList.nonValue"/>
                                                            <fsn:selectList beanName="tnCapCurso-AsignarInstructor-motivoDesasignaInstructor"
                                                                            path="motivoDesasigna"
                                                                            onchange="botonesDesasignar();"
                                                                            style="width:200px;"/>
                                                        </td>
                                                    </tr>
                                                </table>
                                        </td>
                                        <td width="60%">
                                                <fsn:submit value="submit.desasignar.titular"
                                                            path="desasignarTitular"
                                                            action="registroCursoSPC/${asignarInstructorDTO.urlDestino}"
                                                            progressBar="true"/>&nbsp;
                                                <fsn:submit value="submit.desasignar.suplente"
                                                            path="desasignarSuplente"
                                                            action="registroCursoSPC/${asignarInstructorDTO.urlDestino}"
                                                            progressBar="true"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    <script type="text/javascript">
        var enCurso         = <c:out value="${asignarInstructorDTO.enCurso}"/>;
        var rolAdmin        = <c:out value="${asignarInstructorDTO.rolAdministradorCapacitacion}"/>;
        var desasignado     = <c:out value="${asignarInstructorDTO.desAsignado}"/>;
        var instructorTitular   = $j("#instructorTitular").val();
        var instructorSuplente  = $j("#instructorSuplente").val();
        var idInstructor        = $j("#idInstructor").val();
        
        var tamanioT = $j.trim(instructorTitular).length;
        var tamanioS = $j.trim(instructorSuplente).length;
        
        
        if(desasignado && enCurso){
            tamanioT = 1;
        }
        
        if(tamanioT == 1){ tamanioT = 0; }
        if(tamanioS == 1){ tamanioS = 0; }
        
        //console.log("enCurso: " + enCurso);
        if(enCurso){
            if(rolAdmin){
                if(tamanioT != 0  && tamanioS != 0){ //OK
                    $j("#idInstructor").attr('disabled','true');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").removeAttr('disabled');
                }
                else if(tamanioT == 0 && tamanioS == 0){ //OK
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").attr('disabled','true');
                }
                else if(tamanioT == 0 && tamanioS != 0){ //OK
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").attr('disabled','true');
                }
                else if(tamanioT != 0 && tamanioS == 0){ //OK
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").attr('disabled','true');
                }  
            }
            else{ // Operador de Capacitacion
                if(tamanioT != 0  && tamanioS != 0){ //OK
                    $j("#idInstructor").attr('disabled','true');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").removeAttr('disabled');
                }
                else if(tamanioT == 0 && tamanioS == 0){ //OK
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").attr('disabled','true');
                }
                else if(tamanioT == 0 && tamanioS != 0){ //OK
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").attr('disabled','true');
                }
                else if(tamanioT != 0 && tamanioS == 0){ //OK
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").attr('disabled','true');
                }
            }
        }
        else{ // ****** no en curso
            if(rolAdmin){
                if(tamanioT != 0  && tamanioS != 0){ 
                    $j("#idInstructor").attr('disabled','true');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").removeAttr('disabled');
                }
                else if(tamanioT == 0 && tamanioS == 0){ 
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").attr('disabled','true');
                }
                else if(tamanioT == 0 && tamanioS != 0){ 
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").removeAttr('disabled');
                }
                else if(tamanioT != 0 && tamanioS == 0){ 
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").removeAttr('disabled');
                }
            }
            else{ // ********* operador
                if(tamanioT != 0  && tamanioS != 0){ 
                    $j("#idInstructor").attr('disabled','true');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").removeAttr('disabled');
                }
                else if(tamanioT == 0 && tamanioS == 0){ 
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").attr('disabled','true');
                }
                else if(tamanioT == 0 && tamanioS != 0){ 
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").removeAttr('disabled');
                }
                else if(tamanioT != 0 && tamanioS == 0){ 
                    $j("#idInstructor").removeAttr('disabled');
                    $j("#10001").attr('disabled','true');
                    $j("#10003").attr('disabled','true');
                    $j("#10004").attr('disabled','true');
                    $j("#10005").attr('disabled','true');
                    $j("#motivoDesasigna").removeAttr('disabled');
                }
            }
            
        }
        // *********************************************************************
        function botonesAsignar(){
            if(enCurso){
                if(rolAdmin){
                    if(tamanioT != 0 && tamanioS != 0){ // no procede
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS == 0){ //OK
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT != 0 && tamanioS == 0){ //OK
                        $j("#10001").attr('disabled','true');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS != 0){ //OK
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").attr('disabled','true');
                    }
                }
                else { // operadorCapacitacion
                    if(tamanioT != 0 && tamanioS != 0){ // no procede
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS == 0){ //OK
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT != 0 && tamanioS == 0){ //OK
                        $j("#10001").attr('disabled','true');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS != 0){ //OK
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").attr('disabled','true');
                    }
                }
            }
            else { // no en curso
                if(rolAdmin){
                    if(tamanioT != 0 && tamanioS != 0){ // no procede
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS == 0){ //OK
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT != 0 && tamanioS == 0){ //OK
                        $j("#10001").attr('disabled','true');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS != 0){ //OK
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").attr('disabled','true');
                    }
                }
                else { // operadorCapacitacion
                    if(tamanioT != 0 && tamanioS != 0){ // no procede
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS == 0){ //OK
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT != 0 && tamanioS == 0){ //OK
                        $j("#10001").attr('disabled','true');
                        $j("#10003").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS != 0){ //OK
                        $j("#10001").removeAttr('disabled');
                        $j("#10003").attr('disabled','true');
                    }
                }
            }
        }
        function botonesDesasignar(){
            if(enCurso){ // ****** EN CURSO ********
                if(rolAdmin){ // ***** ADMINISTRADOR ******
                    if(tamanioT != 0 && tamanioS != 0){ //OK
                        $j("#10004").removeAttr('disabled');
                        $j("#10005").removeAttr('disabled');
                    }
                }
                else { // operador capacitacion
                    if(tamanioT != 0 && tamanioS != 0){ //OK
                        $j("#10004").removeAttr('disabled');
                        $j("#10005").removeAttr('disabled');
                    }
                }
            }
            else{ // no en curso
                if(rolAdmin){
                    if(tamanioT != 0 && tamanioS != 0){ //OK
                        $j("#10004").removeAttr('disabled');
                        $j("#10005").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS == 0){
                        $j("#10004").attr('disabled','true');
                        $j("#10005").attr('disabled','true');
                    }
                    else if(tamanioT == 0 && tamanioS != 0){
                        $j("#10004").attr('disabled','true');
                        $j("#10005").removeAttr('disabled');
                    }
                    else if(tamanioT != 0 && tamanioS == 0){
                        $j("#10004").removeAttr('disabled');
                        $j("#10005").attr('disabled','true');
                    }
                }
                else { // operador capacitacion
                    if(tamanioT != 0 && tamanioS != 0){ //OK
                        $j("#10004").removeAttr('disabled');
                        $j("#10005").removeAttr('disabled');
                    }
                    else if(tamanioT == 0 && tamanioS == 0){
                        $j("#10004").attr('disabled','true');
                        $j("#10005").attr('disabled','true');
                    }
                    else if(tamanioT == 0 && tamanioS != 0){
                        $j("#10004").attr('disabled','true');
                        $j("#10005").removeAttr('disabled');
                    }
                    else if(tamanioT != 0 && tamanioS == 0){
                        $j("#10004").removeAttr('disabled');
                        $j("#10005").attr('disabled','true');
                    }
                }
            }
        }
        
    </script>
</html:form>