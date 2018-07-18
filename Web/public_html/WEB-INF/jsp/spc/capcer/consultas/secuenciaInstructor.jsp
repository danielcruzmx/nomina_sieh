<%@ taglib uri="http://www.springframework.org/tags/form" prefix="html" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!-- <%@ taglib uri="http://displaytag.sf.net" prefix="display" %>-->
<%@ taglib tagdir="/WEB-INF/tags" prefix="fsn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html:form modelAttribute="secuenciaInstructorDTO">
    <html:hidden path="anterior" id="anterior"/>
    
    <h1><spring:message code="sireh.label.spc.capcer.reportes.general.secuenciaInstructor"/></h1>
    <p>&nbsp;</p>
    
    
    <table align="center" width="100%">
        <tr>    
            <td>
                <fieldset>
                    <legend style="font-size:1.2em"><strong>Criterios de B&uacute;squeda</strong></legend>
                    <table width="80%">
                        <tr align="left">
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.consultas.cursos.proveedores"></spring:message></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="spcCapcerConsultasCursosProveedores"
                                                path="idProveedor"
                                                progress="true"
                                                style="width: 250px;"/>
                            </td>
                            <td align="right" class="label"><spring:message code="sireh.label.spc.capcer.consultas.cursos.instructores"></spring:message></td>
                            <td align="left">
                                <fsn:option key="0" value="selectList.nonValue"/>
                                <fsn:selectList beanName="spcCapcerConsultasCursosInstructores" 
                                                path="idInstructor"
                                                progress="true"
                                                parentPath="idProveedor"
                                                onchange="cursosInstructor();"
                                                style="width: 250px;"/>
                            </td>
                        </tr>
                    </table>
                    
                   <c:if test="${secuenciaInstructorDTO.muestraRegistros}">
                        <fsn:filter property="CU.ID_INSTRUCTOR_TITULAR" condition="=" path="idInstrTitular" />
                        <fsn:filter property="CU.ID_INSTRUCTOR_SUPLENTE" condition="=" path="idInstrSuplente" />
                        <fsn:pagedList beanName="spcCapcerConsultasCursosInstructorPager"
                                       checkbox="false" 
                                       chkProperty="idCurso" 
                                       baseUrl="consultaCursoSPCBuscaInstr" 
                                       appendFilters="false">
                            <div id="displayTagDiv" style="width:1000px; min-height:200px;overflow:auto;text-align:center;"> 
                                <display:table name="spcCapcerConsultasCursosInstructorPager" 
                                               class="displaytag" 
                                               pagesize="20" 
                                               export="true" 
                                               id="row" 
                                               requestURI="${requestURI}" 
                                               sort="list">
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.coordinacion" 
                                                        property="descCoordinacion"
                                                        sortable="false"
                                                        style="text-align: left;"/>
                                    
                                   <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.curso"
                                                   sortable="true"
                                                   style="text-align: left;">
                                                    <a  href="consultaCursoSPCBuscaInstrDetalle.do?idCurso=<c:out value="${row.idCurso}"/>&idInstructor=<c:out value="${secuenciaInstructorDTO.idInstructor}"/>&idProveedor=<c:out value="${secuenciaInstructorDTO.idProveedor}"/>">
                                                        <c:out value="${row.descCursoPrincipal}"/>
                                                    </a> 
                                    </display:column>
                                                                       
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.subprograma" 
                                                    property="descSubprograma" 
                                                    sortable="false"
                                                    style="text-align: left;"/>
                                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.duracion" 
                                                    property="cursoDuracion" 
                                                    sortable="false"
                                                    style="text-align: left;"/>
                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.fechaInicio" 
                                                    property="cursoFecIni" 
                                                    format="{0,date,dd/MM/yyyy}" 
                                                    sortable="false"
                                                    style="text-align: left;"/>
                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.fechaTermino" 
                                                    property="cursoFecFin" 
                                                    format="{0,date,dd/MM/yyyy}" 
                                                    sortable="false"
                                                    style="text-align: left;"/>
                                    
                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.modalidad" 
                                                    property="descModalidad" 
                                                    sortable="false"
                                                    style="text-align: left;"/>
                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.finalidad" 
                                                    property="descFinalidad" 
                                                    sortable="false"
                                                    style="text-align: left;"/>
                                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.aula" 
                                                        sortable="false"
                                                        style="text-align: left;">
                                                        <span id="descCorta"><c:out value="${row.descAulaCurso}"/></span>
                                    </display:column>
                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.horario" 
                                                    property="horarioCurso" 
                                                    sortable="false"
                                                    style="text-align: left"/>
                                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.participantes" 
                                                    property="cursoParticipantes" 
                                                    sortable="false"
                                                    style="text-align: left;"/>
                                    
                                    <display:column titleKey="sireh.label.spc.capcer.registro.registrarCurso.grid.estatus" 
                                                    property="descControlCurso" 
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
                </fieldset>
            </td>
        </tr>
    </table>

    <script type="text/javascript">
        function cursosInstructor() {
            if(($j('#idInstructor').val() != '0') & ($j('#idInstructor').val() != $j('#anterior').val())){
                var action ="/sireh/consultaCursoSPC/consultaCursoSPCBuscaInstr.do";
                document.forms[0].action = action;
                document.forms[0].submit();
            }
        }
    </script>
    
</html:form>