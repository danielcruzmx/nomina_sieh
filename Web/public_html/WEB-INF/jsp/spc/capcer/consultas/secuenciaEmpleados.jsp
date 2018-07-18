<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style type="text/css">
    .anchoInput {
        width: 200px;
    }
    a.cancelado:link {
        background-color: transparent;
        color: red;
        text-decoration: none;
    }
</style>

<html:form modelAttribute="secuenciaEmpleadoDTO">
    <html:hidden path="participanteRfc"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.reportes.general.secuenciaEmpleado.cursos"/></h1>
    <p>&nbsp;</p>
    
    <h1><strong><c:out value="Cursos asociados al trabajador:  "/></strong><c:out value="${secuenciaEmpleadoDTO.participanteNombre}"/></h1>
    
    <c:if test="${secuenciaEmpleadoDTO.muestraRegistros}">
        <fsn:filter property="P.RFC_EMPLEADO" condition="=" path="participanteRfc" />
        <fsn:pagedList beanName="spc-capcer-consultas-secuenciaEmpleados-cursosByEmpleadoPager"
                       checkbox="false" 
                       chkProperty="idCurso" 
                       baseUrl="${secuenciaEmpleadoDTO.urlOrigen}" 
                       appendFilters="false">
            <div id="displayTagDiv" style="width:1000px; min-height:200px;overflow:auto;text-align:center;"> 
                <display:table name="spc-capcer-consultas-secuenciaEmpleados-cursosByEmpleadoPager" 
                               class="displaytag" 
                               pagesize="20" 
                               export="true" 
                               id="row" 
                               requestURI="${requestURI}" 
                               sort="list">
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.coordinacion" 
                                        property="coordinacionCurso"
                                        sortable="false"
                                        style="text-align: left;"/>
                    
                   <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.curso"
                                   sortable="true"
                                   style="text-align: left;">
                                    <a  href="secuenciaEmpleadoCursoDetalle.do?idCurso=<c:out value="${row.idCurso}"/>&rfcEmpleado=<c:out value="${secuenciaEmpleadoDTO.participanteRfc}"/>">
                                        <c:out value="${row.descripcionCurso}"/>
                                    </a> 
                    </display:column>
                                                       
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.subprograma" 
                                    property="subprogramaCurso" 
                                    sortable="false"
                                    style="text-align: left;"/>
                                    
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.duracion" 
                                    property="duracionCurso" 
                                    sortable="false"
                                    style="text-align: left;"/>
                    
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.fechaInicio" 
                                    property="fechaInicioCurso" 
                                    format="{0,date,dd/MM/yyyy}" 
                                    sortable="false"
                                    style="text-align: left;"/>
                    
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.fechaTermino" 
                                    property="fechaTerminoCurso" 
                                    format="{0,date,dd/MM/yyyy}" 
                                    sortable="false"
                                    style="text-align: left;"/>
                    
                    
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.modalidad" 
                                    property="modalidadCurso" 
                                    sortable="false"
                                    style="text-align: left;"/>
                    
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.finalidad" 
                                    property="finalidadCurso" 
                                    sortable="false"
                                    style="text-align: left;"/>
                                    
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.aula" 
                                        sortable="false"
                                        style="text-align: left;">
                                        <span id="descCorta"><c:out value="${row.aulaCurso}"/></span>
                    </display:column>
                    
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.horario" 
                                    property="horarioCurso" 
                                    sortable="false"
                                    style="text-align: left"/>
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.participantes" 
                                    property="participantesCurso" 
                                    sortable="false"
                                    style="text-align: left;"/>
                    
                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.estatus" 
                                    property="estatusCurso" 
                                    sortable="false"
                                    style="text-align: left;"/>
                                    
                    <display:setProperty name="paging.banner.placement" value="bottom"/>
                    <display:setProperty name="export.pdf" value="false"/>
                    <display:setProperty name="basic.msg.empty_list">
                        <br/><span class="pagebanner">&nbsp;</span><span class="norecords"><spring:message code="pagedList.empty.content"/><br/><br/></span>
                    </display:setProperty>
                </display:table>
            </div>
        </fsn:pagedList>
    </c:if>
    
    </table><br/><br/>
    <table align="center" width="50%">
        <tr><td align="center"><fsn:submit value="submit.back" 
                            action="consultaCursoSPC/consultaCursoSPCBuscaEmpl.do"
                            progressBar="false"/></td></tr>
    </table>
    
</html:form>    