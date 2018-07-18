<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style type="text/css">
    .anchoInput {
        width: 300px;
    }
</style>
<html:form modelAttribute="cargarConstanciaDTO" enctype="multipart/form-data">
    <html:hidden path="beanName"/>
    <html:hidden path="urlOrigen"/>
    <html:hidden path="urlDestino"/>
    <html:hidden path="rolEjecutivoContratacion"/>
    <html:hidden path="rolAdministradorCapacitacion"/>
    
    
    <h1><spring:message code="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.title"/></h1>
    <p>&nbsp;</p>
    
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Datos del curso</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tbody>
                            <tr><td colspan="4">&nbsp;</td></tr>
                            <tr align="left">
                                <td class="label" width="25%"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.claveCurso"/>:</td>
                                <td align="left" width="25%"><fsn:label path="claveCurso"/></td>
                                <td class="label" width="25%"><spring:message code="sireh.label.spc.capcer.registro.registrarCurso.asignarInstructor.nombreCurso"/>:</td>
                                <td align="left" width="25%"><fsn:label path="nombreCurso"/></td>
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
                    <legend style="font-size:1.3em"><strong>Carga de constancia de participaci&oacute;n</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td class="label">* <spring:message code="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.tipoDocumento"/>:</td>
                            <td align="left"> 
                                <table align="left" width="60%" border="0">
                                    <tr>                        
                                        <td align="left" width="60%">
                                            <html:radiobutton value="c" path="tipoDocumento" label=" Constancia"/>
                                        </td>
                                        <td align="left" width="40%">
                                            <html:radiobutton value="a" path="tipoDocumento" label=" Acuse"/>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                        <tr>
                            <td class="label" width="50%">* <spring:message code="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.constanciaParticipacion"/>:</td>
                            <td width="30%">
                                <input type="file" name="documentoSoporte" id="documentoSoporte" value="*.*" size="80" class="anchoInput"/>
                            </td>
                            <td align="left"  width="50%">
                                <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
                                    <tr>
                                        <td width="50%">
                                            <table width="100%" border="0" align="center">
                                                <tr>
                                                    <td align="center">
                                                        <c:if test="${cargarConstanciaDTO.rolAdministradorCapacitacion || cargarConstanciaDTO.rolOperadorCapacitacion}">
                                                            <fsn:submit value="submit.add"
                                                                        action="seguimientoCursoSPC/${cargarConstanciaDTO.urlDestino}"/>
                                                        </c:if>&nbsp;
                                                    
                                                        <fsn:submit value="submit.cancel" 
                                                                    action="seguimientoCursoSPC/${cargarConstanciaDTO.urlOrigen}"/>
                                                                    
                                                        <c:if test="${cargarConstanciaDTO.rolAdministradorCapacitacion || cargarConstanciaDTO.rolOperadorCapacitacion}">
                                                            <fsn:submit value="submit.delete"
                                                                        action="seguimientoCursoSPC/${cargarConstanciaDTO.urlBorrar}"/>
                                                        </c:if>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table><br/>
    
    <table width="100%" cellspacing="0" cellpadding="0" border="0" align="center">
        <tr>
            <td>
                <fieldset>
                    <legend style="font-size:1.3em"><strong>Participantes inscritos</strong></legend>
                    <table width="100%" align="center" border="0">
                        <tr>
                            <td align="center">
                                <fsn:filter property="P.ID_CURSO" condition="=" path="idCurso" />
                                <fsn:pagedList  beanName="${cargarConstanciaDTO.beanName}"
                                                baseUrl="${cargarConstanciaDTO.urlOrigen}"
                                                maxRows="200"
                                                appendFilters="false">
                                    <div id="displayTagDiv" style="width:1000px;height:350px;overflow:auto;">
                                            <display:table name="${cargarConstanciaDTO.beanName}" 
                                                           class="displaytag" 
                                                           pagesize="200" 
                                                           export="true" 
                                                           id="row" 
                                                           requestURI="${requestURI}" 
                                                           sort="list">
                                            <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.seleccion" 
                                                            style="text-align: center;">
                                                <input name="docGrupo" 
                                                       class="box"
                                                       type="checkbox" 
                                                       value="<c:out value="${row.idCurso}|${row.rfcEmpleado}|${(row.participanteAcuseFirmado == null ? ' ' : row.participanteAcuseFirmado)} | ${(row.participanteAcuse == null ? ' ' :  row.participanteAcuse)}"/>"/>
                                            </display:column>
                                            <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.unidad" 
                                                            property="unidad" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.nivel" 
                                                            property="nivel" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.rfc" 
                                                            property="rfcEmpleado" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.nombre" 
                                                            property="nombre" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.primerApellido" 
                                                            property="primerApellido" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.segundoApellido" 
                                                            property="segundoApellido" 
                                                            sortable="false"
                                                            style="text-align: center"/>
                                            
                                            <c:choose>
                                                <c:when test="${row.participanteAcuseFirmado != null}">
                                                    <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.constancia" 
                                                            sortable="false"
                                                            style="text-align: center">
                                                        <a href="downloadFile.do?uuid=<c:out value="${row.participanteAcuseFirmado}"/>" title="Descargar documento" target="_blank">
                                                            <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                        </a>
                                                    </display:column>
                                                </c:when>
                                                <c:otherwise>
                                                    <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.constancia" 
                                                                sortable="false"
                                                                style="text-align: center">-
                                                </display:column>
                                                </c:otherwise>
                                            </c:choose>
                                            
                                            <c:choose>
                                                <c:when test="${row.participanteAcuse != null}">
                                                    <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.acuse" 
                                                            sortable="false"
                                                            style="text-align: center">
                                                        <a href="downloadFile.do?uuid=<c:out value="${row.participanteAcuse}"/>" title="Descargar documento" target="_blank">
                                                            <img src="<spring:theme code="pdf-download.jpg"/>" border="0" width="20"/>
                                                        </a>
                                                    </display:column>
                                                </c:when>
                                                <c:otherwise>
                                                    <display:column titleKey="sireh.label.spc.capcer.seguimientoControl.cargarConstancias.acuse" 
                                                            sortable="false"
                                                            style="text-align: center">-
                                                    </display:column>
                                                </c:otherwise>
                                            </c:choose>
                                            
                                            <display:setProperty name="paging.banner.placement" value="bottom"/>
                                            <display:setProperty name="export.pdf" value="true"/>
                                            <display:setProperty name="basic.msg.empty_list">
                                                <br/><span class="pagebanner">&nbsp;</span><span class="norecords">
                                                        <spring:message code="pagedList.empty.content"/><br/><br/></span>
                                            </display:setProperty>
                                        </display:table>
                                    </div>
                                </fsn:pagedList>
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </td>
        </tr>
    </table>
    
    <script type="text/javascript">
        // Pagedlist asincrono
        $j(function(){
            $j("#displayTagDiv").displayTagAjax();
        });
        
        // Checkbox unico
        $j(':checkbox').on('change',function(){
            var th = $j(this), name = th.prop('name'); 
            if(th.is(':checked')){
                $j(':checkbox[name="'  + name + '"]').not($(this)).prop('checked',false);  }
        });
    </script>
    
</html:form>